package mapped;

public class Class6836 extends Class6829 {
   private static String[] field29706;
   private final Class1048 field29723;

   public Class6836(Class1048 var1) {
      super(var1);
      this.field29723 = var1;
   }

   @Override
   public void method20810() {
      if (this.field29723.method3250()) {
         this.field29723.method3434(this.field29723.method3433().method11339(0.0, 0.005, 0.0));
      }

      if (this.field29714 == Class2335.field15967 && !this.field29723.method4230().method21664()) {
         double var3 = this.field29708 - this.field29723.getPosX();
         double var5 = this.field29709 - this.field29723.getPosY();
         double var7 = this.field29710 - this.field29723.getPosZ();
         double var9 = var3 * var3 + var5 * var5 + var7 * var7;
         if (!(var9 < 2.5000003E-7F)) {
            float var11 = (float)(Class9679.method37814(var7, var3) * 180.0F / (float)Math.PI) - 90.0F;
            this.field29723.field5031 = this.method20816(this.field29723.field5031, var11, 10.0F);
            this.field29723.field4965 = this.field29723.field5031;
            this.field29723.field4967 = this.field29723.field5031;
            float var12 = (float)(this.field29711 * this.field29723.method3086(Class9173.field42108));
            if (!this.field29723.method3250()) {
               this.field29723.method3113(var12 * 0.1F);
            } else {
               this.field29723.method3113(var12 * 0.02F);
               float var13 = -((float)(Class9679.method37814(var5, (double)Class9679.method37766(var3 * var3 + var7 * var7)) * 180.0F / (float)Math.PI));
               var13 = Class9679.method37777(Class9679.method37792(var13), -85.0F, 85.0F);
               this.field29723.field5032 = this.method20816(this.field29723.field5032, var13, 5.0F);
               float var14 = Class9679.method37764(this.field29723.field5032 * (float) (Math.PI / 180.0));
               float var15 = Class9679.method37763(this.field29723.field5032 * (float) (Math.PI / 180.0));
               this.field29723.field4984 = var14 * var12;
               this.field29723.field4983 = -var15 * var12;
            }
         } else {
            this.field29707.method4243(0.0F);
         }
      } else {
         this.field29723.method3113(0.0F);
         this.field29723.method4245(0.0F);
         this.field29723.method4244(0.0F);
         this.field29723.method4243(0.0F);
      }
   }
}