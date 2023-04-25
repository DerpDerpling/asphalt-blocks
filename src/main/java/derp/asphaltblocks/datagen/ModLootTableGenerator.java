package derp.asphaltblocks.datagen;

import derp.asphaltblocks.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {

    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ASPHALT_BLOCK);
        addDrop(ModBlocks.ASPHALT_SLAB);
        addDrop(ModBlocks.ASPHALT_CARPET);

    }
}
