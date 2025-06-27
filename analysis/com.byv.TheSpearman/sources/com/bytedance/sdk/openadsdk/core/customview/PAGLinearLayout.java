package com.bytedance.sdk.openadsdk.core.customview;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* loaded from: classes2.dex */
public class PAGLinearLayout extends LinearLayout {
    public PAGLinearLayout(Context context) {
        super(context);
        EYQ();
    }

    public PAGLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        EYQ();
    }

    private void EYQ() {
        if (Build.VERSION.SDK_INT >= 17) {
            setLayoutDirection(3);
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(EYQ.EYQ(this, layoutParams));
    }

    @Override // android.widget.LinearLayout
    public void setGravity(int i) {
        super.setGravity(EYQ.EYQ(i));
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.setPaddingRelative(i, i2, i3, i4);
        } else {
            super.setPadding(i, i2, i3, i4);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}
