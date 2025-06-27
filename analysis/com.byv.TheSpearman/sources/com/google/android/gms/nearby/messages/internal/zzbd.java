package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.nearby.zzhr;
import com.google.android.gms.nearby.messages.PublishCallback;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
class zzbd extends zzu {
    private static final zzhr<PublishCallback> zza = new zzbc();
    private final ListenerHolder<PublishCallback> zzb;

    public zzbd(ListenerHolder<PublishCallback> listenerHolder) {
        this.zzb = listenerHolder;
    }

    public void zzd() {
        ListenerHolder<PublishCallback> listenerHolder = this.zzb;
        if (listenerHolder != null) {
            listenerHolder.notifyListener(zza);
        }
    }
}
