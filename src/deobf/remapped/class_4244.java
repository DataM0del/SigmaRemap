package remapped;

public class class_4244 extends Module {
   public class_4244() {
      super(Category.COMBAT, "Legit", "Increase the knockback you give to players");
   }

   @EventListen
   private void method_19784(PlayerTickEvent var1) {
      if (this.isEnabled()) {
         client.gameOptions.keySprint.pressed = true;
         if (client.thePlayer.field_29666 != 1) {
            if (client.thePlayer.field_29666 == 0) {
               client.gameOptions.keyForward.pressed = class_9732.method_44934(
                  MinecraftClient.getInstance().window.getHandle(), client.gameOptions.keyForward.field_30027.field_17800
               );
            }
         } else {
            client.gameOptions.keyForward.pressed = false;
         }
      }
   }
}
