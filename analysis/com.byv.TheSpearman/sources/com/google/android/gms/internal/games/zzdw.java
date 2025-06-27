package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.snapshot.Snapshots;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
abstract class zzdw extends Games.zzb<Snapshots.CommitSnapshotResult> {
    private zzdw(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public /* synthetic */ Result createFailedResult(Status status) {
        return new zzdz(this, status);
    }

    /* synthetic */ zzdw(GoogleApiClient googleApiClient, zzdt zzdtVar) {
        this(googleApiClient);
    }
}
