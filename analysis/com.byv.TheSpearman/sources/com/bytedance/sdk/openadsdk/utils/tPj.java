package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.json.i1;
import com.json.mediationsdk.d;
import java.util.Map;

/* compiled from: TTClientBiddingUtil.java */
/* loaded from: classes2.dex */
public class tPj {
    public static void EYQ(com.bytedance.sdk.openadsdk.core.model.UB ub, Double d) {
        if (ub == null || ub.Hnh() == null) {
            return;
        }
        Map<String, Object> mapHnh = ub.Hnh();
        try {
            Object obj = ub.Hnh().get("sdk_bidding_type");
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String strReplace = (String) mapHnh.get(i1.z);
                if (TextUtils.isEmpty(strReplace)) {
                    return;
                }
                if (d != null) {
                    strReplace = strReplace.replace("${AUCTION_BID_TO_WIN}", String.valueOf(d));
                }
                com.bytedance.sdk.openadsdk.core.hu.Td().EYQ(strReplace);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.pi.mZx("report Win error");
        }
    }

    public static void EYQ(com.bytedance.sdk.openadsdk.core.model.UB ub, Double d, String str, String str2) {
        if (ub == null || ub.Hnh() == null) {
            return;
        }
        Map<String, Object> mapHnh = ub.Hnh();
        try {
            Object obj = ub.Hnh().get("sdk_bidding_type");
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String strReplace = (String) mapHnh.get(i1.y);
                if (TextUtils.isEmpty(strReplace)) {
                    return;
                }
                if (d != null) {
                    strReplace = strReplace.replace(d.n, String.valueOf(d));
                }
                if (str != null) {
                    strReplace = strReplace.replace(d.l, str);
                }
                if (str2 != null) {
                    strReplace = strReplace.replace("${AUCTION_WINNER}", str2);
                }
                com.bytedance.sdk.openadsdk.core.hu.Td().EYQ(strReplace);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.pi.mZx("report Loss error");
        }
    }
}
