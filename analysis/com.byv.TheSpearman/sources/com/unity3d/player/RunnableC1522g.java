package com.unity3d.player;

/* renamed from: com.unity3d.player.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class RunnableC1522g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private IAssetPackManagerStatusQueryCallback f4397a;
    private long b;
    private String[] c;
    private int[] d;
    private int[] e;

    RunnableC1522g(IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback, long j, String[] strArr, int[] iArr, int[] iArr2) {
        this.f4397a = iAssetPackManagerStatusQueryCallback;
        this.b = j;
        this.c = strArr;
        this.d = iArr;
        this.e = iArr2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4397a.onStatusResult(this.b, this.c, this.d, this.e);
    }
}
