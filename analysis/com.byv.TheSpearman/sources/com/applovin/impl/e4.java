package com.applovin.impl;

import com.applovin.impl.g4;
import java.util.List;

/* loaded from: classes.dex */
public abstract class e4 {
    public static List c(com.applovin.impl.sdk.k kVar) {
        if (kVar.t().k()) {
            return m4.c(kVar);
        }
        return null;
    }

    public static List a(com.applovin.impl.sdk.k kVar) {
        Boolean boolB;
        if (!kVar.t().k()) {
            return null;
        }
        if (kVar.t().e() == g4.a.UNIFIED && (boolB = y3.c().b(com.applovin.impl.sdk.k.k())) != null && boolB.booleanValue()) {
            return null;
        }
        boolean zW0 = kVar.w0();
        Boolean bool = (Boolean) kVar.a(qj.o, Boolean.FALSE);
        if (zW0) {
            if (bool.booleanValue()) {
                return b(kVar);
            }
            return null;
        }
        return b(kVar);
    }

    private static List b(com.applovin.impl.sdk.k kVar) {
        if (kVar.t().i() != null) {
            return m4.b(kVar);
        }
        return m4.a(kVar);
    }
}
