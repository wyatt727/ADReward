package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzly {
    private static final zzvh zzt = new zzvh(new Object(), -1);
    public final zzcx zza;
    public final zzvh zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;
    public final zziz zzf;
    public final boolean zzg;
    public final zzxk zzh;
    public final zzzg zzi;
    public final List zzj;
    public final zzvh zzk;
    public final boolean zzl;
    public final int zzm;
    public final zzcg zzn;
    public final boolean zzo = false;
    public volatile long zzp;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;

    public zzly(zzcx zzcxVar, zzvh zzvhVar, long j, long j2, int i, zziz zzizVar, boolean z, zzxk zzxkVar, zzzg zzzgVar, List list, zzvh zzvhVar2, boolean z2, int i2, zzcg zzcgVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.zza = zzcxVar;
        this.zzb = zzvhVar;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
        this.zzf = zzizVar;
        this.zzg = z;
        this.zzh = zzxkVar;
        this.zzi = zzzgVar;
        this.zzj = list;
        this.zzk = zzvhVar2;
        this.zzl = z2;
        this.zzm = i2;
        this.zzn = zzcgVar;
        this.zzp = j3;
        this.zzq = j4;
        this.zzr = j5;
        this.zzs = j6;
    }

    public static zzly zzg(zzzg zzzgVar) {
        zzcx zzcxVar = zzcx.zza;
        zzvh zzvhVar = zzt;
        return new zzly(zzcxVar, zzvhVar, -9223372036854775807L, 0L, 1, null, false, zzxk.zza, zzzgVar, zzfzn.zzm(), zzvhVar, false, 0, zzcg.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzvh zzh() {
        return zzt;
    }

    public final zzly zza(zzvh zzvhVar) {
        return new zzly(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzvhVar, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final zzly zzb(zzvh zzvhVar, long j, long j2, long j3, long j4, zzxk zzxkVar, zzzg zzzgVar, List list) {
        zzvh zzvhVar2 = this.zzk;
        boolean z = this.zzl;
        int i = this.zzm;
        zzcg zzcgVar = this.zzn;
        long j5 = this.zzp;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new zzly(this.zza, zzvhVar, j2, j3, this.zze, this.zzf, this.zzg, zzxkVar, zzzgVar, list, zzvhVar2, z, i, zzcgVar, j5, j4, j, jElapsedRealtime, false);
    }

    public final zzly zzc(boolean z, int i) {
        return new zzly(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z, i, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final zzly zzd(zziz zzizVar) {
        return new zzly(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzizVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final zzly zze(int i) {
        return new zzly(this.zza, this.zzb, this.zzc, this.zzd, i, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final zzly zzf(zzcx zzcxVar) {
        return new zzly(zzcxVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final boolean zzi() {
        return this.zze == 3 && this.zzl && this.zzm == 0;
    }
}
