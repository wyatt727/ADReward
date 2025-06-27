package com.json;

import android.os.Build;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0003J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/ironsource/q9;", "", "", "a", "", "script", "", "Landroid/webkit/WebView;", "webView", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface q9 {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ironsource/q9$a;", "Lcom/ironsource/q9;", "", "script", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "", "a", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/WebView;", "Z", "isKitkatAndAbove", "", "androidSDKVersion", "<init>", "(I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements q9 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private WebView webView;

        /* renamed from: b, reason: from kotlin metadata */
        private boolean isKitkatAndAbove;

        public a() {
            this(0, 1, null);
        }

        public a(int i) {
            this.isKitkatAndAbove = i >= 19;
        }

        public /* synthetic */ a(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? Build.VERSION.SDK_INT : i);
        }

        private final void b(String script) {
            WebView webView = this.webView;
            if (webView != null) {
                webView.evaluateJavascript(script, null);
            }
        }

        private final void c(String script) {
            WebView webView = this.webView;
            if (webView != null) {
                webView.loadUrl("javascript:" + script);
            }
        }

        @Override // com.json.q9
        public void a(WebView webView) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            this.webView = webView;
        }

        @Override // com.json.q9
        public void a(String script) {
            Intrinsics.checkNotNullParameter(script, "script");
            try {
                if (this.isKitkatAndAbove) {
                    b(script);
                } else {
                    c(script);
                }
            } catch (Throwable unused) {
                this.isKitkatAndAbove = false;
                c(script);
            }
        }

        @Override // com.json.q9
        public boolean a() {
            return this.webView != null;
        }
    }

    void a(WebView webView);

    void a(String script);

    boolean a();
}
