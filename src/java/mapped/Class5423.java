package mapped;

public class Class5423 implements Class5422 {
   private final Class5422 field24106;
   private final Class5422 field24107;

   public Class5423(Class5422 var1, Class5422 var2) {
      if (var1 != var2) {
         this.field24106 = var1;
         this.field24107 = var2;
      } else {
         throw new IllegalArgumentException("Duplicate delegates");
      }
   }

   @Override
   public Class5422 method17025(double var1, double var3, double var5) {
      this.field24106.method17025(var1, var3, var5);
      this.field24107.method17025(var1, var3, var5);
      return this;
   }

   @Override
   public Class5422 method17026(int var1, int var2, int var3, int var4) {
      this.field24106.method17026(var1, var2, var3, var4);
      this.field24107.method17026(var1, var2, var3, var4);
      return this;
   }

   @Override
   public Class5422 method17027(float var1, float var2) {
      this.field24106.method17027(var1, var2);
      this.field24107.method17027(var1, var2);
      return this;
   }

   @Override
   public Class5422 method17028(int var1, int var2) {
      this.field24106.method17028(var1, var2);
      this.field24107.method17028(var1, var2);
      return this;
   }

   @Override
   public Class5422 method17029(int var1, int var2) {
      this.field24106.method17029(var1, var2);
      this.field24107.method17029(var1, var2);
      return this;
   }

   @Override
   public Class5422 method17030(float var1, float var2, float var3) {
      this.field24106.method17030(var1, var2, var3);
      this.field24107.method17030(var1, var2, var3);
      return this;
   }

   @Override
   public void method17032(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      float var12,
      float var13,
      float var14
   ) {
      this.field24106.method17032(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
      this.field24107.method17032(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
   }

   @Override
   public void method17031() {
      this.field24106.method17031();
      this.field24107.method17031();
   }

   @Override
   public void method17042(Class1713 var1) {
      this.field24106.method17042(var1);
      this.field24107.method17042(var1);
   }

   @Override
   public void method17043(Class1713 var1) {
      this.field24106.method17043(var1);
      this.field24107.method17043(var1);
   }

   @Override
   public void method17044(Class4520 var1) {
      this.field24106.method17044(var1);
      this.field24107.method17044(var1);
   }

   @Override
   public Class7680 method17045(Class7680 var1) {
      return this.field24107.method17045(var1);
   }

   @Override
   public Class7680 method17046(float var1, float var2, float var3) {
      return this.field24107.method17046(var1, var2, var3);
   }

   @Override
   public float[] method17047(float var1, float var2, float var3, float var4) {
      return this.field24107.method17047(var1, var2, var3, var4);
   }

   @Override
   public int[] method17048(int var1, int var2, int var3, int var4) {
      return this.field24107.method17048(var1, var2, var3, var4);
   }

   @Override
   public Class7735 method17049() {
      return this.field24107.method17049();
   }
}