package com.devmaster.mysterious_temples.util;


import com.devmaster.mysterious_temples.blocks.BlockItemBase;
import com.devmaster.mysterious_temples.blocks.ForestTempleBrick;
import com.devmaster.mysterious_temples.misc.MysteriousTemples;
import net.minecraft.block.Block;
import net.minecraft.entity.*;
import net.minecraft.item.*;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MysteriousTemples.MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, MysteriousTemples.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MysteriousTemples.MOD_ID);
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MysteriousTemples.MOD_ID);

    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        SOUNDS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


    //Blocks
    public static final RegistryObject<Block> LIGHT_FOREST_TEMPLE_BRICKS = BLOCKS.register("light_forest_temple_bricks", ForestTempleBrick::new);

    //Block Items
    public static final RegistryObject<Item> LIGHT_FOREST_TEMPLE_BRICKS_ITEM = ITEMS.register("light_forest_temple_bricks", () -> new BlockItemBase(LIGHT_FOREST_TEMPLE_BRICKS.get()));

    //Entities

    //Items
}