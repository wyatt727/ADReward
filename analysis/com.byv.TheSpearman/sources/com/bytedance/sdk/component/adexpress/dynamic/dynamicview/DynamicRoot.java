package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.sdk.component.adexpress.dynamic.Td.QQ;

/* loaded from: classes2.dex */
public class DynamicRoot extends DynamicBaseWidgetImp {
    public mZx EYQ;

    public DynamicRoot(Context context, DynamicRootView dynamicRootView, QQ qq) {
        super(context, dynamicRootView, qq);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Pm
    public boolean HX() {
        return super.HX();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    protected mZx EYQ(Bitmap bitmap) {
        EYQ eyq = new EYQ(bitmap, this.EYQ);
        this.EYQ = eyq;
        return eyq;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    protected GradientDrawable getDrawable() {
        mZx mzx = new mZx();
        this.EYQ = mzx;
        return mzx;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    protected GradientDrawable EYQ(GradientDrawable.Orientation orientation, int[] iArr) {
        mZx mzx = new mZx(orientation, iArr);
        this.EYQ = mzx;
        return mzx;
    }
}
