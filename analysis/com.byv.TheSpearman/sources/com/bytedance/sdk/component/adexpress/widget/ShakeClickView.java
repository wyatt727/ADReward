package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.pi;
import com.bytedance.sdk.component.utils.zF;

/* loaded from: classes2.dex */
public class ShakeClickView extends ShakeAnimationView {
    private TextView EYQ;

    public ShakeClickView(Context context, View view, int i, int i2, int i3) {
        super(context, view, i, i2, i3);
    }

    @Override // com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView
    protected void EYQ(Context context, View view) {
        addView(view);
        this.EYQ = (TextView) findViewById(2097610747);
    }

    @Override // com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView
    public void setShakeText(String str) {
        if (this.EYQ == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            try {
                this.EYQ.setText(zF.mZx(this.EYQ.getContext(), "tt_splash_default_click_shake"));
                return;
            } catch (Exception e) {
                pi.EYQ("shakeClickView", e.getMessage());
                return;
            }
        }
        this.EYQ.setText(str);
    }
}
