package mapped;

public class Class240<T extends Class880> extends Class239<T, Class2891<T>> {
   private static String[] field893;

   public Class240(Class5714<T, Class2891<T>> var1) {
      super(var1);
   }

   @Override
   public void method820(Class9332 var1, Class7733 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      Class8848 var13 = var4.method3090();
      var1.method35294();
      if (var13.method32107() == Class8514.field37971) {
         this.method825().method11012().method22682(var1);
         this.method825().method11206().method22682(var1);
         var1.method35291(0.0625, 0.25, 0.0);
         var1.method35293(Class7680.field32902.method25286(180.0F));
         var1.method35293(Class7680.field32898.method25286(140.0F));
         var1.method35293(Class7680.field32902.method25286(10.0F));
         var1.method35291(0.0, -0.4F, 0.4F);
      }

      super.method820(var1, var2, var3, (T)var4, var5, var6, var7, var8, var9, var10);
      var1.method35295();
   }
}