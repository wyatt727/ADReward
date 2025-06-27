package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzoe;
import com.google.android.gms.internal.measurement.zzql;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzkm implements Runnable {
    private final /* synthetic */ zziq zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ long zzc;
    private final /* synthetic */ boolean zzd;
    private final /* synthetic */ zziq zze;
    private final /* synthetic */ zzjc zzf;

    zzkm(zzjc zzjcVar, zziq zziqVar, long j, long j2, boolean z, zziq zziqVar2) {
        this.zza = zziqVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = z;
        this.zze = zziqVar2;
        this.zzf = zzjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.zzf.zza(this.zza);
        if (!zzoe.zza() || !this.zzf.zze().zza(zzbf.zzde)) {
            this.zzf.zza(this.zzb, false);
        }
        zzjc.zza(this.zzf, this.zza, this.zzc, true, this.zzd);
        if (zzql.zza() && this.zzf.zze().zza(zzbf.zzbr)) {
            zzjc.zza(this.zzf, this.zza, this.zze);
        }
    }
}
