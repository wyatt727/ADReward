package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzke implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ String zzb = null;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ boolean zze;
    private final /* synthetic */ zzjc zzf;

    zzke(zzjc zzjcVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.zza = atomicReference;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z;
        this.zzf = zzjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.zzf.zzu.zzr().zza(this.zza, null, this.zzc, this.zzd, this.zze);
    }
}
