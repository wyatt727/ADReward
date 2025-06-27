package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzabu {
    private final Handler zza;
    private final zzabv zzb;

    public zzabu(Handler handler, zzabv zzabvVar) {
        this.zza = zzabvVar == null ? null : handler;
        this.zzb = zzabvVar;
    }

    public final void zza(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabk
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzg(str, j, j2);
                }
            });
        }
    }

    public final void zzb(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabt
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzh(str);
                }
            });
        }
    }

    public final void zzc(final zzir zzirVar) {
        zzirVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabs
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi(zzirVar);
                }
            });
        }
    }

    public final void zzd(final int i, final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabm
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj(i, j);
                }
            });
        }
    }

    public final void zze(final zzir zzirVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzk(zzirVar);
                }
            });
        }
    }

    public final void zzf(final zzam zzamVar, final zzis zzisVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabr
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzl(zzamVar, zzisVar);
                }
            });
        }
    }

    final /* synthetic */ void zzg(String str, long j, long j2) {
        int i = zzfx.zza;
        this.zzb.zzp(str, j, j2);
    }

    final /* synthetic */ void zzh(String str) {
        int i = zzfx.zza;
        this.zzb.zzq(str);
    }

    final /* synthetic */ void zzi(zzir zzirVar) {
        zzirVar.zza();
        int i = zzfx.zza;
        this.zzb.zzr(zzirVar);
    }

    final /* synthetic */ void zzj(int i, long j) {
        int i2 = zzfx.zza;
        this.zzb.zzl(i, j);
    }

    final /* synthetic */ void zzk(zzir zzirVar) {
        int i = zzfx.zza;
        this.zzb.zzs(zzirVar);
    }

    final /* synthetic */ void zzl(zzam zzamVar, zzis zzisVar) {
        int i = zzfx.zza;
        this.zzb.zzu(zzamVar, zzisVar);
    }

    final /* synthetic */ void zzm(Object obj, long j) {
        int i = zzfx.zza;
        this.zzb.zzm(obj, j);
    }

    final /* synthetic */ void zzn(long j, int i) {
        int i2 = zzfx.zza;
        this.zzb.zzt(j, i);
    }

    final /* synthetic */ void zzo(Exception exc) {
        int i = zzfx.zza;
        this.zzb.zzo(exc);
    }

    final /* synthetic */ void zzp(zzdp zzdpVar) {
        int i = zzfx.zza;
        this.zzb.zzv(zzdpVar);
    }

    public final void zzq(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabn
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzm(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j, final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabo
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzn(j, i);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabp
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzo(exc);
                }
            });
        }
    }

    public final void zzt(final zzdp zzdpVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzabl
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzp(zzdpVar);
                }
            });
        }
    }
}
