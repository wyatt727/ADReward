package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.json.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d3 extends ua {
    public static final Parcelable.Creator<d3> CREATOR = new a();
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] f;
    private final ua[] g;

    d3(Parcel parcel) {
        super("CTOC");
        this.b = (String) yp.a((Object) parcel.readString());
        this.c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.f = (String[]) yp.a((Object) parcel.createStringArray());
        int i = parcel.readInt();
        this.g = new ua[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.g[i2] = (ua) parcel.readParcelable(ua.class.getClassLoader());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d3.class != obj.getClass()) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return this.c == d3Var.c && this.d == d3Var.d && yp.a((Object) this.b, (Object) d3Var.b) && Arrays.equals(this.f, d3Var.f) && Arrays.equals(this.g, d3Var.g);
    }

    public int hashCode() {
        int i = ((((this.c ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f);
        parcel.writeInt(this.g.length);
        for (ua uaVar : this.g) {
            parcel.writeParcelable(uaVar, 0);
        }
    }

    public d3(String str, boolean z, boolean z2, String[] strArr, ua[] uaVarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.f = strArr;
        this.g = uaVarArr;
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d3[] newArray(int i) {
            return new d3[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d3 createFromParcel(Parcel parcel) {
            return new d3(parcel);
        }
    }
}
