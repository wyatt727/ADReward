package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzakh implements zzaef {
    final /* synthetic */ zzaki zza;

    /* synthetic */ zzakh(zzaki zzakiVar, zzakg zzakgVar) {
        this.zza = zzakiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final long zza() {
        zzaki zzakiVar = this.zza;
        return zzakiVar.zzd.zzf(zzakiVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaed zzg(long j) {
        zzaki zzakiVar = this.zza;
        long jZzg = zzakiVar.zzd.zzg(j);
        long j2 = zzakiVar.zzb;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(jZzg);
        zzaki zzakiVar2 = this.zza;
        long jLongValue = j2 + bigIntegerValueOf.multiply(BigInteger.valueOf(zzakiVar2.zzc - zzakiVar2.zzb)).divide(BigInteger.valueOf(this.zza.zzf)).longValue();
        zzaeg zzaegVar = new zzaeg(j, Math.max(this.zza.zzb, Math.min(jLongValue - 30000, r0.zzc - 1)));
        return new zzaed(zzaegVar, zzaegVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final boolean zzh() {
        return true;
    }
}
