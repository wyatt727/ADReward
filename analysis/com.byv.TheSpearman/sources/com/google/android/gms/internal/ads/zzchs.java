package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public class zzchs extends zzcgu {
    public zzchs(zzcgm zzcgmVar, zzbcx zzbcxVar, boolean z, zzefo zzefoVar) {
        super(zzcgmVar, zzbcxVar, z, new zzbtr(zzcgmVar, zzcgmVar.zzE(), new zzbdi(zzcgmVar.getContext())), null, zzefoVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final WebResourceResponse zzS(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzcgm)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcgm zzcgmVar = (zzcgm) webView;
        zzbzo zzbzoVar = this.zza;
        if (zzbzoVar != null) {
            zzbzoVar.zzd(str, map, 1);
        }
        zzfsk zzfskVar = zzfsk.zza;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzcgmVar.zzN() != null) {
            zzcgmVar.zzN().zzF();
        }
        if (zzcgmVar.zzO().zzi()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzO);
        } else if (zzcgmVar.zzaC()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzN);
        } else {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzM);
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        return com.google.android.gms.ads.internal.util.zzt.zzx(zzcgmVar.getContext(), zzcgmVar.zzn().afmaVersion, str2);
    }
}
