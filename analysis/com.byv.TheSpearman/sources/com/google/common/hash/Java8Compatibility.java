package com.google.common.hash;

import java.nio.Buffer;

@ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
final class Java8Compatibility {
    static void clear(Buffer buffer) {
        buffer.clear();
    }

    static void flip(Buffer buffer) {
        buffer.flip();
    }

    static void limit(Buffer buffer, int i) {
        buffer.limit(i);
    }

    static void position(Buffer buffer, int i) {
        buffer.position(i);
    }

    private Java8Compatibility() {
    }
}
