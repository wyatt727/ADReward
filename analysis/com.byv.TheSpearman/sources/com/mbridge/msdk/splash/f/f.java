package com.mbridge.msdk.splash.f;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: SplashV3ParamsEntity.java */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private int f3515a;
    private String b;
    private int c;
    private int d;
    private int e;

    public final int a() {
        return this.f3515a;
    }

    public final void a(int i) {
        this.f3515a = i;
    }

    public final String b() {
        return this.b;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final int c() {
        return this.c;
    }

    public final void b(int i) {
        this.c = i;
    }

    public final int d() {
        return this.d;
    }

    public final void c(int i) {
        this.d = i;
    }

    public final int e() {
        return this.e;
    }

    public final void d(int i) {
        this.e = i;
    }

    public final String toString() {
        return "NativeAdvancedV3ParamsEntity{reqType=" + this.f3515a + ", session_id='" + this.b + "', offset=" + this.c + ", expectWidth=" + this.d + ", expectHeight=" + this.e + AbstractJsonLexerKt.END_OBJ;
    }
}
