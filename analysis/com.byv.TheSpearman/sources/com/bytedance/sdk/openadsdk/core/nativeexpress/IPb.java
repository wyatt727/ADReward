package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.mZx.Td;
import com.bytedance.sdk.openadsdk.core.model.HX;
import com.bytedance.sdk.openadsdk.utils.tr;
import org.json.JSONObject;

/* compiled from: ExpressClickCreativeListener.java */
/* loaded from: classes2.dex */
public class IPb extends com.bytedance.sdk.openadsdk.core.mZx.EYQ {
    public IPb(Context context, com.bytedance.sdk.openadsdk.core.model.UB ub, String str, int i) {
        super(context, ub, str, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mZx.mZx
    protected com.bytedance.sdk.openadsdk.core.model.HX EYQ(float f, float f2, float f3, float f4, SparseArray<Td.EYQ> sparseArray, long j, long j2, View view, View view2, String str, float f5, int i, float f6, int i2, JSONObject jSONObject) {
        float fMZx;
        float fMZx2;
        float fMZx3;
        float fMZx4;
        int i3;
        int i4;
        int i5;
        long j3;
        long j4;
        char c;
        int iMZx;
        int iMZx2;
        int[] iArrEYQ = tr.EYQ(view);
        int i6 = 0;
        if (iArrEYQ == null || iArrEYQ.length != 2) {
            fMZx = f;
            fMZx2 = f2;
            fMZx3 = f3;
            fMZx4 = f4;
            i3 = 0;
            i4 = 0;
        } else {
            i3 = iArrEYQ[0];
            i4 = iArrEYQ[1];
            if (this.hYh == 0) {
                fMZx4 = (tr.mZx(this.Td, f4) + i4) - 0.5f;
                fMZx3 = (tr.mZx(this.Td, f3) + i3) - 0.5f;
                fMZx = (tr.mZx(this.Td, f) + i3) - 0.5f;
                fMZx2 = (tr.mZx(this.Td, f2) + i4) - 0.5f;
            } else {
                fMZx = f;
                fMZx2 = f2;
                fMZx3 = f3;
                fMZx4 = f4;
            }
        }
        int[] iArrEYQ2 = new int[2];
        int[] iArrTd = new int[2];
        if (this.Pm != null) {
            j3 = this.Pm.Kbd;
            j4 = this.Pm.IPb;
            if (this.hYh == 0) {
                iArrEYQ2[0] = tr.mZx(this.Td, this.Pm.VwS) + i3;
                iArrEYQ2[1] = tr.mZx(this.Td, this.Pm.QQ) + i4;
                iMZx = tr.mZx(this.Td, this.Pm.HX);
                iMZx2 = tr.mZx(this.Td, this.Pm.tp);
                c = 0;
                i5 = 1;
            } else {
                c = 0;
                iArrEYQ2[0] = this.Pm.VwS;
                i5 = 1;
                iArrEYQ2[1] = this.Pm.QQ;
                iMZx = this.Pm.HX;
                iMZx2 = this.Pm.tp;
            }
            iArrTd[c] = iMZx;
            iArrTd[i5] = iMZx2;
            if (iMZx == 0 && iMZx2 == 0 && view2 != null) {
                iArrEYQ2 = tr.EYQ(view2);
                iArrTd = tr.Td(view2);
            }
            i6 = 0;
        } else {
            i5 = 1;
            j3 = j;
            j4 = j2;
        }
        this.hYh = i6;
        return new HX.EYQ().IPb(fMZx).Kbd(fMZx2).Pm(fMZx3).Td(fMZx4).mZx(j3).EYQ(j4).mZx(iArrEYQ).EYQ(iArrEYQ2).Td(tr.Td(view)).Pm(iArrTd).Pm(this.rfB).Kbd(this.lEs).IPb(this.xt).mZx(com.bytedance.sdk.openadsdk.core.QQ.mZx().EYQ() ? i5 : 2).EYQ(sparseArray).EYQ(str).EYQ(f5).Td(i).mZx(f6).EYQ(i2).EYQ(jSONObject).EYQ();
    }

    public void EYQ(com.bytedance.sdk.openadsdk.core.model.pi piVar) {
        this.Pm = piVar;
    }
}
