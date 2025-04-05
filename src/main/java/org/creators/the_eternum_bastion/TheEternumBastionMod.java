package org.creators.the_eternum_bastion;

import org.creators.the_eternum_bastion.item.ModItems;
import net.fabricmc.api.ModInitializer;

public class TheEternumBastionMod implements ModInitializer {
    public static final String MOD_ID = "the_eternum_bastion";

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
    }
}
