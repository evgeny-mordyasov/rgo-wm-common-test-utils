package rgo.wm.common.test.utils.random;

import java.util.concurrent.ThreadLocalRandom;

public final class IntRandom {

    private IntRandom() {
    }

    public static Integer randomInt() {
        return ThreadLocalRandom.current().nextInt();
    }

    public static Integer randomPositiveInt() {
        return ThreadLocalRandom.current().nextInt(1, Integer.MAX_VALUE);
    }
}
