package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.Pm.IPb;
import com.bytedance.sdk.component.adexpress.dynamic.Td.QQ;
import java.util.List;

/* loaded from: classes2.dex */
public class DynamicSkipCountDownContainer extends DynamicBaseWidgetImp implements com.bytedance.sdk.component.adexpress.dynamic.Td {
    private int EYQ;
    private int mZx;
    private int zF;

    public DynamicSkipCountDownContainer(Context context, DynamicRootView dynamicRootView, QQ qq) {
        super(context, dynamicRootView, qq);
        setTag(Integer.valueOf(getClickArea()));
        dynamicRootView.setTimeOutListener(this);
        EYQ();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Pm
    public boolean HX() {
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(getBackgroundDrawable());
        }
        setPadding((int) IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.tsL.Td()), (int) IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.tsL.mZx()), (int) IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.tsL.Pm()), (int) IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.tsL.EYQ()));
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void IPb() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = this.HX;
        layoutParams.topMargin = this.tp;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(layoutParams.leftMargin);
            layoutParams.setMarginEnd(layoutParams.rightMargin);
        }
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.zF == 0) {
            setMeasuredDimension(this.mZx, this.QQ);
        } else {
            setMeasuredDimension(this.EYQ, this.QQ);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Td
    public void EYQ(CharSequence charSequence, boolean z, int i, boolean z2) {
        this.zF = i;
    }

    private void EYQ() {
        List<QQ> listMxO = this.pi.MxO();
        if (listMxO == null || listMxO.size() <= 0) {
            return;
        }
        for (QQ qq : listMxO) {
            if (qq.tp().EYQ() == 21) {
                this.EYQ = (int) (this.VwS - IPb.EYQ(this.MxO, qq.QQ()));
            }
            if (qq.tp().EYQ() == 20) {
                this.mZx = (int) (this.VwS - IPb.EYQ(this.MxO, qq.QQ()));
            }
        }
    }
}
