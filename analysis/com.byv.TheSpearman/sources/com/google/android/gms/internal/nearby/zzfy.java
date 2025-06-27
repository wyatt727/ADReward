package com.google.android.gms.internal.nearby;

import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzfy extends zzga {
    zzfy() {
    }

    @Override // com.google.android.gms.internal.nearby.zzga, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzfz createFromParcel(Parcel parcel) {
        return createFromParcel(parcel);
    }

    @Override // com.google.android.gms.internal.nearby.zzga
    /* renamed from: zza */
    public final zzfz createFromParcel(Parcel parcel) {
        zzfz zzfzVarCreateFromParcel = super.createFromParcel(parcel);
        if (zzfzVarCreateFromParcel.zzb != null) {
            zzfzVarCreateFromParcel.zza = zzfz.zzb(zzfzVarCreateFromParcel.zzb);
        }
        return zzfzVarCreateFromParcel;
    }
}
