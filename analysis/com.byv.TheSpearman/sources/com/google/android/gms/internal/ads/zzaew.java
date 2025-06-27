package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaew implements zzaef {
    final /* synthetic */ zzaez zza;
    private final long zzb;

    public zzaew(zzaez zzaezVar, long j) {
        this.zza = zzaezVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaed zzg(long j) {
        zzaed zzaedVarZza = this.zza.zzh[0].zza(j);
        int i = 1;
        while (true) {
            zzaez zzaezVar = this.zza;
            if (i >= zzaezVar.zzh.length) {
                return zzaedVarZza;
            }
            zzaed zzaedVarZza2 = zzaezVar.zzh[i].zza(j);
            if (zzaedVarZza2.zza.zzc < zzaedVarZza.zza.zzc) {
                zzaedVarZza = zzaedVarZza2;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final boolean zzh() {
        return true;
    }
}
