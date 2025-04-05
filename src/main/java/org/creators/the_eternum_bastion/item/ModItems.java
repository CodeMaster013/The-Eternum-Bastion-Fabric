package org.creators.the_eternum_bastion.item;

import org.creators.the_eternum_bastion.TheEternumBastion;
import org.creators.the_eternum_bastion.item.custom.GuideBookItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item GUIDE_BOOK = registerItem("guide_book",
            new GuideBookItem(new FabricItemSettings().group(ModItemGroup.BASTION)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TheEternumBastion.MOD_ID, name), item);
    }

    public static void registerModItems() {
        // This method ensures the class is loaded and items are registered
    }
}