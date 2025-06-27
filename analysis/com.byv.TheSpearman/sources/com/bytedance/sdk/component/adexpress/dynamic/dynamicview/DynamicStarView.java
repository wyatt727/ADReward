package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.Pm.IPb;
import com.bytedance.sdk.component.adexpress.dynamic.Td.QQ;
import com.bytedance.sdk.component.adexpress.widget.TTRatingBar2;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* loaded from: classes2.dex */
public class DynamicStarView extends DynamicBaseWidgetImp {
    private int EYQ;

    public DynamicStarView(Context context, DynamicRootView dynamicRootView, QQ qq) {
        super(context, dynamicRootView, qq);
        this.EYQ = 0;
        this.KO = new TTRatingBar2(context, null);
        this.KO.setTag(Integer.valueOf(getClickArea()));
        addView(this.KO, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        int iEYQ = (int) ((IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.tsL.Kbd()) * 5.0f) + IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.tsL.Td() + IPb.EYQ(com.bytedance.sdk.component.adexpress.Pm.EYQ(), this.tsL.Pm())));
        if (this.VwS > iEYQ && 4 == this.tsL.QQ()) {
            this.EYQ = (this.VwS - iEYQ) / 2;
        }
        this.VwS = iEYQ;
        return new FrameLayout.LayoutParams(this.VwS, this.QQ);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void IPb() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.VwS, this.QQ);
        layoutParams.topMargin = this.tp;
        layoutParams.leftMargin = this.HX + this.EYQ;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(layoutParams.leftMargin);
            layoutParams.setMarginEnd(layoutParams.rightMargin);
        }
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Pm
    public boolean HX() throws NumberFormatException {
        super.HX();
        double dPi = this.tsL.pi();
        if (com.bytedance.sdk.component.adexpress.Pm.mZx() && (dPi < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || dPi > 5.0d || (this.nWX != null && this.nWX.getRenderRequest() != null && this.nWX.getRenderRequest().tp() != 4))) {
            this.KO.setVisibility(8);
            return true;
        }
        double d = (dPi < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || dPi > 5.0d) ? 5.0d : dPi;
        this.KO.setVisibility(0);
        ((TTRatingBar2) this.KO).EYQ(d, this.tsL.VwS(), (int) this.tsL.Kbd(), ((int) IPb.EYQ(this.MxO, this.tsL.mZx())) + ((int) IPb.EYQ(this.MxO, this.tsL.EYQ())) + ((int) IPb.EYQ(this.MxO, this.tsL.Kbd())));
        return true;
    }
}
