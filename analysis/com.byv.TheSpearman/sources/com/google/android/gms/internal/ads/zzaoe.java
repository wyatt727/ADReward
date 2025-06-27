package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaoe implements zzaon {
    private zzam zza;
    private zzfv zzb;
    private zzaem zzc;

    public zzaoe(String str) {
        zzak zzakVar = new zzak();
        zzakVar.zzW(str);
        this.zza = zzakVar.zzac();
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza(zzfo zzfoVar) {
        zzek.zzb(this.zzb);
        int i = zzfx.zza;
        long jZze = this.zzb.zze();
        long jZzf = this.zzb.zzf();
        if (jZze == -9223372036854775807L || jZzf == -9223372036854775807L) {
            return;
        }
        zzam zzamVar = this.zza;
        if (jZzf != zzamVar.zzq) {
            zzak zzakVarZzb = zzamVar.zzb();
            zzakVarZzb.zzaa(jZzf);
            zzam zzamVarZzac = zzakVarZzb.zzac();
            this.zza = zzamVarZzac;
            this.zzc.zzl(zzamVarZzac);
        }
        int iZzb = zzfoVar.zzb();
        this.zzc.zzq(zzfoVar, iZzb);
        this.zzc.zzs(jZze, 1, iZzb, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzfv zzfvVar, zzadi zzadiVar, zzapa zzapaVar) {
        this.zzb = zzfvVar;
        zzapaVar.zzc();
        zzaem zzaemVarZzw = zzadiVar.zzw(zzapaVar.zza(), 5);
        this.zzc = zzaemVarZzw;
        zzaemVarZzw.zzl(this.zza);
    }
}
