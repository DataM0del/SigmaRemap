package remapped;

import java.util.ArrayList;
import java.util.Iterator;

public class KeyStrokesModule extends Module {
   public int field_39065 = 10;
   public int field_39066 = 260;
   public ArrayList<class_3074> field_39064 = new ArrayList<class_3074>();

   public KeyStrokesModule() {
      super(Category.GUI, "KeyStrokes", "Shows what keybind you are pressing");
      this.method_42011(false);
   }

   public class_6849 method_34853(int var1) {
      if (var1 != client.gameOptions.keyLeft.field_30027.field_17800) {
         if (var1 != client.gameOptions.keyRight.field_30027.field_17800) {
            if (var1 != client.gameOptions.keyForward.field_30027.field_17800) {
               if (var1 != client.gameOptions.keyBack.field_30027.field_17800) {
                  if (var1 != client.gameOptions.keyAttack.field_30027.field_17800) {
                     return var1 != client.gameOptions.keyUse.field_30027.field_17800 ? null : class_6849.field_35322;
                  } else {
                     return class_6849.field_35323;
                  }
               } else {
                  return class_6849.field_35321;
               }
            } else {
               return class_6849.field_35324;
            }
         } else {
            return class_6849.field_35316;
         }
      } else {
         return class_6849.field_35314;
      }
   }

   @EventListen
   private void method_34855(class_3278 var1) {
      if (this.method_42015() && client.thePlayer != null) {
         if (!MinecraftClient.getInstance().gameOptions.field_45470) {
            if (!MinecraftClient.getInstance().gameOptions.hideGUI) {
               this.field_39066 = var1.method_14966();
               if (SigmaMainClass.getInstance().getGUIManager().method_30987()) {
                  for (class_6849 var7 : class_6849.values()) {
                     class_7737 var8 = var7.method_31422();
                     class_7737 var9 = var7.method_31423();
                     FontManager.method_149(
                        this.field_39065 + var8.field_39233,
                        this.field_39066 + var8.field_39236,
                        this.field_39065 + var8.field_39233 + var9.field_39233,
                        this.field_39066 + var8.field_39236 + var9.field_39236
                     );
                     class_4746.method_21925(this.field_39065 + var8.field_39233, this.field_39066 + var8.field_39236, var9.field_39233, var9.field_39236);
                     class_4746.method_21924();
                     FontManager.method_141();
                  }
               }

               for (class_6849 var19 : class_6849.values()) {
                  class_7737 var21 = var19.method_31422();
                  class_7737 var23 = var19.method_31423();
                  float var10 = 1.0F;
                  float var11 = 1.0F;
                  if (SigmaMainClass.getInstance().getGUIManager().method_30987()) {
                     var11 = 0.5F;
                     var10 = 0.5F;
                  }

                  String var12 = class_314.method_1451(var19.field_35319.field_30027.field_17800);
                  if (var19.field_35319 != client.gameOptions.keyAttack) {
                     if (var19.field_35319 == client.gameOptions.keyUse) {
                        var12 = "R";
                     }
                  } else {
                     var12 = "L";
                  }

                  FontManager.method_94(
                     (float)(this.field_39065 + var21.field_39233),
                     (float)(this.field_39066 + var21.field_39236),
                     (float)(this.field_39065 + var21.field_39233 + var23.field_39233),
                     (float)(this.field_39066 + var21.field_39236 + var23.field_39236),
                     class_314.method_1444(class_1255.field_6929.field_6917, 0.5F * var10)
                  );
                  FontManager.method_128(
                     (float)(this.field_39065 + var21.field_39233),
                     (float)(this.field_39066 + var21.field_39236),
                     (float)var23.field_39233,
                     (float)var23.field_39236,
                     10.0F,
                     0.75F * var11
                  );
                  FontManager.method_87(
                     class_5320.field_27139,
                     (float)(this.field_39065 + var21.field_39233 + (var23.field_39233 - class_5320.field_27139.method_18547(var12)) / 2),
                     (float)(this.field_39066 + var21.field_39236 + 12),
                     var12,
                     class_1255.field_6918.field_6917
                  );
               }

               Iterator var14 = this.field_39064.iterator();

               while (var14.hasNext()) {
                  class_3074 var16 = (class_3074)var14.next();
                  class_6849 var18 = var16.field_15113;
                  class_7737 var20 = var18.method_31422();
                  class_7737 var22 = var18.method_31423();
                  FontManager.method_149(
                     this.field_39065 + var20.field_39233,
                     this.field_39066 + var20.field_39236,
                     this.field_39065 + var20.field_39233 + var22.field_39233,
                     this.field_39066 + var20.field_39236 + var22.field_39236
                  );
                  float var24 = 0.7F;
                  int var25 = 0;

                  for (class_3074 var28 : this.field_39064) {
                     if (var28.field_15113.equals(var18)) {
                        var25++;
                     }
                  }

                  if (var18.method_31425().isKeyDown() && var16.field_15112.method_11123() >= var24 && var25 < 2) {
                     var16.field_15112.method_11122(var24);
                  }

                  float var27 = var16.field_15112.method_11123();
                  int var29 = class_314.method_1444(-5658199, (1.0F - var27 * (0.5F + var27 * 0.5F)) * 0.8F);
                  if (SigmaMainClass.getInstance().getGUIManager().method_30987()) {
                     var29 = class_314.method_1444(-1, (1.0F - var27 * (0.5F + var27 * 0.5F)) * 0.8F);
                  }

                  FontManager.method_124(
                     (float)(this.field_39065 + var20.field_39233 + var22.method_35028() / 2),
                     (float)(this.field_39066 + var20.field_39236 + var22.field_39236 / 2),
                     (float)(var22.method_35028() - 4) * var27 + 4.0F,
                     var29
                  );
                  FontManager.method_141();
                  if (var16.field_15112.method_11123() == 1.0F) {
                     var14.remove();
                  }
               }

               var1.method_14968(160);
            }
         }
      }
   }

   @EventListen
   private void method_34861(class_6435 var1) {
      if (this.method_42015() && client.thePlayer != null) {
         if (this.method_34853(var1.method_29384()) != null && !var1.method_29385()) {
            this.field_39064.add(new class_3074(this, this.method_34853(var1.method_29384())));
         }
      }
   }

   @EventListen
   private void method_34850(class_8706 var1) {
      if (!this.method_42015() || client.thePlayer == null) {
         ;
      }
   }
}
