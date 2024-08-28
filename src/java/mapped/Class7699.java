package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7699 {
   private static final ITextComponent field32968 = new TranslationTextComponent("event.minecraft.raid");
   private static final ITextComponent field32969 = new TranslationTextComponent("event.minecraft.raid.victory");
   private static final ITextComponent field32970 = new TranslationTextComponent("event.minecraft.raid.defeat");
   private static final ITextComponent field32971 = field32968.deepCopy().appendString(" - ").append(field32969);
   private static final ITextComponent field32972 = field32968.deepCopy().appendString(" - ").append(field32970);
   private final Map<Integer, Class1026> field32973 = Maps.newHashMap();
   private final Map<Integer, Set<Class1026>> field32974 = Maps.newHashMap();
   private final Set<UUID> field32975 = Sets.newHashSet();
   private long field32976;
   private BlockPos field32977;
   private final Class1657 field32978;
   private boolean field32979;
   private final int field32980;
   private float field32981;
   private int field32982;
   private boolean field32983;
   private int field32984;
   private final Class3624 field32985 = new Class3624(field32968, Class2303.field15722, Class2300.field15705);
   private int field32986;
   private int field32987;
   private final Random field32988 = new Random();
   private final int field32989;
   private Class2305 field32990;
   private int field32991;
   private Optional<BlockPos> field32992 = Optional.<BlockPos>empty();

   public Class7699(int var1, Class1657 var2, BlockPos var3) {
      this.field32980 = var1;
      this.field32978 = var2;
      this.field32983 = true;
      this.field32987 = 300;
      this.field32985.method12278(0.0F);
      this.field32977 = var3;
      this.field32989 = this.method25435(var2.method6997());
      this.field32990 = Class2305.field15739;
   }

   public Class7699(Class1657 var1, Class39 var2) {
      this.field32978 = var1;
      this.field32980 = var2.method122("Id");
      this.field32979 = var2.method132("Started");
      this.field32983 = var2.method132("Active");
      this.field32976 = var2.method123("TicksActive");
      this.field32982 = var2.method122("BadOmenLevel");
      this.field32984 = var2.method122("GroupsSpawned");
      this.field32987 = var2.method122("PreRaidTicks");
      this.field32986 = var2.method122("PostRaidTicks");
      this.field32981 = var2.method124("TotalHealth");
      this.field32977 = new BlockPos(var2.method122("CX"), var2.method122("CY"), var2.method122("CZ"));
      this.field32989 = var2.method122("NumGroups");
      this.field32990 = Class2305.method9075(var2.method126("Status"));
      this.field32975.clear();
      if (var2.method119("HeroesOfTheVillage", 9)) {
         Class41 var5 = var2.method131("HeroesOfTheVillage", 11);

         for (int var6 = 0; var6 < var5.size(); var6++) {
            this.field32975.add(Class8354.method29282(var5.get(var6)));
         }
      }
   }

   public boolean method25388() {
      return this.method25392() || this.method25393();
   }

   public boolean method25389() {
      return this.method25390() && this.method25418() == 0 && this.field32987 > 0;
   }

   public boolean method25390() {
      return this.field32984 > 0;
   }

   public boolean method25391() {
      return this.field32990 == Class2305.field15742;
   }

   public boolean method25392() {
      return this.field32990 == Class2305.field15740;
   }

   public boolean method25393() {
      return this.field32990 == Class2305.field15741;
   }

   public Class1655 method25394() {
      return this.field32978;
   }

   public boolean method25395() {
      return this.field32979;
   }

   public int method25396() {
      return this.field32984;
   }

   private Predicate<Class878> method25397() {
      return var1 -> {
         BlockPos var4 = var1.method3432();
         return var1.method3066() && this.field32978.method6957(var4) == this;
      };
   }

   private void method25398() {
      Set<Class878> var3 = Sets.newHashSet(this.field32985.method12288());
      List<Class878> var4 = this.field32978.method6914(this.method25397());

      for (Class878 var6 : var4) {
         if (!var3.contains(var6)) {
            this.field32985.method12263(var6);
         }
      }

      for (Class878 var8 : var3) {
         if (!var4.contains(var8)) {
            this.field32985.method12265(var8);
         }
      }
   }

   public int method25399() {
      return 5;
   }

   public int method25400() {
      return this.field32982;
   }

   public void method25401(PlayerEntity var1) {
      if (var1.method3033(Class8254.field35497)) {
         this.field32982 = this.field32982 + var1.method3034(Class8254.field35497).method8629() + 1;
         this.field32982 = Class9679.method37775(this.field32982, 0, this.method25399());
      }

      var1.method3040(Class8254.field35497);
   }

   public void method25402() {
      this.field32983 = false;
      this.field32985.method12266();
      this.field32990 = Class2305.field15742;
   }

   public void method25403() {
      if (!this.method25391()) {
         if (this.field32990 != Class2305.field15739) {
            if (this.method25388()) {
               this.field32991++;
               if (this.field32991 >= 600) {
                  this.method25402();
                  return;
               }

               if (this.field32991 % 20 == 0) {
                  this.method25398();
                  this.field32985.method12287(true);
                  if (!this.method25392()) {
                     this.field32985.method12284(field32972);
                  } else {
                     this.field32985.method12278(0.0F);
                     this.field32985.method12284(field32971);
                  }
               }
            }
         } else {
            boolean var3 = this.field32983;
            this.field32983 = this.field32978.method7017(this.field32977);
            if (this.field32978.method6997() == Class2197.field14351) {
               this.method25402();
               return;
            }

            if (var3 != this.field32983) {
               this.field32985.method12287(this.field32983);
            }

            if (!this.field32983) {
               return;
            }

            if (!this.field32978.method6952(this.field32977)) {
               this.method25404();
            }

            if (!this.field32978.method6952(this.field32977)) {
               if (this.field32984 <= 0) {
                  this.method25402();
               } else {
                  this.field32990 = Class2305.field15741;
               }
            }

            this.field32976++;
            if (this.field32976 >= 48000L) {
               this.method25402();
               return;
            }

            int var4 = this.method25418();
            if (var4 == 0 && this.method25406()) {
               if (this.field32987 <= 0) {
                  if (this.field32987 == 0 && this.field32984 > 0) {
                     this.field32987 = 300;
                     this.field32985.method12284(field32968);
                     return;
                  }
               } else {
                  boolean var5 = this.field32992.isPresent();
                  boolean var6 = !var5 && this.field32987 % 5 == 0;
                  if (var5 && !this.field32978.method6883().method7352(new Class7481(this.field32992.get()))) {
                     var6 = true;
                  }

                  if (var6) {
                     byte var7 = 0;
                     if (this.field32987 >= 100) {
                        if (this.field32987 < 40) {
                           var7 = 2;
                        }
                     } else {
                        var7 = 1;
                     }

                     this.field32992 = this.method25405(var7);
                  }

                  if (this.field32987 == 300 || this.field32987 % 20 == 0) {
                     this.method25398();
                  }

                  this.field32987--;
                  this.field32985.method12278(Class9679.method37777((float)(300 - this.field32987) / 300.0F, 0.0F, 1.0F));
               }
            }

            if (this.field32976 % 20L == 0L) {
               this.method25398();
               this.method25411();
               if (var4 <= 0) {
                  this.field32985.method12284(field32968);
               } else if (var4 > 2) {
                  this.field32985.method12284(field32968);
               } else {
                  this.field32985
                     .method12284(
                        field32968.deepCopy().appendString(" - ").append(new TranslationTextComponent("event.minecraft.raid.raiders_remaining", var4))
                     );
               }
            }

            boolean var12 = false;
            int var13 = 0;

            while (this.method25417()) {
               BlockPos var14 = !this.field32992.isPresent() ? this.method25423(var13, 20) : this.field32992.get();
               if (var14 == null) {
                  var13++;
               } else {
                  this.field32979 = true;
                  this.method25413(var14);
                  if (!var12) {
                     this.method25412(var14);
                     var12 = true;
                  }
               }

               if (var13 > 3) {
                  this.method25402();
                  break;
               }
            }

            if (this.method25395() && !this.method25406() && var4 == 0) {
               if (this.field32986 >= 40) {
                  this.field32990 = Class2305.field15740;

                  for (UUID var8 : this.field32975) {
                     Entity var9 = this.field32978.method6942(var8);
                     if (var9 instanceof Class880 && !var9.method2800()) {
                        Class880 var10 = (Class880)var9;
                        var10.method3035(new Class2023(Class8254.field35498, 48000, this.field32982 - 1, false, false, true));
                        if (var10 instanceof Class878) {
                           Class878 var11 = (Class878)var10;
                           var11.method2911(Class8876.field40174);
                           Class9551.field44498.method15062(var11);
                        }
                     }
                  }
               } else {
                  this.field32986++;
               }
            }

            this.method25420();
         }
      }
   }

   private void method25404() {
      Stream<Class2002> var3 = Class2002.method8427(Class2002.method8390(this.field32977), 2);
      var3.filter(this.field32978::method6953)
         .map(Class2002::method8422)
         .min(Comparator.comparingDouble(var1 -> var1.method8318(this.field32977)))
         .ifPresent(this::method25429);
   }

   private Optional<BlockPos> method25405(int var1) {
      for (int var4 = 0; var4 < 3; var4++) {
         BlockPos var5 = this.method25423(var1, 1);
         if (var5 != null) {
            return Optional.<BlockPos>of(var5);
         }
      }

      return Optional.<BlockPos>empty();
   }

   private boolean method25406() {
      return !this.method25408() ? !this.method25407() : !this.method25409();
   }

   private boolean method25407() {
      return this.method25396() == this.field32989;
   }

   private boolean method25408() {
      return this.field32982 > 1;
   }

   private boolean method25409() {
      return this.method25396() > this.field32989;
   }

   private boolean method25410() {
      return this.method25407() && this.method25418() == 0 && this.method25408();
   }

   private void method25411() {
      Iterator<Set<Class1026>> var3 = this.field32974.values().iterator();
      Set<Class1026> var4 = Sets.newHashSet();

      while (var3.hasNext()) {
         Set<Class1026> var5 = var3.next();

         for (Class1026 var7 : var5) {
            BlockPos var8 = var7.method3432();
            if (var7.field5041 || var7.field5024.method6813() != this.field32978.method6813() || this.field32977.method8318(var8) >= 12544.0) {
               var4.add(var7);
            } else if (var7.field5055 > 600) {
               if (this.field32978.method6942(var7.method3375()) == null) {
                  var4.add(var7);
               }

               if (!this.field32978.method6952(var8) && var7.method3021() > 2400) {
                  var7.method4558(var7.method4557() + 1);
               }

               if (var7.method4557() >= 30) {
                  var4.add(var7);
               }
            }
         }
      }

      for (Class1026 var10 : var4) {
         this.method25419(var10, true);
      }
   }

   private void method25412(BlockPos var1) {
      float var4 = 13.0F;
      byte var5 = 64;
      Collection var6 = this.field32985.method12288();

      for (Class878 var8 : this.field32978.method6870()) {
         Vector3d var9 = var8.method3431();
         Vector3d var10 = Vector3d.method11328(var1);
         float var11 = Class9679.method37766(
            (var10.field18048 - var9.field18048) * (var10.field18048 - var9.field18048)
               + (var10.field18050 - var9.field18050) * (var10.field18050 - var9.field18050)
         );
         double var12 = var9.field18048 + (double)(13.0F / var11) * (var10.field18048 - var9.field18048);
         double var14 = var9.field18050 + (double)(13.0F / var11) * (var10.field18050 - var9.field18050);
         if (var11 <= 64.0F || var6.contains(var8)) {
            var8.field4855.method15671(new Class5584(Class6067.field26992, Class2266.field14734, var12, var8.getPosY(), var14, 64.0F, 1.0F));
         }
      }
   }

   private void method25413(BlockPos var1) {
      boolean var4 = false;
      int var5 = this.field32984 + 1;
      this.field32981 = 0.0F;
      Class9755 var6 = this.field32978.method6807(var1);
      boolean var7 = this.method25410();

      for (Class2127 var11 : Class2127.method8808()) {
         int var12 = this.method25431(var11, var5, var7) + this.method25432(var11, this.field32988, var5, var6, var7);
         int var13 = 0;

         for (int var14 = 0; var14 < var12; var14++) {
            Class1026 var15 = (Class1026)Class2127.method8809(var11).method33215(this.field32978);
            if (!var4 && var15.method4570()) {
               var15.method4576(true);
               this.method25426(var5, var15);
               var4 = true;
            }

            this.method25414(var5, var15, var1, false);
            if (Class2127.method8809(var11) == Class8992.field41072) {
               Class1026 var16 = null;
               if (var5 != this.method25435(Class2197.field14353)) {
                  if (var5 >= this.method25435(Class2197.field14354)) {
                     if (var13 != 0) {
                        var16 = Class8992.field41099.method33215(this.field32978);
                     } else {
                        var16 = Class8992.field41027.method33215(this.field32978);
                     }
                  }
               } else {
                  var16 = Class8992.field41067.method33215(this.field32978);
               }

               var13++;
               if (var16 != null) {
                  this.method25414(var5, var16, var1, false);
                  var16.method3272(var1, 0.0F, 0.0F);
                  var16.method3311(var15);
               }
            }
         }
      }

      this.field32992 = Optional.<BlockPos>empty();
      this.field32984++;
      this.method25415();
      this.method25420();
   }

   public void method25414(int var1, Class1026 var2, BlockPos var3, boolean var4) {
      boolean var7 = this.method25424(var1, var2);
      if (var7) {
         var2.method4550(this);
         var2.method4553(var1);
         var2.method4548(true);
         var2.method4558(0);
         if (!var4 && var3 != null) {
            var2.method3215((double)var3.method8304() + 0.5, (double)var3.getY() + 1.0, (double)var3.method8306() + 0.5);
            var2.method4276(this.field32978, this.field32978.method6807(var3), Class2202.field14398, (Class5093)null, (Class39)null);
            var2.method4545(var1, false);
            var2.method3061(true);
            this.field32978.method6995(var2);
         }
      }
   }

   public void method25415() {
      this.field32985.method12278(Class9679.method37777(this.method25416() / this.field32981, 0.0F, 1.0F));
   }

   public float method25416() {
      float var3 = 0.0F;

      for (Set<Class1026> var5 : this.field32974.values()) {
         for (Class1026 var7 : var5) {
            var3 += var7.method3042();
         }
      }

      return var3;
   }

   private boolean method25417() {
      return this.field32987 == 0 && (this.field32984 < this.field32989 || this.method25410()) && this.method25418() == 0;
   }

   public int method25418() {
      return this.field32974.values().stream().mapToInt(Set::size).sum();
   }

   public void method25419(Class1026 var1, boolean var2) {
      Set var5 = this.field32974.get(var1.method4554());
      if (var5 != null) {
         boolean var6 = var5.remove(var1);
         if (var6) {
            if (var2) {
               this.field32981 = this.field32981 - var1.method3042();
            }

            var1.method4550((Class7699)null);
            this.method25415();
            this.method25420();
         }
      }
   }

   private void method25420() {
      this.field32978.method6956().method24605();
   }

   public static Class8848 method25421() {
      Class8848 var2 = new Class8848(Class8514.field38092);
      Class39 var3 = var2.method32144("BlockEntityTag");
      Class41 var4 = new Class7291()
         .method23058(Class2154.field14107, Class112.field395)
         .method23058(Class2154.field14087, Class112.field394)
         .method23058(Class2154.field14091, Class112.field393)
         .method23058(Class2154.field14112, Class112.field394)
         .method23058(Class2154.field14092, Class112.field401)
         .method23058(Class2154.field14109, Class112.field394)
         .method23058(Class2154.field14106, Class112.field394)
         .method23058(Class2154.field14112, Class112.field401)
         .method23059();
      var3.method99("Patterns", var4);
      var2.method32156(Class2304.field15735);
      var2.method32150(new TranslationTextComponent("block.minecraft.ominous_banner").mergeStyle(TextFormatting.GOLD));
      return var2;
   }

   @Nullable
   public Class1026 method25422(int var1) {
      return this.field32973.get(var1);
   }

   @Nullable
   private BlockPos method25423(int var1, int var2) {
      int var5 = var1 != 0 ? 2 - var1 : 2;
      Mutable var6 = new Mutable();

      for (int var7 = 0; var7 < var2; var7++) {
         float var8 = this.field32978.field9016.nextFloat() * (float) (Math.PI * 2);
         int var9 = this.field32977.method8304()
            + Class9679.method37767(Class9679.method37764(var8) * 32.0F * (float)var5)
            + this.field32978.field9016.nextInt(5);
         int var10 = this.field32977.method8306()
            + Class9679.method37767(Class9679.method37763(var8) * 32.0F * (float)var5)
            + this.field32978.field9016.nextInt(5);
         int var11 = this.field32978.method6736(Class101.field296, var9, var10);
         var6.method8372(var9, var11, var10);
         if ((!this.field32978.method6952(var6) || var1 >= 2)
            && this.field32978
               .method7019(
                  var6.method8304() - 10,
                  var6.getY() - 10,
                  var6.method8306() - 10,
                  var6.method8304() + 10,
                  var6.getY() + 10,
                  var6.method8306() + 10
               )
            && this.field32978.method6883().method7352(new Class7481(var6))
            && (
               Class8170.method28429(Class2068.field13472, this.field32978, var6, Class8992.field41072)
                  || this.field32978.method6738(var6.method8313()).method23448(Blocks.SNOW) && this.field32978.method6738(var6).method23393()
            )) {
            return var6;
         }
      }

      return null;
   }

   private boolean method25424(int var1, Class1026 var2) {
      return this.method25425(var1, var2, true);
   }

   public boolean method25425(int var1, Class1026 var2, boolean var3) {
      this.field32974.computeIfAbsent(var1, var0 -> Sets.newHashSet());
      Set<Class1026> var6 = this.field32974.get(var1);
      Class1026 var7 = null;

      for (Class1026 var9 : var6) {
         if (var9.method3375().equals(var2.method3375())) {
            var7 = var9;
            break;
         }
      }

      if (var7 != null) {
         var6.remove(var7);
         var6.add(var2);
      }

      var6.add(var2);
      if (var3) {
         this.field32981 = this.field32981 + var2.method3042();
      }

      this.method25415();
      this.method25420();
      return true;
   }

   public void method25426(int var1, Class1026 var2) {
      this.field32973.put(var1, var2);
      var2.method2944(Class2106.field13736, method25421());
      var2.method4279(Class2106.field13736, 2.0F);
   }

   public void method25427(int var1) {
      this.field32973.remove(var1);
   }

   public BlockPos method25428() {
      return this.field32977;
   }

   private void method25429(BlockPos var1) {
      this.field32977 = var1;
   }

   public int method25430() {
      return this.field32980;
   }

   private int method25431(Class2127 var1, int var2, boolean var3) {
      return !var3 ? Class2127.method8810(var1)[var2] : Class2127.method8810(var1)[this.field32989];
   }

   private int method25432(Class2127 var1, Random var2, int var3, Class9755 var4, boolean var5) {
      Class2197 var8 = var4.method38327();
      boolean var9 = var8 == Class2197.field14352;
      boolean var10 = var8 == Class2197.field14353;
      int var11;
      switch (Class8994.field41134[var1.ordinal()]) {
         case 1:
            if (var9 || var3 <= 2 || var3 == 4) {
               return 0;
            }

            var11 = 1;
            break;
         case 2:
         case 3:
            if (var9) {
               var11 = var2.nextInt(2);
            } else if (var10) {
               var11 = 1;
            } else {
               var11 = 2;
            }
            break;
         case 4:
            var11 = !var9 && var5 ? 1 : 0;
            break;
         default:
            return 0;
      }

      return var11 > 0 ? var2.nextInt(var11 + 1) : 0;
   }

   public boolean method25433() {
      return this.field32983;
   }

   public Class39 method25434(Class39 var1) {
      var1.method102("Id", this.field32980);
      var1.method115("Started", this.field32979);
      var1.method115("Active", this.field32983);
      var1.method103("TicksActive", this.field32976);
      var1.method102("BadOmenLevel", this.field32982);
      var1.method102("GroupsSpawned", this.field32984);
      var1.method102("PreRaidTicks", this.field32987);
      var1.method102("PostRaidTicks", this.field32986);
      var1.method107("TotalHealth", this.field32981);
      var1.method102("NumGroups", this.field32989);
      var1.method109("Status", this.field32990.method9074());
      var1.method102("CX", this.field32977.method8304());
      var1.method102("CY", this.field32977.getY());
      var1.method102("CZ", this.field32977.method8306());
      Class41 var4 = new Class41();

      for (UUID var6 : this.field32975) {
         var4.add(Class8354.method29281(var6));
      }

      var1.method99("HeroesOfTheVillage", var4);
      return var1;
   }

   public int method25435(Class2197 var1) {
      switch (Class8994.field41135[var1.ordinal()]) {
         case 1:
            return 3;
         case 2:
            return 5;
         case 3:
            return 7;
         default:
            return 0;
      }
   }

   public float method25436() {
      int var3 = this.method25400();
      if (var3 != 2) {
         if (var3 != 3) {
            if (var3 != 4) {
               return var3 != 5 ? 0.0F : 0.75F;
            } else {
               return 0.5F;
            }
         } else {
            return 0.25F;
         }
      } else {
         return 0.1F;
      }
   }

   public void method25437(Entity var1) {
      this.field32975.add(var1.method3375());
   }
}