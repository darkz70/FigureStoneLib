package net.darkz70.figurestonelib.utils.yacl;

import dev.isxander.yacl3.api.YetAnotherConfigLib;
import dev.isxander.yacl3.api.YetAnotherConfigLib.Builder;
import net.darkz70.figurestonelib.yacl.utils.YACLScreenConsumer;

public interface SimpleYACLScreenBuilder {

	static Builder startBuilder(YACLScreenConsumer consumer) {
		return ((SimpleYACLScreenBuilder) YetAnotherConfigLib.createBuilder()).figurestonelib$setConsumer(consumer);
	}

	Builder figurestonelib$setConsumer(YACLScreenConsumer consumer);
}
