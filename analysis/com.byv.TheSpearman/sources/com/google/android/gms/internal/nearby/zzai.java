package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.connection.Connections;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
@Deprecated
/* loaded from: classes3.dex */
final class zzai extends zzds {
    private final ListenerHolder<Connections.ConnectionRequestListener> zza;

    zzai(ListenerHolder<Connections.ConnectionRequestListener> listenerHolder) {
        this.zza = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzdt
    public final void zzb(zzey zzeyVar) {
        this.zza.notifyListener(new zzah(this, zzeyVar));
    }
}
