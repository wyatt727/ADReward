package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public abstract class zzef extends zzb implements zzeg {
    public zzef() {
        super("com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzc((zzfi) zzc.zzb(parcel, zzfi.CREATOR));
            return true;
        }
        if (i == 3) {
            zzd((zzfk) zzc.zzb(parcel, zzfk.CREATOR));
            return true;
        }
        if (i == 4) {
            return true;
        }
        if (i != 5) {
            return false;
        }
        zzb((zzfg) zzc.zzb(parcel, zzfg.CREATOR));
        return true;
    }
}
