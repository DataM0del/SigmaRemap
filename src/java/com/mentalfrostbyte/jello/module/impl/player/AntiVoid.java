package com.mentalfrostbyte.jello.module.impl.player;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.movement.Fly;
import com.mentalfrostbyte.jello.module.impl.movement.HighJump;
import com.mentalfrostbyte.jello.module.util.InDevelopment;
import mapped.*;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.vector.Vector3d;

@InDevelopment
public class AntiVoid extends Module {
    private double field23837;
    private int field23838;
    private int field23839;
    private Vector3d field23840 = null;

    public AntiVoid() {
        super(ModuleCategory.PLAYER, "AntiVoid", "Avoids you from falling in the void");
        this.registerSetting(new BooleanSetting("Void", "Catch only above void", true));
        this.registerSetting(new NumberSetting<Float>("Fall Distance", "Fall distance before catching you", 8.0F, Float.class, 2.0F, 15.0F, 0.5F));
        this.registerSetting(new ModeSetting("Mode", "AntiVoid method", 0, "Hypixel", "Motion", "Cubecraft", "Legit"));
    }

    @Override
    public void onEnable() {
        this.field23837 = 0.0;
        this.field23839 = 0;
        this.field23838 = 0;
        if (mc.player.onGround || ColorUtils.method17730(mc.player, 0.001F)) {
            this.field23840 = new Vector3d(mc.player.getPosX(), mc.player.getPosY(), mc.player.getPosZ());
        }
    }

    @EventTarget
    private void method16664(EventMove var1) {
        if (this.isEnabled()) {
            if (mc.player.onGround || ColorUtils.method17730(mc.player, 0.001F)) {
                this.field23840 = new Vector3d(mc.player.getPosX(), mc.player.getPosY(), mc.player.getPosZ());
            }

            if (this.field23839 <= 0) {
                Module var4 = Client.getInstance().getModuleManager().getModuleByClass(Fly.class);
                String var5 = var4.getStringSettingValueByName("Type");
                Module var6 = Client.getInstance().getModuleManager().getModuleByClass(HighJump.class);
                String var7 = var6.getStringSettingValueByName("Type");
                boolean var8 = var4.isEnabled();
                if (var5.equals("Cubecraft") && var1.getY() < -0.4) {
                    var8 = false;
                }

                if (var6.isEnabled() && var7.equals("Hypixel")) {
                    var8 = true;
                }

                if (mc.player.getMotion().y < -0.08 && !var8) {
                    this.field23837 = this.field23837 - mc.player.getMotion().y;
                } else if (mc.player.onGround) {
                    this.field23837 = 0.0;
                }
            } else {
                MovementUtils.method37088(var1, 0.0);
                var1.setY(0.0);
                this.field23839--;
            }

            if (this.field23837 > (double) this.getNumberValueBySettingName("Fall Distance") && (this.method16667() || !this.getBooleanValueFromSetttingName("Void"))) {
                this.field23837 = 0.0;
                this.method16668(this.getStringSettingValueByName("Mode"), var1);
            }

            if (this.field23838 > 0) {
                this.field23838--;
                MovementUtils.method37088(var1, 0.1);
            }
        }
    }

    @EventTarget
    private void method16665(EventUpdate var1) {
        if (this.isEnabled() && var1.isPre() && this.field23839 != 0) {
            var1.setCancelled(true);
        }
    }

    @EventTarget
    private void method16666(RecievePacketEvent var1) {
        if (this.isEnabled() && this.field23839 != 0) {
            if (var1.getPacket() instanceof SPlayerPositionLookPacket) {
                this.field23839 = 0;
                this.field23838 = 4;
            }
        }
    }

    private boolean method16667() {
        if (!(mc.player.getPositionVec().y < 1.0)) {
            if (!mc.player.onGround) {
                AxisAlignedBB var3 = mc.player.boundingBox;
                var3 = var3.method19662(0.0, -mc.player.getPositionVec().y, 0.0);
                return mc.world.getCollisionShapes(mc.player, var3).count() == 0L;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    private void method16668(String var1, EventMove var2) {
        double var5 = mc.player.getPositionVec().getX();
        double var7 = mc.player.getPositionVec().getY();
        double var9 = mc.player.getPositionVec().getZ();
        if (var1.equals("Cubecraft") && !ColorUtils.method17718()) {
            var1 = "Motion";
        }

        switch (var1) {
            case "Hypixel":
                mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(0.0, -999.0, 0.0, true));
                break;
            case "Motion":
                var2.setY(0.1);
                ColorUtils.method17725(var2.getY());
                break;
            case "Cubecraft":
                double var13 = 3.2E7;
                mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(var5, var13, var9, false));
                Client.getInstance().getModuleManager().getModuleByClass(Fly.class).method15999(false);
                break;
            case "Legit":
                this.field23839 = 200;
        }
    }
}
