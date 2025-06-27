package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.Connections;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzah extends zzaw<Connections.ConnectionRequestListener> {
    final /* synthetic */ zzey zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzah(zzai zzaiVar, zzey zzeyVar) {
        super(null);
        this.zza = zzeyVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((Connections.ConnectionRequestListener) obj).onConnectionRequest(this.zza.zza(), this.zza.zzb(), this.zza.zzc());
    }
}
