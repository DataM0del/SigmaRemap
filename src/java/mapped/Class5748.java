package mapped;

public class Class5748 extends Class5651<Class1054, Class2827<Class1054>> {
   private static final ResourceLocation field25172 = new ResourceLocation("textures/entity/fish/pufferfish.png");
   private int field25173;
   private final Class2885<Class1054> field25174 = new Class2885<Class1054>();
   private final Class2877<Class1054> field25175 = new Class2877<Class1054>();
   private final Class2812<Class1054> field25176 = new Class2812<Class1054>();

   public Class5748(Class8853 var1) {
      super(var1, new Class2812<Class1054>(), 0.2F);
      this.field25173 = 3;
   }

   public ResourceLocation method17843(Class1054 var1) {
      return field25172;
   }

   public void method17853(Class1054 var1, float var2, float var3, Class9332 var4, Class7733 var5, int var6) {
      int var9 = var1.method4828();
      if (var9 != this.field25173) {
         if (var9 != 0) {
            if (var9 != 1) {
               this.field25086 = this.field25176;
            } else {
               this.field25086 = this.field25175;
            }
         } else {
            this.field25086 = this.field25174;
         }
      }

      this.field25173 = var9;
      this.field25098 = 0.1F + 0.1F * (float)var9;
      super.method17853(var1, var2, var3, var4, var5, var6);
   }

   public void method17842(Class1054 var1, Class9332 var2, float var3, float var4, float var5) {
      var2.method35291(0.0, (double)(Class9679.method37764(var3 * 0.05F) * 0.08F), 0.0);
      super.method17842(var1, var2, var3, var4, var5);
   }
}