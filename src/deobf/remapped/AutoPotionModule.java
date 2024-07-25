package remapped;

import java.util.ArrayList;
import java.util.List;

public class AutoPotionModule extends Module {
   private int field_13560;
   private int field_13557;
   private int field_13558;
   private int field_13559;

   public AutoPotionModule() {
      super(Category.ITEM, "AutoPotion", "Automatically throws potion to regen or speed up");
      this.addSetting(new FloatSetting<Float>("Health", "Maximum health before healing.", 6.0F, Float.class, 0.5F, 10.0F, 0.5F));
      this.addSetting(new BooleanSetting("Predict", "Predicts where to pot when moving.", true));
      this.addSetting(new BooleanSetting("Instant", "Instant potting (more packets).", false));
      this.addSetting(new BooleanSetting("Speed", "Uses Speed pots.", true));
      this.addSetting(new BooleanSetting("Regen", "Uses Regen pots.", true));
      this.addSetting(new BooleanSetting("Custom potion", "Allow the use of custom potions", false));
      this.addSetting(new BooleanSetting("In fight", "Allows using autopot with killaura", true));
   }

   @Override
   public void method_42006() {
      this.field_13559 = 0;
   }

   @EventListen
   @class_4249
   private void method_12642(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         if (this.getBooleanValueByName("In fight") || KillauraModule.field_12556 == null && KillauraModule.field_12558 == null) {
            int var4 = this.method_12640();
            this.field_13560++;
            int[] var5 = new int[]{6, -1, -1};
            if (this.getBooleanValueByName("Regen")) {
               var5[1] = 10;
            }

            if (this.getBooleanValueByName("Speed")) {
               var5[2] = 1;
            }

            if (!mcInstance.field_9632.field_41726) {
               this.field_13557 = 0;
            } else {
               this.field_13557++;
            }

            if (this.field_13559 != 1) {
               if (this.field_13559 >= 2) {
                  mcInstance.field_9632.field_3853.field_36404 = this.field_13558;
                  mcInstance.field_9647.method_42129();
                  this.field_13559 = 0;
               }

               if (this.field_13557 > 1) {
                  for (int var6 = 0; var6 < var5.length; var6++) {
                     if (var5[var6] != -1) {
                        if (var5[var6] != 6 && var5[var6] != 10) {
                           if (this.field_13560 > 60) {
                              this.method_12639(var1, var4, var5[var6]);
                           }
                        } else if (this.field_13560 > 18
                           && !mcInstance.field_9632.method_26480(class_1425.method_6538(var5[var6]))
                           && mcInstance.field_9632.method_26551() < this.getFloatValueByName("Health") * 2.0F) {
                           this.method_12639(var1, var4, var5[var6]);
                        }
                     }
                  }
               }
            } else {
               this.field_13559++;
               mcInstance.method_8614().method_4813(new class_1022(class_2584.field_12791));
            }
         }
      }
   }

   public float[] method_12644() {
      double var3 = mcInstance.field_9632.method_37302() + mcInstance.field_9632.method_37098().field_7336 * 26.0;
      double var5 = mcInstance.field_9632.field_41712.field_19937 - 3.6;
      double var7 = mcInstance.field_9632.method_37156() + mcInstance.field_9632.method_37098().field_7334 * 26.0;
      return !this.getBooleanValueByName("Predict") ? new float[]{mcInstance.field_9632.field_41701, 90.0F} : class_7211.method_33006(var3, var7, var5);
   }

   public int method_12640() {
      int var3 = 5;

      for (int var4 = 36; var4 < 45; var4++) {
         if (!mcInstance.field_9632.field_3869.method_18878(var4).method_35884()) {
            var3 = var4 - 36;
            break;
         }
      }

      return var3;
   }

   public int method_12641(int var1) {
      byte var4 = 0;
      byte var5 = 0;
      int var6 = -1;
      int var7 = 0;

      for (int var8 = 9; var8 < 45; var8++) {
         if (mcInstance.field_9632.field_3869.method_18878(var8).method_35884()) {
            class_6098 var9 = mcInstance.field_9632.field_3869.method_18878(var8).method_35898();
            if (var9.method_27960() instanceof class_5518) {
               List var10 = class_2740.method_12313(var9);
               int var11 = this.method_12643(var10);
               if (var10 != null && !var10.isEmpty() && (this.getBooleanValueByName("Custom potion") || var11 == 1)) {
                  for (class_2250 var13 : var10) {
                     int var14 = class_1425.method_6536(var13.method_10339());
                     int var15 = var13.method_10333();
                     int var16 = var13.method_10347();
                     if (var14 == var1 && class_2740.method_12351(var9)) {
                        if (var15 <= var4) {
                           if (var15 == var4 && var16 > var5) {
                              var6 = var8;
                              var7 = var11;
                           } else if (var7 > var11 && var15 >= var4) {
                              var7 = var11;
                           }
                        } else {
                           var6 = var8;
                           var7 = var11;
                        }
                     }
                  }
               }
            }
         }
      }

      return mcInstance.field_9632.method_26480(class_1425.method_6538(var1))
            && mcInstance.field_9632.method_26553(class_1425.method_6538(var1)).method_10333() >= var4
         ? -1
         : var6;
   }

   private int method_12643(List<class_2250> var1) {
      ArrayList var4 = new ArrayList();
      int var5 = 0;

      for (class_2250 var7 : var1) {
         int var8 = class_1425.method_6536(var7.method_10339());
         if (!var4.contains(var8)) {
            var5++;
            var4.add(var8);
         }
      }

      return var5;
   }

   public void method_12639(class_1393 var1, int var2, int var3) {
      int var6 = this.method_12641(var3);
      if (var6 != -1) {
         if (var6 < 36) {
            if (SigmaMainClass.method_3328().method_3310().method_25303() > 2) {
               class_2740.method_12312(var6, var2);
            }
         } else {
            this.field_13560 = 0;
            int var7 = mcInstance.field_9632.field_3853.field_36404;
            boolean var8 = SigmaMainClass.method_3328().getModuleManager().method_847(class_9801.class).method_42015()
               && SigmaMainClass.method_3328().getModuleManager().method_847(class_9801.class).getStringValueByName("Type").equalsIgnoreCase("NoGround");
            float[] var9 = this.method_12644();
            mcInstance.field_9632.field_3853.field_36404 = var6 - 36;
            mcInstance.field_9647.method_42129();
            if (!this.getBooleanValueByName("Instant")) {
               this.field_13559 = 1;
               var1.method_6441(var9[0]);
               var1.method_6448(var9[1]);
            } else {
               mcInstance.method_8614().method_4813(new class_3616(var9[0], var9[1], !var8 && mcInstance.field_9632.field_41726));
               mcInstance.method_8614().method_4813(new class_1022(class_2584.field_12791));
               mcInstance.method_8614().method_4813(new class_1022(class_2584.field_12794));
               mcInstance.field_9632.field_3853.field_36404 = var7;
               mcInstance.field_9647.method_42129();
               KillauraModule.field_12551 = 1;
            }

            this.field_13558 = var7;
         }
      }
   }
}