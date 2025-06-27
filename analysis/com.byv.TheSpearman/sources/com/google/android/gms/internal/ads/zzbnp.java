package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbnp extends zzazo implements zzbnr {
    zzbnp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbnr
    public final void zze(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzdc(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnr
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, zzeVar);
        zzdc(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbnr
    public final void zzg(zzbnl zzbnlVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, zzbnlVar);
        zzdc(1, parcelZza);
    }
}
