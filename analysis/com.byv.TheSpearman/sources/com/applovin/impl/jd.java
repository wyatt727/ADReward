package com.applovin.impl;

import android.view.Surface;

/* loaded from: classes.dex */
public class jd extends ed {
    public final int c;
    public final boolean d;

    public jd(Throwable th, fd fdVar, Surface surface) {
        super(th, fdVar);
        this.c = System.identityHashCode(surface);
        this.d = surface == null || surface.isValid();
    }
}
