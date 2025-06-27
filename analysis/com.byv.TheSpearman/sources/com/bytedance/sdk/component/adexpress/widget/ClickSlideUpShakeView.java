package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.adexpress.Td.EYQ;

/* loaded from: classes2.dex */
public class ClickSlideUpShakeView extends SlideUpView {
    private ShakeClickView EYQ;

    public ClickSlideUpShakeView(Context context, int i, int i2, int i3) {
        super(context);
        EYQ(context, i, i2, i3);
    }

    private void EYQ(Context context, int i, int i2, int i3) {
        ShakeClickView shakeClickView = new ShakeClickView(context, EYQ.Td(context), i, i2, i3);
        this.EYQ = shakeClickView;
        addView(shakeClickView);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.EYQ.setLayoutParams(layoutParams);
    }

    public ShakeClickView getShakeView() {
        return this.EYQ;
    }

    public void setShakeText(String str) {
        if (this.EYQ == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.EYQ.setShakeText("");
        } else {
            this.EYQ.setShakeText(str);
        }
    }
}
