package com.mbridge.msdk.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.webkit.ProxyConfig;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ar;
import com.mbridge.msdk.foundation.webview.BrowserView;
import com.mbridge.msdk.foundation.webview.b;

/* loaded from: classes4.dex */
public class DomainMBCommonActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    String f2486a = "";
    private final BrowserView.a b = new BrowserView.a() { // from class: com.mbridge.msdk.activity.DomainMBCommonActivity.1
        @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
        public final void a(WebView webView, int i, String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
        public final void a(WebView webView, String str) {
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
        public final void a() {
            DomainMBCommonActivity.this.finish();
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
        public final void a(WebView webView, String str, Bitmap bitmap) {
            ad.b("MBCommonActivity", "onPageStarted  " + str);
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
        public final boolean b(WebView webView, String str) {
            ad.b("MBCommonActivity", "shouldOverrideUrlLoading  " + str);
            if (ah.a.b(str) && ah.a.a(DomainMBCommonActivity.this, str, null)) {
                DomainMBCommonActivity.this.finish();
            }
            return DomainMBCommonActivity.this.a(webView, str);
        }

        @Override // com.mbridge.msdk.foundation.webview.BrowserView.a
        public final void c(WebView webView, String str) {
            ad.b("MBCommonActivity", "onPageFinished  " + str);
        }
    };
    protected BrowserView browserView;
    private CampaignEx c;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            ad.b("MBCommonActivity", th.getMessage());
        }
        if (c.m().c() == null) {
            c.m().b(getApplicationContext());
        }
        c.m().a(this);
        String stringExtra = getIntent().getStringExtra("url");
        this.f2486a = stringExtra;
        if (!TextUtils.isEmpty(stringExtra)) {
            this.c = (CampaignEx) getIntent().getSerializableExtra("mvcommon");
            if (b.f3019a.containsKey(this.f2486a)) {
                BrowserView browserView = b.f3019a.get(this.f2486a);
                this.browserView = browserView;
                if (browserView != null) {
                    browserView.setListener(this.b);
                }
            } else {
                BrowserView browserView2 = new BrowserView(this, this.c);
                this.browserView = browserView2;
                browserView2.setListener(this.b);
                this.browserView.loadUrl(this.f2486a);
            }
            BrowserView browserView3 = this.browserView;
            if (browserView3 != null) {
                ar.a(browserView3);
                setContentView(this.browserView);
                return;
            }
            return;
        }
        Toast.makeText(this, "Error: no data", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, String str) {
        String str2;
        try {
        } catch (Throwable th) {
            ad.b("MBCommonActivity", th.getMessage());
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri uri = Uri.parse(str);
        if (uri.getScheme().equals(ProxyConfig.MATCH_HTTP) || uri.getScheme().equals("https")) {
            return false;
        }
        if (uri.getScheme().equals("intent")) {
            Intent uri2 = Intent.parseUri(str, 1);
            try {
                str2 = uri2.getPackage();
            } catch (Throwable th2) {
                ad.b("MBCommonActivity", th2.getMessage());
            }
            if (!TextUtils.isEmpty(str2) && getPackageManager().getLaunchIntentForPackage(str2) != null) {
                uri2.setFlags(268435456);
                startActivityForResult(uri2, 0);
                finish();
                return true;
            }
            try {
                String stringExtra = uri2.getStringExtra("browser_fallback_url");
                if (!TextUtils.isEmpty(stringExtra)) {
                    Uri uri3 = Uri.parse(str);
                    if (uri3.getScheme().equals(ProxyConfig.MATCH_HTTP) || uri3.getScheme().equals("https")) {
                        webView.loadUrl(stringExtra);
                        return false;
                    }
                    str = stringExtra;
                }
            } catch (Throwable th3) {
                ad.b("MBCommonActivity", th3.getMessage());
            }
            ad.b("MBCommonActivity", th.getMessage());
            return false;
        }
        if (com.mbridge.msdk.click.c.d(this, str)) {
            ad.b("MBCommonActivity", "openDeepLink");
            finish();
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return !(str.startsWith(ProxyConfig.MATCH_HTTP) || str.startsWith("https"));
    }
}
