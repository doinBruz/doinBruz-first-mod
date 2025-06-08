package name.doinbruz.first.item;

import name.doinbruz.first.sound.ModSounds;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.world.World;

public class TRIPPA_SNIPPA extends Item {

    public TRIPPA_SNIPPA(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack result = super.finishUsing(stack, world, user);

        if (!world.isClient && user instanceof PlayerEntity player) {
            world.playSound(
                null, // null = all nearby players hear it
                player.getBlockPos(),
                ModSounds.TRIPPA_SNIPPA_EAT,
                SoundCategory.PLAYERS,
                1.0f,
                1.0f
            );
        }

        return result;
    }
}
// This class extends Item and overrides the finishUsing method to play a custom sound when the item is consumed.
// The sound is played for all nearby players, not just the one consuming the item.