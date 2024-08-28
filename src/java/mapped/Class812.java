package mapped;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

public class Class812 extends Class798 {
   private static final Logger field4356 = LogManager.getLogger();
   private static final ReentrantLock field4357 = new ReentrantLock();
   private final Screen field4358;
   private final Class6120 field4359;
   private final ITextComponent field4360;
   private final RateLimiter field4361;
   private Class1206 field4362;
   private final String field4363;
   private final Class7155 field4364;
   private volatile ITextComponent field4365;
   private volatile ITextComponent field4366 = new TranslationTextComponent("mco.download.preparing");
   private volatile String field4367;
   private volatile boolean field4368;
   private volatile boolean field4369 = true;
   private volatile boolean field4370;
   private volatile boolean field4371;
   private Long field4372;
   private Long field4373;
   private long field4374;
   private int field4375;
   private static final String[] field4376 = new String[]{"", ".", ". .", ". . ."};
   private int field4377;
   private boolean field4378;
   private final BooleanConsumer field4379;

   public Class812(Screen var1, Class6120 var2, String var3, BooleanConsumer var4) {
      this.field4379 = var4;
      this.field4358 = var1;
      this.field4363 = var3;
      this.field4359 = var2;
      this.field4364 = new Class7155(this);
      this.field4360 = new TranslationTextComponent("mco.download.title");
      this.field4361 = RateLimiter.create(0.1F);
   }

   @Override
   public void method1921() {
      this.field4562.field1302.method36347(true);
      this.field4362 = this.<Class1206>method2455(new Class1206(this.field4564 / 2 - 100, this.field4565 - 42, 200, 20, Class7127.field30659, var1 -> {
         this.field4368 = true;
         this.method2235();
      }));
      this.method2233();
   }

   private void method2233() {
      if (!this.field4370) {
         if (!this.field4378 && this.method2234(this.field4359.field27402) >= 5368709120L) {
            TranslationTextComponent var3 = new TranslationTextComponent("mco.download.confirmation.line1", Class2072.method8729(5368709120L));
            TranslationTextComponent var4 = new TranslationTextComponent("mco.download.confirmation.line2");
            this.field4562.displayGuiScreen(new Class808(var1 -> {
               this.field4378 = true;
               this.field4562.displayGuiScreen(this);
               this.method2240();
            }, Class2134.field13979, var3, var4, false));
         } else {
            this.method2240();
         }
      }
   }

   private long method2234(String var1) {
      Class9478 var4 = new Class9478();
      return var4.method36586(var1);
   }

   @Override
   public void method1919() {
      super.method1919();
      this.field4375++;
      if (this.field4366 != null && this.field4361.tryAcquire(1)) {
         List<ITextComponent> var3 = Lists.newArrayList();
         var3.add(this.field4360);
         var3.add(this.field4366);
         if (this.field4367 != null) {
            var3.add(new StringTextComponent(this.field4367 + "%"));
            var3.add(new StringTextComponent(Class2072.method8729(this.field4374) + "/s"));
         }

         if (this.field4365 != null) {
            var3.add(this.field4365);
         }

         String var4 = var3.stream().map(ITextComponent::getString).collect(Collectors.joining("\n"));
         Class9229.method34711(var4);
      }
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method1920(var1, var2, var3);
      } else {
         this.field4368 = true;
         this.method2235();
         return true;
      }
   }

   private void method2235() {
      if (this.field4370 && this.field4379 != null && this.field4365 == null) {
         this.field4379.accept(true);
      }

      this.field4562.displayGuiScreen(this.field4358);
   }

   @Override
   public void method1923(Class9332 var1, int var2, int var3, float var4) {
      this.method2469(var1);
      method5691(var1, this.field4568, this.field4360, this.field4564 / 2, 20, 16777215);
      method5691(var1, this.field4568, this.field4366, this.field4564 / 2, 50, 16777215);
      if (this.field4369) {
         this.method2236(var1);
      }

      if (this.field4364.field30735 != 0L && !this.field4368) {
         this.method2237(var1);
         this.method2238(var1);
      }

      if (this.field4365 != null) {
         method5691(var1, this.field4568, this.field4365, this.field4564 / 2, 110, 16711680);
      }

      super.method1923(var1, var2, var3, var4);
   }

   private void method2236(Class9332 var1) {
      int var4 = this.field4568.method38821(this.field4366);
      if (this.field4375 % 10 == 0) {
         this.field4377++;
      }

      this.field4568.method38801(var1, field4376[this.field4377 % field4376.length], (float)(this.field4564 / 2 + var4 / 2 + 5), 50.0F, 16777215);
   }

   private void method2237(Class9332 var1) {
      double var4 = Math.min((double)this.field4364.field30735 / (double)this.field4364.field30736, 1.0);
      this.field4367 = String.format(Locale.ROOT, "%.1f", var4 * 100.0);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.method27862();
      Class9352 var6 = Class9352.method35409();
      Class5425 var7 = var6.method35411();
      var7.method17063(7, Class9337.field43342);
      double var8 = (double)(this.field4564 / 2 - 100);
      double var10 = 0.5;
      var7.method17025(var8 - 0.5, 95.5, 0.0).method17026(217, 210, 210, 255).method17031();
      var7.method17025(var8 + 200.0 * var4 + 0.5, 95.5, 0.0).method17026(217, 210, 210, 255).method17031();
      var7.method17025(var8 + 200.0 * var4 + 0.5, 79.5, 0.0).method17026(217, 210, 210, 255).method17031();
      var7.method17025(var8 - 0.5, 79.5, 0.0).method17026(217, 210, 210, 255).method17031();
      var7.method17025(var8, 95.0, 0.0).method17026(128, 128, 128, 255).method17031();
      var7.method17025(var8 + 200.0 * var4, 95.0, 0.0).method17026(128, 128, 128, 255).method17031();
      var7.method17025(var8 + 200.0 * var4, 80.0, 0.0).method17026(128, 128, 128, 255).method17031();
      var7.method17025(var8, 80.0, 0.0).method17026(128, 128, 128, 255).method17031();
      var6.method35410();
      RenderSystem.method27861();
      method5690(var1, this.field4568, this.field4367 + " %", this.field4564 / 2, 84, 16777215);
   }

   private void method2238(Class9332 var1) {
      if (this.field4375 % 20 != 0) {
         this.method2239(var1, this.field4374);
      } else {
         if (this.field4372 != null) {
            long var4 = Util.method38487() - this.field4373;
            if (var4 == 0L) {
               var4 = 1L;
            }

            this.field4374 = 1000L * (this.field4364.field30735 - this.field4372) / var4;
            this.method2239(var1, this.field4374);
         }

         this.field4372 = this.field4364.field30735;
         this.field4373 = Util.method38487();
      }
   }

   private void method2239(Class9332 var1, long var2) {
      if (var2 > 0L) {
         int var6 = this.field4568.method38820(this.field4367);
         String var7 = "(" + Class2072.method8729(var2) + "/s)";
         this.field4568.method38801(var1, var7, (float)(this.field4564 / 2 + var6 / 2 + 15), 84.0F, 16777215);
      }
   }

   private void method2240() {
      new Thread(() -> {
         try {
            if (!field4357.tryLock(1L, TimeUnit.SECONDS)) {
               this.field4366 = new TranslationTextComponent("mco.download.failed");
            } else if (this.field4368) {
               this.method2241();
            } else {
               this.field4366 = new TranslationTextComponent("mco.download.downloading", this.field4363);
               Class9478 var3 = new Class9478();
               var3.method36586(this.field4359.field27402);
               var3.method36587(this.field4359, this.field4363, this.field4364, this.field4562.method1472());

               while (!var3.method36589()) {
                  if (var3.method36590()) {
                     var3.method36588();
                     this.field4365 = new TranslationTextComponent("mco.download.failed");
                     this.field4362.method5743(Class7127.field30658);
                     return;
                  }

                  if (var3.method36591()) {
                     if (!this.field4371) {
                        this.field4366 = new TranslationTextComponent("mco.download.extracting");
                     }

                     this.field4371 = true;
                  }

                  if (this.field4368) {
                     var3.method36588();
                     this.method2241();
                     return;
                  }

                  try {
                     Thread.sleep(500L);
                  } catch (InterruptedException var10) {
                     field4356.error("Failed to check Realms backup download status");
                  }
               }

               this.field4370 = true;
               this.field4366 = new TranslationTextComponent("mco.download.done");
               this.field4362.method5743(Class7127.field30658);
            }
         } catch (InterruptedException var11) {
            field4356.error("Could not acquire upload lock");
         } catch (Exception var12) {
            this.field4365 = new TranslationTextComponent("mco.download.failed");
            var12.printStackTrace();
         } finally {
            if (!field4357.isHeldByCurrentThread()) {
               return;
            } else {
               field4357.unlock();
               this.field4369 = false;
               this.field4370 = true;
            }
         }
      }).start();
   }

   private void method2241() {
      this.field4366 = new TranslationTextComponent("mco.download.cancelled");
   }
}