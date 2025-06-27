package com.google.android.gms.internal.games;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.Leaderboards;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzbu implements Leaderboards {
    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final Intent getAllLeaderboardsIntent(GoogleApiClient googleApiClient) {
        return Games.zza(googleApiClient).zzap();
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final Intent getLeaderboardIntent(GoogleApiClient googleApiClient, String str) {
        return getLeaderboardIntent(googleApiClient, str, -1);
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final Intent getLeaderboardIntent(GoogleApiClient googleApiClient, String str, int i) {
        return getLeaderboardIntent(googleApiClient, str, i, -1);
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final Intent getLeaderboardIntent(GoogleApiClient googleApiClient, String str, int i, int i2) {
        return Games.zza(googleApiClient).zza(str, i, i2);
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult<Leaderboards.LeaderboardMetadataResult> loadLeaderboardMetadata(GoogleApiClient googleApiClient, boolean z) {
        return googleApiClient.enqueue(new zzbx(this, googleApiClient, z));
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult<Leaderboards.LeaderboardMetadataResult> loadLeaderboardMetadata(GoogleApiClient googleApiClient, String str, boolean z) {
        return googleApiClient.enqueue(new zzbw(this, googleApiClient, str, z));
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult<Leaderboards.LoadPlayerScoreResult> loadCurrentPlayerLeaderboardScore(GoogleApiClient googleApiClient, String str, int i, int i2) {
        return googleApiClient.enqueue(new zzbz(this, googleApiClient, str, i, i2));
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult<Leaderboards.LoadScoresResult> loadTopScores(GoogleApiClient googleApiClient, String str, int i, int i2, int i3) {
        return loadTopScores(googleApiClient, str, i, i2, i3, false);
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult<Leaderboards.LoadScoresResult> loadTopScores(GoogleApiClient googleApiClient, String str, int i, int i2, int i3, boolean z) {
        return googleApiClient.enqueue(new zzby(this, googleApiClient, str, i, i2, i3, z));
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult<Leaderboards.LoadScoresResult> loadPlayerCenteredScores(GoogleApiClient googleApiClient, String str, int i, int i2, int i3) {
        return loadPlayerCenteredScores(googleApiClient, str, i, i2, i3, false);
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult<Leaderboards.LoadScoresResult> loadPlayerCenteredScores(GoogleApiClient googleApiClient, String str, int i, int i2, int i3, boolean z) {
        return googleApiClient.enqueue(new zzcb(this, googleApiClient, str, i, i2, i3, z));
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult<Leaderboards.LoadScoresResult> loadMoreScores(GoogleApiClient googleApiClient, LeaderboardScoreBuffer leaderboardScoreBuffer, int i, int i2) {
        return googleApiClient.enqueue(new zzca(this, googleApiClient, leaderboardScoreBuffer, i, i2));
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final void submitScore(GoogleApiClient googleApiClient, String str, long j) {
        submitScore(googleApiClient, str, j, null);
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final void submitScore(GoogleApiClient googleApiClient, String str, long j, String str2) {
        com.google.android.gms.games.internal.zzf zzfVarZza = Games.zza(googleApiClient, false);
        if (zzfVarZza != null) {
            try {
                zzfVarZza.zza((BaseImplementation.ResultHolder<Leaderboards.SubmitScoreResult>) null, str, j, str2);
            } catch (RemoteException unused) {
                com.google.android.gms.games.internal.zzz.w("LeaderboardsImpl", "service died");
            }
        }
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult<Leaderboards.SubmitScoreResult> submitScoreImmediate(GoogleApiClient googleApiClient, String str, long j) {
        return submitScoreImmediate(googleApiClient, str, j, null);
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboards
    public final PendingResult<Leaderboards.SubmitScoreResult> submitScoreImmediate(GoogleApiClient googleApiClient, String str, long j, String str2) {
        return googleApiClient.execute(new zzcd(this, googleApiClient, str, j, str2));
    }
}
