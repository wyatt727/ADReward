package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzawo;
import com.google.android.gms.internal.ads.zzawp;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzcbr;
import com.google.android.gms.internal.ads.zzdum;
import com.google.android.gms.internal.ads.zzfgm;
import com.google.android.gms.internal.ads.zzfmt;
import com.google.android.gms.internal.ads.zzgep;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes2.dex */
final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final zzawo zzc;
    private final zzfgm zzd;
    private final int zze;
    private final zzdum zzf;
    private final boolean zzg;
    private final zzgep zzh = zzcbr.zze;
    private final zzfmt zzi;

    TaggingLibraryJsInterface(WebView webView, zzawo zzawoVar, zzdum zzdumVar, zzfmt zzfmtVar, zzfgm zzfgmVar) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzawoVar;
        this.zzf = zzdumVar;
        zzbdz.zza(context);
        this.zze = ((Integer) zzba.zzc().zza(zzbdz.zzjw)).intValue();
        this.zzg = ((Boolean) zzba.zzc().zza(zzbdz.zzjx)).booleanValue();
        this.zzi = zzfmtVar;
        this.zzd = zzfgmVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            String strZze = this.zzc.zzc().zze(this.zza, str, this.zzb);
            if (this.zzg) {
                zzh.zzc(this.zzf, null, "csg", new Pair("clat", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strZze;
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception getting click signals. ", e);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public String getClickSignalsWithTimeout(final String str, int i) {
        if (i <= 0) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Invalid timeout for getting click signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) zzcbr.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzas
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.getClickSignals(str);
                }
            }).get(Math.min(i, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception getting click signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzu.zzp();
        String string = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final zzau zzauVar = new zzau(this, string);
        if (((Boolean) zzba.zzc().zza(zzbdz.zzjz)).booleanValue()) {
            this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzat
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzb(bundle, zzauVar);
                }
            });
        } else {
            QueryInfo.generate(this.zza, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzauVar);
        }
        return string;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
            String strZzh = this.zzc.zzc().zzh(this.zza, this.zzb, null);
            if (this.zzg) {
                zzh.zzc(this.zzf, null, "vsg", new Pair("vlat", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strZzh;
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception getting view signals. ", e);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Invalid timeout for getting view signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) zzcbr.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.getViewSignals();
                }
            }).get(Math.min(i, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception getting view signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(final String str) {
        if (!((Boolean) zzba.zzc().zza(zzbdz.zzjB)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzcbr.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzar
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(str);
            }
        });
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) throws JSONException {
        int i;
        int i2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i3 = jSONObject.getInt("x");
            int i4 = jSONObject.getInt("y");
            int i5 = jSONObject.getInt("duration_ms");
            float f = (float) jSONObject.getDouble("force");
            int i6 = jSONObject.getInt("type");
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        i2 = 1;
                    } else if (i6 == 2) {
                        i2 = 2;
                    } else if (i6 != 3) {
                        i = -1;
                    } else {
                        i2 = 3;
                    }
                    this.zzc.zzd(MotionEvent.obtain(0L, i5, i2, i3, i4, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                    return;
                }
                i = 0;
                this.zzc.zzd(MotionEvent.obtain(0L, i5, i2, i3, i4, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
                return;
            } catch (RuntimeException e) {
                e = e;
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
                return;
            } catch (JSONException e2) {
                e = e2;
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
                return;
            }
            i2 = i;
        } catch (RuntimeException | JSONException e3) {
            e = e3;
        }
    }

    final /* synthetic */ void zzb(Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        CookieManager cookieManagerZza = com.google.android.gms.ads.internal.zzu.zzq().zza(this.zza);
        bundle.putBoolean("accept_3p_cookie", cookieManagerZza != null ? cookieManagerZza.acceptThirdPartyCookies(this.zzb) : false);
        QueryInfo.generate(this.zza, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), queryInfoGenerationCallback);
    }

    final /* synthetic */ void zzc(String str) {
        zzfgm zzfgmVar;
        Uri uriZza = Uri.parse(str);
        try {
            uriZza = (!((Boolean) zzba.zzc().zza(zzbdz.zzlF)).booleanValue() || (zzfgmVar = this.zzd) == null) ? this.zzc.zza(uriZza, this.zza, this.zzb, null) : zzfgmVar.zza(uriZza, this.zza, this.zzb, null);
        } catch (zzawp e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzf("Failed to append the click signal to URL: ", e);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "TaggingLibraryJsInterface.recordClick");
        }
        this.zzi.zzc(uriZza.toString(), null);
    }
}
