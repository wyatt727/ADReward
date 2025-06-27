package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbqv extends zzazo implements zzbqx {
    zzbqv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final IObjectWrapper zze() throws RemoteException {
        Parcel parcelZzdb = zzdb(1, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzdb.readStrongBinder());
        parcelZzdb.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final boolean zzf() throws RemoteException {
        Parcel parcelZzdb = zzdb(2, zza());
        boolean zZzg = zzazq.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }
}
