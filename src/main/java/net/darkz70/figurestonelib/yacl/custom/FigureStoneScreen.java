package net.darkz70.figurestonelib.yacl.custom;

import net.darkz70.figurestonelib.utils.ScreenUtils;

public interface FigureStoneScreen {

	@SuppressWarnings("all")
	static boolean isFigureStoneScreen() {
		return ScreenUtils.current() instanceof FigureStoneScreen;
	}

}
