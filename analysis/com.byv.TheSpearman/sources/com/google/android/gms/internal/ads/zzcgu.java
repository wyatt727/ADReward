package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public class zzcgu extends WebViewClient implements zzcic {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private int zzB;
    private boolean zzC;
    private final zzefo zzE;
    private View.OnAttachStateChangeListener zzF;
    protected zzbzo zza;
    private final zzcgm zzc;
    private final zzbcx zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzp zzh;
    private zzcia zzi;
    private zzcib zzj;
    private zzbjo zzk;
    private zzbjq zzl;
    private zzdgn zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private com.google.android.gms.ads.internal.overlay.zzaa zzv;
    private zzbtr zzw;
    private com.google.android.gms.ads.internal.zzb zzx;
    private boolean zzz;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbtm zzy = null;
    private final HashSet zzD = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfG)).split(",")));

    public zzcgu(zzcgm zzcgmVar, zzbcx zzbcxVar, boolean z, zzbtr zzbtrVar, zzbtm zzbtmVar, zzefo zzefoVar) {
        this.zzd = zzbcxVar;
        this.zzc = zzcgmVar;
        this.zzs = z;
        this.zzw = zzbtrVar;
        this.zzE = zzefoVar;
    }

    private static WebResourceResponse zzS() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaJ)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ef, code lost:
    
        com.google.android.gms.ads.internal.zzu.zzp();
        com.google.android.gms.ads.internal.zzu.zzp();
        r14 = r3.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fd, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0101, code lost:
    
        if (android.text.TextUtils.isEmpty(r14) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0103, code lost:
    
        r6 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0105, code lost:
    
        r6 = r14.split(";")[0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0110, code lost:
    
        com.google.android.gms.ads.internal.zzu.zzp();
        r14 = r3.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011b, code lost:
    
        if (android.text.TextUtils.isEmpty(r14) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011d, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011f, code lost:
    
        r14 = r14.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0124, code lost:
    
        if (r14.length != 1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0127, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0129, code lost:
    
        if (r0 >= r14.length) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0137, code lost:
    
        if (r14[r0].trim().startsWith(com.json.m4.L) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0139, code lost:
    
        r1 = r14[r0].trim().split(com.ironsource.t2.i.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0146, code lost:
    
        if (r1.length <= 1) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0148, code lost:
    
        r4 = r1[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x014f, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0152, code lost:
    
        r14 = r3.getHeaderFields();
        r10 = new java.util.HashMap(r14.size());
        r14 = r14.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x016b, code lost:
    
        if (r14.hasNext() == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x016d, code lost:
    
        r0 = r14.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0177, code lost:
    
        if (r0.getKey() == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x017d, code lost:
    
        if (r0.getValue() == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0189, code lost:
    
        if (r0.getValue().isEmpty() != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x018b, code lost:
    
        r10.put(r0.getKey(), r0.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a1, code lost:
    
        r5 = com.google.android.gms.ads.internal.zzu.zzq().zzb(r6, r7, r3.getResponseCode(), r3.getResponseMessage(), r10, r3.getInputStream());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.webkit.WebResourceResponse zzT(java.lang.String r13, java.util.Map r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgu.zzT(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzU(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                com.google.android.gms.ads.internal.util.zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbky) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzV() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzF;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzW(final View view, final zzbzo zzbzoVar, final int i) {
        if (!zzbzoVar.zzi() || i <= 0) {
            return;
        }
        zzbzoVar.zzg(view);
        if (zzbzoVar.zzi()) {
            com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgn
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzp(view, zzbzoVar, i);
                }
            }, 100L);
        }
    }

    private static final boolean zzX(zzcgm zzcgmVar) {
        if (zzcgmVar.zzD() != null) {
            return zzcgmVar.zzD().zzaj;
        }
        return false;
    }

    private static final boolean zzY(boolean z, zzcgm zzcgmVar) {
        return (!z || zzcgmVar.zzO().zzi() || zzcgmVar.zzT().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzj(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            if (this.zzc.zzaB()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                this.zzc.zzV();
                return;
            }
            this.zzz = true;
            zzcib zzcibVar = this.zzj;
            if (zzcibVar != null) {
                zzcibVar.zza();
                this.zzj = null;
            }
            zzg();
            if (this.zzc.zzL() != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlA)).booleanValue()) {
                    this.zzc.zzL().zzG(str);
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zzo = true;
        this.zzp = i;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.zzaA(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) throws NumberFormatException {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriZza = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriZza.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriZza.getHost())) {
            zzj(uriZza);
        } else {
            if (this.zzn && webView == this.zzc.zzG()) {
                String scheme = uriZza.getScheme();
                if (ProxyConfig.MATCH_HTTP.equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzbzo zzbzoVar = this.zza;
                        if (zzbzoVar != null) {
                            zzbzoVar.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzdgn zzdgnVar = this.zzm;
                    if (zzdgnVar != null) {
                        zzdgnVar.zzdG();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.zzc.zzG().willNotDraw()) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzawo zzawoVarZzI = this.zzc.zzI();
                    zzfgm zzfgmVarZzQ = this.zzc.zzQ();
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlF)).booleanValue() || zzfgmVarZzQ == null) {
                        if (zzawoVarZzI != null && zzawoVarZzI.zzf(uriZza)) {
                            Context context = this.zzc.getContext();
                            zzcgm zzcgmVar = this.zzc;
                            uriZza = zzawoVarZzI.zza(uriZza, context, (View) zzcgmVar, zzcgmVar.zzi());
                        }
                    } else if (zzawoVarZzI != null && zzawoVarZzI.zzf(uriZza)) {
                        Context context2 = this.zzc.getContext();
                        zzcgm zzcgmVar2 = this.zzc;
                        uriZza = zzfgmVarZzQ.zza(uriZza, context2, (View) zzcgmVar2, zzcgmVar2.zzi());
                    }
                } catch (zzawp unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzx;
                if (zzbVar == null || zzbVar.zzc()) {
                    zzu(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", uriZza.toString(), null, null, null, null, null, null), true);
                } else {
                    zzbVar.zzb(str);
                }
            }
        }
        return true;
    }

    public final void zzA(String str, zzbky zzbkyVar) {
        synchronized (this.zzf) {
            List copyOnWriteArrayList = (List) this.zze.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList();
                this.zze.put(str, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(zzbkyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzB(zzcia zzciaVar) {
        this.zzi = zzciaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzC(int i, int i2) {
        zzbtm zzbtmVar = this.zzy;
        if (zzbtmVar != null) {
            zzbtmVar.zze(i, i2);
        }
    }

    public final void zzD(boolean z) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzE(boolean z) {
        synchronized (this.zzf) {
            this.zzu = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzF() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcbr.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgo
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    this.zza.zzn();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzG(boolean z) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzH(zzcib zzcibVar) {
        this.zzj = zzcibVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzI(zzcpk zzcpkVar, zzefd zzefdVar, zzfmt zzfmtVar) {
        zzL("/click");
        if (zzefdVar == null || zzfmtVar == null) {
            zzA("/click", new zzbjw(this.zzm, zzcpkVar));
        } else {
            zzA("/click", new zzfgq(this.zzm, zzcpkVar, zzfmtVar, zzefdVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzJ(zzcpk zzcpkVar) {
        zzL("/click");
        zzA("/click", new zzbjw(this.zzm, zzcpkVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzK(zzcpk zzcpkVar, zzefd zzefdVar, zzduh zzduhVar) {
        zzL("/open");
        zzA("/open", new zzblk(this.zzx, this.zzy, zzefdVar, zzduhVar, zzcpkVar));
    }

    public final void zzL(String str) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.clear();
        }
    }

    public final void zzM(String str, zzbky zzbkyVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbkyVar);
        }
    }

    public final void zzN(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzbky> list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzbky zzbkyVar : list) {
                if (predicate.apply(zzbkyVar)) {
                    arrayList.add(zzbkyVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final boolean zzO() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzu;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final boolean zzP() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzs;
        }
        return z;
    }

    public final boolean zzQ() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzt;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzR(com.google.android.gms.ads.internal.client.zza zzaVar, zzbjo zzbjoVar, com.google.android.gms.ads.internal.overlay.zzp zzpVar, zzbjq zzbjqVar, com.google.android.gms.ads.internal.overlay.zzaa zzaaVar, boolean z, zzblb zzblbVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbtt zzbttVar, zzbzo zzbzoVar, final zzefd zzefdVar, final zzfmt zzfmtVar, zzduh zzduhVar, zzbls zzblsVar, zzdgn zzdgnVar, zzblr zzblrVar, zzbll zzbllVar, zzbkz zzbkzVar, zzcpk zzcpkVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zzc.getContext(), zzbzoVar, null) : zzbVar;
        this.zzy = new zzbtm(this.zzc, zzbttVar);
        this.zza = zzbzoVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzaR)).booleanValue()) {
            zzA("/adMetadata", new zzbjn(zzbjoVar));
        }
        if (zzbjqVar != null) {
            zzA("/appEvent", new zzbjp(zzbjqVar));
        }
        zzA("/backButton", zzbkx.zzj);
        zzA("/refresh", zzbkx.zzk);
        zzA("/canOpenApp", zzbkx.zzb);
        zzA("/canOpenURLs", zzbkx.zza);
        zzA("/canOpenIntents", zzbkx.zzc);
        zzA("/close", zzbkx.zzd);
        zzA("/customClose", zzbkx.zze);
        zzA("/instrument", zzbkx.zzn);
        zzA("/delayPageLoaded", zzbkx.zzp);
        zzA("/delayPageClosed", zzbkx.zzq);
        zzA("/getLocationInfo", zzbkx.zzr);
        zzA("/log", zzbkx.zzg);
        zzA("/mraid", new zzblf(zzbVar2, this.zzy, zzbttVar));
        zzbtr zzbtrVar = this.zzw;
        if (zzbtrVar != null) {
            zzA("/mraidLoaded", zzbtrVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzA("/open", new zzblk(zzbVar2, this.zzy, zzefdVar, zzduhVar, zzcpkVar));
        zzA("/precache", new zzcez());
        zzA("/touch", zzbkx.zzi);
        zzA("/video", zzbkx.zzl);
        zzA("/videoMeta", zzbkx.zzm);
        if (zzefdVar == null || zzfmtVar == null) {
            zzA("/click", new zzbjw(zzdgnVar, zzcpkVar));
            zzA("/httpTrack", zzbkx.zzf);
        } else {
            zzA("/click", new zzfgq(zzdgnVar, zzcpkVar, zzfmtVar, zzefdVar));
            zzA("/httpTrack", new zzbky() { // from class: com.google.android.gms.internal.ads.zzfgr
                @Override // com.google.android.gms.internal.ads.zzbky
                public final void zza(Object obj, Map map) {
                    zzcgd zzcgdVar = (zzcgd) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("URL missing from httpTrack GMSG.");
                    } else if (zzcgdVar.zzD().zzaj) {
                        zzefdVar.zzd(new zzeff(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis(), ((zzchn) zzcgdVar).zzP().zzb, str, 2));
                    } else {
                        zzfmtVar.zzc(str, null);
                    }
                }
            });
        }
        if (com.google.android.gms.ads.internal.zzu.zzn().zzp(this.zzc.getContext())) {
            zzA("/logScionEvent", new zzble(this.zzc.getContext()));
        }
        if (zzblbVar != null) {
            zzA("/setInterstitialProperties", new zzbla(zzblbVar));
        }
        if (zzblsVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zziO)).booleanValue()) {
                zzA("/inspectorNetworkExtras", zzblsVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjh)).booleanValue() && zzblrVar != null) {
            zzA("/shareSheet", zzblrVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjm)).booleanValue() && zzbllVar != null) {
            zzA("/inspectorOutOfContextTest", zzbllVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzjq)).booleanValue() && zzbkzVar != null) {
            zzA("/inspectorStorage", zzbkzVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzli)).booleanValue()) {
            zzA("/bindPlayStoreOverlay", zzbkx.zzu);
            zzA("/presentPlayStoreOverlay", zzbkx.zzv);
            zzA("/expandPlayStoreOverlay", zzbkx.zzw);
            zzA("/collapsePlayStoreOverlay", zzbkx.zzx);
            zzA("/closePlayStoreOverlay", zzbkx.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzdd)).booleanValue()) {
            zzA("/setPAIDPersonalizationEnabled", zzbkx.zzA);
            zzA("/resetPAID", zzbkx.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzlz)).booleanValue()) {
            zzcgm zzcgmVar = this.zzc;
            if (zzcgmVar.zzD() != null && zzcgmVar.zzD().zzar) {
                zzA("/writeToLocalStorage", zzbkx.zzB);
                zzA("/clearLocalStorageKeys", zzbkx.zzC);
            }
        }
        this.zzg = zzaVar;
        this.zzh = zzpVar;
        this.zzk = zzbjoVar;
        this.zzl = zzbjqVar;
        this.zzv = zzaaVar;
        this.zzx = zzbVar3;
        this.zzm = zzdgnVar;
        this.zzn = z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0242 A[Catch: NoClassDefFoundError -> 0x026c, Exception | NoClassDefFoundError -> 0x026e, TryCatch #9 {Exception | NoClassDefFoundError -> 0x026e, blocks: (B:3:0x000a, B:5:0x001c, B:7:0x0023, B:9:0x002f, B:11:0x004c, B:13:0x0065, B:15:0x007c, B:16:0x007f, B:18:0x0082, B:21:0x009c, B:23:0x00b4, B:25:0x00cd, B:46:0x016e, B:47:0x0194, B:67:0x0242, B:55:0x01ca, B:56:0x01f3, B:53:0x01a0, B:34:0x012a, B:24:0x00c1, B:57:0x01f4, B:59:0x01fe, B:61:0x0204, B:63:0x0236, B:69:0x0251, B:71:0x0257, B:73:0x0265), top: B:89:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0257 A[Catch: NoClassDefFoundError -> 0x026c, Exception | NoClassDefFoundError -> 0x026e, TryCatch #9 {Exception | NoClassDefFoundError -> 0x026e, blocks: (B:3:0x000a, B:5:0x001c, B:7:0x0023, B:9:0x002f, B:11:0x004c, B:13:0x0065, B:15:0x007c, B:16:0x007f, B:18:0x0082, B:21:0x009c, B:23:0x00b4, B:25:0x00cd, B:46:0x016e, B:47:0x0194, B:67:0x0242, B:55:0x01ca, B:56:0x01f3, B:53:0x01a0, B:34:0x012a, B:24:0x00c1, B:57:0x01f4, B:59:0x01fe, B:61:0x0204, B:63:0x0236, B:69:0x0251, B:71:0x0257, B:73:0x0265), top: B:89:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x026a A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final android.webkit.WebResourceResponse zzc(java.lang.String r19, java.util.Map r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgu.zzc(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final com.google.android.gms.ads.internal.zzb zzd() {
        return this.zzx;
    }

    @Override // com.google.android.gms.internal.ads.zzdgn
    public final void zzdG() {
        zzdgn zzdgnVar = this.zzm;
        if (zzdgnVar != null) {
            zzdgnVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgn
    public final void zzdf() {
        zzdgn zzdgnVar = this.zzm;
        if (zzdgnVar != null) {
            zzdgnVar.zzdf();
        }
    }

    public final void zzg() {
        if (this.zzi != null && ((this.zzz && this.zzB <= 0) || this.zzA || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbQ)).booleanValue() && this.zzc.zzm() != null) {
                zzbeg.zza(this.zzc.zzm().zza(), this.zzc.zzk(), "awfllc");
            }
            zzcia zzciaVar = this.zzi;
            boolean z = false;
            if (!this.zzA && !this.zzo) {
                z = true;
            }
            zzciaVar.zza(z, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.zzad();
    }

    public final void zzh() {
        zzbzo zzbzoVar = this.zza;
        if (zzbzoVar != null) {
            zzbzoVar.zze();
            this.zza = null;
        }
        zzV();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzs = false;
            this.zzt = false;
            this.zzv = null;
            this.zzx = null;
            this.zzw = null;
            zzbtm zzbtmVar = this.zzy;
            if (zzbtmVar != null) {
                zzbtmVar.zza(true);
                this.zzy = null;
            }
        }
    }

    public final void zzi(boolean z) {
        this.zzC = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzj(Uri uri) {
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(String.valueOf(String.valueOf(uri))));
        HashMap map = this.zze;
        String path = uri.getPath();
        List list = (List) map.get(path);
        if (path == null || list == null) {
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(String.valueOf(uri))));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzgP)).booleanValue() || com.google.android.gms.ads.internal.zzu.zzo().zzg() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? AbstractJsonLexerKt.NULL : path.substring(1);
            zzcbr.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgp
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    int i = zzcgu.zzb;
                    com.google.android.gms.ads.internal.zzu.zzo().zzg().zze(strSubstring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfF)).booleanValue() && this.zzD.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzfH)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzgee.zzr(com.google.android.gms.ads.internal.zzu.zzp().zzb(uri), new zzcgs(this, list, path, uri), zzcbr.zze);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        zzU(com.google.android.gms.ads.internal.util.zzt.zzP(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzk() {
        zzbcx zzbcxVar = this.zzd;
        if (zzbcxVar != null) {
            zzbcxVar.zzb(zzbcz.DELAY_PAGE_LOAD_CANCELLED_AD);
        }
        this.zzA = true;
        this.zzp = zzbcz.DELAY_PAGE_LOAD_CANCELLED_AD.zza();
        this.zzq = "Page loaded delay cancel.";
        zzg();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzl() {
        synchronized (this.zzf) {
        }
        this.zzB++;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzm() {
        this.zzB--;
        zzg();
    }

    final /* synthetic */ void zzn() throws JSONException {
        this.zzc.zzab();
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = this.zzc.zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzz();
        }
    }

    final /* synthetic */ void zzo(boolean z, long j) {
        this.zzc.zzv(z, j);
    }

    final /* synthetic */ void zzp(View view, zzbzo zzbzoVar, int i) {
        zzW(view, zzbzoVar, i - 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzq(int i, int i2, boolean z) {
        zzbtr zzbtrVar = this.zzw;
        if (zzbtrVar != null) {
            zzbtrVar.zzb(i, i2);
        }
        zzbtm zzbtmVar = this.zzy;
        if (zzbtmVar != null) {
            zzbtmVar.zzd(i, i2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcic
    public final void zzr() {
        zzbzo zzbzoVar = this.zza;
        if (zzbzoVar != null) {
            WebView webViewZzG = this.zzc.zzG();
            if (ViewCompat.isAttachedToWindow(webViewZzG)) {
                zzW(webViewZzG, zzbzoVar, 10);
                return;
            }
            zzV();
            zzcgr zzcgrVar = new zzcgr(this, zzbzoVar);
            this.zzF = zzcgrVar;
            ((View) this.zzc).addOnAttachStateChangeListener(zzcgrVar);
        }
    }

    public final void zzu(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z) throws NumberFormatException {
        zzcgm zzcgmVar = this.zzc;
        boolean zZzaC = zzcgmVar.zzaC();
        boolean zZzY = zzY(zZzaC, zzcgmVar);
        boolean z2 = true;
        if (!zZzY && z) {
            z2 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzY ? null : this.zzg;
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = zZzaC ? null : this.zzh;
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzv;
        zzcgm zzcgmVar2 = this.zzc;
        zzx(new AdOverlayInfoParcel(zzcVar, zzaVar, zzpVar, zzaaVar, zzcgmVar2.zzn(), zzcgmVar2, z2 ? null : this.zzm));
    }

    public final void zzv(String str, String str2, int i) throws NumberFormatException {
        zzefo zzefoVar = this.zzE;
        zzcgm zzcgmVar = this.zzc;
        zzx(new AdOverlayInfoParcel(zzcgmVar, zzcgmVar.zzn(), str, str2, 14, zzefoVar));
    }

    public final void zzw(boolean z, int i, boolean z2) throws NumberFormatException {
        zzcgm zzcgmVar = this.zzc;
        boolean zZzY = zzY(zzcgmVar.zzaC(), zzcgmVar);
        boolean z3 = true;
        if (!zZzY && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzY ? null : this.zzg;
        com.google.android.gms.ads.internal.overlay.zzp zzpVar = this.zzh;
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzv;
        zzcgm zzcgmVar2 = this.zzc;
        zzx(new AdOverlayInfoParcel(zzaVar, zzpVar, zzaaVar, zzcgmVar2, z, i, zzcgmVar2.zzn(), z3 ? null : this.zzm, zzX(this.zzc) ? this.zzE : null));
    }

    public final void zzx(AdOverlayInfoParcel adOverlayInfoParcel) throws NumberFormatException {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbtm zzbtmVar = this.zzy;
        boolean zZzf = zzbtmVar != null ? zzbtmVar.zzf() : false;
        com.google.android.gms.ads.internal.zzu.zzi();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zzc.getContext(), adOverlayInfoParcel, !zZzf);
        zzbzo zzbzoVar = this.zza;
        if (zzbzoVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzbzoVar.zzh(str);
        }
    }

    public final void zzy(boolean z, int i, String str, String str2, boolean z2) throws NumberFormatException {
        zzcgm zzcgmVar = this.zzc;
        boolean zZzaC = zzcgmVar.zzaC();
        boolean zZzY = zzY(zZzaC, zzcgmVar);
        boolean z3 = true;
        if (!zZzY && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzY ? null : this.zzg;
        zzcgt zzcgtVar = zZzaC ? null : new zzcgt(this.zzc, this.zzh);
        zzbjo zzbjoVar = this.zzk;
        zzbjq zzbjqVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzv;
        zzcgm zzcgmVar2 = this.zzc;
        zzx(new AdOverlayInfoParcel(zzaVar, zzcgtVar, zzbjoVar, zzbjqVar, zzaaVar, zzcgmVar2, z, i, str, str2, zzcgmVar2.zzn(), z3 ? null : this.zzm, zzX(this.zzc) ? this.zzE : null));
    }

    public final void zzz(boolean z, int i, String str, boolean z2, boolean z3) throws NumberFormatException {
        zzcgm zzcgmVar = this.zzc;
        boolean zZzaC = zzcgmVar.zzaC();
        boolean zZzY = zzY(zZzaC, zzcgmVar);
        boolean z4 = true;
        if (!zZzY && z2) {
            z4 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzY ? null : this.zzg;
        zzcgt zzcgtVar = zZzaC ? null : new zzcgt(this.zzc, this.zzh);
        zzbjo zzbjoVar = this.zzk;
        zzbjq zzbjqVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzaa zzaaVar = this.zzv;
        zzcgm zzcgmVar2 = this.zzc;
        zzx(new AdOverlayInfoParcel(zzaVar, zzcgtVar, zzbjoVar, zzbjqVar, zzaaVar, zzcgmVar2, z, i, str, zzcgmVar2.zzn(), z4 ? null : this.zzm, zzX(this.zzc) ? this.zzE : null, z3));
    }
}
