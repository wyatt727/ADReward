package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzhy implements Runnable {
    private final /* synthetic */ zzae zza;
    private final /* synthetic */ zzhq zzb;

    zzhy(zzhq zzhqVar, zzae zzaeVar) {
        this.zza = zzaeVar;
        this.zzb = zzhqVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.zzb.zza.zzr();
        if (this.zza.zzc.zza() == null) {
            this.zzb.zza.zza(this.zza);
        } else {
            this.zzb.zza.zzb(this.zza);
        }
    }
}
