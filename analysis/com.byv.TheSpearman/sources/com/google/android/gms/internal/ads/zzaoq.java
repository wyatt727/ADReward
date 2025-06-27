package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaoq implements zzaco {
    private final zzfv zza;
    private final zzfo zzb = new zzfo();
    private final int zzc;

    public zzaoq(int i, zzfv zzfvVar, int i2) {
        this.zzc = i;
        this.zza = zzfvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final zzacn zza(zzadg zzadgVar, long j) throws IOException {
        int iZza;
        int iZza2;
        long jZzf = zzadgVar.zzf();
        int iMin = (int) Math.min(112800L, zzadgVar.zzd() - jZzf);
        this.zzb.zzH(iMin);
        ((zzact) zzadgVar).zzm(this.zzb.zzM(), 0, iMin, false);
        zzfo zzfoVar = this.zzb;
        int iZze = zzfoVar.zze();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (zzfoVar.zzb() >= 188 && (iZza2 = (iZza = zzapc.zza(zzfoVar.zzM(), zzfoVar.zzd(), iZze)) + 188) <= iZze) {
            long jZzb = zzapc.zzb(zzfoVar, iZza, this.zzc);
            if (jZzb != -9223372036854775807L) {
                long jZzb2 = this.zza.zzb(jZzb);
                if (jZzb2 <= j) {
                    j4 = iZza;
                    if (100000 + jZzb2 <= j) {
                        j3 = jZzb2;
                    }
                } else if (j3 == -9223372036854775807L) {
                    return zzacn.zzd(jZzb2, jZzf);
                }
                return zzacn.zze(jZzf + j4);
            }
            zzfoVar.zzK(iZza2);
            j2 = iZza2;
        }
        return j3 != -9223372036854775807L ? zzacn.zzf(j3, jZzf + j2) : zzacn.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zzb() {
        byte[] bArr = zzfx.zzf;
        int length = bArr.length;
        this.zzb.zzI(bArr, 0);
    }
}
