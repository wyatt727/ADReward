package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.Leaderboards;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
final class zzcj implements Leaderboards.LoadScoresResult {
    private final /* synthetic */ Status zzfc;

    zzcj(zzcg zzcgVar, Status status) {
        this.zzfc = status;
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult
    public final Leaderboard getLeaderboard() {
        return null;
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zzfc;
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult
    public final LeaderboardScoreBuffer getScores() {
        return new LeaderboardScoreBuffer(DataHolder.empty(14));
    }
}
