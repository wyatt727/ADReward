package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;

/* compiled from: JsBridgeUtils.java */
/* loaded from: classes2.dex */
public class pi {
    public static void EYQ(Uri uri, com.bytedance.sdk.openadsdk.core.wBa wba) {
        if (wba == null || !wba.EYQ(uri)) {
            return;
        }
        try {
            wba.mZx(uri);
        } catch (Exception e) {
            e.toString();
        }
    }

    public static String EYQ(WebView webView, int i) {
        if (webView == null) {
            return "";
        }
        String userAgentString = webView.getSettings().getUserAgentString();
        if (TextUtils.isEmpty(userAgentString)) {
            return "";
        }
        return userAgentString + " open_news open_news_u_s/" + i;
    }
}
