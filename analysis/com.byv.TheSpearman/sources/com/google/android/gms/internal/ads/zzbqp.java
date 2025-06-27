package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbqp extends zzazo implements zzbqr {
    zzbqp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbqu zzbquVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        zzazq.zzf(parcelZza, zzbquVar);
        zzdc(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzB(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbqu zzbquVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        zzazq.zzf(parcelZza, zzbquVar);
        zzdc(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzdc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzE() throws RemoteException {
        zzdc(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzF() throws RemoteException {
        zzdc(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzG(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzazq.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzdc(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzdc(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzI() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzdc(37, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzdc(30, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzL() throws RemoteException {
        zzdc(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final boolean zzM() throws RemoteException {
        Parcel parcelZzdb = zzdb(22, zza());
        boolean zZzg = zzazq.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final boolean zzN() throws RemoteException {
        Parcel parcelZzdb = zzdb(13, zza());
        boolean zZzg = zzazq.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final zzbqz zzO() throws RemoteException {
        zzbqz zzbqzVar;
        Parcel parcelZzdb = zzdb(15, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbqzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbqzVar = iInterfaceQueryLocalInterface instanceof zzbqz ? (zzbqz) iInterfaceQueryLocalInterface : new zzbqz(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbqzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final zzbra zzP() throws RemoteException {
        zzbra zzbraVar;
        Parcel parcelZzdb = zzdb(16, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbraVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbraVar = iInterfaceQueryLocalInterface instanceof zzbra ? (zzbra) iInterfaceQueryLocalInterface : new zzbra(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbraVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final Bundle zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel parcelZzdb = zzdb(26, zza());
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzdqVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final zzbhy zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final zzbqx zzj() throws RemoteException {
        zzbqx zzbqvVar;
        Parcel parcelZzdb = zzdb(36, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbqvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbqvVar = iInterfaceQueryLocalInterface instanceof zzbqx ? (zzbqx) iInterfaceQueryLocalInterface : new zzbqv(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbqvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final zzbrd zzk() throws RemoteException {
        zzbrd zzbrbVar;
        Parcel parcelZzdb = zzdb(27, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbrbVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbrbVar = iInterfaceQueryLocalInterface instanceof zzbrd ? (zzbrd) iInterfaceQueryLocalInterface : new zzbrb(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbrbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final zzbtc zzl() throws RemoteException {
        Parcel parcelZzdb = zzdb(33, zza());
        zzbtc zzbtcVar = (zzbtc) zzazq.zza(parcelZzdb, zzbtc.CREATOR);
        parcelZzdb.recycle();
        return zzbtcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final zzbtc zzm() throws RemoteException {
        Parcel parcelZzdb = zzdb(34, zza());
        zzbtc zzbtcVar = (zzbtc) zzazq.zza(parcelZzdb, zzbtc.CREATOR);
        parcelZzdb.recycle();
        return zzbtcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final IObjectWrapper zzn() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzo() throws RemoteException {
        zzdc(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbyb zzbybVar, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzd(parcelZza, zzlVar);
        parcelZza.writeString(null);
        zzazq.zzf(parcelZza, zzbybVar);
        parcelZza.writeString(str2);
        zzdc(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzq(IObjectWrapper iObjectWrapper, zzbna zzbnaVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzf(parcelZza, zzbnaVar);
        parcelZza.writeTypedList(list);
        zzdc(31, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzr(IObjectWrapper iObjectWrapper, zzbyb zzbybVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzf(parcelZza, zzbybVar);
        parcelZza.writeStringList(list);
        zzdc(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzs(com.google.android.gms.ads.internal.client.zzl zzlVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        zzdc(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbqu zzbquVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        zzazq.zzf(parcelZza, zzbquVar);
        zzdc(38, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbqu zzbquVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbqu zzbquVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzd(parcelZza, zzqVar);
        zzazq.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzazq.zzf(parcelZza, zzbquVar);
        zzdc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbqu zzbquVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzd(parcelZza, zzqVar);
        zzazq.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzazq.zzf(parcelZza, zzbquVar);
        zzdc(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzbqu zzbquVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbqu zzbquVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzazq.zzf(parcelZza, zzbquVar);
        zzdc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzl zzlVar, String str, String str2, zzbqu zzbquVar, zzbgt zzbgtVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzd(parcelZza, zzlVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzazq.zzf(parcelZza, zzbquVar);
        zzazq.zzd(parcelZza, zzbgtVar);
        parcelZza.writeStringList(list);
        zzdc(14, parcelZza);
    }
}
