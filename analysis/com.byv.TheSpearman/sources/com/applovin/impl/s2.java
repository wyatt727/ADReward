package com.applovin.impl;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    private long f875a;
    private long b;
    private boolean c;
    private long d;
    private long e;
    private int f;
    private Throwable g;

    public String toString() {
        return "CacheStatsTracker{totalDownloadedBytes=" + this.f875a + ", totalCachedBytes=" + this.b + ", isHTMLCachingCancelled=" + this.c + ", htmlResourceCacheSuccessCount=" + this.d + ", htmlResourceCacheFailureCount=" + this.e + AbstractJsonLexerKt.END_OBJ;
    }

    public void c() {
        this.c = true;
    }

    public void b() {
        this.d++;
    }

    public void a() {
        this.e++;
    }

    public void a(Throwable th) {
        this.g = th;
    }

    public void a(int i) {
        this.f = i;
    }

    public void a(long j) {
        this.b += j;
    }
}
