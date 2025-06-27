package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.json.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class s3 extends ua {
    public static final Parcelable.Creator<s3> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;

    @Override // com.applovin.impl.ua
    public String toString() {
        return this.f1060a + ": language=" + this.b + ", description=" + this.c;
    }

    s3(Parcel parcel) {
        super("COMM");
        this.b = (String) yp.a((Object) parcel.readString());
        this.c = (String) yp.a((Object) parcel.readString());
        this.d = (String) yp.a((Object) parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s3.class != obj.getClass()) {
            return false;
        }
        s3 s3Var = (s3) obj;
        return yp.a((Object) this.c, (Object) s3Var.c) && yp.a((Object) this.b, (Object) s3Var.b) && yp.a((Object) this.d, (Object) s3Var.d);
    }

    public int hashCode() {
        String str = this.b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1060a);
        parcel.writeString(this.b);
        parcel.writeString(this.d);
    }

    public s3(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s3[] newArray(int i) {
            return new s3[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s3 createFromParcel(Parcel parcel) {
            return new s3(parcel);
        }
    }
}
