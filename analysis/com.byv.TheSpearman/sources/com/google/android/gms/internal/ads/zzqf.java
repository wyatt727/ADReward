package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzqf {
    private final Handler zza;
    private final zzqg zzb;

    public zzqf(Handler handler, zzqg zzqgVar) {
        this.zza = zzqgVar == null ? null : handler;
        this.zzb = zzqgVar;
    }

    public final void zza(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpz
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj(exc);
                }
            });
        }
    }

    public final void zzb(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqa
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzk(exc);
                }
            });
        }
    }

    public final void zzc(final zzqh zzqhVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpx
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzl(zzqhVar);
                }
            });
        }
    }

    public final void zzd(final zzqh zzqhVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpy
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzm(zzqhVar);
                }
            });
        }
    }

    public final void zze(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqd
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzn(str, j, j2);
                }
            });
        }
    }

    public final void zzf(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqe
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzo(str);
                }
            });
        }
    }

    public final void zzg(final zzir zzirVar) {
        zzirVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpu
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzp(zzirVar);
                }
            });
        }
    }

    public final void zzh(final zzir zzirVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpt
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzq(zzirVar);
                }
            });
        }
    }

    public final void zzi(final zzam zzamVar, final zzis zzisVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqb
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzr(zzamVar, zzisVar);
                }
            });
        }
    }

    final /* synthetic */ void zzj(Exception exc) {
        int i = zzfx.zza;
        this.zzb.zza(exc);
    }

    final /* synthetic */ void zzk(Exception exc) {
        int i = zzfx.zza;
        this.zzb.zzh(exc);
    }

    final /* synthetic */ void zzl(zzqh zzqhVar) {
        int i = zzfx.zza;
        this.zzb.zzi(zzqhVar);
    }

    final /* synthetic */ void zzm(zzqh zzqhVar) {
        int i = zzfx.zza;
        this.zzb.zzj(zzqhVar);
    }

    final /* synthetic */ void zzn(String str, long j, long j2) {
        int i = zzfx.zza;
        this.zzb.zzb(str, j, j2);
    }

    final /* synthetic */ void zzo(String str) {
        int i = zzfx.zza;
        this.zzb.zzc(str);
    }

    final /* synthetic */ void zzp(zzir zzirVar) {
        zzirVar.zza();
        int i = zzfx.zza;
        this.zzb.zzd(zzirVar);
    }

    final /* synthetic */ void zzq(zzir zzirVar) {
        int i = zzfx.zza;
        this.zzb.zze(zzirVar);
    }

    final /* synthetic */ void zzr(zzam zzamVar, zzis zzisVar) {
        int i = zzfx.zza;
        this.zzb.zzf(zzamVar, zzisVar);
    }

    final /* synthetic */ void zzs(long j) {
        int i = zzfx.zza;
        this.zzb.zzg(j);
    }

    final /* synthetic */ void zzt(boolean z) {
        int i = zzfx.zza;
        this.zzb.zzn(z);
    }

    final /* synthetic */ void zzu(int i, long j, long j2) {
        int i2 = zzfx.zza;
        this.zzb.zzk(i, j, j2);
    }

    public final void zzv(final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpv
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzs(j);
                }
            });
        }
    }

    public final void zzw(final boolean z) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzqc
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzt(z);
                }
            });
        }
    }

    public final void zzx(final int i, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpw
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzu(i, j, j2);
                }
            });
        }
    }
}
