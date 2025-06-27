package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zztl {
    public static void zza(zztd zztdVar, zzpb zzpbVar) {
        LogSessionId logSessionIdZza = zzpbVar.zza();
        if (logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        zztdVar.zzb.setString("log-session-id", logSessionIdZza.getStringId());
    }
}
