package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.json.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class vp extends ua {
    public static final Parcelable.Creator<vp> CREATOR = new a();
    public final String b;
    public final String c;

    @Override // com.applovin.impl.ua
    public String toString() {
        return this.f1060a + ": url=" + this.c;
    }

    vp(Parcel parcel) {
        super((String) yp.a((Object) parcel.readString()));
        this.b = parcel.readString();
        this.c = (String) yp.a((Object) parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vp.class != obj.getClass()) {
            return false;
        }
        vp vpVar = (vp) obj;
        return this.f1060a.equals(vpVar.f1060a) && yp.a((Object) this.b, (Object) vpVar.b) && yp.a((Object) this.c, (Object) vpVar.c);
    }

    public int hashCode() {
        int iHashCode = (this.f1060a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public vp(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1060a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public vp[] newArray(int i) {
            return new vp[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public vp createFromParcel(Parcel parcel) {
            return new vp(parcel);
        }
    }
}
