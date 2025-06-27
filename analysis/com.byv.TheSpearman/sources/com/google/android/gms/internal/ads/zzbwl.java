package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzbwl extends zzazp implements zzbwm {
    public zzbwl() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbww zzbwuVar = null;
        if (i == 1) {
            zzazq.zzc(parcel);
            parcel2.writeNoException();
            zzazq.zze(parcel2, null);
        } else if (i == 2) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (iInterfaceQueryLocalInterface instanceof zzbwn) {
                }
            }
            zzazq.zzc(parcel);
            parcel2.writeNoException();
        } else if (i == 4) {
            zzbxd zzbxdVar = (zzbxd) zzazq.zza(parcel, zzbxd.CREATOR);
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbwuVar = iInterfaceQueryLocalInterface2 instanceof zzbww ? (zzbww) iInterfaceQueryLocalInterface2 : new zzbwu(strongBinder2);
            }
            zzazq.zzc(parcel);
            zzg(zzbxdVar, zzbwuVar);
            parcel2.writeNoException();
        } else if (i == 5) {
            zzbxd zzbxdVar2 = (zzbxd) zzazq.zza(parcel, zzbxd.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbwuVar = iInterfaceQueryLocalInterface3 instanceof zzbww ? (zzbww) iInterfaceQueryLocalInterface3 : new zzbwu(strongBinder3);
            }
            zzazq.zzc(parcel);
            zzf(zzbxdVar2, zzbwuVar);
            parcel2.writeNoException();
        } else if (i == 6) {
            zzbxd zzbxdVar3 = (zzbxd) zzazq.zza(parcel, zzbxd.CREATOR);
            IBinder strongBinder4 = parcel.readStrongBinder();
            if (strongBinder4 != null) {
                IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbwuVar = iInterfaceQueryLocalInterface4 instanceof zzbww ? (zzbww) iInterfaceQueryLocalInterface4 : new zzbwu(strongBinder4);
            }
            zzazq.zzc(parcel);
            zze(zzbxdVar3, zzbwuVar);
            parcel2.writeNoException();
        } else {
            if (i != 7) {
                return false;
            }
            String string = parcel.readString();
            IBinder strongBinder5 = parcel.readStrongBinder();
            if (strongBinder5 != null) {
                IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbwuVar = iInterfaceQueryLocalInterface5 instanceof zzbww ? (zzbww) iInterfaceQueryLocalInterface5 : new zzbwu(strongBinder5);
            }
            zzazq.zzc(parcel);
            zzh(string, zzbwuVar);
            parcel2.writeNoException();
        }
        return true;
    }
}
