package mapped;

public class Class3327 extends Class3257 {
   private static String[] field18835;

   public Class3327(Class5643 var1) {
      super(var1);
   }

   @Override
   public Class2274 method11716(Class8848 var1, PlayerEntity var2, Class880 var3, Class79 var4) {
      if (var1.method32152() && !(var3 instanceof PlayerEntity)) {
         if (!var2.field5024.field9020 && var3.method3066()) {
            var3.method3379(var1.method32149());
            if (var3 instanceof Class1006) {
               ((Class1006)var3).method4278();
            }

            var1.method32182(1);
         }

         return Class2274.method9002(var2.field5024.field9020);
      } else {
         return Class2274.field14820;
      }
   }
}