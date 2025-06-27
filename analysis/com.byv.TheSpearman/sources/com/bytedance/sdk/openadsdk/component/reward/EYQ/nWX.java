package com.bytedance.sdk.openadsdk.component.reward.EYQ;

import android.R;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.adexpress.Pm.VwS;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.mZx.Td;
import com.bytedance.sdk.openadsdk.core.mZx.mZx;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.bytedance.sdk.openadsdk.core.wBa;
import com.bytedance.sdk.openadsdk.core.xt;
import com.bytedance.sdk.openadsdk.mZx.Td;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.json.t2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RewardFullWebViewManager.java */
/* loaded from: classes2.dex */
public class nWX implements com.bytedance.sdk.openadsdk.HX.IPb {
    private long Dal;
    wBa EYQ;
    private boolean FtN;
    private int KO;
    private boolean Kbc;
    com.bytedance.sdk.openadsdk.mZx.tp Kbd;
    private final String MxO;
    private View NZ;
    private boolean Nuq;
    private final com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ PI;
    private boolean Pf;
    protected String Pm;
    protected com.bytedance.sdk.openadsdk.mZx.Td.Kbd QQ;
    private ILoader TQF;
    private com.bytedance.sdk.openadsdk.common.VwS Tnp;
    private SSWebView UB;
    private boolean WU;
    private boolean XN;
    private boolean dVQ;
    private SSWebView hu;
    private long lEs;
    private boolean lRN;
    private com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd mN;
    wBa mZx;
    private int nWX;
    private String na;
    private final boolean pi;
    private float rfB;
    private View tPj;
    private final UB tp;
    private int tsL;
    private boolean vD;
    private float wBa;
    private int wa;
    private String xh;
    private boolean zF;
    protected boolean Td = true;
    private boolean Uc = false;
    private final AtomicBoolean hYh = new AtomicBoolean(true);
    int IPb = 0;
    String VwS = "";
    boolean HX = false;
    private SparseArray<Td.EYQ> xt = new SparseArray<>();
    private boolean Nvm = true;
    private float FH = -1.0f;
    private float tr = -1.0f;
    private boolean kf = false;
    private long XPd = -1;
    private volatile int wJ = 0;
    private int KR = -1;
    private volatile int OtA = 0;
    private volatile int TZn = 0;
    private long VOV = 0;
    private int GfQ = -1;

    /* compiled from: RewardFullWebViewManager.java */
    public interface Pm {
        void EYQ(WebView webView, int i);

        void EYQ(WebView webView, String str);

        void EYQ(WebView webView, String str, Bitmap bitmap);
    }

    static /* synthetic */ int MxO(nWX nwx) {
        int i = nwx.OtA;
        nwx.OtA = i + 1;
        return i;
    }

    static /* synthetic */ int nWX(nWX nwx) {
        int i = nwx.wJ;
        nwx.wJ = i + 1;
        return i;
    }

    static /* synthetic */ int pi(nWX nwx) {
        int i = nwx.TZn;
        nwx.TZn = i + 1;
        return i;
    }

    public nWX(com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ eyq) {
        this.PI = eyq;
        this.tp = eyq.EYQ;
        this.MxO = eyq.VwS;
        this.pi = eyq.IPb;
    }

    public void EYQ() {
        if (this.XN) {
            return;
        }
        this.XN = true;
        this.tsL = this.PI.tp;
        this.nWX = this.PI.tsL;
        this.KO = this.PI.pi;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        mZx();
        this.VOV = SystemClock.elapsedRealtime() - jElapsedRealtime;
    }

    void mZx() {
        com.bytedance.sdk.openadsdk.common.VwS vwS;
        this.NZ = this.PI.TZn.findViewById(R.id.content);
        boolean z = this.PI.hYh;
        this.FtN = z;
        if (z && (vwS = this.Tnp) != null) {
            this.hu = vwS.Pm();
        } else {
            SSWebView sSWebView = (SSWebView) this.PI.TZn.findViewById(com.bytedance.sdk.openadsdk.utils.tp.nWX);
            this.hu = sSWebView;
            if (sSWebView != null && UB.mZx(this.tp)) {
                this.hu.d_();
            } else {
                tr.EYQ((View) this.hu, 8);
            }
        }
        SSWebView sSWebView2 = (SSWebView) this.PI.TZn.findViewById(com.bytedance.sdk.openadsdk.utils.tp.hu);
        this.UB = sSWebView2;
        if (sSWebView2 != null && zF.mZx(this.tp)) {
            this.UB.d_();
            this.UB.setDisplayZoomControls(false);
        } else {
            tr.EYQ((View) this.UB, 8);
        }
        SSWebView sSWebView3 = this.hu;
        if (sSWebView3 != null) {
            sSWebView3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.nWX.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() throws JSONException {
                    if (nWX.this.hu == null || nWX.this.hu.getViewTreeObserver() == null) {
                        return;
                    }
                    nWX.this.hu.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int measuredWidth = nWX.this.hu.getMeasuredWidth();
                    int measuredHeight = nWX.this.hu.getMeasuredHeight();
                    if (nWX.this.hu.getVisibility() == 0) {
                        nWX.this.EYQ(measuredWidth, measuredHeight);
                    }
                }
            });
        }
        SSWebView sSWebView4 = this.UB;
        if (sSWebView4 != null) {
            sSWebView4.setLandingPage(true);
            this.UB.setTag(zF.mZx(this.tp) ? this.MxO : "landingpage_endcard");
            this.UB.setWebViewClient(new SSWebView.EYQ());
            this.UB.setMaterialMeta(this.tp.dbE());
        }
    }

    public void EYQ(String str, final com.bytedance.sdk.openadsdk.core.video.Td.mZx mzx) {
        EYQ(str, new Pm() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.nWX.8
            @Override // com.bytedance.sdk.openadsdk.component.reward.EYQ.nWX.Pm
            public void EYQ(WebView webView, String str2) {
                if (nWX.this.PI.TZn.isFinishing()) {
                    return;
                }
                nWX.this.PI.kf.IPb(nWX.this.hu());
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.EYQ.nWX.Pm
            public void EYQ(WebView webView, String str2, Bitmap bitmap) {
                if (nWX.this.kf || !zF.MxO(nWX.this.PI.EYQ)) {
                    return;
                }
                nWX.this.kf = true;
                nWX.this.PI.kf.EYQ(nWX.this.PI.KO, nWX.this.PI.EYQ, nWX.this.PI.TZn.KO());
                if (!zF.Td(nWX.this.tp)) {
                    nWX.this.PI.Nuq.sendEmptyMessageDelayed(600, nWX.this.PI.kf.MxO() * 1000);
                }
                nWX.this.PI.kf.VwS();
                nWX.this.PI.TZn.mZx();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.EYQ.nWX.Pm
            public void EYQ(WebView webView, int i) {
                try {
                    if (!zF.MxO(nWX.this.PI.EYQ) || !nWX.this.PI.EYQ.In() || nWX.this.PI.TZn.isFinishing()) {
                        if (!nWX.this.PI.hYh || nWX.this.PI.Dal == null) {
                            return;
                        }
                        nWX.this.PI.Dal.EYQ(webView, i);
                        return;
                    }
                    nWX.this.PI.kf.Td(i);
                } catch (Exception unused) {
                }
            }
        });
        if (zF.MxO(this.PI.EYQ)) {
            EYQ(this.UB);
            this.PI.kf.EYQ(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.nWX.9
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str2, String str3, String str4, String str5, long j) {
                    nWX.this.PI.PI.mZx();
                    com.bytedance.sdk.openadsdk.core.video.Td.mZx mzx2 = mzx;
                    if (mzx2 != null) {
                        mzx2.hYh();
                    }
                }
            });
        }
        this.PI.kf.EYQ(this.PI.UB);
        EYQ(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.nWX.10
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str2, String str3, String str4, String str5, long j) {
                nWX.this.PI.PI.mZx();
                com.bytedance.sdk.openadsdk.core.video.Td.mZx mzx2 = mzx;
                if (mzx2 != null) {
                    mzx2.hYh();
                }
            }
        });
    }

    public void EYQ(com.bytedance.sdk.openadsdk.HX.Pm pm, String str, final TTBaseVideoActivity tTBaseVideoActivity) {
        if (this.hu == null) {
            return;
        }
        HashMap map = new HashMap();
        if (zF.mZx(this.tp)) {
            map.put("click_scence", 3);
        } else {
            map.put("click_scence", 2);
        }
        this.QQ = lRN();
        this.EYQ = new wBa(this.PI.TZn);
        String strTfI = this.tp.TfI();
        this.EYQ.mZx(this.hu).EYQ(this.tp).Td(this.tp.VOV()).Pm(this.tp.GfQ()).mZx(tTBaseVideoActivity.KO() ? 7 : 5).EYQ(new mZx(this.hu)).Kbd(strTfI).EYQ(this.hu).mZx(KO() ? "landingpage_endcard" : str).EYQ(map).EYQ(this.QQ).EYQ(new com.bytedance.sdk.openadsdk.core.widget.mZx() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.nWX.11
            @Override // com.bytedance.sdk.openadsdk.core.widget.mZx
            public void EYQ() {
                if (nWX.this.mN != null) {
                    nWX.this.mN.mZx();
                }
                TTBaseVideoActivity tTBaseVideoActivity2 = tTBaseVideoActivity;
                if (tTBaseVideoActivity2 != null) {
                    tTBaseVideoActivity2.hYh();
                }
            }
        });
        HashMap map2 = new HashMap();
        if (zF.Td(this.tp)) {
            map2.put("click_scence", 2);
        }
        wBa wba = new wBa(this.PI.TZn);
        this.mZx = wba;
        wBa wbaKbd = wba.mZx(this.UB).EYQ(this.tp).Td(this.tp.VOV()).Pm(this.tp.GfQ()).mZx(tTBaseVideoActivity.KO() ? 7 : 5).EYQ(new mZx(this.UB)).EYQ(this.UB).Kbd(strTfI);
        if (KO()) {
            str = "landingpage_endcard";
        }
        wbaKbd.mZx(str).EYQ(map2).EYQ(this.QQ).EYQ(new com.bytedance.sdk.openadsdk.core.widget.mZx() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.nWX.13
            @Override // com.bytedance.sdk.openadsdk.core.widget.mZx
            public void EYQ() {
                if (nWX.this.mN != null) {
                    nWX.this.mN.mZx();
                }
            }
        }).EYQ(new wBa.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.nWX.12
            @Override // com.bytedance.sdk.openadsdk.core.wBa.EYQ
            public void EYQ() {
                nWX.this.Kbc = true;
                nWX.this.dVQ = false;
                nWX.this.PI.Nuq.removeMessages(600);
                nWX.this.PI.Nuq.removeMessages(700);
                nWX.this.PI.KR.Pm(false);
                nWX.this.PI.FH.set(true);
                nWX.this.PI.xh.hu();
                nWX.this.tp.lv();
                if (nWX.this.tp.lv() || !FH.QQ(zF.EYQ(nWX.this.tp))) {
                    return;
                }
                View viewTp = nWX.this.PI.TQF.tp();
                View.OnClickListener onClickListener = (View.OnClickListener) viewTp.getTag(viewTp.getId());
                if (onClickListener != null) {
                    EYQ eyq = new EYQ(nWX.this.PI, viewTp, onClickListener);
                    viewTp.setOnClickListener(eyq);
                    viewTp.setOnTouchListener(eyq);
                }
            }
        });
        this.EYQ.EYQ(new Td(this.hu));
        this.mZx.EYQ(new Td(this.UB));
        this.EYQ.EYQ(this.PI.TQF.tp()).EYQ(this.PI.UB).EYQ(pm).EYQ(this.PI.kf.hu()).EYQ(new com.bytedance.sdk.openadsdk.HX.mZx() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.nWX.14
            @Override // com.bytedance.sdk.openadsdk.HX.mZx
            public void EYQ(boolean z, int i, String str2) {
                if (z) {
                    nWX.this.PI.kf.Td();
                }
                if (!UB.Pm(nWX.this.PI.EYQ) || zF.mZx(nWX.this.PI.EYQ)) {
                    return;
                }
                nWX.this.EYQ(z, i, str2);
            }

            @Override // com.bytedance.sdk.openadsdk.HX.mZx
            public void EYQ() {
                nWX.this.lRN = true;
                nWX.this.PI.TQF.tp().performClick();
            }
        });
        this.EYQ.Kbd(this.Pf);
        this.mZx.EYQ(this.PI.TQF.tp()).EYQ(new com.bytedance.sdk.openadsdk.HX.mZx() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.nWX.15
            @Override // com.bytedance.sdk.openadsdk.HX.mZx
            public void EYQ(boolean z, int i, String str2) {
            }

            @Override // com.bytedance.sdk.openadsdk.HX.mZx
            public void EYQ() {
                nWX.this.lRN = true;
                nWX.this.PI.TQF.tp().performClick();
            }
        });
    }

    public boolean Td() {
        return this.lRN;
    }

    public boolean Pm() {
        return this.vD;
    }

    public void EYQ(int i, int i2) throws JSONException {
        if (this.EYQ == null || this.PI.TZn.isFinishing()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", i);
            jSONObject.put("height", i2);
            this.EYQ.EYQ("resize", jSONObject);
        } catch (Exception e) {
            Log.e("TTAD.RFWVM", "", e);
        }
    }

    public void EYQ(boolean z) {
        this.Td = z;
    }

    public void Kbd() {
        if (TextUtils.isEmpty(UB.EYQ(this.PI.VOV, this.tp))) {
            UB ub = this.tp;
            if (ub != null && !ub.Jx() && this.TQF == null && KO()) {
                this.na = this.tp.Dd();
                this.TQF = com.bytedance.sdk.openadsdk.Pm.mZx.EYQ().mZx();
                int iEYQ = com.bytedance.sdk.openadsdk.Pm.mZx.EYQ().EYQ(this.TQF, this.na);
                this.wa = iEYQ;
                this.KR = iEYQ > 0 ? 2 : 0;
                if (!TextUtils.isEmpty(this.na)) {
                    com.bytedance.sdk.openadsdk.mZx.tp tpVar = this.Kbd;
                    if (tpVar != null) {
                        tpVar.EYQ(this.KR);
                    }
                    Td.EYQ.EYQ(this.VOV, this.tp, "landingpage_endcard", this.TQF, this.na);
                }
            }
            if ((!TextUtils.isEmpty(this.Pm) && this.Pm.contains("play.google.com/store")) || com.bytedance.sdk.openadsdk.core.model.KO.Pm(this.tp)) {
                this.HX = true;
                return;
            }
            if (this.Td) {
                if (this.hu != null && !TextUtils.isEmpty(this.Pm) && UB.mZx(this.tp)) {
                    if (this.Nuq) {
                        return;
                    }
                    String str = this.Pm + "&is_pre_render=1";
                    com.bytedance.sdk.openadsdk.mZx.tp tpVar2 = this.Kbd;
                    if (tpVar2 != null) {
                        tpVar2.Pm();
                    }
                    com.bytedance.sdk.openadsdk.utils.KO.EYQ(this.hu, str);
                    this.PI.kf.Td(str);
                    this.Nuq = true;
                    return;
                }
                if (UB.Td(this.tp)) {
                    this.PI.wa.Td();
                }
            }
        }
    }

    public void IPb() {
        com.bykv.vk.openvk.component.video.api.Td.mZx mzxMN = this.tp.mN();
        if (mzxMN == null) {
            return;
        }
        String strTsL = mzxMN.tsL();
        this.xh = strTsL;
        if (TextUtils.isEmpty(strTsL)) {
            return;
        }
        this.xh = EYQ(this.xh, this.tp, this.tsL, this.KO, this.nWX);
        this.UB.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd(hu.EYQ(), this.mZx, this.tp.VOV(), this.Kbd, this.tp.Tnp() || zF.mZx(this.tp)) { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.nWX.2
            @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str, String str2) throws JSONException {
                if (nWX.this.EYQ(str2)) {
                    return;
                }
                nWX.this.WU = false;
                nWX.this.IPb = i;
                nWX.this.VwS = str;
                if (nWX.this.QQ != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (Build.VERSION.SDK_INT >= 23) {
                            jSONObject.put("code", i);
                            jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str);
                        }
                        nWX.this.QQ.EYQ(jSONObject);
                    } catch (JSONException unused) {
                    }
                }
                super.onReceivedError(webView, i, str, str2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) throws JSONException {
                if (webResourceRequest == null || webResourceRequest.getUrl() == null || !nWX.this.EYQ(webResourceRequest.getUrl().toString())) {
                    nWX.this.WU = false;
                    if (nWX.this.QQ != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (Build.VERSION.SDK_INT >= 23 && webResourceError != null) {
                                jSONObject.put("code", webResourceError.getErrorCode());
                                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceError.getDescription());
                            }
                            nWX.this.QQ.EYQ(jSONObject);
                        } catch (JSONException unused) {
                        }
                    }
                    if (webResourceError != null) {
                        nWX.this.IPb = webResourceError.getErrorCode();
                        nWX.this.VwS = String.valueOf(webResourceError.getDescription());
                    }
                    if (webResourceRequest == null) {
                        return;
                    }
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) throws JSONException {
                if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                    nWX.this.WU = false;
                    if (webResourceResponse != null) {
                        nWX.this.IPb = webResourceResponse.getStatusCode();
                        nWX.this.VwS = "onReceivedHttpError";
                    }
                }
                if (nWX.this.QQ != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (Build.VERSION.SDK_INT >= 21 && webResourceResponse != null) {
                            jSONObject.put("code", webResourceResponse.getStatusCode());
                            jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceResponse.getReasonPhrase());
                        }
                        nWX.this.QQ.EYQ(jSONObject);
                    } catch (JSONException unused) {
                    }
                }
                if (webResourceRequest != null) {
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (nWX.this.QQ != null) {
                    nWX.this.QQ.IPb();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                if (nWX.this.QQ != null) {
                    nWX.this.QQ.Kbd();
                }
            }
        });
        this.UB.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.EYQ.Pm(this.mZx, this.Kbd) { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.nWX.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Pm, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (!nWX.this.PI.hYh || nWX.this.PI.Dal == null) {
                    return;
                }
                nWX.this.PI.Dal.EYQ(webView, i);
            }
        });
        com.bytedance.sdk.openadsdk.utils.KO.EYQ(this.UB, this.xh);
        this.WU = true;
    }

    public void VwS() {
        this.hYh.set(this.WU);
        if (this.UB.getVisibility() == 0 && this.WU) {
            vD();
            return;
        }
        this.PI.KR.Td(false);
        this.PI.kf.Kbd();
        EYQ(this.EYQ, true, false);
        mZx(this.EYQ, false);
        EYQ(this.EYQ, false);
        this.hu.tsL();
        if (this.WU) {
            this.UB.setVisibility(0);
            EYQ(this.mZx, this.PI.Pm, true);
            mZx(this.mZx, true);
            EYQ(this.mZx, true);
            this.PI.Nuq.removeMessages(600);
            if (!this.PI.na.mZx(this.PI.xh)) {
                this.PI.xh.wBa();
            }
        } else {
            if (this.PI.kf.hYh()) {
                this.PI.kf.mZx(5);
            }
            this.PI.na.Pm();
        }
        this.dVQ = true;
    }

    private void vD() {
        this.mZx.EYQ("showPlayableEndCardOverlay", (JSONObject) null);
        this.PI.Nuq.sendEmptyMessageDelayed(600, 1000L);
    }

    public SSWebView QQ() {
        return this.hu;
    }

    public SSWebView HX() {
        return this.UB;
    }

    public wBa tp() {
        return this.EYQ;
    }

    public wBa MxO() {
        return this.mZx;
    }

    public com.bytedance.sdk.openadsdk.mZx.tp tsL() {
        return this.Kbd;
    }

    public void pi() {
        String strIPb = zF.IPb(this.tp);
        this.Pm = strIPb;
        String strEYQ = EYQ(strIPb, this.tp, this.tsL, this.KO, this.nWX);
        this.Pm = strEYQ;
        if (TextUtils.isEmpty(strEYQ)) {
            return;
        }
        this.Pf = this.Pm.contains("use_second_endcard=1");
    }

    private static String EYQ(String str, UB ub, int i, int i2, int i3) {
        String str2;
        String str3;
        float fCsQ = ub.CsQ();
        if (!TextUtils.isEmpty(str)) {
            if (i == 1) {
                if (str.contains("?")) {
                    str3 = str + t2.i.c;
                } else {
                    str3 = str + "?";
                }
                str = str3 + "orientation=portrait";
            }
            if (str.contains("?")) {
                str2 = str + t2.i.c;
            } else {
                str2 = str + "?";
            }
            str = str2 + "height=" + i2 + "&width=" + i3 + "&aspect_ratio=" + fCsQ;
        }
        return !zF.mZx(ub) ? com.bytedance.sdk.openadsdk.utils.Pm.EYQ(str) : str;
    }

    public void nWX() throws JSONException {
        SSWebView sSWebView = this.hu;
        if (sSWebView != null) {
            xt.EYQ(sSWebView.getWebView());
        }
        SSWebView sSWebView2 = this.UB;
        if (sSWebView2 != null) {
            xt.EYQ(sSWebView2.getWebView());
        }
        long j = this.Dal;
        if (j > 0) {
            if (this.XPd > 0) {
                this.Dal = j + (SystemClock.elapsedRealtime() - this.XPd);
            }
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.PI.EYQ, this.MxO, "second_endcard_duration", (JSONObject) null, this.Dal);
        }
        this.hu = null;
        boolean z = true;
        if (this.QQ != null && !com.bytedance.sdk.openadsdk.core.model.KO.Td(this.tp) && !UB.Td(this.tp)) {
            this.QQ.EYQ(true);
            this.QQ.tsL();
        }
        wBa wba = this.EYQ;
        if (wba != null) {
            wba.tsL();
        }
        wBa wba2 = this.mZx;
        if (wba2 != null) {
            wba2.tsL();
        }
        com.bytedance.sdk.openadsdk.mZx.tp tpVar = this.Kbd;
        if (tpVar != null) {
            if (!this.tp.Tnp() && !zF.mZx(this.tp)) {
                z = false;
            }
            tpVar.Td(z);
        }
        DeviceUtils.AudioInfoReceiver.mZx(this);
    }

    public void mZx(int i) {
        tr.EYQ((View) this.hu, i);
        SSWebView sSWebView = this.hu;
        if (sSWebView != null) {
            tr.EYQ((View) sSWebView.getWebView(), i);
        }
        if (this.hu != null && (this.tp.Tnp() || zF.mZx(this.tp))) {
            this.hu.setLandingPage(true);
            this.hu.setTag(zF.mZx(this.tp) ? this.MxO : "landingpage_endcard");
            this.hu.setMaterialMeta(this.tp.dbE());
        }
        if (i == 0 && zF.Td(this.tp)) {
            IPb();
        }
    }

    public void EYQ(com.bytedance.sdk.openadsdk.common.VwS vwS) {
        this.Tnp = vwS;
    }

    public void EYQ(float f) {
        tr.EYQ(this.hu, f);
    }

    public void mZx(boolean z) {
        EYQ(this.EYQ, z);
    }

    public void EYQ(wBa wba, boolean z) {
        if (this.EYQ == null || this.PI.TZn.isFinishing()) {
            return;
        }
        wba.mZx(z);
    }

    private void EYQ(String str, final Pm pm) {
        SSWebView sSWebView;
        SSWebView sSWebView2 = this.hu;
        if (sSWebView2 != null && sSWebView2.getWebView() != null) {
            com.bytedance.sdk.openadsdk.mZx.tp tpVarEYQ = new com.bytedance.sdk.openadsdk.mZx.tp(this.tp, this.hu.getWebView(), new com.bytedance.sdk.openadsdk.mZx.HX() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.nWX.4
                @Override // com.bytedance.sdk.openadsdk.mZx.HX
                public void EYQ(int i) {
                    if (TextUtils.isEmpty(nWX.this.na)) {
                        return;
                    }
                    Td.EYQ.EYQ(nWX.this.wa, nWX.this.wJ, nWX.this.TZn, nWX.this.OtA - nWX.this.TZn, nWX.this.tp, "landingpage_endcard", i);
                }
            }, this.KR).EYQ(true);
            this.Kbd = tpVarEYQ;
            if (KO()) {
                str = "landingpage_endcard";
            }
            tpVarEYQ.EYQ(str);
            this.Kbd.mZx(this.MxO);
            this.Kbd.mZx(true);
            com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd kbd = new com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd(hu.EYQ(), this.EYQ, this.tp.VOV(), this.Kbd, this.tp.Tnp() || zF.mZx(this.tp)) { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.nWX.5
                @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                    if (!zF.mZx(nWX.this.tp)) {
                        try {
                            if (TextUtils.isEmpty(nWX.this.na)) {
                                return super.shouldInterceptRequest(webView, str2);
                            }
                            nWX.MxO(nWX.this);
                            WebResourceResponseModel webResourceResponseModelEYQ = com.bytedance.sdk.openadsdk.Pm.mZx.EYQ().EYQ(nWX.this.TQF, nWX.this.na, str2);
                            if (webResourceResponseModelEYQ != null && webResourceResponseModelEYQ.getWebResourceResponse() != null) {
                                nWX.pi(nWX.this);
                                return webResourceResponseModelEYQ.getWebResourceResponse();
                            }
                            if (webResourceResponseModelEYQ != null && webResourceResponseModelEYQ.getMsg() == 2) {
                                nWX.nWX(nWX.this);
                            }
                            return super.shouldInterceptRequest(webView, str2);
                        } catch (Throwable th) {
                            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.RFWVM", "shouldInterceptRequest url error", th);
                            return super.shouldInterceptRequest(webView, str2);
                        }
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    WebResourceResponse webResourceResponseEYQ = com.bytedance.sdk.openadsdk.core.video.mZx.EYQ.EYQ().EYQ(nWX.this.tp.mN().pi(), zF.IPb(nWX.this.tp), str2);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (nWX.this.QQ != null) {
                        VwS.EYQ EYQ2 = com.bytedance.sdk.component.adexpress.Pm.VwS.EYQ(str2);
                        int i = webResourceResponseEYQ != null ? 1 : 2;
                        if (EYQ2 == VwS.EYQ.HTML) {
                            nWX.this.QQ.EYQ(str2, jCurrentTimeMillis, jCurrentTimeMillis2, i);
                        } else if (EYQ2 == VwS.EYQ.JS) {
                            nWX.this.QQ.mZx(str2, jCurrentTimeMillis, jCurrentTimeMillis2, i);
                        }
                    }
                    return webResourceResponseEYQ;
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                    try {
                        return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.pi.EYQ("TTAD.RFWVM", "shouldInterceptRequest error1", th);
                        return super.shouldInterceptRequest(webView, webResourceRequest);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i, String str2, String str3) throws JSONException {
                    super.onReceivedError(webView, i, str2, str3);
                    if (Build.VERSION.SDK_INT < 23 && !nWX.this.EYQ(str3)) {
                        nWX.this.hYh.set(false);
                        nWX.this.IPb = i;
                        nWX.this.VwS = str2;
                        nWX.this.Nuq = false;
                        nWX.this.PI.kf.EYQ(i, str2, str3);
                        if (nWX.this.QQ != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (Build.VERSION.SDK_INT >= 23) {
                                    jSONObject.put("code", i);
                                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, str2);
                                }
                                nWX.this.QQ.EYQ(jSONObject);
                            } catch (JSONException unused) {
                            }
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) throws JSONException {
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    if (Build.VERSION.SDK_INT < 23) {
                        return;
                    }
                    if (webResourceError != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
                        Log.i("TTAD.RFWVM", "onReceivedError WebResourceError : description=" + ((Object) webResourceError.getDescription()) + "  url =" + webResourceRequest.getUrl().toString());
                    }
                    if (webResourceRequest == null || webResourceRequest.getUrl() == null || !nWX.this.EYQ(webResourceRequest.getUrl().toString())) {
                        if (webResourceError != null && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                            nWX.this.PI.kf.EYQ(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), String.valueOf(webResourceRequest.getUrl()));
                        }
                        if (webResourceRequest == null || webResourceRequest.isForMainFrame()) {
                            nWX.this.hYh.set(false);
                            nWX.this.Nuq = false;
                        }
                        if (nWX.this.QQ != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (Build.VERSION.SDK_INT >= 23 && webResourceError != null) {
                                    jSONObject.put("code", webResourceError.getErrorCode());
                                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceError.getDescription());
                                }
                                nWX.this.QQ.EYQ(jSONObject);
                            } catch (JSONException unused) {
                            }
                        }
                        if (webResourceError != null) {
                            nWX.this.IPb = webResourceError.getErrorCode();
                            nWX.this.VwS = String.valueOf(webResourceError.getDescription());
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) throws JSONException {
                    nWX.this.PI.kf.EYQ(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                        Log.i("TTAD.RFWVM", "onReceivedHttpError:url =" + webResourceRequest.getUrl().toString());
                    }
                    if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                        nWX.this.hYh.set(false);
                        nWX.this.Nuq = false;
                        if (webResourceResponse != null) {
                            nWX.this.IPb = webResourceResponse.getStatusCode();
                            nWX.this.VwS = "onReceivedHttpError";
                        }
                    }
                    if (nWX.this.QQ != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (Build.VERSION.SDK_INT >= 21 && webResourceResponse != null) {
                                jSONObject.put("code", webResourceResponse.getStatusCode());
                                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceResponse.getReasonPhrase());
                            }
                            nWX.this.QQ.EYQ(jSONObject);
                        } catch (JSONException unused) {
                        }
                    }
                    if (webResourceRequest != null) {
                        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str2) {
                    super.onPageFinished(webView, str2);
                    nWX.this.Nuq = false;
                    if (webView == null || webView.getProgress() >= 70) {
                        nWX.this.zF = true;
                        DeviceUtils.AudioInfoReceiver.EYQ(nWX.this);
                        nWX.this.GfQ = DeviceUtils.VwS();
                        if (nWX.this.QQ != null) {
                            nWX.this.QQ.IPb();
                        }
                        nWX.this.PI.kf.mZx(str2);
                        Pm pm2 = pm;
                        if (pm2 != null) {
                            pm2.EYQ(webView, str2);
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                    super.onPageStarted(webView, str2, bitmap);
                    if (nWX.this.QQ != null) {
                        nWX.this.QQ.Kbd();
                    }
                    Pm pm2 = pm;
                    if (pm2 != null) {
                        pm2.EYQ(webView, str2, bitmap);
                    }
                }
            };
            this.mN = kbd;
            this.hu.setWebViewClient(kbd);
            this.mN.EYQ(this.tp);
            this.mN.EYQ(this.pi ? "rewarded_video" : "fullscreen_interstitial_ad");
            if (this.tp.Tnp() && (sSWebView = this.hu) != null && sSWebView.getWebView() != null) {
                this.hu.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.nWX.6
                    private final int mZx = hu.mZx();

                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        int i;
                        if (nWX.this.Kbd != null) {
                            nWX.this.Kbd.mZx(motionEvent.getActionMasked());
                        }
                        int i2 = -1;
                        try {
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 0) {
                                nWX.this.Nvm = true;
                                nWX.this.xt = new SparseArray();
                                nWX.this.wBa = motionEvent.getRawX();
                                nWX.this.rfB = motionEvent.getRawY();
                                nWX.this.lEs = System.currentTimeMillis();
                                try {
                                    long landingPageClickBegin = nWX.this.hu.getLandingPageClickBegin();
                                    if (landingPageClickBegin > 0 && landingPageClickBegin < nWX.this.lEs) {
                                        nWX.this.lEs = landingPageClickBegin;
                                        nWX.this.hu.setLandingPageClickBegin(-1L);
                                    }
                                } catch (Exception unused) {
                                }
                                nWX.this.FH = -1.0f;
                                nWX.this.tr = -1.0f;
                                i = 0;
                            } else if (actionMasked != 1) {
                                if (actionMasked == 2) {
                                    float rawX = motionEvent.getRawX();
                                    float rawY = motionEvent.getRawY();
                                    if (Math.abs(rawX - nWX.this.wBa) >= this.mZx || Math.abs(rawY - nWX.this.rfB) >= this.mZx) {
                                        nWX.this.Nvm = false;
                                    }
                                    nWX.this.FH += Math.abs(motionEvent.getX() - nWX.this.wBa);
                                    nWX.this.tr += Math.abs(motionEvent.getY() - nWX.this.rfB);
                                    i2 = (System.currentTimeMillis() - nWX.this.lEs <= 200 || (nWX.this.FH <= 8.0f && nWX.this.tr <= 8.0f)) ? 2 : 1;
                                    if (nWX.this.FtN) {
                                        if (rawY - nWX.this.rfB > 8.0f) {
                                            nWX.this.Tnp.EYQ();
                                        }
                                        if (rawY - nWX.this.rfB < -8.0f) {
                                            nWX.this.Tnp.mZx();
                                        }
                                    }
                                } else if (actionMasked == 3) {
                                    i2 = 4;
                                }
                                i = i2;
                            } else {
                                i = 3;
                            }
                            nWX.this.xt.put(motionEvent.getActionMasked(), new Td.EYQ(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
                            if (motionEvent.getAction() == 1 && view.getVisibility() == 0 && Float.valueOf(view.getAlpha()).intValue() == 1 && ((!nWX.this.Uc || com.bytedance.sdk.openadsdk.core.model.KO.IPb(nWX.this.tp)) && nWX.this.Nvm)) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("down_x", nWX.this.wBa);
                                jSONObject.put("down_y", nWX.this.rfB);
                                jSONObject.put("down_time", nWX.this.lEs);
                                jSONObject.put("up_x", motionEvent.getRawX());
                                jSONObject.put("up_y", motionEvent.getRawY());
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                try {
                                    long landingPageClickEnd = nWX.this.hu.getLandingPageClickEnd();
                                    if (landingPageClickEnd > 0 && landingPageClickEnd < jCurrentTimeMillis) {
                                        try {
                                            nWX.this.hu.setLandingPageClickEnd(-1L);
                                        } catch (Exception unused2) {
                                        }
                                        jCurrentTimeMillis = landingPageClickEnd;
                                    }
                                } catch (Exception unused3) {
                                }
                                jSONObject.put("up_time", jCurrentTimeMillis);
                                int[] iArr = new int[2];
                                if (nWX.this.FtN) {
                                    nWX nwx = nWX.this;
                                    nwx.tPj = nwx.PI.TZn.findViewById(com.bytedance.sdk.openadsdk.utils.tp.eFB);
                                } else {
                                    nWX nwx2 = nWX.this;
                                    nwx2.tPj = nwx2.PI.TZn.findViewById(520093713);
                                }
                                if (nWX.this.tPj != null) {
                                    nWX.this.tPj.getLocationOnScreen(iArr);
                                    jSONObject.put("button_x", iArr[0]);
                                    jSONObject.put("button_y", iArr[1]);
                                    jSONObject.put("button_width", nWX.this.tPj.getWidth());
                                    jSONObject.put("button_height", nWX.this.tPj.getHeight());
                                }
                                if (nWX.this.NZ != null) {
                                    int[] iArr2 = new int[2];
                                    nWX.this.NZ.getLocationOnScreen(iArr2);
                                    jSONObject.put("ad_x", iArr2[0]);
                                    jSONObject.put("ad_y", iArr2[1]);
                                    jSONObject.put("width", nWX.this.NZ.getWidth());
                                    jSONObject.put("height", nWX.this.NZ.getHeight());
                                }
                                jSONObject.put("toolType", motionEvent.getToolType(0));
                                jSONObject.put("deviceId", motionEvent.getDeviceId());
                                jSONObject.put(FirebaseAnalytics.Param.SOURCE, motionEvent.getSource());
                                jSONObject.put("ft", com.bytedance.sdk.openadsdk.core.model.HX.EYQ(nWX.this.xt, com.bytedance.sdk.openadsdk.core.QQ.mZx().EYQ() ? 1 : 2));
                                jSONObject.put("user_behavior_type", nWX.this.Nvm ? 1 : 2);
                                jSONObject.put("click_scence", 2);
                                if (nWX.this.mN != null) {
                                    nWX.this.mN.EYQ(jSONObject);
                                }
                                if (!nWX.this.Uc && !com.bytedance.sdk.openadsdk.core.model.KO.Kbd(nWX.this.tp)) {
                                    if (nWX.this.pi) {
                                        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(nWX.this.tp, "rewarded_video", CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject);
                                    } else {
                                        com.bytedance.sdk.openadsdk.mZx.Td.EYQ(nWX.this.tp, "fullscreen_interstitial_ad", CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject);
                                    }
                                    nWX.this.Uc = true;
                                }
                                return false;
                            }
                        } catch (Throwable th) {
                            Log.e("TTAD.RFWVM", "TouchRecordTool onTouch error", th);
                        }
                        return false;
                    }
                });
            }
            SSWebView sSWebView3 = this.hu;
            if (sSWebView3 != null) {
                sSWebView3.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.EYQ.Pm(this.EYQ, this.Kbd) { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.nWX.7
                    @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Pm, android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView, int i) {
                        super.onProgressChanged(webView, i);
                        Pm pm2 = pm;
                        if (pm2 != null) {
                            pm2.EYQ(webView, i);
                        }
                    }
                });
            }
            EYQ(this.hu);
            if (Build.VERSION.SDK_INT >= 24) {
                this.hu.setLayerType(1, null);
            }
            this.hu.setBackgroundColor(-1);
            this.hu.setDisplayZoomControls(false);
        }
        Kbd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean EYQ(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return this.tp.Tnp() && str.endsWith(".mp4");
    }

    public boolean KO() {
        String str = this.Pm;
        if (str == null) {
            return false;
        }
        try {
            return Uri.parse(str).getQueryParameterNames().contains("show_landingpage");
        } catch (Exception unused) {
            return false;
        }
    }

    public void EYQ(DownloadListener downloadListener) {
        SSWebView sSWebView = this.hu;
        if (sSWebView == null || downloadListener == null) {
            return;
        }
        sSWebView.setDownloadListener(downloadListener);
    }

    public boolean hu() {
        return this.hYh.get();
    }

    public void EYQ(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.EYQ.Td.EYQ(this.PI.TZn).EYQ(false).mZx(false).EYQ(sSWebView.getWebView());
        sSWebView.setUserAgentString(com.bytedance.sdk.openadsdk.utils.pi.EYQ(sSWebView.getWebView(), BuildConfig.VERSION_CODE));
        if (Build.VERSION.SDK_INT >= 21) {
            sSWebView.setMixedContentMode(0);
        }
    }

    public void UB() {
        com.bytedance.sdk.openadsdk.mZx.Td.Kbd kbd = this.QQ;
        if (kbd != null) {
            kbd.HX();
        }
        com.bytedance.sdk.openadsdk.mZx.tp tpVar = this.Kbd;
        if (tpVar != null) {
            tpVar.QQ();
        }
    }

    public void Uc() throws JSONException {
        SSWebView sSWebView = this.hu;
        if (sSWebView != null) {
            sSWebView.MxO();
        }
        SSWebView sSWebView2 = this.UB;
        if (sSWebView2 != null) {
            sSWebView2.MxO();
        }
        if (this.XPd > 0) {
            this.Dal += SystemClock.elapsedRealtime() - this.XPd;
            this.XPd = 0L;
        }
        wBa wba = this.EYQ;
        if (wba != null) {
            wba.mZx(false);
            mZx(this.EYQ, false);
            EYQ(this.EYQ, true, false);
        }
        if (this.mZx == null || !zF.Td(this.tp)) {
            return;
        }
        this.mZx.mZx(false);
        mZx(this.mZx, false);
        EYQ(this.mZx, true, false);
    }

    public void Td(boolean z) {
        mZx(this.EYQ, z);
    }

    public void mZx(wBa wba, boolean z) throws JSONException {
        try {
            this.PI.kf.Pm(z);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", z ? 1 : 0);
            wba.EYQ(t2.g.b0, jSONObject);
        } catch (Exception unused) {
        }
    }

    public void EYQ(boolean z, boolean z2) {
        EYQ(this.EYQ, z, z2);
    }

    public void EYQ(wBa wba, boolean z, boolean z2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z);
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, z2);
            wba.EYQ("endcard_control_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void Pm(boolean z) {
        if (this.EYQ == null || this.PI.TZn.isFinishing()) {
            return;
        }
        this.PI.kf.Kbd(z);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z);
            this.EYQ.EYQ("volumeChange", jSONObject);
        } catch (Exception unused) {
        }
    }

    public void hYh() {
        SSWebView sSWebView = this.hu;
        if (sSWebView != null) {
            sSWebView.HX();
        }
        SSWebView sSWebView2 = this.UB;
        if (sSWebView2 != null) {
            sSWebView2.HX();
        }
        if (this.XPd == 0) {
            this.XPd = SystemClock.elapsedRealtime();
        }
        wBa wba = this.EYQ;
        if (wba != null) {
            wba.MxO();
            SSWebView sSWebView3 = this.hu;
            if (sSWebView3 != null) {
                if (sSWebView3.getVisibility() == 0) {
                    this.EYQ.mZx(true);
                    mZx(this.EYQ, true);
                    EYQ(this.EYQ, false, true);
                } else {
                    this.EYQ.mZx(false);
                    mZx(this.EYQ, false);
                    EYQ(this.EYQ, true, false);
                }
            }
        }
        if (this.mZx != null && zF.Td(this.tp)) {
            this.mZx.MxO();
            SSWebView sSWebView4 = this.UB;
            if (sSWebView4 != null) {
                if (sSWebView4.getVisibility() == 0) {
                    this.mZx.mZx(true);
                    mZx(this.mZx, true);
                    EYQ(this.mZx, false, true);
                    if (!this.Kbc && this.PI.EYQ.lv()) {
                        vD();
                    }
                } else {
                    this.mZx.mZx(false);
                    mZx(this.mZx, false);
                    EYQ(this.mZx, true, false);
                }
            }
        }
        com.bytedance.sdk.openadsdk.mZx.tp tpVar = this.Kbd;
        if (tpVar != null) {
            tpVar.VwS();
        }
    }

    public int zF() {
        return this.IPb;
    }

    public String WU() {
        return this.VwS;
    }

    public String XN() {
        return this.Pm;
    }

    public boolean NZ() {
        return this.Pf && !this.vD && this.hYh.get() && this.zF;
    }

    public void tPj() {
        com.bytedance.sdk.openadsdk.mZx.Td.Kbd kbd = this.QQ;
        if (kbd != null) {
            kbd.QQ();
        }
    }

    public void EYQ(boolean z, int i, String str) {
        com.bytedance.sdk.openadsdk.mZx.Td.Kbd kbd = this.QQ;
        if (kbd == null) {
            return;
        }
        if (z) {
            kbd.mZx();
        } else {
            kbd.EYQ(i, str);
        }
    }

    public void wBa() {
        com.bytedance.sdk.openadsdk.mZx.Td.Kbd kbd = this.QQ;
        if (kbd != null) {
            kbd.VwS();
        }
    }

    public void rfB() {
        com.bytedance.sdk.openadsdk.mZx.tp tpVar = this.Kbd;
        if (tpVar != null) {
            tpVar.EYQ(System.currentTimeMillis());
        }
    }

    public boolean lEs() {
        return this.HX;
    }

    public void xt() {
        com.bytedance.sdk.openadsdk.mZx.Td.Kbd kbd = this.QQ;
        if (kbd != null) {
            kbd.Td();
            this.QQ.Pm();
        }
    }

    public void Nvm() {
        com.bytedance.sdk.openadsdk.mZx.Td.Kbd kbd = this.QQ;
        if (kbd != null) {
            kbd.tp();
        }
    }

    private com.bytedance.sdk.openadsdk.mZx.Td.Kbd lRN() {
        return new com.bytedance.sdk.openadsdk.mZx.hu(zF.mZx(this.tp) ? 3 : 2, this.pi ? "rewarded_video" : "fullscreen_interstitial_ad", this.tp);
    }

    public boolean FH() {
        wBa wba = this.EYQ;
        if (wba == null) {
            return false;
        }
        return wba.HX();
    }

    @Override // com.bytedance.sdk.openadsdk.HX.IPb
    public void EYQ(int i) {
        int i2 = this.GfQ;
        if (i2 <= 0 && i > 0) {
            Pm(false);
        } else if (i2 > 0 && i == 0) {
            Pm(true);
        }
        this.GfQ = i;
    }

    public void tr() {
        tr.EYQ((View) this.hu, 0);
        tr.EYQ((View) this.UB, 8);
    }

    public void Tnp() {
        tr.EYQ((View) this.UB, 8);
    }

    public void FtN() {
        com.bytedance.sdk.openadsdk.mZx.Td.mZx(this.tp, this.MxO, "use_second_endcard", (JSONObject) null);
        this.vD = true;
        this.XPd = SystemClock.elapsedRealtime();
        try {
            this.EYQ.EYQ("click_endcard_close", (JSONObject) null);
        } catch (Exception unused) {
        }
    }

    public boolean PI() {
        return this.zF && this.hYh.get();
    }

    public boolean kf() {
        return this.dVQ;
    }

    public boolean mN() {
        SSWebView sSWebView = this.hu;
        return sSWebView == null || sSWebView.getWebView() == null;
    }

    /* compiled from: RewardFullWebViewManager.java */
    private static class mZx implements com.bytedance.sdk.openadsdk.HX.EYQ {
        private final View EYQ;

        public mZx(View view) {
            this.EYQ = view;
        }

        @Override // com.bytedance.sdk.openadsdk.HX.EYQ
        public int EYQ() {
            View view = this.EYQ;
            int measuredHeight = view != null ? view.getMeasuredHeight() : -1;
            return measuredHeight <= 0 ? tr.Pm(hu.EYQ()) : measuredHeight;
        }

        @Override // com.bytedance.sdk.openadsdk.HX.EYQ
        public int mZx() {
            View view = this.EYQ;
            int measuredWidth = view != null ? view.getMeasuredWidth() : -1;
            return measuredWidth <= 0 ? tr.Td(hu.EYQ()) : measuredWidth;
        }
    }

    /* compiled from: RewardFullWebViewManager.java */
    private static class Td implements com.bytedance.sdk.openadsdk.HX.QQ {
        private final SSWebView EYQ;

        private Td(SSWebView sSWebView) {
            this.EYQ = sSWebView;
        }

        @Override // com.bytedance.sdk.openadsdk.HX.QQ
        public void EYQ() {
            SSWebView sSWebView = this.EYQ;
            if (sSWebView == null) {
                return;
            }
            sSWebView.MxO();
        }

        @Override // com.bytedance.sdk.openadsdk.HX.QQ
        public void mZx() {
            SSWebView sSWebView = this.EYQ;
            if (sSWebView == null) {
                return;
            }
            sSWebView.nWX();
        }
    }

    public void Kbc() {
        com.bytedance.sdk.openadsdk.mZx.tp tpVar = this.Kbd;
        if (tpVar != null) {
            tpVar.Kbd();
        }
    }

    /* compiled from: RewardFullWebViewManager.java */
    private static class EYQ extends com.bytedance.sdk.openadsdk.core.mZx.EYQ implements mZx.EYQ {
        private final com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ EYQ;
        private final View.OnClickListener FtN;
        private final View mZx;

        public EYQ(com.bytedance.sdk.openadsdk.component.reward.EYQ.EYQ eyq, View view, View.OnClickListener onClickListener) {
            super(eyq.TZn, eyq.EYQ, eyq.VwS, eyq.IPb ? 7 : 5);
            this.EYQ = eyq;
            this.mZx = view;
            this.FtN = onClickListener;
            HashMap map = new HashMap();
            map.put("close_auto_click", Boolean.TRUE);
            map.put("click_scence", 2);
            EYQ(map);
            EYQ(eyq.PI.Td());
            EYQ(this);
        }

        @Override // com.bytedance.sdk.openadsdk.core.mZx.EYQ, com.bytedance.sdk.openadsdk.core.mZx.mZx, com.bytedance.sdk.openadsdk.core.mZx.Td
        public void EYQ(View view, float f, float f2, float f3, float f4, SparseArray<Td.EYQ> sparseArray, boolean z) {
            if (this.Kbd.lv()) {
                this.FtN.onClick(view);
                this.mZx.setOnTouchListener(null);
                this.mZx.setOnClickListener(this.FtN);
            } else {
                super.EYQ(view, f, f2, f3, f4, sparseArray, z);
                this.EYQ.TZn.Uc();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.mZx.mZx.EYQ
        public void EYQ(View view, int i) {
            this.mZx.setOnTouchListener(null);
            this.mZx.setOnClickListener(this.FtN);
        }
    }

    public boolean Pf() {
        return this.Kbc;
    }
}
