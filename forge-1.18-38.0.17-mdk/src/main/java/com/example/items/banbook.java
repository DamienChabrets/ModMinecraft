package Item;

import com.example.bamboo.Bamboo;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BanBook {

    // Creer nouveau item
    public static final DeferredRegister<Item> items = DeferredRegister.create(ForgeRegistries.ITEMS, Bamboo.ID_MOD);

    // nom de l'item
    private static String itemName = "bambook";

    // Création de l'item
    public static final RegistryObject<Item> bambook = items.register(itemName,
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD))); // Créer l'item et l'ajoute à la liste des items de décoration

    public static void register(IEventBus eventBus){
        items.register(eventBus);
    }



}