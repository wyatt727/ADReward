package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
final class zzca extends zzcg {
    private final /* synthetic */ int zzfu;
    private final /* synthetic */ LeaderboardScoreBuffer zzfv;
    private final /* synthetic */ int zzfw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzca(zzbu zzbuVar, GoogleApiClient googleApiClient, LeaderboardScoreBuffer leaderboardScoreBuffer, int i, int i2) {
        super(googleApiClient, null);
        this.zzfv = leaderboardScoreBuffer;
        this.zzfu = i;
        this.zzfw = i2;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((com.google.android.gms.games.internal.zzf) anyClient).zza(this, this.zzfv, this.zzfu, this.zzfw);
    }
}
