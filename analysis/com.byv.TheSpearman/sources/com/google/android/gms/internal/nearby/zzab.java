package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.ConnectionResolution;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzab extends zzaw<ConnectionLifecycleCallback> {
    final /* synthetic */ zzfc zza;
    final /* synthetic */ Status zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzab(zzag zzagVar, zzfc zzfcVar, Status status) {
        super(null);
        this.zza = zzfcVar;
        this.zzb = status;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((ConnectionLifecycleCallback) obj).onConnectionResult(this.zza.zza(), new ConnectionResolution(this.zzb));
    }
}
