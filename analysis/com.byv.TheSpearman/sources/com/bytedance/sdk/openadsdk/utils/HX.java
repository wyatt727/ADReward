package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;

/* compiled from: FileCacheUtils.java */
/* loaded from: classes2.dex */
public class HX {
    private static String EYQ;

    public static String EYQ() {
        if (TextUtils.isEmpty(EYQ)) {
            EYQ = com.bykv.vk.openvk.component.video.api.Td.EYQ().getCacheDir() + File.separator + "proxy_cache";
        }
        return EYQ;
    }

    public static void EYQ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }
}
