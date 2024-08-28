package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.account.Account;
import com.mentalfrostbyte.jello.account.AccountManager;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.Class4307;

import java.util.ArrayList;
import java.util.List;

public class Class4317 extends Class4307 {
   private int field21050;
   private float field21051;
   private float field21052 = 0.75F;
   private boolean field21053 = true;
   public Class4274 field21054;
   private Class4344 field21055;
   private Class4354 field21056;
   private Class4354 field21057;
   private float field21058 = 0.65F;
   private float field21059 = 1.0F - this.field21058;
   private int field21060 = 30;
   public AccountManager field21061 = Client.getInstance().getAccountManager();
   private Texture field21062;
   private float field21063;
   private Class2209 field21064 = Class2209.field14448;
   private boolean field21065 = false;
   private Class4282 field21066;
   private Class4332 field21067;
   private String field21068 = "§7Idle...";

   public Class4317() {
      super("Alt Manager");
      this.method13300(false);
      Class4352 var3;
      this.method13230(var3 = new Class4352(this, "particles"));
      var3.method13294(true);
      ArrayList var4 = new ArrayList();
      Class7970 var5 = new Class7970(Minecraft.getInstance());
      var5.method27094();
      int var6 = var5.method27099();

      for (int var7 = 0; var7 < var6; var7++) {
         Class7730 var8 = var5.method27096(var7);
         if (!var4.contains(var8.field33189)) {
            var4.add(var8.field33189);
         }
      }

      short var9 = 790;
      this.method13230(
         this.field21066 = new Class4282(
            this,
            "textbox",
            (Minecraft.getInstance().field1283.method8043() - var9) / 2 - 140,
            this.method13269() - 40,
            140,
            32,
            Class4281.field20741,
            "",
            "Search...",
            ResourceRegistry.JelloLightFont18
         )
      );
      this.field21066.method13306(ResourceRegistry.field38868);
      this.field21066.method13151(var1 -> this.method13402());
      this.method13403();
      this.method13230(
         this.field21067 = new Class4332(this, "toolbar", (Minecraft.getInstance().field1283.method8043() - var9) / 2 + 16, this.method13269() - 94)
      );
      this.field21067.method13296(false);
   }

   private void method13395(Account var1) {
      byte var4 = 52;
      Class4349 var5;
      this.field21055
         .method13230(
            var5 = new Class4349(this.field21055, var1.method34216(), 4, var4 * this.method13400() + 4, this.field21055.method13267() - 8, var4, var1)
         );
      var5.method13251((var2, var3) -> {
         if (var3 == 0) {
            Class4349 var6 = this.method13406();
            if (var6 != null) {
               var6.method13580(false);
            }

            var5.method13580(true);
            this.field21067.method13296(true);
            if (var6 != null && var6.equals(var5)) {
               this.method13398(var5);
            }
         }
      });
   }

   public void method13396() {
      Class4349 var3 = this.method13406();
      if (var3 != null) {
         this.method13398(var3);
      }
   }

   public void method13397() {
      Class4349 var3 = this.method13406();
      if (var3 != null) {
         this.field21061.method36769(var3.field21249);
         this.field21067.method13296(false);
         this.method13402();
      }
   }

   public void method13398(Class4349 var1) {
      this.method13399(var1.field21249);
   }

   public void method13399(Account var1) {
      this.field21068 = "§bLogging in...";
      new Thread(() -> {
         if (!this.field21061.method36772(var1)) {
            this.field21068 = "§cLogin Failed!";
         } else {
            this.field21068 = "§aLogged in. (" + var1.method34218() + (!var1.method34240() ? "" : " - offline name") + ")";
         }
      }).start();
   }

   @Override
   public void method13027(float var1) {
      this.method13401();
      super.method13027(var1);
      Class3192.method11439(ResourceRegistry.field38868, 20.0F, 20.0F, Minecraft.getInstance().method1533().method21526(), -2236963);
      Class3192.method11440(
         ResourceRegistry.field38868,
         (float)(this.method13267() / 2),
         20.0F,
         "Account Manager - " + this.method13400() + " alts",
         Class1979.field12896.field12910,
         Class2218.field14492,
         Class2218.field14488
      );
      Class3192.method11441(
         ResourceRegistry.field38868,
         (float)(this.method13267() / 2),
         40.0F,
         this.field21068,
         Class1979.field12896.field12910,
         Class2218.field14492,
         Class2218.field14488,
         false
      );
   }

   private int method13400() {
      int var3 = 0;

      for (Class4305 var5 : this.field21055.method13241()) {
         if (!(var5 instanceof Class4292)) {
            for (Class4305 var7 : var5.method13241()) {
               var3++;
            }
         }
      }

      return var3;
   }

   private void method13401() {
      Class3192.method11455(0.0F, 0.0F, (float)this.method13267(), (float)this.method13269(), Class7925.field33940);
      Class3192.method11424(0.0F, 0.0F, (float)this.method13267(), (float)this.method13269(), Class5628.method17688(Class1979.field12891.field12910, 0.23F));
   }

   @Override
   public void method13065(int var1) {
      super.method13065(var1);
      if (var1 == 256) {
         Minecraft.getInstance().displayGuiScreen(new Class849());
      }
   }

   @Override
   public JSONObject method13160(JSONObject var1) {
      this.field21061.method36776();
      return var1;
   }

   @Override
   public void method13161(JSONObject var1) {
      for (Class4305 var5 : this.field21055.method13241()) {
         if (!(var5 instanceof Class4292)) {
            for (Class4305 var7 : var5.method13241()) {
               this.field21055.method13234(var7);
            }
         }
      }

      this.method13402();
   }

   public void method13402() {
      this.method13222(new Class1387(this));
   }

   public void method13403() {
      List<Account> var4 = Class8270.method28878(this.field21061.method36775(), Class2209.field14448, "", this.field21066.method13303());
      int var5 = 0;
      if (this.field21055 != null) {
         var5 = this.field21055.method13513();
         this.method13236(this.field21055);
      }

      Class4305 var6 = this.method13221("alts");
      if (var6 != null) {
         this.method13236(var6);
      }

      int var7 = Minecraft.getInstance().field1283.method8043() - 200;
      int var8 = this.method13267() - var7;
      this.method13233(this.field21055 = new Class4344(this, "alts", var8 / 2, 69, var7, Minecraft.getInstance().field1283.method8044() - 169));

      for (Account var10 : var4) {
         this.method13395(var10);
      }

      this.field21055.method13512(var5);
      this.field21055.method13300(false);
      this.field21055.method13515(true);
      this.field21055.method13242();
   }

   private void method13404(Object var1) {
   }

   public int method13405() {
      return Minecraft.getInstance().field1283.method8044() / 12 + 280 + Minecraft.getInstance().field1283.method8044() / 12;
   }

   public Class4349 method13406() {
      for (Class4305 var4 : this.field21055.method13241()) {
         if (!(var4 instanceof Class4292)) {
            for (Class4305 var6 : var4.method13241()) {
               if (var6 instanceof Class4349) {
                  Class4349 var7 = (Class4349)var6;
                  if (var7.method13582()) {
                     return var7;
                  }
               }
            }
         }
      }

      return null;
   }
}