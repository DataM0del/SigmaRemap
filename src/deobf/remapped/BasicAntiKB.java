package remapped;

public class BasicAntiKB extends Module {
   public BasicAntiKB() {
      super(Category.COMBAT, "Basic", "Places block underneath");
      this.addSetting(new BooleanSetting("Explosions", "Cancels Explosions knockback", true));
      this.addSetting(new FloatSetting<Float>("H-Multiplier", "Horizontal velocity multiplier", 0.0F, Float.class, 0.0F, 1.0F, 0.01F));
      this.addSetting(new FloatSetting<Float>("V-Multiplier", "Vertical velocity multiplier", 0.0F, Float.class, 0.0F, 1.0F, 0.01F));
   }

   @EventListen
   private void method_33141(PacketEvent var1) {
      if (this.isEnabled()) {
         if (client.thePlayer != null && var1.method_557() instanceof class_4548) {
            class_4548 var4 = (class_4548)var1.method_557();
            if (var4.method_21093() == client.thePlayer.method_37145()) {
               if (this.getFloatValueByName("H-Multiplier") == 0.0F && this.getFloatValueByName("V-Multiplier") == 0.0F) {
                  var1.method_29715(true);
               }

               var4.field_22171 = (int)((float)var4.field_22171 * this.getFloatValueByName("H-Multiplier"));
               var4.field_22167 = (int)((float)var4.field_22167 * this.getFloatValueByName("H-Multiplier"));
               var4.field_22168 = (int)((float)var4.field_22168 * this.getFloatValueByName("V-Multiplier"));
            }
         }

         if (var1.method_557() instanceof class_1897 && this.getBooleanValueByName("Explosions")) {
            class_1897 var5 = (class_1897)var1.method_557();
            var5.field_9687 = var5.field_9687 * this.getFloatValueByName("H-Multiplier");
            var5.field_9693 = var5.field_9693 * this.getFloatValueByName("H-Multiplier");
            var5.field_9692 = var5.field_9692 * this.getFloatValueByName("V-Multiplier");
         }
      }
   }
}
