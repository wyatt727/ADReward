package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.uinode.C0788Hz;
import com.facebook.ads.redexgen.uinode.Dv;
import com.facebook.ads.redexgen.uinode.IB;

/* loaded from: assets/audience_network.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static String[] A02 = {"sG", "SKgiCa5d9ZEELz", "pKJUtOIsmSdeWRhSmfkg", "RYqFvMPt4ygOGY", "4ulFqSy6k9HwIYoxn5tcLFNrNsE", "F6U", "Ool37D46w9DvUWXVHkToeSd93UD8I33w", "iJFoxGzstNUDxHZj"};
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new Dv();
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public /* synthetic */ TimeSignalCommand(long j, long j2, Dv dv) {
        this(j, j2);
    }

    public static long A00(C0788Hz c0788Hz, long j) {
        long jA0E = c0788Hz.A0E();
        if ((128 & jA0E) == 0) {
            return -9223372036854775807L;
        }
        long j2 = (1 & jA0E) << 32;
        long jA0M = c0788Hz.A0M();
        String[] strArr = A02;
        if (strArr[7].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[1] = "aue9bKRLYwGt4M";
        strArr2[3] = "U8dfBAcmUh1N3t";
        return ((j2 | jA0M) + j) & 8589934591L;
    }

    public static TimeSignalCommand A01(C0788Hz c0788Hz, long j, IB ib) {
        long jA00 = A00(c0788Hz, j);
        return new TimeSignalCommand(jA00, ib.A07(jA00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
