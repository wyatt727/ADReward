package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzftx extends zzazo implements zzftz {
    zzftx(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzftz
    public final void zze(Bundle bundle, zzfub zzfubVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, bundle);
        zzazq.zzf(parcelZza, zzfubVar);
        zzdd(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzftz
    public final void zzf(String str, Bundle bundle, zzfub zzfubVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzazq.zzd(parcelZza, bundle);
        zzazq.zzf(parcelZza, zzfubVar);
        zzdd(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzftz
    public final void zzg(Bundle bundle, zzfub zzfubVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, bundle);
        zzazq.zzf(parcelZza, zzfubVar);
        zzdd(3, parcelZza);
    }
}
