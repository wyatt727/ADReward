package com.my.target;

import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.app.NotificationCompat;
import com.json.t2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.my.target.v5;
import java.net.URI;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class q5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4103a;
    public final WebViewClient b = new b();
    public a c;
    public v5 d;
    public boolean e;
    public boolean f;

    public interface a {
        void a(Uri uri);

        void a(q5 q5Var, WebView webView);

        void a(boolean z);

        boolean a(float f, float f2);

        boolean a(int i, int i2, int i3, int i4, boolean z, int i5);

        boolean a(ConsoleMessage consoleMessage, q5 q5Var);

        boolean a(String str);

        boolean a(String str, JsResult jsResult);

        boolean a(boolean z, s5 s5Var);

        void b();

        boolean b(Uri uri);

        void c();

        void d();

        boolean e();
    }

    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            q5.this.b();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            ba.a("MraidBridge: Error - " + str);
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            q5.this.a(webResourceRequest.getUrl());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            q5.this.a(Uri.parse(str));
            return true;
        }
    }

    public static class c {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static int a(String str) {
            if (str == null) {
                return 53;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -1364013995:
                    if (str.equals("center")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1314880604:
                    if (str.equals(t2.e.b)) {
                        c = 6;
                        break;
                    }
                    break;
                case -1012429441:
                    if (str.equals(t2.e.c)) {
                        c = 0;
                        break;
                    }
                    break;
                case -655373719:
                    if (str.equals(t2.e.e)) {
                        c = 2;
                        break;
                    }
                    break;
                case 1163912186:
                    if (str.equals(t2.e.d)) {
                        c = 3;
                        break;
                    }
                    break;
                case 1288627767:
                    if (str.equals("bottom-center")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1755462605:
                    if (str.equals("top-center")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                return 51;
            }
            if (c == 1) {
                return 17;
            }
            if (c == 2) {
                return 83;
            }
            if (c == 3) {
                return 85;
            }
            if (c != 4) {
                return c != 5 ? 53 : 81;
            }
            return 49;
        }
    }

    public class d extends WebChromeClient {
        public d() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            ba.a("MraidBridge: JS console message - " + consoleMessage.message() + " - at line " + consoleMessage.lineNumber());
            q5 q5Var = q5.this;
            a aVar = q5Var.c;
            return aVar != null ? aVar.a(consoleMessage, q5Var) : super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            a aVar = q5.this.c;
            return aVar != null ? aVar.a(str2, jsResult) : super.onJsAlert(webView, str, str2, jsResult);
        }
    }

    public class e implements v5.a {
        public e() {
        }

        @Override // com.my.target.v5.a
        public void a(boolean z) {
            a aVar = q5.this.c;
            if (aVar != null) {
                aVar.a(z);
            }
        }

        @Override // com.my.target.v5.a
        public void b() {
            a aVar = q5.this.c;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    public q5(String str) {
        this.f4103a = str;
    }

    public static q5 b(String str) {
        return new q5(str);
    }

    public final String a(Rect rect) {
        return rect.left + "," + rect.top + "," + rect.width() + "," + rect.height();
    }

    public void a() {
        this.d = null;
    }

    public void a(Uri uri) {
        a aVar;
        String scheme = uri.getScheme();
        String host = uri.getHost();
        if ("mytarget".equals(scheme)) {
            if ("onloadmraidjs".equals(host)) {
                ba.a("MraidBridge: JS call onLoad");
            }
            ba.a("MraidBridge: Got mytarget scheme - " + uri);
            return;
        }
        if (!CampaignEx.JSON_KEY_MRAID.equals(scheme)) {
            try {
                new URI(uri.toString());
                v5 v5Var = this.d;
                if (v5Var == null || !v5Var.g() || (aVar = this.c) == null) {
                    return;
                }
                aVar.a(uri);
                return;
            } catch (Throwable unused) {
                ba.a("MraidBridge: Invalid MRAID URL - " + uri);
                a("", "Mraid command sent an invalid URL");
                return;
            }
        }
        if (host.contains(",")) {
            host = host.substring(0, host.indexOf(",")).trim();
        }
        ba.a("MraidBridge: Got mraid command - " + uri);
        String string = uri.toString();
        JSONObject jSONObject = null;
        r5 r5Var = new r5(host, this.f4103a);
        c(r5Var.toString());
        int iIndexOf = string.indexOf("{");
        int iLastIndexOf = string.lastIndexOf("}") + 1;
        if (iIndexOf >= 0 && iLastIndexOf > 0 && iIndexOf < iLastIndexOf) {
            try {
                if (iLastIndexOf <= string.length()) {
                    jSONObject = new JSONObject(string.substring(iIndexOf, iLastIndexOf));
                }
            } catch (Throwable th) {
                a(r5Var.toString(), th.getMessage());
                return;
            }
        }
        a(r5Var, jSONObject);
    }

    public void a(a aVar) {
        this.c = aVar;
    }

    public void a(u5 u5Var) {
        a("mraidbridge.setScreenSize(" + b(u5Var.d()) + ");window.mraidbridge.setMaxSize(" + b(u5Var.c()) + ");window.mraidbridge.setCurrentPosition(" + a(u5Var.a()) + ");window.mraidbridge.setDefaultPosition(" + a(u5Var.b()) + ")");
        StringBuilder sb = new StringBuilder();
        sb.append("mraidbridge.fireSizeChangeEvent(");
        sb.append(b(u5Var.a()));
        sb.append(")");
        a(sb.toString());
    }

    public void a(v5 v5Var) {
        this.d = v5Var;
        WebSettings settings = v5Var.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            if ("interstitial".equals(this.f4103a)) {
                settings.setMediaPlaybackRequiresUserGesture(false);
            }
        }
        this.d.setScrollContainer(false);
        this.d.setVerticalScrollBarEnabled(false);
        this.d.setHorizontalScrollBarEnabled(false);
        this.d.setWebViewClient(this.b);
        this.d.setWebChromeClient(new d());
        this.d.setVisibilityChangedListener(new e());
    }

    public final void a(String str) {
        if (this.d == null) {
            ba.a("MraidBridge: Attempted to inject Javascript into MRAID WebView while was not attached - \n\t" + str);
            return;
        }
        String str2 = "javascript:window." + str + ";";
        ba.a("MraidBridge: Injecting Javascript into MRAID WebView " + hashCode() + " - " + str2);
        this.d.a(str2);
    }

    public void a(String str, String str2) {
        a("mraidbridge.fireErrorEvent(" + JSONObject.quote(str2) + ", " + JSONObject.quote(str) + ")");
    }

    public void a(ArrayList<String> arrayList) {
        a("mraidbridge.setSupports(" + TextUtils.join(",", arrayList) + ")");
    }

    public void a(boolean z) {
        if (z != this.f) {
            a("mraidbridge.setIsViewable(" + z + ")");
        }
        this.f = z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean a(r5 r5Var, JSONObject jSONObject) throws JSONException {
        v5 v5Var;
        String string = r5Var.toString();
        if (r5Var.f4113a && (v5Var = this.d) != null && !v5Var.g()) {
            a(string, "Cannot execute this command unless the user clicks");
            return false;
        }
        if (this.c == null) {
            a(string, "Invalid state to execute this command");
            return false;
        }
        if (this.d == null) {
            a(string, "The current WebView is being destroyed");
            return false;
        }
        string.hashCode();
        string.hashCode();
        switch (string) {
            case "vpaidInit":
                this.c.d();
                return true;
            case "playVideo":
                ba.a("MraidBridge: playVideo is currently unsupported");
                return false;
            case "expand":
                return this.c.b(jSONObject != null ? Uri.parse(jSONObject.getString("url")) : null);
            case "resize":
                return this.c.e();
            case "createCalendarEvent":
                ba.a("MraidBridge: createCalendarEvent is currently unsupported");
                return false;
            case "":
                a(string, "Unspecified MRAID Javascript command");
                return false;
            case "open":
                if (jSONObject == null) {
                    a(string, "open params cannot be null");
                    return false;
                }
                this.c.a(Uri.parse(jSONObject.getString("url")));
                return true;
            case "close":
                this.c.c();
                return true;
            case "setOrientationProperties":
                if (jSONObject == null) {
                    a(string, "setOrientationProperties params cannot be null");
                    return false;
                }
                boolean z = jSONObject.getBoolean("allowOrientationChange");
                String string2 = jSONObject.getString("forceOrientation");
                s5 s5VarA = s5.a(string2);
                if (s5VarA != null) {
                    return this.c.a(z, s5VarA);
                }
                a(string, "wrong orientation " + string2);
                return false;
            case "storePicture":
                ba.a("MraidBridge: storePicture is currently unsupported");
                return false;
            case "setResizeProperties":
                if (jSONObject != null) {
                    return this.c.a(jSONObject.getInt("width"), jSONObject.getInt("height"), jSONObject.getInt("offsetX"), jSONObject.getInt("offsetY"), jSONObject.optBoolean("allowOffscreen", false), c.a(jSONObject.optString("customClosePosition")));
                }
                a(string, "setResizeProperties params cannot be null");
                return false;
            case "vpaidEvent":
                if (jSONObject != null) {
                    return this.c.a(jSONObject.getString(NotificationCompat.CATEGORY_EVENT));
                }
                a(string, "vpaidEvent params cannot be null");
                return false;
            case "playheadEvent":
                if (jSONObject != null) {
                    return this.c.a((float) jSONObject.getDouble("remain"), (float) jSONObject.getDouble("duration"));
                }
                a(string, "playheadEvent params cannot be null");
                return false;
            default:
                return true;
        }
    }

    public final String b(Rect rect) {
        return rect.width() + "," + rect.height();
    }

    public final void b() {
        if (this.e) {
            return;
        }
        this.e = true;
        a aVar = this.c;
        if (aVar != null) {
            aVar.a(this, this.d.getWebView());
        }
    }

    public final void c(String str) {
        a("mraidbridge.nativeComplete(" + JSONObject.quote(str) + ")");
    }

    public boolean c() {
        v5 v5Var = this.d;
        return v5Var != null && v5Var.h();
    }

    public void d() {
        a("mraidbridge.fireReadyEvent()");
    }

    public void d(String str) {
        a("mraidbridge.setPlacementType(" + JSONObject.quote(str) + ")");
    }

    public void e(String str) {
        a("mraidbridge.setState(" + JSONObject.quote(str) + ")");
    }

    public void f(String str) {
        v5 v5Var = this.d;
        if (v5Var == null) {
            ba.a("MraidBridge: MRAID bridge called setContentHtml before WebView was attached");
        } else {
            this.e = false;
            v5Var.a("https://ad.mail.ru/", str, "text/html", C.UTF8_NAME, null);
        }
    }
}
