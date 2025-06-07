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
    public static final Item TRIPPA_SNIPPA = registerItem("trippa_snippa", new Item(new Item.Settings().food(ModFoodComponents.TRIPPA_SNIPPA_FOOD_COMPONENT,ModFoodComponents.TRIPPA_SNIPPA_CONSUMABLE_COMPONENT).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DoinbruzFirstMod.MOD_ID, "trippa_snippa")))));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DoinbruzFirstMod.MOD_ID, name), item);
    }
    
    public static void registerModItems() {
            DoinbruzFirstMod.LOGGER.info("Registering Mod Items for" + DoinbruzFirstMod.MOD_ID);

            ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
                entries.add(TRIPPA_SNIPPA);
            });
        
        }   
            // This method is intended to register items in the mod.
    
    
    // This class is used to register items in the mod.
    // It is empty for now, but you can add item registration logic here later.
    // For example, you can use Fabric's ItemRegistry to register items.
    // See the Fabric documentation for more details on how to do this.
    
    // public static final Item EXAMPLE_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC));
    
    // public static void registerItems() {
    // 	Registry.register(Registry.ITEM, new Identifier(DoinbruzFirstMod.MOD_ID, "example_item"), EXAMPLE_ITEM);
    // }
}
