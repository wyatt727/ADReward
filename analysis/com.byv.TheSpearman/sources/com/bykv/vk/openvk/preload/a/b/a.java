package com.bykv.vk.openvk.preload.a.b;

import java.util.Objects;

/* compiled from: $Gson$Preconditions.java */
/* loaded from: classes.dex */
public final class a {
    public static <T> T a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }
}
