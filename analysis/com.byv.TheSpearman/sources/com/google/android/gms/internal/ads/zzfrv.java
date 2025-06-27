package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfrv {
    final zzfry zza;
    final boolean zzb;

    private zzfrv(zzfry zzfryVar) {
        this.zza = zzfryVar;
        this.zzb = zzfryVar != null;
    }

    public static zzfrv zzb(Context context, String str, String str2) throws zzfqx {
        zzfry zzfrwVar;
        try {
            try {
                try {
                    IBinder iBinderInstantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderInstantiate == null) {
                        zzfrwVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderInstantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfrwVar = iInterfaceQueryLocalInterface instanceof zzfry ? (zzfry) iInterfaceQueryLocalInterface : new zzfrw(iBinderInstantiate);
                    }
                    zzfrwVar.zze(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfrv(zzfrwVar);
                } catch (Exception e) {
                    throw new zzfqx(e);
                }
            } catch (RemoteException | zzfqx | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzfrv(new zzfrz());
            }
        } catch (Exception e2) {
            throw new zzfqx(e2);
        }
    }

    public static zzfrv zzc() {
        zzfrz zzfrzVar = new zzfrz();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfrv(zzfrzVar);
    }

    public final zzfru zza(byte[] bArr) {
        return new zzfru(this, bArr, null);
    }
}
