package com.google.android.gms.games.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.games.zzfi;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class zzad extends com.google.android.gms.internal.games.zza implements zzaa {
    public zzad() {
        super("com.google.android.gms.games.internal.IGamesClient");
    }

    @Override // com.google.android.gms.internal.games.zza
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1001) {
            return false;
        }
        zzfi zzfiVarZzaf = zzaf();
        parcel2.writeNoException();
        com.google.android.gms.internal.games.zzd.zzb(parcel2, zzfiVarZzaf);
        return true;
    }
}
