package edn.stratodonut.trackwork_plus.tracks.blocks.variants;

import edn.stratodonut.trackwork_plus.TrackBlockEntityTypes;
import edn.stratodonut.trackwork_plus.tracks.blocks.PhysEntityTrackBlock;
import edn.stratodonut.trackwork_plus.tracks.blocks.PhysEntityTrackBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class MedPhysEntityTrackBlock extends PhysEntityTrackBlock {
    public MedPhysEntityTrackBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public BlockEntityType<PhysEntityTrackBlockEntity> getBlockEntityType() {
        return TrackBlockEntityTypes.MED_PHYS_TRACK.get();
    }
}
