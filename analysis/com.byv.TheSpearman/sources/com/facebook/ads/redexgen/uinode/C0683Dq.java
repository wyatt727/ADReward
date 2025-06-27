package com.facebook.ads.redexgen.uinode;

import android.os.Parcel;

/* renamed from: com.facebook.ads.redexgen.X.Dq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0683Dq {
    public final int A00;
    public final long A01;
    public final long A02;

    public C0683Dq(int i, long j, long j2) {
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
    }

    public /* synthetic */ C0683Dq(int i, long j, long j2, C0682Dp c0682Dp) {
        this(i, j, j2);
    }

    public static C0683Dq A00(Parcel parcel) {
        return new C0683Dq(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }

    public final void A01(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
    }
}
