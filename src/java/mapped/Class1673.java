package mapped;

import it.unimi.dsi.fastutil.longs.LongSet;

import javax.annotation.Nullable;
import java.util.BitSet;
import java.util.Map;
import java.util.stream.Stream;

public class Class1673 extends Class1672 {
   private final Class1674 field9109;

   public Class1673(Class1674 var1) {
      super(var1.method7072(), Class8922.field40388);
      this.field9109 = var1;
   }

   @Nullable
   @Override
   public Class944 method6759(BlockPos var1) {
      return this.field9109.method6759(var1);
   }

   @Nullable
   @Override
   public Class7380 method6738(BlockPos var1) {
      return this.field9109.method6738(var1);
   }

   @Override
   public Class7379 method6739(BlockPos var1) {
      return this.field9109.method6739(var1);
   }

   @Override
   public int method7033() {
      return this.field9109.method7033();
   }

   @Nullable
   @Override
   public Class7380 method7061(BlockPos var1, Class7380 var2, boolean var3) {
      return null;
   }

   @Override
   public void method7062(BlockPos var1, Class944 var2) {
   }

   @Override
   public void method7063(Entity var1) {
   }

   @Override
   public void method7111(Class9176 var1) {
   }

   @Override
   public Class7038[] method7067() {
      return this.field9109.method7067();
   }

   @Nullable
   @Override
   public Class196 method7112() {
      return this.field9109.method7131();
   }

   @Override
   public void method7069(Class101 var1, long[] var2) {
   }

   private Class101 method7126(Class101 var1) {
      if (var1 != Class101.field295) {
         return var1 != Class101.field297 ? var1 : Class101.field298;
      } else {
         return Class101.field296;
      }
   }

   @Override
   public int method7071(Class101 var1, int var2, int var3) {
      return this.field9109.method7071(this.method7126(var1), var2, var3);
   }

   @Override
   public Class7481 method7072() {
      return this.field9109.method7072();
   }

   @Override
   public void method7073(long var1) {
   }

   @Nullable
   @Override
   public Class5444<?> method7097(Class2961<?> var1) {
      return this.field9109.method7097(var1);
   }

   @Override
   public void method7098(Class2961<?> var1, Class5444<?> var2) {
   }

   @Override
   public Map<Class2961<?>, Class5444<?>> method7074() {
      return this.field9109.method7074();
   }

   @Override
   public void method7075(Map<Class2961<?>, Class5444<?>> var1) {
   }

   @Override
   public LongSet method7099(Class2961<?> var1) {
      return this.field9109.method7099(var1);
   }

   @Override
   public void method7100(Class2961<?> var1, long var2) {
   }

   @Override
   public Map<Class2961<?>, LongSet> method7101() {
      return this.field9109.method7101();
   }

   @Override
   public void method7102(Map<Class2961<?>, LongSet> var1) {
   }

   @Override
   public Class1684 method7077() {
      return this.field9109.method7077();
   }

   @Override
   public void method7078(boolean var1) {
   }

   @Override
   public boolean method7079() {
      return false;
   }

   @Override
   public Class9176 method7080() {
      return this.field9109.method7080();
   }

   @Override
   public void method7081(BlockPos var1) {
   }

   @Override
   public void method7082(BlockPos var1) {
   }

   @Override
   public void method7085(Class39 var1) {
   }

   @Nullable
   @Override
   public Class39 method7086(BlockPos var1) {
      return this.field9109.method7086(var1);
   }

   @Nullable
   @Override
   public Class39 method7087(BlockPos var1) {
      return this.field9109.method7087(var1);
   }

   @Override
   public void method7110(Class1684 var1) {
   }

   @Override
   public Stream<BlockPos> method7088() {
      return this.field9109.method7088();
   }

   @Override
   public Class6806<Block> method7089() {
      return new Class6806<Block>(var0 -> var0.method11579().method23393(), this.method7072());
   }

   @Override
   public Class6806<Class7631> method7090() {
      return new Class6806<Class7631>(var0 -> var0 == Class9479.field44064, this.method7072());
   }

   @Override
   public BitSet method7116(Class97 var1) {
      throw (UnsupportedOperationException) Util.method38516(new UnsupportedOperationException("Meaningless in this context"));
   }

   @Override
   public BitSet method7117(Class97 var1) {
      throw (UnsupportedOperationException) Util.method38516(new UnsupportedOperationException("Meaningless in this context"));
   }

   public Class1674 method7127() {
      return this.field9109;
   }

   @Override
   public boolean method7095() {
      return this.field9109.method7095();
   }

   @Override
   public void method7096(boolean var1) {
      this.field9109.method7096(var1);
   }
}