package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Class6887 extends Class6886 {
   private static String[] field29847;
   private final Class314 field29848;
   private final Set<Class8375> field29849 = Sets.newHashSet();
   private Runnable[] field29850 = new Runnable[0];

   public Class6887(Class314 var1) {
      this.field29848 = var1;
   }

   @Override
   public void method21002(Class9411 var1) {
      super.method21002(var1);
      if (this.field29849.contains(var1.method36053())) {
         this.field29848
            .method1367()
            .method19456(new Class5556(Class2073.field13503, var1.method36053().method29336(), var1.method36054(), var1.method36050()));
      }

      this.method21022();
   }

   @Override
   public void method21003(String var1) {
      super.method21003(var1);
      this.field29848.method1367().method19456(new Class5556(Class2073.field13504, (String)null, var1, 0));
      this.method21022();
   }

   @Override
   public void method21004(String var1, Class8375 var2) {
      super.method21004(var1, var2);
      if (this.field29849.contains(var2)) {
         this.field29848.method1367().method19456(new Class5556(Class2073.field13504, var2.method29336(), var1, 0));
      }

      this.method21022();
   }

   @Override
   public void method20988(int var1, Class8375 var2) {
      Class8375 var5 = this.method20989(var1);
      super.method20988(var1, var2);
      if (var5 != var2 && var5 != null) {
         if (this.method21027(var5) <= 0) {
            this.method21026(var5);
         } else {
            this.field29848.method1367().method19456(new Class5615(var1, var2));
         }
      }

      if (var2 != null) {
         if (!this.field29849.contains(var2)) {
            this.method21024(var2);
         } else {
            this.field29848.method1367().method19456(new Class5615(var1, var2));
         }
      }

      this.method21022();
   }

   @Override
   public boolean method20993(String var1, Class8218 var2) {
      if (!super.method20993(var1, var2)) {
         return false;
      } else {
         this.field29848.method1367().method19456(new Class5581(var2, Arrays.<String>asList(var1), 3));
         this.method21022();
         return true;
      }
   }

   @Override
   public void method20995(String var1, Class8218 var2) {
      super.method20995(var1, var2);
      this.field29848.method1367().method19456(new Class5581(var2, Arrays.<String>asList(var1), 4));
      this.method21022();
   }

   @Override
   public void method20999(Class8375 var1) {
      super.method20999(var1);
      this.method21022();
   }

   @Override
   public void method21000(Class8375 var1) {
      super.method21000(var1);
      if (this.field29849.contains(var1)) {
         this.field29848.method1367().method19456(new Class5576(var1, 2));
      }

      this.method21022();
   }

   @Override
   public void method21001(Class8375 var1) {
      super.method21001(var1);
      if (this.field29849.contains(var1)) {
         this.method21026(var1);
      }

      this.method21022();
   }

   @Override
   public void method21005(Class8218 var1) {
      super.method21005(var1);
      this.field29848.method1367().method19456(new Class5581(var1, 0));
      this.method21022();
   }

   @Override
   public void method21006(Class8218 var1) {
      super.method21006(var1);
      this.field29848.method1367().method19456(new Class5581(var1, 2));
      this.method21022();
   }

   @Override
   public void method21007(Class8218 var1) {
      super.method21007(var1);
      this.field29848.method1367().method19456(new Class5581(var1, 1));
      this.method21022();
   }

   public void method21021(Runnable var1) {
      this.field29850 = Arrays.<Runnable>copyOf(this.field29850, this.field29850.length + 1);
      this.field29850[this.field29850.length - 1] = var1;
   }

   public void method21022() {
      for (Runnable var6 : this.field29850) {
         var6.run();
      }
   }

   public List<Packet<?>> method21023(Class8375 var1) {
      ArrayList var4 = Lists.newArrayList();
      var4.add(new Class5576(var1, 0));

      for (int var5 = 0; var5 < 19; var5++) {
         if (this.method20989(var5) == var1) {
            var4.add(new Class5615(var5, var1));
         }
      }

      for (Class9411 var6 : this.method20981(var1)) {
         var4.add(new Class5556(Class2073.field13503, var6.method36053().method29336(), var6.method36054(), var6.method36050()));
      }

      return var4;
   }

   public void method21024(Class8375 var1) {
      List<Packet<?>> var4 = this.method21023(var1);

      for (Class878 var6 : this.field29848.method1367().method19488()) {
         for (Packet var8 : var4) {
            var6.field4855.method15671(var8);
         }
      }

      this.field29849.add(var1);
   }

   public List<Packet<?>> method21025(Class8375 var1) {
      ArrayList var4 = Lists.newArrayList();
      var4.add(new Class5576(var1, 1));

      for (int var5 = 0; var5 < 19; var5++) {
         if (this.method20989(var5) == var1) {
            var4.add(new Class5615(var5, var1));
         }
      }

      return var4;
   }

   public void method21026(Class8375 var1) {
      List<Packet<?>> var4 = this.method21025(var1);

      for (Class878 var6 : this.field29848.method1367().method19488()) {
         for (Packet var8 : var4) {
            var6.field4855.method15671(var8);
         }
      }

      this.field29849.remove(var1);
   }

   public int method21027(Class8375 var1) {
      int var4 = 0;

      for (int var5 = 0; var5 < 19; var5++) {
         if (this.method20989(var5) == var1) {
            var4++;
         }
      }

      return var4;
   }
}