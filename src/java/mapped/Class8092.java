package mapped;

public class Class8092 {
   private static String[] field34811;
   public final Class1006 field34812;
   public float field34813;
   public float field34814;
   public boolean field34815;
   public double field34816;
   public double field34817;
   public double field34818;

   public Class8092(Class1006 var1) {
      this.field34812 = var1;
   }

   public void method28039(Vector3d var1) {
      this.method28041(var1.field18048, var1.field18049, var1.field18050);
   }

   public void method28040(Entity var1, float var2, float var3) {
      this.method28042(var1.getPosX(), method28050(var1), var1.getPosZ(), var2, var3);
   }

   public void method28041(double var1, double var3, double var5) {
      this.method28042(var1, var3, var5, (float)this.field34812.method4261(), (float)this.field34812.method4259());
   }

   public void method28042(double var1, double var3, double var5, float var7, float var8) {
      this.field34816 = var1;
      this.field34817 = var3;
      this.field34818 = var5;
      this.field34813 = var7;
      this.field34814 = var8;
      this.field34815 = true;
   }

   public void method28037() {
      if (this.method28038()) {
         this.field34812.field5032 = 0.0F;
      }

      if (!this.field34815) {
         this.field34812.field4967 = this.method28049(this.field34812.field4967, this.field34812.field4965, 10.0F);
      } else {
         this.field34815 = false;
         this.field34812.field4967 = this.method28049(this.field34812.field4967, this.method28048(), this.field34813);
         this.field34812.field5032 = this.method28049(this.field34812.field5032, this.method28047(), this.field34814);
      }

      if (!this.field34812.method4230().method21664()) {
         this.field34812.field4967 = Class9679.method37796(this.field34812.field4967, this.field34812.field4965, (float)this.field34812.method4260());
      }
   }

   public boolean method28038() {
      return true;
   }

   public boolean method28043() {
      return this.field34815;
   }

   public double method28044() {
      return this.field34816;
   }

   public double method28045() {
      return this.field34817;
   }

   public double method28046() {
      return this.field34818;
   }

   public float method28047() {
      double var3 = this.field34816 - this.field34812.getPosX();
      double var5 = this.field34817 - this.field34812.method3442();
      double var7 = this.field34818 - this.field34812.getPosZ();
      double var9 = (double)Class9679.method37766(var3 * var3 + var7 * var7);
      return (float)(-(Class9679.method37814(var5, var9) * 180.0F / (float)Math.PI));
   }

   public float method28048() {
      double var3 = this.field34816 - this.field34812.getPosX();
      double var5 = this.field34818 - this.field34812.getPosZ();
      return (float)(Class9679.method37814(var5, var3) * 180.0F / (float)Math.PI) - 90.0F;
   }

   public float method28049(float var1, float var2, float var3) {
      float var6 = Class9679.method37794(var1, var2);
      float var7 = Class9679.method37777(var6, -var3, var3);
      return var1 + var7;
   }

   private static double method28050(Entity var0) {
      return !(var0 instanceof Class880) ? (var0.method3389().field28450 + var0.method3389().field28453) / 2.0 : var0.method3442();
   }
}