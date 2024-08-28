package mapped;

import com.mojang.bridge.game.GameSession;
import java.util.UUID;

public class Class9214 implements GameSession {
   private final int field42400;
   private final boolean field42401;
   private final String field42402;
   private final String field42403;
   private final UUID field42404;

   public Class9214(Class1656 var1, ClientPlayerEntity var2, ClientPlayNetHandler var3) {
      this.field42400 = var3.method15790().size();
      this.field42401 = !var3.method15589().method30702();
      this.field42402 = var1.method6997().method8909();
      Class6589 var6 = var3.method15792(var2.method3375());
      if (var6 == null) {
         this.field42403 = "unknown";
      } else {
         this.field42403 = var6.method19967().method8153();
      }

      this.field42404 = var3.method15800();
   }

   public int getPlayerCount() {
      return this.field42400;
   }

   public boolean isRemoteServer() {
      return this.field42401;
   }

   public String getDifficulty() {
      return this.field42402;
   }

   public String getGameMode() {
      return this.field42403;
   }

   public UUID getSessionId() {
      return this.field42404;
   }
}