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

    @Nonnull
    public static String randomUUIDAsString() {
        return UUID.randomUUID().toString();
    }
}
