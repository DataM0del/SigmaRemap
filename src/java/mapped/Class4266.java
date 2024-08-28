package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.util.ImageUtil;
import com.mentalfrostbyte.jello.util.TextureUtil;
import org.lwjgl.opengl.GL11;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class4266 extends Class4247 {
   public int field20684;
   public List<Class7086> field20685 = new ArrayList<Class7086>();
   public int field20686 = 0;
   public boolean field20687 = true;
   private Texture field20688;

   public Class4266(Class4305 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.method13300(false);
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      if (this.field20909 && this.field20686 <= 0) {
         if (var2 >= this.method13272() + this.method13269() / 2) {
            ((Class4259)this.field20892).method13076(false);
            this.field20685.add(new Class7086(this, false));
         } else {
            ((Class4259)this.field20892).method13076(true);
            this.field20685.add(new Class7086(this, true));
         }

         if (this.field20686 != 0) {
            this.field20686 = 14;
         } else {
            this.field20686 = 3;
         }
      }

      this.field20686--;
      if (!this.field20909) {
         this.field20686 = -1;
      }
   }

   @Override
   public void finalize() throws Throwable {
      try {
         if (this.field20688 != null) {
            Client.getInstance().method19927(this.field20688);
         }
      } finally {
         super.finalize();
      }
   }

   @Override
   public void method13027(float var1) {
      Iterator var4 = this.field20685.iterator();
      byte var5 = 8;

      try {
         if (this.field20687) {
            BufferedImage var6 = ImageUtil.method35039(this.method13271(), this.method13272(), this.field20897, this.field20898, 3, 10, true);
            this.field20684 = Class5628.method17682(new Color(var6.getRGB(6, 7)), new Color(var6.getRGB(6, 22))).getRGB();
            this.field20684 = Class5628.method17691(this.field20684, 0.25F);
            if (this.field20688 != null) {
               this.field20688.release();
            }

            this.field20688 = TextureUtil.method32933("blur", var6);
            this.field20687 = false;
         }

         if (this.field20688 != null) {
            Class3192.method11463(
               (float)(this.field20895 + var5),
               (float)(this.field20896 + var5),
               (float)(this.field20897 - var5 * 2),
               (float)(this.field20898 - var5 * 2),
               20.0F,
               var1 * 0.5F
            );
            Class3192.method11463(
               (float)(this.field20895 + var5),
               (float)(this.field20896 + var5),
               (float)(this.field20897 - var5 * 2),
               (float)(this.field20898 - var5 * 2),
               14.0F,
               var1
            );
            GL11.glPushMatrix();
            Class3192.method11476();
            Class3192.method11474(
               (float)this.field20895, (float)this.field20896, (float)this.field20897, (float)this.field20898, 8.0F, Class1979.field12896.field12910
            );
            Class3192.method11477(Class2329.field15940);
            Class3192.method11448(
               (float)(this.field20895 - 1),
               (float)(this.field20896 - 1),
               (float)(this.field20897 + 2),
               (float)(this.field20898 + 2),
               this.field20688,
               Class1979.field12896.field12910
            );

            while (var4.hasNext()) {
               Class7086 var11 = (Class7086)var4.next();
               int var7 = this.field20898 / 2;
               int var8 = this.field20896 + (var11.field30491 ? 0 : var7);
               int var9 = this.field20897 / 2;
               Class3192.method11421(this.field20895, var8, this.field20895 + this.field20897, var8 + var7, true);
               Class3192.method11436(
                  (float)(this.field20895 + var9),
                  (float)(var8 + this.field20898 / 4),
                  (float)(var9 * 2 - 4) * var11.field30490 + 4.0F,
                  Class5628.method17688(Class1979.field12896.field12910, (1.0F - var11.field30490 * (0.5F + var11.field30490 * 0.5F)) * 0.4F)
               );
               Class3192.method11422();
               var11.field30490 = Math.min(var11.field30490 + 3.0F / (float) Minecraft.method1586(), 1.0F);
               if (var11.field30490 == 1.0F) {
                  var4.remove();
               }
            }

            Class3192.method11478();
            Class3192.method11475(
               (float)this.field20895,
               (float)this.field20896,
               (float)this.field20897,
               (float)this.field20898,
               6.0F,
               Class5628.method17688(Class1979.field12891.field12910, 0.3F)
            );
            GL11.glPopMatrix();
            Class3192.method11439(
               ResourceRegistry.JelloMediumFont20,
               (float)(this.field20895 + 14),
               (float)(this.field20896 + 8),
               "+",
               Class5628.method17688(Class1979.field12896.field12910, 0.8F)
            );
            Class3192.method11424(
               (float)(this.field20895 + 16), (float)(this.field20896 + 65), 8.0F, 2.0F, Class5628.method17688(Class1979.field12896.field12910, 0.8F)
            );
         }
      } catch (IOException var10) {
      }

      super.method13027(var1);
   }
}