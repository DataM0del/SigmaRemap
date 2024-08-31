package com.mentalfrostbyte.jello.module.impl.render;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.TextReplaceEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.*;
import net.minecraft.util.text.StringTextComponent;

import java.util.List;

public class NameProtect extends Module {
    public NameProtect() {
        super(ModuleCategory.RENDER, "NameProtect", "Useful for recording/streaming");
        this.registerSetting(new InputSetting("Username", "The name which your username is replaced with", "Me"));
    }

    @EventTarget
    public void method16883(TextReplaceEvent var1) {
        if (this.isEnabled()) {
            var1.method13959(var1.method13958().replaceAll(mc.getSession().getUsername(), this.getStringSettingValueByName("Username")));
        }
    }

    @EventTarget
    public void method16884(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            Packet var4 = var1.getPacket();
            if (var4 instanceof Class5556) {
                Class5556 var5 = (Class5556) var4;
                if (var5.method17476() == Class2073.field13503) {
                    String var6 = var5.method17473();
                    if (var6.contains(mc.getSession().getUsername())) {
                        var6 = var6.replaceAll(mc.getSession().getUsername(), this.getStringSettingValueByName("Username"));
                        var1.method13899(new Class5556(var5.method17476(), var5.method17474(), var6, var5.method17475()));
                    }
                }
            }

            if (var4 instanceof SChatPacket) {
                SChatPacket var10 = (SChatPacket) var4;
            }

            if (var4 instanceof Class5503) {
                Class5503 var11 = (Class5503) var4;
                List var15 = var11.method17307();

                for (int var7 = 0; var7 < var15.size(); var7++) {
                    Class8790 var8 = (Class8790) var15.get(var7);
                    if (var8.method31729() != null) {
                        String var9 = var8.method31729().getString();
                        if (var9.contains(mc.getSession().getUsername())) {
                            var9 = var9.replaceAll(mc.getSession().getUsername(), this.getStringSettingValueByName("Username"));
                            var8.field39530 = new StringTextComponent(var9);
                        }
                    }
                }

                var11.field24430 = var15;
            }

            if (var4 instanceof Class5472) {
                Class5472 var12 = (Class5472) var4;
                if (var12.method17207() == null) {
                    return;
                }

                String var16 = var12.method17207().getString();
                if (var16.contains(mc.getSession().getUsername())) {
                    var16 = var16.replaceAll(mc.getSession().getUsername(), this.getStringSettingValueByName("Username"));
                    StringTextComponent var20 = new StringTextComponent(var16);
                    var12.field24289 = var20;
                }
            }

            if (var4 instanceof Class5591) {
                Class5591 var13 = (Class5591) var4;
                if (var13.method17570() == null) {
                    return;
                }

                String var18 = var13.method17570().getString();
                if (var18.contains(mc.getSession().getUsername())) {
                    var18 = var18.replaceAll(mc.getSession().getUsername(), this.getStringSettingValueByName("Username"));
                    StringTextComponent var21 = new StringTextComponent(var18);
                    var1.method13899(new Class5591(var13.method17569(), var21, var13.method17571(), var13.method17572(), var13.method17573()));
                }
            }
        }
    }
}