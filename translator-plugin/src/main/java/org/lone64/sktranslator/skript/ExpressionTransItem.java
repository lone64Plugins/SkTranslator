package org.lone64.sktranslator.skript;

import ch.njol.skript.Skript;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.ExpressionType;
import ch.njol.skript.lang.SkriptParser;
import ch.njol.skript.lang.util.SimpleExpression;
import ch.njol.util.Kleenean;
import org.bukkit.event.Event;
import org.bukkit.inventory.ItemStack;
import org.eclipse.jdt.annotation.Nullable;
import org.lone64.mclibraries.MCLib;
import org.lone64.sktranslator.api.version.VersionSupport;
import org.lone64.sktranslator.util.Util;

public class ExpressionTransItem extends SimpleExpression<String> {

    static {
        Skript.registerExpression(ExpressionTransItem.class, String.class, ExpressionType.SIMPLE,
                "translate item by %itemstack%");
    }

    private Expression<ItemStack> item;

    @Override
    @SuppressWarnings("unchecked")
    public boolean init(Expression<?>[] data, int matchedPattern, Kleenean kleenean, SkriptParser.ParseResult parseResult) {
        this.item = (Expression<ItemStack>) data[0];
        return true;
    }

    @Override
    protected @Nullable String[] get(Event e) {
        ItemStack stack = this.item.getSingle(e);
        String itemName = VersionSupport.getItemName(stack);
        String translated = (String) new MCLib()
                .getJsonObj(Util.decode("aHR0cDovL21jbGliLmxvbmU2NC5vcmc6ODEvbGFuZy9rb19rci88dmVyc2lvbj4v").replace("<version>", VersionSupport.getVersion())).get(itemName);
        return new String[]{translated};
    }

    @Override
    public boolean isSingle() {
        return true;
    }

    @Override
    public Class<? extends String> getReturnType() {
        return String.class;
    }

    @Override
    public String toString(@Nullable Event e, boolean debug) {
        return "translate item by " + this.item.getSingle(e);
    }

}
