package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.stats.PlayerStats;
import com.google.android.gms.games.stats.Stats;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
final class zzej implements Stats.LoadPlayerStatsResult {
    private final /* synthetic */ Status zzfc;

    zzej(zzeg zzegVar, Status status) {
        this.zzfc = status;
    }

    @Override // com.google.android.gms.games.stats.Stats.LoadPlayerStatsResult
    public final PlayerStats getPlayerStats() {
        return null;
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zzfc;
    }
}
