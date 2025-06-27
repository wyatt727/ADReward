package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class w6 implements Comparator, Parcelable {
    public static final Parcelable.Creator<w6> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final b[] f1122a;
    private int b;
    public final String c;
    public final int d;

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private int f1123a;
        public final UUID b;
        public final String c;
        public final String d;
        public final byte[] f;

        public boolean a(UUID uuid) {
            return r2.f853a.equals(this.b) || uuid.equals(this.b);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public b a(byte[] bArr) {
            return new b(this.b, this.c, this.d, bArr);
        }

        b(Parcel parcel) {
            this.b = new UUID(parcel.readLong(), parcel.readLong());
            this.c = parcel.readString();
            this.d = (String) yp.a((Object) parcel.readString());
            this.f = parcel.createByteArray();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return yp.a((Object) this.c, (Object) bVar.c) && yp.a((Object) this.d, (Object) bVar.d) && yp.a(this.b, bVar.b) && Arrays.equals(this.f, bVar.f);
        }

        public int hashCode() {
            if (this.f1123a == 0) {
                int iHashCode = this.b.hashCode() * 31;
                String str = this.c;
                this.f1123a = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode()) * 31) + Arrays.hashCode(this.f);
            }
            return this.f1123a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.b.getMostSignificantBits());
            parcel.writeLong(this.b.getLeastSignificantBits());
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeByteArray(this.f);
        }

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i) {
                return new b[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.b = (UUID) a1.a(uuid);
            this.c = str;
            this.d = (String) a1.a((Object) str2);
            this.f = bArr;
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    w6(Parcel parcel) {
        this.c = parcel.readString();
        b[] bVarArr = (b[]) yp.a(parcel.createTypedArray(b.CREATOR));
        this.f1122a = bVarArr;
        this.d = bVarArr.length;
    }

    public w6 a(String str) {
        return yp.a((Object) this.c, (Object) str) ? this : new w6(str, false, this.f1122a);
    }

    public int hashCode() {
        if (this.b == 0) {
            String str = this.c;
            this.b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f1122a);
        }
        return this.b;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w6.class != obj.getClass()) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return yp.a((Object) this.c, (Object) w6Var.c) && Arrays.equals(this.f1122a, w6Var.f1122a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.f1122a, 0);
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public w6[] newArray(int i) {
            return new w6[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public w6 createFromParcel(Parcel parcel) {
            return new w6(parcel);
        }
    }

    private w6(String str, boolean z, b... bVarArr) {
        this.c = str;
        bVarArr = z ? (b[]) bVarArr.clone() : bVarArr;
        this.f1122a = bVarArr;
        this.d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public b a(int i) {
        return this.f1122a[i];
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        UUID uuid = r2.f853a;
        if (uuid.equals(bVar.b)) {
            return uuid.equals(bVar2.b) ? 0 : 1;
        }
        return bVar.b.compareTo(bVar2.b);
    }

    public w6(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public w6(List list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    public w6(b... bVarArr) {
        this(null, bVarArr);
    }
}
