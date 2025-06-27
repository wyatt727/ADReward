package com.facebook.ads.redexgen.uinode;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.facebook.ads.redexgen.X.5c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04865c {
    public static C0S A00(Context context, InterfaceC05367h interfaceC05367h) {
        return A01(context, interfaceC05367h, null);
    }

    public static C0S A01(Context context, InterfaceC05367h interfaceC05367h, String str) {
        C1206Ym sdkContext = A09(context);
        C0W c0wA77 = interfaceC05367h.A77(sdkContext);
        if (c0wA77 != null) {
            return str != null ? c0wA77.AAJ(str) : c0wA77.AAI();
        }
        return new C1342bb();
    }

    public static C1207Yn A02(Activity activity) {
        return new C1207Yn(activity, (InterfaceC05367h) A0A(), A00(activity, A0A()));
    }

    public static C1207Yn A03(Context context) {
        return new C1207Yn(context, A0A(), new C1342bb());
    }

    public static C1207Yn A04(Context context) {
        if (C0796Ih.A0r(context)) {
            return new C1207Yn(context, A0A(), A00(context, A0A()));
        }
        return A03(context);
    }

    public static C1207Yn A05(Context context, String str) {
        return new C1207Yn(context, A0A(), A01(context, A0A(), str));
    }

    public static C1207Yn A06(Context context, String str) {
        return new C1207Yn(context, A0A(), A01(context, A0A(), str));
    }

    public static C1207Yn A07(Context context, String str) {
        return new C1207Yn(context, A0A(), A01(context, A0A(), str));
    }

    public static EQ A08(Context context) {
        return new EQ(context, A0A(), A0A().A77(A09(context)));
    }

    public static C1206Ym A09(Context context) {
        return new C1206Ym(context, A0A());
    }

    public static synchronized YL A0A() {
        return YL.A02();
    }
}
