package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.connection.AdvertisingOptions;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzdb extends zzdk {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ ListenerHolder zzc;
    final /* synthetic */ AdvertisingOptions zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdb(zzdm zzdmVar, GoogleApiClient googleApiClient, String str, String str2, ListenerHolder listenerHolder, AdvertisingOptions advertisingOptions) {
        super(googleApiClient, null);
        this.zza = str;
        this.zzb = str2;
        this.zzc = listenerHolder;
        this.zzd = advertisingOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzbf) anyClient).zzt(this, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
