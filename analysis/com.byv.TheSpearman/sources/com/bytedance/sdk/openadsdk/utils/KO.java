package com.bytedance.sdk.openadsdk.utils;

import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.common.net.HttpHeaders;
import java.util.HashMap;

/* compiled from: NetUtils.java */
/* loaded from: classes2.dex */
public class KO {
    public static void EYQ(SSWebView sSWebView, String str) {
        HashMap map = new HashMap();
        map.put(HttpHeaders.REFERER, TTAdConstant.REQUEST_HEAD_REFERER);
        sSWebView.EYQ(str, map);
    }
}
