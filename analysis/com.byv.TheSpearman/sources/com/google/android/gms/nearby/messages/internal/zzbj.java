package com.google.android.gms.nearby.messages.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.PublishOptions;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzbj extends zzbt {
    final /* synthetic */ Message zza;
    final /* synthetic */ zzbs zzb;
    final /* synthetic */ PublishOptions zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbj(zzbw zzbwVar, GoogleApiClient googleApiClient, Message message, zzbs zzbsVar, PublishOptions publishOptions) {
        super(googleApiClient);
        this.zza = message;
        this.zzb = zzbsVar;
        this.zzc = publishOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    protected final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzai) anyClient).zzr(zza(), zzae.zza(this.zza), this.zzb, this.zzc);
    }
}
