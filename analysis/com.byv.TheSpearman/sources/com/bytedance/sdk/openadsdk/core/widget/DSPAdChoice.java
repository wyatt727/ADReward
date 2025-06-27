package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.tr;

/* loaded from: classes2.dex */
public class DSPAdChoice extends PAGImageView {
    public DSPAdChoice(Context context) {
        super(context);
        EYQ();
    }

    private void EYQ() {
        setVisibility(8);
        setId(tp.baW);
    }

    public void EYQ(int i, UB ub) {
        if (ub.oIw() || (ub.oB() && ub.VwS())) {
            tr.EYQ((View) this, 0);
            com.bytedance.sdk.openadsdk.MxO.Td.EYQ().EYQ((int) tr.EYQ(getContext(), i, true), this, ub);
        }
    }
}
