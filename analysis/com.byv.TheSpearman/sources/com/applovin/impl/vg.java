package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.WindowManager;
import com.applovin.impl.sdk.ad.b;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class vg {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f1094a;
    private final int b;
    private final int c;
    private final boolean d;
    private final boolean e;

    public vg(Activity activity) {
        this.f1094a = activity;
        int iC = zp.c(activity);
        this.c = iC;
        boolean zIsTablet = AppLovinSdkUtils.isTablet(activity);
        this.d = zIsTablet;
        this.b = a(iC, zIsTablet);
        this.e = zIsTablet && 2 == a(activity);
    }

    private int a(int i, boolean z) {
        if (z && this.e) {
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return 9;
            }
            if (i == 2) {
                return 8;
            }
            return i == 3 ? 1 : -1;
        }
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 9;
        }
        return i == 3 ? 8 : -1;
    }

    private static int a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        return (((rotation == 0 || rotation == 2) && configuration.orientation == 2) || ((rotation == 1 || rotation == 3) && configuration.orientation == 1)) ? 2 : 1;
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        int i;
        if (bVar.C0() && (i = this.b) != -1) {
            a(i);
        } else {
            a(bVar.d0());
        }
    }

    private void a(b.c cVar) {
        if (cVar == b.c.ACTIVITY_PORTRAIT) {
            if (this.d && this.e) {
                int i = this.c;
                if (i != 1 && i != 3) {
                    a(1);
                    return;
                } else if (i == 1) {
                    a(9);
                    return;
                } else {
                    a(1);
                    return;
                }
            }
            int i2 = this.c;
            if (i2 != 0 && i2 != 2) {
                a(1);
                return;
            } else {
                a(i2 != 0 ? 9 : 1);
                return;
            }
        }
        if (cVar == b.c.ACTIVITY_LANDSCAPE) {
            if (this.d && this.e) {
                int i3 = this.c;
                if (i3 != 0 && i3 != 2) {
                    a(0);
                    return;
                } else {
                    a(i3 != 2 ? 0 : 8);
                    return;
                }
            }
            int i4 = this.c;
            if (i4 != 1 && i4 != 3) {
                a(0);
            } else {
                a(i4 == 1 ? 0 : 8);
            }
        }
    }

    private void a(int i) {
        try {
            this.f1094a.setRequestedOrientation(i);
        } catch (Throwable unused) {
        }
    }
}
