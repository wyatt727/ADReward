package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbes extends zzazo implements zzbeu {
    zzbes(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbeu
    public final void zze(zzber zzberVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, zzberVar);
        zzdc(1, parcelZza);
    }
}
