package com.json.sdk.controller;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import com.json.e9;
import com.json.h;
import com.json.s8;
import com.json.sdk.utils.Logger;
import com.json.sdk.utils.SDKUtils;
import com.json.t2;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class OpenUrlActivity extends Activity {
    private static final String j = "OpenUrlActivity";
    private static final int k = SDKUtils.generateViewId();
    private static final int l = SDKUtils.generateViewId();
    private v b;
    private ProgressBar c;
    boolean d;
    private RelativeLayout e;
    private String f;

    /* renamed from: a, reason: collision with root package name */
    private WebView f2139a = null;
    private final Handler g = new Handler(Looper.getMainLooper());
    private boolean h = false;
    private final Runnable i = new b();

    class a implements View.OnSystemUiVisibilityChangeListener {
        a() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            if ((i & InputDeviceCompat.SOURCE_TOUCHSCREEN) == 0) {
                OpenUrlActivity.this.g.removeCallbacks(OpenUrlActivity.this.i);
                OpenUrlActivity.this.g.postDelayed(OpenUrlActivity.this.i, 500L);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(OpenUrlActivity.this.h));
        }
    }

    private class c extends WebViewClient {
        private c() {
        }

        /* synthetic */ c(OpenUrlActivity openUrlActivity, a aVar) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.c.setVisibility(4);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            OpenUrlActivity.this.c.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(OpenUrlActivity.j, "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            OpenUrlActivity.this.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            List<String> listD = e9.e().d();
            if (listD != null && !listD.isEmpty()) {
                Iterator<String> it = listD.iterator();
                while (it.hasNext()) {
                    if (str.contains(it.next())) {
                        try {
                            OpenUrlActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            OpenUrlActivity.this.b.z();
                        } catch (Exception e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(e instanceof ActivityNotFoundException ? t2.c.z : t2.c.A);
                            if (OpenUrlActivity.this.b != null) {
                                OpenUrlActivity.this.b.d(sb.toString(), str);
                            }
                        }
                        OpenUrlActivity.this.finish();
                        return true;
                    }
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        static final String f2143a = "is_store";
        static final String b = "external_url";
        static final String c = "secondary_web_view";
        static final String d = "immersive";
        static final String e = "no activity to handle url";
        static final String f = "activity failed to open with unspecified reason";

        private d() {
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final h f2144a;
        private int b;
        private String c;
        private boolean d = false;
        private boolean e = false;
        private boolean f = false;

        e(h hVar) {
            this.f2144a = hVar;
        }

        public Intent a(Context context) {
            Intent intentA = this.f2144a.a(context);
            intentA.putExtra("external_url", this.c);
            intentA.putExtra("secondary_web_view", this.d);
            intentA.putExtra("is_store", this.e);
            intentA.putExtra(t2.h.v, this.f);
            if (!(context instanceof Activity)) {
                intentA.setFlags(this.b);
            }
            return intentA;
        }

        e a(int i) {
            this.b = i;
            return this;
        }

        e a(String str) {
            this.c = str;
            return this;
        }

        e a(boolean z) {
            this.f = z;
            return this;
        }

        e b(boolean z) {
            this.d = z;
            return this;
        }

        public e c(boolean z) {
            this.e = z;
            return this;
        }
    }

    private void a() {
        if (this.c == null) {
            ProgressBar progressBar = new ProgressBar(new ContextThemeWrapper(this, R.style.Theme.Holo.Light.Dialog));
            this.c = progressBar;
            progressBar.setId(l);
        }
        if (findViewById(l) == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.c.setLayoutParams(layoutParams);
            this.c.setVisibility(4);
            this.e.addView(this.c);
        }
    }

    private void b() {
        if (this.f2139a == null) {
            WebView webView = new WebView(getApplicationContext());
            this.f2139a = webView;
            webView.setId(k);
            this.f2139a.getSettings().setJavaScriptEnabled(true);
            this.f2139a.setWebViewClient(new c(this, null));
            loadUrl(this.f);
        }
        if (findViewById(k) == null) {
            this.e.addView(this.f2139a, new RelativeLayout.LayoutParams(-1, -1));
        }
        a();
        v vVar = this.b;
        if (vVar != null) {
            vVar.a(true, t2.h.Y);
        }
    }

    private void c() {
        WebView webView = this.f2139a;
        if (webView != null) {
            webView.destroy();
        }
    }

    private void d() {
        getWindow().addFlags(16);
    }

    private void e() {
        requestWindowFeature(1);
    }

    private void f() {
        getWindow().setFlags(1024, 1024);
    }

    private void g() {
        ViewGroup viewGroup;
        v vVar = this.b;
        if (vVar != null) {
            vVar.a(false, t2.h.Y);
            if (this.e == null || (viewGroup = (ViewGroup) this.f2139a.getParent()) == null) {
                return;
            }
            if (viewGroup.findViewById(k) != null) {
                viewGroup.removeView(this.f2139a);
            }
            if (viewGroup.findViewById(l) != null) {
                viewGroup.removeView(this.c);
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        v vVar;
        if (this.d && (vVar = this.b) != null) {
            vVar.c(t2.h.j);
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.f2139a.stopLoading();
        this.f2139a.clearHistory();
        try {
            this.f2139a.loadUrl(str);
        } catch (Throwable th) {
            Logger.e(j, "OpenUrlActivity:: loadUrl: " + th.toString());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f2139a.canGoBack()) {
            this.f2139a.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(j, "onCreate()");
        try {
            this.b = (v) s8.b((Context) this).a().j();
            e();
            f();
            Bundle extras = getIntent().getExtras();
            this.f = extras.getString("external_url");
            this.d = extras.getBoolean("secondary_web_view");
            boolean booleanExtra = getIntent().getBooleanExtra(t2.h.v, false);
            this.h = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new a());
                runOnUiThread(this.i);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.e = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e2) {
            e2.printStackTrace();
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.h && (i == 25 || i == 24)) {
            this.g.postDelayed(this.i, 500L);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        g();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.h && z) {
            runOnUiThread(this.i);
        }
    }
}
