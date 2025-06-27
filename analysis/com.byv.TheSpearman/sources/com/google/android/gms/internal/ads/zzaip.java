package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaip implements zzaiu {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzaip(long[] jArr, long[] jArr2, long j) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j == -9223372036854775807L ? zzfx.zzr(jArr2[jArr2.length - 1]) : j;
    }

    public static zzaip zzb(long j, zzahh zzahhVar, long j2) {
        int length = zzahhVar.zzd.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += zzahhVar.zzb + zzahhVar.zzd[i3];
            j3 += zzahhVar.zzc + zzahhVar.zze[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new zzaip(jArr, jArr2, j2);
    }

    private static Pair zze(long j, long[] jArr, long[] jArr2) {
        int iZzc = zzfx.zzc(jArr, j, true, true);
        long j2 = jArr[iZzc];
        long j3 = jArr2[iZzc];
        int i = iZzc + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    public final long zzc() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzaiu
    public final long zzd(long j) {
        return zzfx.zzr(((Long) zze(j, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaed zzg(long j) {
        Pair pairZze = zze(zzfx.zzu(Math.max(0L, Math.min(j, this.zzc))), this.zzb, this.zza);
        zzaeg zzaegVar = new zzaeg(zzfx.zzr(((Long) pairZze.first).longValue()), ((Long) pairZze.second).longValue());
        return new zzaed(zzaegVar, zzaegVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final boolean zzh() {
        return true;
    }
}
