package mapped;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class1691 implements Class1658 {
   private static final Logger field9200 = LogManager.getLogger();
   private final List<Class1670> field9201;
   private final int field9202;
   private final int field9203;
   private final int field9204;
   private final ServerWorld field9205;
   private final long field9206;
   private final Class6612 field9207;
   private final Random field9208;
   private final Class9535 field9209;
   private final Class6802<Block> field9210 = new Class6803<Block>(var1x -> this.method7011(var1x).method7089());
   private final Class6802<Class7631> field9211 = new Class6803<Class7631>(var1x -> this.method7011(var1x).method7090());
   private final Class6668 field9212;
   private final Class7481 field9213;
   private final Class7481 field9214;
   private final Class7480 field9215;

   public Class1691(ServerWorld var1, List<Class1670> var2) {
      int var5 = MathHelper.method37769(Math.sqrt((double)var2.size()));
      if (var5 * var5 == var2.size()) {
         Class7481 var6 = ((Class1670)var2.get(var2.size() / 2)).method7072();
         this.field9201 = var2;
         this.field9202 = var6.field32174;
         this.field9203 = var6.field32175;
         this.field9204 = var5;
         this.field9205 = var1;
         this.field9206 = var1.method6967();
         this.field9207 = var1.method6788();
         this.field9208 = var1.method6814();
         this.field9209 = var1.method6812();
         this.field9212 = new Class6668(this, Class6668.method20321(this.field9206), var1.method6812().method36886());
         this.field9213 = ((Class1670)var2.get(0)).method7072();
         this.field9214 = ((Class1670)var2.get(var2.size() - 1)).method7072();
         this.field9215 = var1.method6893().method24339(this);
      } else {
         throw (IllegalStateException) Util.method38516(new IllegalStateException("Cache size is not a square."));
      }
   }

   public int method7241() {
      return this.field9202;
   }

   public int method7242() {
      return this.field9203;
   }

   @Override
   public Class1670 method6824(int var1, int var2) {
      return this.method7012(var1, var2, Class9176.field42133);
   }

   @Nullable
   @Override
   public Class1670 method6724(int var1, int var2, Class9176 var3, boolean var4) {
      Class1670 var7;
      if (!this.method6843(var1, var2)) {
         var7 = null;
      } else {
         int var8 = var1 - this.field9213.field32174;
         int var9 = var2 - this.field9213.field32175;
         var7 = this.field9201.get(var8 + var9 * this.field9204);
         if (var7.method7080().method34306(var3)) {
            return var7;
         }
      }

      if (var4) {
         field9200.error("Requested chunk : {} {}", var1, var2);
         field9200.error(
            "Region bounds : {} {} | {} {}", this.field9213.field32174, this.field9213.field32175, this.field9214.field32174, this.field9214.field32175
         );
         if (var7 == null) {
            throw (RuntimeException) Util.method38516(
               new RuntimeException(String.format("We are asking a region for a chunk out of bound | %s %s", var1, var2))
            );
         } else {
            throw (RuntimeException) Util.method38516(
               new RuntimeException(String.format("Chunk is not of correct status. Expecting %s, got %s | %s %s", var3, var7.method7080(), var1, var2))
            );
         }
      } else {
         return null;
      }
   }

   @Override
   public boolean method6843(int var1, int var2) {
      return var1 >= this.field9213.field32174 && var1 <= this.field9214.field32174 && var2 >= this.field9213.field32175 && var2 <= this.field9214.field32175;
   }

   @Override
   public Class7380 method6738(BlockPos var1) {
      return this.method6824(var1.method8304() >> 4, var1.method8306() >> 4).method6738(var1);
   }

   @Override
   public Class7379 method6739(BlockPos var1) {
      return this.method7011(var1).method6739(var1);
   }

   @Nullable
   @Override
   public PlayerEntity method7184(double var1, double var3, double var5, double var7, Predicate<Entity> var9) {
      return null;
   }

   @Override
   public int method6808() {
      return 0;
   }

   @Override
   public Class6668 method6822() {
      return this.field9212;
   }

   @Override
   public Class8907 method6871(int var1, int var2, int var3) {
      return this.field9205.method6871(var1, var2, var3);
   }

   @Override
   public float method6877(Direction var1, boolean var2) {
      return 1.0F;
   }

   @Override
   public Class196 method6737() {
      return this.field9205.method6737();
   }

   @Override
   public boolean method6729(BlockPos var1, boolean var2, Entity var3, int var4) {
      Class7380 var7 = this.method6738(var1);
      if (!var7.method23393()) {
         if (var2) {
            Class944 var8 = !var7.method23383().method11998() ? null : this.method6759(var1);
            Block.method11556(var7, this.field9205, var1, var8, var3, ItemStack.EMPTY);
         }

         return this.method6726(var1, Blocks.AIR.method11579(), 3, var4);
      } else {
         return false;
      }
   }

   @Nullable
   @Override
   public Class944 method6759(BlockPos var1) {
      Class1670 var4 = this.method7011(var1);
      Class944 var5 = var4.method6759(var1);
      if (var5 == null) {
         Class39 var6 = var4.method7086(var1);
         Class7380 var7 = var4.method6738(var1);
         if (var6 != null) {
            if (!"DUMMY".equals(var6.method126("id"))) {
               var5 = Class944.method3772(var7, var6);
            } else {
               Block var8 = var7.method23383();
               if (!(var8 instanceof Class3245)) {
                  return null;
               }

               var5 = ((Class3245)var8).method11646(this.field9205);
            }

            if (var5 != null) {
               var4.method7062(var1, var5);
               return var5;
            }
         }

         if (var7.method23383() instanceof Class3245) {
            field9200.warn("Tried to access a block entity before it was created. {}", var1);
         }

         return null;
      } else {
         return var5;
      }
   }

   @Override
   public boolean method6726(BlockPos var1, Class7380 var2, int var3, int var4) {
      Class1670 var7 = this.method7011(var1);
      Class7380 var8 = var7.method7061(var1, var2, false);
      if (var8 != null) {
         this.field9205.method6727(var1, var8, var2);
      }

      Block var9 = var2.method23383();
      if (!var9.method11998()) {
         if (var8 != null && var8.method23383().method11998()) {
            var7.method7081(var1);
         }
      } else if (var7.method7080().method34303() != Class2076.field13525) {
         Class39 var10 = new Class39();
         var10.method102("x", var1.method8304());
         var10.method102("y", var1.getY());
         var10.method102("z", var1.method8306());
         var10.method109("id", "DUMMY");
         var7.method7085(var10);
      } else {
         var7.method7062(var1, ((Class3245)var9).method11646(this));
      }

      if (var2.method23444(this, var1)) {
         this.method7243(var1);
      }

      return true;
   }

   private void method7243(BlockPos var1) {
      this.method7011(var1).method7082(var1);
   }

   @Override
   public boolean method6916(Entity var1) {
      int var4 = MathHelper.method37769(var1.getPosX() / 16.0);
      int var5 = MathHelper.method37769(var1.getPosZ() / 16.0);
      this.method6824(var4, var5).method7063(var1);
      return true;
   }

   @Override
   public boolean method6728(BlockPos var1, boolean var2) {
      return this.method6725(var1, Blocks.AIR.method11579(), 3);
   }

   @Override
   public Class7522 method6810() {
      return this.field9205.method6810();
   }

   @Override
   public boolean method6714() {
      return false;
   }

   @Deprecated
   @Override
   public ServerWorld method6970() {
      return this.field9205;
   }

   @Override
   public Class8904 method6867() {
      return this.field9205.method6867();
   }

   @Override
   public Class6612 method6788() {
      return this.field9207;
   }

   @Override
   public Class9755 method6807(BlockPos var1) {
      if (this.method6843(var1.method8304() >> 4, var1.method8306() >> 4)) {
         return new Class9755(this.field9205.method6997(), this.field9205.method6784(), 0L, this.field9205.method7000());
      } else {
         throw new RuntimeException("We are asking a region for a chunk out of bound");
      }
   }

   @Override
   public Class1702 method6883() {
      return this.field9205.method6883();
   }

   @Override
   public long method6967() {
      return this.field9206;
   }

   @Override
   public Class6802<Block> method6860() {
      return this.field9210;
   }

   @Override
   public Class6802<Class7631> method6861() {
      return this.field9211;
   }

   @Override
   public int method6776() {
      return this.field9205.method6776();
   }

   @Override
   public Random method6814() {
      return this.field9208;
   }

   @Override
   public int method6736(Class101 var1, int var2, int var3) {
      return this.method6824(var2 >> 4, var3 >> 4).method7071(var1, var2 & 15, var3 & 15) + 1;
   }

   @Override
   public void method6742(PlayerEntity var1, BlockPos var2, Class9455 var3, Class2266 var4, float var5, float var6) {
   }

   @Override
   public void method6746(Class7436 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
   }

   @Override
   public void method6869(PlayerEntity var1, int var2, BlockPos var3, int var4) {
   }

   @Override
   public Class9535 method6812() {
      return this.field9209;
   }

   @Override
   public boolean method6815(BlockPos var1, Predicate<Class7380> var2) {
      return var2.test(this.method6738(var1));
   }

   @Override
   public <T extends Entity> List<T> method6772(Class<? extends T> var1, Class6488 var2, Predicate<? super T> var3) {
      return Collections.<T>emptyList();
   }

   @Override
   public List<Entity> method6770(Entity var1, Class6488 var2, Predicate<? super Entity> var3) {
      return Collections.<Entity>emptyList();
   }

   @Override
   public List<PlayerEntity> method6870() {
      return Collections.<PlayerEntity>emptyList();
   }

   @Override
   public Stream<? extends Class5444<?>> method6969(Class2002 var1, Class2961<?> var2) {
      return this.field9215.method24340(var1, var2);
   }
}
