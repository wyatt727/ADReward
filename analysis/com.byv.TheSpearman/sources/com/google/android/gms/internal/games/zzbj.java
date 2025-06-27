package com.google.android.gms.internal.games;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.AnnotatedData;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.LeaderboardsClient;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzbj extends zzac implements LeaderboardsClient {
    public zzbj(Context context, Games.GamesOptions gamesOptions) {
        super(context, gamesOptions);
    }

    public zzbj(Activity activity, Games.GamesOptions gamesOptions) {
        super(activity, gamesOptions);
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final Task<Intent> getAllLeaderboardsIntent() {
        return zza(zzbi.zzev);
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final Task<Intent> getLeaderboardIntent(String str) {
        return getLeaderboardIntent(str, -1);
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final Task<Intent> getLeaderboardIntent(String str, int i) {
        return getLeaderboardIntent(str, i, -1);
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final Task<Intent> getLeaderboardIntent(final String str, final int i, final int i2) {
        return zza(new RemoteCall(str, i, i2) { // from class: com.google.android.gms.internal.games.zzbl
            private final String zzew;
            private final int zzey;
            private final int zzfl;

            {
                this.zzew = str;
                this.zzey = i;
                this.zzfl = i2;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((TaskCompletionSource) obj2).setResult(((com.google.android.gms.games.internal.zzf) obj).zza(this.zzew, this.zzey, this.zzfl));
            }
        });
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final Task<AnnotatedData<LeaderboardBuffer>> loadLeaderboardMetadata(final boolean z) {
        return zza(new RemoteCall(z) { // from class: com.google.android.gms.internal.games.zzbm
            private final boolean zzex;

            {
                this.zzex = z;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zzb((TaskCompletionSource<AnnotatedData<LeaderboardBuffer>>) obj2, this.zzex);
            }
        });
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final Task<AnnotatedData<Leaderboard>> loadLeaderboardMetadata(final String str, final boolean z) {
        return zza(new RemoteCall(str, z) { // from class: com.google.android.gms.internal.games.zzbp
            private final String zzew;
            private final boolean zzfn;

            {
                this.zzew = str;
                this.zzfn = z;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zzb((TaskCompletionSource<AnnotatedData<Leaderboard>>) obj2, this.zzew, this.zzfn);
            }
        });
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final Task<AnnotatedData<LeaderboardScore>> loadCurrentPlayerLeaderboardScore(final String str, final int i, final int i2) {
        return zza(new RemoteCall(str, i, i2) { // from class: com.google.android.gms.internal.games.zzbo
            private final String zzew;
            private final int zzey;
            private final int zzfl;

            {
                this.zzew = str;
                this.zzey = i;
                this.zzfl = i2;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zza((TaskCompletionSource<AnnotatedData<LeaderboardScore>>) obj2, this.zzew, this.zzey, this.zzfl);
            }
        });
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final Task<AnnotatedData<LeaderboardsClient.LeaderboardScores>> loadTopScores(String str, int i, int i2, int i3) {
        return loadTopScores(str, i, i2, i3, false);
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final Task<AnnotatedData<LeaderboardsClient.LeaderboardScores>> loadTopScores(final String str, final int i, final int i2, final int i3, final boolean z) {
        return zza(new RemoteCall(str, i, i2, i3, z) { // from class: com.google.android.gms.internal.games.zzbr
            private final String zzew;
            private final int zzey;
            private final int zzfl;
            private final int zzfo;
            private final boolean zzfp;

            {
                this.zzew = str;
                this.zzey = i;
                this.zzfl = i2;
                this.zzfo = i3;
                this.zzfp = z;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zza((TaskCompletionSource<AnnotatedData<LeaderboardsClient.LeaderboardScores>>) obj2, this.zzew, this.zzey, this.zzfl, this.zzfo, this.zzfp);
            }
        });
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final Task<AnnotatedData<LeaderboardsClient.LeaderboardScores>> loadPlayerCenteredScores(String str, int i, int i2, int i3) {
        return loadPlayerCenteredScores(str, i, i2, i3, false);
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final Task<AnnotatedData<LeaderboardsClient.LeaderboardScores>> loadPlayerCenteredScores(final String str, final int i, final int i2, final int i3, final boolean z) {
        return zza(new RemoteCall(str, i, i2, i3, z) { // from class: com.google.android.gms.internal.games.zzbq
            private final String zzew;
            private final int zzey;
            private final int zzfl;
            private final int zzfo;
            private final boolean zzfp;

            {
                this.zzew = str;
                this.zzey = i;
                this.zzfl = i2;
                this.zzfo = i3;
                this.zzfp = z;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zzb((TaskCompletionSource<AnnotatedData<LeaderboardsClient.LeaderboardScores>>) obj2, this.zzew, this.zzey, this.zzfl, this.zzfo, this.zzfp);
            }
        });
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final Task<AnnotatedData<LeaderboardsClient.LeaderboardScores>> loadMoreScores(final LeaderboardScoreBuffer leaderboardScoreBuffer, final int i, final int i2) {
        return zza(new RemoteCall(leaderboardScoreBuffer, i, i2) { // from class: com.google.android.gms.internal.games.zzbt
            private final int zzey;
            private final int zzfl;
            private final LeaderboardScoreBuffer zzfq;

            {
                this.zzfq = leaderboardScoreBuffer;
                this.zzey = i;
                this.zzfl = i2;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zza((TaskCompletionSource<AnnotatedData<LeaderboardsClient.LeaderboardScores>>) obj2, this.zzfq, this.zzey, this.zzfl);
            }
        });
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final void submitScore(final String str, final long j) {
        zzb(new RemoteCall(str, j) { // from class: com.google.android.gms.internal.games.zzbs
            private final String zzew;
            private final long zzfk;

            {
                this.zzew = str;
                this.zzfk = j;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).submitScore(this.zzew, this.zzfk, null);
            }
        });
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final void submitScore(final String str, final long j, final String str2) {
        zzb(new RemoteCall(str, j, str2) { // from class: com.google.android.gms.internal.games.zzbv
            private final String zzew;
            private final long zzfk;
            private final String zzfm;

            {
                this.zzew = str;
                this.zzfk = j;
                this.zzfm = str2;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).submitScore(this.zzew, this.zzfk, this.zzfm);
            }
        });
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final Task<ScoreSubmissionData> submitScoreImmediate(final String str, final long j) {
        return zzb(new RemoteCall(str, j) { // from class: com.google.android.gms.internal.games.zzbk
            private final String zzew;
            private final long zzfk;

            {
                this.zzew = str;
                this.zzfk = j;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zza((TaskCompletionSource<ScoreSubmissionData>) obj2, this.zzew, this.zzfk, (String) null);
            }
        });
    }

    @Override // com.google.android.gms.games.LeaderboardsClient
    public final Task<ScoreSubmissionData> submitScoreImmediate(final String str, final long j, final String str2) {
        return zzb(new RemoteCall(str, j, str2) { // from class: com.google.android.gms.internal.games.zzbn
            private final String zzew;
            private final long zzfk;
            private final String zzfm;

            {
                this.zzew = str;
                this.zzfk = j;
                this.zzfm = str2;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.games.internal.zzf) obj).zza((TaskCompletionSource<ScoreSubmissionData>) obj2, this.zzew, this.zzfk, this.zzfm);
            }
        });
    }
}
