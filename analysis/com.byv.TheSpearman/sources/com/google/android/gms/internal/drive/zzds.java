package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.List;

/* loaded from: classes3.dex */
final class zzds extends zzav {
    private final /* synthetic */ List zzgb;
    private final /* synthetic */ zzdp zzgq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzds(zzdp zzdpVar, GoogleApiClient googleApiClient, List list) {
        super(googleApiClient);
        this.zzgq = zzdpVar;
        this.zzgb = list;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzeo) ((zzaw) anyClient).getService()).zza(new zzgw(this.zzgq.zzk, this.zzgb), new zzgy(this));
    }
}
