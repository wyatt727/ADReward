package com.google.android.gms.nearby.messages.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.SubscribeOptions;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzan implements zzbb {
    private final zzbg zza;
    private final ListenerHolder zzb;
    private final zzbf zzc;
    private final SubscribeOptions zzd;

    zzan(zzbg zzbgVar, ListenerHolder listenerHolder, zzbf zzbfVar, SubscribeOptions subscribeOptions) {
        this.zza = zzbgVar;
        this.zzb = listenerHolder;
        this.zzc = zzbfVar;
        this.zzd = subscribeOptions;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzbb
    public final void zza(zzai zzaiVar, ListenerHolder listenerHolder) throws RemoteException {
        this.zza.zze(this.zzb, this.zzc, this.zzd, zzaiVar, listenerHolder);
    }
}
