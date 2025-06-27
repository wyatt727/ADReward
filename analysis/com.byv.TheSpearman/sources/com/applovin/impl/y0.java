package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import com.applovin.impl.we;

/* loaded from: classes.dex */
public final class y0 implements we.b {
    public static final Parcelable.Creator<y0> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f1186a;
    public final String b;

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
        return "Ait(controlCode=" + this.f1186a + ",url=" + this.b + ")";
    }

    public y0(int i, String str) {
        this.f1186a = i;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.f1186a);
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y0 createFromParcel(Parcel parcel) {
            return new y0(parcel.readInt(), (String) a1.a((Object) parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y0[] newArray(int i) {
            return new y0[i];
        }
    }
}
