package net.darkz70.figurestonelib.config;

import lombok.*;
import net.darkz70.figurestonelib.loader.FigureStoneLoader;
import net.darkz70.figurestonelib.utils.*;
import org.slf4j.*;

import com.mojang.serialization.*;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.darkz70.figurestonelib.FigureStoneLib;

import java.io.*;
import java.util.concurrent.CompletableFuture;

import static net.darkz70.figurestonelib.utils.CodecUtils.option;

@Getter
@Setter
@AllArgsConstructor
public class FigureStoneLibConfig {

	public static final Codec<FigureStoneLibConfig> CODEC = RecordCodecBuilder.create(instance -> instance.group(
			option("figurestone", false, Codec.BOOL, FigureStoneLibConfig::isFigureStone)
	).apply(instance, FigureStoneLibConfig::new));

	private static final File CONFIG_FILE = FigureStoneLoader.getConfigDir().resolve(FigureStoneLib.MOD_ID + ".json5").toFile();
	private static final Logger LOGGER = LoggerFactory.getLogger(FigureStoneLib.MOD_NAME + "/Config");
	private static FigureStoneLibConfig INSTANCE;
	
	private boolean figureStone;

	private FigureStoneLibConfig() {
		throw new IllegalArgumentException();
	}

	public static FigureStoneLibConfig getInstance() {
		return INSTANCE == null ? reload() : INSTANCE;
	}

	public static FigureStoneLibConfig reload() {
		return INSTANCE = FigureStoneLibConfig.read();
	}

	public static FigureStoneLibConfig getNewInstance() {
		return CodecUtils.parseNewInstanceHacky(CODEC);
	}

	private static FigureStoneLibConfig read() {
		return ConfigUtils.readConfig(CODEC, CONFIG_FILE, LOGGER);
	}

	public void saveAsync() {
		CompletableFuture.runAsync(this::save);
	}

	public void save() {
		ConfigUtils.saveConfig(this, CODEC, CONFIG_FILE, LOGGER);
	}
}
