package mapped;

import net.minecraft.util.text.ITextComponent;

public class Class1206 extends Class1200 {
   private static String[] field6511;
   public static final Class8103 field6512 = (var0, var1, var2, var3) -> {
   };
   public Class7192 field6513;
   public final Class8103 field6514;

   public Class1206(int var1, int var2, int var3, int var4, ITextComponent var5, Class7192 var6) {
      this(var1, var2, var3, var4, var5, var6, field6512);
   }

   public Class1206(int var1, int var2, int var3, int var4, ITextComponent var5, Class7192 var6, Class8103 var7) {
      super(var1, var2, var3, var4, var5);
      this.field6513 = var6;
      this.field6514 = var7;
   }

   @Override
   public void method5759() {
      this.field6513.method22591(this);
   }

   @Override
   public void method5655(Class9332 var1, int var2, int var3, float var4) {
      super.method5655(var1, var2, var3, var4);
      if (this.method5737()) {
         this.method5738(var1, var2, var3);
      }
   }

   @Override
   public void method5738(Class9332 var1, int var2, int var3) {
      this.field6514.method28070(this, var1, var2, var3);
   }
}