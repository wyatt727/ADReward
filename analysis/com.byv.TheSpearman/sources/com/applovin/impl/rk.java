package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class rk extends pk {
    public static final Parcelable.Creator<rk> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f863a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean f;
    public final long g;
    public final long h;
    public final List i;
    public final boolean j;
    public final long k;
    public final int l;
    public final int m;
    public final int n;

    private rk(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List list, boolean z5, long j4, int i, int i2, int i3) {
        this.f863a = j;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = Collections.unmodifiableList(list);
        this.j = z5;
        this.k = j4;
        this.l = i;
        this.m = i2;
        this.n = i3;
    }

    static rk a(yg ygVar, long j, io ioVar) {
        List list;
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        long j3;
        int iC;
        int iW;
        int iW2;
        boolean z4;
        boolean z5;
        long jY;
        long jY2 = ygVar.y();
        boolean z6 = (ygVar.w() & 128) != 0;
        List listEmptyList = Collections.emptyList();
        if (z6) {
            list = listEmptyList;
            z = false;
            z2 = false;
            j2 = -9223372036854775807L;
            z3 = false;
            j3 = -9223372036854775807L;
            iC = 0;
            iW = 0;
            iW2 = 0;
            z4 = false;
        } else {
            int iW3 = ygVar.w();
            boolean z7 = (iW3 & 128) != 0;
            boolean z8 = (iW3 & 64) != 0;
            boolean z9 = (iW3 & 32) != 0;
            boolean z10 = (iW3 & 16) != 0;
            long jA = (!z8 || z10) ? -9223372036854775807L : eo.a(ygVar, j);
            if (!z8) {
                int iW4 = ygVar.w();
                ArrayList arrayList = new ArrayList(iW4);
                for (int i = 0; i < iW4; i++) {
                    int iW5 = ygVar.w();
                    long jA2 = !z10 ? eo.a(ygVar, j) : -9223372036854775807L;
                    arrayList.add(new b(iW5, jA2, ioVar.b(jA2), null));
                }
                listEmptyList = arrayList;
            }
            if (z9) {
                long jW = ygVar.w();
                boolean z11 = (128 & jW) != 0;
                jY = ((((jW & 1) << 32) | ygVar.y()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
                jY = -9223372036854775807L;
            }
            iC = ygVar.C();
            z4 = z8;
            iW = ygVar.w();
            iW2 = ygVar.w();
            list = listEmptyList;
            long j4 = jA;
            z3 = z5;
            j3 = jY;
            z2 = z10;
            z = z7;
            j2 = j4;
        }
        return new rk(jY2, z6, z, z4, z2, j2, ioVar.b(j2), list, z3, j3, iC, iW, iW2);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f864a;
        public final long b;
        public final long c;

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        private b(int i, long j, long j2) {
            this.f864a = i;
            this.b = j;
            this.c = j2;
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f864a);
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
        }

        /* synthetic */ b(int i, long j, long j2, a aVar) {
            this(i, j, j2);
        }
    }

    private rk(Parcel parcel) {
        this.f863a = parcel.readLong();
        this.b = parcel.readByte() == 1;
        this.c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        this.f = parcel.readByte() == 1;
        this.g = parcel.readLong();
        this.h = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(b.a(parcel));
        }
        this.i = Collections.unmodifiableList(arrayList);
        this.j = parcel.readByte() == 1;
        this.k = parcel.readLong();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f863a);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.g);
        parcel.writeLong(this.h);
        int size = this.i.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((b) this.i.get(i2)).b(parcel);
        }
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rk[] newArray(int i) {
            return new rk[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rk createFromParcel(Parcel parcel) {
            return new rk(parcel, null);
        }
    }

    /* synthetic */ rk(Parcel parcel, a aVar) {
        this(parcel);
    }
}
