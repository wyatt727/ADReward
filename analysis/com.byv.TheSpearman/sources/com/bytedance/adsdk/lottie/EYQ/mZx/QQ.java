package com.bytedance.adsdk.lottie.EYQ.mZx;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MaskKeyframeAnimation.java */
/* loaded from: classes2.dex */
public class QQ {
    private final List<EYQ<com.bytedance.adsdk.lottie.Td.mZx.nWX, Path>> EYQ;
    private final List<com.bytedance.adsdk.lottie.Td.mZx.QQ> Td;
    private final List<EYQ<Integer, Integer>> mZx;

    public QQ(List<com.bytedance.adsdk.lottie.Td.mZx.QQ> list) {
        this.Td = list;
        this.EYQ = new ArrayList(list.size());
        this.mZx = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.EYQ.add(list.get(i).mZx().EYQ());
            this.mZx.add(list.get(i).Td().EYQ());
        }
    }

    public List<com.bytedance.adsdk.lottie.Td.mZx.QQ> EYQ() {
        return this.Td;
    }

    public List<EYQ<com.bytedance.adsdk.lottie.Td.mZx.nWX, Path>> mZx() {
        return this.EYQ;
    }

    public List<EYQ<Integer, Integer>> Td() {
        return this.mZx;
    }
}
