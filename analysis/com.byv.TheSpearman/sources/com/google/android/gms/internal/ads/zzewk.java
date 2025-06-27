package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzewk implements zzewr {
    private final boolean zza;

    zzewk(zzfdi zzfdiVar) {
        this.zza = zzfdiVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return zzgee.zzh(this.zza ? new zzewq() { // from class: com.google.android.gms.internal.ads.zzewj
            @Override // com.google.android.gms.internal.ads.zzewq
            public final void zzj(Object obj) {
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
            }
        } : null);
    }
}
