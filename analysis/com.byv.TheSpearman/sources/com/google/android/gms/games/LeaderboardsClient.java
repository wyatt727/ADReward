package com.google.android.gms.games;

import android.content.Intent;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public interface LeaderboardsClient {
    Task<Intent> getAllLeaderboardsIntent();

    Task<Intent> getLeaderboardIntent(String str);

    Task<Intent> getLeaderboardIntent(String str, int i);

    Task<Intent> getLeaderboardIntent(String str, int i, int i2);

    Task<AnnotatedData<LeaderboardScore>> loadCurrentPlayerLeaderboardScore(String str, int i, int i2);

    Task<AnnotatedData<Leaderboard>> loadLeaderboardMetadata(String str, boolean z);

    Task<AnnotatedData<LeaderboardBuffer>> loadLeaderboardMetadata(boolean z);

    Task<AnnotatedData<LeaderboardScores>> loadMoreScores(LeaderboardScoreBuffer leaderboardScoreBuffer, int i, int i2);

    Task<AnnotatedData<LeaderboardScores>> loadPlayerCenteredScores(String str, int i, int i2, int i3);

    Task<AnnotatedData<LeaderboardScores>> loadPlayerCenteredScores(String str, int i, int i2, int i3, boolean z);

    Task<AnnotatedData<LeaderboardScores>> loadTopScores(String str, int i, int i2, int i3);

    Task<AnnotatedData<LeaderboardScores>> loadTopScores(String str, int i, int i2, int i3, boolean z);

    void submitScore(String str, long j);

    void submitScore(String str, long j, String str2);

    Task<ScoreSubmissionData> submitScoreImmediate(String str, long j);

    Task<ScoreSubmissionData> submitScoreImmediate(String str, long j, String str2);

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    public static class LeaderboardScores implements Releasable {
        private final Leaderboard zzay;
        private final LeaderboardScoreBuffer zzaz;

        public LeaderboardScores(Leaderboard leaderboard, LeaderboardScoreBuffer leaderboardScoreBuffer) {
            this.zzay = leaderboard;
            this.zzaz = leaderboardScoreBuffer;
        }

        public Leaderboard getLeaderboard() {
            return this.zzay;
        }

        public LeaderboardScoreBuffer getScores() {
            return this.zzaz;
        }

        @Override // com.google.android.gms.common.api.Releasable
        public void release() {
            LeaderboardScoreBuffer leaderboardScoreBuffer = this.zzaz;
            if (leaderboardScoreBuffer != null) {
                leaderboardScoreBuffer.release();
            }
        }
    }
}
