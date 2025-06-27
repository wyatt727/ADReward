package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzazo;
import com.google.android.gms.internal.ads.zzazq;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzbf extends zzazo implements zzbh {
    zzbf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc() throws RemoteException {
        zzdc(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() throws RemoteException {
        zzdc(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzdc(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf(zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, zzeVar);
        zzdc(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() throws RemoteException {
        zzdc(7, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() throws RemoteException {
        zzdc(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() throws RemoteException {
        zzdc(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzk() throws RemoteException {
        zzdc(9, zza());
    }
}
