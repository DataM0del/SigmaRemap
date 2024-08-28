package mapped;

import com.google.common.collect.ImmutableList;
import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7603 implements Class7601 {
   private final Class1906 field32637;
   private ITextComponent field32638;
   private List<Class9125> field32639;
   private long field32640;
   private boolean field32641;
   private final int field32642;

   public Class7603(Class1906 var1, ITextComponent var2, ITextComponent var3) {
      this(var1, var2, method24903(var3), 160);
   }

   public static Class7603 method24902(Minecraft var0, Class1906 var1, ITextComponent var2, ITextComponent var3) {
      Class9834 var6 = var0.field1294;
      List<Class9125> var7 = var6.method38828(var3, 200);
      int var8 = Math.max(200, var7.stream().mapToInt(var6::method38822).max().orElse(200));
      return new Class7603(var1, var2, var7, var8 + 30);
   }

   private Class7603(Class1906 var1, ITextComponent var2, List<Class9125> var3, int var4) {
      this.field32637 = var1;
      this.field32638 = var2;
      this.field32639 = var3;
      this.field32642 = var4;
   }

   private static ImmutableList<Class9125> method24903(ITextComponent var0) {
      return var0 != null ? ImmutableList.of(var0.func_241878_f()) : ImmutableList.of();
   }

   @Override
   public int method24898() {
      return this.field32642;
   }

   @Override
   public Class2139 method24894(Class9332 var1, Class1264 var2, long var3) {
      if (this.field32641) {
         this.field32640 = var3;
         this.field32641 = false;
      }

      var2.method5915().getTextureManager().bindTexture(field32630);
      RenderSystem.method27890(1.0F, 1.0F, 1.0F);
      int var7 = this.method24898();
      byte var8 = 12;
      if (var7 == 160 && this.field32639.size() <= 1) {
         var2.method5696(var1, 0, 0, 0, 64, var7, this.method24899());
      } else {
         int var9 = this.method24899() + Math.max(0, this.field32639.size() - 1) * 12;
         byte var10 = 28;
         int var11 = Math.min(4, var9 - 28);
         this.method24904(var1, var2, var7, 0, 0, 28);

         for (int var12 = 28; var12 < var9 - var11; var12 += 10) {
            this.method24904(var1, var2, var7, 16, var12, Math.min(16, var9 - var12 - var11));
         }

         this.method24904(var1, var2, var7, 32 - var11, var9 - var11, var11);
      }

      if (this.field32639 != null) {
         var2.method5915().field1294.method38805(var1, this.field32638, 18.0F, 7.0F, -256);

         for (int var13 = 0; var13 < this.field32639.size(); var13++) {
            var2.method5915().field1294.method38804(var1, this.field32639.get(var13), 18.0F, (float)(18 + var13 * 12), -1);
         }
      } else {
         var2.method5915().field1294.method38805(var1, this.field32638, 18.0F, 12.0F, -256);
      }

      return var3 - this.field32640 >= 5000L ? Class2139.field14004 : Class2139.field14003;
   }

   private void method24904(Class9332 var1, Class1264 var2, int var3, int var4, int var5, int var6) {
      int var9 = var4 != 0 ? 5 : 20;
      int var10 = Math.min(60, var3 - var9);
      var2.method5696(var1, 0, var5, 0, 64 + var4, var9, var6);

      for (int var11 = var9; var11 < var3 - var10; var11 += 64) {
         var2.method5696(var1, var11, var5, 32, 64 + var4, Math.min(64, var3 - var11 - var10), var6);
      }

      var2.method5696(var1, var3 - var10, var5, 160 - var10, 64 + var4, var10, var6);
   }

   public void method24905(ITextComponent var1, ITextComponent var2) {
      this.field32638 = var1;
      this.field32639 = method24903(var2);
      this.field32641 = true;
   }

   public Class1906 method24897() {
      return this.field32637;
   }

   public static void method24906(Class1264 var0, Class1906 var1, ITextComponent var2, ITextComponent var3) {
      var0.method5914(new Class7603(var1, var2, var3));
   }

   public static void method24907(Class1264 var0, Class1906 var1, ITextComponent var2, ITextComponent var3) {
      Class7603 var6 = var0.<Class7603>method5912(Class7603.class, var1);
      if (var6 != null) {
         var6.method24905(var2, var3);
      } else {
         method24906(var0, var1, var2, var3);
      }
   }

   public static void method24908(Minecraft var0, String var1) {
      method24906(var0.method1566(), Class1906.field11200, new TranslationTextComponent("selectWorld.access_failure"), new StringTextComponent(var1));
   }

   public static void method24909(Minecraft var0, String var1) {
      method24906(var0.method1566(), Class1906.field11200, new TranslationTextComponent("selectWorld.delete_failure"), new StringTextComponent(var1));
   }

   public static void method24910(Minecraft var0, String var1) {
      method24906(var0.method1566(), Class1906.field11201, new TranslationTextComponent("pack.copyFailure"), new StringTextComponent(var1));
   }
}