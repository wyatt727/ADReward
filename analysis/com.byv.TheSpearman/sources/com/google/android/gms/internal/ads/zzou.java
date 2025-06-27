package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzou {
    final /* synthetic */ zzov zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzvh zze;
    private boolean zzf;
    private boolean zzg;

    public zzou(zzov zzovVar, String str, int i, zzvh zzvhVar) {
        this.zza = zzovVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzvhVar == null ? -1L : zzvhVar.zzd;
        if (zzvhVar == null || !zzvhVar.zzb()) {
            return;
        }
        this.zze = zzvhVar;
    }

    public final void zzg(int i, zzvh zzvhVar) {
        if (this.zzd == -1 && i == this.zzc && zzvhVar != null) {
            zzov zzovVar = this.zza;
            long j = zzvhVar.zzd;
            if (j >= zzovVar.zzl()) {
                this.zzd = j;
            }
        }
    }

    public final boolean zzj(int i, zzvh zzvhVar) {
        if (zzvhVar == null) {
            return i == this.zzc;
        }
        zzvh zzvhVar2 = this.zze;
        return zzvhVar2 == null ? !zzvhVar.zzb() && zzvhVar.zzd == this.zzd : zzvhVar.zzd == zzvhVar2.zzd && zzvhVar.zzb == zzvhVar2.zzb && zzvhVar.zzc == zzvhVar2.zzc;
    }

    public final boolean zzk(zzmq zzmqVar) {
        zzvh zzvhVar = zzmqVar.zzd;
        if (zzvhVar == null) {
            return this.zzc != zzmqVar.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        if (zzvhVar.zzd > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzcx zzcxVar = zzmqVar.zzb;
        int iZza = zzcxVar.zza(zzvhVar.zza);
        int iZza2 = zzcxVar.zza(this.zze.zza);
        zzvh zzvhVar2 = zzmqVar.zzd;
        if (zzvhVar2.zzd < this.zze.zzd || iZza < iZza2) {
            return false;
        }
        if (iZza > iZza2) {
            return true;
        }
        if (!zzvhVar2.zzb()) {
            int i = zzmqVar.zzd.zze;
            return i == -1 || i > this.zze.zzb;
        }
        zzvh zzvhVar3 = zzmqVar.zzd;
        int i2 = zzvhVar3.zzb;
        int i3 = zzvhVar3.zzc;
        zzvh zzvhVar4 = this.zze;
        int i4 = zzvhVar4.zzb;
        if (i2 <= i4) {
            return i2 == i4 && i3 > zzvhVar4.zzc;
        }
        return true;
    }

    public final boolean zzl(zzcx zzcxVar, zzcx zzcxVar2) {
        int i = this.zzc;
        if (i < zzcxVar.zzc()) {
            zzcxVar.zze(i, this.zza.zzc, 0L);
            for (int i2 = this.zza.zzc.zzp; i2 <= this.zza.zzc.zzq; i2++) {
                int iZza = zzcxVar2.zza(zzcxVar.zzf(i2));
                if (iZza != -1) {
                    i = zzcxVar2.zzd(iZza, this.zza.zzd, false).zzd;
                    break;
                }
            }
            i = -1;
        } else if (i >= zzcxVar2.zzc()) {
            i = -1;
        }
        this.zzc = i;
        if (i == -1) {
            return false;
        }
        zzvh zzvhVar = this.zze;
        return zzvhVar == null || zzcxVar2.zza(zzvhVar.zza) != -1;
    }
}
