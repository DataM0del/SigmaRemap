package mapped;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

public class Class927 implements Class920, Class925 {
   private static String[] field5260;
   private final int field5261;
   private final Class25<ItemStack> field5262;
   private List<Class1073> field5263;

   public Class927(int var1) {
      this.field5261 = var1;
      this.field5262 = Class25.<ItemStack>method68(var1, ItemStack.EMPTY);
   }

   public Class927(ItemStack... var1) {
      this.field5261 = var1.length;
      this.field5262 = Class25.<ItemStack>method69(ItemStack.EMPTY, var1);
   }

   public void method3672(Class1073 var1) {
      if (this.field5263 == null) {
         this.field5263 = Lists.newArrayList();
      }

      this.field5263.add(var1);
   }

   public void method3673(Class1073 var1) {
      this.field5263.remove(var1);
   }

   @Override
   public ItemStack method3618(int var1) {
      return var1 >= 0 && var1 < this.field5262.size() ? this.field5262.get(var1) : ItemStack.EMPTY;
   }

   public List<ItemStack> method3674() {
      List var3 = this.field5262.stream().filter(var0 -> !var0.method32105()).collect(Collectors.toList());
      this.method3625();
      return var3;
   }

   @Override
   public ItemStack method3619(int var1, int var2) {
      ItemStack var5 = Class7920.method26563(this.field5262, var1, var2);
      if (!var5.method32105()) {
         this.method3622();
      }

      return var5;
   }

   public ItemStack method3675(Class3257 var1, int var2) {
      ItemStack var5 = new ItemStack(var1, 0);

      for (int var6 = this.field5261 - 1; var6 >= 0; var6--) {
         ItemStack var7 = this.method3618(var6);
         if (var7.method32107().equals(var1)) {
            int var8 = var2 - var5.method32179();
            ItemStack var9 = var7.method32106(var8);
            var5.method32181(var9.method32179());
            if (var5.method32179() == var2) {
               break;
            }
         }
      }

      if (!var5.method32105()) {
         this.method3622();
      }

      return var5;
   }

   public ItemStack method3676(ItemStack var1) {
      ItemStack var4 = var1.copy();
      this.method3679(var4);
      if (!var4.method32105()) {
         this.method3678(var4);
         return !var4.method32105() ? var4 : ItemStack.EMPTY;
      } else {
         return ItemStack.EMPTY;
      }
   }

   public boolean method3677(ItemStack var1) {
      boolean var4 = false;

      for (ItemStack var6 : this.field5262) {
         if (var6.method32105() || this.method3680(var6, var1) && var6.method32179() < var6.method32113()) {
            var4 = true;
            break;
         }
      }

      return var4;
   }

   @Override
   public ItemStack method3620(int var1) {
      ItemStack var4 = this.field5262.get(var1);
      if (!var4.method32105()) {
         this.field5262.set(var1, ItemStack.EMPTY);
         return var4;
      } else {
         return ItemStack.EMPTY;
      }
   }

   @Override
   public void method3621(int var1, ItemStack var2) {
      this.field5262.set(var1, var2);
      if (!var2.method32105() && var2.method32179() > this.method3630()) {
         var2.method32180(this.method3630());
      }

      this.method3622();
   }

   @Override
   public int method3629() {
      return this.field5261;
   }

   @Override
   public boolean method3617() {
      for (ItemStack var4 : this.field5262) {
         if (!var4.method32105()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public void method3622() {
      if (this.field5263 != null) {
         for (Class1073 var4 : this.field5263) {
            var4.method4902(this);
         }
      }
   }

   @Override
   public boolean method3623(PlayerEntity var1) {
      return true;
   }

   @Override
   public void method3625() {
      this.field5262.clear();
      this.method3622();
   }

   @Override
   public void method3659(Class6207 var1) {
      for (ItemStack var5 : this.field5262) {
         var1.method19117(var5);
      }
   }

   @Override
   public String toString() {
      return this.field5262.stream().filter(var0 -> !var0.method32105()).collect(Collectors.toList()).toString();
   }

   private void method3678(ItemStack var1) {
      for (int var4 = 0; var4 < this.field5261; var4++) {
         ItemStack var5 = this.method3618(var4);
         if (var5.method32105()) {
            this.method3621(var4, var1.copy());
            var1.method32180(0);
            return;
         }
      }
   }

   private void method3679(ItemStack var1) {
      for (int var4 = 0; var4 < this.field5261; var4++) {
         ItemStack var5 = this.method3618(var4);
         if (this.method3680(var5, var1)) {
            this.method3681(var1, var5);
            if (var1.method32105()) {
               return;
            }
         }
      }
   }

   private boolean method3680(ItemStack var1, ItemStack var2) {
      return var1.method32107() == var2.method32107() && ItemStack.method32127(var1, var2);
   }

   private void method3681(ItemStack var1, ItemStack var2) {
      int var5 = Math.min(this.method3630(), var2.method32113());
      int var6 = Math.min(var1.method32179(), var5 - var2.method32179());
      if (var6 > 0) {
         var2.method32181(var6);
         var1.method32182(var6);
         this.method3622();
      }
   }

   public void method3682(Class41 var1) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         ItemStack var5 = ItemStack.method32104(var1.method153(var4));
         if (!var5.method32105()) {
            this.method3676(var5);
         }
      }
   }

   public Class41 method3683() {
      Class41 var3 = new Class41();

      for (int var4 = 0; var4 < this.method3629(); var4++) {
         ItemStack var5 = this.method3618(var4);
         if (!var5.method32105()) {
            var3.add(var5.method32112(new Class39()));
         }
      }

      return var3;
   }
}
