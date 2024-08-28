package mapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Class7574 {
   private static final Logger field32515 = LogManager.getLogger();
   private int field32516 = 20;
   private final List<Class6693> field32517 = Lists.newArrayList();
   private Class6693 field32518 = new Class6693();
   private double field32519;
   private double field32520;
   private int field32521 = 200;
   private int field32522 = 800;
   private int field32523 = 4;
   private Entity field32524;
   private int field32525 = 6;
   private int field32526 = 16;
   private int field32527 = 4;

   @Nullable
   private ResourceLocation method24789() {
      String var3 = this.field32518.method20414().method126("id");

      try {
         return Class9001.method33256(var3) ? null : new ResourceLocation(var3);
      } catch (Class2496 var6) {
         BlockPos var5 = this.method24787();
         field32515.warn(
            "Invalid entity id '{}' at spawner {}:[{},{},{}]",
            var3,
            this.method24786().method6813().method31399(),
            var5.method8304(),
            var5.getY(),
            var5.method8306()
         );
         return null;
      }
   }

   public void method24790(Class8992<?> var1) {
      this.field32518.method20414().method109("id", Class2348.field16074.method9181(var1).toString());
   }

   private boolean method24791() {
      BlockPos var3 = this.method24787();
      return this.method24786()
         .method7187((double)var3.method8304() + 0.5, (double)var3.getY() + 0.5, (double)var3.method8306() + 0.5, (double)this.field32526);
   }

   public void method24792() {
      if (this.method24791()) {
         Class1655 var3 = this.method24786();
         BlockPos var4 = this.method24787();
         if (var3 instanceof Class1657) {
            if (this.field32516 == -1) {
               this.method24793();
            }

            if (this.field32516 > 0) {
               this.field32516--;
               return;
            }

            boolean var5 = false;

            for (int var6 = 0; var6 < this.field32523; var6++) {
               Class39 var13 = this.field32518.method20414();
               Optional var14 = Class8992.method33222(var13);
               if (!var14.isPresent()) {
                  this.method24793();
                  return;
               }

               Class41 var15 = var13.method131("Pos", 6);
               int var16 = var15.size();
               double var17 = var16 < 1
                  ? (double)var4.method8304() + (var3.field9016.nextDouble() - var3.field9016.nextDouble()) * (double)this.field32527 + 0.5
                  : var15.method158(0);
               double var19 = var16 < 2 ? (double)(var4.getY() + var3.field9016.nextInt(3) - 1) : var15.method158(1);
               double var21 = var16 < 3
                  ? (double)var4.method8306() + (var3.field9016.nextDouble() - var3.field9016.nextDouble()) * (double)this.field32527 + 0.5
                  : var15.method158(2);
               if (var3.method7051(((Class8992)var14.get()).method33219(var17, var19, var21))) {
                  Class1657 var23 = (Class1657)var3;
                  if (Class6914.method21122((Class8992)var14.get(), var23, Class2202.field14393, new BlockPos(var17, var19, var21), var3.method6814())) {
                     Entity var24 = Class8992.method33223(var13, var3, var6x -> {
                        var6x.method3273(var17, var19, var21, var6x.field5031, var6x.field5032);
                        return var6x;
                     });
                     if (var24 == null) {
                        this.method24793();
                        return;
                     }

                     int var25 = var3.method7182(
                           var24.getClass(),
                           new Class6488(
                                 (double)var4.method8304(),
                                 (double)var4.getY(),
                                 (double)var4.method8306(),
                                 (double)(var4.method8304() + 1),
                                 (double)(var4.getY() + 1),
                                 (double)(var4.method8306() + 1)
                              )
                              .method19664((double)this.field32527)
                        )
                        .size();
                     if (var25 >= this.field32525) {
                        this.method24793();
                        return;
                     }

                     var24.method3273(var24.getPosX(), var24.getPosY(), var24.getPosZ(), var3.field9016.nextFloat() * 360.0F, 0.0F);
                     if (var24 instanceof Class1006) {
                        Class1006 var26 = (Class1006)var24;
                        if (!var26.method4265(var3, Class2202.field14393) || !var26.method4266(var3)) {
                           continue;
                        }

                        if (this.field32518.method20414().method98() == 1 && this.field32518.method20414().method119("id", 8)) {
                           ((Class1006)var24).method4276(var23, var3.method6807(var24.method3432()), Class2202.field14393, (Class5093)null, (Class39)null);
                        }
                     }

                     if (!var23.method6928(var24)) {
                        this.method24793();
                        return;
                     }

                     var3.method6999(2004, var4, 0);
                     if (var24 instanceof Class1006) {
                        ((Class1006)var24).method4239();
                     }

                     var5 = true;
                  }
               }
            }

            if (var5) {
               this.method24793();
            }
         } else {
            double var7 = (double)var4.method8304() + var3.field9016.nextDouble();
            double var9 = (double)var4.getY() + var3.field9016.nextDouble();
            double var11 = (double)var4.method8306() + var3.field9016.nextDouble();
            var3.method6746(Class7940.field34092, var7, var9, var11, 0.0, 0.0, 0.0);
            var3.method6746(Class7940.field34074, var7, var9, var11, 0.0, 0.0, 0.0);
            if (this.field32516 > 0) {
               this.field32516--;
            }

            this.field32520 = this.field32519;
            this.field32519 = (this.field32519 + (double)(1000.0F / ((float)this.field32516 + 200.0F))) % 360.0;
         }
      } else {
         this.field32520 = this.field32519;
      }
   }

   private void method24793() {
      if (this.field32522 > this.field32521) {
         int var3 = this.field32522 - this.field32521;
         this.field32516 = this.field32521 + this.method24786().field9016.nextInt(var3);
      } else {
         this.field32516 = this.field32521;
      }

      if (!this.field32517.isEmpty()) {
         this.method24788(Class8879.<Class6693>method32314(this.method24786().field9016, this.field32517));
      }

      this.method24785(1);
   }

   public void method24794(Class39 var1) {
      this.field32516 = var1.method121("Delay");
      this.field32517.clear();
      if (var1.method119("SpawnPotentials", 9)) {
         Class41 var4 = var1.method131("SpawnPotentials", 10);

         for (int var5 = 0; var5 < var4.size(); var5++) {
            this.field32517.add(new Class6693(var4.method153(var5)));
         }
      }

      if (!var1.method119("SpawnData", 10)) {
         if (!this.field32517.isEmpty()) {
            this.method24788(Class8879.<Class6693>method32314(this.method24786().field9016, this.field32517));
         }
      } else {
         this.method24788(new Class6693(1, var1.method130("SpawnData")));
      }

      if (var1.method119("MinSpawnDelay", 99)) {
         this.field32521 = var1.method121("MinSpawnDelay");
         this.field32522 = var1.method121("MaxSpawnDelay");
         this.field32523 = var1.method121("SpawnCount");
      }

      if (var1.method119("MaxNearbyEntities", 99)) {
         this.field32525 = var1.method121("MaxNearbyEntities");
         this.field32526 = var1.method121("RequiredPlayerRange");
      }

      if (var1.method119("SpawnRange", 99)) {
         this.field32527 = var1.method121("SpawnRange");
      }

      if (this.method24786() != null) {
         this.field32524 = null;
      }
   }

   public Class39 method24795(Class39 var1) {
      ResourceLocation var4 = this.method24789();
      if (var4 == null) {
         return var1;
      } else {
         var1.method101("Delay", (short)this.field32516);
         var1.method101("MinSpawnDelay", (short)this.field32521);
         var1.method101("MaxSpawnDelay", (short)this.field32522);
         var1.method101("SpawnCount", (short)this.field32523);
         var1.method101("MaxNearbyEntities", (short)this.field32525);
         var1.method101("RequiredPlayerRange", (short)this.field32526);
         var1.method101("SpawnRange", (short)this.field32527);
         var1.method99("SpawnData", this.field32518.method20414().method79());
         Class41 var5 = new Class41();
         if (!this.field32517.isEmpty()) {
            for (Class6693 var7 : this.field32517) {
               var5.add(var7.method20413());
            }
         } else {
            var5.add(this.field32518.method20413());
         }

         var1.method99("SpawnPotentials", var5);
         return var1;
      }
   }

   @Nullable
   public Entity method24796() {
      if (this.field32524 == null) {
         this.field32524 = Class8992.method33223(this.field32518.method20414(), this.method24786(), Function.<Entity>identity());
         if (this.field32518.method20414().method98() == 1 && this.field32518.method20414().method119("id", 8) && !(this.field32524 instanceof Class1006)) {
         }
      }

      return this.field32524;
   }

   public boolean method24797(int var1) {
      if (var1 == 1 && this.method24786().field9020) {
         this.field32516 = this.field32521;
         return true;
      } else {
         return false;
      }
   }

   public void method24788(Class6693 var1) {
      this.field32518 = var1;
   }

   public abstract void method24785(int var1);

   public abstract Class1655 method24786();

   public abstract BlockPos method24787();

   public double method24798() {
      return this.field32519;
   }

   public double method24799() {
      return this.field32520;
   }
}