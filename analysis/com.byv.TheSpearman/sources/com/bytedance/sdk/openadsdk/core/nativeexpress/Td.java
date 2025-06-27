package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.os.Build;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BrandBannerWebViewPool.java */
/* loaded from: classes2.dex */
public class Td {
    private static volatile Td Td;
    private static int mZx;
    private final List<DspHtmlWebView> EYQ = new ArrayList();

    public static Td EYQ() {
        if (Td == null) {
            synchronized (Td.class) {
                if (Td == null) {
                    Td = new Td();
                }
            }
        }
        return Td;
    }

    public DspHtmlWebView mZx() {
        DspHtmlWebView dspHtmlWebViewRemove;
        if (Td() > 0 && (dspHtmlWebViewRemove = this.EYQ.remove(0)) != null) {
            return dspHtmlWebViewRemove;
        }
        return null;
    }

    public void EYQ(DspHtmlWebView dspHtmlWebView) {
        if (dspHtmlWebView != null) {
            mZx(dspHtmlWebView);
        }
    }

    public void mZx(DspHtmlWebView dspHtmlWebView) {
        if (dspHtmlWebView != null) {
            if (this.EYQ.size() >= mZx) {
                dspHtmlWebView.tsL();
            } else {
                if (this.EYQ.contains(dspHtmlWebView)) {
                    return;
                }
                Td(dspHtmlWebView);
                this.EYQ.add(dspHtmlWebView);
            }
        }
    }

    public int Td() {
        return this.EYQ.size();
    }

    public void Td(DspHtmlWebView dspHtmlWebView) {
        if (dspHtmlWebView == null || dspHtmlWebView.getWebView() == null) {
            return;
        }
        if (dspHtmlWebView.getParent() != null) {
            ((ViewGroup) dspHtmlWebView.getParent()).removeView(dspHtmlWebView);
        }
        try {
            dspHtmlWebView.removeAllViews();
            dspHtmlWebView.Td();
            dspHtmlWebView.setWebChromeClient(null);
            dspHtmlWebView.setWebViewClient(null);
            dspHtmlWebView.setDownloadListener(null);
            dspHtmlWebView.setDefaultTextEncodingName(C.UTF8_NAME);
            dspHtmlWebView.setAllowFileAccess(false);
            dspHtmlWebView.setJavaScriptEnabled(true);
            dspHtmlWebView.setAppCacheEnabled(true);
            dspHtmlWebView.setDatabaseEnabled(true);
            dspHtmlWebView.setSupportZoom(false);
            dspHtmlWebView.getWebView().setLayerType(0, null);
            dspHtmlWebView.setBackgroundColor(0);
            dspHtmlWebView.getWebView().setHorizontalScrollBarEnabled(false);
            dspHtmlWebView.getWebView().setHorizontalScrollbarOverlay(false);
            dspHtmlWebView.getWebView().setVerticalScrollBarEnabled(false);
            dspHtmlWebView.getWebView().setVerticalScrollbarOverlay(false);
            dspHtmlWebView.EYQ(true);
            dspHtmlWebView.tp();
            if (Build.VERSION.SDK_INT >= 21) {
                dspHtmlWebView.setMixedContentMode(0);
            }
        } catch (Exception unused) {
        }
    }
}
