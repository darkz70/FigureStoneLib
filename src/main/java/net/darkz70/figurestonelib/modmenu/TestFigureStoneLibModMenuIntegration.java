package net.darkz70.figurestonelib.modmenu;

import net.darkz70.figurestonelib.FigureStoneLib;
import net.darkz70.figurestonelib.yacl.TestFigureStoneLibYACLConfigurationScreen;
import net.minecraft.client.gui.screens.Screen;

public class TestFigureStoneLibModMenuIntegration extends AbstractModMenuIntegration {

	@Override
	protected String getModId() {
		return FigureStoneLib.MOD_ID;
	}

	@Override
	protected Screen createConfigScreen(Screen parent) {
		return TestFigureStoneLibYACLConfigurationScreen.createTestScreen(parent);
	}
}

