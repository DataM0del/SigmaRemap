package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public class Class2926 extends Class2898<Class4712> {
   public Class2926(Codec<Class4712> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, Class5646 var2, Random var3, BlockPos var4, Class4712 var5) {
      int var8 = 0;
      int var9 = var1.method6736(Class101.field298, var4.method8304(), var4.method8306());
      BlockPos var10 = new BlockPos(var4.method8304(), var9, var4.method8306());
      if (var1.method6738(var10).method23448(Blocks.WATER)) {
         Class7380 var11 = Blocks.field36961.method11579();
         Class7380 var12 = Blocks.field36962.method11579();
         int var13 = 1 + var3.nextInt(10);

         for (int var14 = 0; var14 <= var13; var14++) {
            if (var1.method6738(var10).method23448(Blocks.WATER)
               && var1.method6738(var10.method8311()).method23448(Blocks.WATER)
               && var12.method23443(var1, var10)) {
               if (var14 != var13) {
                  var1.method6725(var10, var12, 2);
               } else {
                  var1.method6725(var10, var11.method23465(Class3451.field19267, Integer.valueOf(var3.nextInt(4) + 20)), 2);
                  var8++;
               }
            } else if (var14 > 0) {
               BlockPos var15 = var10.method8313();
               if (var11.method23443(var1, var15) && !var1.method6738(var15.method8313()).method23448(Blocks.field36961)) {
                  var1.method6725(var15, var11.method23465(Class3451.field19267, Integer.valueOf(var3.nextInt(4) + 20)), 2);
                  var8++;
               }
               break;
            }

            var10 = var10.method8311();
         }
      }

      return var8 > 0;
   }
}