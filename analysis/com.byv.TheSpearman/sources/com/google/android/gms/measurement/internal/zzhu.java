package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.0 */
/* loaded from: classes3.dex */
final class zzhu implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ zzhq zzb;

    zzhu(zzhq zzhqVar, zzo zzoVar) {
        this.zza = zzoVar;
        this.zzb = zzhqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzr();
        zzni zzniVar = this.zzb.zza;
        zzo zzoVar = this.zza;
        zzniVar.zzl().zzt();
        zzniVar.zzs();
        Preconditions.checkNotEmpty(zzoVar.zza);
        zzniVar.zza(zzoVar);
    }
}
