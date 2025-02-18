package dev.zestyblaze.sculktech;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Sculktech.MODID)
public class Sculktech {
    public static final String MODID = "sculktech";
    public static final Logger LOGGER = LogManager.getLogger();

    public Sculktech(IEventBus modEventBus, ModContainer modContainer) {
    }
}
