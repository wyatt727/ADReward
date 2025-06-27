package com.applovin.impl;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class md extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final j5 f643a;
    public final Uri b;
    public final Map c;
    public final long d;

    public md(j5 j5Var, Uri uri, Map map, long j, Throwable th) {
        super(th);
        this.f643a = j5Var;
        this.b = uri;
        this.c = map;
        this.d = j;
    }
}
