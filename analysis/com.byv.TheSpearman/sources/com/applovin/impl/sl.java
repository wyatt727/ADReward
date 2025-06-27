package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes.dex */
public class sl implements j3 {
    protected sl() {
    }

    @Override // com.applovin.impl.j3
    public long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // com.applovin.impl.j3
    public void b() {
    }

    @Override // com.applovin.impl.j3
    public long c() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.applovin.impl.j3
    public ha a(Looper looper, Handler.Callback callback) {
        return new tl(new Handler(looper, callback));
    }
}
