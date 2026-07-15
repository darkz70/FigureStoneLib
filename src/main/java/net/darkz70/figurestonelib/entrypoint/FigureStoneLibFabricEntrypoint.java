package net.darkz70.figurestonelib.entrypoint;

//? if fabric {

import net.darkz70.figurestonelib.FigureStoneLib;

import net.fabricmc.api.ModInitializer;

public class FigureStoneLibFabricEntrypoint implements ModInitializer {

	@Override
	public void onInitialize() {
		FigureStoneLib.onInitialize();
	}
}

//?}
