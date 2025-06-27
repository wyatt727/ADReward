package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.json.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y9 extends ua {
    public static final Parcelable.Creator<y9> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final byte[] f;

    @Override // com.applovin.impl.ua
    public String toString() {
        return this.f1060a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.d;
    }

    y9(Parcel parcel) {
        super("GEOB");
        this.b = (String) yp.a((Object) parcel.readString());
        this.c = (String) yp.a((Object) parcel.readString());
        this.d = (String) yp.a((Object) parcel.readString());
        this.f = (byte[]) yp.a((Object) parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y9.class != obj.getClass()) {
            return false;
        }
        y9 y9Var = (y9) obj;
        return yp.a((Object) this.b, (Object) y9Var.b) && yp.a((Object) this.c, (Object) y9Var.c) && yp.a((Object) this.d, (Object) y9Var.d) && Arrays.equals(this.f, y9Var.f);
    }

    public int hashCode() {
        String str = this.b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f);
    }

    public y9(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.f);
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y9[] newArray(int i) {
            return new y9[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y9 createFromParcel(Parcel parcel) {
            return new y9(parcel);
        }
    }
}
