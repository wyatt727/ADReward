package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes3.dex */
final class zzcc extends zzcg {
    private final /* synthetic */ zzcb zzfk;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcc(zzcb zzcbVar, GoogleApiClient googleApiClient) {
        super(zzcbVar, googleApiClient);
        this.zzfk = zzcbVar;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzeo) ((zzaw) anyClient).getService()).zzb(new zzce(this.zzfk, this, null));
    }
}
