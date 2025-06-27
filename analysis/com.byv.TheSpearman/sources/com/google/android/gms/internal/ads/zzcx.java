package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzcx {
    public static final zzcx zza = new zzcs();
    private static final String zzc = Integer.toString(0, 36);
    private static final String zzd = Integer.toString(1, 36);
    private static final String zze = Integer.toString(2, 36);

    @Deprecated
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzcr
    };

    protected zzcx() {
    }

    public final boolean equals(Object obj) {
        int iZzh;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcx)) {
            return false;
        }
        zzcx zzcxVar = (zzcx) obj;
        if (zzcxVar.zzc() == zzc() && zzcxVar.zzb() == zzb()) {
            zzcw zzcwVar = new zzcw();
            zzcu zzcuVar = new zzcu();
            zzcw zzcwVar2 = new zzcw();
            zzcu zzcuVar2 = new zzcu();
            for (int i = 0; i < zzc(); i++) {
                if (!zze(i, zzcwVar, 0L).equals(zzcxVar.zze(i, zzcwVar2, 0L))) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < zzb(); i2++) {
                if (!zzd(i2, zzcuVar, true).equals(zzcxVar.zzd(i2, zzcuVar2, true))) {
                    return false;
                }
            }
            int iZzg = zzg(true);
            if (iZzg == zzcxVar.zzg(true) && (iZzh = zzh(true)) == zzcxVar.zzh(true)) {
                while (iZzg != iZzh) {
                    int iZzj = zzj(iZzg, 0, true);
                    if (iZzj != zzcxVar.zzj(iZzg, 0, true)) {
                        return false;
                    }
                    iZzg = iZzj;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        zzcw zzcwVar = new zzcw();
        zzcu zzcuVar = new zzcu();
        int iZzc = zzc() + 217;
        int i2 = 0;
        while (true) {
            i = iZzc * 31;
            if (i2 >= zzc()) {
                break;
            }
            iZzc = i + zze(i2, zzcwVar, 0L).hashCode();
            i2++;
        }
        int iZzb = i + zzb();
        for (int i3 = 0; i3 < zzb(); i3++) {
            iZzb = (iZzb * 31) + zzd(i3, zzcuVar, true).hashCode();
        }
        int iZzg = zzg(true);
        while (iZzg != -1) {
            iZzb = (iZzb * 31) + iZzg;
            iZzg = zzj(iZzg, 0, true);
        }
        return iZzb;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzcu zzd(int i, zzcu zzcuVar, boolean z);

    public abstract zzcw zze(int i, zzcw zzcwVar, long j);

    public abstract Object zzf(int i);

    public int zzg(boolean z) {
        return zzo() ? -1 : 0;
    }

    public int zzh(boolean z) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i, zzcu zzcuVar, zzcw zzcwVar, int i2, boolean z) {
        int i3 = zzd(i, zzcuVar, false).zzd;
        if (zze(i3, zzcwVar, 0L).zzq != i) {
            return i + 1;
        }
        int iZzj = zzj(i3, i2, z);
        if (iZzj == -1) {
            return -1;
        }
        return zze(iZzj, zzcwVar, 0L).zzp;
    }

    public int zzj(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == zzh(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == zzh(z) ? zzg(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public int zzk(int i, int i2, boolean z) {
        if (i == zzg(false)) {
            return -1;
        }
        return i - 1;
    }

    public final Pair zzl(zzcw zzcwVar, zzcu zzcuVar, int i, long j) {
        Pair pairZzm = zzm(zzcwVar, zzcuVar, i, j, 0L);
        Objects.requireNonNull(pairZzm);
        return pairZzm;
    }

    public final Pair zzm(zzcw zzcwVar, zzcu zzcuVar, int i, long j, long j2) {
        zzek.zza(i, 0, zzc());
        zze(i, zzcwVar, j2);
        if (j == -9223372036854775807L) {
            long j3 = zzcwVar.zzn;
            j = 0;
        }
        int i2 = zzcwVar.zzp;
        zzd(i2, zzcuVar, false);
        while (i2 < zzcwVar.zzq) {
            long j4 = zzcuVar.zzf;
            if (j == 0) {
                break;
            }
            int i3 = i2 + 1;
            long j5 = zzd(i3, zzcuVar, false).zzf;
            if (j < 0) {
                break;
            }
            i2 = i3;
        }
        zzd(i2, zzcuVar, true);
        long j6 = zzcuVar.zzf;
        long j7 = zzcuVar.zze;
        if (j7 != -9223372036854775807L) {
            j = Math.min(j, j7 - 1);
        }
        long jMax = Math.max(0L, j);
        Object obj = zzcuVar.zzc;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public zzcu zzn(Object obj, zzcu zzcuVar) {
        return zzd(zza(obj), zzcuVar, true);
    }

    public final boolean zzo() {
        return zzc() == 0;
    }
}
