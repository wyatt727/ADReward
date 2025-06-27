package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzapm implements zzaef {
    private final zzapj zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzapm(zzapj zzapjVar, int i, long j, long j2) {
        this.zza = zzapjVar;
        this.zzb = i;
        this.zzc = j;
        long j3 = (j2 - j) / zzapjVar.zzd;
        this.zzd = j3;
        this.zze = zzb(j3);
    }

    private final long zzb(long j) {
        return zzfx.zzt(j * this.zzb, 1000000L, this.zza.zzc, RoundingMode.FLOOR);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaed zzg(long j) {
        long jMax = Math.max(0L, Math.min((this.zza.zzc * j) / (this.zzb * 1000000), this.zzd - 1));
        long jZzb = zzb(jMax);
        zzaeg zzaegVar = new zzaeg(jZzb, this.zzc + (this.zza.zzd * jMax));
        if (jZzb >= j || jMax == this.zzd - 1) {
            return new zzaed(zzaegVar, zzaegVar);
        }
        long j2 = jMax + 1;
        return new zzaed(zzaegVar, new zzaeg(zzb(j2), this.zzc + (j2 * this.zza.zzd)));
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final boolean zzh() {
        return true;
    }
}
