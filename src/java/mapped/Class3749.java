package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;

import javax.annotation.Nullable;
import java.util.List;

public class Class3749 extends Class3676<Class1042> {
   private static String[] field19896;
   private BlockPos field19897;
   private long field19898;
   private int field19899;
   private final List<BlockPos> field19900 = Lists.newArrayList();

   public Class3749() {
      super(ImmutableMap.of(Class8830.field39825, Class2217.field14485, Class8830.field39824, Class2217.field14485, Class8830.field39817, Class2217.field14484));
   }

   public boolean method12508(ServerWorld var1, Class1042 var2) {
      if (!var1.method6789().method17135(Class5462.field24224)) {
         return false;
      } else if (var2.method4674().method26571() != Class8395.field36016) {
         return false;
      } else {
         Mutable var5 = var2.method3432().method8354();
         this.field19900.clear();

         for (int var6 = -1; var6 <= 1; var6++) {
            for (int var7 = -1; var7 <= 1; var7++) {
               for (int var8 = -1; var8 <= 1; var8++) {
                  var5.method8373(var2.getPosX() + (double)var6, var2.getPosY() + (double)var7, var2.getPosZ() + (double)var8);
                  if (this.method12711(var5, var1)) {
                     this.field19900.add(new BlockPos(var5));
                  }
               }
            }
         }

         this.field19897 = this.method12710(var1);
         return this.field19897 != null;
      }
   }

   @Nullable
   private BlockPos method12710(ServerWorld var1) {
      return !this.field19900.isEmpty() ? this.field19900.get(var1.method6814().nextInt(this.field19900.size())) : null;
   }

   private boolean method12711(BlockPos var1, ServerWorld var2) {
      Class7380 var5 = var2.method6738(var1);
      Block var6 = var5.method23383();
      Block var7 = var2.method6738(var1.method8313()).method23383();
      return var6 instanceof Class3480 && ((Class3480)var6).method12179(var5) || var5.method23393() && var7 instanceof Class3221;
   }

   public void method12502(ServerWorld var1, Class1042 var2, long var3) {
      if (var3 > this.field19898 && this.field19897 != null) {
         var2.method2992().method21406(Class8830.field39825, new Class7863(this.field19897));
         var2.method2992().method21406(Class8830.field39824, new Class8999(new Class7863(this.field19897), 0.5F, 1));
      }
   }

   public void method12506(ServerWorld var1, Class1042 var2, long var3) {
      var2.method2992().method21405(Class8830.field39825);
      var2.method2992().method21405(Class8830.field39824);
      this.field19899 = 0;
      this.field19898 = var3 + 40L;
   }

   public void method12504(ServerWorld var1, Class1042 var2, long var3) {
      if (this.field19897 == null || this.field19897.method8317(var2.getPositionVec(), 1.0)) {
         if (this.field19897 != null && var3 > this.field19898) {
            Class7380 var7 = var1.method6738(this.field19897);
            Block var8 = var7.method23383();
            Block var9 = var1.method6738(this.field19897.method8313()).method23383();
            if (var8 instanceof Class3480 && ((Class3480)var8).method12179(var7)) {
               var1.method7180(this.field19897, true, var2);
            }

            if (var7.method23393() && var9 instanceof Class3221 && var2.method4712()) {
               Class927 var10 = var2.method4752();

               for (int var11 = 0; var11 < var10.method3629(); var11++) {
                  ItemStack var12 = var10.method3618(var11);
                  boolean var13 = false;
                  if (!var12.method32105()) {
                     if (var12.method32107() != Class8514.field37841) {
                        if (var12.method32107() != Class8514.field38053) {
                           if (var12.method32107() != Class8514.field38052) {
                              if (var12.method32107() == Class8514.field38112) {
                                 var1.method6725(this.field19897, Blocks.field36884.method11579(), 3);
                                 var13 = true;
                              }
                           } else {
                              var1.method6725(this.field19897, Blocks.field36693.method11579(), 3);
                              var13 = true;
                           }
                        } else {
                           var1.method6725(this.field19897, Blocks.field36694.method11579(), 3);
                           var13 = true;
                        }
                     } else {
                        var1.method6725(this.field19897, Blocks.field36539.method11579(), 3);
                        var13 = true;
                     }
                  }

                  if (var13) {
                     var1.method6743(
                        (PlayerEntity)null,
                        (double)this.field19897.method8304(),
                        (double)this.field19897.getY(),
                        (double)this.field19897.method8306(),
                        Class6067.field26486,
                        Class2266.field14732,
                        1.0F,
                        1.0F
                     );
                     var12.method32182(1);
                     if (var12.method32105()) {
                        var10.method3621(var11, ItemStack.EMPTY);
                     }
                     break;
                  }
               }
            }

            if (var8 instanceof Class3480 && !((Class3480)var8).method12179(var7)) {
               this.field19900.remove(this.field19897);
               this.field19897 = this.method12710(var1);
               if (this.field19897 != null) {
                  this.field19898 = var3 + 20L;
                  var2.method2992().method21406(Class8830.field39824, new Class8999(new Class7863(this.field19897), 0.5F, 1));
                  var2.method2992().method21406(Class8830.field39825, new Class7863(this.field19897));
               }
            }
         }

         this.field19899++;
      }
   }

   public boolean method12499(ServerWorld var1, Class1042 var2, long var3) {
      return this.field19899 < 200;
   }
}
