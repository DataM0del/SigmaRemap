package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

import java.util.Iterator;
import java.util.stream.Stream;

public class Jesus extends Module {
   public int field24015;
   public int field24016;
   public int field24017;

   public Jesus() {
      super(ModuleCategory.MOVEMENT, "Jesus", "Where's the scientific proof?");
      this.registerSetting(new ModeSetting("Mode", "Mode", 0, "Basic", "Dolphin").setModeAsPremium("Dolphin"));
      this.registerSetting(new BooleanSetting("Swim up", "Automatically swim up", true));
   }

   @Override
   public void onDisable() {
   }

   @EventTarget
   public void method16945(Class4398 var1) {
      if (this.isEnabled() && mc.world != null && !Class5258.method16421()) {
         if (mc.world.getBlockState(var1.method13902()).method23384() == Class8649.field38940
            || mc.world.getBlockState(var1.method13902()).method23384() == Class8649.field38941
            || mc.world.getBlockState(var1.method13902()).method23384() == Class8649.field38943) {
            if (!(
               (double)var1.method13902().getY()
                  >= mc.player.getPosY() - (double)(mc.player.getPosY() % 0.5 != 0.0 ? 0.0F : 0.5F)
            )) {
               if (!this.method16951(mc.player.boundingBox)) {
                  if (!mc.player.method3331()) {
                     if (!(mc.player.fallDistance > 10.0F)) {
                        BlockState var4 = mc.world.getBlockState(var1.method13902());
                        int var5 = var4.method23449().method23477();
                        float var6 = 0.0F;
                        if (var5 > 3) {
                           var6++;
                        }

                        if (mc.player.fallDistance > 10.0F) {
                           var6 -= 0.8F;
                        }

                        VoxelShape var7 = VoxelShapes.create(0.0, 0.0, 0.0, 1.0, (double)var6, 1.0);
                        var1.method13905(var7);
                     }
                  }
               }
            }
         }
      }
   }

   @EventTarget
   public void method16946(Class4399 var1) {
      if (this.isEnabled() && mc.world != null && var1.method13921() && mc.getCurrentServerData() != null) {
         if (method16953() && !this.method16951(mc.player.boundingBox)) {
            this.field24017++;
         } else {
            this.field24017 = 0;
         }

         if (method16953() && !this.method16951(mc.player.boundingBox)) {
            mc.player.field4999 = 0;
            var1.method13908(true);
            this.field24015++;
            if (this.field24015 % 2 == 0) {
               var1.method13912(var1.method13911() - 0.001);
            }
         } else {
            this.field24015 = !mc.player.onGround ? 1 : 0;
         }
      }
   }

   @EventTarget
   @LowerPriority
   public void method16947(Class4435 var1) {
      if (this.isEnabled() && mc.world != null && !Class5258.method16421()) {
         if (this.method16951(mc.player.boundingBox) && !mc.player.method3331()) {
            BlockState var4 = mc.world.getBlockState(mc.player.getPosition());
            if (var4 != null && !var4.method23449().method23474()) {
               double var5 = (double)var4.method23449().method23476();
               if (var5 > 0.4) {
                  if (this.getBooleanValueFromSetttingName("Swim up")) {
                     var1.method13995(0.13);
                  }

                  boolean var7 = this.method16951(mc.player.boundingBox.method19667(0.0, var1.method13994(), 0.0));
                  if (!var7) {
                     double var8 = (double)((int) mc.player.getPosY() + 1);
                     double var10 = var8 - mc.player.getPosY();
                     var1.method13995(var10);
                     mc.player.onGround = true;
                     this.field24015 = 1;
                  }
               }
            }
         } else {
            if (method16953() && var1.method13994() != -0.0784000015258789 && var1.method13994() != Class9567.method37080()) {
               var1.method13995(-0.078);
            }

            if (this.getStringSettingValueByName("Mode").equals("Dolphin")) {
               if (this.field24016 > 0) {
                  if (Class5628.method17730(mc.player, 0.001F)) {
                     this.field24016 = 0;
                  } else {
                     if (mc.player.method3331() || mc.player.collidedVertically) {
                        this.field24016 = 0;
                        return;
                     }

                     if (this.field24016 > 0) {
                        Class9567.method37088(var1, 0.25 + (double)Class9567.method37078() * 0.05);
                        this.field24016++;
                     }

                     double var14 = this.method16954((double)this.field24016);
                     if (var14 != -999.0) {
                        mc.player.field6120 = 0.0;
                        var1.method13995(var14);
                     }
                  }
               } else if (method16953() && this.field24015 % 2 == 0) {
                  this.field24016++;
                  double var12 = this.method16954((double)this.field24016);
                  Class9567.method37088(var1, 0.25);
                  if (var12 != -999.0) {
                     var1.method13995(var12);
                  }
               }
            }

            Class5628.method17725(var1.method13994());
         }
      }
   }

   @EventTarget
   public void method16948(Class4436 var1) {
      if (this.isEnabled() && mc.world != null && mc.getCurrentServerData() != null) {
         if (method16953()) {
            if (this.field24015 % 2 != 0) {
               var1.method13900(true);
            }

            var1.method14003(0.2);
         }
      }
   }

   @EventTarget
   public void method16949(Class4434 var1) {
      if (this.isEnabled() && !(var1.method13988() < 0.2)) {
         if (method16953()) {
            var1.method13900(true);
         }
      }
   }

   @Override
   public boolean method15988() {
      return this.isEnabled() && method16953() && !this.method16950();
   }

   public boolean method16950() {
      return Class9567.method37081();
   }

   public boolean method16951(AxisAlignedBB var1) {
      return this.method16952(var1, Class8649.field38941) || this.method16952(var1, Class8649.field38943);
   }

   public boolean method16952(AxisAlignedBB var1, Class8649 var2) {
      int var5 = MathHelper.floor(var1.field28449);
      int var6 = MathHelper.method37774(var1.field28452);
      int var7 = MathHelper.floor(var1.field28450);
      int var8 = MathHelper.method37774(var1.field28453);
      int var9 = MathHelper.floor(var1.field28451);
      int var10 = MathHelper.method37774(var1.field28454);
      Class116 var11 = Class116.method330(var2);
      return BlockPos.method8363(var5, var7, var9, var6 - 1, var8 - 1, var10 - 1).anyMatch(var1x -> var11.test(mc.world.getBlockState(var1x)));
   }

   public static boolean method16953() {
      AxisAlignedBB var2 = mc.player.boundingBox.method19667(0.0, -0.001, 0.0);
      Stream var3 = mc.world.method7055(mc.player, var2);
      Iterator var4 = var3.iterator();
      boolean var5 = true;
      if (var4.hasNext()) {
         while (var4.hasNext()) {
            VoxelShape var6 = (VoxelShape)var4.next();
            AxisAlignedBB var7 = var6.method19514();
            BlockPos var8 = new BlockPos(var7.method19685());
            Block var9 = mc.world.getBlockState(var8).getBlock();
            if (var9 != Blocks.WATER
               && var9 != Blocks.LAVA
               && var9 != Blocks.AIR
               && var9 != Blocks.SEAGRASS
               && var9 != Blocks.TALL_SEAGRASS) {
               var5 = false;
            }
         }

         return var5;
      } else {
         return false;
      }
   }

   public double method16954(double var1) {
      var1--;
      double[] var5 = new double[]{
         0.499,
         0.484,
         0.468,
         0.436,
         0.404,
         0.372,
         0.34,
         0.308,
         0.276,
         0.244,
         0.212,
         0.18,
         0.166,
         0.166,
         0.156,
         0.123,
         0.135,
         0.111,
         0.086,
         0.098,
         0.073,
         0.048,
         0.06,
         0.036,
         0.0106,
         0.015,
         0.0,
         0.0,
         0.0,
         -0.013,
         -0.045,
         -0.077,
         -0.109
      };
      return var1 < (double)var5.length && var1 >= 0.0 ? var5[(int)var1] : -999.0;
   }
}
