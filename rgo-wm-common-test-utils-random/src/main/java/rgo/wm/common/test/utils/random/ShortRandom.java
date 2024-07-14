package rgo.wm.common.test.utils.random;

import javax.annotation.Nonnull;
import java.util.concurrent.ThreadLocalRandom;

public final class ShortRandom {

    private ShortRandom() {
    }

    @Nonnull
    public static Short randomShort() {
        return (short) ThreadLocalRandom.current().nextInt(Short.MIN_VALUE, Short.MAX_VALUE);
    }

    @Nonnull
    public static Short randomPositiveShort() {
        return (short) ThreadLocalRandom.current().nextInt(1, Short.MAX_VALUE);
    }
}
