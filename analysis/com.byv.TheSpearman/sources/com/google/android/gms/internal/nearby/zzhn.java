package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.messages.MessageListener;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzhn extends zzhr<MessageListener> {
    final /* synthetic */ List zza;

    zzhn(zzho zzhoVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(Object obj) {
        zzho.zzb(this.zza, (MessageListener) obj);
    }
}
