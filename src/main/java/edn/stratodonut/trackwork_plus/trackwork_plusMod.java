package edn.stratodonut.trackwork_plus;

import com.mojang.logging.LogUtils;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.item.ItemDescription;
import com.simibubi.create.foundation.item.TooltipHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("trackwork_plus")
public class trackwork_plusMod
{
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public static final String MOD_ID = "trackwork_plus";
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MOD_ID);

    static {
        REGISTRATE.setTooltipModifierFactory(item ->
                new ItemDescription.Modifier(item, TooltipHelper.Palette.STANDARD_CREATE));
    }

    public trackwork_plusMod() { onCtor(); }

    public void onCtor() {
        ModLoadingContext modLoadingContext = ModLoadingContext.get();
        IEventBus modEventBus = FMLJavaModLoadingContext.get()
                .getModEventBus();

        REGISTRATE.registerEventListeners(modEventBus);

        trackwork_plusConfigs.register(modLoadingContext);
        TrackCreativeTabs.register(modEventBus);
        trackwork_plusItems.register();
        TrackBlocks.register();
        TrackBlockEntityTypes.register();
        TrackEntityTypes.register();
        TrackPackets.registerPackets();
        TrackSounds.register(modEventBus);

        modEventBus.addListener(EventPriority.LOWEST, TrackDatagen::gatherData);

        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> TrackPonders::register);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> trackwork_plusPartialModels::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> trackwork_plusSpriteShifts::init);
    }

    public static void warn(String format, Object arg) {
        LOGGER.warn(format, arg);
    }

    public static void warn(String format, Object... args) {
        LOGGER.warn(format, args);
    }

    public static ResourceLocation getResource(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
