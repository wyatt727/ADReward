package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.internal.nearby.zzhr;
import com.google.android.gms.nearby.messages.SubscribeCallback;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzbu extends zzhr<SubscribeCallback> {
    zzbu() {
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((SubscribeCallback) obj).onExpired();
    }
}
