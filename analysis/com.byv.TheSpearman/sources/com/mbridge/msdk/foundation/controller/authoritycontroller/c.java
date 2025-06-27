package com.mbridge.msdk.foundation.controller.authoritycontroller;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;

/* compiled from: SDKAuthorityController.java */
/* loaded from: classes4.dex */
public class c extends b {
    private static volatile c c;

    public static void c(boolean z) {
    }

    public static boolean k() {
        return true;
    }

    private c() {
        c();
    }

    public static c j() {
        if (c == null) {
            synchronized (c.class) {
                if (c == null) {
                    c = new c();
                }
            }
        }
        return c;
    }

    @Override // com.mbridge.msdk.foundation.controller.authoritycontroller.b
    public final int b(String str) {
        g gVarB = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        if (gVarB == null) {
            h.a();
            gVarB = i.a();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return gVarB.av();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return gVarB.au();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
            return gVarB.aw();
        }
        return -1;
    }

    public final boolean c(String str) {
        boolean z;
        g gVarB = h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        boolean z2 = false;
        if (gVarB == null) {
            h.a();
            gVarB = i.a();
            z = true;
        } else {
            z = false;
        }
        int iAj = gVarB.aj();
        boolean z3 = iAj != 0 ? iAj == 1 && b(str) == 1 : a(str) == 1 && b(str) == 1;
        if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
            z3 = a(str) == 1;
        }
        if (!str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID) || j().g() != 2) {
            return z3;
        }
        if (!gVarB.aG() && !z && a(str) == 1) {
            z2 = true;
        }
        return z2;
    }
}
