package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzaw extends zzbd {
    final /* synthetic */ ListenerHolder zza;
    final /* synthetic */ zzbg zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaw(zzbg zzbgVar, ListenerHolder listenerHolder, ListenerHolder listenerHolder2) {
        super(listenerHolder);
        this.zzb = zzbgVar;
        this.zza = listenerHolder2;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzbd, com.google.android.gms.nearby.messages.internal.zzv
    public final void zzd() {
        ListenerHolder.ListenerKey<?> listenerKey = this.zza.getListenerKey();
        if (listenerKey != null) {
            this.zzb.doUnregisterEventListener(listenerKey);
        }
        super.zzd();
    }
}
