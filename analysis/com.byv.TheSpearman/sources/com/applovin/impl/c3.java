package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.json.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c3 extends ua {
    public static final Parcelable.Creator<c3> CREATOR = new a();
    public final String b;
    public final int c;
    public final int d;
    public final long f;
    public final long g;
    private final ua[] h;

    @Override // com.applovin.impl.ua, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    c3(Parcel parcel) {
        super("CHAP");
        this.b = (String) yp.a((Object) parcel.readString());
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        int i = parcel.readInt();
        this.h = new ua[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.h[i2] = (ua) parcel.readParcelable(ua.class.getClassLoader());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c3.class != obj.getClass()) {
            return false;
        }
        c3 c3Var = (c3) obj;
        return this.c == c3Var.c && this.d == c3Var.d && this.f == c3Var.f && this.g == c3Var.g && yp.a((Object) this.b, (Object) c3Var.b) && Arrays.equals(this.h, c3Var.h);
    }

    public int hashCode() {
        int i = (((((((this.c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.d) * 31) + ((int) this.f)) * 31) + ((int) this.g)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeInt(this.h.length);
        for (ua uaVar : this.h) {
            parcel.writeParcelable(uaVar, 0);
        }
    }

    public c3(String str, int i, int i2, long j, long j2, ua[] uaVarArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.d = i2;
        this.f = j;
        this.g = j2;
        this.h = uaVarArr;
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c3[] newArray(int i) {
            return new c3[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c3 createFromParcel(Parcel parcel) {
            return new c3(parcel);
        }
    }
}
