package mapped;

import java.util.EnumSet;

public class Class2729 extends Class2595 {
   private static String[] field17238;
   public final Class1095 field17239;

   public Class2729(Class1095 var1) {
      this.field17239 = var1;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657, Class2240.field14658));
   }

   @Override
   public boolean method10803() {
      if (this.field17239.method3176()) {
         return false;
      } else {
         Class880 var3 = this.field17239.method4232();
         return var3 != null
            && var3.method3066()
            && Class1095.method5169().test(var3)
            && this.field17239.method3277(var3) > 36.0
            && !this.field17239.method3336()
            && !this.field17239.method5145()
            && !this.field17239.field4981;
      }
   }

   @Override
   public void method10804() {
      this.field17239.method5130(false);
      Class1095.method5170(this.field17239, false);
   }

   @Override
   public void method10807() {
      Class880 var3 = this.field17239.method4232();
      if (var3 != null && Class1095.method5152(this.field17239, var3)) {
         this.field17239.method5144(true);
         this.field17239.method5143(true);
         this.field17239.method4230().method21666();
         this.field17239.method4227().method28040(var3, (float)this.field17239.method4260(), (float)this.field17239.method4259());
      } else {
         this.field17239.method5144(false);
         this.field17239.method5143(false);
      }
   }

   @Override
   public void method10805() {
      Class880 var3 = this.field17239.method4232();
      this.field17239.method4227().method28040(var3, (float)this.field17239.method4260(), (float)this.field17239.method4259());
      if (!(this.field17239.method3277(var3) <= 36.0)) {
         this.field17239.method4230().method21655(var3, 1.5);
      } else {
         this.field17239.method5144(true);
         this.field17239.method5143(true);
         this.field17239.method4230().method21666();
      }
   }
}