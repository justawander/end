package net.thesneakycrafter.stellarityendhanced.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.thesneakycrafter.stellarityendhanced.block.ModBlocks;
import net.thesneakycrafter.stellarityendhanced.stellarityendhanced;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, stellarityendhanced.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.AMELIUM_LOG.get())
                .add(ModBlocks.AMELIUM_WOOD.get())
                .add(ModBlocks.STRIPPED_AMELIUM_LOG.get())
                .add(ModBlocks.STRIPPED_AMELIUM_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.AMELIUM_PLANK.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.AMELIUM_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.AMELIUM_FENCE_GATE.get());

    }
}
