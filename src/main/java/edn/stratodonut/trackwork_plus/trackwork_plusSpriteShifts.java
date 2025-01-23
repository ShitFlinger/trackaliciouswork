package edn.stratodonut.trackwork_plus;

import com.simibubi.create.foundation.block.render.SpriteShiftEntry;
import com.simibubi.create.foundation.block.render.SpriteShifter;

public class trackwork_plusSpriteShifts {
    public static final SpriteShiftEntry BELT = get("block/belt", "block/belt_scroll");

    private static SpriteShiftEntry get(String originalLocation, String targetLocation) {
        return SpriteShifter.get(trackwork_plusMod.getResource(originalLocation), trackwork_plusMod.getResource(targetLocation));
    }

    public static void init() {}
}
