package com.bytedance.sdk.openadsdk.mZx;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.widget.PangleWebView;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.zF;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.bytedance.sdk.openadsdk.utils.xt;
import com.google.android.gms.nearby.messages.Strategy;
import com.json.unity.androidbridge.AndroidBridgeConstants;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LandingPageLog.java */
/* loaded from: classes2.dex */
public class tp {
    private static final int[] EYQ = {10, 30, 50, 75, 100};
    private final AtomicInteger FH;
    private volatile int FtN;
    private int HX;
    private final AtomicBoolean IPb;
    private String KO;
    private volatile long Kbc;
    private final AtomicBoolean Kbd;
    private String MxO;
    private final AtomicInteger NZ;
    private volatile long Nvm;
    private int PI;
    private final AtomicBoolean Pf;
    private int Pm;
    private final AtomicBoolean QQ;
    private long Td;
    private final AtomicBoolean Tnp;
    private long UB;
    private long Uc;
    private final AtomicBoolean VwS;
    private boolean WU;
    private final boolean XN;
    private long hYh;
    private long hu;
    private volatile long kf;
    private boolean lEs;
    private long lRN;
    private volatile long mN;
    private int mZx;
    private final UB nWX;
    private final Context pi;
    private com.bytedance.sdk.openadsdk.mZx.Td.Kbd rfB;
    private WebView tPj;
    private boolean tp;
    private final AtomicInteger tr;
    private String tsL;
    private String vD;
    private boolean wBa;
    private HX xt;
    private long zF;

    public UB EYQ() {
        return this.nWX;
    }

    public tp(UB ub, WebView webView, HX hx, int i) {
        this(ub, webView);
        this.xt = hx;
        this.PI = i;
    }

    public tp(UB ub, WebView webView) {
        this.mZx = 0;
        this.Td = -1L;
        this.Pm = 1;
        this.Kbd = new AtomicBoolean(false);
        this.IPb = new AtomicBoolean(false);
        this.VwS = new AtomicBoolean(false);
        this.QQ = new AtomicBoolean(false);
        this.HX = -1;
        this.KO = "landingpage";
        this.hu = 0L;
        this.UB = 0L;
        this.Uc = 0L;
        this.hYh = 0L;
        this.zF = 0L;
        this.WU = false;
        this.XN = false;
        this.NZ = new AtomicInteger(0);
        this.wBa = false;
        this.lEs = false;
        this.Nvm = 0L;
        this.FH = new AtomicInteger(0);
        this.tr = new AtomicInteger(0);
        this.Tnp = new AtomicBoolean(false);
        this.FtN = 0;
        this.PI = -1;
        this.Pf = new AtomicBoolean(false);
        this.pi = com.bytedance.sdk.openadsdk.core.hu.EYQ();
        this.nWX = ub;
        this.tPj = webView;
        if (webView == null) {
            return;
        }
        if (webView instanceof PangleWebView) {
            this.lRN = ((PangleWebView) webView).EYQ;
        } else {
            this.lRN = System.currentTimeMillis();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                this.tPj.addJavascriptInterface(new EYQ(), "JS_LANDING_PAGE_LOG_OBJ");
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.pi.EYQ("LandingPageLog", "addJavascriptInterface exception", e);
            }
        }
        if (ub == null || ub.Jy() == null) {
            return;
        }
        this.Td = ub.Jy().optLong("page_id", -1L);
    }

    public void EYQ(long j) {
        this.UB = j;
    }

    public void EYQ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.KO = str;
    }

    public void EYQ(int i) {
        this.PI = i;
    }

    public com.bytedance.sdk.openadsdk.mZx.Td.Kbd mZx() {
        return this.rfB;
    }

    public void EYQ(com.bytedance.sdk.openadsdk.mZx.Td.Kbd kbd) {
        this.rfB = kbd;
    }

    public tp EYQ(boolean z) {
        this.wBa = z;
        return this;
    }

    public boolean Td() {
        return this.lEs;
    }

    public void mZx(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.vD = str;
    }

    public void mZx(boolean z) {
        this.lEs = z;
    }

    public void Pm() throws JSONException {
        if (HX()) {
            this.kf = SystemClock.elapsedRealtime();
            Td.EYQ(this.nWX, this.vD);
        }
    }

    public void Kbd() throws JSONException {
        if (HX()) {
            this.mN = SystemClock.elapsedRealtime();
            IPb();
        }
    }

    public void IPb() throws JSONException {
        if (HX() && this.mN > 0 && this.Kbc > 0 && !this.Pf.getAndSet(true)) {
            Td.EYQ(this.Kbc - this.mN, this.nWX, this.vD, (String) null);
        }
    }

    public void EYQ(WebView webView, int i) throws JSONException {
        if (webView == null) {
            return;
        }
        if (this.Nvm == 0) {
            this.Nvm = SystemClock.elapsedRealtime();
        }
        if (this.Uc == 0 && i > 0) {
            this.Uc = System.currentTimeMillis();
        } else if (this.hYh == 0 && i == 100) {
            this.hYh = System.currentTimeMillis();
        }
        if (this.mZx != EYQ.length && ("landingpage".equals(this.KO) || "landingpage_endcard".equals(this.KO) || "landingpage_split_screen".equals(this.KO) || "landingpage_direct".equals(this.KO))) {
            int i2 = this.mZx;
            while (true) {
                int[] iArr = EYQ;
                if (i2 >= iArr.length || i < iArr[this.mZx]) {
                    break;
                }
                int i3 = i2 + 1;
                this.mZx = i3;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", webView.getUrl());
                    long j = this.Td;
                    if (j != -1) {
                        jSONObject.put("page_id", j);
                    }
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("pct", iArr[i2]);
                } catch (Exception unused) {
                }
                EYQ("progress_load_finish", jSONObject);
                i2 = i3;
            }
        }
        if (i == 100) {
            EYQ(webView.getUrl(), "progress", Math.min(this.hYh - this.Uc, TTAdConstant.AD_MAX_EVENT_TIME));
        }
    }

    private void EYQ(String str, String str2, long j) throws JSONException {
        if (this.VwS.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (str.length() > 200) {
                    int iIndexOf = str.indexOf(38, 200);
                    int i = Strategy.TTL_SECONDS_DEFAULT;
                    if (iIndexOf == -1 || iIndexOf > 300) {
                        iIndexOf = str.indexOf(63);
                    }
                    if (iIndexOf != -1 && iIndexOf <= 300) {
                        i = iIndexOf;
                    }
                    str = str.substring(0, i);
                }
                jSONObject.put("url", str);
                jSONObject.put("type", str2);
            } catch (Throwable unused) {
            }
            EYQ("load_finish_progress", jSONObject, j);
        }
    }

    public void EYQ(WebView webView, String str, Bitmap bitmap) throws JSONException {
        WebView webView2 = this.tPj;
        if (webView2 != null) {
            try {
                WebBackForwardList webBackForwardListCopyBackForwardList = webView2.copyBackForwardList();
                if (webBackForwardListCopyBackForwardList != null && webBackForwardListCopyBackForwardList.getCurrentIndex() > this.FtN) {
                    this.FH.incrementAndGet();
                }
                this.FtN = webBackForwardListCopyBackForwardList.getCurrentIndex();
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.pi.EYQ("LandingPageLog", "copyBackForwardList exception", e);
            }
        }
        if (this.Nvm == 0) {
            this.Nvm = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.mZx.Td.Kbd kbd = this.rfB;
        if (kbd != null) {
            kbd.Kbd();
        }
        if (this.Kbd.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
                int i = this.PI;
                if (i >= 0) {
                    jSONObject.putOpt("preload_status", Integer.valueOf(i));
                }
            } catch (Exception unused) {
            }
            EYQ("load_start", jSONObject);
        }
    }

    public void EYQ(WebView webView, String str, boolean z) throws JSONException {
        com.bytedance.sdk.openadsdk.mZx.Td.Kbd kbd = this.rfB;
        if (kbd != null) {
            kbd.IPb();
        }
        if (webView != null && !this.WU && this.wBa) {
            this.WU = true;
            com.bytedance.sdk.component.utils.tsL.EYQ(webView, "javascript:\nfunction sendScroll(){\n   var totalH = document.body.scrollHeight || document.documentElement.scrollHeight;\n   var clientH = window.innerHeight || document.documentElement.clientHeight;\n   var scrollH = document.body.scrollTop || document.documentElement.scrollTop;\n   var validH = scrollH + clientH;\n   var result = (validH/totalH*100).toFixed(2);\n   console.log('LandingPageLogscroll status: (' + scrollH + '+' + clientH + ')/' + totalH + '=' + result);\n   window.JS_LANDING_PAGE_LOG_OBJ.readPercent(result);\n}\nsendScroll();\nwindow.addEventListener('scroll', function(e){\n    sendScroll();\n});");
        }
        if (this.IPb.compareAndSet(false, true)) {
            if (this.Pm != 3) {
                this.Pm = 2;
            }
            this.hu = System.currentTimeMillis();
            boolean z2 = this.Pm == 2;
            int iTp = tp();
            if (z2) {
                long j = this.hYh - this.Uc;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(AndroidBridgeConstants.ERROR_CODE, this.HX);
                    jSONObject.put("error_msg", this.MxO);
                    jSONObject.put("error_url", this.tsL);
                    int i = this.PI;
                    if (i >= 0) {
                        jSONObject.put("preload_status", i);
                    }
                    jSONObject.put("first_page", iTp);
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("url", this.nWX.XPd());
                    jSONObject.put("preload_h5_type", this.nWX.Fw());
                } catch (Exception unused) {
                }
                EYQ(z, "0");
                long jMin = Math.min(j, TTAdConstant.AD_MAX_EVENT_TIME);
                EYQ("load_finish", jSONObject, jMin);
                if (HX()) {
                    this.Kbc = SystemClock.elapsedRealtime();
                    IPb();
                    Td.EYQ(this.nWX, this.vD, this.Kbc - this.kf);
                }
                EYQ(str, "load_finish", jMin);
                HX hx = this.xt;
                if (hx != null) {
                    hx.EYQ(iTp);
                    return;
                }
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(AndroidBridgeConstants.ERROR_CODE, this.HX);
                jSONObject2.put("error_msg", this.MxO);
                jSONObject2.put("error_url", this.tsL);
                jSONObject2.put("first_page", iTp);
                int i2 = this.PI;
                if (i2 >= 0) {
                    jSONObject2.put("preload_status", i2);
                }
                jSONObject2.putOpt("render_type", "h5");
                jSONObject2.putOpt("render_type_2", 0);
                jSONObject2.put("url", this.nWX.XPd());
                jSONObject2.put("preload_h5_type", this.nWX.Fw());
            } catch (Exception unused2) {
            }
            EYQ(z, "2");
            EYQ("load_fail", jSONObject2);
            if (HX()) {
                Td.EYQ(this.nWX, this.vD, SystemClock.elapsedRealtime() - this.kf, this.HX, this.MxO, this.tsL);
            }
            if (this.tp) {
                jSONObject2.remove("render_type");
                jSONObject2.remove("render_type_2");
                EYQ("load_fail_main", jSONObject2);
            }
        }
    }

    private boolean HX() {
        UB ub;
        return this.lEs && (ub = this.nWX) != null && ub.Jx();
    }

    private String Td(String str) {
        return "javascript:".concat(String.valueOf(str));
    }

    public void EYQ(WebView webView, int i, String str, String str2, String str3, boolean z) {
        com.bytedance.sdk.openadsdk.mZx.Td.Kbd kbd = this.rfB;
        if (kbd != null) {
            kbd.EYQ((JSONObject) null);
        }
        if (!(str3 != null && str3.startsWith("image")) && this.Pm != 2) {
            this.Pm = 3;
        }
        this.HX = i;
        this.MxO = str;
        this.tsL = str2;
        this.tp = z;
    }

    public void VwS() {
        if (this.zF == 0) {
            this.zF = System.currentTimeMillis();
        }
        this.hu = System.currentTimeMillis();
    }

    public void QQ() {
        if ("landingpage".equals(this.KO) || "landingpage_endcard".equals(this.KO) || "landingpage_split_screen".equals(this.KO) || "landingpage_direct".equals(this.KO)) {
            if (this.Pm == 2) {
                if (this.UB > 0 || !Td()) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - Math.max(this.hu, this.UB);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("load_status", this.Pm);
                        jSONObject.put("max_scroll_percent", this.NZ.get());
                        jSONObject.put("jump_times", this.FH.getAndSet(0));
                        jSONObject.put("click_times", this.tr.getAndSet(0));
                        jSONObject.putOpt("render_type", "h5");
                        jSONObject.putOpt("render_type_2", 0);
                    } catch (JSONException unused) {
                    }
                    this.QQ.set(true);
                    EYQ("stay_page", jSONObject, Math.min(jCurrentTimeMillis, TTAdConstant.AD_MAX_EVENT_TIME));
                }
            }
        }
    }

    public void EYQ(SSWebView sSWebView) {
        int iVEW;
        Bitmap bitmapEYQ;
        UB ub;
        if ((!"landingpage".equals(this.KO) && !"landingpage_endcard".equals(this.KO) && !"landingpage_split_screen".equals(this.KO) && !"landingpage_direct".equals(this.KO)) || (iVEW = com.bytedance.sdk.openadsdk.core.hu.Pm().VEW()) == 0 || new Random().nextInt(100) + 1 > iVEW || sSWebView == null || sSWebView.getWebView() == null || sSWebView.getVisibility() != 0 || (bitmapEYQ = tr.EYQ(sSWebView)) == null || (ub = this.nWX) == null) {
            return;
        }
        tr.EYQ(ub, this.KO, "landing_page_blank", bitmapEYQ, sSWebView.getUrl(), this.Td);
    }

    public void Td(boolean z) {
        WebView webView = this.tPj;
        if (webView != null) {
            try {
                webView.removeJavascriptInterface("JS_LANDING_PAGE_LOG_OBJ");
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.pi.EYQ("LandingPageLog", "removeJavascriptInterface exception", e);
            }
        }
        if (this.IPb.compareAndSet(false, true)) {
            EYQ(z, "1");
            if (this.wBa) {
                Td.EYQ(this.nWX, this.KO, System.currentTimeMillis() - this.zF, this.PI, tp());
            }
        } else if (this.Pm == 2 && !this.QQ.get()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("load_status", this.Pm);
                jSONObject.put("max_scroll_percent", this.NZ.get());
                jSONObject.put("jump_times", this.FH.getAndSet(0));
                jSONObject.put("click_times", this.tr.getAndSet(0));
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
            } catch (JSONException unused) {
            }
            EYQ("stay_page", jSONObject, 0L);
        }
        this.tPj = null;
    }

    private void EYQ(String str, JSONObject jSONObject) throws JSONException {
        EYQ(str, jSONObject, -1L);
    }

    private void EYQ(String str, JSONObject jSONObject, long j) throws JSONException {
        if (!this.wBa || this.nWX == null || TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jSONObject2 = null;
        if (jSONObject != null) {
            try {
                int i = 1;
                jSONObject.put("is_playable", zF.mZx(this.nWX) ? 1 : 0);
                if (!com.bytedance.sdk.openadsdk.core.video.mZx.EYQ.EYQ().EYQ(this.nWX)) {
                    i = 0;
                }
                jSONObject.put("usecache", i);
            } catch (JSONException unused) {
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("ad_extra_data", jSONObject.toString());
                    if (j > 0) {
                        jSONObject3.put("duration", j);
                    }
                } catch (JSONException unused2) {
                }
                jSONObject2 = jSONObject3;
            } catch (JSONException unused3) {
            }
        }
        Td.Td(this.nWX, this.KO, str, jSONObject2);
    }

    /* compiled from: LandingPageLog.java */
    private class EYQ {
        @JavascriptInterface
        public String getUrl() {
            return "";
        }

        private EYQ() {
        }

        @JavascriptInterface
        public void readPercent(String str) {
            int i = 0;
            try {
                int iIntValue = Float.valueOf(str).intValue();
                if (iIntValue > 100) {
                    i = 100;
                } else if (iIntValue >= 0) {
                    i = iIntValue;
                }
            } catch (Throwable unused) {
            }
            tp.this.NZ.set(i);
        }
    }

    public void mZx(int i) {
        if (this.Nvm != 0) {
            if (i == 1 || i == 3) {
                this.tr.incrementAndGet();
                if (this.Tnp.getAndSet(true)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", this.nWX.XPd());
                } catch (JSONException unused) {
                }
                EYQ("click_time", jSONObject, Math.max(SystemClock.elapsedRealtime() - this.Nvm, 0L));
            }
        }
    }

    private void EYQ(boolean z, final String str) {
        if (z) {
            final int iTp = tp();
            Td.EYQ(new com.bytedance.sdk.component.VwS.QQ("sendPrefLog") { // from class: com.bytedance.sdk.openadsdk.mZx.tp.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.bytedance.sdk.openadsdk.core.settings.IPb iPbRfB = com.bytedance.sdk.openadsdk.core.hu.Pm().rfB();
                        boolean zEYQ = tp.this.EYQ(iPbRfB, str);
                        if (zEYQ) {
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.IPb.mZx)) {
                                tp.this.EYQ(iTp, str);
                                return;
                            }
                            if (TextUtils.isEmpty(iPbRfB.Td) || !zEYQ) {
                                return;
                            }
                            String str2 = iPbRfB.Td;
                            com.bytedance.sdk.component.IPb.mZx.mZx mzxTd = com.bytedance.sdk.openadsdk.MxO.Td.EYQ().mZx().Td();
                            mzxTd.EYQ(str2);
                            HashMap map = new HashMap();
                            map.put("content-type", "application/json; charset=utf-8");
                            mzxTd.Pm(map);
                            mzxTd.EYQ(new com.bytedance.sdk.component.IPb.EYQ.EYQ() { // from class: com.bytedance.sdk.openadsdk.mZx.tp.1.1
                                @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
                                public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, IOException iOException) {
                                }

                                @Override // com.bytedance.sdk.component.IPb.EYQ.EYQ
                                public void EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, com.bytedance.sdk.component.IPb.mZx mzx) {
                                    try {
                                        com.bytedance.sdk.openadsdk.core.settings.IPb.mZx = mzx.Pm();
                                        tp.this.EYQ(iTp, str);
                                    } catch (Exception e) {
                                        com.bytedance.sdk.component.utils.pi.EYQ("LandingPageLog", "TTWebViewClient : onPageFinished", e);
                                    }
                                }
                            });
                        }
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.pi.mZx(th.getMessage());
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(int i, String str) {
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.IPb.mZx)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder(com.bytedance.sdk.openadsdk.core.settings.IPb.mZx);
            jSONObject.putOpt("cid", EYQ().VOV());
            jSONObject.putOpt("ad_id", EYQ().VOV());
            jSONObject.put("log_extra", EYQ().GfQ());
            FH.EYQ(sb, "\"/** adInfo **/\"", jSONObject.toString());
            FH.EYQ(sb, "\"/** first_page **/\"", String.valueOf(i));
            FH.EYQ(sb, "\"/** ix_to_externalurl **/\"", this.Td != -1 ? "1" : "0");
            FH.EYQ(sb, "\"/** preload_status **/\"", this.PI == 2 ? "2" : "0");
            FH.EYQ(sb, "\"/** scene_state **/\"", str);
            FH.EYQ(sb, "\"/** web_init_time **/\"", String.valueOf(this.lRN));
            FH.EYQ(sb, "\"/** channel_name **/\"", "\"" + EYQ().Dd() + "\"");
            FH.EYQ(sb, "\"/** session_id **/\"", "\"" + UUID.randomUUID().toString() + "\"");
            FH.EYQ(sb, "\"/** web_url **/\"", "\"" + EYQ().XPd() + "\"");
            String string = sb.toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            final String strTd = Td(string);
            if (TextUtils.isEmpty(strTd) || this.tPj == null) {
                return;
            }
            xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.mZx.tp.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.utils.tsL.EYQ(tp.this.tPj, strTd);
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.mZx(th.getMessage());
        }
    }

    private int tp() {
        WebView webView = this.tPj;
        if (webView != null) {
            try {
                WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
                if (webBackForwardListCopyBackForwardList != null) {
                    if (webBackForwardListCopyBackForwardList.getCurrentIndex() == 0) {
                        return 1;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean EYQ(com.bytedance.sdk.openadsdk.core.settings.IPb iPb, String str) {
        str.hashCode();
        switch (str) {
            case "0":
                return iPb.Pm;
            case "1":
                return iPb.Kbd;
            case "2":
                return iPb.IPb;
            default:
                return false;
        }
    }
}
