package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzql;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzkl implements Runnable {
    private final /* synthetic */ zziq zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zziq zzd;
    private final /* synthetic */ zzjc zze;

    zzkl(zzjc zzjcVar, zziq zziqVar, long j, boolean z, zziq zziqVar2) {
        this.zza = zziqVar;
        this.zzb = j;
        this.zzc = z;
        this.zzd = zziqVar2;
        this.zze = zzjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.zze.zza(this.zza);
        zzjc.zza(this.zze, this.zza, this.zzb, false, this.zzc);
        if (zzql.zza() && this.zze.zze().zza(zzbf.zzbr)) {
            zzjc.zza(this.zze, this.zza, this.zzd);
        }
    }
}
