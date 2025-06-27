package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public class zzacp {
    protected final zzacj zza;
    protected final zzaco zzb;
    protected zzacl zzc;
    private final int zzd;

    protected zzacp(zzacm zzacmVar, zzaco zzacoVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzacoVar;
        this.zzd = i;
        this.zza = new zzacj(zzacmVar, j, 0L, j3, j4, j5, j6);
    }

    protected static final int zzf(zzadg zzadgVar, long j, zzaec zzaecVar) {
        if (j == zzadgVar.zzf()) {
            return 0;
        }
        zzaecVar.zza = j;
        return 1;
    }

    protected static final boolean zzg(zzadg zzadgVar, long j) throws IOException {
        long jZzf = j - zzadgVar.zzf();
        if (jZzf < 0 || jZzf > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        ((zzact) zzadgVar).zzo((int) jZzf, false);
        return true;
    }

    public final int zza(zzadg zzadgVar, zzaec zzaecVar) throws IOException {
        while (true) {
            zzacl zzaclVar = this.zzc;
            zzek.zzb(zzaclVar);
            long j = zzaclVar.zzf;
            long j2 = zzaclVar.zzg - j;
            int i = this.zzd;
            long j3 = zzaclVar.zzh;
            if (j2 <= i) {
                zzc(false, j);
                return zzf(zzadgVar, j, zzaecVar);
            }
            if (!zzg(zzadgVar, j3)) {
                return zzf(zzadgVar, j3, zzaecVar);
            }
            zzadgVar.zzj();
            zzacn zzacnVarZza = this.zzb.zza(zzadgVar, zzaclVar.zzb);
            int i2 = zzacnVarZza.zzb;
            if (i2 == -3) {
                zzc(false, j3);
                return zzf(zzadgVar, j3, zzaecVar);
            }
            if (i2 == -2) {
                zzacl.zzh(zzaclVar, zzacnVarZza.zzc, zzacnVarZza.zzd);
            } else {
                if (i2 != -1) {
                    zzg(zzadgVar, zzacnVarZza.zzd);
                    zzc(true, zzacnVarZza.zzd);
                    return zzf(zzadgVar, zzacnVarZza.zzd, zzaecVar);
                }
                zzacl.zzg(zzaclVar, zzacnVarZza.zzc, zzacnVarZza.zzd);
            }
        }
    }

    public final zzaef zzb() {
        return this.zza;
    }

    protected final void zzc(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j) {
        zzacl zzaclVar = this.zzc;
        if (zzaclVar == null || zzaclVar.zza != j) {
            zzacj zzacjVar = this.zza;
            this.zzc = new zzacl(j, zzacjVar.zzf(j), 0L, zzacjVar.zzc, zzacjVar.zzd, zzacjVar.zze, zzacjVar.zzf);
        }
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
