package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public class Class2923 extends Class2898<Class4710> {
   public Class2923(Codec<Class4710> var1) {
      super(var1);
   }

   public boolean method11213(Class1658 var1, Class5646 var2, Random var3, BlockPos var4, Class4710 var5) {
      if (var4.getY() >= 5) {
         int var8 = 2 + var3.nextInt(2);
         int var9 = 2 + var3.nextInt(2);

         for (BlockPos var11 : BlockPos.method8359(var4.method8336(-var8, 0, -var9), var4.method8336(var8, 1, var9))) {
            int var12 = var4.method8304() - var11.method8304();
            int var13 = var4.method8306() - var11.method8306();
            if (!((float)(var12 * var12 + var13 * var13) <= var3.nextFloat() * 10.0F - var3.nextFloat() * 6.0F)) {
               if ((double)var3.nextFloat() < 0.031) {
                  this.method11256(var1, var11, var3, var5);
               }
            } else {
               this.method11256(var1, var11, var3, var5);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean method11255(Class1660 var1, BlockPos var2, Random var3) {
      BlockPos var6 = var2.method8313();
      Class7380 var7 = var1.method6738(var6);
      return !var7.method23448(Blocks.field36885) ? var7.method23454(var1, var6, Direction.field673) : var3.nextBoolean();
   }

   private void method11256(Class1660 var1, BlockPos var2, Random var3, Class4710 var4) {
      if (var1.method7007(var2) && this.method11255(var1, var2, var3)) {
         var1.method6725(var2, var4.field22343.method20424(var3, var2), 4);
      }
   }
}