package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzxf implements zzwy {
    private final zzwy zza;
    private final long zzb;

    public zzxf(zzwy zzwyVar, long j) {
        this.zza = zzwyVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final int zza(zzlb zzlbVar, zzih zzihVar, int i) {
        int iZza = this.zza.zza(zzlbVar, zzihVar, i);
        if (iZza != -4) {
            return iZza;
        }
        zzihVar.zze += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final int zzb(long j) {
        return this.zza.zzb(j - this.zzb);
    }

    public final zzwy zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final boolean zze() {
        return this.zza.zze();
    }
}
