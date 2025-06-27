package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaiw {
    public final zzadz zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;
    public final long[] zzf;

    private zzaiw(zzadz zzadzVar, long j, long j2, long[] jArr, int i, int i2) {
        this.zza = zzadzVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = i;
        this.zze = i2;
    }

    public static zzaiw zza(zzadz zzadzVar, zzfo zzfoVar) {
        long[] jArr;
        int i;
        int i2;
        int iZzg = zzfoVar.zzg();
        int iZzp = (iZzg & 1) != 0 ? zzfoVar.zzp() : -1;
        long jZzu = (iZzg & 2) != 0 ? zzfoVar.zzu() : -1L;
        if ((iZzg & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr2[i3] = zzfoVar.zzm();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((iZzg & 8) != 0) {
            zzfoVar.zzL(4);
        }
        if (zzfoVar.zzb() >= 24) {
            zzfoVar.zzL(21);
            int iZzo = zzfoVar.zzo();
            i2 = iZzo & 4095;
            i = iZzo >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new zzaiw(zzadzVar, iZzp, jZzu, jArr, i, i2);
    }
}
