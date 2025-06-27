package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.connection.PayloadCallback;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzay extends zzaw<PayloadCallback> {
    final /* synthetic */ zzfo zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzay(zzbb zzbbVar, zzfo zzfoVar) {
        super(null);
        this.zza = zzfoVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((PayloadCallback) obj).onPayloadTransferUpdate(this.zza.zza(), this.zza.zzb());
    }
}
