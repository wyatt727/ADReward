package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzady implements zzaef {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final boolean zzd;

    public zzady(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzek.zzd(length == length2);
        boolean z = length2 > 0;
        this.zzd = z;
        if (!z || jArr2[0] <= 0) {
            this.zza = jArr;
            this.zzb = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.zza = jArr3;
            long[] jArr4 = new long[i];
            this.zzb = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final zzaed zzg(long j) {
        if (!this.zzd) {
            zzaeg zzaegVar = zzaeg.zza;
            return new zzaed(zzaegVar, zzaegVar);
        }
        int iZzc = zzfx.zzc(this.zzb, j, true, true);
        zzaeg zzaegVar2 = new zzaeg(this.zzb[iZzc], this.zza[iZzc]);
        if (zzaegVar2.zzb != j) {
            long[] jArr = this.zzb;
            if (iZzc != jArr.length - 1) {
                int i = iZzc + 1;
                return new zzaed(zzaegVar2, new zzaeg(jArr[i], this.zza[i]));
            }
        }
        return new zzaed(zzaegVar2, zzaegVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final boolean zzh() {
        return this.zzd;
    }
}
