package mapped;

import com.google.common.collect.Sets;

import javax.annotation.Nullable;
import java.util.Set;

public abstract class Class1043 extends Class1045 implements Class1059, Class1060 {
   private static final DataParameter<Integer> field5794 = EntityDataManager.<Integer>method35441(Class1043.class, Class7784.field33391);
   private PlayerEntity field5795;
   public Class46 field5796;
   private final Class927 field5797 = new Class927(8);

   public Class1043(EntityType<? extends Class1043> var1, World var2) {
      super(var1, var2);
      this.method4224(Class2163.field14195, 16.0F);
      this.method4224(Class2163.field14196, -1.0F);
   }

   @Override
   public Class5093 method4276(Class1659 var1, Class9755 var2, Class2202 var3, Class5093 var4, CompoundNBT var5) {
      if (var4 == null) {
         var4 = new Class5097(false);
      }

      return super.method4276(var1, var2, var3, (Class5093)var4, var5);
   }

   public int method4738() {
      return this.dataManager.<Integer>method35445(field5794);
   }

   public void method4739(int var1) {
      this.dataManager.method35446(field5794, var1);
   }

   @Override
   public int method4721() {
      return 0;
   }

   @Override
   public float method2957(Pose var1, EntitySize var2) {
      return !this.method3005() ? 1.62F : 0.81F;
   }

   @Override
   public void registerData() {
      super.registerData();
      this.dataManager.register(field5794, 0);
   }

   @Override
   public void method4683(PlayerEntity var1) {
      this.field5795 = var1;
   }

   @Nullable
   @Override
   public PlayerEntity method4740() {
      return this.field5795;
   }

   public boolean method4741() {
      return this.field5795 != null;
   }

   @Override
   public Class46 method4742() {
      if (this.field5796 == null) {
         this.field5796 = new Class46();
         this.method4713();
      }

      return this.field5796;
   }

   @Override
   public void method4743(Class46 var1) {
   }

   @Override
   public void method4744(int var1) {
   }

   @Override
   public void method4745(Class9346 var1) {
      var1.method35374();
      this.field5593 = -this.method4236();
      this.method4696(var1);
      if (this.field5795 instanceof ServerPlayerEntity) {
         CriteriaTriggers.field44483.method15134((ServerPlayerEntity)this.field5795, this, var1.method35368());
      }
   }

   public abstract void method4696(Class9346 var1);

   @Override
   public boolean method4746() {
      return true;
   }

   @Override
   public void method4747(ItemStack var1) {
      if (!this.world.isRemote && this.field5593 > -this.method4236() + 20) {
         this.field5593 = -this.method4236();
         this.method2863(this.method4749(!var1.isEmpty()), this.method3099(), this.method3100());
      }
   }

   @Override
   public Class9455 method4748() {
      return Sounds.field27195;
   }

   public Class9455 method4749(boolean var1) {
      return !var1 ? Sounds.field27193 : Sounds.field27195;
   }

   public void method4750() {
      this.method2863(Sounds.field27190, this.method3099(), this.method3100());
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      Class46 var4 = this.method4742();
      if (!var4.isEmpty()) {
         var1.put("Offers", var4.method166());
      }

      var1.put("Inventory", this.field5797.method3683());
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      if (var1.method119("Offers", 10)) {
         this.field5796 = new Class46(var1.getCompound("Offers"));
      }

      this.field5797.method3682(var1.method131("Inventory", 10));
   }

   @Nullable
   @Override
   public Entity method2745(ServerWorld var1) {
      this.method4684();
      return super.method2745(var1);
   }

   public void method4684() {
      this.method4683((PlayerEntity)null);
   }

   @Override
   public void method2737(Class8654 var1) {
      super.method2737(var1);
      this.method4684();
   }

   public void method4751(Class7436 var1) {
      for (int var4 = 0; var4 < 5; var4++) {
         double var5 = this.rand.nextGaussian() * 0.02;
         double var7 = this.rand.nextGaussian() * 0.02;
         double var9 = this.rand.nextGaussian() * 0.02;
         this.world.method6746(var1, this.method3438(1.0), this.method3441() + 1.0, this.method3445(1.0), var5, var7, var9);
      }
   }

   @Override
   public boolean method4295(PlayerEntity var1) {
      return false;
   }

   public Class927 method4752() {
      return this.field5797;
   }

   @Override
   public boolean method2963(int var1, ItemStack var2) {
      if (!super.method2963(var1, var2)) {
         int var5 = var1 - 300;
         if (var5 >= 0 && var5 < this.field5797.method3629()) {
            this.field5797.method3621(var5, var2);
            return true;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public World method4753() {
      return this.world;
   }

   public abstract void method4713();

   public void method4754(Class46 var1, Class5391[] var2, int var3) {
      Set<Integer> var6 = Sets.newHashSet();
      if (var2.length <= var3) {
         for (int var7 = 0; var7 < var2.length; var7++) {
            var6.add(var7);
         }
      } else {
         while (var6.size() < var3) {
            var6.add(this.rand.nextInt(var2.length));
         }
      }

      for (Integer var8 : var6) {
         Class5391 var9 = var2[var8];
         Class9346 var10 = var9.method16977(this, this.rand);
         if (var10 != null) {
            var1.add(var10);
         }
      }
   }

   @Override
   public Vector3d method2986(float var1) {
      float var4 = MathHelper.lerp(var1, this.field4966, this.field4965) * (float) (Math.PI / 180.0);
      Vector3d var5 = new Vector3d(0.0, this.getBoundingBox().method19677() - 1.0, 0.2);
      return this.method3288(var1).method11338(var5.method11351(-var4));
   }
}
