package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.internal.nearby.zzhr;
import com.google.android.gms.nearby.messages.PublishCallback;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzbr extends zzhr<PublishCallback> {
    zzbr() {
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        ((PublishCallback) obj).onExpired();
    }
}
