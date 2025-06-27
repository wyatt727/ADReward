package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeuh implements zzewr {
    private final zzffm zza;

    zzeuh(zzffm zzffmVar) {
        this.zza = zzffmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return zzgee.zzh(new zzeui(this.zza));
    }
}
