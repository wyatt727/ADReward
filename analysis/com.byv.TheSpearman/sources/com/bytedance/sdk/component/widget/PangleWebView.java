package com.bytedance.sdk.component.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.component.widget.SSWebView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class PangleWebView extends WebView {
    public long EYQ;
    private boolean Kbd;
    private boolean Pm;
    private boolean Td;
    private final HashSet<String> mZx;

    public PangleWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mZx = new HashSet<>();
        this.EYQ = System.currentTimeMillis();
        EYQ();
    }

    public PangleWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mZx = new HashSet<>();
        this.EYQ = System.currentTimeMillis();
        EYQ();
    }

    private void EYQ() {
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(false);
        settings.setSupportMultipleWindows(false);
        settings.setAllowFileAccess(false);
        settings.setSavePassword(false);
        setWebViewClient(new SSWebView.EYQ());
    }

    @Override // android.webkit.WebView
    public void addJavascriptInterface(Object obj, String str) {
        toString();
        if (!this.Td && !this.Kbd) {
            super.addJavascriptInterface(obj, str);
            this.mZx.add(str);
        } else {
            pi.EYQ("TTAD.PangleWebView", "addJavascriptInterface: has destroyed or has recycler");
        }
    }

    @Override // android.webkit.WebView
    public void removeJavascriptInterface(String str) {
        if (this.Td || this.Kbd) {
            return;
        }
        super.removeJavascriptInterface(str);
        this.mZx.remove(str);
    }

    @Override // android.webkit.WebView
    public void onPause() {
        if (!this.Td && !this.Kbd) {
            try {
                super.onPause();
                return;
            } catch (Exception e) {
                pi.EYQ("TTAD.PangleWebView", "onPause: ", e);
                return;
            }
        }
        pi.EYQ("TTAD.PangleWebView", "onPause: has destroyed or recycler");
    }

    @Override // android.webkit.WebView
    public void onResume() {
        if (!this.Td && !this.Kbd) {
            try {
                super.onResume();
                return;
            } catch (Exception e) {
                pi.EYQ("TTAD.PangleWebView", "onResume: ", e);
                return;
            }
        }
        pi.EYQ("TTAD.PangleWebView", "onResume: has destroyed or recycler");
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (!this.Td && !this.Kbd) {
            try {
                super.stopLoading();
                return;
            } catch (Exception e) {
                pi.EYQ("TTAD.PangleWebView", "stopLoading: ", e);
                return;
            }
        }
        pi.EYQ("TTAD.PangleWebView", "stopLoading: has destroyed or recycler");
    }

    @Override // android.webkit.WebView
    public void reload() {
        if (!this.Td && !this.Kbd) {
            super.reload();
        } else {
            pi.EYQ("TTAD.PangleWebView", "reload: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void goBack() {
        if (!this.Td && !this.Kbd) {
            super.goBack();
        } else {
            pi.EYQ("TTAD.PangleWebView", "goBack: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void goForward() {
        if (!this.Td && !this.Kbd) {
            super.goForward();
        } else {
            pi.EYQ("TTAD.PangleWebView", "goForward: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void goBackOrForward(int i) {
        if (!this.Td && !this.Kbd) {
            super.goBackOrForward(i);
        } else {
            pi.EYQ("TTAD.PangleWebView", "goBackOrForward: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z) {
        if (!this.Td && !this.Kbd) {
            super.clearCache(z);
        } else {
            pi.EYQ("TTAD.PangleWebView", "clearCache: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (!this.Td && !this.Kbd) {
            try {
                super.loadUrl(str);
                return;
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
                pi.EYQ("TTAD.PangleWebView", "loadUrl: ", e);
                return;
            }
        }
        pi.EYQ("TTAD.PangleWebView", "loadUrl: has destroyed or recycler");
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (!this.Td && !this.Kbd) {
            try {
                super.loadUrl(str, map);
                return;
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
                pi.EYQ("TTAD.PangleWebView", "loadUrl: ", e);
                return;
            }
        }
        pi.EYQ("TTAD.PangleWebView", "loadUrl: has destroyed or recycler");
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.Td || this.Kbd) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!this.Td && !this.Kbd) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            pi.EYQ("TTAD.PangleWebView", "loadDataWithBaseURL: has destroyed or recycler");
        }
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!this.Td && !this.Kbd) {
            super.evaluateJavascript(str, valueCallback);
        } else if (valueCallback != null) {
            pi.EYQ("TTAD.PangleWebView", "evaluateJavascript: has destroyed or recycler, ".concat(String.valueOf(str)));
            valueCallback.onReceiveValue("");
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        toString();
    }

    public void setDestroyOnDetached(boolean z) {
        this.Pm = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        toString();
        if (this.Pm) {
            destroy();
        }
    }

    @Override // android.webkit.WebView
    public void resumeTimers() {
        if (this.Td || this.Kbd) {
            return;
        }
        super.resumeTimers();
    }

    @Override // android.webkit.WebView
    public void pauseTimers() {
        if (this.Td || this.Kbd) {
            return;
        }
        super.pauseTimers();
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.Td || this.Kbd) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        toString();
        if (this.Td) {
            return;
        }
        this.Td = true;
        mZx();
        super.destroy();
    }

    private void mZx() {
        if (this.Td) {
            return;
        }
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
        setOnClickListener(null);
        setOnTouchListener(null);
        Iterator<String> it = this.mZx.iterator();
        while (it.hasNext()) {
            super.removeJavascriptInterface(it.next());
        }
    }

    public void setRecycler(boolean z) {
        this.Kbd = z;
    }
}
