package remapped;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class NoteblockPlayerModule extends PremiumModule {
   public int field_41247;
   private class_2800 field_41249;
   private List<String> field_41251 = new ArrayList<String>();
   private List<class_663> field_41248 = new ArrayList<class_663>();
   private List<BlockPos> field_41246 = new ArrayList<BlockPos>();

   public NoteblockPlayerModule() {
      super("NoteblockPlayer", "Plays noteblocks! Needs NBS files in sigma5/nbs", Category.MISC);
      File var3 = new File(SigmaMainClass.getInstance().getSigmaFolder() + "/nbs");
      if (var3.exists()) {
         this.field_41251 = new ArrayList<String>(Arrays.asList(var3.list()));

         for (int var4 = 0; var4 < this.field_41251.size(); var4++) {
            if (this.field_41251.get(var4).startsWith(".")) {
               this.field_41251.remove(var4);
               break;
            }
         }

         String[] var5 = new String[this.field_41251.size()];
         var5 = this.field_41251.<String>toArray(var5);
         if (var5.length > 0) {
            this.addSetting(new ModeSetting("Song", "songs", 0, var5));
         }
      }
   }

   @EventListen
   private void method_36555(class_5596 var1) {
      if (this.method_42015()) {
         if (this.field_41249 != null) {
            if (client.playerController.method_42140()) {
               class_314.method_1443("§cNoteBlockPlayer isn't available in creative mode!");
               this.setEnabled2(false);
            } else {
               if (!this.method_36552(this.field_41248) && client.thePlayer.field_41697 % 4 == 0) {
                  this.method_36551(this.field_41248);
               }

               if (this.method_36554(this.field_41248)) {
                  if (Math.floor((double)((float) client.thePlayer.field_41697 % this.field_41249.method_12744())) / 20.0 == 0.0) {
                     if (this.field_41247 > this.field_41249.method_12736()) {
                        this.field_41247 = 0;
                     }

                     this.field_41246.clear();

                     for (class_9036 var5 : this.field_41249.method_12735().values()) {
                        class_4057 var6 = var5.method_41485(this.field_41247);
                        if (var6 != null) {
                           for (class_663 var8 : this.field_41248) {
                              if ((var6.method_18719() != 3 && this.method_36553(var8) == 0 || var8.method_3033() == var6.method_18719())
                                 && class_1269.method_5703(var8.field_3677) == (float)(var6.method_18715() - 33)
                                 && Math.sqrt(client.thePlayer.method_37075().method_12180(var8.field_3674))
                                    < (double) client.playerController.method_42146()) {
                                 float[] var9 = class_7494.method_34077(var8.field_3674, Direction.field_817);
                                 if ((double)var8.field_3674.getY() > client.thePlayer.method_37309() + 1.0) {
                                    var9 = class_7494.method_34077(var8.field_3674, Direction.field_802);
                                 }

                                 client.method_8614().sendPacket(new RotationPacket(var9[0], var9[1], client.thePlayer.onGround));
                                 client.method_8614().sendPacket(new class_1586(class_7500.field_38263, var8.field_3674, Direction.field_817));
                                 client.method_8614().sendPacket(new class_3195(Hand.MAIN_HAND));
                                 this.field_41246.add(var8.field_3674);
                              }
                           }
                        }
                     }

                     this.field_41247++;
                  }
               }
            }
         }
      }
   }

   public boolean method_36554(List<class_663> var1) {
      for (class_663 var5 : var1) {
         if ((var5.field_3677 == -1.0F || this.method_36550(var5.field_3677, var5.field_3676))
            && Math.sqrt(client.thePlayer.method_37075().method_12180(var5.field_3674)) < (double) client.playerController.method_42146()) {
            return false;
         }
      }

      return true;
   }

   public boolean method_36552(List<class_663> var1) {
      for (class_663 var5 : var1) {
         if (var5.field_3677 == -1.0F
            && Math.sqrt(client.thePlayer.method_37075().method_12180(var5.field_3674)) < (double) client.playerController.method_42146()) {
            float[] var6 = class_7494.method_34077(var5.field_3674, Direction.field_817);
            client.method_8614().sendPacket(new RotationPacket(var6[0], var6[1], client.thePlayer.onGround));
            client.method_8614().sendPacket(new class_1586(class_7500.field_38263, var5.field_3674, Direction.field_817));
            this.field_41246.clear();
            this.field_41246.add(var5.field_3674);
            return true;
         }
      }

      return false;
   }

   public boolean method_36551(List<class_663> var1) {
      for (class_663 var5 : var1) {
         if (this.method_36550(var5.field_3677, var5.field_3676)
            && Math.sqrt(client.thePlayer.method_37075().method_12180(var5.field_3674)) < (double) client.playerController.method_42146()) {
            if (client.thePlayer.field_41697 % 1 == 0) {
               float[] var6 = class_7494.method_34077(var5.field_3674, Direction.field_817);
               client.thePlayer.method_26597(Hand.MAIN_HAND);
               client.method_8614().sendPacket(new RotationPacket(var6[0], var6[1], client.thePlayer.onGround));
               client.method_8614()
                  .sendPacket(new class_8585(Hand.MAIN_HAND, class_7494.method_34079(var6[0], var6[1], client.playerController.method_42146() + 1.0F)));
               this.field_41246.clear();
               this.field_41246.add(var5.field_3674);
            }

            return true;
         }
      }

      return false;
   }

   @EventListen
   private void method_36548(class_3368 var1) {
      if (this.method_42015()) {
         if (this.field_41248 != null) {
            for (class_663 var5 : this.field_41248) {
               ;
            }

            for (BlockPos var7 : this.field_41246) {
               method_36547(var7);
            }
         }
      }
   }

   public static void method_36547(BlockPos var0) {
      double var3 = (double)((float)var0.getX() + 0.5F) - MinecraftClient.getInstance().gameRenderer.method_35949().method_41627().method_61();
      double var5 = (double)((float)var0.getY() + 1.0F) - MinecraftClient.getInstance().gameRenderer.method_35949().method_41627().method_60();
      double var7 = (double)((float)var0.getZ() + 0.5F) - MinecraftClient.getInstance().gameRenderer.method_35949().method_41627().method_62();
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(3042);
      GL11.glEnable(2848);
      GL11.glLineWidth(1.0F);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glColor4d(1.0, 1.0, 1.0, 1.0);
      class_1343 var9 = new class_1343(0.0, 0.0, 1.0)
         .method_6212(-((float)Math.toRadians((double) MinecraftClient.getInstance().thePlayer.rotationPitch)))
         .method_6192(-((float)Math.toRadians((double) MinecraftClient.getInstance().thePlayer.rotationYaw)));
      GL11.glBegin(1);
      GL11.glVertex3d(var9.field_7336, var9.field_7333, var9.field_7334);
      GL11.glVertex3d(var3, var5, var7);
      GL11.glEnd();
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDisable(2848);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
   }

   public boolean method_36550(float var1, class_617 var2) {
      int var5 = 0;

      for (class_663 var7 : this.field_41248) {
         if (var7.field_3677 == var1 && var1 != -1.0F && var7.field_3676 == var2) {
            var5++;
         }
      }

      return var5 > 1;
   }

   @EventListen
   private void method_36546(PacketEvent var1) {
      if (this.method_42015()) {
         if (this.field_41248 != null) {
            if (var1.method_557() instanceof class_3740) {
               class_3740 var4 = (class_3740)var1.method_557();

               for (int var5 = 0; var5 < this.field_41248.size(); var5++) {
                  class_663 var6 = this.field_41248.get(var5);
                  if (var6.field_3674.equals(new BlockPos(var4.method_17347(), var4.method_17340(), var4.method_17344()))) {
                     var6.field_3677 = var4.method_17339();
                     this.field_41248.set(var5, var6);
                  }
               }
            }

            if (var1.method_557() instanceof class_8283) {
               class_8283 var7 = (class_8283)var1.method_557();

               for (int var8 = 0; var8 < this.field_41248.size(); var8++) {
                  class_663 var9 = this.field_41248.get(var8);
                  if (var9.field_3674.equals(new BlockPos(var7.method_38223(), var7.method_38226(), var7.method_38224()))) {
                     var9.field_3677 = var7.method_38219();
                     this.field_41248.set(var8, var9);
                  }
               }
            }
         }
      }
   }

   public void method_36556(double var1, double var3, double var5, String var7) {
      GL11.glBlendFunc(770, 771);
      GL11.glEnable(3042);
      GL11.glEnable(2848);
      GL11.glDisable(3553);
      GL11.glDisable(2929);
      GL11.glDepthMask(false);
      GL11.glPushMatrix();
      GL11.glTranslated(
         var1 - client.gameRenderer.method_35949().method_41627().method_61() + 0.5,
         var3 - client.gameRenderer.method_35949().method_41627().method_60() + 1.0,
         var5 - client.gameRenderer.method_35949().method_41627().method_62() + 0.5
      );
      GL11.glAlphaFunc(519, 0.0F);
      GL11.glRotatef(client.gameRenderer.method_35949().method_41640(), 0.0F, -1.0F, 0.0F);
      GL11.glRotatef(client.gameRenderer.method_35949().method_41638(), 1.0F, 0.0F, 0.0F);
      FontRenderer var10 = class_5320.field_27141;
      GL11.glPushMatrix();
      GL11.glScalef(-0.01F, -0.01F, -0.01F);
      FontManager.method_94(
         (float)(-var10.method_18547(var7) / 2 - 10),
         0.0F,
         (float)(var10.method_18547(var7) / 2 + 10),
         (float)(var10.method_15654() + 2),
         class_314.method_1444(class_1255.field_6929.field_6917, 0.4F)
      );
      GL11.glTranslated((double)(-var10.method_18547(var7) / 2), 0.0, 0.0);
      FontManager.method_87(var10, 0.0F, 0.0F, var7, class_1255.field_6918.field_6917);
      GL11.glPopMatrix();
      GL11.glPopMatrix();
      GL11.glEnable(3553);
      GL11.glEnable(2929);
      GL11.glDisable(2848);
      GL11.glDepthMask(true);
      GL11.glDisable(3042);
   }

   @Override
   public void onEnable() {
      if (!client.playerController.method_42140()) {
         if (this.field_41251.isEmpty()) {
            class_314.method_1443("§cNo Song available! Place NBS formated files in sigma5/nbs and restart the client to try again!");
            class_314.method_1443("§cPlaying the only integrated demo song!");
            this.field_41249 = class_4713.method_21790(NotificationIcons.processBitmap("com/mentalfrostbyte/gui/resources/music/rememberthis.nbs"));
            if (this.field_41249 == null) {
               class_314.method_1443("§cError loading included song, wtf!");
               this.setEnabled2(false);
               return;
            }
         } else {
            File var3 = new File(SigmaMainClass.getInstance().getSigmaFolder() + "/nbs/" + this.getStringValueByName("Song"));
            this.field_41249 = class_4713.method_21789(var3);
            if (this.field_41249 == null) {
               class_314.method_1443("§cError loading song! Make sure song is saved as <= V3 format");
               this.setEnabled2(false);
               return;
            }
         }

         System.out.println(this.field_41249.method_12741());
         class_314.method_1443("Now Playing: " + this.field_41249.method_12741());
         if (Math.floor((double)(20.0F / this.field_41249.method_12744())) != (double)(20.0F / this.field_41249.method_12744())) {
            class_314.method_1443("§cNBS Error! Invalid tempo! (" + this.field_41249.method_12744() + ") Unpredictable results!");
         }

         this.field_41247 = 0;
         this.field_41248.clear();

         for (BlockPos var4 : class_7494.method_34110(client.playerController.method_42146())) {
            class_2522 var5 = client.theWorld.method_28262(var4);
            if (var5.method_8360() instanceof class_5128) {
               class_663 var6 = new class_663(var4);
               if (this.method_36553(var6) <= 24) {
                  this.field_41248.add(new class_663(var4));
               }
            }
         }

         this.method_36552(this.field_41248);
         this.method_36551(this.field_41248);
      } else {
         class_314.method_1443("§cNoteBlockPlayer isn't available in creative mode!");
         this.setEnabled2(false);
      }
   }

   private int method_36553(class_663 var1) {
      HashMap var4 = new HashMap();

      for (class_663 var6 : this.field_41248) {
         int var7 = var4.getOrDefault(var6.field_3676, 0);
         var4.put(var6.field_3676, var7);
      }

      return var4.getOrDefault(var1.field_3676, 0);
   }
}
