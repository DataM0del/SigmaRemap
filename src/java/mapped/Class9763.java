package mapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class Class9763 {
   public static final Codec<Class9763> field45673 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Class9245.field42537.optionalFieldOf("stronghold").forGetter(var0x -> Optional.<Class9245>ofNullable(var0x.field45677)),
               Codec.simpleMap(Class2348.field16114, Class8483.field36361, Class2348.field16114).fieldOf("structures").forGetter(var0x -> var0x.field45676)
            )
            .apply(var0, Class9763::new)
   );
   public static final ImmutableMap<Class2961<?>, Class8483> field45674 = ImmutableMap.<Class2961<?>, Class8483>builder()
      .put(Class2961.field18073, new Class8483(32, 8, 10387312))
      .put(Class2961.field18062, new Class8483(32, 8, 14357617))
      .put(Class2961.field18063, new Class8483(32, 8, 14357618))
      .put(Class2961.field18061, new Class8483(32, 8, 14357619))
      .put(Class2961.field18066, new Class8483(32, 8, 14357620))
      .put(Class2961.field18058, new Class8483(32, 8, 165745296))
      .put(Class2961.field18067, new Class8483(1, 0, 0))
      .put(Class2961.field18068, new Class8483(32, 5, 10387313))
      .put(Class2961.field18071, new Class8483(20, 11, 10387313))
      .put(Class2961.field18060, new Class8483(80, 20, 10387319))
      .put(Class2961.field18072, new Class8483(1, 0, 0))
      .put(Class2961.field18059, new Class8483(1, 0, 0))
      .put(Class2961.field18064, new Class8483(40, 15, 34222645))
      .put(Class2961.field18065, new Class8483(24, 4, 165745295))
      .put(Class2961.field18069, new Class8483(20, 8, 14357621))
      .put(Class2961.field18075, new Class8483(27, 4, 30084232))
      .put(Class2961.field18070, new Class8483(27, 4, 30084232))
      .put(Class2961.field18074, new Class8483(2, 1, 14357921))
      .build();
   public static final Class9245 field45675;
   private final Map<Class2961<?>, Class8483> field45676;
   private final Class9245 field45677;

   public Class9763(Optional<Class9245> var1, Map<Class2961<?>, Class8483> var2) {
      this.field45677 = var1.orElse((Class9245)null);
      this.field45676 = var2;
   }

   public Class9763(boolean var1) {
      this.field45676 = Maps.newHashMap(field45674);
      this.field45677 = !var1 ? null : field45675;
   }

   public Map<Class2961<?>, Class8483> method38380() {
      return this.field45676;
   }

   @Nullable
   public Class8483 method38381(Class2961<?> var1) {
      return this.field45676.get(var1);
   }

   @Nullable
   public Class9245 method38382() {
      return this.field45677;
   }

   static {
      for (Class2961 var7 : Class2348.field16114) {
         if (!field45674.containsKey(var7)) {
            throw new IllegalStateException("Structure feature without default settings: " + Class2348.field16114.method9181(var7));
         }
      }

      field45675 = new Class9245(32, 3, 128);
   }
}