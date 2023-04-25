package derp.asphaltblocks;

import derp.asphaltblocks.block.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AsphaltBlocks implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("asphalt-blocks");
	public static final String MOD_ID = "asphaltblocks";
	private static final ItemGroup ASPHALT_BLOCKS = FabricItemGroup.builder(new Identifier("asphaltblocks", "blocks"))
			.icon(() -> new ItemStack(ModBlocks.ASPHALT_BLOCK))
			.build();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
		ItemGroupEvents.modifyEntriesEvent(ASPHALT_BLOCKS).register(content -> {
			content.add(ModBlocks.ASPHALT_BLOCK);
			content.add(ModBlocks.ASPHALT_SLAB);
			content.add(ModBlocks.ASPHALT_CARPET);
		});
	}
}