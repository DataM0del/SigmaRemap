package remapped;

import java.util.EnumSet;
import java.util.function.Predicate;

public class NearestAttackableTargetGoal<T extends LivingEntity> extends class_956 {
   private static String[] field_20143;
   public final Class<T> field_20142;
   public final int field_20145;
   public LivingEntity field_20146;
   public class_4931 field_20144;

   public NearestAttackableTargetGoal(MobEntity var1, Class<T> var2, boolean var3) {
      this(var1, var2, var3, false);
   }

   public NearestAttackableTargetGoal(MobEntity var1, Class<T> var2, boolean var3, boolean var4) {
      this(var1, var2, 10, var3, var4, (Predicate<LivingEntity>)null);
   }

   public NearestAttackableTargetGoal(MobEntity var1, Class<T> var2, int var3, boolean var4, boolean var5, Predicate<LivingEntity> var6) {
      super(var1, var4, var5);
      this.field_20142 = var2;
      this.field_20145 = var3;
      this.method_16800(EnumSet.<Flag>of(Flag.TARGET));
      this.field_20144 = new class_4931().method_22607(this.method_4211()).method_22606(var6);
   }

   @Override
   public boolean method_16795() {
      if (this.field_20145 > 0 && this.field_4915.method_26594().nextInt(this.field_20145) != 0) {
         return false;
      } else {
         this.method_19213();
         return this.field_20146 != null;
      }
   }

   public Box method_19212(double var1) {
      return this.field_4915.getBoundingBox().method_18899(var1, 4.0, var1);
   }

   public void method_19213() {
      if (this.field_20142 != PlayerEntity.class && this.field_20142 != class_9359.class) {
         this.field_20146 = this.field_4915
            .world
            .<LivingEntity>method_25872(
               this.field_20142,
               this.field_20144,
               this.field_4915,
               this.field_4915.getPosX(),
               this.field_4915.method_37388(),
               this.field_4915.getPosZ(),
               this.method_19212(this.method_4211())
            );
      } else {
         this.field_20146 = this.field_4915
            .world
            .method_25860(this.field_20144, this.field_4915, this.field_4915.getPosX(), this.field_4915.method_37388(), this.field_4915.getPosZ());
      }
   }

   @Override
   public void method_16796() {
      this.field_4915.method_26860(this.field_20146);
      super.method_16796();
   }

   public void method_19214(LivingEntity var1) {
      this.field_20146 = var1;
   }
}