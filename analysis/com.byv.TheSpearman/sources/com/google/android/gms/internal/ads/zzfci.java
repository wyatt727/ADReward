package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfci implements zzfiq {
    private final zzfde zza;

    public zzfci(zzfde zzfdeVar) {
        this.zza = zzfdeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfiq
    public final ListenableFuture zza(zzfir zzfirVar) {
        zzfcj zzfcjVar = (zzfcj) zzfirVar;
        return ((zzfcf) this.zza).zzb(zzfcjVar.zzb, zzfcjVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfiq
    public final void zzb(zzfif zzfifVar) {
        zzfifVar.zza = ((zzfcf) this.zza).zza();
    }
}
