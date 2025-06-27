package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.EndpointDiscoveryCallback;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzal extends zzaw<EndpointDiscoveryCallback> {
    final /* synthetic */ zzfg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzal(zzap zzapVar, zzfg zzfgVar) {
        super(null);
        this.zza = zzfgVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        this.zza.zza();
        this.zza.zzb();
        this.zza.zzc();
    }
}
