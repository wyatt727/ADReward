package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.applovin.impl.we;
import com.json.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.impl.if, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cif implements we.b {
    public static final Parcelable.Creator<Cif> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final long f534a;
    public final long b;
    public final long c;
    public final long d;
    public final long f;

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
        return "Motion photo metadata: photoStartPosition=" + this.f534a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f;
    }

    public Cif(long j, long j2, long j3, long j4, long j5) {
        this.f534a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.f = j5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Cif.class != obj.getClass()) {
            return false;
        }
        Cif cif = (Cif) obj;
        return this.f534a == cif.f534a && this.b == cif.b && this.c == cif.c && this.d == cif.d && this.f == cif.f;
    }

    public int hashCode() {
        return ((((((((nc.a(this.f534a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + nc.a(this.b)) * 31) + nc.a(this.c)) * 31) + nc.a(this.d)) * 31) + nc.a(this.f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f534a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.f);
    }

    private Cif(Parcel parcel) {
        this.f534a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.f = parcel.readLong();
    }

    /* renamed from: com.applovin.impl.if$a */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cif[] newArray(int i) {
            return new Cif[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cif createFromParcel(Parcel parcel) {
            return new Cif(parcel, null);
        }
    }

    /* synthetic */ Cif(Parcel parcel, a aVar) {
        this(parcel);
    }
}
