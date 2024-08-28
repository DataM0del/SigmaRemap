package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.Locale;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TranslationTextComponent;

public class Class9752 {
   public static void method38309(CommandDispatcher<Class6619> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)Class6099.method18839("title").requires(var0x -> var0x.method20129(2)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)Class6099.method18840(
                                    "targets", Class8700.method31353()
                                 )
                                 .then(
                                    Class6099.method18839("clear")
                                       .executes(var0x -> method38310((Class6619)var0x.getSource(), Class8700.method31354(var0x, "targets")))
                                 ))
                              .then(
                                 Class6099.method18839("reset")
                                    .executes(var0x -> method38311((Class6619)var0x.getSource(), Class8700.method31354(var0x, "targets")))
                              ))
                           .then(
                              Class6099.method18839("title")
                                 .then(
                                    Class6099.method18840("title", Class8010.method27395())
                                       .executes(
                                          var0x -> method38312(
                                                (Class6619)var0x.getSource(),
                                                Class8700.method31354(var0x, "targets"),
                                                Class8010.method27394(var0x, "title"),
                                                Class2301.field15710
                                             )
                                       )
                                 )
                           ))
                        .then(
                           Class6099.method18839("subtitle")
                              .then(
                                 Class6099.method18840("title", Class8010.method27395())
                                    .executes(
                                       var0x -> method38312(
                                             (Class6619)var0x.getSource(),
                                             Class8700.method31354(var0x, "targets"),
                                             Class8010.method27394(var0x, "title"),
                                             Class2301.field15711
                                          )
                                    )
                              )
                        ))
                     .then(
                        Class6099.method18839("actionbar")
                           .then(
                              Class6099.method18840("title", Class8010.method27395())
                                 .executes(
                                    var0x -> method38312(
                                          (Class6619)var0x.getSource(),
                                          Class8700.method31354(var0x, "targets"),
                                          Class8010.method27394(var0x, "title"),
                                          Class2301.field15712
                                       )
                                 )
                           )
                     ))
                  .then(
                     Class6099.method18839("times")
                        .then(
                           Class6099.method18840("fadeIn", IntegerArgumentType.integer(0))
                              .then(
                                 Class6099.method18840("stay", IntegerArgumentType.integer(0))
                                    .then(
                                       Class6099.method18840("fadeOut", IntegerArgumentType.integer(0))
                                          .executes(
                                             var0x -> method38313(
                                                   (Class6619)var0x.getSource(),
                                                   Class8700.method31354(var0x, "targets"),
                                                   IntegerArgumentType.getInteger(var0x, "fadeIn"),
                                                   IntegerArgumentType.getInteger(var0x, "stay"),
                                                   IntegerArgumentType.getInteger(var0x, "fadeOut")
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int method38310(Class6619 var0, Collection<Class878> var1) {
      Class5591 var4 = new Class5591(Class2301.field15714, (ITextComponent)null);

      for (Class878 var6 : var1) {
         var6.field4855.method15671(var4);
      }

      if (var1.size() != 1) {
         var0.method20179(new TranslationTextComponent("commands.title.cleared.multiple", var1.size()), true);
      } else {
         var0.method20179(new TranslationTextComponent("commands.title.cleared.single", ((Class878)var1.iterator().next()).method2954()), true);
      }

      return var1.size();
   }

   private static int method38311(Class6619 var0, Collection<Class878> var1) {
      Class5591 var4 = new Class5591(Class2301.field15715, (ITextComponent)null);

      for (Class878 var6 : var1) {
         var6.field4855.method15671(var4);
      }

      if (var1.size() != 1) {
         var0.method20179(new TranslationTextComponent("commands.title.reset.multiple", var1.size()), true);
      } else {
         var0.method20179(new TranslationTextComponent("commands.title.reset.single", ((Class878)var1.iterator().next()).method2954()), true);
      }

      return var1.size();
   }

   private static int method38312(Class6619 var0, Collection<Class878> var1, ITextComponent var2, Class2301 var3) throws CommandSyntaxException {
      for (Class878 var7 : var1) {
         var7.field4855.method15671(new Class5591(var3, TextComponentUtils.func_240645_a_(var0, var2, var7, 0)));
      }

      if (var1.size() != 1) {
         var0.method20179(new TranslationTextComponent("commands.title.show." + var3.name().toLowerCase(Locale.ROOT) + ".multiple", var1.size()), true);
      } else {
         var0.method20179(
            new TranslationTextComponent(
               "commands.title.show." + var3.name().toLowerCase(Locale.ROOT) + ".single", ((Class878)var1.iterator().next()).method2954()
            ),
            true
         );
      }

      return var1.size();
   }

   private static int method38313(Class6619 var0, Collection<Class878> var1, int var2, int var3, int var4) {
      Class5591 var7 = new Class5591(var2, var3, var4);

      for (Class878 var9 : var1) {
         var9.field4855.method15671(var7);
      }

      if (var1.size() != 1) {
         var0.method20179(new TranslationTextComponent("commands.title.times.multiple", var1.size()), true);
      } else {
         var0.method20179(new TranslationTextComponent("commands.title.times.single", ((Class878)var1.iterator().next()).method2954()), true);
      }

      return var1.size();
   }
}