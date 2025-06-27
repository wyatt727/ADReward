package com.json;

/* loaded from: classes4.dex */
public class d0 {
    public static final int e = -1;

    /* renamed from: a, reason: collision with root package name */
    private final a f1727a;
    private final long b;
    private final long c;
    private final long d;

    public enum a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public d0(a aVar, long j, long j2, long j3) {
        this.f1727a = aVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public a a() {
        return this.f1727a;
    }

    public long b() {
        return this.d;
    }

    public long c() {
        return this.c;
    }

    public long d() {
        return this.b;
    }

    public boolean e() {
        a aVar = this.f1727a;
        return aVar == a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    public boolean f() {
        a aVar = this.f1727a;
        return aVar == a.MANUAL || aVar == a.MANUAL_WITH_AUTOMATIC_RELOAD;
    }
}
