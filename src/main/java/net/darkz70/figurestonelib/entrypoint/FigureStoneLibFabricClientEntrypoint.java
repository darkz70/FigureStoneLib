package net.darkz70.figurestonelib.entrypoint;

//? if fabric {

import net.fabricmc.api.ClientModInitializer;

import net.darkz70.figurestonelib.client.FigureStoneLibClient;

public class FigureStoneLibFabricClientEntrypoint implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		FigureStoneLibClient.onInitializeClient();
	}
}

//?}
