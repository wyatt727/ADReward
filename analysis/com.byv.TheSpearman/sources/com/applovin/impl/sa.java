package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.applovin.impl.we;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class sa implements we.b {
    public static final Parcelable.Creator<sa> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f887a;
    public final String b;
    public final String c;

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

    sa(Parcel parcel) {
        this.f887a = (byte[]) a1.a(parcel.createByteArray());
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    @Override // com.applovin.impl.we.b
    public void a(qd.b bVar) {
        String str = this.b;
        if (str != null) {
            bVar.k(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sa.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f887a, ((sa) obj).f887a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f887a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.b, this.c, Integer.valueOf(this.f887a.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f887a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public sa(byte[] bArr, String str, String str2) {
        this.f887a = bArr;
        this.b = str;
        this.c = str2;
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public sa[] newArray(int i) {
            return new sa[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public sa createFromParcel(Parcel parcel) {
            return new sa(parcel);
        }
    }
}
