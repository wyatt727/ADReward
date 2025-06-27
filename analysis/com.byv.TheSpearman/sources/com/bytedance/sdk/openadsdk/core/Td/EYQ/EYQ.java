package com.bytedance.sdk.openadsdk.core.Td.EYQ;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.mZx.MxO;
import com.bytedance.sdk.openadsdk.core.mZx.Td;
import com.bytedance.sdk.openadsdk.core.model.pi;
import com.bytedance.sdk.openadsdk.utils.tr;
import java.lang.ref.WeakReference;

/* compiled from: DynamicClickListener.java */
/* loaded from: classes2.dex */
public class EYQ extends Td implements com.bytedance.sdk.component.adexpress.dynamic.Kbd.EYQ {
    protected WeakReference<View> EYQ;
    private MxO Td;
    protected WeakReference<View> mZx;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Kbd.EYQ
    public void EYQ(MxO mxO) {
        this.Td = mxO;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Kbd.EYQ
    public void EYQ(View view) {
        this.EYQ = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.Kbd.EYQ
    public void mZx(View view) {
        this.mZx = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mZx.Td
    public void EYQ(View view, float f, float f2, float f3, float f4, SparseArray<Td.EYQ> sparseArray, boolean z) {
        EYQ(view, ((Integer) view.getTag()).intValue(), f, f2, f3, f4, sparseArray);
    }

    private void EYQ(View view, int i, float f, float f2, float f3, float f4, SparseArray<Td.EYQ> sparseArray) {
        if (this.Td != null) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            WeakReference<View> weakReference = this.mZx;
            if (weakReference != null) {
                int[] iArrEYQ = tr.EYQ(weakReference.get());
                if (iArrEYQ != null) {
                    iArr = iArrEYQ;
                }
                int[] iArrTd = tr.Td(this.mZx.get());
                if (iArrTd != null) {
                    iArr2 = iArrTd;
                }
            }
            String strValueOf = "";
            try {
                if (view.getTag(com.bytedance.sdk.component.adexpress.dynamic.EYQ.WU) != null) {
                    strValueOf = String.valueOf(view.getTag(com.bytedance.sdk.component.adexpress.dynamic.EYQ.WU));
                }
            } catch (Exception unused) {
            }
            this.Td.EYQ(view, i, new pi.EYQ().Pm(f).Td(f2).mZx(f3).EYQ(f4).mZx(this.tPj).EYQ(this.wBa).Td(iArr[0]).Pm(iArr[1]).Kbd(iArr2[0]).IPb(iArr2[1]).EYQ(sparseArray).EYQ(this.FH).EYQ(strValueOf).EYQ());
        }
    }
}
