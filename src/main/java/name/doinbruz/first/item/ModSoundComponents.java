package name.doinbruz.first.item;

import name.doinbruz.first.sound.ModSounds;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.world.World;

public class ModSoundComponents extends Item {

    public ModSoundComponents(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack result = super.finishUsing(stack, world, user);

        if (!world.isClient && user instanceof PlayerEntity player) {
            world.playSound(
                null, // plays only for the player
                player.getBlockPos(),
                ModSounds.TRIPPA_SNIPPA_EAT, // your custom sound
                SoundCategory.PLAYERS,
                1.0f,
                1.0f
            );
        }

        return result;
    }
}

