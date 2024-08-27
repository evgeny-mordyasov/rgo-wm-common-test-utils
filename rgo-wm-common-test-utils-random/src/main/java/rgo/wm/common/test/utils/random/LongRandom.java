package rgo.wm.common.test.utils.random;

import javax.annotation.Nonnull;
import java.util.concurrent.ThreadLocalRandom;

public final class LongRandom {

    private LongRandom() {
    }

    @Nonnull
    public static Long randomLong() {
        return randomLong(Long.MIN_VALUE, Long.MAX_VALUE);
    }

    @Nonnull
    public static Long randomLong(long origin, long bound) {
        return ThreadLocalRandom.current().nextLong(origin, bound);
    }

    @Nonnull
    public static Long randomLongInclusive(long origin, long bound) {
        return randomLong(origin, bound + 1);
    }

    @Nonnull
    public static Long randomPositiveLong() {
        return randomLong(1, Long.MAX_VALUE);
    }
}
