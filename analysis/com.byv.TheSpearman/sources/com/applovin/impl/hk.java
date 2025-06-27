package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.applovin.impl.we;
import com.json.mediationsdk.logger.IronSourceError;

/* loaded from: classes.dex */
public final class hk implements we.b {
    public static final Parcelable.Creator<hk> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final float f503a;
    public final int b;

    @Override // com.applovin.impl.we.b
    public /* synthetic */ void a(qd.b bVar) {
        we.b.CC.$default$a(this, bVar);
    }

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
        return "smta: captureFrameRate=" + this.f503a + ", svcTemporalLayerCount=" + this.b;
    }

    public hk(float f, int i) {
        this.f503a = f;
        this.b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hk.class != obj.getClass()) {
            return false;
        }
        hk hkVar = (hk) obj;
        return this.f503a == hkVar.f503a && this.b == hkVar.b;
    }

    public int hashCode() {
        return ((b9.a(this.f503a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f503a);
        parcel.writeInt(this.b);
    }

    private hk(Parcel parcel) {
        this.f503a = parcel.readFloat();
        this.b = parcel.readInt();
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public hk[] newArray(int i) {
            return new hk[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public hk createFromParcel(Parcel parcel) {
            return new hk(parcel, (a) null);
        }
    }

    /* synthetic */ hk(Parcel parcel, a aVar) {
        this(parcel);
    }
}
