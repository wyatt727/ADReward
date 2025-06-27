package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzdg extends zzdl {
    final /* synthetic */ String zza;
    final /* synthetic */ ListenerHolder zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdg(zzdm zzdmVar, GoogleApiClient googleApiClient, String str, ListenerHolder listenerHolder) {
        super(googleApiClient, null);
        this.zza = str;
        this.zzb = listenerHolder;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzbf) anyClient).zzy(this, this.zza, this.zzb);
    }
}
