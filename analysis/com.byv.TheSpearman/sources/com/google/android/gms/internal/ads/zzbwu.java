package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbwu extends zzazo implements zzbww {
    zzbwu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, zzbbVar);
        zzdc(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, parcelFileDescriptor);
        zzdc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbxd zzbxdVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzd(parcelZza, parcelFileDescriptor);
        zzazq.zzd(parcelZza, zzbxdVar);
        zzdc(3, parcelZza);
    }
}
