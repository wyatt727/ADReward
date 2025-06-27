package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzbwp extends zzazp implements zzbwq {
    public zzbwp() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbwt zzbwrVar = null;
        if (i == 1) {
            zzbwe zzbweVar = (zzbwe) zzazq.zza(parcel, zzbwe.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzbwrVar = iInterfaceQueryLocalInterface instanceof zzbwt ? (zzbwt) iInterfaceQueryLocalInterface : new zzbwr(strongBinder);
            }
            zzazq.zzc(parcel);
            zzf(zzbweVar, zzbwrVar);
        } else if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (iInterfaceQueryLocalInterface2 instanceof zzbwt) {
                }
            }
            zzazq.zzc(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            zzbwi zzbwiVar = (zzbwi) zzazq.zza(parcel, zzbwi.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzbwrVar = iInterfaceQueryLocalInterface3 instanceof zzbwt ? (zzbwt) iInterfaceQueryLocalInterface3 : new zzbwr(strongBinder3);
            }
            zzazq.zzc(parcel);
            zze(zzbwiVar, zzbwrVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
