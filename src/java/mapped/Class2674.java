package mapped;

public class Class2674 extends Class2672 {
   private static String[] field17063;
   public final Class1032 field17064;

   Class2674(Class1032 var1) {
      super(var1);
      this.field17064 = var1;
   }

   @Override
   public int method10892() {
      return 40;
   }

   @Override
   public int method10893() {
      return 100;
   }

   @Override
   public void method10890() {
      Class880 var3 = this.field17064.method4232();
      double var4 = Math.min(var3.getPosY(), this.field17064.getPosY());
      double var6 = Math.max(var3.getPosY(), this.field17064.getPosY()) + 1.0;
      float var8 = (float)Class9679.method37814(var3.getPosZ() - this.field17064.getPosZ(), var3.getPosX() - this.field17064.getPosX());
      if (!(this.field17064.method3277(var3) < 9.0)) {
         for (int var9 = 0; var9 < 16; var9++) {
            double var11 = 1.25 * (double)(var9 + 1);
            int var13 = 1 * var9;
            this.method10896(
               this.field17064.getPosX() + (double)Class9679.method37764(var8) * var11,
               this.field17064.getPosZ() + (double)Class9679.method37763(var8) * var11,
               var4,
               var6,
               var8,
               var13
            );
         }
      } else {
         for (int var14 = 0; var14 < 5; var14++) {
            float var10 = var8 + (float)var14 * (float) Math.PI * 0.4F;
            this.method10896(
               this.field17064.getPosX() + (double)Class9679.method37764(var10) * 1.5,
               this.field17064.getPosZ() + (double)Class9679.method37763(var10) * 1.5,
               var4,
               var6,
               var10,
               0
            );
         }

         for (int var15 = 0; var15 < 8; var15++) {
            float var16 = var8 + (float)var15 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
            this.method10896(
               this.field17064.getPosX() + (double)Class9679.method37764(var16) * 2.5,
               this.field17064.getPosZ() + (double)Class9679.method37763(var16) * 2.5,
               var4,
               var6,
               var16,
               3
            );
         }
      }
   }

   private void method10896(double var1, double var3, double var5, double var7, float var9, int var10) {
      BlockPos var13 = new BlockPos(var1, var7, var3);
      boolean var14 = false;
      double var15 = 0.0;

      while (true) {
         BlockPos var17 = var13.method8313();
         Class7380 var18 = this.field17064.field5024.method6738(var17);
         if (!var18.method23454(this.field17064.field5024, var17, Direction.field673)) {
            var13 = var13.method8313();
            if (var13.getY() >= Class9679.method37769(var5) - 1) {
               continue;
            }
            break;
         }

         if (!this.field17064.field5024.method7007(var13)) {
            Class7380 var19 = this.field17064.field5024.method6738(var13);
            Class6408 var20 = var19.method23414(this.field17064.field5024, var13);
            if (!var20.method19516()) {
               var15 = var20.method19513(Class113.field414);
            }
         }

         var14 = true;
         break;
      }

      if (var14) {
         this.field17064
            .field5024
            .method6916(new Class915(this.field17064.field5024, var1, (double)var13.getY() + var15, var3, var9, var10, this.field17064));
      }
   }

   @Override
   public Class9455 method10894() {
      return Class6067.field26565;
   }

   @Override
   public Class2031 method10895() {
      return Class2031.field13183;
   }
}