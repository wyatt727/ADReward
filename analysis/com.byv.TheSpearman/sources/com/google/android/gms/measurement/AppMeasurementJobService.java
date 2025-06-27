package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzmk;
import com.google.android.gms.measurement.internal.zzmo;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class AppMeasurementJobService extends JobService implements zzmo {
    private zzmk<AppMeasurementJobService> zza;

    private final zzmk<AppMeasurementJobService> zza() {
        if (this.zza == null) {
            this.zza = new zzmk<>(this);
        }
        return this.zza;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzmo
    public final void zza(Intent intent) {
    }

    @Override // android.app.Service
    public final void onCreate() throws IllegalStateException {
        super.onCreate();
        zza().zza();
    }

    @Override // android.app.Service
    public final void onDestroy() throws IllegalStateException {
        zza().zzb();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) throws IllegalStateException {
        zza().zzb(intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzmo
    public final void zza(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // com.google.android.gms.measurement.internal.zzmo
    public final boolean zza(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        return zza().zza(jobParameters);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return zza().zzc(intent);
    }
}
