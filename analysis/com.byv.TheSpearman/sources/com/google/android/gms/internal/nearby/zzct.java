package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.Strategy;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzct extends zzdk {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ ListenerHolder zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzct(zzdm zzdmVar, GoogleApiClient googleApiClient, String str, long j, ListenerHolder listenerHolder) {
        super(googleApiClient, null);
        this.zza = str;
        this.zzb = j;
        this.zzc = listenerHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        String str = this.zza;
        long j = this.zzb;
        ListenerHolder listenerHolder = this.zzc;
        AdvertisingOptions.Builder builder = new AdvertisingOptions.Builder();
        builder.setStrategy(Strategy.P2P_CLUSTER);
        AdvertisingOptions advertisingOptionsBuild = builder.build();
        zzeh zzehVar = (zzeh) ((zzbf) anyClient).getService();
        zzgt zzgtVar = new zzgt();
        zzgtVar.zza(new zzbe(this));
        zzgtVar.zzc(str);
        zzgtVar.zzd("__LEGACY_SERVICE_ID__");
        zzgtVar.zze(j);
        zzgtVar.zzb(new zzai(listenerHolder));
        zzgtVar.zzf(advertisingOptionsBuild);
        zzehVar.zzd(zzgtVar.zzi());
    }
}
