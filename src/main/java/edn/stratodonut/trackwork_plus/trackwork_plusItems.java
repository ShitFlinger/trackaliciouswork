package edn.stratodonut.trackwork_plus;

import com.simibubi.create.AllCreativeModeTabs;
import com.simibubi.create.foundation.data.AssetLookup;
import com.tterrag.registrate.util.entry.ItemEntry;
import edn.stratodonut.trackwork_plus.items.TrackToolkit;

import static edn.stratodonut.trackwork_plus.trackwork_plusMod.REGISTRATE;

public class trackwork_plusItems {
    static {
        REGISTRATE.setCreativeTab(AllCreativeModeTabs.BASE_CREATIVE_TAB);
    }

    public static final ItemEntry<TrackToolkit> TRACK_TOOL_KIT =
            REGISTRATE.item("track_tool_kit", TrackToolkit::new)
                    .properties(p -> p.stacksTo(1))
                    .model(AssetLookup.itemModelWithPartials())
                    .register();

//    public static final ItemEntry<ControllerResetStick> CONTROL_RESET_STICK =
//            REGISTRATE.item("dev_reset_stick", ControllerResetStick::new)
//                    .properties(p -> p.stacksTo(1))
//                    .register();

    public static void register() {}
}
