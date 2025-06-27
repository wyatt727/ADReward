package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzmg implements Runnable {
    private final /* synthetic */ zzmc zza;

    zzmg(zzmc zzmcVar) {
        this.zza = zzmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        zzld.zza(this.zza.zza, new ComponentName(this.zza.zza.zza(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
