package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.json.t2;
import java.util.Iterator;

/* compiled from: AutoTestUtils.java */
/* loaded from: classes2.dex */
public class Pm {
    public static String EYQ(String str) {
        if (!com.bytedance.sdk.component.utils.pi.Pm() || TextUtils.isEmpty(str)) {
            return str;
        }
        com.bytedance.sdk.openadsdk.core.model.IPb iPb = new com.bytedance.sdk.openadsdk.core.model.IPb(com.bytedance.sdk.openadsdk.core.QQ.mZx().tsL());
        StringBuilder sb = new StringBuilder(str);
        Iterator<String> it = iPb.mZx().iterator();
        while (it.hasNext()) {
            if (sb.toString().contains(it.next())) {
                if (sb.toString().contains("?")) {
                    sb.append(t2.i.c);
                    sb.append(iPb.EYQ());
                } else {
                    sb.append("?");
                    sb.append(iPb.EYQ());
                }
            }
        }
        return sb.toString();
    }
}
