package com.bytedance.adsdk.lottie;

import android.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PerformanceTracker.java */
/* loaded from: classes2.dex */
public class UB {
    private boolean EYQ = false;
    private final Set<Object> mZx = new EYQ();
    private final Map<String, com.bytedance.adsdk.lottie.IPb.Pm> Td = new HashMap();
    private final Comparator<Pair<String, Float>> Pm = new Comparator<Pair<String, Float>>() { // from class: com.bytedance.adsdk.lottie.UB.1
        @Override // java.util.Comparator
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float fFloatValue = ((Float) pair.second).floatValue();
            float fFloatValue2 = ((Float) pair2.second).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    };

    void EYQ(boolean z) {
        this.EYQ = z;
    }

    public void EYQ(String str, float f) {
        if (this.EYQ) {
            com.bytedance.adsdk.lottie.IPb.Pm pm = this.Td.get(str);
            if (pm == null) {
                pm = new com.bytedance.adsdk.lottie.IPb.Pm();
                this.Td.put(str, pm);
            }
            pm.EYQ(f);
            if (str.equals("__container")) {
                Iterator<Object> it = this.mZx.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
