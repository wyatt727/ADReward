package com.google.android.gms.games.leaderboard;

import android.util.SparseArray;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.games.zzfa;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public final class ScoreSubmissionData {
    private static final String[] zzku = {"leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest", "scoreTag"};
    private int statusCode;
    private String zzba;
    private String zzjs;
    private SparseArray<Result> zzkv = new SparseArray<>();

    public ScoreSubmissionData(DataHolder dataHolder) {
        this.statusCode = dataHolder.getStatusCode();
        int count = dataHolder.getCount();
        Preconditions.checkArgument(count == 3);
        for (int i = 0; i < count; i++) {
            int windowIndex = dataHolder.getWindowIndex(i);
            if (i == 0) {
                this.zzjs = dataHolder.getString("leaderboardId", i, windowIndex);
                this.zzba = dataHolder.getString("playerId", i, windowIndex);
            }
            if (dataHolder.getBoolean("hasResult", i, windowIndex)) {
                this.zzkv.put(dataHolder.getInteger("timeSpan", i, windowIndex), new Result(dataHolder.getLong("rawScore", i, windowIndex), dataHolder.getString("formattedScore", i, windowIndex), dataHolder.getString("scoreTag", i, windowIndex), dataHolder.getBoolean("newBest", i, windowIndex)));
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
    public static final class Result {
        public final String formattedScore;
        public final boolean newBest;
        public final long rawScore;
        public final String scoreTag;

        public Result(long j, String str, String str2, boolean z) {
            this.rawScore = j;
            this.formattedScore = str;
            this.scoreTag = str2;
            this.newBest = z;
        }

        public final String toString() {
            return Objects.toStringHelper(this).add("RawScore", Long.valueOf(this.rawScore)).add("FormattedScore", this.formattedScore).add("ScoreTag", this.scoreTag).add("NewBest", Boolean.valueOf(this.newBest)).toString();
        }
    }

    public final String getLeaderboardId() {
        return this.zzjs;
    }

    public final String getPlayerId() {
        return this.zzba;
    }

    public final Result getScoreResult(int i) {
        return this.zzkv.get(i);
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("PlayerId", this.zzba).add("StatusCode", Integer.valueOf(this.statusCode));
        for (int i = 0; i < 3; i++) {
            Result result = this.zzkv.get(i);
            toStringHelperAdd.add("TimesSpan", zzfa.zzo(i));
            toStringHelperAdd.add("Result", result == null ? AbstractJsonLexerKt.NULL : result.toString());
        }
        return toStringHelperAdd.toString();
    }
}
