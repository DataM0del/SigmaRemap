package mapped;

import com.mojang.datafixers.util.Either;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public interface Class6965 {
   CompletableFuture<Either<IChunk, Class7022>> method21487(
      ChunkStatus var1,
      ServerWorld var2,
      ChunkGenerator var3,
      Class8761 var4,
      Class195 var5,
      Function<IChunk, CompletableFuture<Either<IChunk, Class7022>>> var6,
      List<IChunk> var7,
      IChunk var8
   );
}
