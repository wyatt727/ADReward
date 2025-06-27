package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;

/* loaded from: assets/audience_network.dex */
public final class EF {
    public final float A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final DownloadAction A04;
    public final Throwable A05;

    public EF(int i, DownloadAction downloadAction, int i2, float f, long j, Throwable th) {
        this.A02 = i;
        this.A04 = downloadAction;
        this.A01 = i2;
        this.A00 = f;
        this.A03 = j;
        this.A05 = th;
    }

    public /* synthetic */ EF(int i, DownloadAction downloadAction, int i2, float f, long j, Throwable th, E5 e5) {
        this(i, downloadAction, i2, f, j, th);
    }
}
