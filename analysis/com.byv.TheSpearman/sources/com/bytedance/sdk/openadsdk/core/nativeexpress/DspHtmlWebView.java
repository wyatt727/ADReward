package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.api.PangleAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.lEs;
import com.bytedance.sdk.openadsdk.core.nativeexpress.mZx;
import com.bytedance.sdk.openadsdk.utils.FH;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.json.unity.androidbridge.AndroidBridgeConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DspHtmlWebView extends SSWebView implements mZx.Td {
    protected boolean EYQ;
    private int HX;
    private Td IPb;
    private hu Kbd;
    private mZx MxO;
    AtomicBoolean Pm;
    private String QQ;
    AtomicBoolean Td;
    private com.bytedance.sdk.openadsdk.core.model.UB VwS;
    protected boolean mZx;
    private long pi;
    private List<String> tp;
    private int tsL;

    public interface mZx {
        View EYQ();

        void EYQ(int i, int i2);

        void EYQ(View view, int i);

        void c_();

        View mZx();
    }

    public DspHtmlWebView(Context context) {
        super(context);
        this.EYQ = false;
        this.mZx = false;
        this.Td = new AtomicBoolean(false);
        this.Pm = new AtomicBoolean(false);
        this.HX = 0;
    }

    public void EYQ(com.bytedance.sdk.openadsdk.core.model.UB ub, mZx mzx, String str) {
        this.MxO = mzx;
        this.VwS = ub;
        this.QQ = str;
        this.IPb = new Td();
        this.Kbd = new hu(getContext());
        setWebViewClient(new EYQ(this));
        setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                DspHtmlWebView.this.tsL = i;
                super.onProgressChanged(webView, i);
                if (i >= 100) {
                    DspHtmlWebView.this.EYQ();
                }
            }
        });
        com.bytedance.sdk.component.utils.QQ.mZx().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.2
            @Override // java.lang.Runnable
            public void run() {
                WebView webView = DspHtmlWebView.this.getWebView();
                if (webView != null) {
                    webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.2.1
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            DspHtmlWebView.this.Kbd.onTouchEvent(motionEvent);
                            return false;
                        }
                    });
                }
            }
        });
    }

    private void UB() {
        if (this.tp == null) {
            com.bytedance.sdk.openadsdk.mZx.Td.mZx(this.VwS, this.QQ, "dsp_html_success_url", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(new com.bytedance.sdk.component.VwS.QQ("dsp_html_error_url") { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.3
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    try {
                        if (DspHtmlWebView.this.tp != null && DspHtmlWebView.this.Pm.compareAndSet(false, true)) {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            Iterator it = DspHtmlWebView.this.tp.iterator();
                            while (it.hasNext()) {
                                jSONArray.put((String) it.next());
                            }
                            jSONObject.put("url", jSONArray);
                            com.bytedance.sdk.openadsdk.mZx.Td.mZx(DspHtmlWebView.this.VwS, DspHtmlWebView.this.QQ, "dsp_html_error_url", jSONObject);
                            DspHtmlWebView.this.tp = null;
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.widget.SSWebView
    public void tsL() {
        super.tsL();
        this.IPb.mZx();
    }

    public void EYQ(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        this.IPb.EYQ(view, friendlyObstructionPurpose);
    }

    @Override // com.bytedance.sdk.component.widget.SSWebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.EYQ) {
            this.IPb.EYQ(getWebView());
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        this.mZx = z;
        this.IPb.EYQ(z);
    }

    @Override // com.bytedance.sdk.component.widget.SSWebView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rate", this.tsL / 100.0f);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.mZx.Td.mZx(this.VwS, this.QQ, "load_rate", jSONObject);
        this.IPb.EYQ();
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.mZx.Td
    public void EYQ(String str) throws JSONException {
        String str2;
        String str3;
        View view;
        if (TextUtils.isEmpty(str) || this.VwS == null || !this.Kbd.mZx()) {
            return;
        }
        int iEYQ = FH.EYQ(this.QQ);
        View view2 = null;
        if (com.bytedance.sdk.component.utils.hu.EYQ(str) || !(this.VwS.dVQ() == null || TextUtils.isEmpty(this.VwS.dVQ().EYQ()))) {
            str2 = str;
        } else {
            com.bytedance.sdk.openadsdk.core.model.tp tpVar = new com.bytedance.sdk.openadsdk.core.model.tp();
            tpVar.EYQ(str);
            this.VwS.EYQ(tpVar);
            str2 = null;
        }
        this.VwS.EYQ(true);
        boolean zEYQ = false;
        com.bytedance.sdk.openadsdk.core.model.UB ub = this.VwS;
        if (ub == null || ub.dVQ() == null || TextUtils.isEmpty(this.VwS.dVQ().EYQ()) || (zEYQ = lEs.EYQ(getContext(), this.VwS, iEYQ, this.QQ, true, (Map<String, Object>) null)) || TextUtils.isEmpty(this.VwS.dVQ().mZx())) {
            str3 = str2;
        } else {
            String strMZx = this.VwS.dVQ().mZx();
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(this.VwS, this.QQ, "open_fallback_url", (Map<String, Object>) null);
            str3 = strMZx;
        }
        if (!zEYQ) {
            if (TextUtils.isEmpty(str3)) {
                return;
            } else {
                lEs.EYQ(getContext(), this.VwS, iEYQ, (PAGNativeAd) null, (PangleAd) null, this.QQ, true, str3);
            }
        }
        if (this.Kbd != null) {
            mZx mzx = this.MxO;
            if (mzx != null) {
                View viewEYQ = mzx.EYQ();
                View viewMZx = this.MxO.mZx();
                this.MxO.EYQ(this, 2);
                view2 = viewMZx;
                view = viewEYQ;
            } else {
                view = null;
            }
            com.bytedance.sdk.openadsdk.core.model.HX hxEYQ = this.Kbd.EYQ(getContext(), view2, view);
            HashMap map = new HashMap();
            map.put("click_scence", 1);
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(CampaignEx.JSON_NATIVE_VIDEO_CLICK, this.VwS, hxEYQ, this.QQ, true, (Map<String, Object>) map, this.Kbd.mZx() ? 1 : 2);
        }
        hu huVar = this.Kbd;
        if (huVar != null) {
            huVar.EYQ();
        }
    }

    public void KO() {
        mZx mzx = this.MxO;
        if (mzx != null) {
            mzx.c_();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.pi);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.mZx.Td.mZx(this.VwS, this.QQ, "render_html_success", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.mZx.Td
    public void EYQ(int i, int i2) {
        mZx mzx = this.MxO;
        if (mzx != null) {
            mzx.EYQ(i, i2);
        }
        this.HX = i2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AndroidBridgeConstants.ERROR_CODE, i2);
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.pi);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.mZx.Td.mZx(this.VwS, this.QQ, "render_html_fail", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.mZx.Td
    public void mZx(String str) {
        if (this.tp == null) {
            this.tp = new ArrayList();
        }
        this.tp.add(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.mZx.Td
    public void EYQ() {
        if (this.Td.compareAndSet(false, true)) {
            this.EYQ = true;
            this.IPb.EYQ(getWebView());
            this.IPb.EYQ(this.mZx);
            KO();
            UB();
        }
    }

    public void hu() {
        this.Td.set(false);
        String strVC = this.VwS.VC();
        if (TextUtils.isEmpty(strVC)) {
            return;
        }
        String strEYQ = com.bytedance.sdk.openadsdk.core.VwS.Kbd.EYQ(strVC);
        String str = TextUtils.isEmpty(strEYQ) ? strVC : strEYQ;
        this.HX = 0;
        EYQ(null, str, "text/html", C.UTF8_NAME, null);
        this.pi = SystemClock.elapsedRealtime();
    }

    static class EYQ extends SSWebView.EYQ {
        public static final Set<String> EYQ = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.EYQ.1
            {
                add(".jpeg");
                add(".png");
                add(".bmp");
                add(".gif");
                add(".jpg");
                add(".webp");
            }
        };
        mZx.Td mZx;

        public EYQ(mZx.Td td) {
            this.mZx = td;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.mZx.EYQ(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest == null || webResourceResponse == null || Build.VERSION.SDK_INT < 21 || webResourceRequest.getUrl() == null) {
                return;
            }
            if (webResourceRequest.isForMainFrame()) {
                EYQ(webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), "");
            }
            EYQ(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            if (Build.VERSION.SDK_INT < 21) {
                EYQ(str2, i, str);
                EYQ(str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (Build.VERSION.SDK_INT < 21 || webResourceRequest == null || webResourceRequest.getUrl() == null) {
                return;
            }
            EYQ(webResourceRequest.getUrl().toString());
        }

        private void EYQ(String str) {
            int iLastIndexOf;
            mZx.Td td;
            if (!TextUtils.isEmpty(str) && (iLastIndexOf = str.lastIndexOf(".")) > 0) {
                if (!EYQ.contains(str.substring(iLastIndexOf).toLowerCase()) || (td = this.mZx) == null) {
                    return;
                }
                td.mZx(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            mZx.Td td = this.mZx;
            if (td != null) {
                td.EYQ();
            }
        }

        private void EYQ(String str, int i, String str2) {
            mZx.Td td = this.mZx;
            if (td != null) {
                td.EYQ(106, i);
            }
        }
    }

    public static class Td {
        protected int EYQ = 0;
        private com.bytedance.sdk.openadsdk.core.VwS.IPb mZx = com.bytedance.sdk.openadsdk.core.VwS.IPb.EYQ();

        Td() {
        }

        public void EYQ(WebView webView) {
            if (webView != null && this.EYQ == 0) {
                if (this.mZx == null) {
                    this.mZx = com.bytedance.sdk.openadsdk.core.VwS.IPb.EYQ();
                }
                this.mZx.EYQ(webView);
                this.mZx.mZx();
                this.EYQ = 1;
            }
        }

        public void EYQ(boolean z) {
            com.bytedance.sdk.openadsdk.core.VwS.IPb iPb;
            if (this.EYQ == 1 && z && (iPb = this.mZx) != null) {
                iPb.Td();
                this.EYQ = 3;
            }
        }

        public void EYQ(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
            com.bytedance.sdk.openadsdk.core.VwS.IPb iPb = this.mZx;
            if (iPb != null) {
                iPb.EYQ(view, friendlyObstructionPurpose);
            }
        }

        public void EYQ() {
            com.bytedance.sdk.openadsdk.core.VwS.IPb iPb;
            int i = this.EYQ;
            if (i != 0 && i != 4 && (iPb = this.mZx) != null) {
                iPb.Pm();
            }
            this.EYQ = 4;
            this.mZx = null;
        }

        public void mZx() {
            EYQ();
        }
    }
}
