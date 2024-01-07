package com.almostdeveloper.templatemod.main;

import com.almostdeveloper.templatemod.items.ModItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = TemplateMod.MODID, version = TemplateMod.VERSION)
public class TemplateMod
{
    public static final String MODID = "template_mod";
    public static final String VERSION = "1.0";

    public static final CreativeTabs templateTab = new CreativeTabs("tabTemplateMod") {
        @Override
        public Item getTabIconItem() {
            return new ItemStack(ModItems.templateItem).getItem();
        }
    };

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ModItems.initItems();
        ModItems.registerItems();
        GameRegistry.registerWorldGenerator(new TemplateWorldGenerator(), 0);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        CraftingManager.register();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
