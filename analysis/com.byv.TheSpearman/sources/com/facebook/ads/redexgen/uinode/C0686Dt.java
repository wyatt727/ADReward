package com.facebook.ads.redexgen.uinode;

import android.os.Parcel;

/* renamed from: com.facebook.ads.redexgen.X.Dt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0686Dt {
    public final int A00;
    public final long A01;

    public C0686Dt(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public /* synthetic */ C0686Dt(int i, long j, C0685Ds c0685Ds) {
        this(i, j);
    }

    public static C0686Dt A00(Parcel parcel) {
        return new C0686Dt(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
