package net.darkz70.figurestonelib.reload;

import java.util.concurrent.Executor;
import net.darkz70.figurestonelib.FigureStoneLib;
import net.darkz70.figurestonelib.client.FigureStoneLibClient;
import net.darkz70.figurestonelib.loader.FigureStoneLoader;
import net.minecraft.server.packs.resources.ResourceManager;

public class TestFigureStoneLibReloadListener extends AbstractResourceReloadListener {

	@Override
	public String getModId() {
		return FigureStoneLib.MOD_ID;
	}

	@Override
	protected void reloadStuff(PreparationBarrier synchronizer, ResourceManager manager, Executor prepareExecutor, Executor applyExecutor) {
		if (FigureStoneLoader.isDevelopmentEnvironment()) {
			FigureStoneLibClient.LOGGER.info("Reload Listener Works!");
		}
	}
}
