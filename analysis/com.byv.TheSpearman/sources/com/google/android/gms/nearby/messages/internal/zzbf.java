package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.nearby.zzhr;
import com.google.android.gms.nearby.messages.SubscribeCallback;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
class zzbf extends zzaa {
    private static final zzhr<SubscribeCallback> zza = new zzbe();
    private final ListenerHolder<SubscribeCallback> zzb;

    public zzbf(ListenerHolder<SubscribeCallback> listenerHolder) {
        this.zzb = listenerHolder;
    }

    public void zzd() {
        ListenerHolder<SubscribeCallback> listenerHolder = this.zzb;
        if (listenerHolder != null) {
            listenerHolder.notifyListener(zza);
        }
    }
}
