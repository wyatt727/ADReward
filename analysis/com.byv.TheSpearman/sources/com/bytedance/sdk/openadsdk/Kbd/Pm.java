package com.bytedance.sdk.openadsdk.Kbd;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.utils.lEs;
import java.util.Map;

/* compiled from: NetHook.java */
/* loaded from: classes2.dex */
public final class Pm extends EYQ {
    public static Td EYQ;

    public static String EYQ(com.bytedance.sdk.component.IPb.mZx.Td td, String str) {
        Td tdEYQ;
        Map map;
        if (!lEs.Td() || (tdEYQ = mZx.EYQ("net")) == null || (map = (Map) tdEYQ.EYQ(1, str)) == null) {
            return str;
        }
        String str2 = (String) map.get("url");
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        Map map2 = (Map) map.get("header");
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                td.mZx(str3, (String) map2.get(str3));
            }
        }
        return str;
    }
}
