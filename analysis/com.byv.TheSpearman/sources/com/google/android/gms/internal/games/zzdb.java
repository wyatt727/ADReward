package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.games.Players;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
final class zzdb extends zzde {
    private final /* synthetic */ boolean zzfa;
    private final /* synthetic */ int zzgd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdb(zzcw zzcwVar, GoogleApiClient googleApiClient, int i, boolean z) {
        super(googleApiClient);
        this.zzgd = i;
        this.zzfa = z;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((com.google.android.gms.games.internal.zzf) anyClient).zza((BaseImplementation.ResultHolder<Players.LoadPlayersResult>) this, this.zzgd, false, this.zzfa);
    }
}
