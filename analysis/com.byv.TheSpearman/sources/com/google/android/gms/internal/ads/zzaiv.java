package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaiv implements zzaiu {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzaiv(long[] jArr, long[] jArr2, long j, long j2) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzaiv zzb(long j, long j2, zzadz zzadzVar, zzfo zzfoVar) {
        int iZzm;
        zzfoVar.zzL(10);
        int iZzg = zzfoVar.zzg();
        if (iZzg <= 0) {
            return null;
        }
        int i = zzadzVar.zzd;
        long jZzt = zzfx.zzt(iZzg, (i >= 32000 ? 1152 : 576) * 1000000, i, RoundingMode.FLOOR);
        int iZzq = zzfoVar.zzq();
        int iZzq2 = zzfoVar.zzq();
        int iZzq3 = zzfoVar.zzq();
        zzfoVar.zzL(2);
        long j3 = j2 + zzadzVar.zzc;
        long[] jArr = new long[iZzq];
        long[] jArr2 = new long[iZzq];
        int i2 = 0;
        long j4 = j2;
        while (i2 < iZzq) {
            long j5 = j3;
            long j6 = jZzt;
            jArr[i2] = (i2 * jZzt) / iZzq;
            jArr2[i2] = Math.max(j4, j5);
            if (iZzq3 == 1) {
                iZzm = zzfoVar.zzm();
            } else if (iZzq3 == 2) {
                iZzm = zzfoVar.zzq();
            } else if (iZzq3 == 3) {
                iZzm = zzfoVar.zzo();
            } else {
                if (iZzq3 != 4) {
                    return null;
                }
                iZzm = zzfoVar.zzp();
            }
            j4 += iZzm * iZzq2;
            i2++;
            j3 = j5;
            iZzq = iZzq;
            jZzt = j6;
        }
        long j7 = jZzt;
        if (j != -1 && j != j4) {
            zzfe.zzf("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j4);
        }
        return new zzaiv(jArr, jArr2, j7, j4);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    public final long zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    public final long zzd(long j) {
        return this.zza[zzfx.zzc(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaed zzg(long j) {
        long[] jArr = this.zza;
        int iZzc = zzfx.zzc(jArr, j, true, true);
        zzaeg zzaegVar = new zzaeg(jArr[iZzc], this.zzb[iZzc]);
        if (zzaegVar.zzb < j) {
            long[] jArr2 = this.zza;
            if (iZzc != jArr2.length - 1) {
                int i = iZzc + 1;
                return new zzaed(zzaegVar, new zzaeg(jArr2[i], this.zzb[i]));
            }
        }
        return new zzaed(zzaegVar, zzaegVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final boolean zzh() {
        return true;
    }
}
