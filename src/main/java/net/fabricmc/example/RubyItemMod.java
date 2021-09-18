package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RubyItemMod implements ModInitializer {
 
    // an instance of our new item
    public static final Item FABRIC_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {
        System.out.println("Initializing ruby item");
        Registry.register(Registry.ITEM, new Identifier("modid", "ruby"), FABRIC_ITEM);
        
    }
}