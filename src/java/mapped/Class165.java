package mapped;

import java.util.function.Predicate;

public class Class165 implements Predicate<Entity> {
   private static String[] field532;
   private final Class8848 field533;

   public Class165(Class8848 var1) {
      this.field533 = var1;
   }

   public boolean test(Entity var1) {
      if (var1.method3066()) {
         if (var1 instanceof Class880) {
            Class880 var4 = (Class880)var1;
            return var4.method2980(this.field533);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}