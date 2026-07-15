package net.darkz70.figurestonelib.entrypoint;

//? if neoforge {
/*import net.darkz70.figurestonelib.FigureStoneLib;

import net.darkz70.figurestonelib.client.FigureStoneLibClient;
import net.darkz70.figurestonelib.modmenu.*;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.*;
import net.neoforged.fml.common.Mod;

@Mod(value = FigureStoneLib.MOD_ID, dist = Dist.CLIENT)
public class FigureStoneLibNeoForgeClientEntrypoint {

	public FigureStoneLibNeoForgeClientEntrypoint(ModContainer container) {
		FigureStoneLibClient.onInitializeClient();
		TestFigureStoneLibModMenuIntegration integration = new TestFigureStoneLibModMenuIntegration();
		integration.register(container);
	}

}

*///?}

