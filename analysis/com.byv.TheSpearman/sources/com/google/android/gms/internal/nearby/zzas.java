package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.connection.Connections;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzas extends zzef {
    private final ListenerHolder<Connections.EndpointDiscoveryListener> zza;

    zzas(ListenerHolder<Connections.EndpointDiscoveryListener> listenerHolder) {
        this.zza = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzeg
    public final synchronized void zzb(zzfg zzfgVar) {
    }

    @Override // com.google.android.gms.internal.nearby.zzeg
    public final void zzc(zzfi zzfiVar) {
        this.zza.notifyListener(new zzaq(this, zzfiVar));
    }

    @Override // com.google.android.gms.internal.nearby.zzeg
    public final void zzd(zzfk zzfkVar) {
        this.zza.notifyListener(new zzar(this, zzfkVar));
    }
}
