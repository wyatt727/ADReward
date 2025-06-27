package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzbws extends zzazp implements zzbwt {
    public zzbws() {
        super("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzazq.zza(parcel, ParcelFileDescriptor.CREATOR);
            zzazq.zzc(parcel);
            zzf(parcelFileDescriptor);
        } else {
            if (i != 2) {
                return false;
            }
            com.google.android.gms.ads.internal.util.zzbb zzbbVar = (com.google.android.gms.ads.internal.util.zzbb) zzazq.zza(parcel, com.google.android.gms.ads.internal.util.zzbb.CREATOR);
            zzazq.zzc(parcel);
            zze(zzbbVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
