package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbmb extends zzazo implements zzbmd {
    zzbmb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbmd
    public final zzbma zze(IObjectWrapper iObjectWrapper, zzbqo zzbqoVar, int i, zzblx zzblxVar) throws RemoteException {
        zzbma zzblyVar;
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzf(parcelZza, zzbqoVar);
        parcelZza.writeInt(241199000);
        zzazq.zzf(parcelZza, zzblxVar);
        Parcel parcelZzdb = zzdb(1, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzblyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzblyVar = iInterfaceQueryLocalInterface instanceof zzbma ? (zzbma) iInterfaceQueryLocalInterface : new zzbly(strongBinder);
        }
        parcelZzdb.recycle();
        return zzblyVar;
    }
}
