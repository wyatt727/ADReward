package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzmt {
    protected long zza;
    final /* synthetic */ zzmn zzb;
    private long zzc;
    private final zzat zzd;

    final long zza(long j) {
        long j2 = j - this.zza;
        this.zza = j;
        return j2;
    }

    static /* synthetic */ void zza(zzmt zzmtVar) throws IllegalStateException {
        zzmtVar.zzb.zzt();
        zzmtVar.zza(false, false, zzmtVar.zzb.zzb().elapsedRealtime());
        zzmtVar.zzb.zzc().zza(zzmtVar.zzb.zzb().elapsedRealtime());
    }

    public zzmt(zzmn zzmnVar) {
        this.zzb = zzmnVar;
        this.zzd = new zzmw(this, zzmnVar.zzu);
        long jElapsedRealtime = zzmnVar.zzb().elapsedRealtime();
        this.zzc = jElapsedRealtime;
        this.zza = jElapsedRealtime;
    }

    final void zza() {
        this.zzd.zza();
        this.zzc = 0L;
        this.zza = 0L;
    }

    final void zzb(long j) {
        this.zzd.zza();
    }

    final void zzc(long j) {
        this.zzb.zzt();
        this.zzd.zza();
        this.zzc = j;
        this.zza = j;
    }

    public final boolean zza(boolean z, boolean z2, long j) throws IllegalStateException {
        this.zzb.zzt();
        this.zzb.zzu();
        if (this.zzb.zzu.zzac()) {
            this.zzb.zzk().zzk.zza(this.zzb.zzb().currentTimeMillis());
        }
        long jZza = j - this.zzc;
        if (!z && jZza < 1000) {
            this.zzb.zzj().zzp().zza("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(jZza));
            return false;
        }
        if (!z2) {
            jZza = zza(j);
        }
        this.zzb.zzj().zzp().zza("Recording user engagement, ms", Long.valueOf(jZza));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", jZza);
        zzny.zza(this.zzb.zzn().zza(!this.zzb.zze().zzv()), bundle, true);
        if (!z2) {
            this.zzb.zzm().zzc("auto", "_e", bundle);
        }
        this.zzc = j;
        this.zzd.zza();
        this.zzd.zza(zzbf.zzba.zza(null).longValue());
        return true;
    }
}
