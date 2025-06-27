package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfrf extends zzazo implements IInterface {
    zzfrf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfrd zze(zzfrb zzfrbVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, zzfrbVar);
        Parcel parcelZzdb = zzdb(1, parcelZza);
        zzfrd zzfrdVar = (zzfrd) zzazq.zza(parcelZzdb, zzfrd.CREATOR);
        parcelZzdb.recycle();
        return zzfrdVar;
    }

    public final zzfrm zzf(zzfrk zzfrkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, zzfrkVar);
        Parcel parcelZzdb = zzdb(3, parcelZza);
        zzfrm zzfrmVar = (zzfrm) zzazq.zza(parcelZzdb, zzfrm.CREATOR);
        parcelZzdb.recycle();
        return zzfrmVar;
    }

    public final void zzg(zzfqy zzfqyVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, zzfqyVar);
        zzdc(2, parcelZza);
    }
}
