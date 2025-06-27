package com.applovin.impl;

import java.io.IOException;

/* loaded from: classes.dex */
public class ah extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f272a;
    public final int b;

    public static ah a(String str, Throwable th) {
        return new ah(str, th, true, 1);
    }

    public static ah b(String str, Throwable th) {
        return new ah(str, th, true, 0);
    }

    public static ah a(String str) {
        return new ah(str, null, false, 1);
    }

    protected ah(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f272a = z;
        this.b = i;
    }
}
