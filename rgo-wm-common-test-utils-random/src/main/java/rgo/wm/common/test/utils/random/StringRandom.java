package rgo.wm.common.test.utils.random;

import java.util.UUID;

public final class StringRandom {

    private StringRandom() {
    }

    public static String randomString() {
        return UUID.randomUUID().toString();
    }
}
