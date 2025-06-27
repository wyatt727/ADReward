package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.Pm.IPb;
import com.bytedance.sdk.component.adexpress.dynamic.Td.QQ;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class DynamicTimeOuterContainerWidgetImp extends DynamicBaseWidgetImp implements com.bytedance.sdk.component.adexpress.dynamic.Td {
    int EYQ;
    private int WU;
    private boolean XN;
    boolean mZx;
    private int zF;

    public DynamicTimeOuterContainerWidgetImp(Context context, DynamicRootView dynamicRootView, QQ qq) {
        super(context, dynamicRootView, qq);
        this.WU = 0;
        setTag(Integer.valueOf(getClickArea()));
        EYQ();
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void IPb() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (this.mZx) {
            layoutParams.leftMargin = this.HX;
        } else {
            layoutParams.leftMargin = this.HX + this.WU;
        }
        if (this.XN && this.tsL != null) {
            layoutParams.leftMargin = ((this.HX + this.WU) - ((int) IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.tsL.Td()))) - ((int) IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.tsL.Pm()));
        }
        if (com.bytedance.sdk.component.adexpress.Pm.mZx()) {
            layoutParams.topMargin = this.tp - ((int) IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.tsL.mZx()));
        }
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(layoutParams.leftMargin);
            layoutParams.setMarginEnd(layoutParams.rightMargin);
        }
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Pm
    public boolean HX() {
        if (com.bytedance.sdk.component.adexpress.Pm.Kbd.mZx(this.nWX.getRenderRequest().Pm())) {
            return true;
        }
        super.HX();
        setPadding((int) IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.tsL.Td()), (int) IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.tsL.mZx()), (int) IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.tsL.Pm()), (int) IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.tsL.EYQ()));
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.XN && this.tsL != null) {
            setMeasuredDimension(this.zF + ((int) IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.tsL.Td())) + ((int) IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.tsL.Pm())), this.QQ);
        } else if (this.mZx) {
            setMeasuredDimension(this.VwS, this.QQ);
        } else {
            setMeasuredDimension(this.EYQ, this.QQ);
        }
    }

    private void EYQ() {
        List<QQ> listMxO = this.pi.MxO();
        if (listMxO == null || listMxO.size() <= 0) {
            return;
        }
        Iterator<QQ> it = listMxO.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            QQ next = it.next();
            if (TextUtils.equals("skip-with-time-skip-btn", next.tp().mZx())) {
                this.zF = (int) IPb.EYQ(this.MxO, next.QQ() + (com.bytedance.sdk.component.adexpress.Pm.mZx() ? next.pi() : 0));
                this.EYQ = this.VwS - this.zF;
            }
        }
        this.WU = this.VwS - this.EYQ;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Td
    public void EYQ(CharSequence charSequence, boolean z, int i, boolean z2) {
        if (z2 && this.XN != z2) {
            this.XN = z2;
            IPb();
            return;
        }
        if (z && this.mZx != z) {
            this.mZx = z;
            IPb();
        }
        this.mZx = z;
    }
}
