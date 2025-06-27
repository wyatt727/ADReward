package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzkf {
    public static zzpb zza(Context context, zzko zzkoVar, boolean z, String str) {
        zzox zzoxVarZzb = zzox.zzb(context);
        if (zzoxVarZzb == null) {
            zzfe.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new zzpb(LogSessionId.LOG_SESSION_ID_NONE, str);
        }
        if (z) {
            zzkoVar.zzz(zzoxVarZzb);
        }
        return new zzpb(zzoxVarZzb.zza(), str);
    }
}
