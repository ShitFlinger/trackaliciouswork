package edn.stratodonut.trackwork.tracks.blocks.variants;

import edn.stratodonut.trackwork.TrackBlockEntityTypes;
import edn.stratodonut.trackwork.tracks.blocks.WheelBlock;
import edn.stratodonut.trackwork.tracks.blocks.WheelBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class TinySimpleWheelBlock extends WheelBlock {
    public TinySimpleWheelBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockEntityType<WheelBlockEntity> getBlockEntityType() {
        return TrackBlockEntityTypes.TINY_WHEEL.get();
    }
}
