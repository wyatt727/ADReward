package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzftg;
import com.google.common.util.concurrent.ListenableFuture;
import com.json.x6;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.my.target.ads.Reward;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
final class zzchj extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcgm {
    public static final /* synthetic */ int zza = 0;
    private zzchm zzA;
    private boolean zzB;
    private boolean zzC;
    private zzbgs zzD;
    private zzbgq zzE;
    private zzbbl zzF;
    private int zzG;
    private int zzH;
    private zzbel zzI;
    private final zzbel zzJ;
    private zzbel zzK;
    private final zzbem zzL;
    private int zzM;
    private com.google.android.gms.ads.internal.overlay.zzm zzN;
    private boolean zzO;
    private final com.google.android.gms.ads.internal.util.zzco zzP;
    private int zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private Map zzU;
    private final WindowManager zzV;
    private final zzbcx zzW;
    private boolean zzX;
    private final zzcid zzb;
    private final zzawo zzc;
    private final zzfgm zzd;
    private final zzbfc zze;
    private final VersionInfoParcel zzf;
    private com.google.android.gms.ads.internal.zzm zzg;
    private final com.google.android.gms.ads.internal.zza zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzffn zzk;
    private zzffq zzl;
    private boolean zzm;
    private boolean zzn;
    private zzcgu zzo;
    private com.google.android.gms.ads.internal.overlay.zzm zzp;
    private zzfmy zzq;
    private zzcie zzr;
    private final String zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private Boolean zzx;
    private boolean zzy;
    private final String zzz;

    protected zzchj(zzcid zzcidVar, zzcie zzcieVar, String str, boolean z, boolean z2, zzawo zzawoVar, zzbfc zzbfcVar, VersionInfoParcel versionInfoParcel, zzbeo zzbeoVar, com.google.android.gms.ads.internal.zzm zzmVar, com.google.android.gms.ads.internal.zza zzaVar, zzbcx zzbcxVar, zzffn zzffnVar, zzffq zzffqVar, zzfgm zzfgmVar) {
        zzffq zzffqVar2;
        super(zzcidVar);
        this.zzm = false;
        this.zzn = false;
        this.zzy = true;
        this.zzz = "";
        this.zzQ = -1;
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzb = zzcidVar;
        this.zzr = zzcieVar;
        this.zzs = str;
        this.zzv = z;
        this.zzc = zzawoVar;
        this.zzd = zzfgmVar;
        this.zze = zzbfcVar;
        this.zzf = versionInfoParcel;
        this.zzg = zzmVar;
        this.zzh = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzV = windowManager;
        com.google.android.gms.ads.internal.zzu.zzp();
        DisplayMetrics displayMetricsZzt = com.google.android.gms.ads.internal.util.zzt.zzt(windowManager);
        this.zzi = displayMetricsZzt;
        this.zzj = displayMetricsZzt.density;
        this.zzW = zzbcxVar;
        this.zzk = zzffnVar;
        this.zzl = zzffqVar;
        this.zzP = new com.google.android.gms.ads.internal.util.zzco(zzcidVar.zza(), this, this, null);
        this.zzX = false;
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlo)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzu.zzp().zzc(zzcidVar, versionInfoParcel.afmaVersion));
        com.google.android.gms.ads.internal.zzu.zzp();
        final Context context = getContext();
        com.google.android.gms.ads.internal.util.zzch.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzftg zzftgVar = zzt.zza;
                String absolutePath = context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = settings;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaK)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return true;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzaX();
        addJavascriptInterface(new zzchq(this, new zzchp(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbf();
        zzbem zzbemVar = new zzbem(new zzbeo(true, "make_wv", this.zzs));
        this.zzL = zzbemVar;
        zzbemVar.zza().zzc(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbQ)).booleanValue() && (zzffqVar2 = this.zzl) != null && zzffqVar2.zzb != null) {
            zzbemVar.zza().zzd("gqi", this.zzl.zzb);
        }
        zzbemVar.zza();
        zzbel zzbelVarZzf = zzbeo.zzf();
        this.zzJ = zzbelVarZzf;
        zzbemVar.zzb("native:view_create", zzbelVarZzf);
        this.zzK = null;
        this.zzI = null;
        com.google.android.gms.ads.internal.util.zzck.zza().zzb(zzcidVar);
        com.google.android.gms.ads.internal.zzu.zzo().zzt();
    }

    private final synchronized void zzaX() {
        zzffn zzffnVar = this.zzk;
        if (zzffnVar != null && zzffnVar.zzan) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Disabling hardware acceleration on an overlay.");
            zzaZ();
            return;
        }
        if (!this.zzv && !this.zzr.zzi()) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Enabling hardware acceleration on an AdView.");
            zzbb();
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zze("Enabling hardware acceleration on an overlay.");
        zzbb();
    }

    private final synchronized void zzaY() {
        if (this.zzO) {
            return;
        }
        this.zzO = true;
        com.google.android.gms.ads.internal.zzu.zzo().zzr();
    }

    private final synchronized void zzaZ() {
        if (!this.zzw) {
            setLayerType(1, null);
        }
        this.zzw = true;
    }

    private final void zzba(boolean z) {
        HashMap map = new HashMap();
        map.put(x6.k, true != z ? "0" : "1");
        zzd("onAdVisibilityChanged", map);
    }

    private final synchronized void zzbb() {
        if (this.zzw) {
            setLayerType(0, null);
        }
        this.zzw = false;
    }

    private final synchronized void zzbc(String str) {
        try {
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkU)).booleanValue();
            final String str2 = AndroidWebViewClient.BLANK_PAGE;
            if (zBooleanValue) {
                com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.zzche
                    public final /* synthetic */ String zzb = AndroidWebViewClient.BLANK_PAGE;

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzaT(this.zzb);
                    }
                });
            } else {
                super.loadUrl(AndroidWebViewClient.BLANK_PAGE);
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "AdWebViewImpl.loadUrlUnsafe");
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzbd() {
        zzbeg.zza(this.zzL.zza(), this.zzJ, "aeh2");
    }

    private final synchronized void zzbe() {
        Map map = this.zzU;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzcey) it.next()).release();
            }
        }
        this.zzU = null;
    }

    private final void zzbf() {
        zzbem zzbemVar = this.zzL;
        if (zzbemVar == null) {
            return;
        }
        zzbeo zzbeoVarZza = zzbemVar.zza();
        zzbee zzbeeVarZzg = com.google.android.gms.ads.internal.zzu.zzo().zzg();
        if (zzbeeVarZzg != null) {
            zzbeeVarZzg.zzf(zzbeoVarZza);
        }
    }

    private final synchronized void zzbg() {
        Boolean boolZzl = com.google.android.gms.ads.internal.zzu.zzo().zzl();
        this.zzx = boolZzl;
        if (boolZzl == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaV(true);
            } catch (IllegalStateException unused) {
                zzaV(false);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcgm
    public final synchronized void destroy() {
        zzbf();
        this.zzP.zza();
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzb();
            this.zzp.zzm();
            this.zzp = null;
        }
        this.zzq = null;
        this.zzo.zzh();
        this.zzF = null;
        this.zzg = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.zzu) {
            return;
        }
        com.google.android.gms.ads.internal.zzu.zzy().zzd(this);
        zzbe();
        this.zzu = true;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkw)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
            zzV();
        } else {
            com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
            com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
            zzbc(AndroidWebViewClient.BLANK_PAGE);
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (zzaB()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkx)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            zzcbr.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchd
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzaR(str, valueCallback);
                }
            });
        }
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzu) {
                    this.zzo.zzh();
                    com.google.android.gms.ads.internal.zzu.zzy().zzd(this);
                    zzbe();
                    zzaY();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcgm
    public final synchronized void loadData(String str, String str2, String str3) {
        if (zzaB()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcgm
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (zzaB()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcgm
    public final synchronized void loadUrl(final String str) {
        if (zzaB()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkU)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchg
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzaS(str);
                    }
                });
            } else {
                super.loadUrl(str);
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "AdWebViewImpl.loadUrl");
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcgu zzcguVar = this.zzo;
        if (zzcguVar != null) {
            zzcguVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzaB()) {
            this.zzP.zzc();
        }
        if (this.zzX) {
            onResume();
            this.zzX = false;
        }
        boolean z = this.zzB;
        zzcgu zzcguVar = this.zzo;
        if (zzcguVar != null && zzcguVar.zzQ()) {
            if (!this.zzC) {
                this.zzo.zza();
                this.zzo.zzb();
                this.zzC = true;
            }
            zzaW();
            z = true;
        }
        zzba(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        zzcgu zzcguVar;
        synchronized (this) {
            if (!zzaB()) {
                this.zzP.zzd();
            }
            super.onDetachedFromWindow();
            if (this.zzC && (zzcguVar = this.zzo) != null && zzcguVar.zzQ() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzo.zza();
                this.zzo.zzb();
                this.zzC = false;
            }
        }
        zzba(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkI)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            com.google.android.gms.ads.internal.zzu.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzT(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (zzaB()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() throws JSONException {
        boolean zZzaW = zzaW();
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzL();
        if (zzmVarZzL == null || !zZzaW) {
            return;
        }
        zzmVarZzL.zzn();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final synchronized void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzchj.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcgm
    public final void onPause() {
        if (zzaB()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Could not pause webview.", e);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzmh)).booleanValue() && WebViewFeature.isFeatureSupported("MUTE_AUDIO")) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Muting webview");
            WebViewCompat.setAudioMuted(this, true);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcgm
    public final void onResume() {
        if (zzaB()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Could not resume webview.", e);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzmh)).booleanValue() && WebViewFeature.isFeatureSupported("MUTE_AUDIO")) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Unmuting webview");
            WebViewCompat.setAudioMuted(this, false);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.zzo.zzQ() || this.zzo.zzO()) {
            zzawo zzawoVar = this.zzc;
            if (zzawoVar != null) {
                zzawoVar.zzd(motionEvent);
            }
            zzbfc zzbfcVar = this.zze;
            if (zzbfcVar != null) {
                zzbfcVar.zzb(motionEvent);
            }
        } else {
            synchronized (this) {
                zzbgs zzbgsVar = this.zzD;
                if (zzbgsVar != null) {
                    zzbgsVar.zzd(motionEvent);
                }
            }
        }
        if (zzaB()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcgm
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcgu) {
            this.zzo = (zzcgu) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaB()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final synchronized void zzA(int i) {
        this.zzM = i;
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzB(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcgm, com.google.android.gms.internal.ads.zzcdn
    public final synchronized void zzC(zzchm zzchmVar) {
        if (this.zzA != null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzA = zzchmVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgm, com.google.android.gms.internal.ads.zzcgd
    public final zzffn zzD() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final Context zzE() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm, com.google.android.gms.internal.ads.zzchz
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final WebViewClient zzH() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm, com.google.android.gms.internal.ads.zzchx
    public final zzawo zzI() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized zzbbl zzJ() {
        return this.zzF;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized zzbgs zzK() {
        return this.zzD;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final /* synthetic */ zzcic zzN() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm, com.google.android.gms.internal.ads.zzchw
    public final synchronized zzcie zzO() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm, com.google.android.gms.internal.ads.zzchn
    public final zzffq zzP() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final zzfgm zzQ() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized zzfmy zzR() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final ListenableFuture zzS() {
        zzbfc zzbfcVar = this.zze;
        return zzbfcVar == null ? zzgee.zzh(null) : zzbfcVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized String zzT() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzU(zzffn zzffnVar, zzffq zzffqVar) {
        this.zzk = zzffnVar;
        this.zzl = zzffqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized void zzV() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzaY();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzchi(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzW() {
        zzbd();
        HashMap map = new HashMap(1);
        map.put("version", this.zzf.afmaVersion);
        zzd("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzX(int i) {
        if (i == 0) {
            zzbem zzbemVar = this.zzL;
            zzbeg.zza(zzbemVar.zza(), this.zzJ, "aebb2");
        }
        zzbd();
        this.zzL.zza();
        this.zzL.zza().zzd("close_type", String.valueOf(i));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i));
        map.put("version", this.zzf.afmaVersion);
        zzd("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzY() {
        if (this.zzI == null) {
            zzbem zzbemVar = this.zzL;
            zzbeg.zza(zzbemVar.zza(), this.zzJ, "aes2");
            this.zzL.zza();
            zzbel zzbelVarZzf = zzbeo.zzf();
            this.zzI = zzbelVarZzf;
            this.zzL.zzb("native:view_show", zzbelVarZzf);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.zzf.afmaVersion);
        zzd("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzZ() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final boolean zzaA(final boolean z, final int i) {
        destroy();
        this.zzW.zzc(new zzbcw() { // from class: com.google.android.gms.internal.ads.zzchf
            @Override // com.google.android.gms.internal.ads.zzbcw
            public final void zza(zzbdg.zzt.zza zzaVar) {
                int i2 = zzchj.zza;
                zzbdg.zzbl.zza zzaVarZzc = zzbdg.zzbl.zzc();
                boolean zZzf = zzaVarZzc.zzf();
                boolean z2 = z;
                if (zZzf != z2) {
                    zzaVarZzc.zzd(z2);
                }
                zzaVarZzc.zze(i);
                zzaVar.zzab(zzaVarZzc.zzbr());
            }
        });
        this.zzW.zzb(zzbcz.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized boolean zzaB() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized boolean zzaC() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final boolean zzaD() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized boolean zzaE() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzaF(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) throws NumberFormatException {
        this.zzo.zzu(zzcVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzaG(String str, String str2, int i) throws NumberFormatException {
        this.zzo.zzv(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzaH(boolean z, int i, boolean z2) throws NumberFormatException {
        this.zzo.zzw(z, i, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzaI(boolean z, int i, String str, String str2, boolean z2) throws NumberFormatException {
        this.zzo.zzy(z, i, str, str2, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzaJ(boolean z, int i, String str, boolean z2, boolean z3) throws NumberFormatException {
        this.zzo.zzz(z, i, str, z2, z3);
    }

    public final zzcgu zzaL() {
        return this.zzo;
    }

    final synchronized Boolean zzaM() {
        return this.zzx;
    }

    protected final synchronized void zzaP(String str, ValueCallback valueCallback) {
        if (zzaB()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    protected final void zzaQ(String str) {
        if (!PlatformVersion.isAtLeastKitKat()) {
            zzaU("javascript:".concat(str));
            return;
        }
        if (zzaM() == null) {
            zzbg();
        }
        if (zzaM().booleanValue()) {
            zzaP(str, null);
        } else {
            zzaU("javascript:".concat(str));
        }
    }

    final /* synthetic */ void zzaR(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    final /* synthetic */ void zzaS(String str) {
        super.loadUrl(str);
    }

    final /* synthetic */ void zzaT(String str) {
        super.loadUrl(AndroidWebViewClient.BLANK_PAGE);
    }

    protected final synchronized void zzaU(String str) {
        if (zzaB()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    final void zzaV(Boolean bool) {
        synchronized (this) {
            this.zzx = bool;
        }
        com.google.android.gms.ads.internal.zzu.zzo().zzx(bool);
    }

    public final boolean zzaW() throws JSONException {
        int i;
        int iZzw;
        if (this.zzo.zzP() || this.zzo.zzQ()) {
            com.google.android.gms.ads.internal.client.zzay.zzb();
            DisplayMetrics displayMetrics = this.zzi;
            int iZzw2 = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics, displayMetrics.widthPixels);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            DisplayMetrics displayMetrics2 = this.zzi;
            int iZzw3 = com.google.android.gms.ads.internal.util.client.zzf.zzw(displayMetrics2, displayMetrics2.heightPixels);
            Activity activityZza = this.zzb.zza();
            if (activityZza == null || activityZza.getWindow() == null) {
                i = iZzw2;
                iZzw = iZzw3;
            } else {
                com.google.android.gms.ads.internal.zzu.zzp();
                int[] iArrZzQ = com.google.android.gms.ads.internal.util.zzt.zzQ(activityZza);
                com.google.android.gms.ads.internal.client.zzay.zzb();
                int iZzw4 = com.google.android.gms.ads.internal.util.client.zzf.zzw(this.zzi, iArrZzQ[0]);
                com.google.android.gms.ads.internal.client.zzay.zzb();
                iZzw = com.google.android.gms.ads.internal.util.client.zzf.zzw(this.zzi, iArrZzQ[1]);
                i = iZzw4;
            }
            int i2 = this.zzR;
            if (i2 != iZzw2 || this.zzQ != iZzw3 || this.zzS != i || this.zzT != iZzw) {
                boolean z = (i2 == iZzw2 && this.zzQ == iZzw3) ? false : true;
                this.zzR = iZzw2;
                this.zzQ = iZzw3;
                this.zzS = i;
                this.zzT = iZzw;
                new zzbts(this, "").zzj(iZzw2, iZzw3, i, iZzw, this.zzi.density, this.zzV.getDefaultDisplay().getRotation());
                return z;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzaa(boolean z) {
        this.zzo.zzi(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzab() {
        this.zzP.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized void zzac(String str, String str2, String str3) {
        String str4;
        if (zzaB()) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        String[] strArr = new String[1];
        String str5 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzP);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", str5);
            jSONObject.put(ServiceProvider.NAMED_SDK, "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Unable to build MRAID_ENV", e);
            str4 = null;
        }
        strArr[0] = str4;
        super.loadDataWithBaseURL(str, zzchv.zza(str2, strArr), "text/html", C.UTF8_NAME, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzad() {
        if (this.zzK == null) {
            this.zzL.zza();
            zzbel zzbelVarZzf = zzbeo.zzf();
            this.zzK = zzbelVarZzf;
            this.zzL.zzb("native:view_load", zzbelVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzae(String str, zzbky zzbkyVar) {
        zzcgu zzcguVar = this.zzo;
        if (zzcguVar != null) {
            zzcguVar.zzA(str, zzbkyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzaf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized void zzag(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzp = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized void zzah(zzcie zzcieVar) {
        this.zzr = zzcieVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized void zzai(zzbbl zzbblVar) {
        this.zzF = zzbblVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized void zzaj(boolean z) {
        this.zzy = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzak() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzal(Context context) {
        this.zzb.setBaseContext(context);
        this.zzP.zze(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized void zzam(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzy(this.zzo.zzP(), z);
        } else {
            this.zzt = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized void zzan(zzbgq zzbgqVar) {
        this.zzE = zzbgqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized void zzao(boolean z) {
        boolean z2 = this.zzv;
        this.zzv = z;
        zzaX();
        if (z != z2) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzQ)).booleanValue() || !this.zzr.zzi()) {
                new zzbts(this, "").zzl(true != z ? Reward.DEFAULT : "expanded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized void zzap(zzbgs zzbgsVar) {
        this.zzD = zzbgsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized void zzaq(zzfmy zzfmyVar) {
        this.zzq = zzfmyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized void zzar(int i) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzp;
        if (zzmVar != null) {
            zzmVar.zzA(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzas(boolean z) {
        this.zzX = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized void zzat(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zzN = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized void zzau(boolean z) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        int i = this.zzG + (true != z ? -1 : 1);
        this.zzG = i;
        if (i > 0 || (zzmVar = this.zzp) == null) {
            return;
        }
        zzmVar.zzE();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000b A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0004, B:6:0x0007, B:8:0x000b), top: B:16:0x0004 }] */
    @Override // com.google.android.gms.internal.ads.zzcgm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzav(boolean r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L7
            r0 = 0
            r1.setBackgroundColor(r0)     // Catch: java.lang.Throwable -> L12
        L7:
            com.google.android.gms.ads.internal.overlay.zzm r0 = r1.zzp     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L10
            r0.zzB(r2)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)
            return
        L10:
            monitor-exit(r1)
            return
        L12:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzchj.zzav(boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzaw(String str, zzbky zzbkyVar) {
        zzcgu zzcguVar = this.zzo;
        if (zzcguVar != null) {
            zzcguVar.zzM(str, zzbkyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final void zzax(String str, Predicate predicate) {
        zzcgu zzcguVar = this.zzo;
        if (zzcguVar != null) {
            zzcguVar.zzN(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized boolean zzay() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm
    public final synchronized boolean zzaz() {
        return this.zzG > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzb(String str, String str2) {
        zzaQ(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.zzbnt
    public final void zzd(String str, Map map) {
        try {
            zze(str, com.google.android.gms.ads.internal.client.zzay.zzb().zzj(map));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgn
    public final void zzdG() {
        zzcgu zzcguVar = this.zzo;
        if (zzcguVar != null) {
            zzcguVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgn
    public final void zzdf() {
        zzcgu zzcguVar = this.zzo;
        if (zzcguVar != null) {
            zzcguVar.zzdf();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzm
    public final synchronized void zzdg() {
        com.google.android.gms.ads.internal.zzm zzmVar = this.zzg;
        if (zzmVar != null) {
            zzmVar.zzdg();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzm
    public final synchronized void zzdh() {
        com.google.android.gms.ads.internal.zzm zzmVar = this.zzg;
        if (zzmVar != null) {
            zzmVar.zzdh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final synchronized String zzdi() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    public final void zzdp(zzazx zzazxVar) {
        synchronized (this) {
            this.zzB = zzazxVar.zzj;
        }
        zzba(zzazxVar.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbnt
    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Dispatching AFMA event: ".concat(sb.toString()));
        zzaQ(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final synchronized int zzf() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm, com.google.android.gms.internal.ads.zzchr, com.google.android.gms.internal.ads.zzcdn
    public final Activity zzi() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcgm, com.google.android.gms.internal.ads.zzcdn
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final zzbel zzk() {
        return this.zzJ;
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcgm, com.google.android.gms.internal.ads.zzcdn
    public final zzbem zzm() {
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm, com.google.android.gms.internal.ads.zzchy, com.google.android.gms.internal.ads.zzcdn
    public final VersionInfoParcel zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final zzcdc zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final synchronized zzcey zzp(String str) {
        Map map = this.zzU;
        if (map == null) {
            return null;
        }
        return (zzcey) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgm, com.google.android.gms.internal.ads.zzcdn
    public final synchronized zzchm zzq() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final synchronized String zzr() {
        zzffq zzffqVar = this.zzl;
        if (zzffqVar == null) {
            return null;
        }
        return zzffqVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcgm, com.google.android.gms.internal.ads.zzcdn
    public final synchronized void zzt(String str, zzcey zzceyVar) {
        if (this.zzU == null) {
            this.zzU = new HashMap();
        }
        this.zzU.put(str, zzceyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzu() {
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzv(boolean z, long j) {
        HashMap map = new HashMap(2);
        map.put("success", true != z ? "0" : "1");
        map.put("duration", Long.toString(j));
        zzd("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final synchronized void zzw() {
        zzbgq zzbgqVar = this.zzE;
        if (zzbgqVar != null) {
            final zzdoy zzdoyVar = (zzdoy) zzbgqVar;
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdow
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdoyVar.zzd();
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzx(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzy(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzz(boolean z) {
        this.zzo.zzD(false);
    }
}
