package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.auth.account.WorkAccountApi;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* loaded from: classes3.dex */
final class zzj extends BaseImplementation.ApiMethodImpl<WorkAccountApi.AddAccountResult, zzr> {
    private final /* synthetic */ String zzq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzj(zzh zzhVar, Api api, GoogleApiClient googleApiClient, String str) {
        super((Api<?>) api, googleApiClient);
        this.zzq = str;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((com.google.android.gms.auth.account.zzc) ((zzr) anyClient).getService()).zza(new zzk(this), this.zzq);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ Result createFailedResult(Status status) {
        return new zzo(status, null);
    }
}
