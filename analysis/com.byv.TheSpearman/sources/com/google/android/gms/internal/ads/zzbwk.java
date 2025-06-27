package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbwk extends zzazo implements zzbwm {
    zzbwk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zze(zzbxd zzbxdVar, zzbww zzbwwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, zzbxdVar);
        zzazq.zzf(parcelZza, zzbwwVar);
        zzdc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzf(zzbxd zzbxdVar, zzbww zzbwwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, zzbxdVar);
        zzazq.zzf(parcelZza, zzbwwVar);
        zzdc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzg(zzbxd zzbxdVar, zzbww zzbwwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, zzbxdVar);
        zzazq.zzf(parcelZza, zzbwwVar);
        zzdc(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwm
    public final void zzh(String str, zzbww zzbwwVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzazq.zzf(parcelZza, zzbwwVar);
        zzdc(7, parcelZza);
    }
}
