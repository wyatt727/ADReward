package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.json.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g2 extends ua {
    public static final Parcelable.Creator<g2> CREATOR = new a();
    public final byte[] b;

    g2(Parcel parcel) {
        super((String) yp.a((Object) parcel.readString()));
        this.b = (byte[]) yp.a((Object) parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g2.class != obj.getClass()) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return this.f1060a.equals(g2Var.f1060a) && Arrays.equals(this.b, g2Var.b);
    }

    public int hashCode() {
        return ((this.f1060a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1060a);
        parcel.writeByteArray(this.b);
    }

    public g2(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g2[] newArray(int i) {
            return new g2[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g2 createFromParcel(Parcel parcel) {
            return new g2(parcel);
        }
    }
}
