package remapped;

import com.mentalfrostbyte.jello.commands.CommandException;

public class HighDPICommand extends Command {
   public HighDPICommand() {
      super("highdpi", "Toggles macOS HiDPI, Needs mc restart.", "hidpi");
   }

   @Override
   public void run(String var1, class_5273[] var2, class_860 var3) throws CommandException {
      if (var2.length <= 0) {
         if (MinecraftClient.IS_SYSTEM_MAC) {
            if (!SigmaMainClass.method_3328().method_3299().method_31004()) {
               var3.method_3731("HighDPI was enabled!");
            } else {
               var3.method_3731("HighDPI was disabled!");
            }

            SigmaMainClass.method_3328().method_3299().method_30980(!SigmaMainClass.method_3328().method_3299().method_31004());
         } else {
            throw new class_2900("This feature is only available on macOS!");
         }
      } else {
         throw new class_2900("Too many arguments");
      }
   }
}