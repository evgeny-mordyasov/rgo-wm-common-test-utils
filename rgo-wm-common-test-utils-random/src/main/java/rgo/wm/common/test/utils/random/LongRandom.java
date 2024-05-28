package rgo.wm.common.test.utils.random;

import java.util.concurrent.ThreadLocalRandom;

public final class LongRandom {

    private LongRandom() {
    }

    public static Long randomLong() {
        return ThreadLocalRandom.current().nextLong();
    }

    public static Long randomPositiveLong() {
        return ThreadLocalRandom.current().nextLong(1, Long.MAX_VALUE);
    }
}
