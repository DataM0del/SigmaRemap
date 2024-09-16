package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public abstract class Class3468 extends Block {
   public static final VoxelShape field19313 = Block.method11539(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   public static final VoxelShape field19314 = Block.method11539(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   public static final AxisAlignedBB field19315 = new AxisAlignedBB(0.125, 0.0, 0.125, 0.875, 0.25, 0.875);

   public Class3468(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return this.method12158(var1) <= 0 ? field19314 : field19313;
   }

   public int method12152() {
      return 20;
   }

   @Override
   public boolean method11564() {
      return true;
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var2 == Direction.DOWN && !var1.method23443(var4, var5)
         ? Blocks.AIR.method11579()
         : super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method11492(BlockState var1, IWorldReader var2, BlockPos var3) {
      BlockPos var6 = var3.down();
      return method11547(var2, var6) || method11548(var2, var6, Direction.field673);
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      int var7 = this.method12158(var1);
      if (var7 > 0) {
         this.method12153(var2, var3, var1, var7);
      }
   }

   @Override
   public void method11523(BlockState var1, World var2, BlockPos var3, Entity var4) {
      if (!var2.isRemote) {
         int var7 = this.method12158(var1);
         if (var7 == 0) {
            this.method12153(var2, var3, var1, var7);
         }
      }
   }

   public void method12153(World var1, BlockPos var2, BlockState var3, int var4) {
      int var7 = this.method12157(var1, var2);
      boolean var8 = var4 > 0;
      boolean var9 = var7 > 0;
      if (var4 != var7) {
         BlockState var10 = this.method12159(var3, var7);
         var1.setBlockState(var2, var10, 2);
         this.method12156(var1, var2);
         var1.markBlockRangeForRenderUpdate(var2, var3, var10);
      }

      if (!var9 && var8) {
         this.method12155(var1, var2);
      } else if (var9 && !var8) {
         this.method12154(var1, var2);
      }

      if (var9) {
         var1.method6860().method20726(new BlockPos(var2), this, this.method12152());
      }
   }

   public abstract void method12154(Class1660 var1, BlockPos var2);

   public abstract void method12155(Class1660 var1, BlockPos var2);

   @Override
   public void method11513(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var5 && !var1.isIn(var4.getBlock())) {
         if (this.method12158(var1) > 0) {
            this.method12156(var2, var3);
         }

         super.method11513(var1, var2, var3, var4, var5);
      }
   }

   public void method12156(World var1, BlockPos var2) {
      var1.notifyNeighborsOfStateChange(var2, this);
      var1.notifyNeighborsOfStateChange(var2.down(), this);
   }

   @Override
   public int method11514(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      return this.method12158(var1);
   }

   @Override
   public int method11515(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      return var4 != Direction.field673 ? 0 : this.method12158(var1);
   }

   @Override
   public boolean method11516(BlockState var1) {
      return true;
   }

   @Override
   public Class2315 method11689(BlockState var1) {
      return Class2315.field15863;
   }

   public abstract int method12157(World var1, BlockPos var2);

   public abstract int method12158(BlockState var1);

   public abstract BlockState method12159(BlockState var1, int var2);
}
