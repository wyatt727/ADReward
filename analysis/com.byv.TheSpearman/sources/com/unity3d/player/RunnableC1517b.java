package com.unity3d.player;

import java.util.Iterator;
import java.util.Set;

/* renamed from: com.unity3d.player.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class RunnableC1517b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private Set f4392a;
    private String b;
    private int c;
    private long d;
    private long e;
    private int f;
    private int g;

    RunnableC1517b(Set set, String str, int i, long j, long j2, int i2, int i3) {
        this.f4392a = set;
        this.b = str;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = i2;
        this.g = i3;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = this.f4392a.iterator();
        while (it.hasNext()) {
            ((IAssetPackManagerDownloadStatusCallback) it.next()).onStatusUpdate(this.b, this.c, this.d, this.e, this.f, this.g);
        }
    }
}
