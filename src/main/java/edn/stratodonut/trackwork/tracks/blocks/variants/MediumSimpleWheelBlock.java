package edn.stratodonut.trackwork.tracks.blocks.variants;

import edn.stratodonut.trackwork.TrackBlockEntityTypes;
import edn.stratodonut.trackwork.tracks.blocks.WheelBlock;
import edn.stratodonut.trackwork.tracks.blocks.WheelBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class MediumSimpleWheelBlock extends WheelBlock {
    public MediumSimpleWheelBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockEntityType<WheelBlockEntity> getBlockEntityType() {
        return TrackBlockEntityTypes.MEDIUM_WHEEL.get();
    }
}
