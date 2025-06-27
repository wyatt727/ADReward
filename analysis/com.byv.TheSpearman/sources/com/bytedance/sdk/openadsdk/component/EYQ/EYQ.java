package com.bytedance.sdk.openadsdk.component.EYQ;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.mZx.Td;
import com.bytedance.sdk.openadsdk.core.model.UB;
import com.bytedance.sdk.openadsdk.nWX.EYQ.Kbd;
import java.util.HashMap;

/* compiled from: TTAppOpenAdClickListener.java */
/* loaded from: classes2.dex */
public class EYQ extends com.bytedance.sdk.openadsdk.core.mZx.EYQ {
    private final com.bytedance.sdk.openadsdk.component.QQ.EYQ EYQ;

    public EYQ(Context context, UB ub, String str, int i, com.bytedance.sdk.openadsdk.component.QQ.EYQ eyq) {
        super(context, ub, str, i);
        this.EYQ = eyq;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mZx.EYQ, com.bytedance.sdk.openadsdk.core.mZx.mZx, com.bytedance.sdk.openadsdk.core.mZx.Td
    public void EYQ(View view, float f, float f2, float f3, float f4, SparseArray<Td.EYQ> sparseArray, boolean z) {
        if (view.getTag() == "open_ad_click_button_tag") {
            EYQ("click_bar");
        } else {
            EYQ("click_material");
        }
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(this.EYQ.mZx()));
        EYQ(map);
        super.EYQ(view, f, f2, f3, f4, sparseArray, z);
        Kbd.EYQ(this.Kbd, 9);
    }
}
