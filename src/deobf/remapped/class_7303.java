package remapped;

public class class_7303 {
   private static String[] field_37328;
   private MinecraftClient field_37329 = MinecraftClient.getInstance();

   public void method_33304() {
      SigmaMainClass.getInstance().getEventManager().subscribe2(this);
   }

   @EventListen
   private void method_33303(PlayerTickEvent var1) {
   }
}
