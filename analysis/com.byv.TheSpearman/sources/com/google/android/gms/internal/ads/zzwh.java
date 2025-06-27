package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzwh implements zzwy {
    final /* synthetic */ zzwk zza;
    private final int zzb;

    public zzwh(zzwk zzwkVar, int i) {
        this.zza = zzwkVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final int zza(zzlb zzlbVar, zzih zzihVar, int i) {
        return this.zza.zzg(this.zzb, zzlbVar, zzihVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final int zzb(long j) {
        return this.zza.zzi(this.zzb, j);
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final void zzd() throws IOException {
        this.zza.zzI(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzwy
    public final boolean zze() {
        return this.zza.zzP(this.zzb);
    }
}
