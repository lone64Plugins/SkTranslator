package org.lone64.sktranslator.support.version.v1_16_R3;

import org.bukkit.craftbukkit.v1_16_R3.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

public class v1_16_R3 {

    private final ItemStack stack;

    public v1_16_R3(ItemStack stack) {
        this.stack = stack;
    }

    public String q() {
        return CraftItemStack.asNMSCopy(getStack()).j();
    }

    public ItemStack getStack() {
        return stack;
    }

    public static v1_16_R3 of(ItemStack stack) {
        return new v1_16_R3(stack);
    }

}
