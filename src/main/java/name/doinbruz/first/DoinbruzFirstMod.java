package name.doinbruz.first;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import name.doinbruz.first.item.ModItems;

public class DoinbruzFirstMod implements ModInitializer {
	public static final String MOD_ID = "doinbruz-first-mod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {	
				
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();
		LOGGER.info("Mod items registered for " + MOD_ID);
	}
}