package firenh.eleanorsmod.item;

import firenh.eleanorsmod.EleanorsMod;
import firenh.eleanorsmod.block.EMBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

public class EMItems {
    public static final Item POLISHED_DRIPSTONE = register(EMBlocks.POLISHED_DRIPSTONE);
    public static final Item DRIPSTONE_SLAB = register(EMBlocks.DRIPSTONE_SLAB);
    public static final Item POLISHED_DRIPSTONE_SLAB = register(EMBlocks.POLISHED_DRIPSTONE_SLAB);

    private static void addToBuildingBlocksGroup(FabricItemGroupEntries entries) {
        entries.add(POLISHED_DRIPSTONE);
        entries.add(DRIPSTONE_SLAB);
        entries.add(POLISHED_DRIPSTONE_SLAB);
    }

    public static void init() {
        new EMItems();

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(EMItems::addToBuildingBlocksGroup);
    }

    private static Item register(Block block) {
        return Items.register(new BlockItem(block, new Item.Settings()));
    }

    private static Item register(String id, Item item) {
        return Items.register(EleanorsMod.id(id), item);
    }
}
