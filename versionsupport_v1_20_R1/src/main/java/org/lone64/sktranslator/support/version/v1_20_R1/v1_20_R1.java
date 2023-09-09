package org.lone64.sktranslator.support.version.v1_20_R1;

import org.bukkit.craftbukkit.v1_20_R1.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;

public class v1_20_R1 {

    private final ItemStack stack;

    public v1_20_R1(ItemStack stack) {
        this.stack = stack;
    }

    public String q() {
        return CraftItemStack.asNMSCopy(getStack()).q();
    }

    public ItemStack getStack() {
        return stack;
    }

    public static v1_20_R1 of(ItemStack stack) {
        return new v1_20_R1(stack);
    }

}
