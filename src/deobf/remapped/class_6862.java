package remapped;

import javax.annotation.Nullable;

public class class_6862 extends AbstractVillagerEntity {
   private BlockPos field_35357;
   private int field_35359;

   public class_6862(EntityType<? extends class_6862> var1, World var2) {
      super(var1, var2);
      this.forceSpawn = true;
   }

   @Override
   public void registerGoals() {
      this.goalSelector.addGoal(0, new SwimGoal(this));
      this.goalSelector
         .addGoal(
            0,
            new class_7018<class_6862>(
               this,
               class_9541.method_43999(new ItemStack(class_4897.field_25157), class_3697.field_18126),
               SoundEvents.field_2449,
               var1 -> this.world.method_29544() && !var1.method_37109()
            )
         );
      this.goalSelector
         .addGoal(
            0,
            new class_7018<class_6862>(
               this, new ItemStack(class_4897.field_24579), SoundEvents.field_2362, var1 -> this.world.method_29602() && var1.method_37109()
            )
         );
      this.goalSelector.addGoal(1, new class_7713(this));
      this.goalSelector.addGoal(1, new class_6837<class_2811>(this, class_2811.class, 8.0F, 0.5, 0.5));
      this.goalSelector.addGoal(1, new class_6837<class_1799>(this, class_1799.class, 12.0F, 0.5, 0.5));
      this.goalSelector.addGoal(1, new class_6837<class_298>(this, class_298.class, 8.0F, 0.5, 0.5));
      this.goalSelector.addGoal(1, new class_6837<class_2519>(this, class_2519.class, 8.0F, 0.5, 0.5));
      this.goalSelector.addGoal(1, new class_6837<class_4134>(this, class_4134.class, 15.0F, 0.5, 0.5));
      this.goalSelector.addGoal(1, new class_6837<class_2547>(this, class_2547.class, 12.0F, 0.5, 0.5));
      this.goalSelector.addGoal(1, new class_6837<class_3895>(this, class_3895.class, 10.0F, 0.5, 0.5));
      this.goalSelector.addGoal(1, new class_518(this, 0.5));
      this.goalSelector.addGoal(1, new class_9595(this));
      this.goalSelector.addGoal(2, new class_8180(this, this, 2.0, 0.35));
      this.goalSelector.addGoal(4, new class_3537(this, 0.35));
      this.goalSelector.addGoal(8, new WaterAvoidingRandomWalkingGoal(this, 0.35));
      this.goalSelector.addGoal(9, new class_7699(this, PlayerEntity.class, 3.0F, 1.0F));
      this.goalSelector.addGoal(10, new LookAtGoal(this, MobEntity.class, 8.0F));
   }

   @Nullable
   @Override
   public class_1899 method_8638(class_6331 var1, class_1899 var2) {
      return null;
   }

   @Override
   public boolean method_982() {
      return false;
   }

   @Override
   public class_6910 method_26857(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.method_26617(var2);
      if (var5.method_27960() != class_4897.field_25034 && this.isAlive() && !this.method_2024() && !this.method_26449()) {
         if (var2 == Hand.MAIN_HAND) {
            var1.method_3209(class_6234.field_31910);
         }

         if (!this.method_974().isEmpty()) {
            if (!this.world.field_33055) {
               this.method_975(var1);
               this.method_977(var1, this.method_19839(), 1);
            }

            return class_6910.method_31659(this.world.field_33055);
         } else {
            return class_6910.method_31659(this.world.field_33055);
         }
      } else {
         return super.method_26857(var1, var2);
      }
   }

   @Override
   public void method_2016() {
      class_4904[] var3 = (class_4904[])class_9469.field_48294.get(1);
      class_4904[] var4 = (class_4904[])class_9469.field_48294.get(2);
      if (var3 != null && var4 != null) {
         class_2795 var5 = this.method_974();
         this.method_2021(var5, var3, 5);
         int var6 = this.field_41717.nextInt(var4.length);
         class_4904 var7 = var4[var6];
         class_8014 var8 = var7.method_22451(this, this.field_41717);
         if (var8 != null) {
            var5.add(var8);
         }
      }
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("DespawnDelay", this.field_35359);
      if (this.field_35357 != null) {
         var1.put("WanderTarget", class_4338.method_20190(this.field_35357));
      }
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      if (var1.contains("DespawnDelay", 99)) {
         this.field_35359 = var1.method_25947("DespawnDelay");
      }

      if (var1.method_25938("WanderTarget")) {
         this.field_35357 = class_4338.method_20189(var1.getCompound("WanderTarget"));
      }

      this.method_8635(Math.max(0, this.method_8634()));
   }

   @Override
   public boolean method_26911(double var1) {
      return false;
   }

   @Override
   public void method_2023(class_8014 var1) {
      if (var1.method_36374()) {
         int var4 = 3 + this.field_41717.nextInt(4);
         this.world.method_7509(new class_5614(this.world, this.getPosX(), this.method_37309() + 0.5, this.getPosZ(), var4));
      }
   }

   @Override
   public SoundEvent method_26918() {
      return !this.method_2024() ? SoundEvents.field_2462 : SoundEvents.field_2431;
   }

   @Override
   public SoundEvent method_26541(DamageSource var1) {
      return SoundEvents.field_2822;
   }

   @Override
   public SoundEvent method_26599() {
      return SoundEvents.field_2420;
   }

   @Override
   public SoundEvent method_26566(ItemStack var1) {
      class_2451 var4 = var1.method_27960();
      return var4 != class_4897.field_24579 ? SoundEvents.field_2699 : SoundEvents.field_1966;
   }

   @Override
   public SoundEvent method_2018(boolean var1) {
      return !var1 ? SoundEvents.field_2255 : SoundEvents.field_2879;
   }

   @Override
   public SoundEvent method_976() {
      return SoundEvents.field_2879;
   }

   public void method_31481(int var1) {
      this.field_35359 = var1;
   }

   public int method_31487() {
      return this.field_35359;
   }

   @Override
   public void livingTick() {
      super.livingTick();
      if (!this.world.field_33055) {
         this.method_31485();
      }
   }

   private void method_31485() {
      if (this.field_35359 > 0 && !this.method_2024() && --this.field_35359 == 0) {
         this.method_37204();
      }
   }

   public void method_31484(BlockPos var1) {
      this.field_35357 = var1;
   }

   @Nullable
   private BlockPos method_31479() {
      return this.field_35357;
   }
}
