package com.applovin.impl;

/* loaded from: classes.dex */
public final class e8 extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final int f378a;

    private static String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }

    public e8(int i) {
        super(a(i));
        this.f378a = i;
    }
}
