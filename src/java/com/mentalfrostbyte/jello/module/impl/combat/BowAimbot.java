package com.mentalfrostbyte.jello.module.impl.combat;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.EventRender;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import com.mentalfrostbyte.jello.settings.NumberSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BowAimbot extends Module {
    private List<Entity> field23754 = new ArrayList<Entity>();

    public BowAimbot() {
        super(ModuleCategory.COMBAT, "BowAimbot", "Automatically aims at players while using a bow");
        this.registerSetting(new ModeSetting("Sort mode", "Sort mode", 0, "Angle", "Range"));
        this.registerSetting(new NumberSetting<Float>("Range", "Range value", 70.0F, Float.class, 10.0F, 100.0F, 1.0F));
        this.registerSetting(new BooleanSetting("Silent", "Server-sided rotations.", false));
        this.registerSetting(new BooleanSetting("Teams", "Target team", true));
        this.registerSetting(new BooleanSetting("Players", "Target players", true));
        this.registerSetting(new BooleanSetting("Animals/Monsters", "Target animals and monsters", false));
        this.registerSetting(new BooleanSetting("Anti-Bot", "Doesn't target bots", true));
        this.registerSetting(new BooleanSetting("Invisible", "Target invisible entites", true));
    }

    // $VF: synthetic method
    public static Minecraft method16572() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16573() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16574() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16575() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16576() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16577() {
        return mc;
    }

    @Override
    public void onDisable() {
        this.field23754.clear();
    }

    @EventTarget
    private void method16569(EventUpdate var1) {
        if (this.isEnabled() && var1.isPre()) {
            if (!(mc.player.getActiveItemStack().getItem() instanceof BowItem)) {
                this.field23754.clear();
            } else {
                this.field23754 = this.method16571(this.access().getNumberValueBySettingName("Range"));
            }

            if (!this.field23754.isEmpty() && this.getBooleanValueFromSettingName("Silent")) {
                float[] var4 = RotationHelper.method34146((LivingEntity) this.field23754.get(0));
                var1.setPitch(var4[0]);
                var1.setYaw(var4[1]);
            }
        }
    }

    @EventTarget
    private void method16570(EventRender var1) {
        if (this.isEnabled() && !this.getBooleanValueFromSettingName("Silent")) {
            if (!this.field23754.isEmpty()) {
                float[] var4 = RotationHelper.method34146((LivingEntity) this.field23754.get(0));
                mc.player.rotationYaw = var4[0];
                mc.player.rotationPitch = var4[1];
            }
        }
    }

    public List<Entity> method16571(float var1) {
        List var4 = MultiUtilities.getEntitesInWorld();
        Iterator var5 = var4.iterator();

        while (var5.hasNext()) {
            Entity var6 = (Entity) var5.next();
            if (var6 == mc.player) {
                var5.remove();
            } else if (Client.getInstance().getFriendManager().method26997(var6)) {
                var5.remove();
            } else if (!(var6 instanceof LivingEntity)) {
                var5.remove();
            } else if (((LivingEntity) var6).getHealth() == 0.0F) {
                var5.remove();
            } else if (mc.player.getDistance(var6) > var1) {
                var5.remove();
            } else if (!mc.player.canAttack((LivingEntity) var6)) {
                var5.remove();
            } else if (var6 instanceof ArmorStandEntity) {
                var5.remove();
            } else if (!this.getBooleanValueFromSettingName("Players") && var6 instanceof PlayerEntity) {
                var5.remove();
            } else if (this.getBooleanValueFromSettingName("Anti-Bot") && var6 instanceof PlayerEntity && Client.getInstance().getCombatManager().isValidTarget(var6)) {
                var5.remove();
            } else if (!this.getBooleanValueFromSettingName("Invisible") && var6.isInvisible()) {
                var5.remove();
            } else if (!this.getBooleanValueFromSettingName("Animals/Monsters") && !(var6 instanceof PlayerEntity)) {
                var5.remove();
            } else if (mc.player.getRidingEntity() != null && mc.player.getRidingEntity().equals(var6)) {
                var5.remove();
            } else if (var6.method3362()) {
                var5.remove();
            } else if (var6 instanceof PlayerEntity && Class8781.method31662((PlayerEntity) var6) && !this.getBooleanValueFromSettingName("Teams")) {
                var5.remove();
            }
        }

        String var8 = this.getStringSettingValueByName("Sort mode");
        switch (var8) {
            case "Range":
                Collections.sort(var4, new Class3610(this));
                break;
            case "Angle":
                Collections.sort(var4, new Class3592(this));
        }

        return var4;
    }
}
