package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzil implements Runnable {
    private final /* synthetic */ zznt zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ zzhq zzc;

    zzil(zzhq zzhqVar, zznt zzntVar, zzo zzoVar) {
        this.zza = zzntVar;
        this.zzb = zzoVar;
        this.zzc = zzhqVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.zzc.zza.zzr();
        if (this.zza.zza() == null) {
            this.zzc.zza.zza(this.zza.zza, this.zzb);
        } else {
            this.zzc.zza.zza(this.zza, this.zzb);
        }
    }
}
