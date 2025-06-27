package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.achievement.Achievements;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
abstract class zzaa extends Games.zzb<Achievements.UpdateAchievementResult> {
    private final String zzfb;

    public zzaa(String str, GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.zzfb = str;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public /* synthetic */ Result createFailedResult(Status status) {
        return new zzad(this, status);
    }
}
