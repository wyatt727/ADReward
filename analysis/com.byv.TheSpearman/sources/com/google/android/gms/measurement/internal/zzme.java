package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzme implements Runnable {
    private final /* synthetic */ ComponentName zza;
    private final /* synthetic */ zzmc zzb;

    zzme(zzmc zzmcVar, ComponentName componentName) {
        this.zza = componentName;
        this.zzb = zzmcVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        zzld.zza(this.zzb.zza, this.zza);
    }
}
