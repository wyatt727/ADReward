package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zznb extends zzat {
    private final /* synthetic */ zznc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zznb(zznc zzncVar, zzio zzioVar) {
        super(zzioVar);
        this.zza = zzncVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzat
    public final void zzb() throws IllegalStateException {
        this.zza.zzu();
        this.zza.zzj().zzp().zza("Starting upload from DelayedRunnable");
        this.zza.zzf.zzw();
    }
}
