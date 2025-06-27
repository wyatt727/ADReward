package com.bytedance.sdk.openadsdk.core.mZx;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.mZx.Td;
import com.bytedance.sdk.openadsdk.core.model.UB;

/* compiled from: RewardBarClickListener.java */
/* loaded from: classes2.dex */
public abstract class Kbd extends EYQ {
    protected abstract void EYQ(View view, float f, float f2, float f3, float f4, SparseArray<Td.EYQ> sparseArray, int i, int i2, int i3, boolean z);

    public Kbd(Context context, UB ub, String str, int i) {
        super(context, ub, str, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mZx.EYQ, com.bytedance.sdk.openadsdk.core.mZx.mZx, com.bytedance.sdk.openadsdk.core.mZx.Td
    public void EYQ(View view, float f, float f2, float f3, float f4, SparseArray<Td.EYQ> sparseArray, boolean z) {
        if (EYQ(view, z)) {
            EYQ(view, f, f2, f3, f4, sparseArray, this.xt, this.rfB, this.lEs, z);
        }
        super.EYQ(view, f, f2, f3, f4, sparseArray, z);
    }
}
