package mapped;

public class Class899 extends Class898 {
   public int field5139 = 1;

   public Class899(Class8992<? extends Class899> var1, Class1655 var2) {
      super(var1, var2);
   }

   public Class899(Class1655 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(Class8992.field41044, var2, var4, var6, var8, var10, var12, var1);
   }

   public Class899(Class1655 var1, Class880 var2, double var3, double var5, double var7) {
      super(Class8992.field41044, var2, var3, var5, var7, var1);
   }

   @Override
   public void method3464(Class8710 var1) {
      super.method3464(var1);
      if (!this.field5024.field9020) {
         boolean var4 = this.field5024.method6789().method17135(Class5462.field24224);
         this.field5024
            .method6756(
               (Entity)null,
               this.getPosX(),
               this.getPosY(),
               this.getPosZ(),
               (float)this.field5139,
               var4,
               !var4 ? Class2141.field14014 : Class2141.field14016
            );
         this.method2904();
      }
   }

   @Override
   public void method3465(Class8709 var1) {
      super.method3465(var1);
      if (!this.field5024.field9020) {
         Entity var4 = var1.method31416();
         Entity var5 = this.method3460();
         var4.method2741(Class8654.method31121(this, var5), 6.0F);
         if (var5 instanceof Class880) {
            this.method3399((Class880)var5, var4);
         }
      }
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      var1.method102("ExplosionPower", this.field5139);
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      if (var1.method119("ExplosionPower", 99)) {
         this.field5139 = var1.method122("ExplosionPower");
      }
   }
}