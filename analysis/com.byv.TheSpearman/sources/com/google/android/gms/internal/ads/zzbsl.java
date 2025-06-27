package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbsl extends zzazo implements zzbsn {
    zzbsl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final com.google.android.gms.ads.internal.client.zzdq zze() throws RemoteException {
        Parcel parcelZzdb = zzdb(5, zza());
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzdqVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final zzbtc zzf() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zza());
        zzbtc zzbtcVar = (zzbtc) zzazq.zza(parcelZzdb, zzbtc.CREATOR);
        parcelZzdb.recycle();
        return zzbtcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final zzbtc zzg() throws RemoteException {
        Parcel parcelZzdb = zzdb(3, zza());
        zzbtc zzbtcVar = (zzbtc) zzazq.zza(parcelZzdb, zzbtc.CREATOR);
        parcelZzdb.recycle();
        return zzbtcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzq zzqVar, zzbsq zzbsqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzazq.zzd(parcelZza, bundle);
        zzazq.zzd(parcelZza, bundle2);
        zzazq.zzd(parcelZza, zzqVar);
        zzazq.zzf(parcelZza, zzbsqVar);
        zzdc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbry zzbryVar, zzbqu zzbquVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzazq.zzd(parcelZza, zzlVar);
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzf(parcelZza, zzbryVar);
        zzazq.zzf(parcelZza, zzbquVar);
        zzdc(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbsb zzbsbVar, zzbqu zzbquVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzazq.zzd(parcelZza, zzlVar);
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzf(parcelZza, zzbsbVar);
        zzazq.zzf(parcelZza, zzbquVar);
        zzazq.zzd(parcelZza, zzqVar);
        zzdc(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbsb zzbsbVar, zzbqu zzbquVar, com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzazq.zzd(parcelZza, zzlVar);
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzf(parcelZza, zzbsbVar);
        zzazq.zzf(parcelZza, zzbquVar);
        zzazq.zzd(parcelZza, zzqVar);
        zzdc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbse zzbseVar, zzbqu zzbquVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzazq.zzd(parcelZza, zzlVar);
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzf(parcelZza, zzbseVar);
        zzazq.zzf(parcelZza, zzbquVar);
        zzdc(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbsh zzbshVar, zzbqu zzbquVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzazq.zzd(parcelZza, zzlVar);
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzf(parcelZza, zzbshVar);
        zzazq.zzf(parcelZza, zzbquVar);
        zzdc(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbsh zzbshVar, zzbqu zzbquVar, zzbgt zzbgtVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzazq.zzd(parcelZza, zzlVar);
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzf(parcelZza, zzbshVar);
        zzazq.zzf(parcelZza, zzbquVar);
        zzazq.zzd(parcelZza, zzbgtVar);
        zzdc(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbsk zzbskVar, zzbqu zzbquVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzazq.zzd(parcelZza, zzlVar);
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzf(parcelZza, zzbskVar);
        zzazq.zzf(parcelZza, zzbquVar);
        zzdc(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzl zzlVar, IObjectWrapper iObjectWrapper, zzbsk zzbskVar, zzbqu zzbquVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzazq.zzd(parcelZza, zzlVar);
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzf(parcelZza, zzbskVar);
        zzazq.zzf(parcelZza, zzbquVar);
        zzdc(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final void zzq(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdc(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzdb = zzdb(24, parcelZza);
        boolean zZzg = zzazq.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzdb = zzdb(15, parcelZza);
        boolean zZzg = zzazq.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbsn
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzdb = zzdb(17, parcelZza);
        boolean zZzg = zzazq.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }
}
