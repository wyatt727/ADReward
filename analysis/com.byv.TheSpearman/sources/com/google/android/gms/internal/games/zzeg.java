package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.stats.Stats;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
abstract class zzeg extends Games.zzb<Stats.LoadPlayerStatsResult> {
    private zzeg(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public /* synthetic */ Result createFailedResult(Status status) {
        return new zzej(this, status);
    }

    /* synthetic */ zzeg(GoogleApiClient googleApiClient, zzeh zzehVar) {
        this(googleApiClient);
    }
}
