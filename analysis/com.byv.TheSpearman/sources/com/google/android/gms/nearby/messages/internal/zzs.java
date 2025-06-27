package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzs extends com.google.android.gms.internal.nearby.zza implements IInterface {
    zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
    }

    public final void zzd(zzby zzbyVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.nearby.zzc.zzc(parcelZza, zzbyVar);
        zzq(1, parcelZza);
    }

    public final void zze(zzcd zzcdVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.nearby.zzc.zzc(parcelZza, zzcdVar);
        zzq(2, parcelZza);
    }

    public final void zzf(SubscribeRequest subscribeRequest) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.nearby.zzc.zzc(parcelZza, subscribeRequest);
        zzq(3, parcelZza);
    }

    public final void zzg(zzcf zzcfVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.nearby.zzc.zzc(parcelZza, zzcfVar);
        zzq(4, parcelZza);
    }

    public final void zzh(zzh zzhVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.nearby.zzc.zzc(parcelZza, zzhVar);
        zzq(7, parcelZza);
    }

    public final void zzi(zzca zzcaVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.nearby.zzc.zzc(parcelZza, zzcaVar);
        zzq(8, parcelZza);
    }

    public final void zzj(zzj zzjVar) throws RemoteException {
        Parcel parcelZza = zza();
        com.google.android.gms.internal.nearby.zzc.zzc(parcelZza, zzjVar);
        zzq(9, parcelZza);
    }
}
