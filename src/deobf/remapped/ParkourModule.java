package remapped;

public class ParkourModule extends Module {
   public ParkourModule() {
      super(Category.PLAYER, "Parkour", "Automatically jumps at the edge of blocks");
   }

   @EventListen
   public void method_14758(class_4868 var1) {
      if (this.isEnabled()) {
         if (client.thePlayer.onGround) {
            if (!class_314.method_1452()) {
               client.thePlayer.method_26595();
            }
         }
      }
   }
}
