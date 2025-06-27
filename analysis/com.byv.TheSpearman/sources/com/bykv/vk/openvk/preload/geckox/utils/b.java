package com.bykv.vk.openvk.preload.geckox.utils;

import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;

/* compiled from: ExceptionUtils.java */
/* loaded from: classes2.dex */
public final class b {
    public static void a(Throwable th) {
        if (d.a()) {
            GeckoLogger.e("gecko-debug-tag", "throwIfDebug:", th);
            throw new RuntimeException(th);
        }
        GeckoLogger.w("gecko-debug-tag", "throwIfDebug:", th);
    }
}
