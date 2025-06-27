package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzafw implements zzadf {
    private zzadi zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzahq zzg;
    private zzadg zzh;
    private zzafz zzi;
    private zzajv zzj;
    private final zzfo zza = new zzfo(6);
    private long zzf = -1;

    private final int zza(zzadg zzadgVar) throws IOException {
        this.zza.zzH(2);
        ((zzact) zzadgVar).zzm(this.zza.zzM(), 0, 2, false);
        return this.zza.zzq();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x010e  */
    @Override // com.google.android.gms.internal.ads.zzadf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadg r24, com.google.android.gms.internal.ads.zzaec r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafw.zzb(com.google.android.gms.internal.ads.zzadg, com.google.android.gms.internal.ads.zzaec):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final /* synthetic */ List zzc() {
        return zzfzn.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zzd(zzadi zzadiVar) {
        this.zzb = zzadiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final boolean zzf(zzadg zzadgVar) throws IOException {
        if (zza(zzadgVar) != 65496) {
            return false;
        }
        int iZza = zza(zzadgVar);
        this.zzd = iZza;
        if (iZza == 65504) {
            this.zza.zzH(2);
            zzact zzactVar = (zzact) zzadgVar;
            zzactVar.zzm(this.zza.zzM(), 0, 2, false);
            zzactVar.zzl(this.zza.zzq() - 2, false);
            iZza = zza(zzadgVar);
            this.zzd = iZza;
        }
        if (iZza == 65505) {
            zzact zzactVar2 = (zzact) zzadgVar;
            zzactVar2.zzl(2, false);
            this.zza.zzH(6);
            zzactVar2.zzm(this.zza.zzM(), 0, 6, false);
            if (this.zza.zzu() == 1165519206 && this.zza.zzq() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzajv zzajvVar = this.zzj;
            Objects.requireNonNull(zzajvVar);
            zzajvVar.zze(j, j2);
        }
    }

    private final void zzg() {
        zzadi zzadiVar = this.zzb;
        Objects.requireNonNull(zzadiVar);
        zzadiVar.zzD();
        this.zzb.zzO(new zzaee(-9223372036854775807L, 0L));
        this.zzc = 6;
    }
}
