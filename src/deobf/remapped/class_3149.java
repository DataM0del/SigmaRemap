package remapped;

import java.util.EnumSet;
import java.util.Random;

public class class_3149 extends class_3599 {
   private static String[] field_15659;
   private final class_4612 field_15662;
   private final int field_15660;
   private BlockPos field_15661;

   public class_3149(class_4612 var1, int var2) {
      this.field_15662 = var1;
      this.field_15660 = var2;
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE));
   }

   @Override
   public boolean method_16795() {
      if (!this.field_15662.method_37151()) {
         if (!this.field_15662.world.method_29602()) {
            if (this.field_15662.method_26594().nextInt(this.field_15660) == 0) {
               class_6331 var3 = (class_6331)this.field_15662.world;
               BlockPos var4 = this.field_15662.method_37075();
               if (var3.method_28981(var4, 6)) {
                  Vector3d var5 = class_3425.method_15846(this.field_15662, 15, 7, var1 -> (double)(-var3.method_28956(class_6979.method_31921(var1))));
                  this.field_15661 = var5 != null ? new BlockPos(var5) : null;
                  return this.field_15661 != null;
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method_16799() {
      return this.field_15661 != null
         && !this.field_15662.method_26927().method_5591()
         && this.field_15662.method_26927().method_5603().equals(this.field_15661);
   }

   @Override
   public void method_16794() {
      if (this.field_15661 != null) {
         PathNavigator var3 = this.field_15662.method_26927();
         if (var3.method_5591() && !this.field_15661.method_12170(this.field_15662.method_37245(), 10.0)) {
            Vector3d var4 = Vector3d.method_6200(this.field_15661);
            Vector3d var5 = this.field_15662.method_37245();
            Vector3d var6 = var5.method_6194(var4);
            var4 = var6.method_6209(0.4).method_6215(var4);
            Vector3d var7 = var4.method_6194(var5).method_6213().method_6209(10.0).method_6215(var5);
            BlockPos var8 = new BlockPos(var7);
            var8 = this.field_15662.world.method_22563(class_3801.field_18590, var8);
            if (!var3.method_5595((double)var8.getX(), (double)var8.getY(), (double)var8.getZ(), 1.0)) {
               this.method_14544();
            }
         }
      }
   }

   private void method_14544() {
      Random var3 = this.field_15662.method_26594();
      BlockPos var4 = this.field_15662
         .world
         .method_22563(class_3801.field_18590, this.field_15662.method_37075().method_6104(-8 + var3.nextInt(16), 0, -8 + var3.nextInt(16)));
      this.field_15662.method_26927().method_5595((double)var4.getX(), (double)var4.getY(), (double)var4.getZ(), 1.0);
   }
}
