package mapped;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;

public final class Class8197 implements Class8196 {
   public final String field35223;

   public Class8197(String var1) {
      this.field35223 = var1;
   }

   @Override
   public Class7151 method28503(CommandContext<Class6619> var1) throws CommandSyntaxException {
      BlockPos var4 = Class6849.method20827(var1, this.field35223 + "Pos");
      Class944 var5 = ((Class6619)var1.getSource()).method20172().method6759(var4);
      if (var5 != null) {
         return new Class7152(var5, var4);
      } else {
         throw Class7152.method22317().create();
      }
   }

   @Override
   public ArgumentBuilder<Class6619, ?> method28504(
      ArgumentBuilder<Class6619, ?> var1, Function<ArgumentBuilder<Class6619, ?>, ArgumentBuilder<Class6619, ?>> var2
   ) {
      return var1.then(
         Class6099.method18839("block").then((ArgumentBuilder)var2.apply(Class6099.method18840(this.field35223 + "Pos", Class6849.method20826())))
      );
   }
}