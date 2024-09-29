package com.mentalfrostbyte.jello.unmapped;

import org.apache.http.ParseException;
import totalcross.json.JSONArray;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThumbnailUtil {
    public static YoutubeJPGThumbnail[] search(String searchTags) {
        return extractYoutubeThumbnailsFromHtml(fetchUrlContent("https://www.google.com/search?client=safari&num=21&gbv=1&tbm=vid&oq=&aqs=&q=site%3Ayoutube.com+" + encodeUrlParameter(searchTags)));
    }

    public static YoutubeJPGThumbnail[] getFromChannel(String channelId) {
        return extractYoutubeThumbnails(fetchUrlContent("https://www.youtube.com/channel/" + channelId + "/videos?disable_polymer=1"));
    }

    public static YoutubeJPGThumbnail[] getFromPlaylist(String playlistId) {
        return extractYoutubeThumbnails(fetchUrlContent("https://www.youtube.com/playlist?list=" + playlistId + "&disable_polymer=1"));
    }

    public static YoutubeJPGThumbnail[] extractYoutubeThumbnails(String response) {
        if (response.startsWith("[")) {
            try {
                JSONArray jsonArray = new JSONArray(response);
                response = jsonArray.getJSONObject(1).getJsonObject("body").getString("content");
            } catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        }

        List<YoutubeJPGThumbnail> thumbnails = new ArrayList<>();
        String regex = "r\":\\{\"videoId\":\"(.{11})\"(.*?)\"text\":\"(.{1,100})\"\\}]";
        Pattern pattern = Pattern.compile(regex, Pattern.DOTALL);
        Matcher matcher = pattern.matcher(response.replace("\n", "").replace("\r", ""));

        while (matcher.find()) {
            String videoId = matcher.group(1);
            String title = matcher.group(2).replaceAll("<.*?>", "").trim();

            if (!title.isEmpty()) {
                boolean isDuplicate = thumbnails.stream().anyMatch(thumbnail -> thumbnail.videoID.equals(videoId));
                if (!isDuplicate) {
                    thumbnails.add(new YoutubeJPGThumbnail(videoId, decodeAndUnescapeUrl(title)));
                }
            }
        }

        System.out.println("[thumbnails] : " + thumbnails);
        return thumbnails.toArray(new YoutubeJPGThumbnail[0]);
    }

    public static YoutubeJPGThumbnail[] extractYoutubeThumbnailsFromHtml(String htmlContent) {
        if (htmlContent.startsWith("[")) {
            try {
                JSONArray jsonArray = new JSONArray(htmlContent);
                htmlContent = jsonArray.getJSONObject(1).getJsonObject("body").getString("content");
            } catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        }

        ArrayList thumbnails = new ArrayList();
        String regexPattern = "<a(.*?)watch%3Fv%3D(.{11})[\\\"&](.*?)><div (.*?)>(.{1,100}) - YouTube<\\/div><\\/h3>";
        Pattern pattern = Pattern.compile("<a(.*?)watch%3Fv%3D(.{11})[\\\"&](.*?)><div (.*?)>(.{1,100}) - YouTube<\\/div><\\/h3>", 8);
        Matcher matcher = pattern.matcher(htmlContent.replace("\n", "").replace("\r", ""));

        label62:
        while (matcher.find()) {
            if (!matcher.group(5).contains("</") && !matcher.group(5).equals(" ") && matcher.group(5).length() != 0 && !matcher.group(1).contains("play-all")) {
                for (Object var8 : thumbnails) {
                    if (var8 instanceof YoutubeJPGThumbnail && ((YoutubeJPGThumbnail) var8).videoID.equals(matcher.group(2))) {
                        continue label62;
                    }
                }

                thumbnails.add(new YoutubeJPGThumbnail(matcher.group(2), decodeAndUnescapeUrl(matcher.group(5).replaceAll("<(.*?)>", ""))));
            }
        }

        return (YoutubeJPGThumbnail[]) thumbnails.<YoutubeJPGThumbnail>toArray(new YoutubeJPGThumbnail[0]);
    }

    private static String decodeAndUnescapeUrl(String url) {
        String fullUrl;

        try {
            fullUrl = StringEscapeUtils.unescapeHtml4(URLDecoder.decode(url, StandardCharsets.UTF_8.toString())).trim();
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }

        return fullUrl;
    }

    private static String encodeUrlParameter(String url) {
        String fullUrl;

        try {
            fullUrl = URLEncoder.encode(url, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException var5) {
            throw new RuntimeException(var5);
        }

        return fullUrl;
    }

    private static String fetchUrlContent(String url) {
        System.out.println(":" + url);
        CloseableHttpClient var3 = HttpClients.createDefault();
        HttpGet var4 = new HttpGet(url);
        if (url.contains("playlist")) {
            var4.addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.70 Safari/537.36");
        } else {
            var4.addHeader("User-Agent", "Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)");
        }

        try {
            CloseableHttpResponse var5 = var3.execute(var4);
            Throwable var6 = null;

            String var9;
            try {
                HttpEntity var7 = var5.getEntity();
                if (var7 == null) {
                    return "";
                }

                String var8 = EntityUtils.toString(var7);
                var9 = var8;
            } catch (Throwable var20) {
                var6 = var20;
                throw var20;
            } finally {
                if (var5 != null) {
                    if (var6 != null) {
                        try {
                            var5.close();
                        } catch (Throwable var19) {
                            var6.addSuppressed(var19);
                        }
                    } else {
                        var5.close();
                    }
                }
            }

            return var9;
        } catch (IllegalStateException | IOException | ParseException var22) {
            var22.printStackTrace();
            return "";
        }
    }
}
