package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbrb extends zzazo implements zzbrd {
    zzbrb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final boolean zzA() throws RemoteException {
        Parcel parcelZzdb = zzdb(18, zza());
        boolean zZzg = zzazq.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final boolean zzB() throws RemoteException {
        Parcel parcelZzdb = zzdb(17, zza());
        boolean zZzg = zzazq.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final double zze() throws RemoteException {
        Parcel parcelZzdb = zzdb(8, zza());
        double d = parcelZzdb.readDouble();
        parcelZzdb.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final float zzf() throws RemoteException {
        Parcel parcelZzdb = zzdb(23, zza());
        float f = parcelZzdb.readFloat();
        parcelZzdb.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final float zzg() throws RemoteException {
        Parcel parcelZzdb = zzdb(25, zza());
        float f = parcelZzdb.readFloat();
        parcelZzdb.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final float zzh() throws RemoteException {
        Parcel parcelZzdb = zzdb(24, zza());
        float f = parcelZzdb.readFloat();
        parcelZzdb.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final Bundle zzi() throws RemoteException {
        Parcel parcelZzdb = zzdb(16, zza());
        Bundle bundle = (Bundle) zzazq.zza(parcelZzdb, Bundle.CREATOR);
        parcelZzdb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final com.google.android.gms.ads.internal.client.zzdq zzj() throws RemoteException {
        Parcel parcelZzdb = zzdb(11, zza());
        com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzdqVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final zzbgx zzk() throws RemoteException {
        Parcel parcelZzdb = zzdb(12, zza());
        zzbgx zzbgxVarZzj = zzbgw.zzj(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbgxVarZzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final zzbhe zzl() throws RemoteException {
        Parcel parcelZzdb = zzdb(5, zza());
        zzbhe zzbheVarZzg = zzbhd.zzg(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbheVarZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final IObjectWrapper zzm() throws RemoteException {
        Parcel parcelZzdb = zzdb(13, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final IObjectWrapper zzn() throws RemoteException {
        Parcel parcelZzdb = zzdb(14, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final IObjectWrapper zzo() throws RemoteException {
        Parcel parcelZzdb = zzdb(15, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final String zzp() throws RemoteException {
        Parcel parcelZzdb = zzdb(7, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final String zzq() throws RemoteException {
        Parcel parcelZzdb = zzdb(4, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final String zzr() throws RemoteException {
        Parcel parcelZzdb = zzdb(6, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final String zzs() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final String zzt() throws RemoteException {
        Parcel parcelZzdb = zzdb(10, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final String zzu() throws RemoteException {
        Parcel parcelZzdb = zzdb(9, zza());
        String string = parcelZzdb.readString();
        parcelZzdb.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final List zzv() throws RemoteException {
        Parcel parcelZzdb = zzdb(3, zza());
        ArrayList arrayListZzb = zzazq.zzb(parcelZzdb);
        parcelZzdb.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzdc(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzx() throws RemoteException {
        zzdc(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzf(parcelZza, iObjectWrapper2);
        zzazq.zzf(parcelZza, iObjectWrapper3);
        zzdc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzz(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzdc(22, parcelZza);
    }
}
