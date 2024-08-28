package mapped;

import com.mojang.authlib.GameProfile;
import java.math.BigInteger;
import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class5109 implements Class5108 {
   private static final AtomicInteger field23211 = new AtomicInteger(0);
   private static final Logger field23212 = LogManager.getLogger();
   private static final Random field23213 = new Random();
   private final byte[] field23214 = new byte[4];
   private final Class314 field23215;
   public final Class8586 field23216;
   private Class2241 field23217 = Class2241.field14662;
   private int field23218;
   private GameProfile field23219;
   private final String field23220 = "";
   private SecretKey field23221;
   private Class878 field23222;

   public Class5109(Class314 var1, Class8586 var2) {
      this.field23215 = var1;
      this.field23216 = var2;
      field23213.nextBytes(this.field23214);
   }

   public void method15599() {
      if (this.field23217 != Class2241.field14666) {
         if (this.field23217 == Class2241.field14667) {
            Class878 var3 = this.field23215.method1367().method19489(this.field23219.getId());
            if (var3 == null) {
               this.field23217 = Class2241.field14666;
               this.field23215.method1367().method19445(this.field23216, this.field23222);
               this.field23222 = null;
            }
         }
      } else {
         this.method15601();
      }

      if (this.field23218++ == 600) {
         this.method15600(new TranslationTextComponent("multiplayer.disconnect.slow_login"));
      }
   }

   @Override
   public Class8586 method15589() {
      return this.field23216;
   }

   public void method15600(ITextComponent var1) {
      try {
         field23212.info("Disconnecting {}: {}", this.method15602(), var1.getString());
         this.field23216.method30693(new Class5490(var1));
         this.field23216.method30701(var1);
      } catch (Exception var5) {
         field23212.error("Error whilst disconnecting player", var5);
      }
   }

   public void method15601() {
      if (!this.field23219.isComplete()) {
         this.field23219 = this.method15603(this.field23219);
      }

      ITextComponent var3 = this.field23215.method1367().method19451(this.field23216.method30700(), this.field23219);
      if (var3 == null) {
         this.field23217 = Class2241.field14668;
         if (this.field23215.method1392() >= 0 && !this.field23216.method30702()) {
            this.field23216.method30694(new Class5521(this.field23215.method1392()), var1 -> this.field23216.method30712(this.field23215.method1392()));
         }

         this.field23216.method30693(new Class5598(this.field23219));
         Class878 var4 = this.field23215.method1367().method19489(this.field23219.getId());
         if (var4 == null) {
            this.field23215.method1367().method19445(this.field23216, this.field23215.method1367().method19452(this.field23219));
         } else {
            this.field23217 = Class2241.field14667;
            this.field23222 = this.field23215.method1367().method19452(this.field23219);
         }
      } else {
         this.method15600(var3);
      }
   }

   @Override
   public void method15588(ITextComponent var1) {
      field23212.info("{} lost connection: {}", this.method15602(), var1.getString());
   }

   public String method15602() {
      return this.field23219 == null ? String.valueOf(this.field23216.method30700()) : this.field23219 + " (" + this.field23216.method30700() + ")";
   }

   @Override
   public void method15596(Class5500 var1) {
      Validate.validState(this.field23217 == Class2241.field14662, "Unexpected hello packet", new Object[0]);
      this.field23219 = var1.method17302();
      if (this.field23215.method1350() && !this.field23216.method30702()) {
         this.field23217 = Class2241.field14663;
         this.field23216.method30693(new Class5540("", this.field23215.method1329().getPublic().getEncoded(), this.field23214));
      } else {
         this.field23217 = Class2241.field14666;
      }
   }

   @Override
   public void method15597(Class5569 var1) {
      Validate.validState(this.field23217 == Class2241.field14663, "Unexpected key packet", new Object[0]);
      PrivateKey var4 = this.field23215.method1329().getPrivate();

      String var7;
      try {
         if (!Arrays.equals(this.field23214, var1.method17496(var4))) {
            throw new IllegalStateException("Protocol error");
         }

         this.field23221 = var1.method17495(var4);
         Cipher var5 = Class8961.method32746(2, this.field23221);
         Cipher var6 = Class8961.method32746(1, this.field23221);
         var7 = new BigInteger(Class8961.method32738("", this.field23215.method1329().getPublic(), this.field23221)).toString(16);
         this.field23217 = Class2241.field14664;
         this.field23216.method30705(var5, var6);
      } catch (Class2464 var8) {
         throw new IllegalStateException("Protocol error", var8);
      }

      Class365 var9 = new Class365(this, "User Authenticator #" + field23211.incrementAndGet(), var7);
      var9.setUncaughtExceptionHandler(new Class6030(field23212));
      var9.start();
   }

   @Override
   public void method15598(Class5571 var1) {
      this.method15600(new TranslationTextComponent("multiplayer.disconnect.unexpected_query_response"));
   }

   public GameProfile method15603(GameProfile var1) {
      UUID var4 = PlayerEntity.method2961(var1.getName());
      return new GameProfile(var4, var1.getName());
   }

   // $VF: synthetic method
   public static GameProfile method15605(Class5109 var0) {
      return var0.field23219;
   }

   // $VF: synthetic method
   public static GameProfile method15606(Class5109 var0, GameProfile var1) {
      return var0.field23219 = var1;
   }

   // $VF: synthetic method
   public static Class314 method15607(Class5109 var0) {
      return var0.field23215;
   }

   // $VF: synthetic method
   public static Logger method15608() {
      return field23212;
   }

   // $VF: synthetic method
   public static Class2241 method15609(Class5109 var0, Class2241 var1) {
      return var0.field23217 = var1;
   }
}