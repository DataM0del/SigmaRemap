package remapped;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class VanillaFly extends Module {
   private boolean field_3720;
   private int field_3718;

   public VanillaFly() {
      super(Category.MOVEMENT, "Vanilla", "Regular vanilla fly");
      this.addSetting(new FloatSetting<Float>("Speed", "Fly speed", 4.0F, Float.class, 0.28F, 10.0F, 0.01F));
      this.addSetting(new BooleanSetting("Kick bypass", "Bypass vanilla kick for flying", true));
   }

   @Override
   public void onEnable() {
      if (!client.gameOptions.keySneak.isKeyDown()) {
         if (!client.gameOptions.keySneak.isKeyDown()) {
            this.field_3720 = false;
         }
      } else {
         client.gameOptions.keySneak.pressed = false;
         this.field_3720 = true;
      }
   }

   @Override
   public void onDisable() {
      class_314.method_1408(-0.08);
      double var3 = class_8865.method_40775();
      class_8865.method_40776(var3);
      if (this.field_3720) {
         client.gameOptions.keySneak.pressed = true;
      }
   }

   @EventListen
   private void method_3072(class_6435 var1) {
      if (this.method_42015()) {
         if (var1.method_29384() == client.gameOptions.keySneak.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_3720 = true;
         }
      }
   }

   @EventListen
   private void method_3075(class_307 var1) {
      if (this.method_42015()) {
         if (var1.method_1364() == client.gameOptions.keySneak.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_3720 = false;
         }
      }
   }

   @EventListen
   public void method_3074(class_1393 var1) {
      if (this.method_42015()) {
         if (!client.thePlayer.onGround && this.getBooleanValueByName("Kick bypass")) {
            if (this.field_3718 > 0 && this.field_3718 % 30 == 0 && !class_314.method_1413(client.thePlayer, 0.01F)) {
               if (class_3347.method_15349() != class_412.field_1747.method_2055()) {
                  var1.method_6455(var1.method_6454() - 0.04);
               } else {
                  double var4 = this.method_3073();
                  if (var4 < 0.0) {
                     return;
                  }

                  double var6 = var1.method_6454();
                  ArrayList var8 = new ArrayList();
                  if (!(var6 - var4 > 9.0)) {
                     client.method_8614().sendPacket(new class_9515(var1.method_6450(), var4, var1.method_6438(), true));
                  } else {
                     while (var6 > var4 + 9.0) {
                        var6 -= 9.0;
                        var8.add(var6);
                        client.method_8614().sendPacket(new class_9515(var1.method_6450(), var6, var1.method_6438(), true));
                     }

                     for (Double var10 : var8) {
                        client.method_8614().sendPacket(new class_9515(var1.method_6450(), var10, var1.method_6438(), true));
                     }

                     client.method_8614().sendPacket(new class_9515(var1.method_6450(), var4, var1.method_6438(), true));
                     Collections.reverse(var8);

                     for (Double var12 : var8) {
                        client.method_8614().sendPacket(new class_9515(var1.method_6450(), var12, var1.method_6438(), true));
                     }

                     client.method_8614().sendPacket(new class_9515(var1.method_6450(), var1.method_6454(), var1.method_6438(), true));
                  }

                  this.field_3718 = 0;
               }
            }
         }
      }
   }

   @EventListen
   public void method_3071(class_7767 var1) {
      if (this.method_42015()) {
         if (!class_314.method_1413(client.thePlayer, 0.01F)) {
            this.field_3718++;
         } else {
            this.field_3718 = 0;
         }

         double var4 = (double)this.getFloatValueByName("Speed");
         double var6 = !client.gameOptions.keyJump.pressed ? 0.0 : var4 / 2.0;
         if (client.gameOptions.keyJump.pressed && client.gameOptions.keySneak.pressed) {
            var6 = 0.0;
         } else if (!this.field_3720) {
            if (client.gameOptions.keyJump.pressed) {
               var6 = var4 / 2.0;
            }
         } else {
            var6 = -var4 / 2.0;
         }

         class_8865.method_40777(var1, var4);
         var1.method_35235(var6);
         class_314.method_1408(var1.method_35236());
      }
   }

   private double method_3073() {
      if (!(client.thePlayer.method_37245().field_7333 < 1.0)) {
         if (!client.thePlayer.onGround) {
            Box var3 = client.thePlayer.field_41712.method_18928(0.0, -client.thePlayer.method_37245().field_7333, 0.0);
            Iterator var4 = client.theWorld.method_6680(client.thePlayer, var3).iterator();
            double var5 = -1.0;

            while (var4.hasNext()) {
               class_4190 var7 = (class_4190)var4.next();
               if (var7.method_19483().field_19939 > var5) {
                  var5 = var7.method_19483().field_19939;
               }
            }

            return var5;
         } else {
            return client.thePlayer.method_37309();
         }
      } else {
         return -1.0;
      }
   }
}
