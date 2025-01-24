package edn.stratodonut.trackwork_plus;

import com.jozufozu.flywheel.core.PartialModel;

public class trackwork_plusPartialModels {
    public static final PartialModel
            SUSPENSION_WHEEL = block("wheels"),
            MED_SUSPENSION_WHEEL = block("med_wheels"),
            LARGE_SUSPENSION_WHEEL = block("large_wheels"),
            COGS = block("cogs"),
            MED_COGS = block("med_cogs"),
            LARGE_COGS = block("large_cogs"),
            TRACK_LINK = block("track_link"),
            TRACK_WRAP = block("wrapped_link"),
            SIMPLE_WHEEL = block("simple_wheel"),
            SIMPLE_WHEEL_RIB = block("partial/simple_wheel_rib"),
            SIMPLE_WHEEL_RIB_UPPER = block("partial/simple_wheel_rib_upper"),
            SIMPLE_WHEEL_SPRING_BASE = block("partial/simple_wheel_spring_base"),
            SIMPLE_WHEEL_SPRING_COIL = block("partial/simple_wheel_spring_coil"),
            LARGE_SIMPLE_WHEEL = block("large_simple_wheel");

    private static PartialModel block(String path) {
        return new PartialModel(trackwork_plusMod.getResource("block/" + path));
    }

    public static void init() {}
}
