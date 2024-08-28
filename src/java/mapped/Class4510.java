package mapped;

import java.util.OptionalDouble;

public abstract class Class4510 {
   public final String field21734;
   private final Runnable field21735;
   private final Runnable field21736;
   public static final Class4525 field21737 = new Class4525("no_transparency", () -> RenderSystem.disableBlend(), () -> {
   });
   public static final Class4525 field21738 = new Class4525("additive_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.method27834(Class2339.field15990, Class1981.field12927);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.method27938();
   });
   public static final Class4525 field21739 = new Class4525("lightning_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.method27834(Class2339.field15997, Class1981.field12927);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.method27938();
   });
   public static final Class4525 field21740 = new Class4525("glint_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.method27836(Class2339.field15999, Class1981.field12927, Class2339.field16000, Class1981.field12927);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.method27938();
   });
   public static final Class4525 field21741 = new Class4525("crumbling_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.method27836(Class2339.field15989, Class1981.field12935, Class2339.field15990, Class1981.field12936);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.method27938();
   });
   public static final Class4525 field21742 = new Class4525("translucent_transparency", () -> {
      RenderSystem.enableBlend();
      RenderSystem.method27836(Class2339.field15997, Class1981.field12932, Class2339.field15990, Class1981.field12932);
   }, () -> {
      RenderSystem.disableBlend();
      RenderSystem.method27938();
   });
   public static final Class4511 field21743 = new Class4511(0.0F);
   public static final Class4511 field21744 = new Class4511(0.003921569F);
   public static final Class4511 field21745 = new Class4511(0.5F);
   public static final Class4511 field21746 = new Class4511(0.1F);
   public static final Class4522 field21747 = new Class4522(false);
   public static final Class4522 field21748 = new Class4522(true);
   public static final Class4518 field21749 = new Class4518(Class289.field1102, false, true);
   public static final Class4518 field21750 = new Class4518(Class289.field1102, false, false);
   public static final Class4518 field21751 = new Class4518();
   public static final Class4513 field21752 = new Class4513("default_texturing", () -> {
   }, () -> {
   });
   public static final Class4513 field21753 = new Class4513("outline_texturing", () -> RenderSystem.method27924(), () -> RenderSystem.method27925());
   public static final Class4513 field21754 = new Class4513("glint_texturing", () -> method14233(8.0F), () -> {
      RenderSystem.method27878(5890);
      RenderSystem.popMatrix();
      RenderSystem.method27878(5888);
   });
   public static final Class4513 field21755 = new Class4513("entity_glint_texturing", () -> method14233(0.16F), () -> {
      RenderSystem.method27878(5890);
      RenderSystem.popMatrix();
      RenderSystem.method27878(5888);
   });
   public static final Class4506 field21756 = new Class4506(true);
   public static final Class4506 field21757 = new Class4506(false);
   public static final Class4509 field21758 = new Class4509(true);
   public static final Class4509 field21759 = new Class4509(false);
   public static final Class4508 field21760 = new Class4508(true);
   public static final Class4508 field21761 = new Class4508(false);
   public static final Class4507 field21762 = new Class4507(true);
   public static final Class4507 field21763 = new Class4507(false);
   public static final Class4517 field21764 = new Class4517("always", 519);
   public static final Class4517 field21765 = new Class4517("==", 514);
   public static final Class4517 field21766 = new Class4517("<=", 515);
   public static final Class4523 field21767 = new Class4523(true, true);
   public static final Class4523 field21768 = new Class4523(true, false);
   public static final Class4523 field21769 = new Class4523(false, true);
   public static final Class4524 field21770 = new Class4524("no_layering", () -> {
   }, () -> {
   });
   public static final Class4524 field21771 = new Class4524("polygon_offset_layering", () -> {
      RenderSystem.method27856(-1.0F, -10.0F);
      RenderSystem.method27852();
   }, () -> {
      RenderSystem.method27856(0.0F, 0.0F);
      RenderSystem.method27853();
   });
   public static final Class4524 field21772 = new Class4524("view_offset_z_layering", () -> {
      RenderSystem.pushMatrix();
      RenderSystem.scalef(0.99975586F, 0.99975586F, 0.99975586F);
   }, RenderSystem::popMatrix);
   public static final Class4512 field21773 = new Class4512("no_fog", () -> {
   }, () -> {
   });
   public static final Class4512 field21774 = new Class4512("fog", () -> {
      Class8915.method32588();
      RenderSystem.method27840();
   }, () -> RenderSystem.method27841());
   public static final Class4512 field21775 = new Class4512("black_fog", () -> {
      RenderSystem.method27847(2918, 0.0F, 0.0F, 0.0F, 1.0F);
      RenderSystem.method27840();
   }, () -> {
      Class8915.method32588();
      RenderSystem.method27841();
   });
   public static final Class4519 field21776 = new Class4519("main_target", () -> {
   }, () -> {
   });
   public static final Class4519 field21777 = new Class4519(
      "outline_target", () -> Minecraft.getInstance().field1287.method946().method29112(false), () -> Minecraft.getInstance().method1464().method29112(false)
   );
   public static final Class4519 field21778 = new Class4519("translucent_target", () -> {
      if (Minecraft.method1517()) {
         Minecraft.getInstance().field1287.method947().method29112(false);
      }
   }, () -> {
      if (Minecraft.method1517()) {
         Minecraft.getInstance().method1464().method29112(false);
      }
   });
   public static final Class4519 field21779 = new Class4519("particles_target", () -> {
      if (Minecraft.method1517()) {
         Minecraft.getInstance().field1287.method949().method29112(false);
      }
   }, () -> {
      if (Minecraft.method1517()) {
         Minecraft.getInstance().method1464().method29112(false);
      }
   });
   public static final Class4519 field21780 = new Class4519("weather_target", () -> {
      if (Minecraft.method1517()) {
         Minecraft.getInstance().field1287.method950().method29112(false);
      }
   }, () -> {
      if (Minecraft.method1517()) {
         Minecraft.getInstance().method1464().method29112(false);
      }
   });
   public static final Class4519 field21781 = new Class4519("clouds_target", () -> {
      if (Minecraft.method1517()) {
         Minecraft.getInstance().field1287.method951().method29112(false);
      }
   }, () -> {
      if (Minecraft.method1517()) {
         Minecraft.getInstance().method1464().method29112(false);
      }
   });
   public static final Class4519 field21782 = new Class4519("item_entity_target", () -> {
      if (Minecraft.method1517()) {
         Minecraft.getInstance().field1287.method948().method29112(false);
      }
   }, () -> {
      if (Minecraft.method1517()) {
         Minecraft.getInstance().method1464().method29112(false);
      }
   });
   public static final Class4516 field21783 = new Class4516(OptionalDouble.of(1.0));

   public Class4510(String var1, Runnable var2, Runnable var3) {
      this.field21734 = var1;
      this.field21735 = var2;
      this.field21736 = var3;
   }

   public void method14231() {
      this.field21735.run();
   }

   public void method14232() {
      this.field21736.run();
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class4510 var4 = (Class4510)var1;
            return this.field21734.equals(var4.field21734);
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field21734.hashCode();
   }

   @Override
   public String toString() {
      return this.field21734;
   }

   private static void method14233(float var0) {
      RenderSystem.method27878(5890);
      RenderSystem.pushMatrix();
      RenderSystem.method27879();
      long var3 = Util.method38487() * 8L;
      float var5 = (float)(var3 % 110000L) / 110000.0F;
      float var6 = (float)(var3 % 30000L) / 30000.0F;
      RenderSystem.translatef(-var5, var6, 0.0F);
      RenderSystem.method27883(10.0F, 0.0F, 0.0F, 1.0F);
      RenderSystem.scalef(var0, var0, var0);
      RenderSystem.method27878(5888);
   }

   public String method14234() {
      return this.field21734;
   }
}