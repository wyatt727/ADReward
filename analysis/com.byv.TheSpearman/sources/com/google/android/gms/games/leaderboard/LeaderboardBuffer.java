package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.EntityBuffer;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
public class LeaderboardBuffer extends EntityBuffer<Leaderboard> {
    public LeaderboardBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // com.google.android.gms.common.data.EntityBuffer
    protected String getPrimaryDataMarkerColumn() {
        return "external_leaderboard_id";
    }

    @Override // com.google.android.gms.common.data.EntityBuffer
    protected /* synthetic */ Leaderboard getEntry(int i, int i2) {
        return new LeaderboardRef(this.mDataHolder, i, i2);
    }
}
