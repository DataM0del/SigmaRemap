package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import java.util.UUID;

public class Class914 implements Class909 {
   private static final StringTextComponent field5204 = new StringTextComponent("Rcon");
   private final StringBuffer field5205 = new StringBuffer();
   private final Class314 field5206;

   public Class914(Class314 var1) {
      this.field5206 = var1;
   }

   public void method3578() {
      this.field5205.setLength(0);
   }

   public String method3579() {
      return this.field5205.toString();
   }

   public Class6619 method3580() {
      Class1657 var3 = this.field5206.method1317();
      return new Class6619(this, Vector3d.method11329(var3.method6947()), Class8513.field37212, var3, 4, "Rcon", field5204, this.field5206, (Entity)null);
   }

   @Override
   public void method1328(ITextComponent var1, UUID var2) {
      this.field5205.append(var1.getString());
   }

   @Override
   public boolean method1405() {
      return true;
   }

   @Override
   public boolean method1406() {
      return true;
   }

   @Override
   public boolean method3425() {
      return this.field5206.method1290();
   }
}