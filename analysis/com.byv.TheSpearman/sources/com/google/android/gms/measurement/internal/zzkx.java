package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzkx implements Runnable {
    private final /* synthetic */ Bundle zza;
    private final /* synthetic */ zzkv zzb;
    private final /* synthetic */ zzkv zzc;
    private final /* synthetic */ long zzd;
    private final /* synthetic */ zzky zze;

    zzkx(zzky zzkyVar, Bundle bundle, zzkv zzkvVar, zzkv zzkvVar2, long j) {
        this.zza = bundle;
        this.zzb = zzkvVar;
        this.zzc = zzkvVar2;
        this.zzd = j;
        this.zze = zzkyVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        zzky.zza(this.zze, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
