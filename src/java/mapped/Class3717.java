package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Class3717 extends Class3676<Class1042> {
   private static String[] field19794;
   private static final Map<Class8395, ResourceLocation> field19795 = Util.<Map<Class8395, ResourceLocation>>method38508(Maps.newHashMap(), var0 -> {
      var0.put(Class8395.field36012, Class8793.field39596);
      var0.put(Class8395.field36013, Class8793.field39597);
      var0.put(Class8395.field36014, Class8793.field39598);
      var0.put(Class8395.field36015, Class8793.field39599);
      var0.put(Class8395.field36016, Class8793.field39600);
      var0.put(Class8395.field36017, Class8793.field39601);
      var0.put(Class8395.field36018, Class8793.field39602);
      var0.put(Class8395.field36019, Class8793.field39603);
      var0.put(Class8395.field36020, Class8793.field39604);
      var0.put(Class8395.field36021, Class8793.field39605);
      var0.put(Class8395.field36023, Class8793.field39606);
      var0.put(Class8395.field36024, Class8793.field39607);
      var0.put(Class8395.field36025, Class8793.field39608);
   });
   private int field19796 = 600;
   private boolean field19797;
   private long field19798;

   public Class3717(int var1) {
      super(
         ImmutableMap.of(
            Class8830.field39824,
            Class2217.field14486,
            Class8830.field39825,
            Class2217.field14486,
            Class8830.field39828,
            Class2217.field14486,
            Class8830.field39822,
            Class2217.field14484
         ),
         var1
      );
   }

   public boolean method12508(Class1657 var1, Class1042 var2) {
      if (this.method12606(var2)) {
         if (this.field19796 <= 0) {
            return true;
         } else {
            this.field19796--;
            return false;
         }
      } else {
         return false;
      }
   }

   public void method12502(Class1657 var1, Class1042 var2, long var3) {
      this.field19797 = false;
      this.field19798 = var3;
      PlayerEntity var7 = this.method12607(var2).get();
      var2.method2992().method21406(Class8830.field39828, var7);
      Class6983.method21574(var2, var7);
   }

   public boolean method12499(Class1657 var1, Class1042 var2, long var3) {
      return this.method12606(var2) && !this.field19797;
   }

   public void method12504(Class1657 var1, Class1042 var2, long var3) {
      PlayerEntity var7 = this.method12607(var2).get();
      Class6983.method21574(var2, var7);
      if (!this.method12609(var2, var7)) {
         Class6983.method21576(var2, var7, 0.5F, 5);
      } else if (var3 - this.field19798 > 20L) {
         this.method12604(var2, var7);
         this.field19797 = true;
      }
   }

   public void method12506(Class1657 var1, Class1042 var2, long var3) {
      this.field19796 = method12610(var1);
      var2.method2992().method21405(Class8830.field39828);
      var2.method2992().method21405(Class8830.field39824);
      var2.method2992().method21405(Class8830.field39825);
   }

   private void method12604(Class1042 var1, Class880 var2) {
      for (Class8848 var6 : this.method12605(var1)) {
         Class6983.method21578(var1, var6, var2.method3431());
      }
   }

   private List<Class8848> method12605(Class1042 var1) {
      if (!var1.method3005()) {
         Class8395 var4 = var1.method4674().method26571();
         if (!field19795.containsKey(var4)) {
            return ImmutableList.of(new Class8848(Class8514.field37841));
         } else {
            Class7318 var5 = var1.field5024.method6715().method1411().method1058(field19795.get(var4));
            Class9464 var6 = new Class9464((Class1657)var1.field5024)
               .method36454(Class9525.field44335, var1.method3431())
               .method36454(Class9525.field44330, var1)
               .method36450(var1.method3013());
            return var5.method23182(var6.method36460(Class8524.field38287));
         }
      } else {
         return ImmutableList.of(new Class8848(Class8514.field37334));
      }
   }

   private boolean method12606(Class1042 var1) {
      return this.method12607(var1).isPresent();
   }

   private Optional<PlayerEntity> method12607(Class1042 var1) {
      return var1.method2992().<PlayerEntity>method21410(Class8830.field39822).filter(this::method12608);
   }

   private boolean method12608(PlayerEntity var1) {
      return var1.method3033(Class8254.field35498);
   }

   private boolean method12609(Class1042 var1, PlayerEntity var2) {
      BlockPos var5 = var2.method3432();
      BlockPos var6 = var1.method3432();
      return var6.method8316(var5, 5.0);
   }

   private static int method12610(Class1657 var0) {
      return 600 + var0.field9016.nextInt(6001);
   }
}