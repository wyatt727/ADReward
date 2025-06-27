package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.json.t2;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcqu {
    private final zzduh zza;
    private final zzffz zzb;

    zzcqu(zzduh zzduhVar, zzffz zzffzVar) {
        this.zza = zzduhVar;
        this.zzb = zzffzVar;
    }

    public final void zza(long j, int i) {
        zzdug zzdugVarZza = this.zza.zza();
        zzdugVarZza.zzd(this.zzb.zzb.zzb);
        zzdugVarZza.zzb(t2.h.h, "ad_closed");
        zzdugVarZza.zzb("show_time", String.valueOf(j));
        zzdugVarZza.zzb(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
        int i2 = i - 1;
        zzdugVarZza.zzb("acr", i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : CmcdHeadersFactory.STREAMING_FORMAT_HLS);
        zzdugVarZza.zzf();
    }
}
