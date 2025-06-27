package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
abstract class zzao extends Games.zzb<Result> {
    private zzao(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public Result createFailedResult(Status status) {
        return new zzar(this, status);
    }

    /* synthetic */ zzao(GoogleApiClient googleApiClient, zzal zzalVar) {
        this(googleApiClient);
    }
}
