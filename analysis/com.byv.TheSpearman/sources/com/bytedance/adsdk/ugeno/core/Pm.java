package com.bytedance.adsdk.ugeno.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ComponentRegistrar.java */
/* loaded from: classes2.dex */
public class Pm {
    private static Map<String, mZx> EYQ = new HashMap();

    public static void EYQ(List<mZx> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (mZx mzx : list) {
            if (mzx != null) {
                EYQ.put(mzx.EYQ(), mzx);
            }
        }
    }

    public static mZx EYQ(String str) {
        return EYQ.get(str);
    }
}
