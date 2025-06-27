package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.internal.zzf;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes2.dex */
final class zzv extends zzf.zzaq<Achievements.LoadAchievementsResult> {
    zzv(BaseImplementation.ResultHolder resultHolder) {
        super(resultHolder);
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzy
    public final void zza(DataHolder dataHolder) {
        setResult(new zzf.zzy(dataHolder));
    }
}
