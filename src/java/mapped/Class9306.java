package mapped;

import net.minecraft.world.server.ChunkManager;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class Class9306 extends Class9307 {
   private static String[] field43202;
   public final ChunkManager field43203;

   public Class9306(ChunkManager var1, Executor var2, Executor var3) {
      super(var2, var3);
      this.field43203 = var1;
   }

   @Override
   public boolean method35120(long var1) {
      return ChunkManager.method6636(this.field43203).contains(var1);
   }

   @Nullable
   @Override
   public Class8641 method35121(long var1) {
      return this.field43203.method6538(var1);
   }

   @Nullable
   @Override
   public Class8641 method35122(long var1, int var3, Class8641 var4, int var5) {
      return ChunkManager.method6637(this.field43203, var1, var3, var4, var5);
   }
}
