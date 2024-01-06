package com.almostdeveloper.templatemod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = TemplateMod.MODID, version = TemplateMod.VERSION)
public class TemplateMod
{
    public static final String MODID = "template_mod";
    public static final String VERSION = "1.0";

    public static Item templateItem;
    public static Block templateBlock;
    public static Item templateFood;

    public static Item templatePickaxe;
    public static Item templateAxe;
    public static Item templateShovel;
    public static Item templateHoe;
    public static Item templateSword;

    public static Item templateHelmet;
    public static Item templateChestplate;
    public static Item templateLeggings;
    public static Item templateBoots;

    public static Item.ToolMaterial templateMaterial = EnumHelper.addToolMaterial("TemplateMaterial", 4, 2000, 20f, 200f, 50);
public static ItemArmor.ArmorMaterial templateArmorMaterial = EnumHelper.addArmorMaterial("TemplateArmorMaterial", 2000, new int[]{10,10,10,10}, 50);
    public static CreativeTabs templateTab = new CreativeTabs("tabTemplateMod") {
        @Override
        public Item getTabIconItem() {
            return new ItemStack(templateItem).getItem();
        }
    };

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        // Block init and registering
        // Config handling

        templateItem = new TemplateItem().setUnlocalizedName("TemplateItem").setTextureName("template_mod:templateItem").setCreativeTab(templateTab);
        templateBlock = new TemplateBlock(Material.rock).setBlockName("TemplateBlock").setBlockTextureName("template_mod:templateBlock").setCreativeTab(templateTab);
        templateFood = new TemplateFood(5, 0.5f, true).setUnlocalizedName("TemplateFood").setTextureName("template_mod:templateFood").setCreativeTab(templateTab);

        templatePickaxe = new TemplatePickaxe(templateMaterial).setUnlocalizedName("TemplatePickaxe")
                .setCreativeTab(CreativeTabs.tabTools)
                .setCreativeTab(templateTab)
                .setTextureName("template_mod:templatePickaxe");
        templateAxe = new TemplateAxe(templateMaterial).setUnlocalizedName("TemplateAxe")
                .setCreativeTab(CreativeTabs.tabTools)
                .setCreativeTab(templateTab)
                .setTextureName("template_mod:templateAxe");
        templateShovel = new TemplateShovel(templateMaterial).setUnlocalizedName("TemplateShovel")
                .setCreativeTab(CreativeTabs.tabTools)
                .setCreativeTab(templateTab)
                .setTextureName("template_mod:templateShovel");
        templateHoe = new TemplateHoe(templateMaterial).setUnlocalizedName("TemplateHoe")
                .setCreativeTab(CreativeTabs.tabTools)
                .setCreativeTab(templateTab)
                .setTextureName("template_mod:templateHoe");
        templateSword = new TemplateSword(templateMaterial).setUnlocalizedName("TemplateSword")
                .setCreativeTab(CreativeTabs.tabCombat)
                .setCreativeTab(templateTab)
                .setTextureName("template_mod:templateSword");

        templateHelmet = new TemplateHelmet(templateArmorMaterial, 0, 0).setUnlocalizedName("TemplateHelmet").setCreativeTab(templateTab).setTextureName("template_mod:templateHelmet");
        templateChestplate= new TemplateChestplate(templateArmorMaterial, 0, 1).setUnlocalizedName("TemplateChestplate").setCreativeTab(templateTab).setTextureName("template_mod:templateChest");
        templateLeggings = new TemplateLeggings(templateArmorMaterial, 0, 2).setUnlocalizedName("TemplateLeggings").setCreativeTab(templateTab).setTextureName("template_mod:templateLeggins");
        templateBoots = new TemplateBoots(templateArmorMaterial, 0, 3).setUnlocalizedName("TemplateBoots").setCreativeTab(templateTab).setTextureName("template_mod:templateBoots");

        GameRegistry.registerItem(templateItem, templateItem.getUnlocalizedName());
        GameRegistry.registerBlock(templateBlock, templateBlock.getUnlocalizedName());

        GameRegistry.registerItem(templatePickaxe, templatePickaxe.getUnlocalizedName());
        GameRegistry.registerItem(templateAxe, templateAxe.getUnlocalizedName());
        GameRegistry.registerItem(templateShovel, templateShovel.getUnlocalizedName());
        GameRegistry.registerItem(templateHoe, templateHoe.getUnlocalizedName());
        GameRegistry.registerItem(templateSword, templateSword.getUnlocalizedName());

        GameRegistry.registerItem(templateHelmet, templateHelmet.getUnlocalizedName());
        GameRegistry.registerItem(templateChestplate, templateChestplate.getUnlocalizedName());
        GameRegistry.registerItem(templateLeggings, templateLeggings.getUnlocalizedName());
        GameRegistry.registerItem(templateBoots, templateBoots.getUnlocalizedName());

        GameRegistry.registerItem(templateFood, templateFood.getUnlocalizedName());

        GameRegistry.registerWorldGenerator(new TemplateGeneration(), 0);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        BlockColored blackWool = (BlockColored)Blocks.wool;
        BlockColored magentaWool = (BlockColored)Blocks.wool;

        // ToDo Different wool colors?
        //blackWool.damageDropped(15);
        //magentaWool.damageDropped(2);

        GameRegistry.addRecipe(new ItemStack(templateItem), new Object[] {  "BBB",
                                                                            " B ",
                                                                            "PBP",
                                                                    'B', blackWool ,
                                                                    'P', magentaWool });
        //ToDo Different positions in workbench&
        //ToDo IRecipe impementation
        GameRegistry.addShapedRecipe(new ItemStack(templateBlock), new Object[] {"TT ","TT ","   ", 'T', templateItem});
        GameRegistry.addShapedRecipe(new ItemStack(templateBlock), new Object[] {"   ", "TT ","TT ", 'T', templateItem});


        GameRegistry.addRecipe(new ItemStack(templatePickaxe), new Object[] {"MMM", " S ", " S ", 'M', templateItem, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(templateAxe), new Object[] {" MM", " SM", " S ", 'M', templateItem, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(templateShovel), new Object[] {" M ", " S ", " S ", 'M', templateItem, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(templateHoe), new Object[] {" MM", " S ", " S ", 'M', templateItem, 'S', Items.stick});
        GameRegistry.addRecipe(new ItemStack(templateSword), new Object[] {" M ", " M ", " S ", 'M', templateItem, 'S', Items.stick});

        GameRegistry.addRecipe(new ItemStack(templateHelmet), new Object[] {"MMM", "M M", "   ", 'M' , templateItem});
        GameRegistry.addRecipe(new ItemStack(templateHelmet), new Object[] {"   ", "MMM", "M M", 'M' , templateItem});
        GameRegistry.addRecipe(new ItemStack(templateChestplate), new Object[] {"M M", "MMM", "MMM", 'M' , templateItem});
        GameRegistry.addRecipe(new ItemStack(templateLeggings), new Object[] {"MMM", "M M", "M M", 'M' , templateItem});
        GameRegistry.addRecipe(new ItemStack(templateBoots), new Object[] {"   ", "M M", "M M", 'M' , templateItem});
        GameRegistry.addRecipe(new ItemStack(templateBoots), new Object[] {"M M", "M M", "   ", 'M' , templateItem});

        GameRegistry.addShapelessRecipe(new ItemStack(templateItem, 4), templateBlock);

        GameRegistry.addSmelting(templateItem, new ItemStack(templateBlock), 500.0f);
    }

    @EventHandler
    public void init(FMLPostInitializationEvent event)
    {

    }
}
