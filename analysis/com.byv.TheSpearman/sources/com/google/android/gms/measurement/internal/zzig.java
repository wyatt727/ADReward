package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzig implements Runnable {
    private final /* synthetic */ zzbd zza;
    private final /* synthetic */ zzo zzb;
    private final /* synthetic */ zzhq zzc;

    zzig(zzhq zzhqVar, zzbd zzbdVar, zzo zzoVar) {
        this.zza = zzbdVar;
        this.zzb = zzoVar;
        this.zzc = zzhqVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.zzc.zzc(this.zzc.zzb(this.zza, this.zzb), this.zzb);
    }
}
