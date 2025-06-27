package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfhe {
    private static zzfhe zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcl zzc;
    private final AtomicReference zzd = new AtomicReference();

    zzfhe(Context context, com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        this.zzb = context;
        this.zzc = zzclVar;
    }

    static com.google.android.gms.ads.internal.client.zzcl zza(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzck.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    public static zzfhe zzd(Context context) {
        synchronized (zzfhe.class) {
            zzfhe zzfheVar = zza;
            if (zzfheVar != null) {
                return zzfheVar;
            }
            Context applicationContext = context.getApplicationContext();
            long jLongValue = ((Long) zzbfu.zzb.zze()).longValue();
            com.google.android.gms.ads.internal.client.zzcl zzclVarZza = null;
            if (jLongValue > 0 && jLongValue <= 241199800) {
                zzclVarZza = zza(applicationContext);
            }
            zzfhe zzfheVar2 = new zzfhe(applicationContext, zzclVarZza);
            zza = zzfheVar2;
            return zzfheVar2;
        }
    }

    private final com.google.android.gms.ads.internal.client.zzen zzg() {
        com.google.android.gms.ads.internal.client.zzcl zzclVar = this.zzc;
        if (zzclVar != null) {
            try {
                return zzclVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final zzbqo zzb() {
        return (zzbqo) this.zzd.get();
    }

    public final VersionInfoParcel zzc(int i, boolean z, int i2) {
        com.google.android.gms.ads.internal.client.zzen zzenVarZzg;
        com.google.android.gms.ads.internal.zzu.zzp();
        boolean zZzE = com.google.android.gms.ads.internal.util.zzt.zzE(this.zzb);
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(241199000, i2, true, zZzE);
        return (((Boolean) zzbfu.zzc.zze()).booleanValue() && (zzenVarZzg = zzg()) != null) ? new VersionInfoParcel(241199000, zzenVarZzg.zza(), true, zZzE) : versionInfoParcel;
    }

    public final String zze() {
        com.google.android.gms.ads.internal.client.zzen zzenVarZzg = zzg();
        if (zzenVarZzg != null) {
            return zzenVarZzg.zzb();
        }
        return null;
    }

    public final void zzf(zzbqo zzbqoVar) {
        zzbqo adapterCreator;
        if (!((Boolean) zzbfu.zza.zze()).booleanValue()) {
            zzfhd.zza(this.zzd, null, zzbqoVar);
            return;
        }
        com.google.android.gms.ads.internal.client.zzcl zzclVar = this.zzc;
        if (zzclVar == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = zzclVar.getAdapterCreator();
            } catch (RemoteException unused) {
            }
        }
        AtomicReference atomicReference = this.zzd;
        if (adapterCreator != null) {
            zzbqoVar = adapterCreator;
        }
        zzfhd.zza(atomicReference, null, zzbqoVar);
    }
}
