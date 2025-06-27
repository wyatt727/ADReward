package com.bytedance.adsdk.ugeno.component.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FlexLine.java */
/* loaded from: classes2.dex */
public class Td {
    int HX;
    int IPb;
    int KO;
    int Kbd;
    float MxO;
    int QQ;
    boolean UB;
    boolean Uc;
    int VwS;
    int hu;
    int pi;
    float tp;
    int tsL;
    int EYQ = Integer.MAX_VALUE;
    int mZx = Integer.MAX_VALUE;
    int Td = Integer.MIN_VALUE;
    int Pm = Integer.MIN_VALUE;
    List<Integer> nWX = new ArrayList();

    Td() {
    }

    public int EYQ() {
        return this.VwS;
    }

    public int mZx() {
        return this.QQ - this.HX;
    }

    void EYQ(View view, int i, int i2, int i3, int i4) {
        mZx mzx = (mZx) view.getLayoutParams();
        this.EYQ = Math.min(this.EYQ, (view.getLeft() - mzx.pi()) - i);
        this.mZx = Math.min(this.mZx, (view.getTop() - mzx.nWX()) - i2);
        this.Td = Math.max(this.Td, view.getRight() + mzx.KO() + i3);
        this.Pm = Math.max(this.Pm, view.getBottom() + mzx.hu() + i4);
    }
}
