package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbcl extends zzazo implements IInterface {
    zzbcl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzbcj zzbcjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, zzbcjVar);
        Parcel parcelZzdb = zzdb(3, parcelZza);
        long j = parcelZzdb.readLong();
        parcelZzdb.recycle();
        return j;
    }

    public final zzbcg zzf(zzbcj zzbcjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, zzbcjVar);
        Parcel parcelZzdb = zzdb(1, parcelZza);
        zzbcg zzbcgVar = (zzbcg) zzazq.zza(parcelZzdb, zzbcg.CREATOR);
        parcelZzdb.recycle();
        return zzbcgVar;
    }

    public final zzbcg zzg(zzbcj zzbcjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, zzbcjVar);
        Parcel parcelZzdb = zzdb(2, parcelZza);
        zzbcg zzbcgVar = (zzbcg) zzazq.zza(parcelZzdb, zzbcg.CREATOR);
        parcelZzdb.recycle();
        return zzbcgVar;
    }
}
