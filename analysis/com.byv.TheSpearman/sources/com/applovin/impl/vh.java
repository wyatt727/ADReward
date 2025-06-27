package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class vh extends pk {
    public static final Parcelable.Creator<vh> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f1095a;
    public final long b;
    public final byte[] c;

    private vh(long j, byte[] bArr, long j2) {
        this.f1095a = j2;
        this.b = j;
        this.c = bArr;
    }

    static vh a(yg ygVar, int i, long j) {
        long jY = ygVar.y();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        ygVar.a(bArr, 0, i2);
        return new vh(jY, bArr, j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f1095a);
        parcel.writeLong(this.b);
        parcel.writeByteArray(this.c);
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public vh[] newArray(int i) {
            return new vh[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public vh createFromParcel(Parcel parcel) {
            return new vh(parcel, null);
        }
    }

    private vh(Parcel parcel) {
        this.f1095a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = (byte[]) yp.a((Object) parcel.createByteArray());
    }

    /* synthetic */ vh(Parcel parcel, a aVar) {
        this(parcel);
    }
}
