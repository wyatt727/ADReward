package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbiz extends zzazo implements zzbjb {
    zzbiz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final void zzA() throws RemoteException {
        zzdc(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final void zzB(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, bundle);
        zzdc(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final void zzC() throws RemoteException {
        zzdc(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final void zzD(com.google.android.gms.ads.internal.client.zzcs zzcsVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, zzcsVar);
        zzdc(26, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final void zzE(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, zzdgVar);
        zzdc(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final void zzF(zzbiy zzbiyVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, zzbiyVar);
        zzdc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final boolean zzG() throws RemoteException {
        Parcel parcelZzdb = zzdb(30, zza());
        boolean zZzg = zzazq.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final boolean zzH() throws RemoteException {
        Parcel parcelZzdb = zzdb(24, zza());
        boolean zZzg = zzazq.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final boolean zzI(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, bundle);
        Parcel parcelZzdb = zzdb(16, parcelZza);
        boolean zZzg = zzazq.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final double zze() throws RemoteException {
        Parcel parcelZzdb = zzdb(8, zza());
        double d = parcelZzdb.readDouble();
        parcelZzdb.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final Bundle zzf() throws RemoteException {
        Parcel parcelZzdb = zzdb(20, zza());
        Bundle bundle = (Bundle) zzazq.zza(parcelZzdb, Bundle.CREATOR);
        parcelZzdb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final com.google.android.gms.ads.internal.client.zzdn zzg() throws RemoteException {
        Parcel parcelZzdb = zzdb(31, zza());
        com.google.android.gms.ads.internal.client.zzdn zzdnVarZzb = com.google.android.gms.ads.internal.client.zzdm.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzdnVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        Parcel parcelZzdb = zzdb(11, zza());
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzdqVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final zzbgx zzi() throws RemoteException {
        zzbgx zzbgvVar;
        Parcel parcelZzdb = zzdb(14, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbgvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbgvVar = iInterfaceQueryLocalInterface instanceof zzbgx ? (zzbgx) iInterfaceQueryLocalInterface : new zzbgv(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbgvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final zzbhb zzj() throws RemoteException {
        zzbhb zzbgzVar;
        Parcel parcelZzdb = zzdb(29, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbgzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbgzVar = iInterfaceQueryLocalInterface instanceof zzbhb ? (zzbhb) iInterfaceQueryLocalInterface : new zzbgz(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbgzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final zzbhe zzk() throws RemoteException {
        zzbhe zzbhcVar;
        Parcel parcelZzdb = zzdb(5, zza());
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzbhcVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbhcVar = iInterfaceQueryLocalInterface instanceof zzbhe ? (zzbhe) iInterfaceQueryLocalInterface : new zzbhc(strongBinder);
        }
        parcelZzdb.recycle();
        return zzbhcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final IObjectWrapper zzl() throws RemoteException {
        Parcel parcelZzdb = zzdb(19, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final IObjectWrapper zzm() throws RemoteException {
        Parcel parcelZzdb = zzdb(18, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final String zzn() throws RemoteException {
        Parcel parcelZzdb = zzdb(7, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final String zzo() throws RemoteException {
        Parcel parcelZzdb = zzdb(4, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final String zzp() throws RemoteException {
        Parcel parcelZzdb = zzdb(6, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final String zzq() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final String zzr() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final String zzs() throws RemoteException {
        Parcel parcelZzdb = zzdb(10, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final String zzt() throws RemoteException {
        Parcel parcelZzdb = zzdb(9, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final List zzu() throws RemoteException {
        Parcel parcelZzdb = zzdb(3, zza());
        ArrayList arrayListZzb = zzazq.zzb(parcelZzdb);
        parcelZzdb.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final List zzv() throws RemoteException {
        Parcel parcelZzdb = zzdb(23, zza());
        ArrayList arrayListZzb = zzazq.zzb(parcelZzdb);
        parcelZzdb.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final void zzw() throws RemoteException {
        zzdc(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final void zzx() throws RemoteException {
        zzdc(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final void zzy(com.google.android.gms.ads.internal.client.zzcw zzcwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, zzcwVar);
        zzdc(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjb
    public final void zzz(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, bundle);
        zzdc(15, parcelZza);
    }
}
