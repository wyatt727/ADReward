package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
final class zzev extends zzeu {
    private final /* synthetic */ int zzgt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzev(zzeq zzeqVar, GoogleApiClient googleApiClient, int i) {
        super(googleApiClient, null);
        this.zzgt = i;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((com.google.android.gms.games.internal.zzf) anyClient).zza(this, this.zzgt);
    }
}
