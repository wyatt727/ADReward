package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.R;
import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.model.Uc;
import com.bytedance.sdk.openadsdk.core.wBa;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.bytedance.sdk.openadsdk.utils.lEs;
import com.bytedance.sdk.openadsdk.utils.xt;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WebViewRender.java */
/* loaded from: classes2.dex */
public class UB extends com.bytedance.sdk.component.adexpress.Kbd.EYQ {
    private String HX;
    private final Map<String, com.com.bytedance.overseas.sdk.EYQ.Td> KO;
    private JSONObject MxO;
    private Context QQ;
    private com.bytedance.sdk.component.adexpress.mZx.VwS UB;
    private UB.EYQ Uc;
    com.bytedance.sdk.openadsdk.utils.EYQ VwS;
    private final com.bytedance.sdk.component.VwS.QQ WU;
    private final Runnable XN;
    private volatile int hYh;
    private wBa hu;
    private com.bytedance.sdk.openadsdk.mZx.tp nWX;
    private String pi;
    private com.bytedance.sdk.openadsdk.core.model.UB tp;
    private com.bytedance.sdk.openadsdk.mZx.Td.Kbd tsL;
    private QQ zF;

    public UB(Context context, com.bytedance.sdk.component.adexpress.mZx.pi piVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.openadsdk.mZx.Td.Kbd kbd, com.bytedance.sdk.openadsdk.core.model.UB ub) {
        super(context, piVar, themeStatusBroadcastReceiver);
        this.KO = Collections.synchronizedMap(new HashMap());
        this.hYh = 0;
        this.WU = new com.bytedance.sdk.component.VwS.QQ("webviewrender_template") { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.UB.1
            @Override // java.lang.Runnable
            public void run() {
                if (UB.this.IPb.get()) {
                    return;
                }
                if ((UB.this.tp instanceof Uc) && ((Uc) UB.this.tp).oFG()) {
                    UB.this.mZx(true);
                }
                UB ub2 = UB.this;
                ub2.MxO = ub2.MxO().Td();
                UB ub3 = UB.this;
                ub3.EYQ(ub3.MxO);
                if (UB.this.tp != null && UB.this.tp.PI() != null) {
                    UB ub4 = UB.this;
                    ub4.Kbd = com.bytedance.sdk.component.adexpress.EYQ.mZx.mZx.Td(ub4.tp.PI().Kbd());
                }
                if (UB.this.hYh == 0) {
                    UB.this.UB();
                }
                com.bytedance.sdk.openadsdk.core.pi.Td().post(UB.this.XN);
            }
        };
        this.XN = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.UB.2
            @Override // java.lang.Runnable
            public void run() {
                if (UB.this.IPb.get() || UB.this.UB == null) {
                    return;
                }
                UB.this.tsL();
                UB ub2 = UB.this;
                UB.super.EYQ(ub2.UB);
            }
        };
        if (this.Td == null) {
            return;
        }
        this.QQ = context;
        this.HX = piVar.Pm();
        this.tp = ub;
        this.tsL = kbd;
        themeStatusBroadcastReceiver.EYQ(this);
        UB();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void UB() {
        if (this.Td.getWebView() != null && xt.Kbd()) {
            Uc();
        } else {
            this.hYh = 1;
            xt.EYQ(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.UB.3
                @Override // java.lang.Runnable
                public void run() {
                    UB.this.Uc();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Uc() {
        if (this.Td == null || this.Td.getWebView() == null || this.hYh == 2) {
            return;
        }
        this.pi = EYQ(this.tp);
        this.Td.setDisplayZoomControls(false);
        EYQ(lEs.EYQ(this.pi));
        pi();
        wBa wba = new wBa(this.QQ);
        this.hu = wba;
        wba.Pm(true);
        nWX();
        this.hYh = 2;
    }

    public static String EYQ(com.bytedance.sdk.openadsdk.core.model.UB ub) {
        UB.EYQ eyqPI;
        return com.bytedance.sdk.component.adexpress.EYQ.mZx.mZx.Pm((ub == null || (eyqPI = ub.PI()) == null) ? null : eyqPI.tsL());
    }

    public void tsL() {
        wBa wba;
        if (this.Td == null || this.Td.getWebView() == null || (wba = this.hu) == null) {
            return;
        }
        wba.mZx(this.Td).EYQ(this.tp).Td(this.tp.VOV()).Pm(this.tp.GfQ()).mZx(FH.EYQ(this.HX)).Kbd(this.tp.TfI()).EYQ(this).EYQ(this.MxO).EYQ(this.Td).EYQ(this.tsL);
    }

    public void pi() {
        com.bytedance.sdk.openadsdk.core.model.UB ub = this.tp;
        if (ub == null || ub.PI() == null) {
            return;
        }
        this.Uc = this.tp.PI();
    }

    public void nWX() {
        if (this.Td == null || this.Td.getWebView() == null) {
            return;
        }
        this.Td.setBackgroundColor(0);
        this.Td.setBackgroundResource(R.color.transparent);
        EYQ(this.Td);
        if (EYQ() != null) {
            this.nWX = new com.bytedance.sdk.openadsdk.mZx.tp(this.tp, EYQ().getWebView()).EYQ(false);
        }
        this.nWX.EYQ(this.tsL);
        this.zF = new QQ(this.QQ, this.hu, this.tp, this.nWX);
        this.Td.setWebViewClient(this.zF);
        this.Td.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.EYQ.Pm(this.hu, this.nWX));
        if (Build.VERSION.SDK_INT >= 17) {
            com.bytedance.sdk.component.adexpress.Kbd.Kbd.EYQ().EYQ(this.Td, this.hu);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.Kbd.EYQ
    protected void HX() {
        super.HX();
        com.bytedance.sdk.openadsdk.utils.EYQ eyqKbd = com.bytedance.sdk.openadsdk.core.nWX.EYQ().Kbd();
        this.VwS = eyqKbd;
        eyqKbd.EYQ(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.Kbd.EYQ
    protected void tp() {
        super.tp();
        com.bytedance.sdk.openadsdk.utils.EYQ eyq = this.VwS;
        if (eyq != null) {
            eyq.mZx(this);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.Kbd.EYQ, com.bytedance.sdk.component.adexpress.mZx.Pm
    public void EYQ(com.bytedance.sdk.component.adexpress.mZx.VwS vwS) {
        this.UB = vwS;
        xt.mZx(this.WU);
    }

    private void EYQ(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.EYQ.Td.EYQ(this.QQ).EYQ(false).EYQ(sSWebView.getWebView());
            sSWebView.setVerticalScrollBarEnabled(false);
            sSWebView.setHorizontalScrollBarEnabled(false);
            sSWebView.EYQ(true);
            sSWebView.tp();
            sSWebView.setUserAgentString(com.bytedance.sdk.openadsdk.utils.pi.EYQ(sSWebView.getWebView(), BuildConfig.VERSION_CODE));
            if (Build.VERSION.SDK_INT >= 21) {
                sSWebView.setMixedContentMode(0);
            }
            sSWebView.setJavaScriptEnabled(true);
            sSWebView.setJavaScriptCanOpenWindowsAutomatically(true);
            sSWebView.setDomStorageEnabled(true);
            sSWebView.setDatabaseEnabled(true);
            sSWebView.setAppCacheEnabled(true);
            sSWebView.setAllowFileAccess(false);
            sSWebView.setSupportZoom(true);
            sSWebView.setBuiltInZoomControls(true);
            sSWebView.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            sSWebView.setUseWideViewPort(true);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.pi.EYQ("TTAD.WebViewRender", e.toString());
        }
    }

    public QQ KO() {
        return this.zF;
    }

    @Override // com.bytedance.sdk.component.adexpress.Kbd.EYQ
    public SSWebView EYQ() {
        return this.Td;
    }

    @Override // com.bytedance.sdk.component.adexpress.Kbd.EYQ
    public void Pm() {
        if (this.IPb.get()) {
            return;
        }
        wBa wba = this.hu;
        if (wba != null) {
            wba.mZx();
            this.hu.tsL();
            this.hu = null;
        }
        com.bytedance.sdk.openadsdk.mZx.tp tpVar = this.nWX;
        if (tpVar != null) {
            tpVar.Td(false);
        }
        super.Pm();
        com.bytedance.sdk.openadsdk.core.pi.Td().removeCallbacks(this.XN);
        this.KO.clear();
    }

    @Override // com.bytedance.sdk.component.adexpress.Kbd.EYQ
    public void IPb() {
        if (EYQ() == null) {
            return;
        }
        try {
            EYQ().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.Kbd.EYQ
    public void QQ() {
        super.QQ();
        if (this.hu == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("expressShow", true);
            this.hu.EYQ("expressShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.Kbd.EYQ
    public void VwS() {
        wBa wba = this.hu;
        if (wba == null) {
            return;
        }
        wba.EYQ("expressWebviewRecycle", (JSONObject) null);
    }

    @Override // com.bytedance.sdk.component.adexpress.Kbd.EYQ
    public void mZx(int i) {
        if (i == this.Pm) {
            return;
        }
        this.Pm = i;
        Td(i == 0);
    }

    private void Td(boolean z) throws JSONException {
        if (this.hu == null || this.Td == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adVisible", z);
            this.hu.EYQ("expressAdShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    public wBa hu() {
        return this.hu;
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.EYQ
    public void EYQ(int i) throws JSONException {
        if (this.hu == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i);
        } catch (JSONException unused) {
        }
        this.hu.EYQ("themeChange", jSONObject);
    }

    public static boolean mZx(String str) {
        return "banner_call".equals(str) || "banner_ad".equals(str) || "slide_banner_ad".equals(str) || "banner_ad_landingpage".equals(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.Kbd.EYQ, com.bytedance.sdk.component.adexpress.mZx.MxO
    public void EYQ(com.bytedance.sdk.component.adexpress.mZx.nWX nwx) {
        super.EYQ(nwx);
        if (this.mZx) {
            com.bytedance.sdk.component.utils.QQ.mZx().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.UB.4
                @Override // java.lang.Runnable
                public void run() {
                    WebView webView = UB.this.Td.getWebView();
                    if (webView != null) {
                        webView.resumeTimers();
                    }
                }
            }, 2000L);
        }
    }
}
