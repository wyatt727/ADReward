package com.my.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import java.net.URI;

/* loaded from: classes4.dex */
public class ua extends LinearLayout {
    public static final int n = ca.c();
    public static final int o = ca.c();

    /* renamed from: a, reason: collision with root package name */
    public final ca f4147a;
    public final ImageButton b;
    public final LinearLayout c;
    public final TextView d;
    public final TextView e;
    public final FrameLayout f;
    public final View g;
    public final FrameLayout h;
    public final ImageButton i;
    public final RelativeLayout j;
    public final h0 k;
    public final ProgressBar l;
    public d m;

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            ua uaVar = ua.this;
            uaVar.d.setText(uaVar.a(str));
            return true;
        }
    }

    public class b extends WebChromeClient {
        public b() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (i < 100 && ua.this.l.getVisibility() == 8) {
                ua.this.l.setVisibility(0);
                ua.this.g.setVisibility(8);
            }
            ua.this.l.setProgress(i);
            if (i >= 100) {
                ua.this.l.setVisibility(8);
                ua.this.g.setVisibility(0);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            ua.this.e.setText(webView.getTitle());
            ua.this.e.setVisibility(0);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ua uaVar = ua.this;
            if (view != uaVar.b) {
                if (view == uaVar.i) {
                    uaVar.e();
                }
            } else {
                d dVar = uaVar.m;
                if (dVar != null) {
                    dVar.a();
                }
            }
        }
    }

    public interface d {
        void a();
    }

    public ua(Context context) {
        super(context);
        this.j = new RelativeLayout(context);
        this.k = new h0(context);
        this.b = new ImageButton(context);
        this.c = new LinearLayout(context);
        this.d = new TextView(context);
        this.e = new TextView(context);
        this.f = new FrameLayout(context);
        this.h = new FrameLayout(context);
        this.i = new ImageButton(context);
        this.l = new ProgressBar(context, null, android.R.attr.progressBarStyleHorizontal);
        this.g = new View(context);
        this.f4147a = ca.e(context);
    }

    public final String a(String str) {
        try {
            URI uri = new URI(str);
            return uri.getScheme() + "://" + uri.getHost();
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }

    public boolean a() {
        return this.k.a();
    }

    public void b() {
        this.k.setWebChromeClient(null);
        this.k.a(0);
    }

    public void c() {
        this.k.b();
    }

    public void d() {
        WebSettings settings = this.k.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
            settings.setDomStorageEnabled(true);
        }
        this.k.setWebViewClient(new a());
        this.k.setWebChromeClient(new b());
        f();
    }

    public final void e() {
        String url = this.k.getUrl();
        if (TextUtils.isEmpty(url)) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
            if (!(getContext() instanceof Activity)) {
                intent.addFlags(268435456);
            }
            getContext().startActivity(intent);
        } catch (Throwable unused) {
            ba.a("WebViewBrowser: Unable to open url " + url);
        }
    }

    public final void f() {
        setOrientation(1);
        setGravity(16);
        c cVar = new c();
        this.k.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        TypedValue typedValue = new TypedValue();
        int iB = this.f4147a.b(50);
        if (getContext().getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            iB = TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        this.j.setLayoutParams(new LinearLayout.LayoutParams(-1, iB));
        this.f.setLayoutParams(new LinearLayout.LayoutParams(iB, iB));
        FrameLayout frameLayout = this.f;
        int i = n;
        frameLayout.setId(i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.b.setLayoutParams(layoutParams);
        this.b.setImageBitmap(g0.a(iB / 4, this.f4147a.b(2)));
        this.b.setContentDescription("Close");
        this.b.setOnClickListener(cVar);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iB, iB);
        layoutParams2.addRule(21);
        this.h.setLayoutParams(layoutParams2);
        FrameLayout frameLayout2 = this.h;
        int i2 = o;
        frameLayout2.setId(i2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        this.i.setLayoutParams(layoutParams3);
        this.i.setImageBitmap(g0.b(getContext()));
        this.i.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.i.setContentDescription("Open outside");
        this.i.setOnClickListener(cVar);
        ca.a(this.b, 0, -3355444);
        ca.a(this.i, 0, -3355444);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(15, -1);
        layoutParams4.addRule(1, i);
        layoutParams4.addRule(0, i2);
        this.c.setLayoutParams(layoutParams4);
        this.c.setOrientation(1);
        this.c.setPadding(this.f4147a.b(4), this.f4147a.b(4), this.f4147a.b(4), this.f4147a.b(4));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        this.e.setVisibility(8);
        this.e.setLayoutParams(layoutParams5);
        this.e.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.e.setTextSize(2, 18.0f);
        this.e.setSingleLine();
        this.e.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        this.d.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.d.setSingleLine();
        this.d.setTextSize(2, 12.0f);
        this.d.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        ClipDrawable clipDrawable = new ClipDrawable(new ColorDrawable(-16537100), GravityCompat.START, 1);
        ColorDrawable colorDrawable = new ColorDrawable(-1968642);
        LayerDrawable layerDrawable = (LayerDrawable) this.l.getProgressDrawable();
        layerDrawable.setDrawableByLayerId(android.R.id.background, colorDrawable);
        layerDrawable.setDrawableByLayerId(android.R.id.progress, clipDrawable);
        this.l.setProgressDrawable(layerDrawable);
        this.l.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f4147a.b(2)));
        this.l.setProgress(0);
        this.c.addView(this.e);
        this.c.addView(this.d);
        this.f.addView(this.b);
        this.h.addView(this.i);
        this.j.addView(this.f);
        this.j.addView(this.c);
        this.j.addView(this.h);
        addView(this.j);
        this.g.setBackgroundColor(-5592406);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, 1);
        this.g.setVisibility(8);
        this.g.setLayoutParams(layoutParams6);
        addView(this.l);
        addView(this.g);
        addView(this.k);
    }

    public void setListener(d dVar) {
        this.m = dVar;
    }

    public void setUrl(String str) {
        this.k.a(str);
        this.d.setText(a(str));
    }
}
