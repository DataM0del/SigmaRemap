package com.mentalfrostbyte.jello.module.impl.world.disabler;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.*;

import java.util.ArrayList;

public class ViperDisabler extends Module {
    private int field23868;
    private final ArrayList<Class8897> field23869 = new ArrayList<>();

    public ViperDisabler() {
        super(ModuleCategory.EXPLOIT, "Viper", "Disabler for ViperMC");
    }

    @Override
    public void onEnable() {
        this.field23868 = 0;
    }

    @EventTarget
    public void method16715(Class4399 var1) {
        if (this.isEnabled() && mc.player != null) {
            this.field23868++;
            boolean var4 = var1.method13911() > mc.player.getPosY() - 1.0E-6 && var1.method13911() < mc.player.getPosY() + 1.0E-6;
            if (var4) {
                var1.method13912(mc.player.getPosY() + 0.4);
                var1.method13920(false);
            }

            if (this.field23868 > 60) {
                var1.method13912(mc.player.getPosY() + 0.4);
                var1.method13920(false);
            } else {
                for (int var5 = 0; var5 < 10; var5++) {
                    boolean var6 = var5 > 2 && var5 < 8;
                    double var7 = !var6 ? -0.2 : 0.2;
                    Class5605 var9 = new Class5605(
                            mc.player.getPosX(), mc.player.getPosY() + var7, mc.player.getPosZ(), true
                    );
                    mc.getConnection().sendPacket(var9);
                }

                mc.player.field6120 = 0.0;
                if (mc.player.ticksExisted <= 1) {
                    this.field23869.clear();
                }

                if (!this.field23869.isEmpty()) {
                    for (int var10 = 0; var10 < this.field23869.size(); var10++) {
                        Class8897 var11 = this.field23869.get(var10);
                        if (var11.method32423()) {
                            mc.getConnection().sendPacket(var11.method32424());
                            this.field23869.remove(var10);
                        }
                    }
                }
            }
        }
    }

    @EventTarget
    public void method16716(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            Packet var4 = var1.getPacket();
            if (var4 instanceof Class5554) {
                Class5554 var5 = (Class5554) var4;
                var1.method13900(true);
            }

            if (var4 instanceof Class5542) {
                Class5542 var6 = (Class5542) var4;
                var1.method13900(true);
            }
        }
    }
}