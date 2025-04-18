package net.kylmyk.mojaffa.input;

import com.mojang.blaze3d.platform.InputConstants;
import net.kylmyk.mojaffa.JaffaMod;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.glfw.GLFW;

@Mod.EventBusSubscriber(modid = JaffaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModKeybindings {
    // Key mapping is lazily initialized so it doesn't exist until it is registered
    public static KeyMapping OPEN_JAFFA_SCREEN;

    // Register keybindings to the event bus so that keybindings are registered at the right time
    public static void registerBindings(RegisterKeyMappingsEvent event) {
        OPEN_JAFFA_SCREEN = new KeyMapping(
                "key.mojaffa.open_screen",
                InputConstants.Type.KEYSYM,
                GLFW.GLFW_KEY_W,
                "key.categories.mojaffa"
        );
        event.register(OPEN_JAFFA_SCREEN);
        System.out.println("[JAFFA] Registered keybinding");
    }
}


