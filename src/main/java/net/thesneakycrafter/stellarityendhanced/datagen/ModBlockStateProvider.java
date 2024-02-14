package net.thesneakycrafter.stellarityendhanced.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thesneakycrafter.stellarityendhanced.block.ModBlocks;
import net.thesneakycrafter.stellarityendhanced.stellarityendhanced;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, stellarityendhanced.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        blockWithItem(ModBlocks.AMELIUM_GRASS);

        logBlock(((RotatedPillarBlock) ModBlocks.AMELIUM_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.AMELIUM_WOOD.get()), blockTexture(ModBlocks.AMELIUM_LOG.get()), blockTexture(ModBlocks.AMELIUM_LOG.get()));

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_AMELIUM_LOG.get()), blockTexture(ModBlocks.STRIPPED_AMELIUM_LOG.get()),
                new ResourceLocation(stellarityendhanced.MOD_ID, "block/stripped_amelium_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_AMELIUM_WOOD.get()), blockTexture(ModBlocks.STRIPPED_AMELIUM_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_AMELIUM_LOG.get()));

        blockItem(ModBlocks.AMELIUM_LOG);
        blockItem(ModBlocks.AMELIUM_WOOD);
        blockItem(ModBlocks.STRIPPED_AMELIUM_LOG);
        blockItem(ModBlocks.STRIPPED_AMELIUM_WOOD);

        blockWithItem(ModBlocks.AMELIUM_PLANK);

        stairsBlock(((StairBlock) ModBlocks.AMELIUM_STAIRS.get()), blockTexture(ModBlocks.AMELIUM_PLANK.get()));
        slabBlock(((SlabBlock) ModBlocks.AMELIUM_SLAB.get()), blockTexture(ModBlocks.AMELIUM_PLANK.get()), blockTexture(ModBlocks.AMELIUM_PLANK.get()));

        buttonBlock(((ButtonBlock) ModBlocks.AMELIUM_BUTTON.get()), blockTexture(ModBlocks.AMELIUM_PLANK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.AMELIUM_PRESSURE_PLATE.get()), blockTexture(ModBlocks.AMELIUM_PLANK.get()));

        fenceBlock(((FenceBlock) ModBlocks.AMELIUM_FENCE.get()), blockTexture(ModBlocks.AMELIUM_PLANK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.AMELIUM_FENCE_GATE.get()), blockTexture(ModBlocks.AMELIUM_PLANK.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.AMELIUM_DOOR.get()), modLoc("block/amelium_door_bottom"), modLoc("block/amelium_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.AMELIUM_TRAPDOOR.get()), modLoc("block/amelium_trapdoor"), true, "cutout");


    }
    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(stellarityendhanced.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
