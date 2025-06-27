package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
final class zzr extends zzy {
    private final /* synthetic */ boolean zzfa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzr(zzo zzoVar, GoogleApiClient googleApiClient, boolean z) {
        super(googleApiClient, null);
        this.zzfa = z;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((com.google.android.gms.games.internal.zzf) anyClient).zzc(this, this.zzfa);
    }
}
