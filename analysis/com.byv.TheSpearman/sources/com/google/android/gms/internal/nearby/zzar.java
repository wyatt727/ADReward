package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.Connections;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzar extends zzaw<Connections.EndpointDiscoveryListener> {
    final /* synthetic */ zzfk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzar(zzas zzasVar, zzfk zzfkVar) {
        super(null);
        this.zza = zzfkVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((Connections.EndpointDiscoveryListener) obj).onEndpointLost(this.zza.zza());
    }
}
