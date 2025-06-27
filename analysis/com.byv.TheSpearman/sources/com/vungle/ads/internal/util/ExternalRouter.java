package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.internal.ui.PresenterAdOpenCallback;
import com.vungle.ads.internal.util.ActivityManager;
import com.vungle.ads.internal.util.Logger;
import java.net.URISyntaxException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExternalRouter.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\nH\u0002J8\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/vungle/ads/internal/util/ExternalRouter;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getIntentFromUrl", "Landroid/content/Intent;", "url", "contextIsNotActivity", "", "launch", "deeplinkUrl", "context", "Landroid/content/Context;", "leftApplicationCallback", "Lcom/vungle/ads/internal/util/ActivityManager$LeftApplicationCallback;", "adOpenCallback", "Lcom/vungle/ads/internal/ui/PresenterAdOpenCallback;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class ExternalRouter {
    public static final ExternalRouter INSTANCE = new ExternalRouter();
    private static final String TAG = "ExternalRouter";

    private ExternalRouter() {
    }

    @JvmStatic
    public static final boolean launch(String deeplinkUrl, String url, Context context, ActivityManager.LeftApplicationCallback leftApplicationCallback, PresenterAdOpenCallback adOpenCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = deeplinkUrl;
        boolean z = true;
        if (str == null || str.length() == 0) {
            String str2 = url;
            if (str2 == null || str2.length() == 0) {
                return false;
            }
        }
        boolean z2 = !(context instanceof Activity);
        try {
            ExternalRouter externalRouter = INSTANCE;
            ActivityManager.INSTANCE.startWhenForeground(context, externalRouter.getIntentFromUrl(deeplinkUrl, z2), externalRouter.getIntentFromUrl(url, z2), leftApplicationCallback, adOpenCallback);
            return true;
        } catch (Exception e) {
            if (str != null && str.length() != 0) {
                z = false;
            }
            if (!z) {
                AnalyticsClient.INSTANCE.logError$vungle_ads_release(312, "Fail to open " + deeplinkUrl, (8 & 4) != 0 ? null : "", (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : null);
            } else {
                AnalyticsClient.INSTANCE.logError$vungle_ads_release(314, "Fail to open " + url, (8 & 4) != 0 ? null : "", (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : null);
            }
            Logger.Companion companion = Logger.INSTANCE;
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            companion.e(TAG2, "Error while opening url" + e.getLocalizedMessage());
            Logger.Companion companion2 = Logger.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            companion2.d(TAG2, "Cannot open url " + url);
            return false;
        }
    }

    private final Intent getIntentFromUrl(String url, boolean contextIsNotActivity) throws URISyntaxException {
        Intent uri = null;
        try {
            String str = url;
            if (!(str == null || str.length() == 0)) {
                uri = Intent.parseUri(url, 0);
            }
            if (uri != null && contextIsNotActivity) {
                uri.setFlags(268435456);
            }
        } catch (URISyntaxException e) {
            Logger.Companion companion = Logger.INSTANCE;
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            companion.e(TAG2, "url format is not correct " + e.getLocalizedMessage());
        }
        return uri;
    }
}
