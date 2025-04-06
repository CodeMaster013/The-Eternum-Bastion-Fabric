package org.creators.the_eternum_bastion.item;

import org.creators.the_eternum_bastion.TheEternumBastionMod;
import org.creators.the_eternum_bastion.item.custom.GuideBookItem;
import net.minecraft.item.ItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item LORE_BOOK = registerItem("lore_book",
            new GuideBookItem(new FabricItemSettings().group(ItemGroup.TOOLS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TheEternumBastionMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        // This method ensures the class is loaded and items are registered
    }
}