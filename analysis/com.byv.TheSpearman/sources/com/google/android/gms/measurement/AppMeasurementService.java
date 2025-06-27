package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.zzmk;
import com.google.android.gms.measurement.internal.zzmo;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
public final class AppMeasurementService extends Service implements zzmo {
    private zzmk<AppMeasurementService> zza;

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return zza().zza(intent, i, i2);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return zza().zza(intent);
    }

    private final zzmk<AppMeasurementService> zza() {
        if (this.zza == null) {
            this.zza = new zzmk<>(this);
        }
        return this.zza;
    }

    @Override // com.google.android.gms.measurement.internal.zzmo
    public final void zza(Intent intent) {
        AppMeasurementReceiver.completeWakefulIntent(intent);
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
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zzmo
    public final boolean zza(int i) {
        return stopSelfResult(i);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return zza().zzc(intent);
    }
}
