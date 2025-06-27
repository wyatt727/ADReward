package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.json.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class sh extends ua {
    public static final Parcelable.Creator<sh> CREATOR = new a();
    public final String b;
    public final byte[] c;

    @Override // com.applovin.impl.ua
    public String toString() {
        return this.f1060a + ": owner=" + this.b;
    }

    sh(Parcel parcel) {
        super("PRIV");
        this.b = (String) yp.a((Object) parcel.readString());
        this.c = (byte[]) yp.a((Object) parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sh.class != obj.getClass()) {
            return false;
        }
        sh shVar = (sh) obj;
        return yp.a((Object) this.b, (Object) shVar.b) && Arrays.equals(this.c, shVar.c);
    }

    public int hashCode() {
        String str = this.b;
        return (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }

    public sh(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public sh[] newArray(int i) {
            return new sh[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public sh createFromParcel(Parcel parcel) {
            return new sh(parcel);
        }
    }
}
