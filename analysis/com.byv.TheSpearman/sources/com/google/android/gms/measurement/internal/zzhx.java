package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzhx implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ zzhq zzb;

    zzhx(zzhq zzhqVar, zzo zzoVar) {
        this.zza = zzoVar;
        this.zzb = zzhqVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.zzb.zza.zzr();
        this.zzb.zza.zzc(this.zza);
    }
}
