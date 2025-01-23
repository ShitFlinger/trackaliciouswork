package edn.stratodonut.trackwork_plus;

import edn.stratodonut.trackwork_plus.tracks.TrackBeltEntity;
import edn.stratodonut.trackwork_plus.tracks.render.TrackBeltEntityRenderer;
import edn.stratodonut.trackwork_plus.wheel.WheelEntity;
import com.tterrag.registrate.util.entry.EntityEntry;
import net.minecraft.world.entity.MobCategory;
import org.valkyrienskies.mod.client.EmptyRenderer;

import static edn.stratodonut.trackwork_plus.trackwork_plusMod.REGISTRATE;

public class TrackEntityTypes {

    public static final EntityEntry<WheelEntity> WHEEL =
            REGISTRATE.entity("wheel_entity", WheelEntity::new, MobCategory.MISC)
                    .properties(b -> b.setTrackingRange(10)
                            .setUpdateInterval(1)
                            .sized(.3f, .3f)
                            .fireImmune()
                    )
                    .renderer(() -> EmptyRenderer::new)
                    .register();

    public static final EntityEntry<TrackBeltEntity> BELT =
            REGISTRATE.entity("track_belt_entity", TrackBeltEntity::new, MobCategory.MISC)
                    .properties(b -> b.setTrackingRange(10)
                            .setUpdateInterval(1)
                            .sized(1f, 1f)
                            .fireImmune()
                    )
                    .renderer(() -> TrackBeltEntityRenderer::new)
                    .register();

    public static void register() {}
}
