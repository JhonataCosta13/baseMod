package net.jotas.blockcities.item;

import net.jotas.blockcities.BlockCities;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BlockCities.MOD_ID);

    //TODO: Copy this and change the name to create new Creative Tabs
    /*public static final RegistryObject<CreativeModeTab> BASIC_TAB = CREATIVE_MODE_TABS.register("basic_tab", //TODO: Change the name here too: 'like_this'
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COIN.get())) //TODO: Here you can change the tab icon: new ItemStack(ModItems.YOURITEMHERE.get()
                    .title(Component.translatable("creativetab.basic_tab")) //TODO: Change the name here too: 'like_this'
                    .displayItems((itemDisplayParameters, output) -> {

                        //TODO: Copy this to add a custom item
                        output.accept(ModItems.COIN.get());
                        output.accept(ModItems.GEMS_DETECTOR.get());
                        output.accept(ModItems.DONUT.get());
                        output.accept(ModItems.GASOLINE.get());

                        //TODO: Copy this to add a custom block
                        output.accept(ModBlocks.RUBY_BLOCK.get());


                        //TODO: Copy this to add a vanilla item
                        output.accept(Items.DIAMOND_HOE);
                    })
                    .build());*/

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
