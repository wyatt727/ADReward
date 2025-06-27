package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: AdmobOverlayHelper.java */
/* loaded from: classes2.dex */
public class Td {
    public static void EYQ(ViewGroup viewGroup, com.bytedance.sdk.openadsdk.core.model.UB ub) {
        if (viewGroup == null || ub == null || TextUtils.isEmpty(ub.cVL())) {
            return;
        }
        try {
            if (viewGroup.getTag(tp.Jx) != null) {
                return;
            }
            int i = tp.Jx;
            viewGroup.setTag(i, Integer.valueOf(i));
            Drawable drawableEYQ = EYQ(viewGroup.getResources(), ub);
            if (drawableEYQ == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                viewGroup.setForeground(drawableEYQ);
                return;
            }
            if (Build.VERSION.SDK_INT >= 18) {
                viewGroup.getOverlay().add(drawableEYQ);
                viewGroup.addOnLayoutChangeListener(new EYQ(drawableEYQ));
                return;
            }
            View view = new View(viewGroup.getContext());
            view.setBackground(drawableEYQ);
            view.setClickable(false);
            view.setFocusable(false);
            viewGroup.addView(view);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("add overlay fail", th.getMessage());
        }
    }

    public static void EYQ(Activity activity, com.bytedance.sdk.openadsdk.core.model.UB ub) {
        if (activity == null || ub == null || TextUtils.isEmpty(ub.cVL())) {
            return;
        }
        try {
            if (activity.getWindow().getDecorView().getTag(tp.Jx) != null) {
                return;
            }
            View decorView = activity.getWindow().getDecorView();
            int i = tp.Jx;
            decorView.setTag(i, Integer.valueOf(i));
            Drawable drawableEYQ = EYQ(activity.getResources(), ub);
            if (drawableEYQ == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                activity.getWindow().getDecorView().setForeground(drawableEYQ);
                return;
            }
            if (Build.VERSION.SDK_INT >= 18) {
                activity.getWindow().getDecorView().getOverlay().add(drawableEYQ);
                activity.getWindow().getDecorView().addOnLayoutChangeListener(new EYQ(drawableEYQ));
                return;
            }
            View view = new View(activity);
            view.setBackground(drawableEYQ);
            view.setClickable(false);
            view.setFocusable(false);
            activity.getWindow().addContentView(view, new ViewGroup.LayoutParams(-1, -1));
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.pi.EYQ("add overlay fail", th.getMessage());
        }
    }

    private static Drawable EYQ(Resources resources, com.bytedance.sdk.openadsdk.core.model.UB ub) {
        try {
            String strCVL = ub.cVL();
            if (TextUtils.isEmpty(strCVL)) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(strCVL, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(resources.getDisplayMetrics());
            return bitmapDrawable;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* compiled from: AdmobOverlayHelper.java */
    private static class EYQ implements View.OnLayoutChangeListener {
        private final Drawable EYQ;
        private int Td;
        private int mZx;

        public EYQ(Drawable drawable) {
            this.EYQ = drawable;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if (i9 == this.mZx && i10 == this.Td) {
                return;
            }
            this.mZx = i9;
            this.Td = i10;
            this.EYQ.setBounds(0, 0, i9, i10);
        }
    }
}
