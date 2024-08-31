package com.mentalfrostbyte.jello.module.impl.combat;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.BooleanSetting;
import mapped.CPlayerPacket;
import mapped.NumberSetting;

public class Regen extends Module {
   public Regen() {
      super(ModuleCategory.COMBAT, "Regen", "Regenerates hearts faster than ever (1.8 only)");
      this.registerSetting(new NumberSetting<Float>("Packet amount", "Number of packets sent", 50.0F, Float.class, 1.0F, 100.0F, 1.0F));
      this.registerSetting(new BooleanSetting("Only OnGround", "Regen only when on ground", false));
   }

   @EventTarget
   private void method16007(TickEvent var1) {
      if (this.isEnabled()) {
         if (!mc.player.abilities.isCreativeMode
            && mc.player.method2932().method37574() > 17
            && mc.player.getHealth() < 20.0F
            && mc.player.getHealth() != 0.0F
            && (mc.player.onGround || !this.getBooleanValueFromSetttingName("Only OnGround"))) {
            for (int var4 = 0; (float)var4 < this.getNumberValueBySettingName("Packet amount"); var4++) {
               mc.getConnection().sendPacket(new CPlayerPacket(mc.player.onGround));
            }
         }
      }
   }
}
