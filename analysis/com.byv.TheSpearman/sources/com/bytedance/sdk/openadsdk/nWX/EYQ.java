package com.bytedance.sdk.openadsdk.nWX;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.openadsdk.core.MxO;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.utils.FH;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: TrackAdUrlUtils.java */
/* loaded from: classes2.dex */
public class EYQ {
    private static int EYQ(int i) {
        int i2 = 2;
        if (i != 2) {
            i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    i2 = 5;
                    if (i != 5 && i != 15) {
                        return -1;
                    }
                }
            }
        }
        return i2;
    }

    public static List<String> EYQ(List<String> list, boolean z) {
        String strEYQ = MxO.EYQ(hu.EYQ());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(strEYQ)) {
                next = next.replace("{UID}", strEYQ).replace("__UID__", strEYQ);
            }
            if (z) {
                next = EYQ(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    private static String EYQ(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return str.replace("[ss_random]", String.valueOf(new SecureRandom().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
        } catch (Exception e) {
            pi.EYQ("TrackAdUrlUtils", e.getMessage());
            return str;
        }
    }

    public static List<String> EYQ(List<String> list, boolean z, UB ub) {
        String strEYQ = MxO.EYQ(hu.EYQ());
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("{TS}") || next.contains("__TS__")) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                next = next.replace("{TS}", String.valueOf(jCurrentTimeMillis)).replace("__TS__", String.valueOf(jCurrentTimeMillis));
            }
            if ((next.contains("{UID}") || next.contains("__UID__")) && !TextUtils.isEmpty(strEYQ)) {
                next = next.replace("{UID}", strEYQ).replace("__UID__", strEYQ);
            }
            if (next.contains("__CID__") && ub != null && !TextUtils.isEmpty(ub.VOV())) {
                next = next.replace("__CID__", ub.VOV());
            }
            if (next.contains("__CTYPE__") && ub != null) {
                next = next.replace("__CTYPE__", String.valueOf(EYQ(ub.by())));
            }
            if (next.contains("__GAID__")) {
                next = next.replace("__GAID__", com.com.bytedance.overseas.sdk.mZx.EYQ.EYQ().mZx());
            }
            if (next.contains("__OS__")) {
                next = next.replace("__OS__", "0");
            }
            if (next.contains("__UA1__")) {
                next = next.replace("__UA1__", URLEncoder.encode(FH.Td()));
            }
            if (z) {
                next = EYQ(next);
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
