package edn.stratodonut.trackwork_plus;

import com.simibubi.create.foundation.damageTypes.DamageTypeBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.damagesource.DamageType;

public class TrackDamageTypes {
    public static final ResourceKey<DamageType> RUN_OVER = key("run_over");

    private static ResourceKey<DamageType> key(String name) {
        return ResourceKey.create(Registries.DAMAGE_TYPE, trackwork_plusMod.getResource(name));
    }

    public static void bootstrap(BootstapContext<DamageType> ctx) {
        new DamageTypeBuilder(RUN_OVER).register(ctx);
    }
}
