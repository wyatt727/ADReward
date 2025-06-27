package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcan extends zzazo implements zzcap {
    zzcan(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzf(parcelZza, iObjectWrapper2);
        parcelZza.writeString(str);
        zzazq.zzf(parcelZza, iObjectWrapper3);
        Parcel parcelZzdb = zzdb(11, parcelZza);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzf(IObjectWrapper iObjectWrapper, zzcat zzcatVar, zzcam zzcamVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzd(parcelZza, zzcatVar);
        zzazq.zzf(parcelZza, zzcamVar);
        zzdc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzg(zzbvn zzbvnVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, zzbvnVar);
        zzdc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbve zzbveVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzf(parcelZza, zzbveVar);
        zzdc(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbve zzbveVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzf(parcelZza, zzbveVar);
        zzdc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzdc(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzdc(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbve zzbveVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzf(parcelZza, zzbveVar);
        zzdc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcap
    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbve zzbveVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzf(parcelZza, zzbveVar);
        zzdc(5, parcelZza);
    }
}
