package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class eo extends pk {
    public static final Parcelable.Creator<eo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f394a;
    public final long b;

    private eo(long j, long j2) {
        this.f394a = j;
        this.b = j2;
    }

    static eo a(yg ygVar, long j, io ioVar) {
        long jA = a(ygVar, j);
        return new eo(jA, ioVar.b(jA));
    }

    /* synthetic */ eo(long j, long j2, a aVar) {
        this(j, j2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f394a);
        parcel.writeLong(this.b);
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public eo[] newArray(int i) {
            return new eo[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public eo createFromParcel(Parcel parcel) {
            return new eo(parcel.readLong(), parcel.readLong(), null);
        }
    }

    static long a(yg ygVar, long j) {
        long jW = ygVar.w();
        if ((128 & jW) != 0) {
            return 8589934591L & ((((jW & 1) << 32) | ygVar.y()) + j);
        }
        return -9223372036854775807L;
    }
}
