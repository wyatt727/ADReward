package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;

/* renamed from: com.facebook.ads.redexgen.X.Ge, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0742Ge {

    @Deprecated
    public final int A00;
    public final int A01;
    public final TrackGroupArray A02;
    public final int[] A03;
    public final int[] A04;
    public final TrackGroupArray[] A05;
    public final int[][][] A06;

    public C0742Ge(int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
        this.A04 = iArr;
        this.A05 = trackGroupArrayArr;
        this.A06 = iArr3;
        this.A03 = iArr2;
        this.A02 = trackGroupArray;
        int length = iArr.length;
        this.A01 = length;
        this.A00 = length;
    }

    public final int A00() {
        return this.A01;
    }

    public final int A01(int i) {
        return this.A04[i];
    }

    public final TrackGroupArray A02(int i) {
        return this.A05[i];
    }
}
