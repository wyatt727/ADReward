package com.mbridge.msdk.foundation.same.net.f;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* compiled from: HttpResponse.java */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f2885a;
    private final List<com.mbridge.msdk.foundation.same.net.d.b> b;
    private final int c;

    public b(int i, List<com.mbridge.msdk.foundation.same.net.d.b> list, InputStream inputStream) {
        this.c = i;
        this.b = list;
        this.f2885a = inputStream;
    }

    public final InputStream a() {
        return this.f2885a;
    }

    public final List<com.mbridge.msdk.foundation.same.net.d.b> b() {
        return Collections.unmodifiableList(this.b);
    }

    public final int c() {
        return this.c;
    }
}
