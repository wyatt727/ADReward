package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbyh extends zzazo implements zzbyj {
    zzbyh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final Bundle zzb() throws RemoteException {
        Parcel parcelZzdb = zzdb(9, zza());
        Bundle bundle = (Bundle) zzazq.zza(parcelZzdb, Bundle.CREATOR);
        parcelZzdb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final com.google.android.gms.ads.internal.client.zzdn zzc() throws RemoteException {
        Parcel parcelZzdb = zzdb(12, zza());
        com.google.android.gms.ads.internal.client.zzdn zzdnVarZzb = com.google.android.gms.ads.internal.client.zzdm.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzdnVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final zzbyg zzd() throws RemoteException {
        zzbyg zzbyeVar;
        Parcel parcelZzdb = zzdb(11, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbyeVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzbyeVar = iInterfaceQueryLocalInterface instanceof zzbyg ? (zzbyg) iInterfaceQueryLocalInterface : new zzbye(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbyeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbyq zzbyqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, zzlVar);
        zzazq.zzf(parcelZza, zzbyqVar);
        zzdc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbyq zzbyqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, zzlVar);
        zzazq.zzf(parcelZza, zzbyqVar);
        zzdc(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzh(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzazq.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzdc(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzi(com.google.android.gms.ads.internal.client.zzdd zzddVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, zzddVar);
        zzdc(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzj(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, zzdgVar);
        zzdc(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzk(zzbym zzbymVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, zzbymVar);
        zzdc(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzl(zzbyx zzbyxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, zzbyxVar);
        zzdc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzdc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final boolean zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbyj
    public final void zzp(zzbyr zzbyrVar) throws RemoteException {
        throw null;
    }
}
