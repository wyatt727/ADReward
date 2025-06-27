package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.nearby.zzhr;
import com.google.android.gms.nearby.messages.PublishCallback;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzbs extends zzu {
    private static final zzhr<PublishCallback> zza = new zzbr();
    private final ListenerHolder<PublishCallback> zzb;

    public zzbs(ListenerHolder<PublishCallback> listenerHolder) {
        this.zzb = listenerHolder;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzv
    public final void zzd() {
        this.zzb.notifyListener(zza);
    }
}
