package ru.midage.AZoN;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="Coins", name="Coins", version="1.0")
public class Coins {
	@Instance(value="Coins")
	public static Coins instance;
	
	/** Видите ли, теперь с 1.6.1 EventHandler */
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		/** Возьмем конфиг, предложенный форджем */
		CoinsConfig.init(event.getSuggestedConfigurationFile());
		/** Загрузка предметов */
		CoinsItems.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		/** Загружаем имена предметов */
		CoinsItems.addNames();
	}
}
