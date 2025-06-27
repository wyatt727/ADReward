package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.json.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ef extends ua {
    public static final Parcelable.Creator<ef> CREATOR = new a();
    public final int b;
    public final int c;
    public final int d;
    public final int[] f;
    public final int[] g;

    @Override // com.applovin.impl.ua, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ef(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super(MlltFrame.ID);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.f = iArr;
        this.g = iArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ef.class != obj.getClass()) {
            return false;
        }
        ef efVar = (ef) obj;
        return this.b == efVar.b && this.c == efVar.c && this.d == efVar.d && Arrays.equals(this.f, efVar.f) && Arrays.equals(this.g, efVar.g);
    }

    public int hashCode() {
        return ((((((((this.b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.c) * 31) + this.d) * 31) + Arrays.hashCode(this.f)) * 31) + Arrays.hashCode(this.g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeIntArray(this.f);
        parcel.writeIntArray(this.g);
    }

    ef(Parcel parcel) {
        super(MlltFrame.ID);
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.f = (int[]) yp.a(parcel.createIntArray());
        this.g = (int[]) yp.a(parcel.createIntArray());
    }

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ef[] newArray(int i) {
            return new ef[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ef createFromParcel(Parcel parcel) {
            return new ef(parcel);
        }
    }
}
