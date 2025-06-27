package com.bytedance.sdk.component.adexpress.dynamic.animation.EYQ;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: AnimationSets.java */
/* loaded from: classes2.dex */
public class mZx implements com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Kbd {
    List<Pm> EYQ = new ArrayList();

    public mZx(View view, List<com.bytedance.sdk.component.adexpress.dynamic.Td.EYQ> list) {
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.Td.EYQ> it = list.iterator();
        while (it.hasNext()) {
            Pm pmEYQ = Td.EYQ().EYQ(view, it.next());
            if (pmEYQ != null) {
                this.EYQ.add(pmEYQ);
            }
        }
    }

    public void EYQ() {
        Iterator<Pm> it = this.EYQ.iterator();
        while (it.hasNext()) {
            try {
                it.next().Td();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.Kbd
    public void mZx() {
        Iterator<Pm> it = this.EYQ.iterator();
        while (it.hasNext()) {
            try {
                it.next().mZx();
            } catch (Exception unused) {
            }
        }
    }
}
