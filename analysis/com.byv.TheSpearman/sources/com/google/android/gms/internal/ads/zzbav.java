package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbav implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzban zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzbax zze;

    zzbav(zzbax zzbaxVar, final zzban zzbanVar, final WebView webView, final boolean z) {
        this.zzb = zzbanVar;
        this.zzc = webView;
        this.zzd = z;
        this.zze = zzbaxVar;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzbau
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                this.zza.zze.zzd(zzbanVar, webView, (String) obj, z);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
