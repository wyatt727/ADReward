package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcgr implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzbzo zza;
    final /* synthetic */ zzcgu zzb;

    zzcgr(zzcgu zzcguVar, zzbzo zzbzoVar) {
        this.zza = zzbzoVar;
        this.zzb = zzcguVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzW(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
