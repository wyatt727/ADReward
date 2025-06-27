package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: SimUtils.java */
/* loaded from: classes2.dex */
public class XN {
    private static String EYQ = null;
    private static volatile boolean Pm = true;
    private static String Td;
    private static String mZx;

    /* JADX INFO: Access modifiers changed from: private */
    public static void Kbd() {
        String simOperatorName;
        String simOperator;
        String strSubstring;
        if (com.bytedance.sdk.openadsdk.core.hu.EYQ() == null) {
            return;
        }
        Pm = true;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) com.bytedance.sdk.openadsdk.core.hu.EYQ().getSystemService("phone");
            try {
                int simState = telephonyManager.getSimState();
                if (simState == 0 || simState == 1) {
                    Pm = false;
                }
                com.bytedance.sdk.component.utils.pi.EYQ("MCC", Pm ? "Have SIM card" : "No SIM card");
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.pi.EYQ("SimUtils", th.getMessage());
            }
            String str = null;
            try {
                simOperatorName = telephonyManager.getSimOperatorName();
            } catch (Throwable unused) {
                simOperatorName = null;
            }
            try {
                simOperator = telephonyManager.getNetworkOperator();
            } catch (Throwable unused2) {
                simOperator = null;
            }
            if (simOperator == null || simOperator.length() < 5) {
                try {
                    simOperator = telephonyManager.getSimOperator();
                } catch (Throwable unused3) {
                }
            }
            if (TextUtils.isEmpty(simOperator) || simOperator.length() <= 4) {
                strSubstring = null;
            } else {
                String strSubstring2 = simOperator.substring(0, 3);
                strSubstring = simOperator.substring(3);
                str = strSubstring2;
            }
            if (!TextUtils.isEmpty(simOperatorName)) {
                EYQ = simOperatorName;
            }
            if (!TextUtils.isEmpty(str)) {
                mZx = str;
            }
            if (TextUtils.isEmpty(strSubstring)) {
                return;
            }
            Td = strSubstring;
        } catch (Throwable unused4) {
        }
    }

    public static String EYQ() {
        EYQ.EYQ();
        return EYQ;
    }

    public static String mZx() {
        try {
            EYQ.EYQ();
            if (!Pm) {
                StringBuilder sb = new StringBuilder("getMCC");
                sb.append(Pm ? "Have SIM card" : "No SIM card, MCC returns null");
                com.bytedance.sdk.component.utils.pi.EYQ("MCC", sb.toString());
                return null;
            }
            Configuration configuration = com.bytedance.sdk.openadsdk.core.hu.EYQ().getResources().getConfiguration();
            String strValueOf = configuration.mcc != 0 ? String.valueOf(configuration.mcc) : mZx;
            com.bytedance.sdk.component.utils.pi.EYQ("MCC", "config=" + configuration.mcc + ",sMCC=" + mZx);
            return strValueOf;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("SimUtils", th.getMessage());
            return null;
        }
    }

    public static String Td() {
        EYQ.EYQ();
        return Td;
    }

    /* compiled from: SimUtils.java */
    public static class EYQ extends com.bytedance.sdk.component.VwS.QQ {
        public static AtomicBoolean EYQ = new AtomicBoolean(false);
        private static final AtomicLong mZx = new AtomicLong(0);

        public EYQ(String str, int i) {
            super(str, i);
        }

        public static void EYQ() {
            if (EYQ.get()) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            AtomicLong atomicLong = mZx;
            if (jCurrentTimeMillis - atomicLong.get() < TTAdConstant.AD_MAX_EVENT_TIME) {
                return;
            }
            atomicLong.set(jCurrentTimeMillis);
            xt.mZx(new EYQ("UpdateSimStatusTask", 5));
        }

        @Override // java.lang.Runnable
        public void run() {
            EYQ.set(true);
            XN.Kbd();
            EYQ.set(false);
        }
    }
}
