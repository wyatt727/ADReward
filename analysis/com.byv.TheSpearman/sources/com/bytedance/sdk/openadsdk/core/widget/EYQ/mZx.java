package com.bytedance.sdk.openadsdk.core.widget.EYQ;

import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.wBa;
import com.bytedance.sdk.openadsdk.utils.pi;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PreLoadWebView.java */
/* loaded from: classes2.dex */
public class mZx implements EYQ {
    wBa EYQ;
    private SSWebView mZx;
    private AtomicInteger Td = null;
    private boolean Pm = false;

    public void EYQ(boolean z) {
        this.Pm = z;
        if (z) {
            this.Td = new AtomicInteger(hu.Pm().GfQ());
        } else {
            this.Td = new AtomicInteger(hu.Pm().dVQ());
        }
    }

    public void mZx() {
        AtomicInteger atomicInteger = this.Td;
        if (atomicInteger == null || atomicInteger.get() > 0) {
            try {
                Integer.valueOf(this.Td.get());
                Boolean.valueOf(this.Pm);
            } catch (Exception unused) {
            }
            String strPm = com.bytedance.sdk.component.adexpress.EYQ.mZx.mZx.Pm(null);
            if (this.Pm) {
                String strPm2 = com.bytedance.sdk.component.adexpress.EYQ.mZx.mZx.Pm("v3");
                if (strPm != null && strPm.equals(strPm2)) {
                    return;
                } else {
                    strPm = strPm2;
                }
            }
            if (TextUtils.isEmpty(strPm)) {
                return;
            }
            try {
                SSWebView sSWebView = new SSWebView(new MutableContextWrapper(hu.EYQ()));
                this.mZx = sSWebView;
                if (sSWebView.getWebView() == null) {
                    return;
                }
                this.mZx.setWebViewClient(new WebViewClient() { // from class: com.bytedance.sdk.openadsdk.core.widget.EYQ.mZx.1
                    @Override // android.webkit.WebViewClient
                    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                        return true;
                    }
                });
                EYQ(this.mZx);
                Uri uriBuild = Uri.parse(strPm).buildUpon().appendQueryParameter("isPreLoad", "1").build();
                wBa wba = new wBa(this.mZx.getContext());
                this.EYQ = wba;
                wba.mZx(this.mZx).EYQ(this).EYQ(this.mZx);
                if (Build.VERSION.SDK_INT >= 17) {
                    com.bytedance.sdk.component.adexpress.Kbd.Kbd.EYQ().EYQ(this.mZx, this.EYQ);
                }
                this.mZx.a_(uriBuild.toString());
            } catch (Exception unused2) {
            }
        }
    }

    private void EYQ(SSWebView sSWebView) {
        if (sSWebView == null || sSWebView.getWebView() == null) {
            return;
        }
        try {
            Td.EYQ(hu.EYQ()).EYQ(false).EYQ(sSWebView.getWebView());
            sSWebView.setVerticalScrollBarEnabled(false);
            sSWebView.setHorizontalScrollBarEnabled(false);
            sSWebView.EYQ(true);
            sSWebView.tp();
            sSWebView.setUserAgentString(pi.EYQ(sSWebView.getWebView(), BuildConfig.VERSION_CODE));
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
            com.bytedance.sdk.component.utils.pi.EYQ("WebViewPool", e.toString());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.EYQ
    public void EYQ() {
        if (this.Pm) {
            com.bytedance.sdk.component.adexpress.Kbd.Kbd.EYQ().mZx(this.mZx);
        } else {
            com.bytedance.sdk.component.adexpress.Kbd.Kbd.EYQ().Td(this.mZx);
        }
        AtomicInteger atomicInteger = this.Td;
        if (atomicInteger != null) {
            Integer.valueOf(atomicInteger.get());
            Boolean.valueOf(this.Pm);
            this.Td.decrementAndGet();
            if (this.Td.get() > 0) {
                mZx();
            }
        }
    }
}
