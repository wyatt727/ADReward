package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
abstract class zzdl extends zzdi<Status> {
    /* synthetic */ zzdl(GoogleApiClient googleApiClient, zzcy zzcyVar) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }
}
