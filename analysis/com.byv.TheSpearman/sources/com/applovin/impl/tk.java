package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class tk extends pk {
    public static final Parcelable.Creator<tk> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final List f1036a;

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f1038a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final long e;
        public final List f;
        public final boolean g;
        public final long h;
        public final int i;
        public final int j;
        public final int k;

        private c(long j, boolean z, boolean z2, boolean z3, List list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f1038a = j;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.f = Collections.unmodifiableList(list);
            this.e = j2;
            this.g = z4;
            this.h = j3;
            this.i = i;
            this.j = i2;
            this.k = i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c b(yg ygVar) {
            ArrayList arrayList;
            boolean z;
            long j;
            boolean z2;
            long j2;
            int i;
            int i2;
            int iW;
            boolean z3;
            boolean z4;
            long jY;
            long jY2 = ygVar.y();
            boolean z5 = (ygVar.w() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z5) {
                arrayList = arrayList2;
                z = false;
                j = -9223372036854775807L;
                z2 = false;
                j2 = -9223372036854775807L;
                i = 0;
                i2 = 0;
                iW = 0;
                z3 = false;
            } else {
                int iW2 = ygVar.w();
                boolean z6 = (iW2 & 128) != 0;
                boolean z7 = (iW2 & 64) != 0;
                boolean z8 = (iW2 & 32) != 0;
                long jY3 = z7 ? ygVar.y() : -9223372036854775807L;
                if (!z7) {
                    int iW3 = ygVar.w();
                    ArrayList arrayList3 = new ArrayList(iW3);
                    for (int i3 = 0; i3 < iW3; i3++) {
                        arrayList3.add(new b(ygVar.w(), ygVar.y(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long jW = ygVar.w();
                    boolean z9 = (128 & jW) != 0;
                    jY = ((((jW & 1) << 32) | ygVar.y()) * 1000) / 90;
                    z4 = z9;
                } else {
                    z4 = false;
                    jY = -9223372036854775807L;
                }
                int iC = ygVar.C();
                int iW4 = ygVar.w();
                z3 = z7;
                iW = ygVar.w();
                j2 = jY;
                arrayList = arrayList2;
                long j3 = jY3;
                i = iC;
                i2 = iW4;
                j = j3;
                boolean z10 = z6;
                z2 = z4;
                z = z10;
            }
            return new c(jY2, z5, z, z3, arrayList, j, z2, j2, i, i2, iW);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c b(Parcel parcel) {
            return new c(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Parcel parcel) {
            parcel.writeLong(this.f1038a);
            parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
            int size = this.f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                ((b) this.f.get(i)).c(parcel);
            }
            parcel.writeLong(this.e);
            parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
        }

        private c(Parcel parcel) {
            this.f1038a = parcel.readLong();
            this.b = parcel.readByte() == 1;
            this.c = parcel.readByte() == 1;
            this.d = parcel.readByte() == 1;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(b.b(parcel));
            }
            this.f = Collections.unmodifiableList(arrayList);
            this.e = parcel.readLong();
            this.g = parcel.readByte() == 1;
            this.h = parcel.readLong();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f1037a;
        public final long b;

        /* JADX INFO: Access modifiers changed from: private */
        public static b b(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        private b(int i, long j) {
            this.f1037a = i;
            this.b = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Parcel parcel) {
            parcel.writeInt(this.f1037a);
            parcel.writeLong(this.b);
        }

        /* synthetic */ b(int i, long j, a aVar) {
            this(i, j);
        }
    }

    private tk(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(c.b(parcel));
        }
        this.f1036a = Collections.unmodifiableList(arrayList);
    }

    static tk a(yg ygVar) {
        int iW = ygVar.w();
        ArrayList arrayList = new ArrayList(iW);
        for (int i = 0; i < iW; i++) {
            arrayList.add(c.b(ygVar));
        }
        return new tk(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f1036a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((c) this.f1036a.get(i2)).c(parcel);
        }
    }

    /* synthetic */ tk(Parcel parcel, a aVar) {
        this(parcel);
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public tk[] newArray(int i) {
            return new tk[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public tk createFromParcel(Parcel parcel) {
            return new tk(parcel, null);
        }
    }

    private tk(List list) {
        this.f1036a = Collections.unmodifiableList(list);
    }
}
