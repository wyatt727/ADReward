package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzerm implements zzewr {
    private final zzfcl zza;

    zzerm(zzfcl zzfclVar) {
        this.zza = zzfclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        zzfcl zzfclVar = this.zza;
        zzewq zzewqVar = null;
        if (zzfclVar != null && zzfclVar.zza() != null && !zzfclVar.zza().isEmpty()) {
            zzewqVar = new zzewq() { // from class: com.google.android.gms.internal.ads.zzerl
                @Override // com.google.android.gms.internal.ads.zzewq
                public final void zzj(Object obj) {
                    this.zza.zzc((Bundle) obj);
                }
            };
        }
        return zzgee.zzh(zzewqVar);
    }

    final /* synthetic */ void zzc(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}
