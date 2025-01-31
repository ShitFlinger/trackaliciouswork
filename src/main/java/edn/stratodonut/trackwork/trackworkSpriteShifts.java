package edn.stratodonut.trackwork;

import com.simibubi.create.foundation.block.render.SpriteShiftEntry;
import com.simibubi.create.foundation.block.render.SpriteShifter;

public class trackworkSpriteShifts {
    public static final SpriteShiftEntry BELT = get("block/belt", "block/belt_scroll");

    private static SpriteShiftEntry get(String originalLocation, String targetLocation) {
        return SpriteShifter.get(trackworkMod.getResource(originalLocation), trackworkMod.getResource(targetLocation));
    }

    public static void init() {}
}
