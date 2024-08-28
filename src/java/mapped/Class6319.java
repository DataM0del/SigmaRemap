package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.datafixers.util.Pair;

import java.util.Objects;

public abstract class Class6319 extends DataFix {
   private final String field27828;

   public Class6319(String var1, Schema var2, boolean var3) {
      super(var2, var3);
      this.field27828 = var1;
   }

   public TypeRewriteRule makeRule() {
      TaggedChoiceType<String> var3 = (TaggedChoiceType<String>) this.getInputSchema().findChoiceType(Class8239.field35391);
      TaggedChoiceType<String> var4 = (TaggedChoiceType<String>) this.getOutputSchema().findChoiceType(Class8239.field35391);
      Type<Pair<String, String>> var5 = DSL.named(Class8239.field35389.typeName(), Class3639.method12354());
      if (Objects.equals(this.getOutputSchema().getType(Class8239.field35389), var5)) {
         return TypeRewriteRule.seq(this.fixTypeEverywhere(this.field27828, var3, var4, var3x -> var3xx -> var3xx.mapFirst(var3xxx -> {
                  String var6 = this.method19259(var3xxx);
                  Type var7 = var3.types().get(var3xxx);
                  Type var8 = var4.types().get(var6);
                  if (var8.equals(var7, true, true)) {
                     return var6;
                  } else {
                     throw new IllegalStateException(String.format("Dynamic type check failed: %s not equal to %s", var8, var7));
                  }
               })), this.fixTypeEverywhere(this.field27828 + " for entity name", var5, var1 -> var1x -> var1x.mapSecond(this::method19259)));
      } else {
         throw new IllegalStateException("Entity name type is not what was expected.");
      }
   }

   public abstract String method19259(String var1);
}