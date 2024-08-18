package remapped;

import javax.annotation.Nullable;

public class class_223 extends class_608 implements class_9897, class_2354 {
   private static final class_7821<Byte> field_730 = class_8073.<Byte>method_36641(class_223.class, class_2734.field_13361);

   public class_223(EntityType<? extends class_223> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void registerGoals() {
      this.goalSelector.addGoal(1, new class_1837(this, 1.25, 20, 10.0F));
      this.goalSelector.addGoal(2, new WaterAvoidingRandomWalkingGoal(this, 1.0, 1.0000001E-5F));
      this.goalSelector.addGoal(3, new LookAtGoal(this, PlayerEntity.class, 6.0F));
      this.goalSelector.addGoal(4, new class_9691(this));
      this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<MobEntity>(this, MobEntity.class, 10, true, false, var0 -> var0 instanceof class_1869));
   }

   public static MutableAttribute method_946() {
      return MobEntity.method_26846().createMutableAttribute(Attributes.MAX_HEALTH, 4.0).createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.2F);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_730, (byte)16);
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putBoolean("Pumpkin", this.method_947());
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      if (var1.method_25938("Pumpkin")) {
         this.method_948(var1.getBoolean("Pumpkin"));
      }
   }

   @Override
   public boolean method_26537() {
      return true;
   }

   @Override
   public void livingTick() {
      super.livingTick();
      if (!this.world.field_33055) {
         int var3 = MathHelper.floor(this.getPosX());
         int var4 = MathHelper.floor(this.method_37309());
         int var5 = MathHelper.floor(this.getPosZ());
         if (this.world.method_22561(new BlockPos(var3, 0, var5)).method_28865(new BlockPos(var3, var4, var5)) > 1.0F) {
            this.attackEntityFrom(DamageSource.field_31665, 1.0F);
         }

         if (!this.world.getGameRules().getBoolean(GameRules.MOB_GRIEFING)) {
            return;
         }

         class_2522 var6 = class_4783.field_23552.method_29260();

         for (int var7 = 0; var7 < 4; var7++) {
            var3 = MathHelper.floor(this.getPosX() + (double)((float)(var7 % 2 * 2 - 1) * 0.25F));
            var4 = MathHelper.floor(this.method_37309());
            var5 = MathHelper.floor(this.getPosZ() + (double)((float)(var7 / 2 % 2 * 2 - 1) * 0.25F));
            BlockPos var8 = new BlockPos(var3, var4, var5);
            if (this.world.method_28262(var8).method_8345()
               && this.world.method_22561(var8).method_28865(var8) < 0.8F
               && var6.method_8309(this.world, var8)) {
               this.world.method_29594(var8, var6);
            }
         }
      }
   }

   @Override
   public void method_10805(LivingEntity var1, float var2) {
      class_6889 var5 = new class_6889(this.world, this);
      double var6 = var1.method_37388() - 1.1F;
      double var8 = var1.getPosX() - this.getPosX();
      double var10 = var6 - var5.method_37309();
      double var12 = var1.getPosZ() - this.getPosZ();
      float var14 = MathHelper.sqrt(var8 * var8 + var12 * var12) * 0.2F;
      var5.method_26161(var8, var10 + (double)var14, var12, 1.6F, 12.0F);
      this.method_37155(SoundEvents.field_2565, 1.0F, 0.4F / (this.method_26594().nextFloat() * 0.4F + 0.8F));
      this.world.method_7509(var5);
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return 1.7F;
   }

   @Override
   public class_6910 method_26857(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.method_26617(var2);
      if (var5.method_27960() == class_4897.field_24853 && this.method_45584()) {
         this.method_45583(class_562.field_3335);
         if (!this.world.field_33055) {
            var5.method_28003(1, var1, var1x -> var1x.method_26447(var2));
         }

         return class_6910.method_31659(this.world.field_33055);
      } else {
         return class_6910.field_35521;
      }
   }

   @Override
   public void method_45583(class_562 var1) {
      this.world.method_29540((PlayerEntity)null, this, SoundEvents.field_2661, var1, 1.0F, 1.0F);
      if (!this.world.method_22567()) {
         this.method_948(false);
         this.method_37311(new ItemStack(class_4897.field_25172), 1.7F);
      }
   }

   @Override
   public boolean method_45584() {
      return this.isAlive() && this.method_947();
   }

   public boolean method_947() {
      return (this.field_41735.<Byte>method_36640(field_730) & 16) != 0;
   }

   public void method_948(boolean var1) {
      byte var4 = this.field_41735.<Byte>method_36640(field_730);
      if (!var1) {
         this.field_41735.method_36633(field_730, (byte)(var4 & -17));
      } else {
         this.field_41735.method_36633(field_730, (byte)(var4 | 16));
      }
   }

   @Nullable
   @Override
   public SoundEvent method_26918() {
      return SoundEvents.field_2561;
   }

   @Nullable
   @Override
   public SoundEvent method_26541(DamageSource var1) {
      return SoundEvents.field_2763;
   }

   @Nullable
   @Override
   public SoundEvent method_26599() {
      return SoundEvents.field_2804;
   }

   @Override
   public Vector3d method_37323() {
      return new Vector3d(0.0, (double)(0.75F * this.method_37277()), (double)(this.method_37086() * 0.4F));
   }
}
