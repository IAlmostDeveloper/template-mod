package com.almostdeveloper.templatemod;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class TemplateArmor extends ItemArmor {
    public TemplateArmor(ArmorMaterial armorMaterial, int i, int i1) {
        super(armorMaterial, i, i1);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        return armorType == 2 ? "template_mod:textures/models/armor/template_layer_2.png" : "template_mod:textures/models/armor/template_layer_1.png";
    }
}
