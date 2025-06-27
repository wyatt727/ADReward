package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.connection.Connections;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
@Deprecated
/* loaded from: classes3.dex */
final class zzak extends zzeb {
    private final ListenerHolder<Connections.ConnectionResponseCallback> zza;

    public zzak(ListenerHolder<Connections.ConnectionResponseCallback> listenerHolder) {
        this.zza = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzec
    public final void zzb(zzfa zzfaVar) {
        this.zza.notifyListener(new zzaj(this, zzfaVar));
    }
}
