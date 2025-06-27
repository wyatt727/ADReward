package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.StatusCallback;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
public final class zzht extends com.google.android.gms.nearby.messages.internal.zzx {
    private final ListenerHolder<StatusCallback> zza;

    public zzht(ListenerHolder<StatusCallback> listenerHolder) {
        this.zza = listenerHolder;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzy
    public final void zzd(boolean z) {
        this.zza.notifyListener(new zzhs(this, z));
    }
}
