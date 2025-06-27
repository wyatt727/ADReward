package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaou implements zzaon {
    final /* synthetic */ zzaow zza;
    private final zzfn zzb = new zzfn(new byte[4], 4);

    public zzaou(zzaow zzaowVar) {
        this.zza = zzaowVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza(zzfo zzfoVar) {
        if (zzfoVar.zzm() == 0 && (zzfoVar.zzm() & 128) != 0) {
            zzfoVar.zzL(6);
            int iZzb = zzfoVar.zzb() / 4;
            for (int i = 0; i < iZzb; i++) {
                zzfoVar.zzF(this.zzb, 4);
                zzfn zzfnVar = this.zzb;
                int iZzd = zzfnVar.zzd(16);
                zzfnVar.zzm(3);
                if (iZzd == 0) {
                    this.zzb.zzm(13);
                } else {
                    int iZzd2 = this.zzb.zzd(13);
                    if (this.zza.zzg.get(iZzd2) == null) {
                        zzaow zzaowVar = this.zza;
                        zzaowVar.zzg.put(iZzd2, new zzaoo(new zzaov(zzaowVar, iZzd2)));
                        this.zza.zzm++;
                    }
                }
            }
            this.zza.zzg.remove(0);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzfv zzfvVar, zzadi zzadiVar, zzapa zzapaVar) {
    }
}
