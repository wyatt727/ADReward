package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbat implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzbax zzb;

    zzbat(zzbax zzbaxVar, View view) {
        this.zza = view;
        this.zzb = zzbaxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzc(this.zza);
    }
}
