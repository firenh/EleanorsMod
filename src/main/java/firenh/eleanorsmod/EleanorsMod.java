package firenh.eleanorsmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import firenh.eleanorsmod.block.EMBlocks;
import firenh.eleanorsmod.entity.effect.EMStatusEffect;
import firenh.eleanorsmod.item.EMItems;

public class EleanorsMod implements ModInitializer {
	public static final String MODID = "eleanorsmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	public static Identifier id(String id) {
		return new Identifier(MODID, id);
	}

	@Override
	public void onInitialize() {
		EMBlocks.init();
		EMItems.init();
		EMStatusEffect.init();
	}
}