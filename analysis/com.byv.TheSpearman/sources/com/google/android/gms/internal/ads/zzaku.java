package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
abstract class zzaku {
    private zzaem zzb;
    private zzadi zzc;
    private zzakp zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzakn zza = new zzakn();
    private zzakr zzj = new zzakr();

    protected abstract long zza(zzfo zzfoVar);

    protected void zzb(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzakr();
            this.zzf = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1L;
        this.zzg = 0L;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected abstract boolean zzc(zzfo zzfoVar, long j, zzakr zzakrVar) throws IOException;

    final int zze(zzadg zzadgVar, zzaec zzaecVar) throws IOException {
        zzek.zzb(this.zzb);
        int i = zzfx.zza;
        int i2 = this.zzh;
        if (i2 == 0) {
            while (this.zza.zze(zzadgVar)) {
                long jZzf = zzadgVar.zzf();
                long j = this.zzf;
                this.zzk = jZzf - j;
                if (zzc(this.zza.zza(), j, this.zzj)) {
                    this.zzf = zzadgVar.zzf();
                } else {
                    zzam zzamVar = this.zzj.zza;
                    this.zzi = zzamVar.zzA;
                    if (!this.zzm) {
                        this.zzb.zzl(zzamVar);
                        this.zzm = true;
                    }
                    zzakp zzakpVar = this.zzj.zzb;
                    if (zzakpVar != null) {
                        this.zzd = zzakpVar;
                    } else if (zzadgVar.zzd() == -1) {
                        this.zzd = new zzakt(null);
                    } else {
                        zzako zzakoVarZzb = this.zza.zzb();
                        this.zzd = new zzaki(this, this.zzf, zzadgVar.zzd(), zzakoVarZzb.zzd + zzakoVarZzb.zze, zzakoVarZzb.zzb, (zzakoVarZzb.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                }
            }
            this.zzh = 3;
            return -1;
        }
        if (i2 == 1) {
            ((zzact) zzadgVar).zzo((int) this.zzf, false);
            this.zzh = 2;
            return 0;
        }
        if (i2 != 2) {
            return -1;
        }
        long jZzd = this.zzd.zzd(zzadgVar);
        if (jZzd >= 0) {
            zzaecVar.zza = jZzd;
            return 1;
        }
        if (jZzd < -1) {
            zzi(-(jZzd + 2));
        }
        if (!this.zzl) {
            zzaef zzaefVarZze = this.zzd.zze();
            zzek.zzb(zzaefVarZze);
            this.zzc.zzO(zzaefVarZze);
            this.zzl = true;
        }
        if (this.zzk <= 0 && !this.zza.zze(zzadgVar)) {
            this.zzh = 3;
            return -1;
        }
        this.zzk = 0L;
        zzfo zzfoVarZza = this.zza.zza();
        long jZza = zza(zzfoVarZza);
        if (jZza >= 0) {
            long j2 = this.zzg;
            if (j2 + jZza >= this.zze) {
                long jZzf2 = zzf(j2);
                zzaek.zzb(this.zzb, zzfoVarZza, zzfoVarZza.zze());
                this.zzb.zzs(jZzf2, 1, zzfoVarZza.zze(), 0, null);
                this.zze = -1L;
            }
        }
        this.zzg += jZza;
        return 0;
    }

    protected final long zzf(long j) {
        return (j * 1000000) / this.zzi;
    }

    protected final long zzg(long j) {
        return (this.zzi * j) / 1000000;
    }

    final void zzh(zzadi zzadiVar, zzaem zzaemVar) {
        this.zzc = zzadiVar;
        this.zzb = zzaemVar;
        zzb(true);
    }

    protected void zzi(long j) {
        this.zzg = j;
    }

    final void zzj(long j, long j2) {
        this.zza.zzc();
        if (j == 0) {
            zzb(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            this.zze = zzg(j2);
            zzakp zzakpVar = this.zzd;
            int i = zzfx.zza;
            zzakpVar.zzg(this.zze);
            this.zzh = 2;
        }
    }
}
