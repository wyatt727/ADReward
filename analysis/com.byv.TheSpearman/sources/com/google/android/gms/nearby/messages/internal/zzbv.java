package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.nearby.zzhr;
import com.google.android.gms.nearby.messages.SubscribeCallback;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzbv extends zzaa {
    private static final zzhr<SubscribeCallback> zza = new zzbu();
    private final ListenerHolder<SubscribeCallback> zzb;

    public zzbv(ListenerHolder<SubscribeCallback> listenerHolder) {
        this.zzb = listenerHolder;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzab
    public final void zzd() {
        this.zzb.notifyListener(zza);
    }
}
