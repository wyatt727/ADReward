package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.applovin.impl.we;
import com.json.mediationsdk.logger.IronSourceError;
import com.json.t2;

/* loaded from: classes.dex */
public final class er implements we.b {
    public static final Parcelable.Creator<er> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f399a;
    public final String b;

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
        return "VC: " + this.f399a + t2.i.b + this.b;
    }

    er(Parcel parcel) {
        this.f399a = (String) yp.a((Object) parcel.readString());
        this.b = (String) yp.a((Object) parcel.readString());
    }

    @Override // com.applovin.impl.we.b
    public void a(qd.b bVar) {
        String str = this.f399a;
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "ALBUM":
                bVar.b(this.b);
                break;
            case "TITLE":
                bVar.k(this.b);
                break;
            case "DESCRIPTION":
                bVar.g(this.b);
                break;
            case "ALBUMARTIST":
                bVar.a(this.b);
                break;
            case "ARTIST":
                bVar.c(this.b);
                break;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || er.class != obj.getClass()) {
            return false;
        }
        er erVar = (er) obj;
        return this.f399a.equals(erVar.f399a) && this.b.equals(erVar.b);
    }

    public er(String str, String str2) {
        this.f399a = str;
        this.b = str2;
    }

    public int hashCode() {
        return ((this.f399a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f399a);
        parcel.writeString(this.b);
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public er[] newArray(int i) {
            return new er[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public er createFromParcel(Parcel parcel) {
            return new er(parcel);
        }
    }
}
