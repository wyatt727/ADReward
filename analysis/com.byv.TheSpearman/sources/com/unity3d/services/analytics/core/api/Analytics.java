package com.unity3d.services.analytics.core.api;

import com.unity3d.services.analytics.interfaces.AnalyticsError;
import com.unity3d.services.analytics.interfaces.IAnalytics;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public class Analytics {
    public static IAnalytics analyticsInterface;

    public static void setAnalyticsInterface(IAnalytics iAnalytics) {
        analyticsInterface = iAnalytics;
    }

    @WebViewExposed
    public static void addExtras(final String str, WebViewCallback webViewCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (analyticsInterface != null) {
            Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.analytics.core.api.Analytics.1
                @Override // java.lang.Runnable
                public void run() {
                    Analytics.analyticsInterface.onAddExtras(str);
                }
            });
            webViewCallback.invoke(new Object[0]);
        } else {
            webViewCallback.error(AnalyticsError.API_NOT_FOUND, str);
        }
    }
}
