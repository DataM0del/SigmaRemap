package mapped;

import java.util.Optional;
import java.util.function.BiFunction;

public final class Class8785 implements Class8786 {
   private static String[] field39518;
   public final Class1655 field39519;
   public final BlockPos field39520;

   public Class8785(Class1655 var1, BlockPos var2) {
      this.field39519 = var1;
      this.field39520 = var2;
   }

   @Override
   public <T> Optional<T> method31713(BiFunction<Class1655, BlockPos, T> var1) {
      return Optional.<T>of((T)var1.apply(this.field39519, this.field39520));
   }
}