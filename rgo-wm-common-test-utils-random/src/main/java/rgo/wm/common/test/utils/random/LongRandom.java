package rgo.wm.common.test.utils.random;

import javax.annotation.Nonnull;
import java.util.concurrent.ThreadLocalRandom;

public final class LongRandom {

    private LongRandom() {
    }

    @Nonnull
    public static Long randomLong() {
        return ThreadLocalRandom.current().nextLong();
    }

    @Nonnull
    public static Long randomPositiveLong() {
        return ThreadLocalRandom.current().nextLong(1, Long.MAX_VALUE);
    }
}
