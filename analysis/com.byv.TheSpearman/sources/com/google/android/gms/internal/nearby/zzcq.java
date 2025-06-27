package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzcq extends zzdl {
    final /* synthetic */ long zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcq(zzdm zzdmVar, GoogleApiClient googleApiClient, long j) {
        super(googleApiClient, null);
        this.zza = j;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzbf) anyClient).zzB(this, this.zza);
    }
}
