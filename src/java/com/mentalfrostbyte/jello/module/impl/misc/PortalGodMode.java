package com.mentalfrostbyte.jello.module.impl.misc;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.Class5580;

public class PortalGodMode extends Module {
   public PortalGodMode() {
      super(ModuleCategory.MISC, "PortalGodMode", "Makes you invulnerable when you go through a portal and stay in it");
   }

   @EventTarget
   private void method16069(RecievePacketEvent var1) {
      if (this.isEnabled()) {
         if (var1.getPacket() instanceof Class5580) {
            var1.method13900(true);
         }
      }
   }
}