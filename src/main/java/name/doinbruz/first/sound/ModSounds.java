package name.doinbruz.first.sound;

import name.doinbruz.first.DoinbruzFirstMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent TRIPPA_SNIPPA_EAT = registerSoundEvent("trippa_snippa_eat");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(DoinbruzFirstMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    } 
    
    public static void registerSounds() {
        DoinbruzFirstMod.LOGGER.info("Registering sounds for " + DoinbruzFirstMod.MOD_ID);
    }

}
