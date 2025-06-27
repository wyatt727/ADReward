package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbqs extends zzazo implements zzbqu {
    zzbqs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zze() throws RemoteException {
        zzdc(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzf() throws RemoteException {
        zzdc(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzg(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzdc(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, zzeVar);
        zzdc(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzi(int i, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeString(str);
        zzdc(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzj(int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, zzeVar);
        zzdc(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzl(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzm() throws RemoteException {
        zzdc(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzn() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzo() throws RemoteException {
        zzdc(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzp() throws RemoteException {
        zzdc(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzq(String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzdc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzr(zzbhy zzbhyVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, zzbhyVar);
        parcelZza.writeString(str);
        zzdc(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzs(zzbyc zzbycVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzt(zzbyg zzbygVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, zzbygVar);
        zzdc(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzu() throws RemoteException {
        zzdc(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzv() throws RemoteException {
        zzdc(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzw() throws RemoteException {
        zzdc(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzx() throws RemoteException {
        zzdc(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqu
    public final void zzy() throws RemoteException {
        zzdc(13, zza());
    }
}
