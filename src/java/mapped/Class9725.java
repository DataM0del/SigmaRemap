package mapped;

import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.shorts.ShortList;
import it.unimi.dsi.fastutil.shorts.ShortListIterator;
import java.util.Arrays;
import java.util.BitSet;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class9725 {
   private static final Logger field45421 = LogManager.getLogger();

   public static Class1672 method38087(ServerWorld var0, Class8761 var1, Class1653 var2, Class7481 var3, CompoundNBT var4) {
      ChunkGenerator var7 = var0.getChunkProvider().method7370();
      Class1685 var8 = var7.method17824();
      CompoundNBT var9 = var4.getCompound("Level");
      Class7481 var10 = new Class7481(var9.method122("xPos"), var9.method122("zPos"));
      if (!Objects.equals(var3, var10)) {
         field45421.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", var3, var3, var10);
      }

      Class1684 var11 = new Class1684(
         var0.method6867().<Biome>getRegistry(Registry.BIOME_KEY), var3, var8, !var9.method119("Biomes", 11) ? null : var9.method128("Biomes")
      );
      Class8922 var12 = !var9.method119("UpgradeData", 10) ? Class8922.field40388 : new Class8922(var9.getCompound("UpgradeData"));
      Class6806 var13 = new Class6806<Block>(var0x -> var0x == null || var0x.method11579().isAir(), var3, var9.method131("ToBeTicked", 9));
      Class6806 var14 = new Class6806<Fluid>(var0x -> var0x == null || var0x == Class9479.field44064, var3, var9.method131("LiquidsToBeTicked", 9));
      boolean var15 = var9.method132("isLightOn");
      ListNBT var16 = var9.method131("Sections", 10);
      byte var17 = 16;
      Class7038[] var18 = new Class7038[16];
      boolean var19 = var0.method6812().hasSkyLight();
      Class1703 var20 = var0.getChunkProvider();
      Class196 var21 = var20.getLightManager();
      if (var15) {
         var21.method609(var3, true);
      }

      for (int var22 = 0; var22 < var16.size(); var22++) {
         CompoundNBT var30 = var16.method153(var22);
         byte var25 = var30.method120("Y");
         if (var30.method119("Palette", 9) && var30.method119("BlockStates", 12)) {
            Class7038 var27 = new Class7038(var25 << 4);
            var27.method21865().method30502(var30.method131("Palette", 10), var30.method129("BlockStates"));
            var27.method21864();
            if (!var27.method21858()) {
               var18[var25] = var27;
            }

            var2.method6679(var3, var27);
         }

         if (var15) {
            if (var30.method119("BlockLight", 7)) {
               var21.method606(Class1977.field12882, Class2002.method8391(var3, var25), new Class6785(var30.method127("BlockLight")), true);
            }

            if (var19 && var30.method119("SkyLight", 7)) {
               var21.method606(Class1977.field12881, Class2002.method8391(var3, var25), new Class6785(var30.method127("SkyLight")), true);
            }
         }
      }

      long var23 = var9.method123("InhabitedTime");
      Class2076 var40 = method38089(var4);
      Object var43;
      if (var40 != Class2076.field13525) {
         Class1672 var26 = new Class1672(var3, var12, var18, var13, var14);
         var26.method7110(var11);
         var43 = var26;
         var26.method7092(var23);
         var26.method7111(ChunkStatus.method34304(var9.method126("Status")));
         if (var26.method7080().method34306(ChunkStatus.field42141)) {
            var26.method7119(var21);
         }

         if (!var15 && var26.method7080().method34306(ChunkStatus.field42142)) {
            for (BlockPos var29 : BlockPos.method8364(var3.method24356(), 0, var3.method24357(), var3.method24358(), 255, var3.method24359())) {
               if (((IChunk)var43).getBlockState(var29).getLightValue() != 0) {
                  var26.method7105(var29);
               }
            }
         }
      } else {
         Object var41;
         if (!var9.method119("TileTicks", 9)) {
            var41 = var13;
         } else {
            var41 = Class6801.<Block>method20722(var9.method131("TileTicks", 10), Registry.BLOCK::getKey, Registry.BLOCK::method9184);
         }

         Object var44;
         if (!var9.method119("LiquidTicks", 9)) {
            var44 = var14;
         } else {
            var44 = Class6801.<Fluid>method20722(var9.method131("LiquidTicks", 10), Registry.field16070::getKey, Registry.field16070::method9184);
         }

         var43 = new Chunk(
            var0.method6970(), var3, var11, var12, (Class6802<Block>)var41, (Class6802<Fluid>)var44, var23, var18, var1x -> method38090(var9, var1x)
         );
      }

      ((IChunk)var43).method7096(var15);
      CompoundNBT var42 = var9.getCompound("Heightmaps");
      EnumSet var45 = EnumSet.<Class101>noneOf(Class101.class);

      for (Class101 var31 : ((IChunk)var43).method7080().method34305()) {
         String var32 = var31.method283();
         if (!var42.method119(var32, 12)) {
            var45.add(var31);
         } else {
            ((IChunk)var43).method7069(var31, var42.method129(var32));
         }
      }

      Class7527.method24577((IChunk)var43, var45);
      CompoundNBT var47 = var9.getCompound("Structures");
      ((IChunk)var43).method7075(method38092(var1, var47, var0.method6967()));
      ((IChunk)var43).method7102(method38093(var3, var47));
      if (var9.method132("shouldSave")) {
         ((IChunk)var43).method7078(true);
      }

      ListNBT var48 = var9.method131("PostProcessing", 9);

      for (int var49 = 0; var49 < var48.size(); var49++) {
         ListNBT var33 = var48.method154(var49);

         for (int var34 = 0; var34 < var33.size(); var34++) {
            ((IChunk)var43).method7084(var33.method155(var34), var49);
         }
      }

      if (var40 == Class2076.field13525) {
         return new Class1673((Chunk)var43);
      } else {
         Class1672 var50 = (Class1672)var43;
         ListNBT var51 = var9.method131("Entities", 10);

         for (int var52 = 0; var52 < var51.size(); var52++) {
            var50.method7108(var51.method153(var52));
         }

         ListNBT var53 = var9.method131("TileEntities", 10);

         for (int var35 = 0; var35 < var53.size(); var35++) {
            CompoundNBT var36 = var53.method153(var35);
            ((IChunk)var43).method7085(var36);
         }

         ListNBT var54 = var9.method131("Lights", 9);

         for (int var55 = 0; var55 < var54.size(); var55++) {
            ListNBT var37 = var54.method154(var55);

            for (int var38 = 0; var38 < var37.size(); var38++) {
               var50.method7104(var37.method155(var38), var55);
            }
         }

         CompoundNBT var56 = var9.getCompound("CarvingMasks");

         for (String var58 : var56.method97()) {
            Class97 var39 = Class97.valueOf(var58);
            var50.method7118(var39, BitSet.valueOf(var56.method127(var58)));
         }

         return var50;
      }
   }

   public static CompoundNBT method38088(ServerWorld var0, IChunk var1) {
      Class7481 var4 = var1.method7072();
      CompoundNBT var5 = new CompoundNBT();
      CompoundNBT var6 = new CompoundNBT();
      var5.method102("DataVersion", SharedConstants.getVersion().getWorldVersion());
      var5.put("Level", var6);
      var6.method102("xPos", var4.field32174);
      var6.method102("zPos", var4.field32175);
      var6.method103("LastUpdate", var0.method6783());
      var6.method103("InhabitedTime", var1.method7093());
      var6.method109("Status", var1.method7080().method34298());
      Class8922 var7 = var1.method7091();
      if (!var7.method32607()) {
         var6.put("UpgradeData", var7.method32608());
      }

      Class7038[] var8 = var1.method7067();
      ListNBT var9 = new ListNBT();
      Class195 var10 = var0.getChunkProvider().getLightManager();
      boolean var11 = var1.method7095();

      for (int var12 = -1; var12 < 17; var12++) {
         int var13 = var12;
         Class7038 var14 = Arrays.<Class7038>stream(var8)
            .filter(var1x -> var1x != null && var1x.method21863() >> 4 == var13)
            .findFirst()
            .orElse(Chunk.field9111);
         Class6785 var15 = var10.method638(Class1977.field12882).method642(Class2002.method8391(var4, var13));
         Class6785 var16 = var10.method638(Class1977.field12881).method642(Class2002.method8391(var4, var13));
         if (var14 != Chunk.field9111 || var15 != null || var16 != null) {
            CompoundNBT var17 = new CompoundNBT();
            var17.method100("Y", (byte)(var13 & 0xFF));
            if (var14 != Chunk.field9111) {
               var14.method21865().method30503(var17, "Palette", "BlockStates");
            }

            if (var15 != null && !var15.method20677()) {
               var17.method110("BlockLight", var15.method20669());
            }

            if (var16 != null && !var16.method20677()) {
               var17.method110("SkyLight", var16.method20669());
            }

            var9.add(var17);
         }
      }

      var6.put("Sections", var9);
      if (var11) {
         var6.method115("isLightOn", true);
      }

      Class1684 var22 = var1.method7077();
      if (var22 != null) {
         var6.method111("Biomes", var22.method7198());
      }

      ListNBT var23 = new ListNBT();

      for (BlockPos var26 : var1.method7066()) {
         CompoundNBT var30 = var1.method7087(var26);
         if (var30 != null) {
            var23.add(var30);
         }
      }

      var6.put("TileEntities", var23);
      ListNBT var25 = new ListNBT();
      if (var1.method7080().method34303() != Class2076.field13525) {
         Class1672 var27 = (Class1672)var1;
         var25.addAll(var27.method7109());
         var6.put("Lights", method38094(var27.method7103()));
         CompoundNBT var31 = new CompoundNBT();

         for (Class97 var20 : Class97.values()) {
            BitSet var21 = var27.method7116(var20);
            if (var21 != null) {
               var31.method110(var20.toString(), var21.toByteArray());
            }
         }

         var6.put("CarvingMasks", var31);
      } else {
         Chunk var28 = (Chunk)var1;
         var28.method7147(false);

         for (int var32 = 0; var32 < var28.method7146().length; var32++) {
            for (Entity var37 : var28.method7146()[var32]) {
               CompoundNBT var39 = new CompoundNBT();
               if (var37.method3293(var39)) {
                  var28.method7147(true);
                  var25.add(var39);
               }
            }
         }
      }

      var6.put("Entities", var25);
      Class6802 var29 = var1.method7089();
      if (!(var29 instanceof Class6806)) {
         if (!(var29 instanceof Class6801)) {
            var6.put("TileTicks", var0.method6860().method20733(var4));
         } else {
            var6.put("TileTicks", ((Class6801)var29).method20721());
         }
      } else {
         var6.put("ToBeTicked", ((Class6806)var29).method20737());
      }

      Class6802 var33 = var1.method7090();
      if (!(var33 instanceof Class6806)) {
         if (!(var33 instanceof Class6801)) {
            var6.put("LiquidTicks", var0.method6861().method20733(var4));
         } else {
            var6.put("LiquidTicks", ((Class6801)var33).method20721());
         }
      } else {
         var6.put("LiquidsToBeTicked", ((Class6806)var33).method20737());
      }

      var6.put("PostProcessing", method38094(var1.method7083()));
      CompoundNBT var36 = new CompoundNBT();

      for (Entry var40 : var1.method7068()) {
         if (var1.method7080().method34305().contains(var40.getKey())) {
            var36.put(((Class101)var40.getKey()).method283(), new Class42(((Class7527)var40.getValue()).method24583()));
         }
      }

      var6.put("Heightmaps", var36);
      var6.put("Structures", method38091(var4, var1.method7074(), var1.method7101()));
      return var5;
   }

   public static Class2076 method38089(CompoundNBT var0) {
      if (var0 != null) {
         ChunkStatus var3 = ChunkStatus.method34304(var0.getCompound("Level").method126("Status"));
         if (var3 != null) {
            return var3.method34303();
         }
      }

      return Class2076.field13524;
   }

   private static void method38090(CompoundNBT var0, Chunk var1) {
      ListNBT var4 = var0.method131("Entities", 10);
      World var5 = var1.method7144();

      for (int var6 = 0; var6 < var4.size(); var6++) {
         CompoundNBT var7 = var4.method153(var6);
         EntityType.method33223(var7, var5, var1x -> {
            var1.method7063(var1x);
            return var1x;
         });
         var1.method7147(true);
      }

      ListNBT var12 = var0.method131("TileEntities", 10);

      for (int var13 = 0; var13 < var12.size(); var13++) {
         CompoundNBT var8 = var12.method153(var13);
         boolean var9 = var8.method132("keepPacked");
         if (!var9) {
            BlockPos var10 = new BlockPos(var8.method122("x"), var8.method122("y"), var8.method122("z"));
            TileEntity var11 = TileEntity.method3772(var1.getBlockState(var10), var8);
            if (var11 != null) {
               var1.method7135(var11);
            }
         } else {
            var1.method7085(var8);
         }
      }
   }

   private static CompoundNBT method38091(Class7481 var0, Map<Structure<?>, Class5444<?>> var1, Map<Structure<?>, LongSet> var2) {
      CompoundNBT var5 = new CompoundNBT();
      CompoundNBT var6 = new CompoundNBT();

      for (Entry var8 : var1.entrySet()) {
         var6.put(((Structure)var8.getKey()).method11373(), ((Class5444)var8.getValue()).method17114(var0.field32174, var0.field32175));
      }

      var5.put("Starts", var6);
      CompoundNBT var10 = new CompoundNBT();

      for (Entry var9 : var2.entrySet()) {
         var10.put(((Structure)var9.getKey()).method11373(), new Class42((LongSet)var9.getValue()));
      }

      var5.put("References", var10);
      return var5;
   }

   private static Map<Structure<?>, Class5444<?>> method38092(Class8761 var0, CompoundNBT var1, long var2) {
      HashMap var6 = Maps.newHashMap();
      CompoundNBT var7 = var1.getCompound("Starts");

      for (String var9 : var7.method97()) {
         String var10 = var9.toLowerCase(Locale.ROOT);
         Structure var11 = (Structure) Structure.field_236365_a_.get(var10);
         if (var11 != null) {
            Class5444 var12 = Structure.method11366(var0, var7.getCompound(var9), var2);
            if (var12 != null) {
               var6.put(var11, var12);
            }
         } else {
            field45421.error("Unknown structure start: {}", var10);
         }
      }

      return var6;
   }

   private static Map<Structure<?>, LongSet> method38093(Class7481 var0, CompoundNBT var1) {
      HashMap var4 = Maps.newHashMap();
      CompoundNBT var5 = var1.getCompound("References");

      for (String var7 : var5.method97()) {
         var4.put(Structure.field_236365_a_.get(var7.toLowerCase(Locale.ROOT)), new LongOpenHashSet(Arrays.stream(var5.method129(var7)).filter(var2 -> {
            Class7481 var6 = new Class7481(var2);
            if (var6.method24365(var0) <= 8) {
               return true;
            } else {
               field45421.warn("Found invalid structure reference [ {} @ {} ] for chunk {}.", var7, var6, var0);
               return false;
            }
         }).toArray()));
      }

      return var4;
   }

   public static ListNBT method38094(ShortList[] var0) {
      ListNBT var3 = new ListNBT();

      for (ShortList var7 : var0) {
         ListNBT var8 = new ListNBT();
         if (var7 != null) {
            ShortListIterator var9 = var7.iterator();

            while (var9.hasNext()) {
               Short var10 = (Short)var9.next();
               var8.add(Class37.method96(var10));
            }
         }

         var3.add(var8);
      }

      return var3;
   }
}
