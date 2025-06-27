package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.qd;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class we implements Parcelable {
    public static final Parcelable.Creator<we> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final b[] f1129a;

    public interface b extends Parcelable {

        /* renamed from: com.applovin.impl.we$b$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(b _this, qd.b bVar) {
            }

            public static byte[] $default$a(b _this) {
                return null;
            }

            public static d9 $default$b(b _this) {
                return null;
            }
        }

        void a(qd.b bVar);

        byte[] a();

        d9 b();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "entries=" + Arrays.toString(this.f1129a);
    }

    we(Parcel parcel) {
        this.f1129a = new b[parcel.readInt()];
        int i = 0;
        while (true) {
            b[] bVarArr = this.f1129a;
            if (i >= bVarArr.length) {
                return;
            }
            bVarArr[i] = (b) parcel.readParcelable(b.class.getClassLoader());
            i++;
        }
    }

    public int c() {
        return this.f1129a.length;
    }

    public we a(b... bVarArr) {
        return bVarArr.length == 0 ? this : new we((b[]) yp.a((Object[]) this.f1129a, (Object[]) bVarArr));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || we.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f1129a, ((we) obj).f1129a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f1129a);
    }

    public we(List list) {
        this.f1129a = (b[]) list.toArray(new b[0]);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1129a.length);
        for (b bVar : this.f1129a) {
            parcel.writeParcelable(bVar, 0);
        }
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public we[] newArray(int i) {
            return new we[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public we createFromParcel(Parcel parcel) {
            return new we(parcel);
        }
    }

    public we(b... bVarArr) {
        this.f1129a = bVarArr;
    }

    public we a(we weVar) {
        return weVar == null ? this : a(weVar.f1129a);
    }

    public b a(int i) {
        return this.f1129a[i];
    }
}
