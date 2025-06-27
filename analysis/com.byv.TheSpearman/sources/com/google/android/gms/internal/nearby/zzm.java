package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* loaded from: classes3.dex */
final class zzm implements OnFailureListener {
    final /* synthetic */ GoogleApi zza;
    final /* synthetic */ ListenerHolder.ListenerKey zzb;
    final /* synthetic */ zzo zzc;

    zzm(zzo zzoVar, GoogleApi googleApi, ListenerHolder.ListenerKey listenerKey) {
        this.zzc = zzoVar;
        this.zza = googleApi;
        this.zzb = listenerKey;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        synchronized (this.zzc) {
            this.zzc.zzf(this.zza, this.zzb);
        }
    }
}
