package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzann implements zzano {
    private final List zza;
    private final zzaem[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = -9223372036854775807L;

    public zzann(List list) {
        this.zza = list;
        this.zzb = new zzaem[list.size()];
    }

    private final boolean zzf(zzfo zzfoVar, int i) {
        if (zzfoVar.zzb() == 0) {
            return false;
        }
        if (zzfoVar.zzm() != i) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zza(zzfo zzfoVar) {
        if (this.zzc) {
            if (this.zzd != 2 || zzf(zzfoVar, 32)) {
                if (this.zzd != 1 || zzf(zzfoVar, 0)) {
                    int iZzd = zzfoVar.zzd();
                    int iZzb = zzfoVar.zzb();
                    for (zzaem zzaemVar : this.zzb) {
                        zzfoVar.zzK(iZzd);
                        zzaemVar.zzq(zzfoVar, iZzb);
                    }
                    this.zze += iZzb;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzb(zzadi zzadiVar, zzapa zzapaVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzaox zzaoxVar = (zzaox) this.zza.get(i);
            zzapaVar.zzc();
            zzaem zzaemVarZzw = zzadiVar.zzw(zzapaVar.zza(), 3);
            zzak zzakVar = new zzak();
            zzakVar.zzK(zzapaVar.zzb());
            zzakVar.zzW("application/dvbsubs");
            zzakVar.zzL(Collections.singletonList(zzaoxVar.zzb));
            zzakVar.zzN(zzaoxVar.zza);
            zzaemVarZzw.zzl(zzakVar.zzac());
            this.zzb[i] = zzaemVarZzw;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzc(boolean z) {
        if (this.zzc) {
            zzek.zzf(this.zzf != -9223372036854775807L);
            for (zzaem zzaemVar : this.zzb) {
                zzaemVar.zzs(this.zzf, 1, this.zze, 0, null);
            }
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzd(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzf = j;
        this.zze = 0;
        this.zzd = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zze() {
        this.zzc = false;
        this.zzf = -9223372036854775807L;
    }
}
