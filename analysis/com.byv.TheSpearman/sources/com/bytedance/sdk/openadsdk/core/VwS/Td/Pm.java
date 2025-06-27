package com.bytedance.sdk.openadsdk.core.VwS.Td;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Arrays;
import java.util.List;

/* compiled from: VastUtils.java */
/* loaded from: classes2.dex */
public class Pm {
    public static final List<String> EYQ = Arrays.asList("video/mp4", "video/3gpp");

    public static double EYQ(int i, double d, int i2, int i3, int i4, String str) {
        double dEYQ = EYQ(i, d, i2, i3);
        return EYQ(str) * (1.0d / ((dEYQ + 1.0d) + EYQ(i4)));
    }

    private static double EYQ(int i, double d, int i2, int i3) {
        double dAbs = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        double dAbs2 = d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? Math.abs(d - (i3 > 0 ? i2 / i3 : 0.0d)) : 0.0d;
        if (i > 0) {
            dAbs = Math.abs((i - i2) / i);
        }
        return dAbs2 + dAbs;
    }

    private static double EYQ(int i) {
        int iMax = Math.max(i, 0);
        return (700 > iMax || iMax > 1500) ? Math.min(Math.abs(700 - iMax) / 700.0f, Math.abs(1500 - iMax) / 1500.0f) : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    private static double EYQ(String str) {
        if (str == null) {
            str = "";
        }
        char c = 65535;
        int iHashCode = str.hashCode();
        if (iHashCode != -1664118616) {
            if (iHashCode == 1331848029 && str.equals("video/mp4")) {
                c = 0;
            }
        } else if (str.equals("video/3gpp")) {
            c = 1;
        }
        return c != 0 ? 1.0d : 1.5d;
    }
}
