package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.applovin.impl.we;
import com.json.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class ra implements we.b {
    public static final Parcelable.Creator<ra> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f857a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean f;
    public final int g;

    @Override // com.applovin.impl.we.b
    public /* synthetic */ void a(qd.b bVar) {
        we.b.CC.$default$a(this, bVar);
    }

    @Override // com.applovin.impl.we.b
    public /* synthetic */ byte[] a() {
        return we.b.CC.$default$a(this);
    }

    @Override // com.applovin.impl.we.b
    public /* synthetic */ d9 b() {
        return we.b.CC.$default$b(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.c + "\", genre=\"" + this.b + "\", bitrate=" + this.f857a + ", metadataInterval=" + this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5 A[PHI: r3
      0x00e5: PHI (r3v1 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:32:0x00af, B:40:0x00d3, B:37:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.applovin.impl.ra a(java.util.Map r14) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ra.a(java.util.Map):com.applovin.impl.ra");
    }

    public ra(int i, String str, String str2, String str3, boolean z, int i2) {
        a1.a(i2 == -1 || i2 > 0);
        this.f857a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f = z;
        this.g = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ra.class != obj.getClass()) {
            return false;
        }
        ra raVar = (ra) obj;
        return this.f857a == raVar.f857a && yp.a((Object) this.b, (Object) raVar.b) && yp.a((Object) this.c, (Object) raVar.c) && yp.a((Object) this.d, (Object) raVar.d) && this.f == raVar.f && this.g == raVar.g;
    }

    public int hashCode() {
        int i = (this.f857a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f ? 1 : 0)) * 31) + this.g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f857a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        yp.a(parcel, this.f);
        parcel.writeInt(this.g);
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ra[] newArray(int i) {
            return new ra[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ra createFromParcel(Parcel parcel) {
            return new ra(parcel);
        }
    }

    ra(Parcel parcel) {
        this.f857a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.f = yp.a(parcel);
        this.g = parcel.readInt();
    }
}
