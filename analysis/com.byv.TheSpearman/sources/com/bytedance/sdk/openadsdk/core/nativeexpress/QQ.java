package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.ProxyConfig;
import com.bytedance.sdk.component.adexpress.Pm.VwS;
import com.bytedance.sdk.openadsdk.core.wBa;
import com.json.m4;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ExpressClient.java */
/* loaded from: classes2.dex */
public class QQ extends com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd {
    public ArrayList<Integer> EYQ;
    private final com.bytedance.sdk.openadsdk.core.model.UB mZx;

    public QQ(Context context, wBa wba, com.bytedance.sdk.openadsdk.core.model.UB ub, com.bytedance.sdk.openadsdk.mZx.tp tpVar) {
        super(context, wba, ub.VOV(), tpVar, false);
        this.EYQ = new ArrayList<>();
        this.mZx = ub;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("ExpressClient", "shouldInterceptRequest error1", th);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    public int EYQ() {
        Iterator<Integer> it = this.EYQ.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (next.intValue() == 3 || next.intValue() == 2 || next.intValue() == -1) {
                return next.intValue();
            }
        }
        return TextUtils.isEmpty(Td()) ? -1 : 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.adexpress.EYQ.mZx.EYQ EYQ = EYQ(webView, str);
            EYQ(jCurrentTimeMillis, System.currentTimeMillis(), str, (EYQ == null || EYQ.EYQ() == null) ? 2 : 1);
            if (EYQ != null && EYQ.mZx() != 5) {
                EYQ.mZx();
                this.EYQ.add(Integer.valueOf(EYQ.mZx()));
            }
            if (EYQ != null && EYQ.EYQ() != null) {
                return EYQ.EYQ();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("ExpressClient", "shouldInterceptRequest error2", th);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.VwS = false;
        super.onPageFinished(webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.EYQ.Kbd, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.QQ = false;
        super.onPageStarted(webView, str, bitmap);
    }

    private com.bytedance.sdk.component.adexpress.EYQ.mZx.EYQ EYQ(WebView webView, String str) {
        com.bytedance.sdk.openadsdk.core.model.nWX nwx = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        VwS.EYQ EYQ = com.bytedance.sdk.component.adexpress.Pm.VwS.EYQ(str);
        if (EYQ != VwS.EYQ.IMAGE) {
            Iterator<com.bytedance.sdk.openadsdk.core.model.nWX> it = this.mZx.Dal().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.bytedance.sdk.openadsdk.core.model.nWX next = it.next();
                if (!TextUtils.isEmpty(next.EYQ()) && !TextUtils.isEmpty(str)) {
                    String strEYQ = next.EYQ();
                    if (strEYQ.startsWith("https")) {
                        strEYQ = strEYQ.replaceFirst("https", ProxyConfig.MATCH_HTTP);
                    }
                    if ((str.startsWith("https") ? str.replaceFirst("https", ProxyConfig.MATCH_HTTP) : str).equals(strEYQ)) {
                        nwx = next;
                        break;
                    }
                }
            }
        }
        if (EYQ == VwS.EYQ.IMAGE || nwx != null) {
            com.bytedance.sdk.component.adexpress.EYQ.mZx.EYQ eyq = new com.bytedance.sdk.component.adexpress.EYQ.mZx.EYQ();
            eyq.EYQ(5);
            eyq.EYQ(EYQ(str, com.bytedance.sdk.openadsdk.core.nativeexpress.EYQ.mZx.EYQ(this.mZx, str)));
            return eyq;
        }
        return com.bytedance.sdk.component.adexpress.EYQ.mZx.mZx.EYQ(str, EYQ, "", Td());
    }

    private String Td() {
        com.bytedance.sdk.openadsdk.core.model.UB ub = this.mZx;
        if (ub == null || ub.PI() == null) {
            return null;
        }
        return this.mZx.PI().tsL();
    }

    private WebResourceResponse EYQ(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream inputStreamEYQ = com.bytedance.sdk.openadsdk.IPb.Pm.EYQ(str, str2);
            if (inputStreamEYQ != null) {
                return new WebResourceResponse(VwS.EYQ.IMAGE.EYQ(), m4.M, inputStreamEYQ);
            }
            return null;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("ExpressClient", "get image WebResourceResponse error", th);
            return null;
        }
    }

    private void EYQ(long j, long j2, String str, int i) {
        if (this.IPb == null || this.IPb.mZx() == null) {
            return;
        }
        VwS.EYQ EYQ = com.bytedance.sdk.component.adexpress.Pm.VwS.EYQ(str);
        if (EYQ == VwS.EYQ.HTML) {
            this.IPb.mZx().EYQ(str, j, j2, i);
        } else if (EYQ == VwS.EYQ.JS) {
            this.IPb.mZx().mZx(str, j, j2, i);
        }
    }
}
