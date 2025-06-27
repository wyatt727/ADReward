package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzahk implements Parcelable.Creator {
    zzahk() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String string = parcel.readString();
        Objects.requireNonNull(string);
        String string2 = parcel.readString();
        String[] strArrCreateStringArray = parcel.createStringArray();
        Objects.requireNonNull(strArrCreateStringArray);
        return new zzahl(string, string2, zzfzn.zzl(strArrCreateStringArray));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzahl[i];
    }
}
