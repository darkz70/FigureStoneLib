package net.darkz70.figurestonelib.client;

import net.darkz70.figurestonelib.client.command.TestFigureStoneLibCommandsManager;
import net.darkz70.figurestonelib.loader.FigureStoneLoader;
import net.darkz70.figurestonelib.logger.FigureStoneLogger;

import net.darkz70.figurestonelib.FigureStoneLib;
import net.darkz70.figurestonelib.reload.TestFigureStoneLibReloadListener;

public class FigureStoneLibClient {

	public static FigureStoneLogger LOGGER = FigureStoneLib.LOGGER.extend("Client");

	public static void onInitializeClient() {
		LOGGER.info("{} Client Initialized", FigureStoneLib.MOD_NAME);
		FigureStoneLoader.registerReloadListener(new TestFigureStoneLibReloadListener());
		FigureStoneLoader.registerCommands(TestFigureStoneLibCommandsManager::register);
	}

}
