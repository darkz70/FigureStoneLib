package net.darkz70.figurestonelib.yacl.api;

import dev.isxander.yacl3.api.*;
import dev.isxander.yacl3.api.YetAnotherConfigLib.Builder;
import dev.isxander.yacl3.gui.YACLScreen;
import net.darkz70.figurestonelib.utils.yacl.SimpleYACLScreenBuilder;
import net.darkz70.figurestonelib.yacl.custom.FigureStoneLibYACLScreen;
import net.darkz70.figurestonelib.yacl.utils.YACLScreenConsumer;
import net.minecraft.client.gui.screens.Screen;
import net.darkz70.figurestonelib.utils.ModMenuUtils;

import java.util.function.Consumer;

@SuppressWarnings("unused")
public class SimpleYACLScreen {

	private final Builder builder;
	private final Screen parent;
	private final String modId;

	public SimpleYACLScreen(String modId, Screen parent, YACLScreenConsumer consumer, Runnable onSave, Consumer<YACLScreen> onInit) {
		this.builder = SimpleYACLScreenBuilder.startBuilder(consumer)
				.title(ModMenuUtils.getModTitle(modId))
				.save(onSave)
				.screenInit(onInit);
		this.parent = parent;
		this.modId = modId;
	}

	public static SimpleYACLScreen startBuilder(String modId, Screen parent, Runnable onSave) {
		return new SimpleYACLScreen(modId, parent, FigureStoneLibYACLScreen::new, onSave, (yaclScreen) -> {});
	}

	public static SimpleYACLScreen startBuilder(String modId, Screen parent, YACLScreenConsumer consumer, Runnable onSave) {
		return new SimpleYACLScreen(modId, parent, consumer, onSave, (yaclScreen) -> {});
	}

	public static SimpleYACLScreen startBuilder(String modId, Screen parent, YACLScreenConsumer consumer, Runnable onSave, Consumer<YACLScreen> init) {
		return new SimpleYACLScreen(modId, parent, consumer, onSave, init);
	}

	public SimpleYACLScreen categories(SimpleCategory... categories) {
		for (SimpleCategory category : categories) {
			if (category == null) {
				continue;
			}
			this.builder.category(category.build(this.modId));
		}
		return this;
	}

	public Screen build() {
		return this.builder.build().generateScreen(this.parent);
	}
}
