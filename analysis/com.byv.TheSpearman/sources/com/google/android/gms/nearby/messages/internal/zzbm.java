package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.nearby.messages.SubscribeOptions;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzbm extends zzbt {
    final /* synthetic */ PendingIntent zza;
    final /* synthetic */ zzbv zzb;
    final /* synthetic */ SubscribeOptions zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbm(zzbw zzbwVar, GoogleApiClient googleApiClient, PendingIntent pendingIntent, zzbv zzbvVar, SubscribeOptions subscribeOptions) {
        super(googleApiClient);
        this.zza = pendingIntent;
        this.zzb = zzbvVar;
        this.zzc = subscribeOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzai) anyClient).zzw(zza(), this.zza, this.zzb, this.zzc);
    }
}
