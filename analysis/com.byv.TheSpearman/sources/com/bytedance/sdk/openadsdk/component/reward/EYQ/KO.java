package com.bytedance.sdk.openadsdk.component.reward.EYQ;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.webkit.ProxyConfig;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.xt;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.tr;
import com.json.unity.androidbridge.AndroidBridgeConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VastEndCardManager.java */
/* loaded from: classes2.dex */
public class KO implements com.bytedance.sdk.openadsdk.HX.IPb {
    private final Activity EYQ;
    private final EYQ HX;
    private com.bytedance.sdk.openadsdk.core.mZx.VwS IPb;
    private boolean Kbd;
    private ImageView Pm;
    private volatile boolean QQ;
    private SSWebView Td;
    private boolean VwS;
    private final UB mZx;
    private int tp;

    public KO(EYQ eyq) {
        this.HX = eyq;
        this.mZx = eyq.EYQ;
        this.EYQ = eyq.TZn;
    }

    public void EYQ() {
        DeviceUtils.AudioInfoReceiver.EYQ(this);
        this.tp = DeviceUtils.VwS();
        if (this.mZx.zzY() != null) {
            this.IPb = new com.bytedance.sdk.openadsdk.core.mZx.VwS("VAST_END_CARD", this.mZx.zzY()) { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.KO.1
            };
            com.bytedance.sdk.openadsdk.core.VwS.Td Td = this.mZx.zzY().Td();
            if (Td != null) {
                final String strKbd = Td.Kbd();
                if (!TextUtils.isEmpty(strKbd)) {
                    this.Kbd = true;
                    this.Pm = (ImageView) this.EYQ.findViewById(com.bytedance.sdk.openadsdk.utils.tp.QQ);
                    EYQ(Td.mZx(), Td.Td());
                    com.bytedance.sdk.openadsdk.IPb.Pm.EYQ(strKbd).EYQ(Td.mZx()).mZx(Td.Td()).Kbd(tr.Pm(hu.EYQ())).Pm(tr.Td(hu.EYQ())).Td(2).EYQ(new com.bytedance.sdk.openadsdk.IPb.mZx(this.mZx, strKbd, new com.bytedance.sdk.component.Pm.hu<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.KO.2
                        @Override // com.bytedance.sdk.component.Pm.hu
                        public void EYQ(com.bytedance.sdk.component.Pm.MxO<Bitmap> mxO) {
                            if (KO.this.Pm == null || mxO == null) {
                                return;
                            }
                            Bitmap bitmapMZx = mxO.mZx();
                            if (bitmapMZx == null) {
                                KO.this.EYQ(-1, strKbd);
                                return;
                            }
                            KO.this.Pm.setImageBitmap(bitmapMZx);
                            KO.this.VwS = true;
                            KO.this.Pm();
                        }

                        @Override // com.bytedance.sdk.component.Pm.hu
                        public void EYQ(int i, String str, Throwable th) {
                            if (KO.this.Pm != null) {
                                KO.this.Pm.setVisibility(8);
                            }
                            KO.this.EYQ(-2, strKbd);
                        }
                    }));
                    return;
                }
                SSWebView sSWebView = (SSWebView) this.EYQ.findViewById(com.bytedance.sdk.openadsdk.utils.tp.HX);
                this.Td = sSWebView;
                if (sSWebView == null) {
                    return;
                }
                Kbd();
                String strPm = Td.Pm();
                if (strPm != null) {
                    this.Kbd = true;
                    if (strPm.startsWith(ProxyConfig.MATCH_HTTP)) {
                        this.Td.a_(strPm);
                        return;
                    }
                    String strEYQ = com.bytedance.sdk.openadsdk.core.VwS.Kbd.EYQ(strPm);
                    String str = TextUtils.isEmpty(strEYQ) ? strPm : strEYQ;
                    this.Td.setDefaultTextEncodingName("UTF -8");
                    this.Td.EYQ(null, str, "text/html", C.UTF8_NAME, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Pm() {
        EYQ(Integer.MAX_VALUE, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EYQ(final int i, final String str) {
        if (this.QQ) {
            return;
        }
        this.QQ = true;
        final String strMxO = this.mZx.zzY() != null ? this.mZx.zzY().MxO() : "";
        if (i == Integer.MAX_VALUE) {
            com.bytedance.sdk.openadsdk.mZx.Td.mZx(this.mZx, strMxO, "load_vast_endcard_success", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.mZx.Td.EYQ(new com.bytedance.sdk.component.VwS.QQ("load_vast_endcard_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.KO.3
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("reason_code", i);
                        jSONObject.put(AndroidBridgeConstants.ERROR_CODE, i);
                        String str2 = str;
                        if (str2 != null) {
                            jSONObject.put("url", str2);
                        }
                        com.bytedance.sdk.openadsdk.mZx.Td.mZx(KO.this.mZx, strMxO, "load_vast_endcard_fail", jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    private void Kbd() {
        this.Td.d_();
        EYQ(this.Td);
        this.Td.setDisplayZoomControls(false);
        this.Td.setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.KO.4
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (i == 100) {
                    KO.this.Pm();
                }
            }
        });
        this.Td.setWebViewClient(new SSWebView.EYQ() { // from class: com.bytedance.sdk.openadsdk.component.reward.EYQ.KO.5
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (KO.this.EYQ(str)) {
                    return true;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (Build.VERSION.SDK_INT < 21 || !webResourceRequest.isForMainFrame()) {
                    return;
                }
                KO.this.EYQ(webResourceResponse.getStatusCode(), webResourceRequest.getUrl() != null ? webResourceRequest.getUrl().toString() : null);
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                KO.this.Pm();
            }
        });
    }

    private void EYQ(SSWebView sSWebView) {
        sSWebView.setVerticalScrollBarEnabled(false);
        sSWebView.setHorizontalScrollBarEnabled(false);
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean EYQ(String str) {
        UB ub;
        if (str == null || (ub = this.mZx) == null || ub.zzY() == null || this.IPb == null) {
            return false;
        }
        this.mZx.zzY().VwS(str);
        this.IPb.onClick(this.Td);
        return true;
    }

    private void EYQ(int i, int i2) {
        if (i == 0 || i2 == 0 || this.Pm == null) {
            return;
        }
        int iTd = tr.Td((Context) this.EYQ);
        int iPm = tr.Pm((Context) this.EYQ);
        if (i / i2 <= iTd / iPm) {
            iTd = (int) Math.ceil(r5 * r4);
        } else {
            iPm = (int) Math.ceil(r5 / r4);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.Pm.getLayoutParams();
        layoutParams.width = iTd;
        layoutParams.height = iPm;
        this.Pm.setLayoutParams(layoutParams);
        this.Pm.setOnClickListener(this.IPb);
        this.Pm.setOnTouchListener(this.IPb);
    }

    public boolean EYQ(pi piVar) {
        com.bytedance.sdk.openadsdk.core.VwS.Td Td;
        if (!this.Kbd) {
            return false;
        }
        ImageView imageView = this.Pm;
        if (imageView != null && this.VwS) {
            imageView.setVisibility(0);
        } else {
            SSWebView sSWebView = this.Td;
            if (sSWebView != null) {
                sSWebView.setVisibility(0);
                if (this.Td.getWebView() != null) {
                    this.Td.getWebView().setOnTouchListener(this.IPb);
                }
            }
        }
        UB ub = this.mZx;
        if (ub == null || ub.zzY() == null || (Td = this.mZx.zzY().Td()) == null) {
            return true;
        }
        Td.mZx(piVar != null ? piVar.VwS() : -1L);
        return true;
    }

    public void EYQ(com.bytedance.sdk.openadsdk.core.mZx.Kbd kbd) {
        com.bytedance.sdk.openadsdk.core.mZx.VwS vwS = this.IPb;
        if (vwS != null) {
            vwS.EYQ(kbd);
        }
    }

    public void mZx() {
        DeviceUtils.AudioInfoReceiver.mZx(this);
        SSWebView sSWebView = this.Td;
        if (sSWebView != null) {
            xt.EYQ(sSWebView.getWebView());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.HX.IPb
    public void EYQ(int i) {
        int i2 = this.tp;
        if (i2 == 0 && i > 0) {
            this.mZx.zzY().EYQ().HX(this.HX.FtN.VwS());
        } else if (i2 > 0 && i == 0) {
            this.mZx.zzY().EYQ().QQ(this.HX.FtN.VwS());
        }
        this.tp = i;
    }

    public boolean Td() {
        if (!this.Kbd) {
            return false;
        }
        ImageView imageView = this.Pm;
        if (imageView != null) {
            imageView.performClick();
            return true;
        }
        SSWebView sSWebView = this.Td;
        if (sSWebView == null) {
            return false;
        }
        this.IPb.onClick(sSWebView);
        return true;
    }
}
