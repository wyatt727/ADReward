package com.bytedance.sdk.openadsdk.nWX.EYQ;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.rfB;

/* compiled from: PAGMrcVisibilityTracker.java */
/* loaded from: classes2.dex */
public class IPb {
    public static boolean EYQ(View view, int i) {
        return EYQ(view, false, i);
    }

    public static boolean EYQ(View view, boolean z, int i) {
        if (view == null) {
            return false;
        }
        return rfB.EYQ(view, z ? 30 : 50, i);
    }
}
