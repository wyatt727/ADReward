package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzazo;
import com.google.android.gms.internal.ads.zzazq;
import com.google.android.gms.internal.ads.zzbqn;
import com.google.android.gms.internal.ads.zzbqo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes2.dex */
public final class zzcj extends zzazo implements zzcl {
    zzcj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final zzbqo getAdapterCreator() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zza());
        zzbqo zzbqoVarZzf = zzbqn.zzf(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return zzbqoVarZzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final zzen getLiteSdkVersion() throws RemoteException {
        Parcel parcelZzdb = zzdb(1, zza());
        zzen zzenVar = (zzen) zzazq.zza(parcelZzdb, zzen.CREATOR);
        parcelZzdb.recycle();
        return zzenVar;
    }
}
