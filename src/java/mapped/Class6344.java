package mapped;

public class Class6344 extends Class6333 {
   private static String[] field27873;
   private final PlayerEntity field27874;
   private final Class916 field27875;

   public Class6344(PlayerEntity var1, Class916 var2) {
      super(Class6067.field26763, Class2266.field14734);
      this.field27874 = var1;
      this.field27875 = var2;
      this.field27863 = Class2279.field14845;
      this.field27861 = true;
      this.field27862 = 0;
      this.field27856 = 0.0F;
   }

   @Override
   public boolean method19268() {
      return !this.field27875.method3245();
   }

   @Override
   public boolean method19274() {
      return true;
   }

   @Override
   public void method19269() {
      if (!this.field27875.field5041 && this.field27874.method3328() && this.field27874.method3421() == this.field27875) {
         float var3 = Class9679.method37766(Entity.method3234(this.field27875.method3433()));
         if (!((double)var3 >= 0.01)) {
            this.field27856 = 0.0F;
         } else {
            this.field27856 = 0.0F + Class9679.method37777(var3, 0.0F, 1.0F) * 0.75F;
         }
      } else {
         this.method19271();
      }
   }
}