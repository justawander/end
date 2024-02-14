package net.thesneakycrafter.stellarityendhanced.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.thesneakycrafter.stellarityendhanced.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    protected ModBlockLootTables(Set<Item> pExplosionResistant, FeatureFlagSet pEnabledFeatures) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.AMELIUM_GRASS.get());
        this.dropSelf(ModBlocks.AMELIUM_PLANK.get());
        this.dropSelf(ModBlocks.AMELIUM_LOG.get());
        this.dropSelf(ModBlocks.AMELIUM_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_AMELIUM_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_AMELIUM_LOG.get());

        this.add(ModBlocks.AMELIUM_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.AMELIUM_GRASS.get(), NORMAL_LEAVES_SAPLING_CHANCES)); // TODO: Change to Sapling!

        this.dropSelf(ModBlocks.AMELIUM_STAIRS.get());
        this.dropSelf(ModBlocks.AMELIUM_BUTTON.get());
        this.dropSelf(ModBlocks.AMELIUM_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.AMELIUM_TRAPDOOR.get());
        this.dropSelf(ModBlocks.AMELIUM_FENCE.get());
        this.dropSelf(ModBlocks.AMELIUM_FENCE_GATE.get());

        this.add(ModBlocks.AMELIUM_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.AMELIUM_SLAB.get()));
        this.add(ModBlocks.AMELIUM_DOOR.get(),
                block -> createDoorTable(ModBlocks.AMELIUM_DOOR.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
