package com.bytedance.sdk.openadsdk.core.nativeexpress.EYQ;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.openadsdk.utils.tr;

/* compiled from: DynamicViewUtils.java */
/* loaded from: classes2.dex */
public class EYQ {
    public static Pair<Float, Float> EYQ(Window window, int i) {
        View decorView = window.getDecorView();
        float[] fArrEYQ = {decorView.getWidth() - (decorView.getPaddingLeft() * 2), decorView.getHeight() - (decorView.getPaddingTop() * 2)};
        fArrEYQ[0] = tr.Td(window.getContext(), fArrEYQ[0]);
        fArrEYQ[1] = tr.Td(window.getContext(), fArrEYQ[1]);
        if (fArrEYQ[0] < 10.0f || fArrEYQ[1] < 10.0f) {
            fArrEYQ = EYQ(window.getContext(), tr.Td(window.getContext(), tr.EYQ()), i);
        }
        float fMax = Math.max(fArrEYQ[0], fArrEYQ[1]);
        float fMin = Math.min(fArrEYQ[0], fArrEYQ[1]);
        if (i == 1) {
            fArrEYQ[0] = fMin;
            fArrEYQ[1] = fMax;
        } else {
            fArrEYQ[0] = fMax;
            fArrEYQ[1] = fMin;
        }
        return new Pair<>(Float.valueOf(fArrEYQ[0]), Float.valueOf(fArrEYQ[1]));
    }

    private static float[] EYQ(Context context, int i, int i2) {
        float fEYQ = EYQ(context);
        float fMZx = mZx(context);
        if ((i2 == 1) != (fEYQ > fMZx)) {
            float f = fEYQ + fMZx;
            fMZx = f - fMZx;
            fEYQ = f - fMZx;
        }
        if (i2 == 1) {
            fEYQ -= i;
        } else {
            fMZx -= i;
        }
        return new float[]{fMZx, fEYQ};
    }

    public static float EYQ(Context context) {
        return tr.Td(context, tr.HX(context));
    }

    public static float mZx(Context context) {
        return tr.Td(context, tr.tp(context));
    }
}
