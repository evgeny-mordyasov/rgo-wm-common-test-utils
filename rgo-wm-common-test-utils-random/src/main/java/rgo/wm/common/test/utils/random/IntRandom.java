package rgo.wm.common.test.utils.random;

import javax.annotation.Nonnull;
import java.util.concurrent.ThreadLocalRandom;

public final class IntRandom {

    private IntRandom() {
    }

    @Nonnull
    public static Integer randomInt() {
        return randomInt(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Nonnull
    public static Integer randomInt(int origin, int bound) {
        return ThreadLocalRandom.current().nextInt(origin, bound);
    }

    @Nonnull
    public static Integer randomIntInclusive(int origin, int bound) {
        return randomInt(origin, bound + 1);
    }

    @Nonnull
    public static Integer randomPositiveInt() {
        return randomInt(1, Integer.MAX_VALUE);
    }
}
