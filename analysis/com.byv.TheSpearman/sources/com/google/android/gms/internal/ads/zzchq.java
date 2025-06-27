package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzchq {
    private final zzchr zza;
    private final zzchp zzb;

    public zzchq(zzchr zzchrVar, zzchp zzchpVar) {
        this.zzb = zzchpVar;
        this.zza = zzchrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzchr, com.google.android.gms.internal.ads.zzchx] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        ?? r0 = this.zza;
        zzawo zzawoVarZzI = r0.zzI();
        if (zzawoVarZzI == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzawk zzawkVarZzc = zzawoVarZzI.zzc();
        if (zzawkVarZzc == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (r0.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        }
        zzchr zzchrVar = this.zza;
        return zzawkVarZzc.zzf(zzchrVar.getContext(), str, (View) zzchrVar, zzchrVar.zzi());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzchr, com.google.android.gms.internal.ads.zzchx] */
    @JavascriptInterface
    public String getViewSignals() {
        ?? r0 = this.zza;
        zzawo zzawoVarZzI = r0.zzI();
        if (zzawoVarZzI == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzawk zzawkVarZzc = zzawoVarZzI.zzc();
        if (zzawkVarZzc == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (r0.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        }
        zzchr zzchrVar = this.zza;
        return zzawkVarZzc.zzh(zzchrVar.getContext(), (View) zzchrVar, zzchrVar.zzi());
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("URL is empty, ignoring message");
        } else {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcho
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(str);
                }
            });
        }
    }

    final /* synthetic */ void zza(String str) {
        Uri uri = Uri.parse(str);
        zzcgu zzcguVarZzaL = ((zzchj) this.zzb.zza).zzaL();
        if (zzcguVarZzaL == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzcguVarZzaL.zzj(uri);
        }
    }
}
