package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.network.Class9507;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.MathUtils;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import totalcross.json.JSONArray;

public class RedeemKeyScreen extends Class4305 {
   public String field21135 = "";
   public Animation field21136 = new Animation(380, 200, Direction.BACKWARDS);
   private static JSONArray field21137;
   private Class4281 field21138;

   public RedeemKeyScreen(Class4305 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.method13300(false);
      Class4281 var9;
      this.method13230(var9 = new Class4281(this, "redeemBox", 100, 200, 350, 50, Class4281.field20742, "", "Premium Code"));
      UIButton var10;
      this.method13230(
         var10 = new UIButton(
            this,
            "redeembtn",
            100,
            290,
            80,
            30,
            new Class6387(ClientColors.LIGHT_GREYISH_BLUE.getColor, ClientColors.LIGHT_GREYISH_BLUE.getColor, ClientColors.LIGHT_GREYISH_BLUE.getColor),
            "Redeem",
            ResourceRegistry.JelloLightFont20
         )
      );
      this.method13230(this.field21138 = new Class4281(this, "captcha", 195, 290, 75, 35, Class4281.field20742, "", "Captcha"));
      this.field21138.method13306(ResourceRegistry.JelloLightFont18);
      this.field21138.method13288(false);
      var10.method13251((var2x, var3x) -> new Thread(() -> {
            Class9507 var4x = Client.getInstance().getNetworkManager().method30452();
            if (var4x != null) {
               var4x.method36706(this.field21138.method13303());
            }

            this.field21135 = Client.getInstance().getNetworkManager().method30451(var9.method13303(), Client.getInstance().getNetworkManager().method30452());
            if (this.field21135 == null) {
               this.field21135 = "";
            }

            if (Client.getInstance().getNetworkManager().isPremium()) {
               this.method13222(() -> ((Class4310)this.method13258()).method13340());
            }
         }).start());
   }

   @Override
   public void draw(float var1) {
      this.field21136.changeDirection(!this.isHovered() ? Direction.BACKWARDS : Direction.FORWARDS);
      var1 = 1.0F;
      var1 *= this.field21136.calcPercent();
      float var4 = MathUtils.lerp(this.field21136.calcPercent(), 0.17, 1.0, 0.51, 1.0);
      if (this.field21136.getDirection() == Direction.BACKWARDS) {
         var4 = 1.0F;
      }

      this.drawBackground((int)(150.0F * (1.0F - var4)));
      this.method13225();
      Class9507 var5 = Client.getInstance().getNetworkManager().method30452();
      if (var5 != null) {
         this.field21138.method13288(var5.method36702());
         if (var5.method36701() != null) {
            RenderUtil.method11419((float)(this.field20895 + 295), (float)(this.field20896 + 280), 190.0F, 50.0F);
            RenderUtil.method11449(
               (float)(this.field20895 + 316),
               (float)(this.field20896 + 280),
               190.0F,
               190.0F,
               var5.method36701(),
               ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1)
            );
            RenderUtil.method11422();
         }
      }

      RenderUtil.drawString(ResourceRegistry.JelloLightFont36, 100.0F, 100.0F, "Redeem Premium", ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var1));
      RenderUtil.drawString(
         ResourceRegistry.JelloLightFont25,
         100.0F,
         150.0F,
         "Visit http://sigmaclient.info for more info",
         ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.6F * var1)
      );
      RenderUtil.drawString(ResourceRegistry.JelloLightFont18, 100.0F, 263.0F, this.field21135, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.6F * var1));
      super.draw(var1);
   }
}