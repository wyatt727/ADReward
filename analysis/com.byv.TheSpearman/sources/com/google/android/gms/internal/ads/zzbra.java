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
public final class zzbra extends zzazo implements IInterface {
    zzbra(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final Bundle zze() throws RemoteException {
        Parcel parcelZzdb = zzdb(13, zza());
        Bundle bundle = (Bundle) zzazq.zza(parcelZzdb, Bundle.CREATOR);
        parcelZzdb.recycle();
        return bundle;
    }

    public final com.google.android.gms.ads.internal.client.zzdq zzf() throws RemoteException {
        Parcel parcelZzdb = zzdb(16, zza());
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzdqVarZzb;
    }

    public final zzbgx zzg() throws RemoteException {
        Parcel parcelZzdb = zzdb(19, zza());
        zzbgx zzbgxVarZzj = zzbgw.zzj(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbgxVarZzj;
    }

    public final zzbhe zzh() throws RemoteException {
        Parcel parcelZzdb = zzdb(5, zza());
        zzbhe zzbheVarZzg = zzbhd.zzg(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbheVarZzg;
    }

    public final IObjectWrapper zzi() throws RemoteException {
        Parcel parcelZzdb = zzdb(15, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return iObjectWrapperAsInterface;
    }

    public final IObjectWrapper zzj() throws RemoteException {
        Parcel parcelZzdb = zzdb(20, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return iObjectWrapperAsInterface;
    }

    public final IObjectWrapper zzk() throws RemoteException {
        Parcel parcelZzdb = zzdb(21, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return iObjectWrapperAsInterface;
    }

    public final String zzl() throws RemoteException {
        Parcel parcelZzdb = zzdb(7, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    public final String zzm() throws RemoteException {
        Parcel parcelZzdb = zzdb(4, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    public final String zzn() throws RemoteException {
        Parcel parcelZzdb = zzdb(6, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    public final String zzo() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    public final List zzp() throws RemoteException {
        Parcel parcelZzdb = zzdb(3, zza());
        ArrayList arrayListZzb = zzazq.zzb(parcelZzdb);
        parcelZzdb.recycle();
        return arrayListZzb;
    }

    public final void zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzdc(9, parcelZza);
    }

    public final void zzr() throws RemoteException {
        zzdc(8, zza());
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzdc(10, parcelZza);
    }

    public final void zzt(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzf(parcelZza, iObjectWrapper2);
        zzazq.zzf(parcelZza, iObjectWrapper3);
        zzdc(22, parcelZza);
    }

    public final void zzu(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzdc(14, parcelZza);
    }

    public final boolean zzv() throws RemoteException {
        Parcel parcelZzdb = zzdb(12, zza());
        boolean zZzg = zzazq.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    public final boolean zzw() throws RemoteException {
        Parcel parcelZzdb = zzdb(11, zza());
        boolean zZzg = zzazq.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }
}
