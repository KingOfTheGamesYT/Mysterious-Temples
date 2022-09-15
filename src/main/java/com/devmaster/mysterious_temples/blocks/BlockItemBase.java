package com.devmaster.mysterious_temples.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Properties().group(ItemGroup.BUILDING_BLOCKS));
    }
}
