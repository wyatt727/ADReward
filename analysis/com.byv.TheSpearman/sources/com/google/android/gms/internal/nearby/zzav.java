package com.google.android.gms.internal.nearby;

import android.content.Context;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.connection.Connections;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
@Deprecated
/* loaded from: classes3.dex */
final class zzav extends zzdv {
    private final Context zza;
    private final ListenerHolder<Connections.MessageListener> zzb;

    zzav(Context context, ListenerHolder<Connections.MessageListener> listenerHolder) {
        this.zza = (Context) Preconditions.checkNotNull(context);
        this.zzb = (ListenerHolder) Preconditions.checkNotNull(listenerHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzdw
    public final void zzb(zzfm zzfmVar) {
        this.zzb.notifyListener(new zzat(this, zzfmVar));
    }

    @Override // com.google.android.gms.internal.nearby.zzdw
    public final void zzc(zzfe zzfeVar) {
        this.zzb.notifyListener(new zzau(this, zzfeVar));
    }
}
