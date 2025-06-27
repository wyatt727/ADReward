package com.mbridge.msdk.f;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.MBConfiguration;

/* compiled from: CommonUtils.java */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Boolean f2746a;
    private static volatile Boolean b;

    public static boolean a() {
        if (f2746a == null) {
            try {
                Boolean boolValueOf = Boolean.valueOf(Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 2);
                f2746a = boolValueOf;
                return boolValueOf.booleanValue();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CommonUtils", "isChina", e);
                }
            }
        }
        return f2746a != null && f2746a.booleanValue();
    }

    public static boolean b() {
        if (b == null) {
            try {
                Boolean boolValueOf = Boolean.valueOf(Integer.parseInt(String.valueOf(MBConfiguration.SDK_VERSION.charAt(10))) == 1);
                b = boolValueOf;
                return boolValueOf.booleanValue();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("CommonUtils", "isOversea", e);
                }
            }
        }
        return b != null && b.booleanValue();
    }
}
