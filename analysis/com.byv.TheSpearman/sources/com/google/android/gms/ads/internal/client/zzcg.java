package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzazo;
import com.google.android.gms.internal.ads.zzazq;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzcg extends zzazo implements zzci {
    zzcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzb() throws RemoteException {
        zzdc(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzc() throws RemoteException {
        zzdc(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzd(zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, zzeVar);
        zzdc(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zze() throws RemoteException {
        zzdc(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzf() throws RemoteException {
        zzdc(2, zza());
    }
}
