package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: com.google.android.gms:play-services-measurement-sdk@@22.0.0 */
/* loaded from: classes3.dex */
final class zzj implements Runnable {
    private final /* synthetic */ AppMeasurementDynamiteService.zzb zza;
    private final /* synthetic */ AppMeasurementDynamiteService zzb;

    zzj(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.zzb zzbVar) {
        this.zza = zzbVar;
        this.zzb = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzp().zza(this.zza);
    }
}
