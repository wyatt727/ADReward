package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.json.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class u0 extends ua {
    public static final Parcelable.Creator<u0> CREATOR = new a();
    public final String b;
    public final String c;
    public final int d;
    public final byte[] f;

    @Override // com.applovin.impl.ua
    public String toString() {
        return this.f1060a + ": mimeType=" + this.b + ", description=" + this.c;
    }

    u0(Parcel parcel) {
        super("APIC");
        this.b = (String) yp.a((Object) parcel.readString());
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.f = (byte[]) yp.a((Object) parcel.createByteArray());
    }

    @Override // com.applovin.impl.ua, com.applovin.impl.we.b
    public void a(qd.b bVar) {
        bVar.a(this.f, this.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u0.class != obj.getClass()) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.d == u0Var.d && yp.a((Object) this.b, (Object) u0Var.b) && yp.a((Object) this.c, (Object) u0Var.c) && Arrays.equals(this.f, u0Var.f);
    }

    public int hashCode() {
        int i = (this.d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f);
    }

    public u0(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.f = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeByteArray(this.f);
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u0[] newArray(int i) {
            return new u0[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u0 createFromParcel(Parcel parcel) {
            return new u0(parcel);
        }
    }
}
