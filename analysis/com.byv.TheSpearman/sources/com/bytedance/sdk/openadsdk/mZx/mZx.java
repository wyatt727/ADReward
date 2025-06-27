package com.bytedance.sdk.openadsdk.mZx;

import com.json.i1;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: AdEventConstants.java */
/* loaded from: classes2.dex */
public class mZx {
    public static final Set<String> EYQ = new HashSet(Arrays.asList(CampaignEx.JSON_NATIVE_VIDEO_CLICK, i1.u, "insight_log"));

    /* compiled from: AdEventConstants.java */
    public static class EYQ {
        public static String EYQ = "openDetailPage";
        public static String Td = "direct";
        public static String mZx = "openAdLandPageLinks";
    }

    /* compiled from: AdEventConstants.java */
    /* renamed from: com.bytedance.sdk.openadsdk.mZx.mZx$mZx, reason: collision with other inner class name */
    public static class C0133mZx {
        public static int EYQ = 1;
        public static int Td = 100;
        public static int mZx = 2;
    }

    public static boolean EYQ(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}
