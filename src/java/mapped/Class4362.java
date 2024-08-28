package mapped;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class Class4362 extends Class4247 {
   private static String[] field20602;
   public static final Class6387 field21322 = new Class6387(1250067, -15329770).method19410(Class1979.field12891.field12910).method19414(Class2218.field14492);
   public List<String> field21323 = new ArrayList<String>();
   public int field21324 = 0;

   public Class4362(Class4305 var1, String var2, int var3, int var4, int var5, int var6, List<String> var7, int var8) {
      super(var1, var2, var3, var4, var5, var6, field21322, false);
      this.field21323 = var7;
      this.field21324 = var8;
      this.method13634();
   }

   private void method13634() {
      this.method13241().clear();
      this.field20913 = ResourceRegistry.JelloLightFont18;

      for (String var4 : this.field21323) {
         Class4240 var5;
         this.method13230(
            var5 = new Class4240(
               this,
               var4,
               0,
               0,
               this.method13267(),
               this.method13269(),
               new Class6387(
                  Class1979.field12896.field12910,
                  -1381654,
                  this.field20914.method19405(),
                  this.field20914.method19405(),
                  Class2218.field14488,
                  Class2218.field14492
               ),
               var4,
               this.method13305()
            )
         );
         var5.method13034(10);
         var5.method13251((var2, var3) -> {
            this.method13641(this.field21323.indexOf(var4));
            this.method13037();
         });
      }

      this.method13246(new Class7262(1));
   }

   private int method13635() {
      return this.method13269() * (this.field21323.size() - 1);
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
   }

   @Override
   public void method13027(float var1) {
      Class3192.method11426(
         (float)this.method13263(),
         (float)this.method13265(),
         (float)(this.method13263() + this.method13267()),
         (float)(this.method13265() + this.method13269() + this.method13635()),
         Class5628.method17688(Class1979.field12896.field12910, var1)
      );
      Class3192.method11463(
         (float)this.method13263(),
         (float)this.method13265(),
         (float)this.method13267(),
         (float)(this.method13269() + this.method13635() - 1),
         6.0F,
         var1 * 0.1F
      );
      Class3192.method11463(
         (float)this.method13263(),
         (float)this.method13265(),
         (float)this.method13267(),
         (float)(this.method13269() + this.method13635() - 1),
         20.0F,
         var1 * 0.2F
      );
      GL11.glPushMatrix();
      super.method13027(var1);
      GL11.glPopMatrix();
   }

   public List<String> method13636() {
      return this.field21323;
   }

   public void method13637(String var1, int var2) {
      this.method13636().add(var2, var1);
      this.method13634();
   }

   public void method13638(String var1) {
      this.method13637(var1, this.field21323.size());
   }

   public <E extends Enum<E>> void method13639(Class<E> var1) {
      this.field21323.clear();

      for (Enum var7 : (Enum[])var1.getEnumConstants()) {
         String var8 = var7.toString().substring(0, 1).toUpperCase() + var7.toString().substring(1, var7.toString().length()).toLowerCase();
         this.method13637(var8, var7.ordinal());
      }
   }

   public int method13640() {
      return this.field21324;
   }

   public void method13641(int var1) {
      this.field21324 = var1;
   }

   @Override
   public String method13303() {
      return this.method13636().size() <= 0 ? null : this.method13636().get(this.method13640());
   }

   @Override
   public boolean method13114(int var1, int var2) {
      var1 -= this.method13271();
      var2 -= this.method13272();
      return var1 >= -10 && var1 <= this.method13267() && var2 >= 0 && var2 <= this.method13269() + this.method13635();
   }
}