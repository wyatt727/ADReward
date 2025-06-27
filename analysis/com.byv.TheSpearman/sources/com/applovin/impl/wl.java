package com.applovin.impl;

/* loaded from: classes.dex */
abstract class wl {

    /* renamed from: a, reason: collision with root package name */
    protected final ro f1136a;

    protected abstract boolean a(yg ygVar);

    protected abstract boolean b(yg ygVar, long j);

    public static final class a extends ah {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    protected wl(ro roVar) {
        this.f1136a = roVar;
    }

    public final boolean a(yg ygVar, long j) {
        return a(ygVar) && b(ygVar, j);
    }
}
