package edn.stratodonut.trackwork_plus.tracks.blocks.variants;

import edn.stratodonut.trackwork_plus.TrackBlockEntityTypes;
import edn.stratodonut.trackwork_plus.tracks.blocks.SuspensionTrackBlock;
import edn.stratodonut.trackwork_plus.tracks.blocks.SuspensionTrackBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class MedSuspensionTrackBlock extends SuspensionTrackBlock {
    public MedSuspensionTrackBlock(Properties properties) {
        super(properties);
    }

    @Override
    public BlockEntityType<SuspensionTrackBlockEntity> getBlockEntityType() {
        return TrackBlockEntityTypes.MED_SUSPENSION_TRACK.get();
    }
}
