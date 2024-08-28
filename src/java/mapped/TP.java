package mapped;

import com.mentalfrostbyte.jello.command.Command;
import com.mentalfrostbyte.jello.command.CommandException;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.notification.Notification;

import java.util.Collections;
import java.util.List;

public class TP extends Command {
   private Class9819 field25710;

   public TP() {
      super("tp", "Teleports to a player", "teleport");
      this.registerSubCommands(new String[]{"name"});
      this.field25710 = new Class9819();
   }

   @Override
   public void run(String var1, Class8623[] var2, Class6669 var3) throws CommandException {
      if (var2.length == 0) {
         throw new CommandException();
      } else if (var2.length > 1) {
         throw new CommandException("Too many arguments");
      } else if (!mc.field1339.field5036 && Class5628.method17716()) {
         throw new CommandException("Use this command on ground");
      } else if (var2[0].method30899().equalsIgnoreCase(mc.method1533().field30184)) {
         throw new CommandException("You can not tp to yourself");
      } else {
         this.field25710.field45879 = null;
         List<Entity> var6 = Class5628.method17708();
         Collections.sort(var6, new Class3596(this));

         for (Entity var8 : var6) {
            if (var8.method2941().getString().equalsIgnoreCase(var2[0].method30899())) {
               this.field25710.field45879 = var8;
               break;
            }
         }

         if (this.field25710.field45879 != null) {
            this.field25710.field45877.method27120();
            if (!Class5628.method17716()) {
               this.field25710.field45877.method27119();
               this.field25710.field45878 = 2;
            } else {
               double var9 = mc.field1339.getPosX();
               double var11 = mc.field1339.getPosY();
               double var13 = mc.field1339.getPosZ();
               mc.getClientPlayNetHandler().sendPacket(new Class5605(var9, var11 + 0.2, var13, false));
               mc.getClientPlayNetHandler().sendPacket(new Class5605(var9, var11 + 0.1, var13, false));
               this.field25710.field45878 = 1;
               Client.getInstance()
                  .getNotificationManager()
                  .post(new Notification("Teleport", "Teleporting to \"" + this.field25710.field45879.method2941().getString() + "\"...", 10000));
               this.field25710.field45877.method27118();
            }
         } else {
            throw new CommandException("Could not find entity with name \"" + var2[0].method30899() + "\"");
         }
      }
   }

   // $VF: synthetic method
   public static Minecraft method18340() {
      return mc;
   }

   // $VF: synthetic method
   public static Minecraft method18341() {
      return mc;
   }
}