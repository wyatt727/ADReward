package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.MediaPeriodQueue;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzli {
    public final zzvf zza;
    public final Object zzb;
    public boolean zzd;
    public boolean zze;
    public zzlj zzf;
    public boolean zzg;
    private final zzmh[] zzi;
    private final zzzf zzj;
    private final zzlx zzk;
    private zzli zzl;
    private zzzg zzn;
    private long zzo;
    private zzxk zzm = zzxk.zza;
    public final zzwy[] zzc = new zzwy[2];
    private final boolean[] zzh = new boolean[2];

    public zzli(zzmh[] zzmhVarArr, long j, zzzf zzzfVar, zzzo zzzoVar, zzlx zzlxVar, zzlj zzljVar, zzzg zzzgVar) {
        this.zzi = zzmhVarArr;
        this.zzo = j;
        this.zzj = zzzfVar;
        this.zzk = zzlxVar;
        this.zzb = zzljVar.zza.zza;
        this.zzf = zzljVar;
        this.zzn = zzzgVar;
        zzvh zzvhVar = zzljVar.zza;
        long j2 = zzljVar.zzb;
        long j3 = zzljVar.zzd;
        zzvf zzvfVarZzp = zzlxVar.zzp(zzvhVar, zzzoVar, j2);
        this.zza = j3 != -9223372036854775807L ? new zzul(zzvfVarZzp, true, 0L, j3) : zzvfVarZzp;
    }

    private final void zzs() {
        if (!zzu()) {
            return;
        }
        int i = 0;
        while (true) {
            zzzg zzzgVar = this.zzn;
            if (i >= zzzgVar.zza) {
                return;
            }
            zzzgVar.zzb(i);
            zzyz zzyzVar = this.zzn.zzc[i];
            i++;
        }
    }

    private final void zzt() {
        if (!zzu()) {
            return;
        }
        int i = 0;
        while (true) {
            zzzg zzzgVar = this.zzn;
            if (i >= zzzgVar.zza) {
                return;
            }
            zzzgVar.zzb(i);
            zzyz zzyzVar = this.zzn.zzc[i];
            i++;
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }

    public final long zza(zzzg zzzgVar, long j, boolean z) {
        return zzb(zzzgVar, j, false, new boolean[2]);
    }

    public final long zzb(zzzg zzzgVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzzgVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z || !zzzgVar.zza(this.zzn, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzmh[] zzmhVarArr = this.zzi;
            if (i2 >= 2) {
                break;
            }
            zzmhVarArr[i2].zzb();
            i2++;
        }
        zzs();
        this.zzn = zzzgVar;
        zzt();
        long jZzf = this.zza.zzf(zzzgVar.zzc, this.zzh, this.zzc, zArr, j);
        int i3 = 0;
        while (true) {
            zzmh[] zzmhVarArr2 = this.zzi;
            if (i3 >= 2) {
                break;
            }
            zzmhVarArr2[i3].zzb();
            i3++;
        }
        this.zze = false;
        int i4 = 0;
        while (true) {
            zzwy[] zzwyVarArr = this.zzc;
            if (i4 >= 2) {
                return jZzf;
            }
            if (zzwyVarArr[i4] != null) {
                zzek.zzf(zzzgVar.zzb(i4));
                this.zzi[i4].zzb();
                this.zze = true;
            } else {
                zzek.zzf(zzzgVar.zzc[i4] == null);
            }
            i4++;
        }
    }

    public final long zzc() {
        if (!this.zzd) {
            return this.zzf.zzb;
        }
        long jZzb = this.zze ? this.zza.zzb() : Long.MIN_VALUE;
        return jZzb == Long.MIN_VALUE ? this.zzf.zze : jZzb;
    }

    public final long zzd() {
        if (this.zzd) {
            return this.zza.zzc();
        }
        return 0L;
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        return this.zzf.zzb + this.zzo;
    }

    public final zzli zzg() {
        return this.zzl;
    }

    public final zzxk zzh() {
        return this.zzm;
    }

    public final zzzg zzi() {
        return this.zzn;
    }

    public final zzzg zzj(float f, zzcx zzcxVar) throws zziz {
        zzzg zzzgVarZzp = this.zzj.zzp(this.zzi, this.zzm, this.zzf.zza, zzcxVar);
        for (zzyz zzyzVar : zzzgVarZzp.zzc) {
        }
        return zzzgVarZzp;
    }

    public final void zzk(long j, float f, long j2) {
        zzek.zzf(zzu());
        long j3 = j - this.zzo;
        zzle zzleVar = new zzle();
        zzleVar.zze(j3);
        zzleVar.zzf(f);
        zzleVar.zzd(j2);
        this.zza.zzo(new zzlg(zzleVar, null));
    }

    public final void zzl(float f, zzcx zzcxVar) throws zziz {
        this.zzd = true;
        this.zzm = this.zza.zzh();
        zzzg zzzgVarZzj = zzj(f, zzcxVar);
        zzlj zzljVar = this.zzf;
        long jMax = zzljVar.zzb;
        long j = zzljVar.zze;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jZza = zza(zzzgVarZzj, jMax, false);
        long j2 = this.zzo;
        zzlj zzljVar2 = this.zzf;
        this.zzo = j2 + (zzljVar2.zzb - jZza);
        this.zzf = zzljVar2.zzb(jZza);
    }

    public final void zzm(long j) {
        zzek.zzf(zzu());
        if (this.zzd) {
            this.zza.zzm(j - this.zzo);
        }
    }

    public final void zzn() {
        zzs();
        zzvf zzvfVar = this.zza;
        try {
            boolean z = zzvfVar instanceof zzul;
            zzlx zzlxVar = this.zzk;
            if (z) {
                zzlxVar.zzi(((zzul) zzvfVar).zza);
            } else {
                zzlxVar.zzi(zzvfVar);
            }
        } catch (RuntimeException e) {
            zzfe.zzd("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzo(zzli zzliVar) {
        if (zzliVar == this.zzl) {
            return;
        }
        zzs();
        this.zzl = zzliVar;
        zzt();
    }

    public final void zzp(long j) {
        this.zzo = MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US;
    }

    public final void zzq() {
        zzvf zzvfVar = this.zza;
        if (zzvfVar instanceof zzul) {
            long j = this.zzf.zzd;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((zzul) zzvfVar).zzn(0L, j);
        }
    }

    public final boolean zzr() {
        return this.zzd && (!this.zze || this.zza.zzb() == Long.MIN_VALUE);
    }
}
