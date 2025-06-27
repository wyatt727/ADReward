package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfnw implements Runnable {
    final /* synthetic */ WebView zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzfnx zzc;

    zzfnw(zzfnx zzfnxVar, WebView webView, String str) {
        this.zza = webView;
        this.zzb = str;
        this.zzc = zzfnxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfnx.zzj(this.zza, this.zzb);
    }
}
