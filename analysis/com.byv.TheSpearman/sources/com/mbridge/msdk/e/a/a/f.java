package com.mbridge.msdk.e.a.a;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* compiled from: HttpResponse.java */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final int f2691a;
    private final List<com.mbridge.msdk.e.a.i> b;
    private final int c;
    private final InputStream d;
    private final byte[] e;

    public f(int i, List<com.mbridge.msdk.e.a.i> list) {
        this(i, list, -1, null);
    }

    public f(int i, List<com.mbridge.msdk.e.a.i> list, int i2, InputStream inputStream) {
        this.f2691a = i;
        this.b = list;
        this.c = i2;
        this.d = inputStream;
        this.e = null;
    }

    public final int a() {
        return this.f2691a;
    }

    public final List<com.mbridge.msdk.e.a.i> b() {
        return Collections.unmodifiableList(this.b);
    }

    public final int c() {
        return this.c;
    }

    public final InputStream d() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.e != null) {
            return new ByteArrayInputStream(this.e);
        }
        return null;
    }
}
