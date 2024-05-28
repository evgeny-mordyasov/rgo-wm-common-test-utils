package rgo.wm.common.test.utils.random;

import javax.annotation.Nonnull;
import java.util.UUID;

public final class StringRandom {

    private StringRandom() {
    }

    @Nonnull
    public static String randomString() {
        return UUID.randomUUID().toString();
    }
}
