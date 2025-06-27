package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.applovin.impl.we;
import com.json.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ih implements we.b {
    public static final Parcelable.Creator<ih> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f536a;
    public final String b;
    public final String c;
    public final int d;
    public final int f;
    public final int g;
    public final int h;
    public final byte[] i;

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
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }

    public ih(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f536a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = bArr;
    }

    @Override // com.applovin.impl.we.b
    public void a(qd.b bVar) {
        bVar.a(this.i, this.f536a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ih.class != obj.getClass()) {
            return false;
        }
        ih ihVar = (ih) obj;
        return this.f536a == ihVar.f536a && this.b.equals(ihVar.b) && this.c.equals(ihVar.c) && this.d == ihVar.d && this.f == ihVar.f && this.g == ihVar.g && this.h == ihVar.h && Arrays.equals(this.i, ihVar.i);
    }

    public int hashCode() {
        return ((((((((((((((this.f536a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + Arrays.hashCode(this.i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f536a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeByteArray(this.i);
    }

    ih(Parcel parcel) {
        this.f536a = parcel.readInt();
        this.b = (String) yp.a((Object) parcel.readString());
        this.c = (String) yp.a((Object) parcel.readString());
        this.d = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = (byte[]) yp.a((Object) parcel.createByteArray());
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ih[] newArray(int i) {
            return new ih[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ih createFromParcel(Parcel parcel) {
            return new ih(parcel);
        }
    }
}
