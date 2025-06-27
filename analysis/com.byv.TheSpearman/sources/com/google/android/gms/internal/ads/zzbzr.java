package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbzr {
    private final Clock zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzcad zzc;

    zzbzr(Clock clock, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcad zzcadVar) {
        this.zza = clock;
        this.zzb = zzgVar;
        this.zzc = zzcadVar;
    }

    public final void zza(int i, long j) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzap)).booleanValue()) {
            return;
        }
        if (j - this.zzb.zze() < 0) {
            com.google.android.gms.ads.internal.util.zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaq)).booleanValue()) {
            this.zzb.zzJ(i);
            this.zzb.zzK(j);
        } else {
            this.zzb.zzJ(-1);
            this.zzb.zzK(j);
        }
    }
}
