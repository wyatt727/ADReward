package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzbc extends zzem {
    private final BaseImplementation.ResultHolder<Status> zza;

    zzbc(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.zza = (BaseImplementation.ResultHolder) Preconditions.checkNotNull(resultHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzen
    public final void zzb(int i) {
        Status statusZzG = zzbf.zzG(i);
        if (statusZzG.isSuccess()) {
            this.zza.setResult(statusZzG);
        } else {
            this.zza.setFailedResult(statusZzG);
        }
    }
}
