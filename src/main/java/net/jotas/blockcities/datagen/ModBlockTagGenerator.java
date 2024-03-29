package net.jotas.blockcities.datagen;

import net.jotas.blockcities.BlockCities;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider{

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BlockCities.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        //TODO: Create TAGS here
        /*this.tag(ModTags.Blocks.GEMS_DETECTOR_VALUABLES)
                .add(ModBlocks.RUBY_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.RUBY_ORE.get(),
                        ModBlocks.RUBY_BLOCK.get(),
                        ModBlocks.SOUND_BLOCK.get());


        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.RUBY_ORE.get()).add(ModBlocks.RUBY_BLOCK.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RUBY_ORE.get(),
                        ModBlocks.RUBY_BLOCK.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RUBY_ORE.get()).add(ModBlocks.RUBY_BLOCK.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.RUBY_ORE.get()).add(ModBlocks.RUBY_BLOCK.get());*/
    }
}

