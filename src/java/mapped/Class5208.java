package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4396;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.notification.Notification;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$Action;

public class Class5208 extends Module {
    private Class5340 field23527;

    public Class5208() {
        super(ModuleCategory.MISC, "Jartex", "Gameplay for Jartex network");
    }

    @Override
    public void method15953() {
        this.field23527 = (Class5340) this.method16004();
    }

    @EventTarget
    private void method16219(Class4396 var1) {
        if (this.method15996() && mc.field1339 != null) {
            Packet var4 = var1.method13898();
            if (var4 instanceof Class5616) {
                Class5616 var5 = (Class5616) var4;
                String var6 = var5.method17648().getString();
                String var7 = mc.field1339.method2941().getString().toLowerCase();
                String var8 = var5.method17648().getString();
                if (this.field23527.method15974("AutoL")
                        && (
                        var8.toLowerCase().contains("§r§7 has been killed by §r§a§l" + var7)
                                || var8.toLowerCase().contains("§r§7 was shot by §r§a§l" + var7)
                                || var6.toLowerCase().contains("§r§7 was killed with dynamite by §r§a§l" + var7)
                )) {
                    this.field23527.method16761(var6);
                }

                if (var8.contains("§e§lPlay Again? §r§7Click here!§r")) {
                    if (this.field23527.method15974("AutoGG")) {
                        this.field23527.method16760();
                    }

                    if (this.field23527.method15974("Auto Join")) {
                        for (ITextComponent var10 : var5.method17648().getSiblings()) {
                            ClickEvent var11 = var10.getStyle().getClickEvent();
                            if (var11 != null && var11.getAction() == ClickEvent$Action.RUN_COMMAND) {
                                this.field23527.method16759(new Class7200(var11.getValue(), (long) this.field23527.method15977("Auto Join delay") * 1000L));
                                Client.getInstance()
                                        .getNotificationManager()
                                        .post(
                                                new Notification(
                                                        "Auto Join", "Joining a new game in 3 seconds.", (int) (this.field23527.method15977("Auto Join delay") - 1.0F) * 1000
                                                )
                                        );
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}