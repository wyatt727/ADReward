package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbxz extends zzazo implements zzbyb {
    zzbxz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzdc(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzdc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeInt(i);
        zzdc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzdc(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzdc(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzk(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzdc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzm(IObjectWrapper iObjectWrapper, zzbyc zzbycVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzd(parcelZza, zzbycVar);
        zzdc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzdc(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyb
    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzdc(5, parcelZza);
    }
}
