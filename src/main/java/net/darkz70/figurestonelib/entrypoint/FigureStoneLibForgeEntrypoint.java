package net.darkz70.figurestonelib.entrypoint;

//? if forge {
/*import net.darkz70.figurestonelib.FigureStoneLib;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;

@Mod(FigureStoneLib.MOD_ID)
public class FigureStoneLibForgeEntrypoint {

	public FigureStoneLibForgeEntrypoint() {
		FigureStoneLib.onInitialize();
		DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> FigureStoneLibForgeClientEntrypoint::onInitializeClient);
	}

}

*///?}
