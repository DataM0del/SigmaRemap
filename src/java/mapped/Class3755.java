package mapped;

import com.google.common.collect.ImmutableMap;

import java.util.function.BiPredicate;

public class Class3755<E extends Class880, T extends Entity> extends Class3676<E> {
   private static String[] field19911;
   private final int field19912;
   private final BiPredicate<E, Entity> field19913;

   public Class3755(int var1, BiPredicate<E, Entity> var2) {
      super(ImmutableMap.of(Class8830.field39830, Class2217.field14486));
      this.field19912 = var1;
      this.field19913 = var2;
   }

   @Override
   public boolean method12508(Class1657 var1, E var2) {
      Entity var5 = var2.method3421();
      Entity var6 = var2.method2992().<Entity>method21410(Class8830.field39830).orElse((Entity)null);
      if (var5 == null && var6 == null) {
         return false;
      } else {
         Entity var7 = var5 != null ? var5 : var6;
         return !this.method12724((E)var2, var7) || this.field19913.test((E)var2, var7);
      }
   }

   private boolean method12724(E var1, Entity var2) {
      return var2.method3066() && var2.method3213(var1, (double)this.field19912) && var2.field5024 == var1.field5024;
   }

   @Override
   public void method12502(Class1657 var1, E var2, long var3) {
      var2.method2759();
      var2.method2992().method21405(Class8830.field39830);
   }
}