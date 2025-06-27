package com.facebook.ads.redexgen.uinode;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.util.Arrays;
import okio.Utf8;
import org.json.JSONException;

/* loaded from: assets/audience_network.dex */
public class NV extends WebViewClient {
    public static byte[] A05;
    public NR A00 = new NR() { // from class: com.facebook.ads.redexgen.X.U2
        @Override // com.facebook.ads.redexgen.uinode.NR
        public final boolean A9D(String str) {
            return NV.A04(str);
        }
    };
    public WeakReference<NT> A01 = new WeakReference<>(null);
    public final WeakReference<C1207Yn> A02;
    public final WeakReference<NS> A03;
    public final WeakReference<NO> A04;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{54, 55, 68, 74, 73, 15, 55, 65, 54, 67, 64, 39, 52, 37, 39, 41, 58, 47, 60, 47, 58, Utf8.REPLACEMENT_BYTE, 51, 64, 54, 68, 65, 59, 54, 0, 59, 64, 70, 55, 64, 70, 0, 51, 53, 70, 59, 65, 64, 0, 40, 27, 23, 41, 9, 22, 12, 26, 23, 17, 12, -42, 17, 22, 28, 13, 22, 28, -42, 11, 9, 28, 13, 15, 23, 26, 33, -42, -22, -6, -9, -1, -5, -23, -22, -12, -19, 7, 23, 20, 28, 24, 10, 23, 4, 11, 6, 17, 17, 7, 6, 8, 16, 4, 26, 23, 17, -54, -57, -38, -57, 49, 54, 60, 45, 54, 60, -36, -39, -45, -95, -121, -30, -48, -51, -54, -31, -44, -48, -30};
    }

    public NV(WeakReference<C1207Yn> weakReference, WeakReference<NS> weakReference2, WeakReference<NO> weakReference3) {
        this.A02 = weakReference;
        this.A03 = weakReference2;
        this.A04 = weakReference3;
    }

    private void A02(String str, C1207Yn c1207Yn) {
        c1207Yn.A07().A9a(A00(11, 11, 101), C8A.A09, new C8B(A00(111, 5, 6) + str));
    }

    private boolean A03(WebView webView, String str) throws URISyntaxException {
        boolean zA0w;
        String strA00;
        String strA002;
        String strA003;
        Intent intent;
        String strA004 = A00(116, 8, 10);
        C1207Yn c1207Yn = this.A02.get();
        if (c1207Yn == null) {
            return false;
        }
        if ((U1.A0A && (TextUtils.isEmpty(str) || A00(0, 11, 116).equals(str))) || !this.A00.A9D(str)) {
            return true;
        }
        try {
            Uri uri = AbstractC0858Ky.A00(str);
            String scheme = uri.getScheme();
            try {
                zA0w = C0796Ih.A0w(c1207Yn);
                strA00 = A00(48, 33, 71);
                strA002 = A00(22, 26, 113);
                strA003 = A00(105, 6, 103);
            } catch (Exception e) {
                c1207Yn.A07().A9b(strA004, C8A.A2b, new C8B(e));
                c1207Yn.A0E().A8k(e.toString());
            }
            if (zA0w) {
                if (!U1.A0D.contains(scheme) && !A00(101, 4, 5).equals(scheme)) {
                    if (strA003.equalsIgnoreCase(scheme)) {
                        intent = Intent.parseUri(str, 1);
                        intent.setComponent(null);
                        intent.setSelector(null);
                    } else {
                        intent = new Intent(strA002, uri);
                    }
                    intent.addCategory(strA00);
                    if (Build.VERSION.SDK_INT >= 30) {
                        intent.setFlags(268436480);
                    } else {
                        intent.setFlags(268435456);
                    }
                    try {
                        if (!C0845Kj.A0C(c1207Yn, intent)) {
                            A02(str, c1207Yn);
                        }
                        return true;
                    } catch (C0843Kh unused) {
                        if (strA003.equals(scheme)) {
                            String stringExtra = intent.getStringExtra(A00(81, 20, 68));
                            if (!TextUtils.isEmpty(stringExtra)) {
                                if (!C0845Kj.A0C(c1207Yn, new Intent(strA002, AbstractC0858Ky.A00(stringExtra)))) {
                                    A02(str, c1207Yn);
                                }
                                return true;
                            }
                        }
                        C8B c8b = new C8B(A00(111, 5, 6) + str);
                        c8b.A05(1);
                        c1207Yn.A07().A9b(A00(11, 11, 101), C8A.A06, c8b);
                        return true;
                    }
                }
                return false;
            }
            if (U1.A0A && strA003.equalsIgnoreCase(scheme)) {
                Intent uri2 = Intent.parseUri(str, 1);
                uri2.addCategory(strA00);
                uri2.setComponent(null);
                uri2.setSelector(null);
                if (c1207Yn.getPackageManager().resolveActivity(uri2, 65536) != null && C0845Kj.A0C(c1207Yn, uri2)) {
                    webView.goBack();
                    return true;
                }
            } else if ((U1.A0A && LH.A04(str)) || !U1.A0D.contains(scheme)) {
                return C0845Kj.A0C(c1207Yn, new Intent(strA002, uri));
            }
            return false;
        } catch (SecurityException e2) {
            c1207Yn.A07().A9b(strA004, C8A.A2b, new C8B(e2));
            return true;
        }
    }

    public static /* synthetic */ boolean A04(String str) {
        return true;
    }

    public final void A05(NR nr) {
        this.A00 = nr;
    }

    public final void A06(WeakReference<NT> weakReference) {
        this.A01 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        NO timingLogger = this.A04.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        NS ns = this.A03.get();
        if (ns != null) {
            ns.ACT(str);
        }
        NT nt = this.A01.get();
        if (nt != null) {
            nt.AAv(webView.canGoBack());
            nt.ABZ(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        NS listener = this.A03.get();
        if (listener != null) {
            listener.ACV(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) throws JSONException {
        super.onReceivedError(webView, i, str, str2);
        C1207Yn c1207Yn = this.A02.get();
        if (c1207Yn != null) {
            StringBuilder sb = new StringBuilder();
            String strA00 = A00(0, 0, 27);
            String errorMessage = LH.A01(i, sb.append(strA00).append(str).toString(), strA00 + str2);
            c1207Yn.A0E().A8h(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) throws JSONException {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C1207Yn c1207Yn = this.A02.get();
        if (c1207Yn != null) {
            int errorCode = webResourceError.getErrorCode();
            StringBuilder sb = new StringBuilder();
            String strA00 = A00(0, 0, 27);
            String errorMessage = LH.A01(errorCode, sb.append(strA00).append((Object) webResourceError.getDescription()).toString(), strA00 + webResourceRequest.getUrl());
            c1207Yn.A0E().A8h(errorMessage);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C1207Yn context = this.A02.get();
        if (context != null) {
            context.A0E().A8i();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C1207Yn context = this.A02.get();
        if (context != null) {
            context.A0E().A8j();
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        NY.A02(C8A.A2c);
        NS listener = this.A03.get();
        if (listener != null) {
            listener.ACs();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A03(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A03(webView, str);
    }
}
