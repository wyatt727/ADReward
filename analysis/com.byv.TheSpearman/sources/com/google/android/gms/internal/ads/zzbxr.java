package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbxr extends zzazo implements IInterface {
    zzbxr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbxq zzbxqVar, String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, zzbxqVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzdc(2, parcelZza);
    }
}
