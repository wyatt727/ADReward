package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.achievement.Achievements;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
final class zzad implements Achievements.UpdateAchievementResult {
    private final /* synthetic */ Status zzfc;
    private final /* synthetic */ zzaa zzfd;

    zzad(zzaa zzaaVar, Status status) {
        this.zzfd = zzaaVar;
        this.zzfc = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zzfc;
    }

    @Override // com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult
    public final String getAchievementId() {
        return this.zzfd.zzfb;
    }
}
