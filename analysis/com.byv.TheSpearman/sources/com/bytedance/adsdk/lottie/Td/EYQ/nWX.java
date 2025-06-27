package com.bytedance.adsdk.lottie.Td.EYQ;

import java.util.Arrays;
import java.util.List;

/* compiled from: BaseAnimatableValue.java */
/* loaded from: classes2.dex */
abstract class nWX<V, O> implements pi<V, O> {
    final List<com.bytedance.adsdk.lottie.VwS.EYQ<V>> EYQ;

    nWX(List<com.bytedance.adsdk.lottie.VwS.EYQ<V>> list) {
        this.EYQ = list;
    }

    @Override // com.bytedance.adsdk.lottie.Td.EYQ.pi
    public List<com.bytedance.adsdk.lottie.VwS.EYQ<V>> Td() {
        return this.EYQ;
    }

    @Override // com.bytedance.adsdk.lottie.Td.EYQ.pi
    public boolean mZx() {
        return this.EYQ.isEmpty() || (this.EYQ.size() == 1 && this.EYQ.get(0).Kbd());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.EYQ.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.EYQ.toArray()));
        }
        return sb.toString();
    }
}
