package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import org.lwjgl.opengl.GL11;

public class Class4235 extends Class4240 {
   private static String[] field20573;
   public static final Class6387 field20574 = new Class6387(Class1979.field12896.field12910, Class5628.method17691(Class1979.field12896.field12910, 0.1F));
   public Texture field20575;

   public Class4235(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Texture var7, Class6387 var8, String var9, ClientResource var10) {
      super(var1, var2, var3, var4, var5, var6, var8, var9, var10);
      this.field20575 = var7;
   }

   public Class4235(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Texture var7, Class6387 var8, String var9) {
      super(var1, var2, var3, var4, var5, var6, var8, var9);
      this.field20575 = var7;
   }

   public Class4235(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Texture var7, Class6387 var8) {
      super(var1, var2, var3, var4, var5, var6, var8);
      this.field20575 = var7;
   }

   public Class4235(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Texture var7) {
      super(var1, var2, var3, var4, var5, var6, field20574);
      this.field20575 = var7;
   }

   public Texture method13025() {
      return this.field20575;
   }

   public void method13026(Texture var1) {
      this.field20575 = var1;
   }

   @Override
   public void method13027(float var1) {
      float var4 = !this.method13295() ? 0.3F : (!this.method13216() ? (!this.method13212() ? Math.max(var1 * this.field20584, 0.0F) : 1.5F) : 0.0F);
      Class3192.method11449(
         (float)this.method13263(),
         (float)this.method13265(),
         (float)this.method13267(),
         (float)this.method13269(),
         this.method13025(),
         Class5628.method17688(
            Class5628.method17690(this.field20914.method19405(), this.field20914.method19403(), 1.0F - var4),
            (float)(this.field20914.method19405() >> 24 & 0xFF) / 255.0F * var1
         )
      );
      if (this.method13303() != null) {
         Class3192.method11440(
            this.method13305(),
            (float)(this.method13263() + this.method13267() / 2),
            (float)(this.method13265() + this.method13269() / 2),
            this.method13303(),
            Class5628.method17688(this.field20914.method19409(), var1),
            this.field20914.method19411(),
            this.field20914.method19413()
         );
      }

      GL11.glPushMatrix();
      super.method13226(var1);
      GL11.glPopMatrix();
   }
}