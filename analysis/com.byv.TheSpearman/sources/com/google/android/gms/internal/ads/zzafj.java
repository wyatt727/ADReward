package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzafj implements zzaco {
    private final zzads zza;
    private final int zzb;
    private final zzadn zzc = new zzadn();

    /* synthetic */ zzafj(zzads zzadsVar, int i, zzafi zzafiVar) {
        this.zza = zzadsVar;
        this.zzb = i;
    }

    private final long zzc(zzadg zzadgVar) throws IOException {
        while (zzadgVar.zze() < zzadgVar.zzd() - 6) {
            zzads zzadsVar = this.zza;
            int i = this.zzb;
            zzadn zzadnVar = this.zzc;
            long jZze = zzadgVar.zze();
            byte[] bArr = new byte[2];
            zzact zzactVar = (zzact) zzadgVar;
            zzactVar.zzm(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                zzadgVar.zzj();
                zzactVar.zzl((int) (jZze - zzadgVar.zzf()), false);
            } else {
                zzfo zzfoVar = new zzfo(16);
                System.arraycopy(bArr, 0, zzfoVar.zzM(), 0, 2);
                zzfoVar.zzJ(zzadj.zza(zzadgVar, zzfoVar.zzM(), 2, 14));
                zzadgVar.zzj();
                zzactVar.zzl((int) (jZze - zzadgVar.zzf()), false);
                if (zzado.zzc(zzfoVar, zzadsVar, i, zzadnVar)) {
                    break;
                }
            }
            zzactVar.zzl(1, false);
        }
        if (zzadgVar.zze() < zzadgVar.zzd() - 6) {
            return this.zzc.zza;
        }
        ((zzact) zzadgVar).zzl((int) (zzadgVar.zzd() - zzadgVar.zze()), false);
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final zzacn zza(zzadg zzadgVar, long j) throws IOException {
        int i = this.zza.zzc;
        long jZzf = zzadgVar.zzf();
        long jZzc = zzc(zzadgVar);
        long jZze = zzadgVar.zze();
        ((zzact) zzadgVar).zzl(Math.max(6, i), false);
        long jZzc2 = zzc(zzadgVar);
        return (jZzc > j || jZzc2 <= j) ? jZzc2 <= j ? zzacn.zzf(jZzc2, zzadgVar.zze()) : zzacn.zzd(jZzc, jZzf) : zzacn.zze(jZze);
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final /* synthetic */ void zzb() {
    }
}
