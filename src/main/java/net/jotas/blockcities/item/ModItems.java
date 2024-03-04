package net.jotas.blockcities.item;

import net.jotas.blockcities.BlockCities;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BlockCities.MOD_ID);

    //TODO: Just copy this and edit the name for more Items,
    //TODO: The name in the .register must be lower case, words separated 'like_this'
    //TODO: You can change the item properties: new Item.Properties().youcanchoosethepropertyhere
    /*public static final RegistryObject<Item> COIN = ITEMS.register("coin",
           () -> new Item(new Item.Properties()));*/

    //TODO: Go to ModFoods.class before editing this
    //TODO: Copy this and edit the name for more Food Items
    /*public static final RegistryObject<Item> DONUT = ITEMS.register("donut",
            () -> new Item(new Item.Properties().food(ModFoods.DONUT)));*/

    //TODO: Just copy this and edit the name for more Fuel Items
    /*public static final RegistryObject<Item> GASOLINE = ITEMS.register("gasoline",
            () -> new FuelItem(new Item.Properties(), 400)); //burnTime is in ticks, 400 = 20 seconds*/

    //TODO: Just copy this and edit the name for more Advanced Items
    /*public static final RegistryObject<Item> GEMS_DETECTOR = ITEMS.register("gems_detector",
            () -> new GemsDetectorItem(new Item.Properties().durability(100))); //This item can be use 100 times*/

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
