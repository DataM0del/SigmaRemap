package mapped;

import java.util.HashMap;
import java.util.Map;

public class Class4058 extends Class4057 {
   private static Map<String, Integer> field20390 = null;

   public Class4058() {
      super(Class8992.field41033, "fox", 0.4F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2864();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2864) {
         Class2864 var5 = (Class2864)var1;
         Map var6 = method12831();
         if (!var6.containsKey(var2)) {
            return null;
         } else {
            int var7 = (Integer)var6.get(var2);
            return (Class7219)Class9299.method35075(var5, Class9299.field43063, var7);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return method12831().keySet().<String>toArray(new String[0]);
   }

   private static Map<String, Integer> method12831() {
      if (field20390 == null) {
         field20390 = new HashMap<String, Integer>();
         field20390.put("head", 0);
         field20390.put("body", 4);
         field20390.put("leg1", 5);
         field20390.put("leg2", 6);
         field20390.put("leg3", 7);
         field20390.put("leg4", 8);
         field20390.put("tail", 9);
         return field20390;
      } else {
         return field20390;
      }
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      Class8853 var5 = Minecraft.getInstance().method1554();
      Class5650 var6 = new Class5650(var5);
      var6.field25086 = (Class2864<Class1095>)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}