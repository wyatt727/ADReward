package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public abstract class zzej extends zzb implements zzek {
    public zzej() {
        super("com.google.android.gms.nearby.internal.connection.IPayloadListener");
    }

    @Override // com.google.android.gms.internal.nearby.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzb((zzfm) zzc.zzb(parcel, zzfm.CREATOR));
            return true;
        }
        if (i != 3) {
            return false;
        }
        zzc((zzfo) zzc.zzb(parcel, zzfo.CREATOR));
        return true;
    }
}
