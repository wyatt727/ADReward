package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.connection.DiscoveryOptions;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzdd extends zzdl {
    final /* synthetic */ String zza;
    final /* synthetic */ ListenerHolder zzb;
    final /* synthetic */ DiscoveryOptions zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdd(zzdm zzdmVar, GoogleApiClient googleApiClient, String str, ListenerHolder listenerHolder, DiscoveryOptions discoveryOptions) {
        super(googleApiClient, null);
        this.zza = str;
        this.zzb = listenerHolder;
        this.zzc = discoveryOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzbf) anyClient).zzv(this, this.zza, this.zzb, this.zzc);
    }
}
