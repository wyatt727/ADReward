package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbid extends zzazo implements zzbif {
    zzbid(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final void zze(zzbhv zzbhvVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, zzbhvVar);
        zzdc(1, parcelZza);
    }
}
