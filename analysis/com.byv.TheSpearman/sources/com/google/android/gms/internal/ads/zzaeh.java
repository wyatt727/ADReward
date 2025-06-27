package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaeh implements zzadf {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzadi zzf;
    private zzaem zzg;

    public zzaeh(int i, int i2, String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final int zzb(zzadg zzadgVar, zzaec zzaecVar) throws IOException {
        int i = this.zze;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzaem zzaemVar = this.zzg;
        Objects.requireNonNull(zzaemVar);
        int iZza = zzaek.zza(zzaemVar, zzadgVar, 1024, true);
        if (iZza == -1) {
            this.zze = 2;
            this.zzg.zzs(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += iZza;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final /* synthetic */ List zzc() {
        return zzfzn.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zzd(zzadi zzadiVar) {
        this.zzf = zzadiVar;
        zzaem zzaemVarZzw = zzadiVar.zzw(1024, 4);
        this.zzg = zzaemVarZzw;
        zzak zzakVar = new zzak();
        zzakVar.zzW(this.zzc);
        zzaemVarZzw.zzl(zzakVar.zzac());
        this.zzf.zzD();
        this.zzf.zzO(new zzaei(-9223372036854775807L));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zze(long j, long j2) {
        if (j == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final boolean zzf(zzadg zzadgVar) throws IOException {
        zzek.zzf((this.zza == -1 || this.zzb == -1) ? false : true);
        zzfo zzfoVar = new zzfo(this.zzb);
        ((zzact) zzadgVar).zzm(zzfoVar.zzM(), 0, this.zzb, false);
        return zzfoVar.zzq() == this.zza;
    }
}
