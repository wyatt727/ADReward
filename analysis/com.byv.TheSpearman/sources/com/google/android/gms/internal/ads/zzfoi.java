package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfoi extends zzfoe {
    private WebView zza;
    private Long zzb;
    private final Map zzc;

    public zzfoi(String str, Map map, String str2) {
        super(str);
        this.zzb = null;
        this.zzc = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final void zzc() {
        super.zzc();
        new Handler().postDelayed(new zzfoh(this), Math.max(4000 - (this.zzb == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final void zzi(zzfnc zzfncVar, zzfna zzfnaVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map mapZzi = zzfnaVar.zzi();
        Iterator it = mapZzi.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzj(zzfncVar, zzfnaVar, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final void zzn() {
        WebView webView = new WebView(zzfnv.zzb().zza());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.zza.getSettings().setAllowContentAccess(false);
        this.zza.getSettings().setAllowFileAccess(false);
        this.zza.setWebViewClient(new zzfog(this));
        zzm(this.zza);
        zzfnx.zzj(this.zza, null);
        Iterator it = this.zzc.keySet().iterator();
        if (!it.hasNext()) {
            this.zzb = Long.valueOf(System.nanoTime());
        } else {
            throw null;
        }
    }
}
