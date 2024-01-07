package com.almostdeveloper.templatemod.items;

import com.almostdeveloper.templatemod.items.armor.TemplateBoots;
import com.almostdeveloper.templatemod.items.armor.TemplateChestplate;
import com.almostdeveloper.templatemod.items.armor.TemplateHelmet;
import com.almostdeveloper.templatemod.items.armor.TemplateLeggings;
import com.almostdeveloper.templatemod.items.block.TemplateBlock;
import com.almostdeveloper.templatemod.items.food.TemplateFood;
import com.almostdeveloper.templatemod.items.tool.TemplateAxe;
import com.almostdeveloper.templatemod.items.tool.TemplateHoe;
import com.almostdeveloper.templatemod.items.tool.TemplatePickaxe;
import com.almostdeveloper.templatemod.items.tool.TemplateShovel;
import com.almostdeveloper.templatemod.items.weapon.TemplateSword;
import com.almostdeveloper.templatemod.main.TemplateMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
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

    public static final Item.ToolMaterial templateMaterial = EnumHelper.addToolMaterial("TemplateMaterial", 4, 2000, 20f, 200f, 50);
    public static final ItemArmor.ArmorMaterial templateArmorMaterial = EnumHelper.addArmorMaterial("TemplateArmorMaterial", 2000, new int[]{10,10,10,10}, 50);

    public static void initItems(){
        templateItem = new TemplateItem().setUnlocalizedName("TemplateItem").setTextureName("template_mod:templateItem").setCreativeTab(TemplateMod.templateTab);
        templateBlock = new TemplateBlock(Material.rock).setBlockName("TemplateBlock").setBlockTextureName("template_mod:templateBlock").setCreativeTab(TemplateMod.templateTab);
        templateFood = new TemplateFood(5, 0.5f, true).setUnlocalizedName("TemplateFood").setTextureName("template_mod:templateFood").setCreativeTab(TemplateMod.templateTab);

        templatePickaxe = new TemplatePickaxe(templateMaterial).setUnlocalizedName("TemplatePickaxe")
                .setCreativeTab(CreativeTabs.tabTools)
                .setCreativeTab(TemplateMod.templateTab)
                .setTextureName("template_mod:templatePickaxe");
        templateAxe = new TemplateAxe(templateMaterial).setUnlocalizedName("TemplateAxe")
                .setCreativeTab(CreativeTabs.tabTools)
                .setCreativeTab(TemplateMod.templateTab)
                .setTextureName("template_mod:templateAxe");
        templateShovel = new TemplateShovel(templateMaterial).setUnlocalizedName("TemplateShovel")
                .setCreativeTab(CreativeTabs.tabTools)
                .setCreativeTab(TemplateMod.templateTab)
                .setTextureName("template_mod:templateShovel");
        templateHoe = new TemplateHoe(templateMaterial).setUnlocalizedName("TemplateHoe")
                .setCreativeTab(CreativeTabs.tabTools)
                .setCreativeTab(TemplateMod.templateTab)
                .setTextureName("template_mod:templateHoe");
        templateSword = new TemplateSword(templateMaterial).setUnlocalizedName("TemplateSword")
                .setCreativeTab(CreativeTabs.tabCombat)
                .setCreativeTab(TemplateMod.templateTab)
                .setTextureName("template_mod:templateSword");

        templateHelmet = new TemplateHelmet(templateArmorMaterial, 0, 0).setUnlocalizedName("TemplateHelmet").setCreativeTab(TemplateMod.templateTab).setTextureName("template_mod:templateHelmet");
        templateChestplate= new TemplateChestplate(templateArmorMaterial, 0, 1).setUnlocalizedName("TemplateChestplate").setCreativeTab(TemplateMod.templateTab).setTextureName("template_mod:templateChest");
        templateLeggings = new TemplateLeggings(templateArmorMaterial, 0, 2).setUnlocalizedName("TemplateLeggings").setCreativeTab(TemplateMod.templateTab).setTextureName("template_mod:templateLeggins");
        templateBoots = new TemplateBoots(templateArmorMaterial, 0, 3).setUnlocalizedName("TemplateBoots").setCreativeTab(TemplateMod.templateTab).setTextureName("template_mod:templateBoots");
    }

    public static void registerItems(){
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
    }
}
