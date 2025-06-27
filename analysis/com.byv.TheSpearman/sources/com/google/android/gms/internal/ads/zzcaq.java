package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcaq extends zzazo implements zzcas {
    zzcaq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final zzcap zze(IObjectWrapper iObjectWrapper, zzbqo zzbqoVar, int i) throws RemoteException {
        zzcap zzcanVar;
        Parcel parcelZza = zza();
        zzazq.zzf(parcelZza, iObjectWrapper);
        zzazq.zzf(parcelZza, zzbqoVar);
        parcelZza.writeInt(241199000);
        Parcel parcelZzdb = zzdb(2, parcelZza);
        IBinder strongBinder = parcelZzdb.readStrongBinder();
        if (strongBinder == null) {
            zzcanVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzcanVar = iInterfaceQueryLocalInterface instanceof zzcap ? (zzcap) iInterfaceQueryLocalInterface : new zzcan(strongBinder);
        }
        parcelZzdb.recycle();
        return zzcanVar;
    }
}
