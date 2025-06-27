package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbct {
    private zzbci zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    zzbct(Context context) {
        this.zzc = context;
    }

    final Future zzc(zzbcj zzbcjVar) {
        zzbcn zzbcnVar = new zzbcn(this);
        zzbcr zzbcrVar = new zzbcr(this, zzbcjVar, zzbcnVar);
        zzbcs zzbcsVar = new zzbcs(this, zzbcnVar);
        synchronized (this.zzd) {
            zzbci zzbciVar = new zzbci(this.zzc, com.google.android.gms.ads.internal.zzu.zzt().zzb(), zzbcrVar, zzbcsVar);
            this.zza = zzbciVar;
            zzbciVar.checkAvailabilityAndConnect();
        }
        return zzbcnVar;
    }

    static /* bridge */ /* synthetic */ void zze(zzbct zzbctVar) {
        synchronized (zzbctVar.zzd) {
            zzbci zzbciVar = zzbctVar.zza;
            if (zzbciVar == null) {
                return;
            }
            zzbciVar.disconnect();
            zzbctVar.zza = null;
            Binder.flushPendingCommands();
        }
    }
}
