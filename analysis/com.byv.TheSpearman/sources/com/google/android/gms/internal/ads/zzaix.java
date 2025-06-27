package com.google.android.gms.internal.ads;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaix implements zzaiu {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long[] zzf;

    private zzaix(long j, int i, long j2, long j3, long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = j3;
        this.zze = j3 != -1 ? j + j3 : -1L;
    }

    public static zzaix zzb(long j, zzaiw zzaiwVar, long j2) {
        long j3 = zzaiwVar.zzb;
        if (j3 == -1) {
            j3 = -1;
        }
        long jZzs = zzfx.zzs((j3 * r7.zzg) - 1, zzaiwVar.zza.zzd);
        long j4 = zzaiwVar.zzc;
        if (j4 == -1 || zzaiwVar.zzf == null) {
            return new zzaix(j2, zzaiwVar.zza.zzc, jZzs, -1L, null);
        }
        if (j != -1) {
            long j5 = j2 + j4;
            if (j != j5) {
                zzfe.zzf("XingSeeker", "XING data size mismatch: " + j + ", " + j5);
            }
        }
        return new zzaix(j2, zzaiwVar.zza.zzc, jZzs, zzaiwVar.zzc, zzaiwVar.zzf);
    }

    private final long zze(int i) {
        return (this.zzc * i) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    public final long zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    public final long zzd(long j) {
        if (!zzh()) {
            return 0L;
        }
        long j2 = j - this.zza;
        if (j2 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzf;
        zzek.zzb(jArr);
        double d = (j2 * 256.0d) / this.zzd;
        int iZzc = zzfx.zzc(jArr, (long) d, true, true);
        long jZze = zze(iZzc);
        long j3 = jArr[iZzc];
        int i = iZzc + 1;
        long jZze2 = zze(i);
        return jZze + Math.round((j3 == (iZzc == 99 ? 256L : jArr[i]) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (d - j3) / (r0 - j3)) * (jZze2 - jZze));
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaed zzg(long j) {
        if (!zzh()) {
            zzaeg zzaegVar = new zzaeg(0L, this.zza + this.zzb);
            return new zzaed(zzaegVar, zzaegVar);
        }
        long jMax = Math.max(0L, Math.min(j, this.zzc));
        double d = (jMax * 100.0d) / this.zzc;
        double d2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.zzf;
                zzek.zzb(jArr);
                double d3 = jArr[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        long j2 = this.zzd;
        zzaeg zzaegVar2 = new zzaeg(jMax, this.zza + Math.max(this.zzb, Math.min(Math.round((d2 / 256.0d) * j2), j2 - 1)));
        return new zzaed(zzaegVar2, zzaegVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final boolean zzh() {
        return this.zzf != null;
    }
}
