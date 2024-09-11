package mapped;

import com.mentalfrostbyte.jello.viaversion.data.PlayerData;
import com.mentalfrostbyte.jello.viaversion.managers.SmallResourceManager;

public class Class6261 extends Class6255 {
   @Override
   public String method19220() {
      return "autoteam";
   }

   @Override
   public String method19221() {
      return "Toggle automatically teaming to prevent colliding.";
   }

   @Override
   public boolean method19222(PlayerData var1, String[] var2) {
      SmallResourceManager var5 = ViaVersion3.method27613().getResourceManager2();
      boolean var6 = !ViaVersion3.method27612().method21913();
      var5.method21879("auto-team", var6);
      var5.method21880();
      this.method19227(var1, "&6We will %s", new Object[]{!var6 ? "&cno longer auto team players" : "&aautomatically team players"});
      this.method19227(var1, "&6All players will need to re-login for the change to take place.", new Object[0]);
      return true;
   }
}
