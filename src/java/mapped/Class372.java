package mapped;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Class372 extends Thread {
   public final DedicatedServer field1625;

   public Class372(DedicatedServer var1, String var2) {
      super(var2);
      this.field1625 = var1;
   }

   @Override
   public void run() {
      BufferedReader var3 = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));

      String var4;
      try {
         while (!this.field1625.method1366() && this.field1625.method1295() && (var4 = var3.readLine()) != null) {
            this.field1625.method6499(var4, this.field1625.method1404());
         }
      } catch (IOException var6) {
         DedicatedServer.method1453().error("Exception handling console input", var6);
      }
   }
}
