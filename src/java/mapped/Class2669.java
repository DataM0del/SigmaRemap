package mapped;

public class Class2669 extends Class2595 {
   private final Class1076 field17046;

   public Class2669(Class1076 var1) {
      this.field17046 = var1;
   }

   @Override
   public boolean method10803() {
      return this.field17046.field5024.method7187(this.field17046.getPosX(), this.field17046.getPosY(), this.field17046.getPosZ(), 10.0);
   }

   @Override
   public void method10805() {
      Class1657 var3 = (Class1657)this.field17046.field5024;
      Class9755 var4 = var3.method6807(this.field17046.method3432());
      this.field17046.method5001(false);
      this.field17046.method4936(true);
      this.field17046.method4770(0);
      Class906 var5 = Class8992.field41046.method33215(var3);
      var5.method2794(this.field17046.getPosX(), this.field17046.getPosY(), this.field17046.getPosZ());
      var5.method3549(true);
      var3.method6916(var5);
      Class1085 var6 = this.method10887(var4, this.field17046);
      var6.method3311(this.field17046);
      var3.method6995(var6);

      for (int var7 = 0; var7 < 3; var7++) {
         Class1068 var8 = this.method10886(var4);
         Class1085 var9 = this.method10887(var4, var8);
         var9.method3311(var8);
         var8.method3280(this.field17046.method3013().nextGaussian() * 0.5, 0.0, this.field17046.method3013().nextGaussian() * 0.5);
         var3.method6995(var8);
      }
   }

   private Class1068 method10886(Class9755 var1) {
      Class1076 var4 = Class8992.field41079.method33215(this.field17046.field5024);
      var4.method4276((Class1657)this.field17046.field5024, var1, Class2202.field14401, (Class5093)null, (Class39)null);
      var4.method3215(this.field17046.getPosX(), this.field17046.getPosY(), this.field17046.getPosZ());
      var4.field5061 = 60;
      var4.method4278();
      var4.method4936(true);
      var4.method4770(0);
      return var4;
   }

   private Class1085 method10887(Class9755 var1, Class1068 var2) {
      Class1085 var5 = Class8992.field41078.method33215(var2.field5024);
      var5.method4276((Class1657)var2.field5024, var1, Class2202.field14401, (Class5093)null, (Class39)null);
      var5.method3215(var2.getPosX(), var2.getPosY(), var2.getPosZ());
      var5.field5061 = 60;
      var5.method4278();
      if (var5.method2943(Class2106.field13736).method32105()) {
         var5.method2944(Class2106.field13736, new Class8848(Class8514.field37852));
      }

      var5.method2944(
         Class2106.field13731,
         Class7858.method26342(
            var5.method3013(), this.method10888(var5.method3090()), (int)(5.0F + var1.method38330() * (float)var5.method3013().nextInt(18)), false
         )
      );
      var5.method2944(
         Class2106.field13736,
         Class7858.method26342(
            var5.method3013(),
            this.method10888(var5.method2943(Class2106.field13736)),
            (int)(5.0F + var1.method38330() * (float)var5.method3013().nextInt(18)),
            false
         )
      );
      return var5;
   }

   private Class8848 method10888(Class8848 var1) {
      var1.method32146("Enchantments");
      return var1;
   }
}