package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzazr extends zzazo implements zzazt {
    zzazr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzazt
    public final void zze(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString("GMA_SDK");
        zzdc(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzazt
    public final void zzf() throws RemoteException {
        zzdc(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzazt
    public final void zzg(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzdc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzazt
    public final void zzh(int[] iArr) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeIntArray(null);
        zzdc(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzazt
    public final void zzi(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(0);
        zzdc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzazt
    public final void zzj(byte[] bArr) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeByteArray(bArr);
        zzdc(5, parcelZza);
    }
}
