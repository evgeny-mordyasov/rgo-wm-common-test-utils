package rgo.wm.common.test.utils.random;

import javax.annotation.Nonnull;
import java.util.concurrent.ThreadLocalRandom;

public final class IntRandom {

    private IntRandom() {
    }

    @Nonnull
    public static Integer randomInt() {
        return ThreadLocalRandom.current().nextInt();
    }

    @Nonnull
    public static Integer randomPositiveInt() {
        return ThreadLocalRandom.current().nextInt(1, Integer.MAX_VALUE);
    }
}
