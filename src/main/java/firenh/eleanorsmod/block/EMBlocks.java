package firenh.eleanorsmod.block;

import firenh.eleanorsmod.EleanorsMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;

public class EMBlocks {
    public static final Block POLISHED_DRIPSTONE = register("polished_dripstone",
        new Block(AbstractBlock.Settings.create()
            .mapColor(MapColor.TERRACOTTA_BROWN)
            .instrument(Instrument.BASEDRUM)
            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
            .requiresTool()
            .strength(1.5f, 1.0f)
        )
    );

    public static final Block DRIPSTONE_SLAB = register("dripstone_slab", (Block)new SlabBlock(AbstractBlock.Settings.copyShallow(Blocks.DRIPSTONE_BLOCK)));
    public static final Block POLISHED_DRIPSTONE_SLAB = register("polished_dripstone_slab", (Block)new SlabBlock(AbstractBlock.Settings.copyShallow(POLISHED_DRIPSTONE)));
    // public static final Block DRIPSTONE_STAIRS = register("dripstone_stairs", (Block)new SlabBlock(AbstractBlock.Settings.copyShallow(Blocks.DRIPSTONE_BLOCK)));
    
    public static void init() {
        new EMBlocks();
    }

    public static Block register(String id, Block block) {
        return Registry.register(Registries.BLOCK, EleanorsMod.id(id), block);
    }
}
