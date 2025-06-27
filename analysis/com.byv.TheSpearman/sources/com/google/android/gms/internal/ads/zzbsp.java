package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzbsp extends zzazp implements zzbsq {
    public zzbsp() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzazp
    protected final boolean zzdF(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String string = parcel.readString();
            zzazq.zzc(parcel);
            zze(string);
        } else if (i == 2) {
            String string2 = parcel.readString();
            zzazq.zzc(parcel);
            zzf(string2);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzazq.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzazq.zzc(parcel);
            zzg(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
