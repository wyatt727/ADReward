package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.Strategy;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzcu extends zzdl {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ ListenerHolder zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcu(zzdm zzdmVar, GoogleApiClient googleApiClient, String str, long j, ListenerHolder listenerHolder) {
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
        DiscoveryOptions.Builder builder = new DiscoveryOptions.Builder();
        builder.setStrategy(Strategy.P2P_CLUSTER);
        DiscoveryOptions discoveryOptionsBuild = builder.build();
        zzeh zzehVar = (zzeh) ((zzbf) anyClient).getService();
        zzgx zzgxVar = new zzgx();
        zzgxVar.zza(new zzbc(this));
        zzgxVar.zzb(str);
        zzgxVar.zzc(j);
        zzgxVar.zze(new zzas(listenerHolder));
        zzgxVar.zzd(discoveryOptionsBuild);
        zzehVar.zzf(zzgxVar.zzf());
    }
}
