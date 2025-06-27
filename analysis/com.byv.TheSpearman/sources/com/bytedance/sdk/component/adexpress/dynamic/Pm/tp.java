package com.bytedance.sdk.component.adexpress.dynamic.Pm;

import com.bytedance.sdk.component.adexpress.dynamic.Pm.mZx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: FlexComputeRuler.java */
/* loaded from: classes2.dex */
public class tp {
    public static float EYQ(float f) {
        return (float) Math.ceil((f * 16.0f) / 16.0f);
    }

    public static List<mZx.EYQ> EYQ(float f, List<mZx.EYQ> list) {
        ArrayList<mZx.EYQ> arrayList = new ArrayList();
        Iterator<mZx.EYQ> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((mZx.EYQ) it.next().clone());
        }
        boolean z = true;
        int i = 0;
        int i2 = 0;
        for (mZx.EYQ eyq : arrayList) {
            if (eyq.mZx) {
                i = (int) (i + eyq.EYQ);
            } else {
                i2 = (int) (i2 + eyq.EYQ);
                z = false;
            }
        }
        if (z && f > i) {
            return arrayList;
        }
        float f2 = i;
        float f3 = f < f2 ? f / f2 : 1.0f;
        float f4 = f > f2 ? (f - f2) / i2 : 0.0f;
        if (f4 > 1.0f) {
            ArrayList arrayList2 = new ArrayList();
            boolean z2 = false;
            for (mZx.EYQ eyq2 : arrayList) {
                if (!eyq2.mZx && eyq2.Td != 0.0f && eyq2.EYQ * f4 > eyq2.Td) {
                    eyq2.EYQ = eyq2.Td;
                    eyq2.mZx = true;
                    z2 = true;
                }
                arrayList2.add(eyq2);
            }
            if (z2) {
                return EYQ(f, arrayList2);
            }
        }
        int i3 = 0;
        for (mZx.EYQ eyq3 : arrayList) {
            if (eyq3.mZx) {
                eyq3.EYQ = EYQ(eyq3.EYQ * f3);
            } else {
                eyq3.EYQ = EYQ(eyq3.EYQ * f4);
            }
            i3 = (int) (i3 + eyq3.EYQ);
        }
        float f5 = i3;
        if (f5 < f) {
            float f6 = f - f5;
            for (int size = 0; size < arrayList.size() && f6 > 0.0f; size = (size + 1) % arrayList.size()) {
                mZx.EYQ eyq4 = (mZx.EYQ) arrayList.get(size);
                if ((f < f2 && eyq4.mZx) || (f > f2 && !eyq4.mZx)) {
                    eyq4.EYQ += 0.0625f;
                    f6 -= 0.0625f;
                }
            }
        }
        return arrayList;
    }
}
