package derp.asphaltblocks.block;

import derp.asphaltblocks.AsphaltBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.CarpetBlock;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(AsphaltBlocks.MOD_ID, name), block);
    }

    public static final Block ASPHALT_BLOCK = registerBlock("asphalt_block", new Block (FabricBlockSettings.of(Material.STONE).strength(0.2f).sounds((BlockSoundGroup.DRIPSTONE_BLOCK))));
    public static final Block ASPHALT_SLAB = registerBlock("asphalt_slab", new SlabBlock (FabricBlockSettings.of(Material.STONE).strength(0.2f).sounds((BlockSoundGroup.DRIPSTONE_BLOCK))));
    public static final Block ASPHALT_CARPET = registerBlock("asphalt_carpet", new CarpetBlock (FabricBlockSettings.of(Material.STONE).strength(0.2f).sounds((BlockSoundGroup.DRIPSTONE_BLOCK))));

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(AsphaltBlocks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        AsphaltBlocks.LOGGER.debug("Registering ModBlocks for " + AsphaltBlocks.MOD_ID);
    }
}