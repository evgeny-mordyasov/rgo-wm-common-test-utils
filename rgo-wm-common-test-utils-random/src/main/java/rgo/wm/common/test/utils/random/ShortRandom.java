package rgo.wm.common.test.utils.random;

import javax.annotation.Nonnull;
import java.util.concurrent.ThreadLocalRandom;

public final class ShortRandom {

    private ShortRandom() {
    }

    @Nonnull
    public static Short randomShort() {
        return randomShort(Short.MIN_VALUE, Short.MAX_VALUE);
    }

    @Nonnull
    public static Short randomShort(int origin, int bound) {
        return (short) ThreadLocalRandom.current().nextInt(origin, bound);
    }

    @Nonnull
    public static Short randomShortInclusive(int origin, int bound) {
        return randomShort(origin, bound + 1);
    }

    @Nonnull
    public static Short randomPositiveShort() {
        return randomShort(1, Short.MAX_VALUE);
    }
}
