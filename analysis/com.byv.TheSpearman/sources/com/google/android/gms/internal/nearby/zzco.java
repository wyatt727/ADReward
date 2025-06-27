package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.nearby.connection.Payload;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzco extends zzdl {
    final /* synthetic */ String zza;
    final /* synthetic */ Payload zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzco(zzdm zzdmVar, GoogleApiClient googleApiClient, String str, Payload payload) {
        super(googleApiClient, null);
        this.zza = str;
        this.zzb = payload;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws IOException, RemoteException {
        ((zzbf) anyClient).zzA(this, new String[]{this.zza}, this.zzb, false);
    }
}
