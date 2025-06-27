package com.applovin.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class ic {
    private static final AtomicLong h = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final long f530a;
    public final j5 b;
    public final Uri c;
    public final Map d;
    public final long e;
    public final long f;
    public final long g;

    public static long a() {
        return h.getAndIncrement();
    }

    public ic(long j, j5 j5Var, long j2) {
        this(j, j5Var, j5Var.f560a, Collections.emptyMap(), j2, 0L, 0L);
    }

    public ic(long j, j5 j5Var, Uri uri, Map map, long j2, long j3, long j4) {
        this.f530a = j;
        this.b = j5Var;
        this.c = uri;
        this.d = map;
        this.e = j2;
        this.f = j3;
        this.g = j4;
    }
}
