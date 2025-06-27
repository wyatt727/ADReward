package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzac extends zzaw<ConnectionLifecycleCallback> {
    final /* synthetic */ zzfe zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzac(zzag zzagVar, zzfe zzfeVar) {
        super(null);
        this.zza = zzfeVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((ConnectionLifecycleCallback) obj).onDisconnected(this.zza.zza());
    }
}
