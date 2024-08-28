package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.Collection;
import java.util.Locale;
import java.util.UUID;
import java.util.stream.Collectors;

public class Class1147 extends Screen {
   public static final ResourceLocation field6215 = new ResourceLocation("textures/gui/social_interactions.png");
   private static final ITextComponent field6216 = new TranslationTextComponent("gui.socialInteractions.tab_all");
   private static final ITextComponent field6217 = new TranslationTextComponent("gui.socialInteractions.tab_hidden");
   private static final ITextComponent field6218 = new TranslationTextComponent("gui.socialInteractions.tab_blocked");
   private static final ITextComponent field6219 = field6216.copyRaw().mergeStyle(TextFormatting.UNDERLINE);
   private static final ITextComponent field6220 = field6217.copyRaw().mergeStyle(TextFormatting.UNDERLINE);
   private static final ITextComponent field6221 = field6218.copyRaw().mergeStyle(TextFormatting.UNDERLINE);
   private static final ITextComponent field6222 = new TranslationTextComponent("gui.socialInteractions.search_hint")
      .mergeStyle(TextFormatting.ITALIC)
      .mergeStyle(TextFormatting.GRAY);
   private static final ITextComponent field6223 = new TranslationTextComponent("gui.socialInteractions.search_empty").mergeStyle(TextFormatting.GRAY);
   private static final ITextComponent field6224 = new TranslationTextComponent("gui.socialInteractions.empty_hidden").mergeStyle(TextFormatting.GRAY);
   private static final ITextComponent field6225 = new TranslationTextComponent("gui.socialInteractions.empty_blocked").mergeStyle(TextFormatting.GRAY);
   private static final ITextComponent field6226 = new TranslationTextComponent("gui.socialInteractions.blocking_hint");
   private Class1297 field6227;
   private Class1189 field6228;
   private String field6229 = "";
   private Class2332 field6230 = Class2332.field15951;
   private Class1206 field6231;
   private Class1206 field6232;
   private Class1206 field6233;
   private Class1206 field6234;
   private ITextComponent field6235;
   private int field6236;
   private boolean field6237;
   private Runnable field6238;

   public Class1147() {
      super(new TranslationTextComponent("gui.socialInteractions.title"));
      this.method5488(Minecraft.getInstance());
   }

   private int method5482() {
      return Math.max(52, this.field4565 - 128 - 16);
   }

   private int method5483() {
      return this.method5482() / 16;
   }

   private int method5484() {
      return 80 + this.method5483() * 16 - 8;
   }

   private int method5485() {
      return (this.field4564 - 238) / 2;
   }

   @Override
   public String method2326() {
      return super.method2326() + ". " + this.field6235.getString();
   }

   @Override
   public void method1919() {
      super.method1919();
      this.field6228.method5633();
   }

   @Override
   public void method1921() {
      this.field4562.field1302.method36347(true);
      if (!this.field6237) {
         this.field6227 = new Class1297(this, this.field4562, this.field4564, this.field4565, 88, this.method5484(), 36);
      } else {
         this.field6227.method6034(this.field4564, this.field4565, 88, this.method5484());
      }

      int var3 = this.field6227.method6022() / 3;
      int var4 = this.field6227.method6053();
      int var5 = this.field6227.method6054();
      int var6 = this.field4568.method38821(field6226) + 40;
      int var7 = 64 + 16 * this.method5483();
      int var8 = (this.field4564 - var6) / 2;
      this.field6231 = this.<Class1206>method2455(new Class1206(var4, 45, var3, 20, field6216, var1 -> this.method5486(Class2332.field15951)));
      this.field6232 = this.<Class1206>method2455(
         new Class1206((var4 + var5 - var3) / 2 + 1, 45, var3, 20, field6217, var1 -> this.method5486(Class2332.field15952))
      );
      this.field6233 = this.<Class1206>method2455(new Class1206(var5 - var3 + 1, 45, var3, 20, field6218, var1 -> this.method5486(Class2332.field15953)));
      this.field6234 = this.<Class1206>method2455(new Class1206(var8, var7, var6, 20, field6226, var1 -> this.field4562.displayGuiScreen(new Class830(var1x -> {
            if (var1x) {
               Util.getOSType().method8181("https://aka.ms/javablocking");
            }

            this.field4562.displayGuiScreen(this);
         }, "https://aka.ms/javablocking", true))));
      String var9 = this.field6228 == null ? "" : this.field6228.method5636();
      this.field6228 = new Class1301(this, this.field4568, this.method5485() + 28, 78, 196, 16, field6222);
      this.field6228.method5657(16);
      this.field6228.method5661(false);
      this.field6228.method5671(true);
      this.field6228.method5662(16777215);
      this.field6228.method5635(var9);
      this.field6228.method5631(this::method5487);
      this.field4561.add(this.field6228);
      this.field4561.add(this.field6227);
      this.field6237 = true;
      this.method5486(this.field6230);
   }

   private void method5486(Class2332 var1) {
      this.field6230 = var1;
      this.field6231.method5743(field6216);
      this.field6232.method5743(field6217);
      this.field6233.method5743(field6218);
      Collection<UUID> var4;
      switch (Class3627.field19645[var1.ordinal()]) {
         case 1:
            this.field6231.method5743(field6219);
            var4 = this.field4562.field1339.connection.method15791();
            break;
         case 2:
            this.field6232.method5743(field6220);
            var4 = this.field4562.method1578().method37609();
            break;
         case 3:
            this.field6233.method5743(field6221);
            Class9645 var5 = this.field4562.method1578();
            var4 = this.field4562.field1339.connection.method15791().stream().filter(var5::method37608).collect(Collectors.toSet());
            break;
         default:
            var4 = ImmutableList.of();
      }

      this.field6230 = var1;
      this.field6227.method6134(var4, this.field6227.method6044());
      if (!this.field6228.method5636().isEmpty() && this.field6227.method6137() && !this.field6228.method5746()) {
         Class6688.field29302.method20401(field6223.getString());
      } else if (var4.isEmpty()) {
         if (var1 == Class2332.field15952) {
            Class6688.field29302.method20401(field6224.getString());
         } else if (var1 == Class2332.field15953) {
            Class6688.field29302.method20401(field6225.getString());
         }
      }
   }

   @Override
   public void method1931() {
      this.field4562.field1302.method36347(false);
   }

   @Override
   public void method2469(Class9332 var1) {
      int var4 = this.method5485() + 3;
      super.method2469(var1);
      this.field4562.getTextureManager().bindTexture(field6215);
      this.method5696(var1, var4, 64, 1, 1, 236, 8);
      int var5 = this.method5483();

      for (int var6 = 0; var6 < var5; var6++) {
         this.method5696(var1, var4, 72 + 16 * var6, 1, 10, 236, 16);
      }

      this.method5696(var1, var4, 72 + 16 * var5, 1, 27, 236, 8);
      this.method5696(var1, var4 + 10, 76, 243, 1, 12, 12);
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      this.method5488(this.field4562);
      this.method2469(var1);
      if (this.field6235 != null) {
         method5693(var1, this.field4562.field1294, this.field6235, this.method5485() + 8, 35, -1);
      }

      if (!this.field6227.method6137()) {
         this.field6227.method1923(var1, var2, var3, var4);
      } else if (!this.field6228.method5636().isEmpty()) {
         method5691(var1, this.field4562.field1294, field6223, this.field4564 / 2, (78 + this.method5484()) / 2, -1);
      } else {
         switch (Class3627.field19645[this.field6230.ordinal()]) {
            case 2:
               method5691(var1, this.field4562.field1294, field6224, this.field4564 / 2, (78 + this.method5484()) / 2, -1);
               break;
            case 3:
               method5691(var1, this.field4562.field1294, field6225, this.field4564 / 2, (78 + this.method5484()) / 2, -1);
         }
      }

      if (!this.field6228.method5746() && this.field6228.method5636().isEmpty()) {
         method5693(var1, this.field4562.field1294, field6222, this.field6228.field6477, this.field6228.field6478, -1);
      } else {
         this.field6228.method1923(var1, var2, var3, var4);
      }

      this.field6234.field6483 = this.field6230 == Class2332.field15953;
      super.method1923(var1, var2, var3, var4);
      if (this.field6238 != null) {
         this.field6238.run();
      }
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      if (this.field6228.method5746()) {
         this.field6228.method1958(var1, var3, var5);
      }

      return super.method1958(var1, var3, var5) || this.field6227.method1958(var1, var3, var5);
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (!this.field6228.method5746() && this.field4562.field1299.field44648.method8519(var1, var2)) {
         this.field4562.displayGuiScreen((Screen)null);
         return true;
      } else {
         return super.method1920(var1, var2, var3);
      }
   }

   @Override
   public boolean method2472() {
      return false;
   }

   private void method5487(String var1) {
      var1 = var1.toLowerCase(Locale.ROOT);
      if (!var1.equals(this.field6229)) {
         this.field6227.method6136(var1);
         this.field6229 = var1;
         this.method5486(this.field6230);
      }
   }

   private void method5488(Minecraft var1) {
      int var4 = var1.getClientPlayNetHandler().method15790().size();
      if (this.field6236 != var4) {
         String var5 = "";
         Class7730 var6 = var1.method1528();
         if (!var1.method1529()) {
            if (var6 != null) {
               var5 = var6.field33188;
            }
         } else {
            var5 = var1.method1531().method1362();
         }

         if (var4 <= 1) {
            this.field6235 = new TranslationTextComponent("gui.socialInteractions.server_label.single", var5, var4);
         } else {
            this.field6235 = new TranslationTextComponent("gui.socialInteractions.server_label.multiple", var5, var4);
         }

         this.field6236 = var4;
      }
   }

   public void method5489(Class6589 var1) {
      this.field6227.method6138(var1, this.field6230);
   }

   public void method5490(UUID var1) {
      this.field6227.method6139(var1);
   }

   public void method5491(Runnable var1) {
      this.field6238 = var1;
   }

   // $VF: synthetic method
   public static Class1189 method5497(Class1147 var0) {
      return var0.field6228;
   }

   // $VF: synthetic method
   public static Class1297 method5498(Class1147 var0) {
      return var0.field6227;
   }

   // $VF: synthetic method
   public static ITextComponent method5499() {
      return field6223;
   }
}