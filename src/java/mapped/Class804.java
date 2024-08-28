package mapped;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Class804 extends Class798 {
   private static final Logger field4194 = LogManager.getLogger();
   private static final ResourceLocation field4195 = new ResourceLocation("realms", "textures/gui/realms/link_icons.png");
   private static final ResourceLocation field4196 = new ResourceLocation("realms", "textures/gui/realms/trailer_icons.png");
   private static final ResourceLocation field4197 = new ResourceLocation("realms", "textures/gui/realms/slot_frame.png");
   private static final ITextComponent field4198 = new TranslationTextComponent("mco.template.info.tooltip");
   private static final ITextComponent field4199 = new TranslationTextComponent("mco.template.trailer.tooltip");
   private final Class813 field4200;
   private Class1291 field4201;
   private int field4202 = -1;
   private ITextComponent field4203;
   private Class1206 field4204;
   private Class1206 field4205;
   private Class1206 field4206;
   private ITextComponent field4207;
   private String field4208;
   private final Class2049 field4209;
   private int field4210;
   private ITextComponent[] field4211;
   private String field4212;
   private boolean field4213;
   private boolean field4214;
   private List<Class8081> field4215;

   public Class804(Class813 var1, Class2049 var2) {
      this(var1, var2, (Class6108)null);
   }

   public Class804(Class813 var1, Class2049 var2, Class6108 var3) {
      this.field4200 = var1;
      this.field4209 = var2;
      if (var3 != null) {
         this.field4201 = new Class1291(this, Lists.newArrayList(var3.field27365));
         this.method1969(var3);
      } else {
         this.field4201 = new Class1291(this);
         this.method1969(new Class6108(10));
      }

      this.field4203 = new TranslationTextComponent("mco.template.title");
   }

   public void method1956(ITextComponent var1) {
      this.field4203 = var1;
   }

   public void method1957(ITextComponent... var1) {
      this.field4211 = var1;
      this.field4213 = true;
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      if (this.field4214 && this.field4212 != null) {
         Util.getOSType().method8181("https://www.minecraft.net/realms/adventure-maps-in-1-9");
         return true;
      } else {
         return super.method1958(var1, var3, var5);
      }
   }

   @Override
   public void method1921() {
      this.field4562.field1302.method36347(true);
      this.field4201 = new Class1291(this, this.field4201.method6121());
      this.field4205 = this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 206, this.field4565 - 32, 100, 20, new TranslationTextComponent("mco.template.button.trailer"), var1 -> this.method1967()
         )
      );
      this.field4204 = this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 100, this.field4565 - 32, 100, 20, new TranslationTextComponent("mco.template.button.select"), var1 -> this.method1965()
         )
      );
      ITextComponent var3 = this.field4209 != Class2049.field13370 ? Class7127.field30663 : Class7127.field30659;
      Class1206 var4 = new Class1206(this.field4564 / 2 + 6, this.field4565 - 32, 100, 20, var3, var1 -> this.method1964());
      this.<Class1206>method2455(var4);
      this.field4206 = this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 + 112, this.field4565 - 32, 100, 20, new TranslationTextComponent("mco.template.button.publisher"), var1 -> this.method1968()
         )
      );
      this.field4204.field6482 = false;
      this.field4205.field6483 = false;
      this.field4206.field6483 = false;
      this.<Class1291>method2456(this.field4201);
      this.method5537(this.field4201);
      Stream<ITextComponent> var5 = Stream.<ITextComponent>of(this.field4203);
      if (this.field4211 != null) {
         var5 = Stream.<ITextComponent>concat(Stream.of(this.field4211), var5);
      }

      Class9229.method34714(var5.filter(Objects::nonNull).map(ITextComponent::getString).collect(Collectors.<String>toList()));
   }

   private void method1959() {
      this.field4206.field6483 = this.method1961();
      this.field4205.field6483 = this.method1963();
      this.field4204.field6482 = this.method1960();
   }

   private boolean method1960() {
      return this.field4202 != -1;
   }

   private boolean method1961() {
      return this.field4202 != -1 && !this.method1962().field27468.isEmpty();
   }

   private Class6130 method1962() {
      return this.field4201.method6120(this.field4202);
   }

   private boolean method1963() {
      return this.field4202 != -1 && !this.method1962().field27470.isEmpty();
   }

   @Override
   public void method1919() {
      super.method1919();
      this.field4210--;
      if (this.field4210 < 0) {
         this.field4210 = 0;
      }
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method1920(var1, var2, var3);
      } else {
         this.method1964();
         return true;
      }
   }

   private void method1964() {
      this.field4200.method2245((Class6130)null);
      this.field4562.displayGuiScreen(this.field4200);
   }

   private void method1965() {
      if (this.method1966()) {
         this.field4200.method2245(this.method1962());
      }
   }

   private boolean method1966() {
      return this.field4202 >= 0 && this.field4202 < this.field4201.method6031();
   }

   private void method1967() {
      if (this.method1966()) {
         Class6130 var3 = this.method1962();
         if (!"".equals(var3.field27470)) {
            Util.getOSType().method8181(var3.field27470);
         }
      }
   }

   private void method1968() {
      if (this.method1966()) {
         Class6130 var3 = this.method1962();
         if (!"".equals(var3.field27468)) {
            Util.getOSType().method8181(var3.field27468);
         }
      }
   }

   private void method1969(Class6108 var1) {
      new Class354(this, "realms-template-fetcher", var1).start();
   }

   private Either<Class6108, String> method1970(Class6108 var1, Class4624 var2) {
      try {
         return Either.left(var2.method14563(var1.field27366 + 1, var1.field27367, this.field4209));
      } catch (Class2435 var6) {
         return Either.right(var6.getMessage());
      }
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      this.field4207 = null;
      this.field4208 = null;
      this.field4214 = false;
      this.method2469(var1);
      this.field4201.method1923(var1, var2, var3, var4);
      if (this.field4215 != null) {
         this.method1971(var1, var2, var3, this.field4215);
      }

      method5691(var1, this.field4568, this.field4203, this.field4564 / 2, 13, 16777215);
      if (this.field4213) {
         ITextComponent[] var7 = this.field4211;

         for (int var8 = 0; var8 < var7.length; var8++) {
            int var9 = this.field4568.method38821(var7[var8]);
            int var10 = this.field4564 / 2 - var9 / 2;
            int var11 = method1929(-1 + var8);
            if (var2 >= var10 && var2 <= var10 + var9 && var3 >= var11 && var3 <= var11 + 9) {
               this.field4214 = true;
            }
         }

         for (int var12 = 0; var12 < var7.length; var12++) {
            Object var13 = var7[var12];
            int var14 = 10526880;
            if (this.field4212 != null) {
               if (!this.field4214) {
                  var14 = 3368635;
               } else {
                  var14 = 7107012;
                  var13 = ((ITextComponent)var13).deepCopy().mergeStyle(TextFormatting.STRIKETHROUGH);
               }
            }

            method5691(var1, this.field4568, (ITextComponent)var13, this.field4564 / 2, method1929(-1 + var12), var14);
         }
      }

      super.method1923(var1, var2, var3, var4);
      this.method1972(var1, this.field4207, var2, var3);
   }

   private void method1971(Class9332 var1, int var2, int var3, List<Class8081> var4) {
      for (int var7 = 0; var7 < var4.size(); var7++) {
         Class8081 var8 = (Class8081)var4.get(var7);
         int var9 = method1929(4 + var7);
         int var10 = var8.field34733.stream().mapToInt(var1x -> this.field4568.method38820(var1x.method18864())).sum();
         int var11 = this.field4564 / 2 - var10 / 2;

         for (Class6102 var13 : var8.field34733) {
            int var14 = !var13.method18865() ? 16777215 : 3368635;
            int var15 = this.field4568.method38799(var1, var13.method18864(), (float)var11, (float)var9, var14);
            if (var13.method18865() && var2 > var11 && var2 < var15 && var3 > var9 - 3 && var3 < var9 + 8) {
               this.field4207 = new StringTextComponent(var13.method18866());
               this.field4208 = var13.method18866();
            }

            var11 = var15;
         }
      }
   }

   public void method1972(Class9332 var1, ITextComponent var2, int var3, int var4) {
      if (var2 != null) {
         int var7 = var3 + 12;
         int var8 = var4 - 12;
         int var9 = this.field4568.method38821(var2);
         this.method5688(var1, var7 - 3, var8 - 3, var7 + var9 + 3, var8 + 8 + 3, -1073741824, -1073741824);
         this.field4568.method38803(var1, var2, (float)var7, (float)var8, 16777215);
      }
   }

   // $VF: synthetic method
   public static Either method1978(Class804 var0, Class6108 var1, Class4624 var2) {
      return var0.method1970(var1, var2);
   }

   // $VF: synthetic method
   public static Minecraft method1979(Class804 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static Logger method1980() {
      return field4194;
   }

   // $VF: synthetic method
   public static Class1291 method1981(Class804 var0) {
      return var0.field4201;
   }

   // $VF: synthetic method
   public static List method1982(Class804 var0, List var1) {
      return var0.field4215 = var1;
   }

   // $VF: synthetic method
   public static Class9834 method1983(Class804 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static Class9834 method1984(Class804 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static Class9834 method1985(Class804 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static Class9834 method1986(Class804 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static ResourceLocation method1987() {
      return field4197;
   }

   // $VF: synthetic method
   public static Minecraft method1988(Class804 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static Class9834 method1989(Class804 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static Class9834 method1990(Class804 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static ResourceLocation method1991() {
      return field4195;
   }

   // $VF: synthetic method
   public static Minecraft method1992(Class804 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static ResourceLocation method1993() {
      return field4196;
   }

   // $VF: synthetic method
   public static Minecraft method1994(Class804 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static ITextComponent method1995(Class804 var0, ITextComponent var1) {
      return var0.field4207 = var1;
   }

   // $VF: synthetic method
   public static ITextComponent method1996() {
      return field4198;
   }

   // $VF: synthetic method
   public static String method1997(Class804 var0, String var1) {
      return var0.field4208 = var1;
   }

   // $VF: synthetic method
   public static ITextComponent method1998() {
      return field4199;
   }

   // $VF: synthetic method
   public static boolean method1999(Class804 var0) {
      return var0.field4213;
   }

   // $VF: synthetic method
   public static int method2000(int var0) {
      return method1929(var0);
   }

   // $VF: synthetic method
   public static String method2001(Class804 var0) {
      return var0.field4208;
   }

   // $VF: synthetic method
   public static int method2002(Class804 var0, int var1) {
      return var0.field4210 = var1;
   }

   // $VF: synthetic method
   public static int method2003(Class804 var0) {
      return var0.field4210;
   }

   // $VF: synthetic method
   public static void method2004(Class804 var0) {
      var0.method1965();
   }

   // $VF: synthetic method
   public static int method2005(Class804 var0, int var1) {
      return var0.field4202 = var1;
   }

   // $VF: synthetic method
   public static void method2006(Class804 var0) {
      var0.method1959();
   }
}