package mapped;

import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.TextComponentUtils;

public class Class8429 {
   private static String[] field36108;
   private final int field36109;
   private final boolean field36110;
   private final boolean field36111;
   private final Predicate<Entity> field36112;
   private final Class8841 field36113;
   private final Function<Vector3d, Vector3d> field36114;
   private final Class6488 field36115;
   private final BiConsumer<Vector3d, List<? extends Entity>> field36116;
   private final boolean field36117;
   private final String field36118;
   private final UUID field36119;
   private final Class8992<?> field36120;
   private final boolean field36121;

   public Class8429(
      int var1,
      boolean var2,
      boolean var3,
      Predicate<Entity> var4,
      Class8841 var5,
      Function<Vector3d, Vector3d> var6,
      Class6488 var7,
      BiConsumer<Vector3d, List<? extends Entity>> var8,
      boolean var9,
      String var10,
      UUID var11,
      Class8992<?> var12,
      boolean var13
   ) {
      this.field36109 = var1;
      this.field36110 = var2;
      this.field36111 = var3;
      this.field36112 = var4;
      this.field36113 = var5;
      this.field36114 = var6;
      this.field36115 = var7;
      this.field36116 = var8;
      this.field36117 = var9;
      this.field36118 = var10;
      this.field36119 = var11;
      this.field36120 = var12;
      this.field36121 = var13;
   }

   public int method29611() {
      return this.field36109;
   }

   public boolean method29612() {
      return this.field36110;
   }

   public boolean method29613() {
      return this.field36117;
   }

   public boolean method29614() {
      return this.field36111;
   }

   private void method29615(Class6619 var1) throws CommandSyntaxException {
      if (this.field36121 && !var1.method20129(2)) {
         throw Class8700.field39265.create();
      }
   }

   public Entity method29616(Class6619 var1) throws CommandSyntaxException {
      this.method29615(var1);
      List var4 = this.method29617(var1);
      if (!var4.isEmpty()) {
         if (var4.size() <= 1) {
            return (Entity)var4.get(0);
         } else {
            throw Class8700.field39260.create();
         }
      } else {
         throw Class8700.field39263.create();
      }
   }

   public List<? extends Entity> method29617(Class6619 var1) throws CommandSyntaxException {
      this.method29615(var1);
      if (!this.field36110) {
         return this.method29620(var1);
      } else if (this.field36118 != null) {
         Class878 var10 = var1.method20177().method1367().method19465(this.field36118);
         return (List<? extends Entity>)(var10 != null ? Lists.newArrayList(new Class878[]{var10}) : Collections.emptyList());
      } else if (this.field36119 == null) {
         Vector3d var9 = this.field36114.apply(var1.method20171());
         Predicate var11 = this.method29621(var9);
         if (!this.field36117) {
            ArrayList var12 = Lists.newArrayList();
            if (!this.method29614()) {
               for (Class1657 var8 : var1.method20177().method1320()) {
                  this.method29618(var12, var8, var9, var11);
               }
            } else {
               this.method29618(var12, var1.method20172(), var9, var11);
            }

            return this.method29622(var9, var12);
         } else {
            return (List<? extends Entity>)(var1.method20173() != null && var11.test(var1.method20173())
               ? Lists.newArrayList(new Entity[]{var1.method20173()})
               : Collections.emptyList());
         }
      } else {
         for (Class1657 var5 : var1.method20177().method1320()) {
            Entity var6 = var5.method6942(this.field36119);
            if (var6 != null) {
               return Lists.newArrayList(new Entity[]{var6});
            }
         }

         return Collections.emptyList();
      }
   }

   private void method29618(List<Entity> var1, Class1657 var2, Vector3d var3, Predicate<Entity> var4) {
      if (this.field36115 == null) {
         var1.addAll(var2.method6912(this.field36120, var4));
      } else {
         var1.addAll(var2.method6771(this.field36120, this.field36115.method19669(var3), var4));
      }
   }

   public Class878 method29619(Class6619 var1) throws CommandSyntaxException {
      this.method29615(var1);
      List var4 = this.method29620(var1);
      if (var4.size() == 1) {
         return (Class878)var4.get(0);
      } else {
         throw Class8700.field39264.create();
      }
   }

   public List<Class878> method29620(Class6619 var1) throws CommandSyntaxException {
      this.method29615(var1);
      if (this.field36118 != null) {
         Class878 var10 = var1.method20177().method1367().method19465(this.field36118);
         return (List<Class878>)(var10 != null ? Lists.newArrayList(new Class878[]{var10}) : Collections.<Class878>emptyList());
      } else if (this.field36119 == null) {
         Vector3d var9 = this.field36114.apply(var1.method20171());
         Predicate var5 = this.method29621(var9);
         if (this.field36117) {
            if (var1.method20173() instanceof Class878) {
               Class878 var11 = (Class878)var1.method20173();
               if (var5.test(var11)) {
                  return Lists.newArrayList(new Class878[]{var11});
               }
            }

            return Collections.<Class878>emptyList();
         } else {
            List<Class878> var6;
            if (!this.method29614()) {
               var6 = Lists.newArrayList();

               for (Class878 var8 : var1.method20177().method1367().method19488()) {
                  if (var5.test(var8)) {
                     var6.add(var8);
                  }
               }
            } else {
               var6 = var1.method20172().method6914(var5::test);
            }

            return this.<Class878>method29622(var9, (List<Class878>)var6);
         }
      } else {
         Class878 var4 = var1.method20177().method1367().method19489(this.field36119);
         return (List<Class878>)(var4 != null ? Lists.newArrayList(new Class878[]{var4}) : Collections.<Class878>emptyList());
      }
   }

   private Predicate<Entity> method29621(Vector3d var1) {
      Predicate<Entity> var4 = this.field36112;
      if (this.field36115 != null) {
         Class6488 var5 = this.field36115.method19669(var1);
         var4 = var4.and(var1x -> var5.method19670(var1x.method3389()));
      }

      if (!this.field36113.method32004()) {
         var4 = var4.and(var2 -> this.field36113.method32024(var2.method3278(var1)));
      }

      return var4;
   }

   private <T extends Entity> List<T> method29622(Vector3d var1, List<T> var2) {
      if (var2.size() > 1) {
         this.field36116.accept(var1, var2);
      }

      return var2.subList(0, Math.min(this.field36109, var2.size()));
   }

   public static IFormattableTextComponent method29623(List<? extends Entity> var0) {
      return TextComponentUtils.func_240649_b_(var0, Entity::method2954);
   }
}