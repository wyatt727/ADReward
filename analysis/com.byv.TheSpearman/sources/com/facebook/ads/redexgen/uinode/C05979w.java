package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;

/* renamed from: com.facebook.ads.redexgen.X.9w, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05979w {
    public final int A00;
    public final long A01;
    public final long A02;
    public final AH A03;
    public final C0703Eo A04;
    public final TrackGroupArray A05;
    public final C0748Gk A06;
    public final Object A07;
    public final boolean A08;
    public volatile long A09;
    public volatile long A0A;

    public C05979w(AH ah, long j, TrackGroupArray trackGroupArray, C0748Gk c0748Gk) {
        this(ah, null, new C0703Eo(0), j, -9223372036854775807L, 1, false, trackGroupArray, c0748Gk);
    }

    public C05979w(AH ah, Object obj, C0703Eo c0703Eo, long j, long j2, int i, boolean z, TrackGroupArray trackGroupArray, C0748Gk c0748Gk) {
        this.A03 = ah;
        this.A07 = obj;
        this.A04 = c0703Eo;
        this.A02 = j;
        this.A01 = j2;
        this.A0A = j;
        this.A09 = j;
        this.A00 = i;
        this.A08 = z;
        this.A05 = trackGroupArray;
        this.A06 = c0748Gk;
    }

    public static void A00(C05979w c05979w, C05979w c05979w2) {
        c05979w2.A0A = c05979w.A0A;
        c05979w2.A09 = c05979w.A09;
    }

    public final C05979w A01(int i) {
        C05979w c05979w = new C05979w(this.A03, this.A07, this.A04.A00(i), this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, c05979w);
        return c05979w;
    }

    public final C05979w A02(int i) {
        C05979w playbackInfo = new C05979w(this.A03, this.A07, this.A04, this.A02, this.A01, i, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C05979w A03(AH ah, Object obj) {
        C05979w playbackInfo = new C05979w(ah, obj, this.A04, this.A02, this.A01, this.A00, this.A08, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C05979w A04(C0703Eo c0703Eo, long j, long j2) {
        long j3 = j2;
        AH ah = this.A03;
        Object obj = this.A07;
        if (!c0703Eo.A01()) {
            j3 = -9223372036854775807L;
        }
        return new C05979w(ah, obj, c0703Eo, j, j3, this.A00, this.A08, this.A05, this.A06);
    }

    public final C05979w A05(TrackGroupArray trackGroupArray, C0748Gk c0748Gk) {
        C05979w playbackInfo = new C05979w(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, this.A08, trackGroupArray, c0748Gk);
        A00(this, playbackInfo);
        return playbackInfo;
    }

    public final C05979w A06(boolean z) {
        C05979w playbackInfo = new C05979w(this.A03, this.A07, this.A04, this.A02, this.A01, this.A00, z, this.A05, this.A06);
        A00(this, playbackInfo);
        return playbackInfo;
    }
}
