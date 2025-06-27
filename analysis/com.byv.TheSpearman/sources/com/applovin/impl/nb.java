package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.json.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class nb extends ua {
    public static final Parcelable.Creator<nb> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;

    @Override // com.applovin.impl.ua
    public String toString() {
        return this.f1060a + ": domain=" + this.b + ", description=" + this.c;
    }

    nb(Parcel parcel) {
        super("----");
        this.b = (String) yp.a((Object) parcel.readString());
        this.c = (String) yp.a((Object) parcel.readString());
        this.d = (String) yp.a((Object) parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nb.class != obj.getClass()) {
            return false;
        }
        nb nbVar = (nb) obj;
        return yp.a((Object) this.c, (Object) nbVar.c) && yp.a((Object) this.b, (Object) nbVar.b) && yp.a((Object) this.d, (Object) nbVar.d);
    }

    public int hashCode() {
        String str = this.b;
        int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public nb(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1060a);
        parcel.writeString(this.b);
        parcel.writeString(this.d);
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public nb[] newArray(int i) {
            return new nb[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public nb createFromParcel(Parcel parcel) {
            return new nb(parcel);
        }
    }
}
