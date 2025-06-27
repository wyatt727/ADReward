package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public abstract class zzdv extends zzb implements zzdw {
    public zzdv() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzb((zzfm) zzc.zzb(parcel, zzfm.CREATOR));
            return true;
        }
        if (i == 3) {
            zzc((zzfe) zzc.zzb(parcel, zzfe.CREATOR));
            return true;
        }
        if (i != 4) {
            return false;
        }
        return true;
    }
}
