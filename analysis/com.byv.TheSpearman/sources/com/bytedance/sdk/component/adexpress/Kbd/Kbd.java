package com.bytedance.sdk.component.adexpress.Kbd;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.EYQ.wBa;
import com.bytedance.sdk.component.widget.SSWebView;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WebViewPool.java */
/* loaded from: classes2.dex */
public class Kbd {
    private static volatile Kbd HX = null;
    private static int IPb = 10;
    private static final byte[] Kbd = new byte[0];
    private static int QQ = 10;
    private final AtomicBoolean VwS = new AtomicBoolean(false);
    private List<SSWebView> EYQ = new ArrayList();
    private List<SSWebView> mZx = new ArrayList();
    private Map<Integer, Td> Td = new HashMap();
    private Map<Integer, Pm> Pm = new HashMap();

    private Kbd() {
        com.bytedance.sdk.component.adexpress.EYQ.EYQ.Td Td = com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().Td();
        if (Td != null) {
            IPb = Td.tp();
            QQ = Td.MxO();
        }
    }

    public static Kbd EYQ() {
        if (HX == null) {
            synchronized (Kbd.class) {
                if (HX == null) {
                    HX = new Kbd();
                }
            }
        }
        return HX;
    }

    public SSWebView EYQ(Context context, String str) {
        if (Pm() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.Pm.Td.EYQ(str) && Pm() <= 1) {
            Integer.valueOf(Pm());
            return null;
        }
        SSWebView sSWebViewRemove = this.mZx.remove(0);
        if (sSWebViewRemove == null) {
            return null;
        }
        try {
            Context context2 = sSWebViewRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                sSWebViewRemove.setRecycler(false);
                Integer.valueOf(Pm());
            }
            return sSWebViewRemove;
        } catch (Throwable unused) {
            Integer.valueOf(Pm());
            return null;
        }
    }

    public void EYQ(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        if (this.mZx.size() >= QQ) {
            try {
                Context context = sSWebView.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                sSWebView.tsL();
                return;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (this.mZx.contains(sSWebView)) {
            return;
        }
        try {
            Context context2 = sSWebView.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                sSWebView.setRecycler(true);
                this.mZx.add(sSWebView);
                Integer.valueOf(Pm());
            }
        } catch (Throwable th2) {
            Integer.valueOf(Pm());
            th2.getMessage();
        }
    }

    public void mZx(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        VwS(sSWebView);
        sSWebView.b_("SDK_INJECT_GLOBAL");
        IPb(sSWebView);
        EYQ(sSWebView);
    }

    public SSWebView mZx(Context context, String str) {
        if (Td() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.Pm.Td.EYQ(str) && Td() <= 1) {
            Integer.valueOf(Td());
            return null;
        }
        SSWebView sSWebViewRemove = this.EYQ.remove(0);
        if (sSWebViewRemove == null) {
            return null;
        }
        try {
            Context context2 = sSWebViewRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                sSWebViewRemove.setRecycler(false);
                Integer.valueOf(Td());
            }
            return sSWebViewRemove;
        } catch (Throwable unused) {
            Integer.valueOf(Td());
            return null;
        }
    }

    public void Td(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        VwS(sSWebView);
        sSWebView.b_("SDK_INJECT_GLOBAL");
        IPb(sSWebView);
        Pm(sSWebView);
    }

    public void Pm(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        if (this.EYQ.size() >= IPb) {
            try {
                Context context = sSWebView.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                sSWebView.tsL();
                return;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (this.EYQ.contains(sSWebView)) {
            return;
        }
        try {
            Context context2 = sSWebView.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                sSWebView.setRecycler(true);
                this.EYQ.add(sSWebView);
                Integer.valueOf(Td());
            }
        } catch (Throwable th2) {
            Integer.valueOf(Td());
            th2.getMessage();
        }
    }

    public boolean Kbd(SSWebView sSWebView) {
        if (sSWebView == null) {
            return false;
        }
        try {
            Context context = sSWebView.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            sSWebView.tsL();
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return true;
        }
    }

    public void mZx() {
        for (SSWebView sSWebView : this.EYQ) {
            if (sSWebView != null) {
                try {
                    Context context = sSWebView.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    }
                    sSWebView.tsL();
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }
        this.EYQ.clear();
        for (SSWebView sSWebView2 : this.mZx) {
            if (sSWebView2 != null) {
                try {
                    Context context2 = sSWebView2.getContext();
                    if (context2 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    }
                    sSWebView2.tsL();
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }
        this.mZx.clear();
    }

    public int Td() {
        return this.EYQ.size();
    }

    public int Pm() {
        return this.mZx.size();
    }

    private void VwS(SSWebView sSWebView) {
        sSWebView.removeAllViews();
        sSWebView.Td();
        sSWebView.setWebChromeClient(null);
        sSWebView.setWebViewClient(null);
        sSWebView.setDownloadListener(null);
        sSWebView.setJavaScriptEnabled(true);
        sSWebView.setAppCacheEnabled(false);
        sSWebView.setSupportZoom(false);
        sSWebView.setUseWideViewPort(true);
        sSWebView.setJavaScriptCanOpenWindowsAutomatically(true);
        sSWebView.setDomStorageEnabled(true);
        sSWebView.setBuiltInZoomControls(false);
        sSWebView.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        sSWebView.setLoadWithOverviewMode(false);
        sSWebView.setDefaultTextEncodingName(C.UTF8_NAME);
        sSWebView.setDefaultFontSize(16);
    }

    public void EYQ(SSWebView sSWebView, mZx mzx) {
        if (sSWebView == null || mzx == null) {
            return;
        }
        Td td = this.Td.get(Integer.valueOf(sSWebView.hashCode()));
        if (td != null) {
            td.EYQ(mzx);
        } else {
            td = new Td(mzx);
            this.Td.put(Integer.valueOf(sSWebView.hashCode()), td);
        }
        sSWebView.EYQ(td, "SDK_INJECT_GLOBAL");
    }

    public void IPb(SSWebView sSWebView) {
        if (sSWebView == null) {
            return;
        }
        Td td = this.Td.get(Integer.valueOf(sSWebView.hashCode()));
        if (td != null) {
            td.EYQ(null);
        }
        sSWebView.b_("SDK_INJECT_GLOBAL");
    }

    public void EYQ(WebView webView, wBa wba, String str) {
        if (webView == null || wba == null || TextUtils.isEmpty(str)) {
            return;
        }
        Pm pm = this.Pm.get(Integer.valueOf(webView.hashCode()));
        if (pm != null) {
            pm.EYQ(wba);
        } else {
            pm = new Pm(wba);
            this.Pm.put(Integer.valueOf(webView.hashCode()), pm);
        }
        webView.addJavascriptInterface(pm, str);
    }

    public void EYQ(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        Pm pm = this.Pm.get(Integer.valueOf(webView.hashCode()));
        if (pm != null) {
            pm.EYQ(null);
        }
        webView.removeJavascriptInterface(str);
    }

    public void EYQ(int i) {
        synchronized (Kbd) {
            IPb = i;
        }
    }

    public void mZx(int i) {
        synchronized (Kbd) {
            QQ = i;
        }
    }
}
