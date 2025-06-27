package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.Connections;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzaj extends zzaw<Connections.ConnectionResponseCallback> {
    final /* synthetic */ zzfa zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaj(zzak zzakVar, zzfa zzfaVar) {
        super(null);
        this.zza = zzfaVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((Connections.ConnectionResponseCallback) obj).onConnectionResponse(this.zza.zza(), zzbf.zzG(this.zza.zzb()), this.zza.zzc());
    }
}
