package mapped;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class Class7206 implements Class7202 {
   private static String[] field30926;
   public final List<Class8557> field30927;
   public final Map<Direction, List<Class8557>> field30928;
   public final boolean field30929;
   public final boolean field30930;
   public final boolean field30931;
   public final Class1713 field30932;
   public final Class9264 field30933;
   public final Class6391 field30934;

   public Class7206(
           List<Class8557> var1, Map<Direction, List<Class8557>> var2, boolean var3, boolean var4, boolean var5, Class1713 var6, Class9264 var7, Class6391 var8
   ) {
      this.field30927 = var1;
      this.field30928 = var2;
      this.field30929 = var3;
      this.field30930 = var5;
      this.field30931 = var4;
      this.field30932 = var6;
      this.field30933 = var7;
      this.field30934 = var8;
   }

   @Override
   public List<Class8557> method22619(Class7380 var1, Direction var2, Random var3) {
      return var2 != null ? this.field30928.get(var2) : this.field30927;
   }

   @Override
   public boolean method22620() {
      return this.field30929;
   }

   @Override
   public boolean method22621() {
      return this.field30930;
   }

   @Override
   public boolean method22622() {
      return this.field30931;
   }

   @Override
   public boolean method22623() {
      return false;
   }

   @Override
   public Class1713 method22624() {
      return this.field30932;
   }

   @Override
   public Class9264 method22625() {
      return this.field30933;
   }

   @Override
   public Class6391 method22626() {
      return this.field30934;
   }
}