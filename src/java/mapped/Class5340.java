package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.util.timer.Timer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;

public class Class5340 extends Class5325 {
    private ArrayList<String> field23888 = new ArrayList<String>();
    private final ArrayList<String> field23889 = new ArrayList<String>();
    private Class7200 field23890;
    private final Timer field23891;
    private int field23892;

    public Class5340() {
        super(
                ModuleCategory.MISC,
                "GamePlay",
                "Manage your gameplay experience just for you.",
                new Class5251(),
                new Class5231(),
                new Class5242(),
                new Class5230(),
                new Class5208()
        );
        this.method15972(new Class6004("AutoL", "Automatically says L when you kill a player", true));
        this.method15972(new Class6005("AutoL Mode", "AutoL Mode", 0, "Basic", "Sigmeme", "Penshen").method18616(var1 -> this.field23888.clear()));
        this.method15972(new Class6011("First character", "The characters your sentences will start with.", ""));
        this.method15972(new Class6004("AutoGG", "Automatically say gg at the end of the game", true));
        this.method15972(new Class6004("Auto Join", "Automatically joins another game", true));
        this.method15972(new Class6009<Float>("Auto Join delay", "Seconds before joining a new game", 4.0F, Float.class, 1.0F, 10.0F, 1.0F));
        this.field23891 = new Timer();
    }

    @Override
    public void isInDevelopment() {
        if (!this.field23891.method27123()) {
            this.field23891.method27118();
        }

        this.field23890 = null;
        this.field23888.clear();
        this.field23889.clear();
    }

    @Override
    public void method15965() {
        this.field23891.method27120();
        this.field23891.method27119();
        this.field23890 = null;
    }

    @EventTarget
    private void method16758(TickEvent var1) {
        if (this.method15996()) {
            if (this.field23890 != null) {
                if (mc.field1355 instanceof Class1331) {
                    this.method16759(null);
                    Client.getInstance().getNotificationManager().post(new Notification("Auto Join", "Auto join was canceled.", 2500));
                } else if (this.field23890.method22616()) {
                    Class5628.method17679(this.field23890.method22618());
                    this.method16759(null);
                } else if ((int) (this.field23890.method22617() / 1000L) + 1 < this.field23892) {
                    this.field23892 = (int) (this.field23890.method22617() / 1000L) + 1;
                    Client.getInstance()
                            .getNotificationManager()
                            .post(
                                    new Notification("Auto Join", "Joining a new game in " + this.field23892 + " second" + (this.field23892 > 1 ? "s" : "") + ".", 2000)
                            );
                }
            }

            if (!this.field23891.method27123()) {
                this.field23891.method27118();
            }

            if (!this.field23889.isEmpty()) {
                String var4 = this.getStringSettingValueByName("Type");

                try {
                    if (mc.field1339.field5055 <= 3) {
                        this.field23889.clear();
                    }

                    long var5 = 3200L;
                    if (!var4.equalsIgnoreCase("Hypixel")) {
                        var5 = 0L;
                    }

                    if (var4.equalsIgnoreCase("Mineplex")) {
                        var5 = 300L;
                    }

                    if (var4.equalsIgnoreCase("Funcraft")) {
                        var5 = 1000L;
                    }

                    if (var4.equalsIgnoreCase("Jartex")) {
                        var5 = 3200L;
                    }

                    if (this.field23891.method27121() > var5 && !this.field23889.isEmpty()) {
                        this.field23891.method27120();
                        String var7 = this.field23889.get(0);
                        Class5628.method17679(var7);
                        this.field23889.remove(0);
                    }
                } catch (ConcurrentModificationException var9) {
                }
            }
        }
    }

    public void method16759(Class7200 var1) {
        this.field23890 = var1;
        if (var1 != null) {
            this.field23892 = (int) (var1.method22617() / 1000L) + 1;
        }
    }

    public void method16760() {
        this.field23889.add("gg");
    }

    public void method16761(String var1) {
        String[] var4 = var1.split(" ");
        String var5 = var4[0];
        if (this.getStringSettingValueByName("Type").equals("Mineplex") || this.getStringSettingValueByName("Type").equals("Funcraft")) {
            var5 = var4[1];
        }

        String var6 = this.getStringSettingValueByName("AutoL Mode");
        switch (var6) {
            case "Basic":
                this.field23889.add(this.getStringSettingValueByName("First character") + "L " + var5);
                break;
            case "Sigmeme":
                if (this.field23888.isEmpty()) {
                    this.field23888 = new ArrayList<String>(Class6874.field29805);
                    Collections.shuffle(this.field23888);
                }

                String var11 = this.field23888.get(0);
                if (this.getStringSettingValueByName("Type").equals("Cubecraft")) {
                    var11 = var11.replaceAll("sigma", "ＳＩＧＭＡ");
                    var11 = var11.replaceAll("Sigma", "ＳＩＧＭＡ");
                }

                var11 = this.getStringSettingValueByName("First character") + var11;
                this.field23889.add(var11);
                this.field23888.remove(0);
                break;
            case "Penshen":
                if (this.field23888.isEmpty()) {
                    this.field23888 = Class6874.field29806;
                    Collections.shuffle(this.field23888);
                }

                String var8 = this.field23888.get(0);
                if (this.getStringSettingValueByName("Type").equals("Cubecraft")) {
                    var8 = var8.replaceAll("sigma", "ＳＩＧＭＡ");
                    var8 = var8.replaceAll("Sigma", "ＳＩＧＭＡ");
                }

                var8 = this.getStringSettingValueByName("First character") + var8;
                this.field23889.add(var8);
                this.field23888.remove(0);
        }
    }
}