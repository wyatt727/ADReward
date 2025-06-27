package com.google.android.gms.nearby.messages.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.MessageListener;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final /* synthetic */ class zzao implements zzbb {
    private final ListenerHolder zza;

    zzao(ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzbb
    public final void zza(zzai zzaiVar, ListenerHolder listenerHolder) throws RemoteException {
        ListenerHolder<MessageListener> listenerHolder2 = this.zza;
        int i = zzbg.zza;
        zzaiVar.zzx(listenerHolder, listenerHolder2);
    }
}
