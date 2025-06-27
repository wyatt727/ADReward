package com.com.bytedance.overseas.sdk.mZx;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.Td;
import com.bytedance.sdk.openadsdk.core.hu;
import com.json.i5;

/* compiled from: AdvertisingIdHelper.java */
/* loaded from: classes2.dex */
public class EYQ {
    private static volatile EYQ mZx;
    private String EYQ = "";

    public static EYQ EYQ() {
        if (mZx == null) {
            synchronized (EYQ.class) {
                if (mZx == null) {
                    mZx = new EYQ();
                }
            }
        }
        return mZx;
    }

    private EYQ() {
    }

    public String mZx() {
        if (!hu.Pm().lEs(i5.w0)) {
            return "";
        }
        if (!TextUtils.isEmpty(this.EYQ)) {
            return this.EYQ;
        }
        String strMZx = Td.EYQ(hu.EYQ()).mZx(i5.w0, "");
        this.EYQ = strMZx;
        return strMZx;
    }

    public static void EYQ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Td.EYQ(hu.EYQ()).EYQ(i5.w0, str);
    }

    public void mZx(String str) {
        this.EYQ = str;
    }
}
