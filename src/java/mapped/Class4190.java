package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.List;
import java.util.Random;

public class Class4190 extends Class4188 {
   private final Direction field20481;
   private final boolean field20482;

   public Class4190(TemplateManager var1, CompoundNBT var2) {
      super(Class7792.field33426, var2);
      this.field20482 = var2.getBoolean("tf");
      this.field20481 = Direction.byHorizontalIndex(var2.getInt("D"));
   }

   @Override
   public void method12897(CompoundNBT var1) {
      super.method12897(var1);
      var1.putBoolean("tf", this.field20482);
      var1.putInt("D", this.field20481.getHorizontalIndex());
   }

   public Class4190(int var1, MutableBoundingBox var2, Direction var3, Class102 var4) {
      super(Class7792.field33426, var1, var4);
      this.field20481 = var3;
      this.field20444 = var2;
      this.field20482 = var2.method38399() > 3;
   }

   public static MutableBoundingBox method12970(List<Class4178> var0, Random var1, int var2, int var3, int var4, Direction var5) {
      MutableBoundingBox var8 = new MutableBoundingBox(var2, var3, var4, var2, var3 + 3 - 1, var4);
      if (var1.nextInt(4) == 0) {
         var8.field45682 += 4;
      }

      switch (Class7441.field32015[var5.ordinal()]) {
         case 1:
         default:
            var8.field45678 = var2 - 1;
            var8.field45681 = var2 + 3;
            var8.field45680 = var4 - 4;
            break;
         case 2:
            var8.field45678 = var2 - 1;
            var8.field45681 = var2 + 3;
            var8.field45683 = var4 + 3 + 1;
            break;
         case 3:
            var8.field45678 = var2 - 4;
            var8.field45680 = var4 - 1;
            var8.field45683 = var4 + 3;
            break;
         case 4:
            var8.field45681 = var2 + 3 + 1;
            var8.field45680 = var4 - 1;
            var8.field45683 = var4 + 3;
      }

      return Class4178.method12918(var0, var8) != null ? null : var8;
   }

   @Override
   public void method12894(Class4178 var1, List<Class4178> var2, Random var3) {
      int var6 = this.method12916();
      switch (Class7441.field32015[this.field20481.ordinal()]) {
         case 1:
         default:
            Class6883.method20959(
               var1, var2, var3, this.field20444.field45678 + 1, this.field20444.field45679, this.field20444.field45680 - 1, Direction.NORTH, var6
            );
            Class6883.method20959(
               var1, var2, var3, this.field20444.field45678 - 1, this.field20444.field45679, this.field20444.field45680 + 1, Direction.WEST, var6
            );
            Class6883.method20959(
               var1, var2, var3, this.field20444.field45681 + 1, this.field20444.field45679, this.field20444.field45680 + 1, Direction.EAST, var6
            );
            break;
         case 2:
            Class6883.method20959(
               var1, var2, var3, this.field20444.field45678 + 1, this.field20444.field45679, this.field20444.field45683 + 1, Direction.SOUTH, var6
            );
            Class6883.method20959(
               var1, var2, var3, this.field20444.field45678 - 1, this.field20444.field45679, this.field20444.field45680 + 1, Direction.WEST, var6
            );
            Class6883.method20959(
               var1, var2, var3, this.field20444.field45681 + 1, this.field20444.field45679, this.field20444.field45680 + 1, Direction.EAST, var6
            );
            break;
         case 3:
            Class6883.method20959(
               var1, var2, var3, this.field20444.field45678 + 1, this.field20444.field45679, this.field20444.field45680 - 1, Direction.NORTH, var6
            );
            Class6883.method20959(
               var1, var2, var3, this.field20444.field45678 + 1, this.field20444.field45679, this.field20444.field45683 + 1, Direction.SOUTH, var6
            );
            Class6883.method20959(
               var1, var2, var3, this.field20444.field45678 - 1, this.field20444.field45679, this.field20444.field45680 + 1, Direction.WEST, var6
            );
            break;
         case 4:
            Class6883.method20959(
               var1, var2, var3, this.field20444.field45678 + 1, this.field20444.field45679, this.field20444.field45680 - 1, Direction.NORTH, var6
            );
            Class6883.method20959(
               var1, var2, var3, this.field20444.field45678 + 1, this.field20444.field45679, this.field20444.field45683 + 1, Direction.SOUTH, var6
            );
            Class6883.method20959(
               var1, var2, var3, this.field20444.field45681 + 1, this.field20444.field45679, this.field20444.field45680 + 1, Direction.EAST, var6
            );
      }

      if (this.field20482) {
         if (var3.nextBoolean()) {
            Class6883.method20959(
               var1, var2, var3, this.field20444.field45678 + 1, this.field20444.field45679 + 3 + 1, this.field20444.field45680 - 1, Direction.NORTH, var6
            );
         }

         if (var3.nextBoolean()) {
            Class6883.method20959(
               var1, var2, var3, this.field20444.field45678 - 1, this.field20444.field45679 + 3 + 1, this.field20444.field45680 + 1, Direction.WEST, var6
            );
         }

         if (var3.nextBoolean()) {
            Class6883.method20959(
               var1, var2, var3, this.field20444.field45681 + 1, this.field20444.field45679 + 3 + 1, this.field20444.field45680 + 1, Direction.EAST, var6
            );
         }

         if (var3.nextBoolean()) {
            Class6883.method20959(
               var1, var2, var3, this.field20444.field45678 + 1, this.field20444.field45679 + 3 + 1, this.field20444.field45683 + 1, Direction.SOUTH, var6
            );
         }
      }
   }

   @Override
   public boolean method12896(ISeedReader var1, StructureManager var2, ChunkGenerator var3, Random var4, MutableBoundingBox var5, ChunkPos var6, BlockPos var7) {
      if (this.method12919(var1, var5)) {
         return false;
      } else {
         BlockState var10 = this.method12967();
         if (!this.field20482) {
            this.method12927(
               var1,
               var5,
               this.field20444.field45678 + 1,
               this.field20444.field45679,
               this.field20444.field45680,
               this.field20444.field45681 - 1,
               this.field20444.field45682,
               this.field20444.field45683,
               field20443,
               field20443,
               false
            );
            this.method12927(
               var1,
               var5,
               this.field20444.field45678,
               this.field20444.field45679,
               this.field20444.field45680 + 1,
               this.field20444.field45681,
               this.field20444.field45682,
               this.field20444.field45683 - 1,
               field20443,
               field20443,
               false
            );
         } else {
            this.method12927(
               var1,
               var5,
               this.field20444.field45678 + 1,
               this.field20444.field45679,
               this.field20444.field45680,
               this.field20444.field45681 - 1,
               this.field20444.field45679 + 3 - 1,
               this.field20444.field45683,
               field20443,
               field20443,
               false
            );
            this.method12927(
               var1,
               var5,
               this.field20444.field45678,
               this.field20444.field45679,
               this.field20444.field45680 + 1,
               this.field20444.field45681,
               this.field20444.field45679 + 3 - 1,
               this.field20444.field45683 - 1,
               field20443,
               field20443,
               false
            );
            this.method12927(
               var1,
               var5,
               this.field20444.field45678 + 1,
               this.field20444.field45682 - 2,
               this.field20444.field45680,
               this.field20444.field45681 - 1,
               this.field20444.field45682,
               this.field20444.field45683,
               field20443,
               field20443,
               false
            );
            this.method12927(
               var1,
               var5,
               this.field20444.field45678,
               this.field20444.field45682 - 2,
               this.field20444.field45680 + 1,
               this.field20444.field45681,
               this.field20444.field45682,
               this.field20444.field45683 - 1,
               field20443,
               field20443,
               false
            );
            this.method12927(
               var1,
               var5,
               this.field20444.field45678 + 1,
               this.field20444.field45679 + 3,
               this.field20444.field45680 + 1,
               this.field20444.field45681 - 1,
               this.field20444.field45679 + 3,
               this.field20444.field45683 - 1,
               field20443,
               field20443,
               false
            );
         }

         this.method12971(var1, var5, this.field20444.field45678 + 1, this.field20444.field45679, this.field20444.field45680 + 1, this.field20444.field45682);
         this.method12971(var1, var5, this.field20444.field45678 + 1, this.field20444.field45679, this.field20444.field45683 - 1, this.field20444.field45682);
         this.method12971(var1, var5, this.field20444.field45681 - 1, this.field20444.field45679, this.field20444.field45680 + 1, this.field20444.field45682);
         this.method12971(var1, var5, this.field20444.field45681 - 1, this.field20444.field45679, this.field20444.field45683 - 1, this.field20444.field45682);

         for (int var11 = this.field20444.field45678; var11 <= this.field20444.field45681; var11++) {
            for (int var12 = this.field20444.field45680; var12 <= this.field20444.field45683; var12++) {
               if (this.method12924(var1, var11, this.field20444.field45679 - 1, var12, var5).isAir()
                  && this.method12925(var1, var11, this.field20444.field45679 - 1, var12, var5)) {
                  this.method12923(var1, var10, var11, this.field20444.field45679 - 1, var12, var5);
               }
            }
         }

         return true;
      }
   }

   private void method12971(ISeedReader var1, MutableBoundingBox var2, int var3, int var4, int var5, int var6) {
      if (!this.method12924(var1, var3, var6 + 1, var5, var2).isAir()) {
         this.method12927(var1, var2, var3, var4, var5, var3, var6, var5, this.method12967(), field20443, false);
      }
   }
}
