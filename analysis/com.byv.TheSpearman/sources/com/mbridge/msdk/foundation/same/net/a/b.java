package com.mbridge.msdk.foundation.same.net.a;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: CronetResponse.java */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private Exception f2865a;
    private com.mbridge.msdk.foundation.same.net.f.b b;
    private int c;

    public final Exception a() {
        return this.f2865a;
    }

    public final com.mbridge.msdk.foundation.same.net.f.b b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final String toString() {
        return "CronetResponse{status=" + this.c + ", httpResponse=" + this.b + ", exception=" + this.f2865a + AbstractJsonLexerKt.END_OBJ;
    }
}
