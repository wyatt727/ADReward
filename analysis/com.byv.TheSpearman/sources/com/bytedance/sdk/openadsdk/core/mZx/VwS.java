package com.bytedance.sdk.openadsdk.core.mZx;

import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.mZx.Td;
import com.bytedance.sdk.openadsdk.utils.tp;

/* compiled from: VastClickListenerWrapper.java */
/* loaded from: classes2.dex */
public abstract class VwS extends Td {
    private final String EYQ;
    private Td Td;
    private final com.bytedance.sdk.openadsdk.core.VwS.EYQ mZx;

    public VwS(String str, com.bytedance.sdk.openadsdk.core.VwS.EYQ eyq) {
        this(str, eyq, null);
    }

    public VwS(String str, com.bytedance.sdk.openadsdk.core.VwS.EYQ eyq, Td td) {
        this.EYQ = str;
        this.mZx = eyq;
        this.Td = td;
    }

    public void EYQ(Td td) {
        this.Td = td;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mZx.Td
    protected void EYQ(View view, float f, float f2, float f3, float f4, SparseArray<Td.EYQ> sparseArray, boolean z) {
        com.bytedance.sdk.openadsdk.core.VwS.EYQ eyq = this.mZx;
        if (eyq != null) {
            eyq.Kbd(this.EYQ);
        }
        if (view != null) {
            if (view.getId() == tp.Td) {
                view.setTag(570425345, "VAST_TITLE");
            } else if (view.getId() == tp.VwS) {
                view.setTag(570425345, "VAST_DESCRIPTION");
            } else {
                view.setTag(570425345, this.EYQ);
            }
        }
        Td td = this.Td;
        if (td != null) {
            td.tPj = this.tPj;
            this.Td.wBa = this.wBa;
            this.Td.rfB = this.rfB;
            this.Td.lEs = this.rfB;
            this.Td.xt = this.rfB;
            this.Td.EYQ(view, f, f2, f3, f4, sparseArray, z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mZx.Td, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return super.onTouch(view, motionEvent);
    }
}
