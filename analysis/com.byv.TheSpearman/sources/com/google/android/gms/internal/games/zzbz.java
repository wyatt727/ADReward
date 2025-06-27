package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
final class zzbz extends zzce {
    private final /* synthetic */ String zzfr;
    private final /* synthetic */ int zzfs;
    private final /* synthetic */ int zzft;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbz(zzbu zzbuVar, GoogleApiClient googleApiClient, String str, int i, int i2) {
        super(googleApiClient, null);
        this.zzfr = str;
        this.zzfs = i;
        this.zzft = i2;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((com.google.android.gms.games.internal.zzf) anyClient).zza(this, (String) null, this.zzfr, this.zzfs, this.zzft);
    }
}
