package mapped;

public abstract class Class4586 extends Class4587 {
   public float field22035 = 0.1F * (this.field22054.nextFloat() * 0.5F + 0.5F) * 2.0F;

   public Class4586(Class1656 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   public Class4586(Class1656 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
   }

   @Override
   public void method14510(Class5422 var1, Class9624 var2, float var3) {
      Vector3d var6 = var2.method37504();
      float var7 = (float)(Class9679.method37822((double)var3, this.field22038, this.field22041) - var6.method11320());
      float var8 = (float)(Class9679.method37822((double)var3, this.field22039, this.field22042) - var6.method11321());
      float var9 = (float)(Class9679.method37822((double)var3, this.field22040, this.field22043) - var6.method11322());
      Class8661 var10;
      if (this.field22062 != 0.0F) {
         var10 = new Class8661(var2.method37508());
         float var11 = Class9679.method37821(var3, this.field22063, this.field22062);
         var10.method31182(Class7680.field32902.method25285(var11));
      } else {
         var10 = var2.method37508();
      }

      Class7680 var19 = new Class7680(-1.0F, -1.0F, 0.0F);
      var19.method25283(var10);
      Class7680[] var12 = new Class7680[]{
         new Class7680(-1.0F, -1.0F, 0.0F), new Class7680(-1.0F, 1.0F, 0.0F), new Class7680(1.0F, 1.0F, 0.0F), new Class7680(1.0F, -1.0F, 0.0F)
      };
      float var13 = this.method14509(var3);

      for (int var14 = 0; var14 < 4; var14++) {
         Class7680 var15 = var12[var14];
         var15.method25283(var10);
         var15.method25272(var13);
         var15.method25276(var7, var8, var9);
      }

      float var20 = this.method14503();
      float var21 = this.method14504();
      float var16 = this.method14505();
      float var17 = this.method14506();
      int var18 = this.method14499(var3);
      var1.method17025((double)var12[0].method25269(), (double)var12[0].method25270(), (double)var12[0].method25271())
         .method17027(var21, var17)
         .method17033(this.field22058, this.field22059, this.field22060, this.field22061)
         .method17034(var18)
         .method17031();
      var1.method17025((double)var12[1].method25269(), (double)var12[1].method25270(), (double)var12[1].method25271())
         .method17027(var21, var16)
         .method17033(this.field22058, this.field22059, this.field22060, this.field22061)
         .method17034(var18)
         .method17031();
      var1.method17025((double)var12[2].method25269(), (double)var12[2].method25270(), (double)var12[2].method25271())
         .method17027(var20, var16)
         .method17033(this.field22058, this.field22059, this.field22060, this.field22061)
         .method17034(var18)
         .method17031();
      var1.method17025((double)var12[3].method25269(), (double)var12[3].method25270(), (double)var12[3].method25271())
         .method17027(var20, var17)
         .method17033(this.field22058, this.field22059, this.field22060, this.field22061)
         .method17034(var18)
         .method17031();
   }

   public float method14509(float var1) {
      return this.field22035;
   }

   @Override
   public Class4587 method14512(float var1) {
      this.field22035 *= var1;
      return super.method14512(var1);
   }

   public abstract float method14503();

   public abstract float method14504();

   public abstract float method14505();

   public abstract float method14506();
}