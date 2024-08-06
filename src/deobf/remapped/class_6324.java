package remapped;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.util.text.StringTextComponent;

public class class_6324 {
   private static Pattern field_32288;
   private static Matcher field_32286;
   private static final String field_32289 = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,3})$";

   public static boolean method_28823(char var0) {
      return var0 != 167 && var0 >= ' ' && var0 != 127;
   }

   public static void method_28832(String var0) {
      MinecraftClient.getInstance().field_9614.method_13991().method_18676(new StringTextComponent(var0));
   }

   public static boolean method_28829(String var0) {
      for (char var6 : var0.toCharArray()) {
         if (!Character.isLetterOrDigit(var6) && var6 != '_') {
            return false;
         }
      }

      return true;
   }

   public static boolean method_28827(String var0) {
      for (char var6 : var0.toCharArray()) {
         if (!Character.isLetterOrDigit(var6) && var6 != '_' && var6 != '@' && var6 != '.') {
            return false;
         }
      }

      return method_28833(var0);
   }

   public static boolean method_28833(String var0) {
      field_32288 = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,3})$");
      field_32286 = field_32288.matcher(var0);
      return field_32286.matches();
   }

   public static boolean method_28825(String var0) {
      try {
         Integer.parseInt(var0);
         return true;
      } catch (Exception var4) {
         return false;
      }
   }

   public static String method_28834(String var0, String var1, int var2) {
      try {
         String var5 = var0.substring(0, var2);
         String var6 = var0.substring(var2, var0.length());
         return var5 + var1 + var6;
      } catch (Exception var7) {
         return var0;
      }
   }

   public static String method_28831(String var0, String var1, int var2, int var3) {
      var2 = Math.min(Math.max(0, var2), var0.length());
      var3 = Math.min(Math.max(0, var3), var0.length());
      String var6 = var0.substring(0, var2 <= var3 ? var2 : var3);
      String var7 = var0.substring(var2 <= var3 ? var3 : var2, var0.length());
      return var6 + var1 + var7;
   }

   public static int method_28822(String var0, FontRenderer var1, float var2, int var3, float var4) {
      int var7 = -1;
      int var8 = -1;

      for (int var9 = 0; var9 <= var0.length(); var9++) {
         int var10 = var1.method_18547(var0.substring(0, Math.max(var9 - 1, 0)));
         int var11 = var1.method_18547(var0.substring(0, var9));
         if ((float)var11 > (float)var3 - var2 - var4) {
            var7 = var10;
            var8 = var11;
            break;
         }
      }

      if ((float)var3 - var2 - var4 >= (float)var1.method_18547(var0)) {
         var8 = var1.method_18547(var0);
      }

      int var12 = !(Math.abs((float)var3 - var2 - var4 - (float)var7) < Math.abs((float)var3 - var2 - var4 - (float)var8)) ? var8 : var7;

      for (int var13 = 0; var13 < var0.length(); var13++) {
         if (var1.method_18547(var0.substring(0, var13)) == var12) {
            var12 = var13;
            break;
         }
      }

      if (var12 > var0.length()) {
         var12 = var0.length();
      }

      return var12;
   }

   public static class_2327 method_28830(char var0) {
      if ((var0 < '0' || var0 > '9') && (var0 < 'a' || var0 > 'f')) {
         switch (var0) {
            case 'k':
               return class_2327.field_11636;
            case 'l':
               return class_2327.field_11636;
            case 'm':
               return class_2327.field_11636;
            case 'n':
               return class_2327.field_11636;
            case 'o':
               return class_2327.field_11636;
            case 'p':
            case 'q':
            default:
               return class_2327.field_11632;
            case 'r':
               return class_2327.field_11636;
         }
      } else {
         return class_2327.field_11633;
      }
   }

   public static class_8709 method_28824(char var0) {
      char[] var3 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
      int[] var4 = new int[]{
         -16777216,
         -16777046,
         -16733696,
         -16733526,
         -5636096,
         -5635926,
         -22016,
         -5592406,
         -11184811,
         -11184641,
         -11141291,
         -11141121,
         -43691,
         -43521,
         -171,
         -65794
      };
      int var5 = -1;

      for (int var6 = 0; var6 < var3.length; var6++) {
         if (var3[var6] == var0) {
            var5 = var4[var6];
            break;
         }
      }

      return var5 != -1 ? new class_8709(var5) : null;
   }

   public static String method_28828(String var0) {
      ArrayList var3 = new ArrayList();

      for (int var4 = 0; var4 < var0.length(); var4++) {
         char var5 = var0.charAt(var4);
         if (var5 == 167) {
            var3.add(var0.substring(var4, Math.min(var4 + 2, var0.length())));
         }
      }

      for (String var7 : var3) {
         var0 = var0.replace(var7, "");
      }

      return var0;
   }
}
