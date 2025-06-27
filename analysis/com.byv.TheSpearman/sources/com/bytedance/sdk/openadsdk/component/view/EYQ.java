package com.bytedance.sdk.openadsdk.component.view;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.QQ;
import com.bytedance.sdk.openadsdk.core.hu;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.tr;

/* compiled from: TTAppOpenAdUserInfoLayoutHelper.java */
/* loaded from: classes2.dex */
public class EYQ {
    private static boolean EYQ;
    private static Drawable mZx;
    private TextView Kbd;
    private TTRoundRectImageView Pm;
    private LinearLayout Td;

    public void EYQ(PAGAppOpenBaseLayout pAGAppOpenBaseLayout, UB ub, float f, float f2, boolean z) {
        if (pAGAppOpenBaseLayout != null) {
            this.Td = pAGAppOpenBaseLayout.getUserInfo();
            this.Pm = pAGAppOpenBaseLayout.getAppIcon();
            this.Kbd = pAGAppOpenBaseLayout.getAppName();
            this.Td.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.view.EYQ.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                }
            });
        }
        EYQ(ub, f, f2, z);
    }

    public void EYQ() {
        String strKbd = QQ.mZx().Kbd();
        if (TextUtils.isEmpty(strKbd)) {
            this.Kbd.setVisibility(8);
        } else {
            this.Kbd.setText(strKbd);
        }
        mZx();
        try {
            Drawable drawable = mZx;
            if (drawable == null) {
                this.Pm.setVisibility(8);
                return;
            }
            this.Pm.setImageDrawable(drawable);
            if (this.Kbd.getVisibility() == 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.Pm.getLayoutParams();
                marginLayoutParams.setMargins(0, 0, 0, 0);
                this.Pm.setLayoutParams(marginLayoutParams);
            }
        } catch (Throwable unused) {
            this.Pm.setVisibility(8);
        }
    }

    public void mZx() {
        if (EYQ) {
            return;
        }
        try {
            int iIPb = QQ.mZx().IPb();
            if (iIPb != 0) {
                mZx = hu.EYQ().getResources().getDrawable(iIPb);
            }
            EYQ = true;
        } catch (Throwable unused) {
            EYQ = true;
        }
    }

    public static Drawable Td() {
        return mZx;
    }

    private void EYQ(UB ub, float f, float f2, boolean z) {
        int iMZx;
        int iTd;
        int iMxO = ub.MxO();
        if (iMxO == 1 || iMxO == 3) {
            if (z) {
                iMZx = ub.mN().Td();
                iTd = ub.mN().mZx();
            } else {
                iMZx = ub.Dal().get(0).mZx();
                iTd = ub.Dal().get(0).Td();
            }
            if (iMZx <= 0 || iTd <= 0) {
                return;
            }
            float f3 = iTd;
            float fMin = f2 - (f3 * Math.min(f / iMZx, f2 / f3));
            try {
                float fMZx = tr.mZx(hu.EYQ(), 60.0f);
                if (fMin < fMZx) {
                    fMin = fMZx;
                }
                ViewGroup.LayoutParams layoutParams = this.Td.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = -1;
                    layoutParams.height = (int) fMin;
                    this.Td.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
