package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;
import com.bytedance.sdk.openadsdk.utils.tr;

/* compiled from: VisibilityChecker.java */
/* loaded from: classes2.dex */
public class rfB {
    private static boolean EYQ(View view, int i) {
        float fEYQ = EYQ(view);
        return fEYQ > 0.0f && fEYQ >= ((float) i) / 100.0f;
    }

    public static float EYQ(View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0 && view.getParent() != null) {
                    if (!view.getGlobalVisibleRect(new Rect())) {
                        return -1.0f;
                    }
                    long jHeight = r1.height() * r1.width();
                    long height = view.getHeight() * view.getWidth();
                    if (height <= 0) {
                        return -1.0f;
                    }
                    return jHeight / height;
                }
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }

    private static boolean mZx(View view) {
        return view != null && view.isShown();
    }

    private static boolean mZx(View view, int i) {
        return view.getWidth() >= Td(view, i) && view.getHeight() >= Pm(view, i);
    }

    private static int Td(View view, int i) {
        if (i == 3) {
            return (int) (tr.Td(view.getContext().getApplicationContext()) * 0.7d);
        }
        return 20;
    }

    private static int Pm(View view, int i) {
        if (i == 3) {
            return tr.Pm(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    private static int mZx(View view, int i, int i2) throws Throwable {
        if (view.getWindowVisibility() != 0) {
            return 4;
        }
        if (!mZx(view)) {
            return 1;
        }
        if (mZx(view, i2)) {
            return !EYQ(view, i) ? 3 : 0;
        }
        return 6;
    }

    public static boolean EYQ(View view, int i, int i2) {
        if (i2 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() != 0) {
                        return false;
                    }
                    if ((view instanceof NativeExpressView) || (view instanceof BannerExpressView)) {
                        break;
                    }
                    view = (View) view.getParent();
                } catch (Throwable unused) {
                }
            }
        }
        return mZx(view, i, i2) == 0;
    }
}
