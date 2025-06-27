package com.bytedance.sdk.component.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.bytedance.sdk.component.utils.WU;
import com.bytedance.sdk.component.utils.pi;
import com.json.t2;
import com.vungle.ads.internal.model.AdPayload;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SSWebView extends FrameLayout {
    private static Td tPj;
    private com.bytedance.sdk.component.widget.mZx.EYQ EYQ;
    private long HX;
    private float IPb;
    private int KO;
    private float Kbd;
    private volatile WebView MxO;
    private Pm NZ;
    private boolean Pm;
    private long QQ;
    private JSONObject Td;
    private WU UB;
    private AttributeSet Uc;
    private long VwS;
    private AtomicBoolean WU;
    private AtomicBoolean XN;
    private Context hYh;
    private mZx hu;
    private String mZx;
    private float nWX;
    private float pi;
    private long rfB;
    private boolean tp;
    private float tsL;
    private long wBa;
    private AtomicBoolean zF;

    public interface Pm {
    }

    public interface Td {
        WebView createWebView(Context context, AttributeSet attributeSet, int i);
    }

    public interface mZx {
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public com.bytedance.sdk.component.widget.mZx.EYQ getMaterialMeta() {
        return this.EYQ;
    }

    public void setMaterialMeta(com.bytedance.sdk.component.widget.mZx.EYQ eyq) {
        this.EYQ = eyq;
    }

    @Override // android.view.View
    public String getTag() {
        return this.mZx;
    }

    public void setTag(String str) {
        this.mZx = str;
    }

    public void setLandingPage(boolean z) {
        this.Pm = z;
    }

    public void setTouchStateListener(Pm pm) {
        this.NZ = pm;
    }

    public SSWebView(Context context) {
        this(EYQ(context), false);
    }

    public SSWebView(Context context, boolean z) {
        super(EYQ(context));
        this.Kbd = 0.0f;
        this.IPb = 0.0f;
        this.VwS = 0L;
        this.QQ = 0L;
        this.HX = 0L;
        this.tp = false;
        this.tsL = 20.0f;
        this.nWX = 50.0f;
        this.zF = new AtomicBoolean();
        this.WU = new AtomicBoolean();
        this.XN = new AtomicBoolean();
        this.hYh = context;
        if (z) {
            return;
        }
        try {
            this.MxO = EYQ((AttributeSet) null, 0);
            mZx();
        } catch (Throwable unused) {
        }
        mZx(EYQ(context));
    }

    public void d_() {
        try {
            this.MxO = EYQ(this.Uc, 0);
            mZx();
            mZx(EYQ(this.hYh));
        } catch (Throwable th) {
            pi.EYQ("SSWebView.TAG", "initWebview: " + th.getMessage());
        }
    }

    public static void setWebViewProvider(Td td) {
        tPj = td;
    }

    private WebView EYQ(AttributeSet attributeSet, int i) {
        Td td = tPj;
        if (td != null) {
            return td.createWebView(getContext(), attributeSet, i);
        }
        if (attributeSet == null) {
            return new WebView(EYQ(this.hYh));
        }
        return new WebView(EYQ(this.hYh), attributeSet);
    }

    public void setRecycler(boolean z) {
        if (this.MxO == null || !(this.MxO instanceof PangleWebView)) {
            return;
        }
        ((PangleWebView) this.MxO).setRecycler(z);
    }

    public void mZx() {
        if (this.MxO != null) {
            removeAllViews();
            setBackground(null);
            try {
                this.MxO.setId(520093704);
            } catch (Throwable unused) {
            }
            addView(this.MxO, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private static Context EYQ(Context context) {
        return (Build.VERSION.SDK_INT < 21 || Build.VERSION.SDK_INT >= 23) ? context : context.createConfigurationContext(new Configuration());
    }

    private void mZx(Context context) {
        Td(context);
        hu();
        KO();
    }

    public void setNetworkAvailable(boolean z) {
        try {
            this.MxO.setNetworkAvailable(z);
        } catch (Throwable unused) {
        }
    }

    public void EYQ(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            this.MxO.loadUrl(str, map);
        } catch (Throwable unused) {
        }
    }

    public void a_(String str) {
        try {
            setJavaScriptEnabled(str);
            this.MxO.loadUrl(str);
        } catch (Throwable unused) {
        }
    }

    public void EYQ(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            this.MxO.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    public void Td() {
        try {
            this.MxO.stopLoading();
        } catch (Throwable unused) {
        }
    }

    public void Pm() {
        try {
            this.MxO.reload();
        } catch (Throwable unused) {
        }
    }

    public boolean Kbd() {
        if (this.MxO == null) {
            return false;
        }
        try {
            return this.MxO.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void IPb() {
        try {
            this.MxO.goBack();
        } catch (Throwable unused) {
        }
    }

    public boolean VwS() {
        if (this.MxO == null) {
            return false;
        }
        try {
            return this.MxO.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void QQ() {
        try {
            this.MxO.goForward();
        } catch (Throwable unused) {
        }
    }

    public void HX() {
        if (this.MxO != null) {
            this.MxO.onResume();
        }
    }

    public String getUrl() {
        if (this.MxO == null) {
            return null;
        }
        try {
            return this.MxO.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getOriginalUrl() {
        String url;
        if (this.MxO == null) {
            return null;
        }
        try {
            String originalUrl = this.MxO.getOriginalUrl();
            return (originalUrl == null || !originalUrl.startsWith("data:text/html") || (url = this.MxO.getUrl()) == null) ? originalUrl : url.startsWith(AdPayload.FILE_SCHEME) ? url : originalUrl;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getProgress() {
        if (this.MxO == null) {
            return 0;
        }
        try {
            return this.MxO.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    public int getContentHeight() {
        if (this.MxO == null) {
            return 0;
        }
        try {
            return this.MxO.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public void EYQ(boolean z) {
        try {
            this.MxO.clearCache(z);
        } catch (Throwable unused) {
        }
    }

    public void tp() {
        try {
            this.MxO.clearHistory();
        } catch (Throwable unused) {
        }
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof Pm) {
                setTouchStateListener((Pm) webViewClient);
            } else {
                setTouchStateListener(null);
            }
            if (webViewClient == 0) {
                webViewClient = new EYQ();
            }
            this.MxO.setWebViewClient(webViewClient);
        } catch (Throwable unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.MxO.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.MxO.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        try {
            this.MxO.setBackgroundColor(i);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.MxO == null) {
            return;
        }
        try {
            this.MxO.computeScroll();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent viewParentEYQ;
        try {
            EYQ(motionEvent);
            boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.tp && (viewParentEYQ = EYQ(this)) != null) {
                viewParentEYQ.requestDisallowInterceptTouchEvent(true);
            }
            return zOnInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public void setIsPreventTouchEvent(boolean z) {
        this.tp = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected ViewParent EYQ(View view) {
        ViewParent parent = view.getParent();
        if ((parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || !(parent instanceof View)) {
            return parent;
        }
        View view2 = (View) parent;
        return (mZx(view2) || Td(view2)) ? parent : EYQ(view2);
    }

    private static boolean mZx(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ViewPager");
            if (clsLoadClass != null) {
                if (clsLoadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            if (clsLoadClass2 != null) {
                return clsLoadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    private static boolean Td(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ScrollingView");
            if (clsLoadClass != null) {
                if (clsLoadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            if (clsLoadClass2 != null) {
                return clsLoadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    @Override // android.view.View
    public void setLayerType(int i, Paint paint) {
        try {
            this.MxO.setLayerType(i, paint);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        try {
            this.MxO.setOverScrollMode(i);
            super.setOverScrollMode(i);
        } catch (Throwable unused) {
        }
    }

    private static void Td(Context context) {
        if (Build.VERSION.SDK_INT != 17 || context == null) {
            return;
        }
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                Method declaredMethod = accessibilityManager.getClass().getDeclaredMethod("setState", Integer.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(accessibilityManager, 0);
            }
        } catch (Throwable unused) {
        }
    }

    private void KO() {
        if (this.MxO == null) {
            return;
        }
        try {
            this.MxO.removeJavascriptInterface("searchBoxJavaBridge_");
            this.MxO.removeJavascriptInterface("accessibility");
            this.MxO.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    public void EYQ(Object obj, String str) {
        try {
            this.MxO.addJavascriptInterface(obj, str);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptEnabled(boolean z) {
        try {
            this.MxO.getSettings().setJavaScriptEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z) {
        try {
            this.MxO.getSettings().setDisplayZoomControls(z);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i) {
        try {
            this.MxO.getSettings().setCacheMode(i);
        } catch (Throwable unused) {
        }
    }

    private void hu() {
        try {
            WebSettings settings = this.MxO.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (TextUtils.isEmpty(str) || (settings = this.MxO.getSettings()) == null) {
                return;
            }
            if (Uri.parse(str).getScheme().equals(t2.h.b)) {
                settings.setJavaScriptEnabled(false);
            } else {
                settings.setJavaScriptEnabled(true);
            }
        } catch (Throwable unused) {
        }
    }

    public void MxO() {
        if (this.MxO == null) {
            return;
        }
        try {
            this.MxO.onPause();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public String getUserAgentString() {
        if (this.MxO == null) {
            return "";
        }
        try {
            return this.MxO.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.MxO;
    }

    public void tsL() {
        if (this.MxO == null) {
            return;
        }
        try {
            this.MxO.destroy();
        } catch (Throwable unused) {
        }
    }

    public void b_(String str) {
        try {
            this.MxO.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    public void setAppCacheEnabled(boolean z) {
        try {
            this.MxO.getSettings().setAppCacheEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setSupportZoom(boolean z) {
        try {
            this.MxO.getSettings().setSupportZoom(z);
        } catch (Throwable unused) {
        }
    }

    public void setUseWideViewPort(boolean z) {
        try {
            this.MxO.getSettings().setUseWideViewPort(z);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z) {
        try {
            this.MxO.getSettings().setJavaScriptCanOpenWindowsAutomatically(z);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z) {
        try {
            this.MxO.getSettings().setDomStorageEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z) {
        try {
            this.MxO.getSettings().setBuiltInZoomControls(z);
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.MxO.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z) {
        try {
            this.MxO.getSettings().setLoadWithOverviewMode(z);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.MxO.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.MxO.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultFontSize(int i) {
        try {
            this.MxO.getSettings().setDefaultFontSize(i);
        } catch (Throwable unused) {
        }
    }

    public void setMixedContentMode(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                this.MxO.getSettings().setMixedContentMode(i);
            } catch (Throwable unused) {
            }
        }
    }

    public void setDatabaseEnabled(boolean z) {
        try {
            this.MxO.getSettings().setDatabaseEnabled(z);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        try {
            super.setVisibility(i);
            this.MxO.setVisibility(i);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        try {
            super.setAlpha(f);
            this.MxO.setAlpha(f);
        } catch (Throwable unused) {
        }
    }

    public void setAllowFileAccess(boolean z) {
        try {
            this.MxO.getSettings().setAllowFileAccess(z);
        } catch (Throwable unused) {
        }
    }

    public void pi() {
        try {
            this.MxO.clearView();
        } catch (Throwable unused) {
        }
    }

    public void nWX() {
        try {
            this.MxO.pauseTimers();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.MxO.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    private void UB() {
        if (this.UB == null) {
            this.XN.set(false);
            this.UB = new WU(getContext());
        }
        new Object() { // from class: com.bytedance.sdk.component.widget.SSWebView.1
        };
        this.XN.set(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.zF.set(true);
        if (!this.WU.get() || this.XN.get()) {
            return;
        }
        UB();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.zF.set(false);
    }

    public long getLandingPageClickBegin() {
        return this.wBa;
    }

    public void setLandingPageClickBegin(long j) {
        this.wBa = j;
    }

    public long getLandingPageClickEnd() {
        return this.rfB;
    }

    public void setLandingPageClickEnd(long j) {
        this.rfB = j;
    }

    private void EYQ(MotionEvent motionEvent) {
        if (!this.Pm || this.EYQ == null) {
            return;
        }
        if ((this.mZx == null && this.Td == null) || motionEvent == null) {
            return;
        }
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.Kbd = motionEvent.getRawX();
                this.IPb = motionEvent.getRawY();
                this.VwS = System.currentTimeMillis();
                this.Td = new JSONObject();
                if (this.MxO != null) {
                    this.wBa = this.VwS;
                    return;
                }
                return;
            }
            if (action == 1 || action == 3) {
                this.Td.put("start_x", String.valueOf(this.Kbd));
                this.Td.put("start_y", String.valueOf(this.IPb));
                this.Td.put("offset_x", String.valueOf(motionEvent.getRawX() - this.Kbd));
                this.Td.put("offset_y", String.valueOf(motionEvent.getRawY() - this.IPb));
                this.Td.put("url", String.valueOf(getUrl()));
                this.Td.put("tag", "");
                this.QQ = System.currentTimeMillis();
                if (this.MxO != null) {
                    this.rfB = this.QQ;
                }
                this.Td.put("down_time", this.VwS);
                this.Td.put("up_time", this.QQ);
                if (com.bytedance.sdk.component.widget.EYQ.EYQ.EYQ().mZx() != null) {
                    long j = this.HX;
                    long j2 = this.VwS;
                    if (j != j2) {
                        this.HX = j2;
                        com.bytedance.sdk.component.widget.EYQ.EYQ.EYQ().mZx().EYQ(this.EYQ, this.mZx, "in_web_click", this.Td, this.QQ - this.VwS);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void setShakeValue(float f) {
        this.tsL = f;
    }

    public void setDeepShakeValue(float f) {
        this.pi = f;
    }

    public void setWriggleValue(float f) {
        this.nWX = f;
    }

    public void setCalculationMethod(int i) {
        this.KO = i;
    }

    public void setOnShakeListener(mZx mzx) {
        this.hu = mzx;
    }

    public static class EYQ extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(final WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (webView == null) {
                return true;
            }
            webView.post(new Runnable() { // from class: com.bytedance.sdk.component.widget.SSWebView.EYQ.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ViewGroup viewGroup = (ViewGroup) webView.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(webView);
                        }
                        webView.destroy();
                    } catch (Exception unused) {
                    }
                }
            });
            return true;
        }
    }
}
