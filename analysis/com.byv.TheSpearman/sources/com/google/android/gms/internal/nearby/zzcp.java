package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.nearby.connection.Payload;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzcp extends zzdl {
    final /* synthetic */ List zza;
    final /* synthetic */ Payload zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcp(zzdm zzdmVar, GoogleApiClient googleApiClient, List list, Payload payload) {
        super(googleApiClient, null);
        this.zza = list;
        this.zzb = payload;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws IOException, RemoteException {
        ((zzbf) anyClient).zzA(this, (String[]) this.zza.toArray(new String[0]), this.zzb, false);
    }
}
