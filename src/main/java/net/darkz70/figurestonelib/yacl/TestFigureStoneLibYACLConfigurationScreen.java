package net.darkz70.figurestonelib.yacl;

import lombok.experimental.ExtensionMethod;
import net.darkz70.figurestonelib.FigureStoneLib;
import net.darkz70.figurestonelib.yacl.api.*;
import net.darkz70.figurestonelib.config.FigureStoneLibConfig;
import net.darkz70.figurestonelib.utils.ModMenuUtils;
import net.darkz70.figurestonelib.yacl.extension.SimpleOptionExtension;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import java.util.function.Function;

@ExtensionMethod(SimpleOptionExtension.class)
public class TestFigureStoneLibYACLConfigurationScreen {

	private static final Function<Boolean, Component> ENABLED_OR_DISABLE_FORMATTER = ModMenuUtils.getEnabledOrDisabledFormatter();

	private TestFigureStoneLibYACLConfigurationScreen() {
		throw new IllegalStateException("Screen class");
	}

	public static Screen createTestScreen(Screen parent) {
		FigureStoneLibConfig defConfig = FigureStoneLibConfig.getNewInstance();
		FigureStoneLibConfig config = FigureStoneLibConfig.getInstance();

		return SimpleYACLScreen.startBuilder(FigureStoneLib.MOD_ID, parent, config::saveAsync)
				.categories(getGeneralCategory(defConfig, config))
				.build();
	}

	private static SimpleCategory getGeneralCategory(FigureStoneLibConfig defConfig, FigureStoneLibConfig config) {
		return SimpleCategory.startBuilder("general")
				.groups(getFigureStoneGroup(defConfig, config));
	}

	private static SimpleGroup getFigureStoneGroup(FigureStoneLibConfig defConfig, FigureStoneLibConfig config) {
		return SimpleGroup.startBuilder("figurestone_group").options(
				SimpleOption.<Boolean>startBuilder("figurestone")
						.withBinding(defConfig.isFigureStone(), config::isFigureStone, config::setFigureStone, true)
						.withController(ENABLED_OR_DISABLE_FORMATTER)
						.withDescription(SimpleContent.NONE),
				SimpleOption.<Boolean>startFieldBuilder("figurestone", defConfig, config)
						.withController(ENABLED_OR_DISABLE_FORMATTER)
						.withDescription(SimpleContent.NONE),
				SimpleOption.<Boolean>startFieldBuilder("figurestone", defConfig, config)
						.withController(ENABLED_OR_DISABLE_FORMATTER)
						.withDescription(SimpleContent.NONE),
				SimpleOption.<Boolean>startFieldBuilder("figurestone", defConfig, config)
						.withController(ENABLED_OR_DISABLE_FORMATTER)
						.withDescription(SimpleContent.NONE),
				SimpleOption.<Boolean>startFieldBuilder("figurestone", defConfig, config)
						.withController(ENABLED_OR_DISABLE_FORMATTER)
						.withDescription(SimpleContent.NONE),
				SimpleOption.<Boolean>startFieldBuilder("figurestone", defConfig, config)
						.withController(ENABLED_OR_DISABLE_FORMATTER)
						.withDescription(SimpleContent.NONE),
				SimpleOption.<Boolean>startFieldBuilder("figurestone", defConfig, config)
						.withController(ENABLED_OR_DISABLE_FORMATTER)
						.withDescription(SimpleContent.NONE),
				SimpleOption.<Boolean>startFieldBuilder("figurestone", defConfig, config)
						.withController(ENABLED_OR_DISABLE_FORMATTER)
						.withDescription(SimpleContent.NONE),
				SimpleOption.<Boolean>startFieldBuilder("figurestone", defConfig, config)
						.withController(ENABLED_OR_DISABLE_FORMATTER)
						.withDescription(SimpleContent.NONE),
				SimpleOption.<Boolean>startFieldBuilder("figurestone", defConfig, config)
						.withController(ENABLED_OR_DISABLE_FORMATTER)
						.withDescription(SimpleContent.NONE),
				SimpleOption.<Boolean>startFieldBuilder("figurestone", defConfig, config)
						.withController(ENABLED_OR_DISABLE_FORMATTER)
						.withDescription(SimpleContent.NONE),
				SimpleOption.<Boolean>startFieldBuilder("figurestone", defConfig, config)
						.withController(ENABLED_OR_DISABLE_FORMATTER)
						.withDescription(SimpleContent.NONE)
		);
	}

}


