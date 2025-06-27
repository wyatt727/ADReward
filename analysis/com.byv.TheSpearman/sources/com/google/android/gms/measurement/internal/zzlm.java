package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.0 */
/* loaded from: classes3.dex */
final class zzlm implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ boolean zzb;
    private final /* synthetic */ zznt zzc;
    private final /* synthetic */ zzld zzd;

    zzlm(zzld zzldVar, zzo zzoVar, boolean z, zznt zzntVar) {
        this.zza = zzoVar;
        this.zzb = z;
        this.zzc = zzntVar;
        this.zzd = zzldVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zzfs zzfsVar = this.zzd.zzb;
        if (zzfsVar == null) {
            this.zzd.zzj().zzg().zza("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zzd.zza(zzfsVar, this.zzb ? null : this.zzc, this.zza);
        this.zzd.zzaq();
    }
}
