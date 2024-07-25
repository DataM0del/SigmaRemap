package remapped;

import java.util.UUID;

public class IronGolemEntity extends class_608 implements class_6250 {
   public static final class_7821<Byte> field_41629 = class_8073.<Byte>method_36641(IronGolemEntity.class, class_2734.field_13361);
   private int field_41632;
   private int field_41631;
   private static final class_4376 field_41633 = class_5804.method_26295(20, 39);
   private int field_41635;
   private UUID field_41630;

   public IronGolemEntity(EntityType<? extends IronGolemEntity> var1, World var2) {
      super(var1, var2);
      this.field_41733 = 1.0F;
   }

   @Override
   public void registerGoals() {
      this.goalSelector.addGoal(1, new class_9037(this, 1.0, true));
      this.goalSelector.addGoal(2, new class_5331(this, 0.9, 32.0F));
      this.goalSelector.addGoal(2, new class_7000(this, 0.6, false));
      this.goalSelector.addGoal(4, new class_7253(this, 0.6));
      this.goalSelector.addGoal(5, new class_6405(this));
      this.goalSelector.addGoal(7, new LookAtGoal(this, PlayerEntity.class, 6.0F));
      this.goalSelector.addGoal(8, new class_9691(this));
      this.targetSelector.addGoal(1, new class_4337(this));
      this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
      this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<PlayerEntity>(this, PlayerEntity.class, 10, true, false, this::method_28534));
      this.targetSelector
         .addGoal(
            3, new NearestAttackableTargetGoal<MobEntity>(this, MobEntity.class, 5, false, false, var0 -> var0 instanceof class_1869 && !(var0 instanceof class_9490))
         );
      this.targetSelector.addGoal(4, new class_6474<IronGolemEntity>(this, false));
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_41629, (byte)0);
   }

   public static MutableAttribute method_36980() {
      return MobEntity.method_26846()
         .createMutableAttribute(Attributes.MAX_HEALTH, 100.0)
         .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.25)
         .createMutableAttribute(Attributes.KNOCKBACK_RESISTANCE, 1.0)
         .createMutableAttribute(Attributes.ATTACK_DAMAGE, 15.0);
   }

   @Override
   public int method_26536(int var1) {
      return var1;
   }

   @Override
   public void method_26596(Entity var1) {
      if (var1 instanceof class_1869 && !(var1 instanceof class_9490) && this.method_26594().nextInt(20) == 0) {
         this.method_26860((LivingEntity)var1);
      }

      super.method_26596(var1);
   }

   @Override
   public void livingTick() {
      super.livingTick();
      if (this.field_41632 > 0) {
         this.field_41632--;
      }

      if (this.field_41631 > 0) {
         this.field_41631--;
      }

      if (method_37266(this.method_37098()) > 2.5000003E-7F && this.field_41717.nextInt(5) == 0) {
         int var3 = MathHelper.floor(this.getPosX());
         int var4 = MathHelper.floor(this.method_37309() - 0.2F);
         int var5 = MathHelper.floor(this.getPosZ());
         class_2522 var6 = this.world.method_28262(new BlockPos(var3, var4, var5));
         if (!var6.method_8345()) {
            this.world
               .method_43361(
                  new class_7110(class_3090.field_15325, var6),
                  this.getPosX() + ((double)this.field_41717.nextFloat() - 0.5) * (double)this.method_37086(),
                  this.method_37309() + 0.1,
                  this.getPosZ() + ((double)this.field_41717.nextFloat() - 0.5) * (double)this.method_37086(),
                  4.0 * ((double)this.field_41717.nextFloat() - 0.5),
                  0.5,
                  ((double)this.field_41717.nextFloat() - 0.5) * 4.0
               );
         }
      }

      if (!this.world.field_33055) {
         this.method_28530((class_6331)this.world, true);
      }
   }

   @Override
   public boolean method_26610(EntityType<?> var1) {
      if (this.method_36974() && var1 == EntityType.field_34300) {
         return false;
      } else {
         return var1 != EntityType.field_34210 ? super.method_26610(var1) : false;
      }
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putBoolean("PlayerCreated", this.method_36974());
      this.method_28528(var1);
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      this.method_36979(var1.getBoolean("PlayerCreated"));
      this.method_28533((class_6331)this.world, var1);
   }

   @Override
   public void method_28529() {
      this.method_28532(field_41633.method_20387(this.field_41717));
   }

   @Override
   public void method_28532(int var1) {
      this.field_41635 = var1;
   }

   @Override
   public int method_28539() {
      return this.field_41635;
   }

   @Override
   public void method_28531(UUID var1) {
      this.field_41630 = var1;
   }

   @Override
   public UUID method_28535() {
      return this.field_41630;
   }

   private float method_36975() {
      return (float)this.method_26575(Attributes.ATTACK_DAMAGE);
   }

   @Override
   public boolean method_26442(Entity var1) {
      this.field_41632 = 10;
      this.world.method_29587(this, (byte)4);
      float var4 = this.method_36975();
      float var5 = (int)var4 <= 0 ? var4 : var4 / 2.0F + (float)this.field_41717.nextInt((int)var4);
      boolean var6 = var1.attackEntityFrom(DamageSource.method_28345(this), var5);
      if (var6) {
         var1.method_37215(var1.method_37098().method_6214(0.0, 0.4F, 0.0));
         this.method_37096(this, var1);
      }

      this.method_37155(SoundEvents.field_2670, 1.0F, 1.0F);
      return var6;
   }

   @Override
   public boolean attackEntityFrom(DamageSource var1, float var2) {
      class_440 var5 = this.method_36976();
      boolean var6 = super.attackEntityFrom(var1, var2);
      if (var6 && this.method_36976() != var5) {
         this.method_37155(SoundEvents.field_2564, 1.0F, 1.0F);
      }

      return var6;
   }

   public class_440 method_36976() {
      return class_440.method_2138(this.method_26551() / this.method_26465());
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 != 4) {
         if (var1 != 11) {
            if (var1 != 34) {
               super.method_37336(var1);
            } else {
               this.field_41631 = 0;
            }
         } else {
            this.field_41631 = 400;
         }
      } else {
         this.field_41632 = 10;
         this.method_37155(SoundEvents.field_2670, 1.0F, 1.0F);
      }
   }

   public int method_36977() {
      return this.field_41632;
   }

   public void method_36973(boolean var1) {
      if (!var1) {
         this.field_41631 = 0;
         this.world.method_29587(this, (byte)34);
      } else {
         this.field_41631 = 400;
         this.world.method_29587(this, (byte)11);
      }
   }

   @Override
   public SoundEvent method_26541(DamageSource var1) {
      return SoundEvents.field_2006;
   }

   @Override
   public SoundEvent method_26599() {
      return SoundEvents.field_2858;
   }

   @Override
   public class_6910 method_26857(PlayerEntity var1, Hand var2) {
      ItemStack var5 = var1.method_26617(var2);
      class_2451 var6 = var5.method_27960();
      if (var6 == class_4897.field_25021) {
         float var7 = this.method_26551();
         this.heal(25.0F);
         if (this.method_26551() != var7) {
            float var8 = 1.0F + (this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.2F;
            this.method_37155(SoundEvents.field_1936, 1.0F, var8);
            if (!var1.playerAbilities.isCreativeMode) {
               var5.method_27970(1);
            }

            return class_6910.method_31659(this.world.field_33055);
         } else {
            return class_6910.field_35521;
         }
      } else {
         return class_6910.field_35521;
      }
   }

   @Override
   public void method_37207(BlockPos var1, class_2522 var2) {
      this.method_37155(SoundEvents.field_2483, 1.0F, 1.0F);
   }

   public int method_36978() {
      return this.field_41631;
   }

   public boolean method_36974() {
      return (this.field_41735.<Byte>method_36640(field_41629) & 1) != 0;
   }

   public void method_36979(boolean var1) {
      byte var4 = this.field_41735.<Byte>method_36640(field_41629);
      if (!var1) {
         this.field_41735.method_36633(field_41629, (byte)(var4 & -2));
      } else {
         this.field_41735.method_36633(field_41629, (byte)(var4 | 1));
      }
   }

   @Override
   public void method_26452(DamageSource var1) {
      super.method_26452(var1);
   }

   @Override
   public boolean method_26855(class_4924 var1) {
      BlockPos var4 = this.method_37075();
      BlockPos var5 = var4.method_6100();
      class_2522 var6 = var1.method_28262(var5);
      if (!var6.method_8337(var1, var5, this)) {
         return false;
      } else {
         for (int var7 = 1; var7 < 3; var7++) {
            BlockPos var8 = var4.method_6082(var7);
            class_2522 var9 = var1.method_28262(var8);
            if (!class_3815.method_17772(var1, var8, var9, var9.method_8364(), EntityType.field_34298)) {
               return false;
            }
         }

         return class_3815.method_17772(var1, var4, var1.method_28262(var4), class_8532.field_43673.method_10710(), EntityType.field_34298)
            && var1.method_6677(this);
      }
   }

   @Override
   public class_1343 method_37323() {
      return new class_1343(0.0, (double)(0.875F * this.method_37277()), (double)(this.method_37086() * 0.4F));
   }
}