package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;

/* compiled from: WindVanePlugin.java */
/* loaded from: classes4.dex */
public abstract class h {
    protected Context b;
    protected Object c;
    protected WindVaneWebView d;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.b = context;
        this.d = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.c = obj;
        this.d = windVaneWebView;
    }
}
