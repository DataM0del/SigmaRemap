package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.DateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Class807 extends Class798 {
   private static final Logger field4306 = LogManager.getLogger();
   private static final ResourceLocation field4307 = new ResourceLocation("realms", "textures/gui/realms/plus_icon.png");
   private static final ResourceLocation field4308 = new ResourceLocation("realms", "textures/gui/realms/restore_icon.png");
   private static final ITextComponent field4309 = new TranslationTextComponent("");
   private static final ITextComponent field4310 = new TranslationTextComponent("");
   private static final ITextComponent field4311 = new TranslationTextComponent("");
   private static final ITextComponent field4312 = new TranslationTextComponent("mco.backup.nobackups");
   private static int field4313 = -1;
   private final Class815 field4314;
   private List<Class6122> field4315 = Collections.<Class6122>emptyList();
   private ITextComponent field4316;
   private Class1289 field4317;
   private int field4318 = -1;
   private final int field4319;
   private Class1206 field4320;
   private Class1206 field4321;
   private Class1206 field4322;
   private Boolean field4323 = false;
   private final Class6128 field4324;
   private Class1153 field4325;

   public Class807(Class815 var1, Class6128 var2, int var3) {
      this.field4314 = var1;
      this.field4324 = var2;
      this.field4319 = var3;
   }

   @Override
   public void method1921() {
      this.field4562.field1302.method36347(true);
      this.field4317 = new Class1289(this);
      if (field4313 != -1) {
         this.field4317.method6045((double)field4313);
      }

      new Class373(this, "Realms-fetch-backups").start();
      this.field4320 = this.<Class1206>method2455(
         new Class1206(this.field4564 - 135, method1929(1), 120, 20, new TranslationTextComponent("mco.backup.button.download"), var1 -> this.method2174())
      );
      this.field4321 = this.<Class1206>method2455(
         new Class1206(
            this.field4564 - 135, method1929(3), 120, 20, new TranslationTextComponent("mco.backup.button.restore"), var1 -> this.method2173(this.field4318)
         )
      );
      this.field4322 = this.<Class1206>method2455(
         new Class1206(this.field4564 - 135, method1929(5), 120, 20, new TranslationTextComponent("mco.backup.changes.tooltip"), var1 -> {
            this.field4562.displayGuiScreen(new Class803(this, this.field4315.get(this.field4318)));
            this.field4318 = -1;
         })
      );
      this.<Class1206>method2455(
         new Class1206(this.field4564 - 100, this.field4565 - 35, 85, 20, Class7127.field30663, var1 -> this.field4562.displayGuiScreen(this.field4314))
      );
      this.<Class1289>method2456(this.field4317);
      this.field4325 = this.<Class1153>method2456(new Class1153(new TranslationTextComponent("mco.configure.world.backup"), this.field4564 / 2, 12, 16777215));
      this.method5537(this.field4317);
      this.method2170();
      this.method1930();
   }

   private void method2168() {
      if (this.field4315.size() > 1) {
         for (int var3 = 0; var3 < this.field4315.size() - 1; var3++) {
            Class6122 var4 = this.field4315.get(var3);
            Class6122 var5 = this.field4315.get(var3 + 1);
            if (!var4.field27414.isEmpty() && !var5.field27414.isEmpty()) {
               for (String var7 : var4.field27414.keySet()) {
                  if (!var7.contains("Uploaded") && var5.field27414.containsKey(var7)) {
                     if (!var4.field27414.get(var7).equals(var5.field27414.get(var7))) {
                        this.method2169(var4, var7);
                     }
                  } else {
                     this.method2169(var4, var7);
                  }
               }
            }
         }
      }
   }

   private void method2169(Class6122 var1, String var2) {
      if (!var2.contains("Uploaded")) {
         var1.field27415.put(var2, var1.field27414.get(var2));
      } else {
         String var5 = DateFormat.getDateTimeInstance(3, 3).format(var1.field27411);
         var1.field27415.put(var2, var5);
         var1.method18893(true);
      }
   }

   private void method2170() {
      this.field4321.field6483 = this.method2172();
      this.field4322.field6483 = this.method2171();
   }

   private boolean method2171() {
      return this.field4318 != -1 ? !this.field4315.get(this.field4318).field27415.isEmpty() : false;
   }

   private boolean method2172() {
      return this.field4318 != -1 ? !this.field4324.field27452 : false;
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method1920(var1, var2, var3);
      } else {
         this.field4562.displayGuiScreen(this.field4314);
         return true;
      }
   }

   private void method2173(int var1) {
      if (var1 >= 0 && var1 < this.field4315.size() && !this.field4324.field27452) {
         this.field4318 = var1;
         Date var4 = this.field4315.get(var1).field27411;
         String var5 = DateFormat.getDateTimeInstance(3, 3).format(var4);
         String var6 = Class9740.method38174(var4);
         TranslationTextComponent var7 = new TranslationTextComponent("mco.configure.world.restore.question.line1", var5, var6);
         TranslationTextComponent var8 = new TranslationTextComponent("mco.configure.world.restore.question.line2");
         this.field4562.displayGuiScreen(new Class808(var1x -> {
            if (!var1x) {
               this.field4318 = -1;
               this.field4562.displayGuiScreen(this);
            } else {
               this.method2176();
            }
         }, Class2134.field13979, var7, var8, true));
      }
   }

   private void method2174() {
      TranslationTextComponent var3 = new TranslationTextComponent("mco.configure.world.restore.download.question.line1");
      TranslationTextComponent var4 = new TranslationTextComponent("mco.configure.world.restore.download.question.line2");
      this.field4562.displayGuiScreen(new Class808(var1 -> {
         if (!var1) {
            this.field4562.displayGuiScreen(this);
         } else {
            this.method2175();
         }
      }, Class2134.field13980, var3, var4, true));
   }

   private void method2175() {
      this.field4562
         .displayGuiScreen(
            new Class797(
               this.field4314.method2298(),
               new Class1347(
                  this.field4324.field27443,
                  this.field4319,
                  this.field4324.field27445 + " (" + this.field4324.field27451.get(this.field4324.field27456).method18901(this.field4324.field27456) + ")",
                  this
               )
            )
         );
   }

   private void method2176() {
      Class6122 var3 = this.field4315.get(this.field4318);
      this.field4318 = -1;
      this.field4562.displayGuiScreen(new Class797(this.field4314.method2298(), new Class1344(var3, this.field4324.field27443, this.field4314)));
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      this.field4316 = null;
      this.method2469(var1);
      this.field4317.method1923(var1, var2, var3, var4);
      this.field4325.method5542(this, var1);
      this.field4568.method38805(var1, field4311, (float)((this.field4564 - 150) / 2 - 90), 20.0F, 10526880);
      if (this.field4323) {
         this.field4568.method38805(var1, field4312, 20.0F, (float)(this.field4565 / 2 - 10), 16777215);
      }

      this.field4320.field6482 = !this.field4323;
      super.method1923(var1, var2, var3, var4);
      if (this.field4316 != null) {
         this.method2177(var1, this.field4316, var2, var3);
      }
   }

   public void method2177(Class9332 var1, ITextComponent var2, int var3, int var4) {
      if (var2 != null) {
         int var7 = var3 + 12;
         int var8 = var4 - 12;
         int var9 = this.field4568.method38821(var2);
         this.method5688(var1, var7 - 3, var8 - 3, var7 + var9 + 3, var8 + 8 + 3, -1073741824, -1073741824);
         this.field4568.method38803(var1, var2, (float)var7, (float)var8, 16777215);
      }
   }

   // $VF: synthetic method
   public static Class6128 method2184(Class807 var0) {
      return var0.field4324;
   }

   // $VF: synthetic method
   public static Minecraft method2185(Class807 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static Logger method2186() {
      return field4306;
   }

   // $VF: synthetic method
   public static List method2187(Class807 var0, List var1) {
      return var0.field4315 = var1;
   }

   // $VF: synthetic method
   public static Boolean method2188(Class807 var0, Boolean var1) {
      return var0.field4323 = var1;
   }

   // $VF: synthetic method
   public static List<Class6122> method2189(Class807 var0) {
      return var0.field4315;
   }

   // $VF: synthetic method
   public static Class1289 method2190(Class807 var0) {
      return var0.field4317;
   }

   // $VF: synthetic method
   public static void method2191(Class807 var0) {
      var0.method2168();
   }

   // $VF: synthetic method
   public static int method2192(Class807 var0, int var1) {
      return var0.field4318 = var1;
   }

   // $VF: synthetic method
   public static int method2193(int var0) {
      field4313 = var0;
      return var0;
   }

   // $VF: synthetic method
   public static void method2194(Class807 var0, int var1) {
      var0.method2173(var1);
   }

   // $VF: synthetic method
   public static void method2195(Class807 var0) {
      var0.method2170();
   }

   // $VF: synthetic method
   public static Class9834 method2196(Class807 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static Class9834 method2197(Class807 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static ResourceLocation method2198() {
      return field4308;
   }

   // $VF: synthetic method
   public static Minecraft method2199(Class807 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static ITextComponent method2200(Class807 var0, ITextComponent var1) {
      return var0.field4316 = var1;
   }

   // $VF: synthetic method
   public static ITextComponent method2201() {
      return field4309;
   }

   // $VF: synthetic method
   public static ResourceLocation method2202() {
      return field4307;
   }

   // $VF: synthetic method
   public static Minecraft method2203(Class807 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static ITextComponent method2204() {
      return field4310;
   }
}