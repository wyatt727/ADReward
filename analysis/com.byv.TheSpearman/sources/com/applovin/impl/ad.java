package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.applovin.impl.we;
import com.json.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ad implements we.b {
    public static final Parcelable.Creator<ad> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f238a;
    public final byte[] b;
    public final int c;
    public final int d;

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
        return "mdta: key=" + this.f238a;
    }

    private ad(Parcel parcel) {
        this.f238a = (String) yp.a((Object) parcel.readString());
        this.b = (byte[]) yp.a((Object) parcel.createByteArray());
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ad.class != obj.getClass()) {
            return false;
        }
        ad adVar = (ad) obj;
        return this.f238a.equals(adVar.f238a) && Arrays.equals(this.b, adVar.b) && this.c == adVar.c && this.d == adVar.d;
    }

    public int hashCode() {
        return ((((((this.f238a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }

    /* synthetic */ ad(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f238a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ad[] newArray(int i) {
            return new ad[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ad createFromParcel(Parcel parcel) {
            return new ad(parcel, null);
        }
    }

    public ad(String str, byte[] bArr, int i, int i2) {
        this.f238a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }
}
