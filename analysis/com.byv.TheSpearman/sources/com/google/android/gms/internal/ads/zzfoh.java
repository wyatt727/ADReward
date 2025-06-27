package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfoh implements Runnable {
    final /* synthetic */ zzfoi zza;
    private final WebView zzb;

    zzfoh(zzfoi zzfoiVar) {
        this.zza = zzfoiVar;
        this.zzb = zzfoiVar.zza;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
