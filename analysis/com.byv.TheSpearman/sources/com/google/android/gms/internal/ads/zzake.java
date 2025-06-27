package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzake {
    public final zzakb zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final long zzh;

    public zzake(zzakb zzakbVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        zzek.zzd(length == length2);
        int length3 = jArr.length;
        zzek.zzd(length3 == length2);
        int length4 = iArr2.length;
        zzek.zzd(length4 == length2);
        this.zza = zzakbVar;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = j;
        this.zzb = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    public final int zza(long j) {
        for (int iZzc = zzfx.zzc(this.zzf, j, true, false); iZzc >= 0; iZzc--) {
            if ((this.zzg[iZzc] & 1) != 0) {
                return iZzc;
            }
        }
        return -1;
    }

    public final int zzb(long j) {
        for (int iZza = zzfx.zza(this.zzf, j, true, false); iZza < this.zzf.length; iZza++) {
            if ((this.zzg[iZza] & 1) != 0) {
                return iZza;
            }
        }
        return -1;
    }
}
