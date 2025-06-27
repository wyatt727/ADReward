package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes3.dex */
final class zzcd extends zzci {
    private final /* synthetic */ String zzfr;
    private final /* synthetic */ long zzfx;
    private final /* synthetic */ String zzfy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcd(zzbu zzbuVar, GoogleApiClient googleApiClient, String str, long j, String str2) {
        super(googleApiClient);
        this.zzfr = str;
        this.zzfx = j;
        this.zzfy = str2;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((com.google.android.gms.games.internal.zzf) anyClient).zza(this, this.zzfr, this.zzfx, this.zzfy);
    }
}
