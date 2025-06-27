package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfab {
    /* JADX WARN: Multi-variable type inference failed */
    public static zzewr zza(zzezf zzezfVar, zzeur zzeurVar, ScheduledExecutorService scheduledExecutorService, int i) {
        if (i == 0) {
            zzezfVar = zzeurVar;
        }
        return new zzeuz(zzezfVar, 0L, scheduledExecutorService);
    }

    public static zzewr zzb(zzezp zzezpVar, ScheduledExecutorService scheduledExecutorService) {
        return new zzeuz(zzezpVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzeb)).longValue(), scheduledExecutorService);
    }

    public static zzewr zzc(zzfak zzfakVar, ScheduledExecutorService scheduledExecutorService) {
        return new zzeuz(zzfakVar, 0L, scheduledExecutorService);
    }
}
