package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzadq implements zzaef {
    private final zzads zza;
    private final long zzb;

    public zzadq(zzads zzadsVar, long j) {
        this.zza = zzadsVar;
        this.zzb = j;
    }

    private final zzaeg zzb(long j, long j2) {
        return new zzaeg((j * 1000000) / this.zza.zze, this.zzb + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaed zzg(long j) {
        zzek.zzb(this.zza.zzk);
        zzads zzadsVar = this.zza;
        zzadr zzadrVar = zzadsVar.zzk;
        long[] jArr = zzadrVar.zza;
        long[] jArr2 = zzadrVar.zzb;
        int iZzc = zzfx.zzc(jArr, zzadsVar.zzb(j), true, false);
        zzaeg zzaegVarZzb = zzb(iZzc == -1 ? 0L : jArr[iZzc], iZzc != -1 ? jArr2[iZzc] : 0L);
        if (zzaegVarZzb.zzb == j || iZzc == jArr.length - 1) {
            return new zzaed(zzaegVarZzb, zzaegVarZzb);
        }
        int i = iZzc + 1;
        return new zzaed(zzaegVarZzb, zzb(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final boolean zzh() {
        return true;
    }
}
