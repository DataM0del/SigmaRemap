package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;

public class Class5736 extends Class5715<ItemFrameEntity> {
   private static final Class1997 field25153 = new Class1997("item_frame", "map=false");
   private static final Class1997 field25154 = new Class1997("item_frame", "map=true");
   private final Minecraft field25155 = Minecraft.getInstance();
   private final ItemRenderer field25156;
   private static double field25157 = 4096.0;

   public Class5736(EntityRendererManager var1, ItemRenderer var2) {
      super(var1);
      this.field25156 = var2;
   }

   public void method17853(ItemFrameEntity var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      super.method17853(var1, var2, var3, var4, var5, var6);
      var4.push();
      Direction var9 = var1.method3386();
      Vector3d var10 = this.method17867(var1, var3);
      var4.translate(-var10.getX(), -var10.getY(), -var10.getZ());
      double var11 = 0.46875;
      var4.translate((double)var9.method539() * 0.46875, (double)var9.method540() * 0.46875, (double)var9.method541() * 0.46875);
      var4.rotate(Vector3f.field32898.rotationDegrees(var1.rotationPitch));
      var4.rotate(Vector3f.YP.rotationDegrees(180.0F - var1.rotationYaw));
      boolean var13 = var1.isInvisible();
      if (!var13) {
         BlockRendererDispatcher var14 = this.field25155.getBlockRendererDispatcher();
         ModelManager var15 = var14.getBlockModelShapes().getModelManager();
         Class1997 var16 = !(var1.method4090().getItem() instanceof Class3316) ? field25153 : field25154;
         var4.push();
         var4.translate(-0.5, -0.5, -0.5);
         var14.method812()
            .method24689(
               var4.getLast(),
               var5.method25597(Class8624.method30906()),
               (BlockState)null,
               var15.method1023(var16),
               1.0F,
               1.0F,
               1.0F,
               var6,
               Class213.field798
            );
         var4.pop();
      }

      ItemStack var19 = var1.method4090();
      if (!var19.isEmpty()) {
         boolean var20 = var19.getItem() instanceof Class3316;
         if (!var13) {
            var4.translate(0.0, 0.0, 0.4375);
         } else {
            var4.translate(0.0, 0.0, 0.5);
         }

         int var21 = !var20 ? var1.method4093() : var1.method4093() % 4 * 2;
         var4.rotate(Vector3f.field32902.rotationDegrees((float)var21 * 360.0F / 8.0F));
         if (!Class9299.method35085(Class9299.field42988, var1, this, var4, var5, var6)) {
            if (!var20) {
               var4.method35292(0.5F, 0.5F, 0.5F);
               if (this.method17917(var1)) {
                  this.field25156.method789(var19, Class2327.field15932, var6, Class213.field798, var4, var5);
               }
            } else {
               var4.rotate(Vector3f.field32902.rotationDegrees(180.0F));
               float var17 = 0.0078125F;
               var4.method35292(0.0078125F, 0.0078125F, 0.0078125F);
               var4.translate(-64.0, -64.0, 0.0);
               Class7529 var18 = Class9561.method37048(var19, var1.world);
               var4.translate(0.0, 0.0, -1.0);
               if (var18 != null) {
                  this.field25155.gameRenderer.method756().method593(var4, var5, var18, true, var6);
               }
            }
         }
      }

      var4.pop();
   }

   public Vector3d method17867(ItemFrameEntity var1, float var2) {
      return new Vector3d((double)((float)var1.method3386().method539() * 0.3F), -0.25, (double)((float)var1.method3386().method541() * 0.3F));
   }

   public ResourceLocation method17843(ItemFrameEntity var1) {
      return AtlasTexture.LOCATION_BLOCKS_TEXTURE;
   }

   public boolean method17852(ItemFrameEntity var1) {
      if (Minecraft.isGuiEnabled() && !var1.method4090().isEmpty() && var1.method4090().method32152() && this.field25097.field40019 == var1) {
         double var4 = this.field25097.method32228(var1);
         float var6 = !var1.isDiscrete() ? 64.0F : 32.0F;
         return var4 < (double)(var6 * var6);
      } else {
         return false;
      }
   }

   public void method17893(ItemFrameEntity var1, ITextComponent var2, MatrixStack var3, Class7733 var4, int var5) {
      super.method17893(var1, var1.method4090().method32149(), var3, var4, var5);
   }

   private boolean method17917(ItemFrameEntity var1) {
      if (! Shaders.field40609) {
         if (!Class7944.field34162) {
            Entity var4 = this.field25155.getRenderViewEntity();
            double var5 = var1.getDistanceNearest(var4.getPosX(), var4.getPosY(), var4.getPosZ());
            if (var5 > field25157) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public static void method17918() {
      Minecraft var2 = Minecraft.getInstance();
      double var3 = Class7944.method26833(var2.gameSettings.field44669, 1.0, 120.0);
      double var5 = Math.max(6.0 * (double)var2.getMainWindow().getHeight() / var3, 16.0);
      field25157 = var5 * var5;
   }
}
