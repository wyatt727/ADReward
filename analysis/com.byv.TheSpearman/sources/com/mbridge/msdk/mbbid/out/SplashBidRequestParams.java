package com.mbridge.msdk.mbbid.out;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public class SplashBidRequestParams extends BannerBidRequestParams {
    private static int b = 1;
    private static int c;
    private static int d;

    /* renamed from: a, reason: collision with root package name */
    private boolean f3096a;

    public SplashBidRequestParams(String str, String str2) {
        this(str, str2, "");
    }

    public SplashBidRequestParams(String str, String str2, String str3) {
        this(str, str2, str3, false, b, d, c);
    }

    public SplashBidRequestParams(String str, String str2, boolean z, int i, int i2, int i3) {
        this(str, str2, "", z, i, i3, i2);
    }

    public SplashBidRequestParams(String str, String str2, String str3, boolean z, int i, int i2, int i3) {
        super(str, str2, str3, 0, 0);
        this.f3096a = false;
        b = i;
        int i4 = z.i(c.m().c());
        int iG = z.g(c.m().c());
        int i5 = b;
        if (i5 == 1) {
            if (iG > i3 * 4) {
                setHeight(iG - i3);
                setWidth(i4);
            } else {
                setHeight(0);
                setWidth(0);
            }
        } else if (i5 == 2) {
            if (i4 > i2 * 4) {
                setWidth(i4 - i2);
                setHeight(iG);
            } else {
                setHeight(0);
                setWidth(0);
            }
        }
        this.f3096a = z;
    }

    protected final boolean a() {
        return this.f3096a;
    }

    public int getOrientation() {
        return b;
    }
}
