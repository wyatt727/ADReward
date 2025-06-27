package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.d9;
import com.applovin.impl.qd;
import com.applovin.impl.we;
import com.json.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class u7 implements we.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f1058a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] f;
    private int g;
    private static final d9 h = new d9.b().f("application/id3").a();
    private static final d9 i = new d9.b().f("application/x-scte35").a();
    public static final Parcelable.Creator<u7> CREATOR = new a();

    @Override // com.applovin.impl.we.b
    public /* synthetic */ void a(qd.b bVar) {
        we.b.CC.$default$a(this, bVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f1058a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }

    u7(Parcel parcel) {
        this.f1058a = (String) yp.a((Object) parcel.readString());
        this.b = (String) yp.a((Object) parcel.readString());
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.f = (byte[]) yp.a((Object) parcel.createByteArray());
    }

    @Override // com.applovin.impl.we.b
    public d9 b() {
        String str = this.f1058a;
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return i;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return h;
            default:
                return null;
        }
    }

    @Override // com.applovin.impl.we.b
    public byte[] a() {
        if (b() != null) {
            return this.f;
        }
        return null;
    }

    public int hashCode() {
        if (this.g == 0) {
            String str = this.f1058a;
            int iHashCode = ((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.c;
            int i2 = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            this.g = ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.f);
        }
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u7.class != obj.getClass()) {
            return false;
        }
        u7 u7Var = (u7) obj;
        return this.c == u7Var.c && this.d == u7Var.d && yp.a((Object) this.f1058a, (Object) u7Var.f1058a) && yp.a((Object) this.b, (Object) u7Var.b) && Arrays.equals(this.f, u7Var.f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1058a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeByteArray(this.f);
    }

    public u7(String str, String str2, long j, long j2, byte[] bArr) {
        this.f1058a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.f = bArr;
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u7[] newArray(int i) {
            return new u7[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u7 createFromParcel(Parcel parcel) {
            return new u7(parcel);
        }
    }
}
