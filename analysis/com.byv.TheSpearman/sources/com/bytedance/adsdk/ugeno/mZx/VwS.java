package com.bytedance.adsdk.ugeno.mZx;

import android.os.Build;
import android.view.View;

/* compiled from: UGViewCompat.java */
/* loaded from: classes2.dex */
public class VwS {
    public static int EYQ(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }
}
