package com.google.android.gms.nearby.messages.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.Message;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzam implements zzbb {
    private final Message zza;

    zzam(Message message) {
        this.zza = message;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzbb
    public final void zza(zzai zzaiVar, ListenerHolder listenerHolder) throws RemoteException {
        Message message = this.zza;
        int i = zzbg.zza;
        zzaiVar.zzs(listenerHolder, zzae.zza(message));
    }
}
