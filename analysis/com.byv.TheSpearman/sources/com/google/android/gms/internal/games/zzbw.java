package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
final class zzbw extends zzcc {
    private final /* synthetic */ boolean zzfa;
    private final /* synthetic */ String zzfr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbw(zzbu zzbuVar, GoogleApiClient googleApiClient, String str, boolean z) {
        super(googleApiClient, null);
        this.zzfr = str;
        this.zzfa = z;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((com.google.android.gms.games.internal.zzf) anyClient).zzb(this, this.zzfr, this.zzfa);
    }
}
