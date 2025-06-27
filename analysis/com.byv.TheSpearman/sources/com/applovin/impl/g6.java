package com.applovin.impl;

import android.content.Context;
import android.util.SparseArray;
import com.applovin.impl.g5;
import com.applovin.impl.t5;
import com.applovin.impl.yh;

/* loaded from: classes.dex */
public final class g6 implements yd {

    /* renamed from: a, reason: collision with root package name */
    private final g5.a f448a;
    private final SparseArray b;
    private final int[] c;
    private long d;
    private long e;
    private long f;
    private float g;
    private float h;

    private static SparseArray a(g5.a aVar, m8 m8Var) {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, (yd) Class.forName("com.applovin.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(yd.class).getConstructor(g5.a.class).newInstance(aVar));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (yd) Class.forName("com.applovin.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(yd.class).getConstructor(g5.a.class).newInstance(aVar));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (yd) Class.forName("com.applovin.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(yd.class).getConstructor(g5.a.class).newInstance(aVar));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (yd) Class.forName("com.applovin.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(yd.class).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new yh.b(aVar, m8Var));
        return sparseArray;
    }

    public g6(Context context, m8 m8Var) {
        this(new t5.a(context), m8Var);
    }

    public g6(g5.a aVar, m8 m8Var) {
        this.f448a = aVar;
        SparseArray sparseArrayA = a(aVar, m8Var);
        this.b = sparseArrayA;
        this.c = new int[sparseArrayA.size()];
        for (int i = 0; i < this.b.size(); i++) {
            this.c[i] = this.b.keyAt(i);
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
    }
}
