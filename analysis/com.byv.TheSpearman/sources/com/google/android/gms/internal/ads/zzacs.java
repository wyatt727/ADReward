package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public class zzacs implements zzaef {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzacs(long j, long j2, int i, int i2, boolean z) {
        long jZzc;
        this.zza = j;
        this.zzb = j2;
        this.zzc = i2 == -1 ? 1 : i2;
        this.zze = i;
        if (j == -1) {
            this.zzd = -1L;
            jZzc = -9223372036854775807L;
        } else {
            this.zzd = j - j2;
            jZzc = zzc(j, j2, i);
        }
        this.zzf = jZzc;
    }

    private static long zzc(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final long zza() {
        return this.zzf;
    }

    public final long zzb(long j) {
        return zzc(j, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaed zzg(long j) {
        long j2 = this.zzd;
        if (j2 == -1) {
            zzaeg zzaegVar = new zzaeg(0L, this.zzb);
            return new zzaed(zzaegVar, zzaegVar);
        }
        long j3 = this.zzc;
        long jMin = (((this.zze * j) / 8000000) / j3) * j3;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j3);
        }
        long jMax = this.zzb + Math.max(jMin, 0L);
        long jZzb = zzb(jMax);
        zzaeg zzaegVar2 = new zzaeg(jZzb, jMax);
        if (this.zzd != -1 && jZzb < j) {
            long j4 = jMax + this.zzc;
            if (j4 < this.zza) {
                return new zzaed(zzaegVar2, new zzaeg(zzb(j4), j4));
            }
        }
        return new zzaed(zzaegVar2, zzaegVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final boolean zzh() {
        return this.zzd != -1;
    }
}
