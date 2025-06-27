package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbwo extends zzazo implements zzbwq {
    zzbwo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void zze(zzbwi zzbwiVar, zzbwt zzbwtVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, zzbwiVar);
        zzazq.zzf(parcelZza, zzbwtVar);
        zzdc(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwq
    public final void zzf(zzbwe zzbweVar, zzbwt zzbwtVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, zzbweVar);
        zzazq.zzf(parcelZza, zzbwtVar);
        zzdc(1, parcelZza);
    }
}
