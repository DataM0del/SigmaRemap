package mapped;

import javax.annotation.Nullable;

public class Class6761 extends Class6762 {
   private static String[] field29468;
   private float field29469;
   private float field29470;

   @Override
   public void method20613(Class1667 var1, Class1006 var2) {
      super.method20613(var1, var2);
      var2.method4224(Class2163.field14191, 0.0F);
      this.field29469 = var2.method4223(Class2163.field14186);
      var2.method4224(Class2163.field14186, 6.0F);
      this.field29470 = var2.method4223(Class2163.field14192);
      var2.method4224(Class2163.field14192, 4.0F);
   }

   @Override
   public void method20614() {
      this.field29476.method4224(Class2163.field14186, this.field29469);
      this.field29476.method4224(Class2163.field14192, this.field29470);
      super.method20614();
   }

   @Override
   public Class7176 method20615() {
      return this.method20641(
         Class9679.method37769(this.field29476.method3389().field28449),
         Class9679.method37769(this.field29476.method3389().field28450 + 0.5),
         Class9679.method37769(this.field29476.method3389().field28451)
      );
   }

   @Override
   public Class7175 method20616(double var1, double var3, double var5) {
      return new Class7175(this.method20641(Class9679.method37769(var1), Class9679.method37769(var3 + 0.5), Class9679.method37769(var5)));
   }

   @Override
   public int method20617(Class7176[] var1, Class7176 var2) {
      int var5 = 0;
      boolean var6 = true;
      BlockPos var7 = new BlockPos(var2.field30847, var2.field30848, var2.field30849);
      double var8 = this.method20618(var7);
      Class7176 var10 = this.method20619(var2.field30847, var2.field30848, var2.field30849 + 1, 1, var8);
      Class7176 var11 = this.method20619(var2.field30847 - 1, var2.field30848, var2.field30849, 1, var8);
      Class7176 var12 = this.method20619(var2.field30847 + 1, var2.field30848, var2.field30849, 1, var8);
      Class7176 var13 = this.method20619(var2.field30847, var2.field30848, var2.field30849 - 1, 1, var8);
      Class7176 var14 = this.method20619(var2.field30847, var2.field30848 + 1, var2.field30849, 0, var8);
      Class7176 var15 = this.method20619(var2.field30847, var2.field30848 - 1, var2.field30849, 1, var8);
      if (var10 != null && !var10.field30856) {
         var1[var5++] = var10;
      }

      if (var11 != null && !var11.field30856) {
         var1[var5++] = var11;
      }

      if (var12 != null && !var12.field30856) {
         var1[var5++] = var12;
      }

      if (var13 != null && !var13.field30856) {
         var1[var5++] = var13;
      }

      if (var14 != null && !var14.field30856) {
         var1[var5++] = var14;
      }

      if (var15 != null && !var15.field30856) {
         var1[var5++] = var15;
      }

      boolean var16 = var13 == null || var13.field30859 == Class2163.field14185 || var13.field30858 != 0.0F;
      boolean var17 = var10 == null || var10.field30859 == Class2163.field14185 || var10.field30858 != 0.0F;
      boolean var18 = var12 == null || var12.field30859 == Class2163.field14185 || var12.field30858 != 0.0F;
      boolean var19 = var11 == null || var11.field30859 == Class2163.field14185 || var11.field30858 != 0.0F;
      if (var16 && var19) {
         Class7176 var20 = this.method20619(var2.field30847 - 1, var2.field30848, var2.field30849 - 1, 1, var8);
         if (var20 != null && !var20.field30856) {
            var1[var5++] = var20;
         }
      }

      if (var16 && var18) {
         Class7176 var21 = this.method20619(var2.field30847 + 1, var2.field30848, var2.field30849 - 1, 1, var8);
         if (var21 != null && !var21.field30856) {
            var1[var5++] = var21;
         }
      }

      if (var17 && var19) {
         Class7176 var22 = this.method20619(var2.field30847 - 1, var2.field30848, var2.field30849 + 1, 1, var8);
         if (var22 != null && !var22.field30856) {
            var1[var5++] = var22;
         }
      }

      if (var17 && var18) {
         Class7176 var23 = this.method20619(var2.field30847 + 1, var2.field30848, var2.field30849 + 1, 1, var8);
         if (var23 != null && !var23.field30856) {
            var1[var5++] = var23;
         }
      }

      return var5;
   }

   private double method20618(BlockPos var1) {
      if (this.field29476.method3250()) {
         return (double)var1.getY() + 0.5;
      } else {
         BlockPos var4 = var1.method8313();
         Class6408 var5 = this.field29475.method6738(var4).method23414(this.field29475, var4);
         return (double)var4.getY() + (!var5.method19516() ? var5.method19513(Class113.field414) : 0.0);
      }
   }

   @Nullable
   private Class7176 method20619(int var1, int var2, int var3, int var4, double var5) {
      Class7176 var9 = null;
      BlockPos var10 = new BlockPos(var1, var2, var3);
      double var11 = this.method20618(var10);
      if (!(var11 - var5 > 1.125)) {
         Class2163 var13 = this.method20629(this.field29475, var1, var2, var3, this.field29476, this.field29478, this.field29479, this.field29480, false, false);
         float var14 = this.field29476.method4223(var13);
         double var15 = (double)this.field29476.method3429() / 2.0;
         if (var14 >= 0.0F) {
            var9 = this.method20641(var1, var2, var3);
            var9.field30859 = var13;
            var9.field30858 = Math.max(var9.field30858, var14);
         }

         if (var13 != Class2163.field14191 && var13 != Class2163.field14186) {
            if (var9 == null && var4 > 0 && var13 != Class2163.field14189 && var13 != Class2163.field14194 && var13 != Class2163.field14188) {
               var9 = this.method20619(var1, var2 + 1, var3, var4 - 1, var5);
            }

            if (var13 == Class2163.field14185) {
               Class6488 var17 = new Class6488(
                  (double)var1 - var15 + 0.5,
                  (double)var2 + 0.001,
                  (double)var3 - var15 + 0.5,
                  (double)var1 + var15 + 0.5,
                  (double)((float)var2 + this.field29476.method3430()),
                  (double)var3 + var15 + 0.5
               );
               if (!this.field29476.field5024.method7053(this.field29476, var17)) {
                  return null;
               }

               Class2163 var18 = this.method20629(
                  this.field29475, var1, var2 - 1, var3, this.field29476, this.field29478, this.field29479, this.field29480, false, false
               );
               if (var18 == Class2163.field14184) {
                  var9 = this.method20641(var1, var2, var3);
                  var9.field30859 = Class2163.field14186;
                  var9.field30858 = Math.max(var9.field30858, var14);
                  return var9;
               }

               if (var18 == Class2163.field14191) {
                  var9 = this.method20641(var1, var2, var3);
                  var9.field30859 = Class2163.field14191;
                  var9.field30858 = Math.max(var9.field30858, var14);
                  return var9;
               }

               int var19 = 0;

               while (var2 > 0 && var13 == Class2163.field14185) {
                  var2--;
                  if (var19++ >= this.field29476.method3370()) {
                     return null;
                  }

                  var13 = this.method20629(this.field29475, var1, var2, var3, this.field29476, this.field29478, this.field29479, this.field29480, false, false);
                  var14 = this.field29476.method4223(var13);
                  if (var13 != Class2163.field14185 && var14 >= 0.0F) {
                     var9 = this.method20641(var1, var2, var3);
                     var9.field30859 = var13;
                     var9.field30858 = Math.max(var9.field30858, var14);
                     break;
                  }

                  if (var14 < 0.0F) {
                     return null;
                  }
               }
            }

            return var9;
         } else {
            if (var2 < this.field29476.field5024.method6776() - 10 && var9 != null) {
               var9.field30858++;
            }

            return var9;
         }
      } else {
         return null;
      }
   }

   @Override
   public Class2163 method20620(Class1665 var1, boolean var2, boolean var3, BlockPos var4, Class2163 var5) {
      if (var5 == Class2163.field14193
         && !(var1.method6738(var4).method23383() instanceof Class3429)
         && !(var1.method6738(var4.method8313()).method23383() instanceof Class3429)) {
         var5 = Class2163.field14194;
      }

      if (var5 == Class2163.field14201 || var5 == Class2163.field14202 || var5 == Class2163.field14203) {
         var5 = Class2163.field14184;
      }

      if (var5 == Class2163.field14205) {
         var5 = Class2163.field14184;
      }

      return var5;
   }

   @Override
   public Class2163 method20621(Class1665 var1, int var2, int var3, int var4) {
      Mutable var7 = new Mutable();
      Class2163 var8 = method20635(var1, var7.method8372(var2, var3, var4));
      if (var8 != Class2163.field14191) {
         if (var8 == Class2163.field14185 && var3 >= 1) {
            Class7380 var14 = var1.method6738(new BlockPos(var2, var3 - 1, var4));
            Class2163 var15 = method20635(var1, var7.method8372(var2, var3 - 1, var4));
            if (var15 != Class2163.field14186 && var15 != Class2163.field14185 && var15 != Class2163.field14190) {
               var8 = Class2163.field14186;
            } else {
               var8 = Class2163.field14185;
            }

            if (var15 == Class2163.field14196 || var14.method23448(Blocks.field36890) || var14.method23446(Class7645.field32809)) {
               var8 = Class2163.field14196;
            }

            if (var15 == Class2163.field14198) {
               var8 = Class2163.field14198;
            }

            if (var15 == Class2163.field14200) {
               var8 = Class2163.field14200;
            }
         }

         if (var8 == Class2163.field14186) {
            var8 = method20634(var1, var7.method8372(var2, var3, var4), var8);
         }

         return var8;
      } else {
         for (Direction var12 : Direction.values()) {
            Class2163 var13 = method20635(var1, var7.method8372(var2, var3, var4).method8379(var12));
            if (var13 == Class2163.field14184) {
               return Class2163.field14192;
            }
         }

         return Class2163.field14191;
      }
   }
}