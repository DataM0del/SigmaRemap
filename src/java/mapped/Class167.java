package mapped;

import com.google.common.base.Predicate;
import com.mentalfrostbyte.jello.Client;

public class Class167 implements Predicate<Entity> {
   private static String[] field537;
   public final float field538;
   public final Vector3d field539;
   public final Vector3d field540;
   public final Class2309 field541;

   public Class167(Class2309 var1, float var2, Vector3d var3, Vector3d var4) {
      this.field541 = var1;
      this.field538 = var2;
      this.field539 = var3;
      this.field540 = var4;
   }

   public boolean apply(Entity var1) {
      Class6488 var4 = var1.method3389().method19662((double)this.field538, (double)this.field538, (double)this.field538);
      boolean var5 = var4.method19672(this.field539, this.field540);
      return var1 != null && var1.method3139() && var5 && !Client.getInstance().getCombatManager().method29346(var1);
   }
}