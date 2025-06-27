package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public abstract class zzdy extends zzb implements zzdz {
    public zzdy() {
        super("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzb((zzew) zzc.zzb(parcel, zzew.CREATOR));
            return true;
        }
        if (i == 3) {
            zzc((zzfc) zzc.zzb(parcel, zzfc.CREATOR));
            return true;
        }
        if (i == 4) {
            zzd((zzfe) zzc.zzb(parcel, zzfe.CREATOR));
            return true;
        }
        if (i != 5) {
            return false;
        }
        zze((zzeu) zzc.zzb(parcel, zzeu.CREATOR));
        return true;
    }
}
