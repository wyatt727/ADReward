package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzhr implements Runnable {
    private final /* synthetic */ zzja zza;
    private final /* synthetic */ zzhm zzb;

    zzhr(zzhm zzhmVar, zzja zzjaVar) {
        this.zza = zzjaVar;
        this.zzb = zzhmVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        zzhm.zza(this.zzb, this.zza);
        this.zzb.zza(this.zza.zzg);
    }
}
