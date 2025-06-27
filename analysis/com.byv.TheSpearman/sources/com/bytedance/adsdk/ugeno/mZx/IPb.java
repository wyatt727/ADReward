package com.bytedance.adsdk.ugeno.mZx;

import android.os.Build;
import android.view.ViewGroup;

/* compiled from: UGMarginLayoutParamsCompat.java */
/* loaded from: classes2.dex */
public class IPb {
    public static int EYQ(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginStart();
        }
        return marginLayoutParams.leftMargin;
    }

    public static int mZx(ViewGroup.MarginLayoutParams marginLayoutParams) {
        if (Build.VERSION.SDK_INT >= 17) {
            return marginLayoutParams.getMarginEnd();
        }
        return marginLayoutParams.rightMargin;
    }
}
