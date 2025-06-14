package name.doinbruz.first.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import name.doinbruz.first.DoinbruzFirstMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TRIPPA_SNIPPA = registerItem("trippa_snippa", new TRIPPA_SNIPPA (new Item.Settings().food(ModFoodComponents.TRIPPA_SNIPPA_FOOD_COMPONENT, ModFoodComponents.TRIPPA_SNIPPA_CONSUMABLE_COMPONENT).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DoinbruzFirstMod.MOD_ID, "trippa_snippa")))));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DoinbruzFirstMod.MOD_ID, name), item);
    }
    
    public static void registerModItems() {
            DoinbruzFirstMod.LOGGER.info("Registering Mod Items for" + DoinbruzFirstMod.MOD_ID);

            ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
                entries.add(TRIPPA_SNIPPA);
            });
        
        }   
}
