package com.mbridge.msdk.video.dynview.i.b;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.mbridge.msdk.foundation.tools.ai;

/* compiled from: UIDrawableUtil.java */
/* loaded from: classes4.dex */
public final class a {
    public static void a(View view, float f, float f2, String str, String[] strArr, GradientDrawable.Orientation orientation) {
        if (view == null || strArr == null) {
            return;
        }
        int[] iArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            iArr[i] = Color.parseColor(strArr[i]);
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        gradientDrawable.setCornerRadius(ai.a(view.getContext(), f2));
        gradientDrawable.setStroke(ai.a(view.getContext(), f), Color.parseColor(str));
        view.setBackground(gradientDrawable);
    }
}
