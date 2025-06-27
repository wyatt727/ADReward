package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.vk.openvk.component.video.EYQ.EYQ.EYQ.EYQ;
import com.bykv.vk.openvk.component.video.api.EYQ.mZx;
import com.bytedance.sdk.component.utils.IPb;
import com.bytedance.sdk.openadsdk.core.hu;
import java.io.File;

/* loaded from: classes2.dex */
public class CacheDirFactory {
    private static String EYQ = null;
    public static volatile mZx MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;

    public static int getCacheType() {
        return 1;
    }

    private static mZx EYQ() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                if (MEDIA_CACHE_DIR == null) {
                    EYQ eyq = new EYQ();
                    MEDIA_CACHE_DIR = eyq;
                    eyq.EYQ(getRootDir());
                    MEDIA_CACHE_DIR.Pm();
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File fileEYQ = IPb.EYQ(hu.EYQ(), com.bytedance.sdk.openadsdk.multipro.mZx.Td(), "tt_ad");
        if (fileEYQ.isFile()) {
            fileEYQ.delete();
        }
        if (!fileEYQ.exists()) {
            fileEYQ.mkdirs();
        }
        String absolutePath = fileEYQ.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }

    public static mZx getICacheDir(int i) {
        return EYQ();
    }

    public static String getImageCacheDir() {
        if (EYQ == null) {
            EYQ = getDiskCacheDirPath("image");
        }
        return EYQ;
    }

    public static String getDiskCacheDirPath(String str) {
        return getRootDir() + File.separator + str;
    }
}
