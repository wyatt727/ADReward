package com.google.android.gms.nearby.messages.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.nearby.messages.Message;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzbk extends zzbt {
    final /* synthetic */ Message zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbk(zzbw zzbwVar, GoogleApiClient googleApiClient, Message message) {
        super(googleApiClient);
        this.zza = message;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzai) anyClient).zzs(zza(), zzae.zza(this.zza));
    }
}
