package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Random;
import javax.annotation.Nullable;

public class Class7872 {
   public static final Codec<Class7872> field33733 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Class6434.field28272.fieldOf("input_predicate").forGetter(var0x -> var0x.field33734),
               Class6434.field28272.fieldOf("location_predicate").forGetter(var0x -> var0x.field33735),
               Class8033.field34519.optionalFieldOf("position_predicate", Class8034.field34522).forGetter(var0x -> var0x.field33736),
               Class7380.field31585.fieldOf("output_state").forGetter(var0x -> var0x.field33737),
               Class39.field79.optionalFieldOf("output_nbt").forGetter(var0x -> Optional.<Class39>ofNullable(var0x.field33738))
            )
            .apply(var0, Class7872::new)
   );
   private final Class6434 field33734;
   private final Class6434 field33735;
   private final Class8033 field33736;
   private final Class7380 field33737;
   private final Class39 field33738;

   public Class7872(Class6434 var1, Class6434 var2, Class7380 var3) {
      this(var1, var2, Class8034.field34522, var3, Optional.<Class39>empty());
   }

   public Class7872(Class6434 var1, Class6434 var2, Class8033 var3, Class7380 var4) {
      this(var1, var2, var3, var4, Optional.<Class39>empty());
   }

   public Class7872(Class6434 var1, Class6434 var2, Class8033 var3, Class7380 var4, Optional<Class39> var5) {
      this.field33734 = var1;
      this.field33735 = var2;
      this.field33736 = var3;
      this.field33737 = var4;
      this.field33738 = (Class39)var5.orElse((Class39)null);
   }

   public boolean method26393(Class7380 var1, Class7380 var2, BlockPos var3, BlockPos var4, BlockPos var5, Random var6) {
      return this.field33734.method19540(var1, var6) && this.field33735.method19540(var2, var6) && this.field33736.method27553(var3, var4, var5, var6);
   }

   public Class7380 method26394() {
      return this.field33737;
   }

   @Nullable
   public Class39 method26395() {
      return this.field33738;
   }
}