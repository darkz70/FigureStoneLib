package net.darkz70.figurestonelib.mixin.yacl;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import dev.isxander.yacl3.api.YetAnotherConfigLib;
import dev.isxander.yacl3.impl.YetAnotherConfigLibImpl;
import net.darkz70.figurestonelib.utils.yacl.SimpleYACLScreenConfig;
import net.darkz70.figurestonelib.yacl.utils.YACLScreenConsumer;
import net.minecraft.client.gui.screens.Screen;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;

@Pseudo
@Mixin(YetAnotherConfigLibImpl.class)
public class YetAnotherConfigLibImplMixin implements SimpleYACLScreenConfig {

	@Dynamic
	@Unique
	private YACLScreenConsumer consumer = null;

	@Dynamic
	@ModifyReturnValue(at = @At("RETURN"), method = "generateScreen", remap = false)
	private Screen swapScreen(Screen original, @Local(argsOnly = true) Screen parent) {
		if (this.consumer == null) {
			return original;
		}
		return this.consumer.apply(((YetAnotherConfigLib) this), parent);
	}


	@Override
	public YetAnotherConfigLib figurestonelib$setConsumer(YACLScreenConsumer consumer) {
		this.consumer = consumer;
		return ((YetAnotherConfigLib) this);
	}
}
