package com.vungle.ads.internal.platform;

import android.content.Context;
import android.os.Build;
import android.util.AndroidRuntimeException;
import android.webkit.WebSettings;
import androidx.core.util.Consumer;
import com.vungle.ads.internal.util.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebViewUtil.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/internal/platform/WebViewUtil;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getUserAgent", "", "consumer", "Landroidx/core/util/Consumer;", "", "Companion", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class WebViewUtil {
    private static final String TAG = "WebViewUtil";
    private final Context context;

    public WebViewUtil(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final void getUserAgent(Consumer<String> consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                consumer.accept(WebSettings.getDefaultUserAgent(this.context));
                return;
            } catch (Exception e) {
                if (e instanceof AndroidRuntimeException) {
                    Logger.Companion companion = Logger.INSTANCE;
                    String TAG2 = TAG;
                    Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                    companion.e(TAG2, "WebView could be missing here");
                }
                consumer.accept(null);
                return;
            }
        }
        consumer.accept(null);
    }
}
