package com.google.android.gms.nearby.messages.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.PublishOptions;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzaj implements zzbb {
    private final zzbg zza;
    private final Message zzb;
    private final zzbd zzc;
    private final PublishOptions zzd;

    zzaj(zzbg zzbgVar, Message message, zzbd zzbdVar, PublishOptions publishOptions) {
        this.zza = zzbgVar;
        this.zzb = message;
        this.zzc = zzbdVar;
        this.zzd = publishOptions;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzbb
    public final void zza(zzai zzaiVar, ListenerHolder listenerHolder) throws RemoteException {
        this.zza.zzf(this.zzb, this.zzc, this.zzd, zzaiVar, listenerHolder);
    }
}
