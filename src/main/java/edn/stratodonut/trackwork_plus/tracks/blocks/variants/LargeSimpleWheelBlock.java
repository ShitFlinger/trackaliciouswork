package edn.stratodonut.trackwork_plus.tracks.blocks.variants;

import edn.stratodonut.trackwork_plus.TrackBlockEntityTypes;
import edn.stratodonut.trackwork_plus.tracks.blocks.SuspensionTrackBlock;
import edn.stratodonut.trackwork_plus.tracks.blocks.SuspensionTrackBlockEntity;
import edn.stratodonut.trackwork_plus.tracks.blocks.WheelBlock;
import edn.stratodonut.trackwork_plus.tracks.blocks.WheelBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class LargeSimpleWheelBlock extends WheelBlock {
    public LargeSimpleWheelBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockEntityType<WheelBlockEntity> getBlockEntityType() {
        return TrackBlockEntityTypes.LARGE_WHEEL.get();
    }
}
