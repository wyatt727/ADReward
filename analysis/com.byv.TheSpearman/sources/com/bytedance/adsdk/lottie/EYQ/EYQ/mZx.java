package com.bytedance.adsdk.lottie.EYQ.EYQ;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CompoundTrimPathContent.java */
/* loaded from: classes2.dex */
public class mZx {
    private final List<WU> EYQ = new ArrayList();

    void EYQ(WU wu) {
        this.EYQ.add(wu);
    }

    public void EYQ(Path path) {
        for (int size = this.EYQ.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.lottie.IPb.IPb.EYQ(path, this.EYQ.get(size));
        }
    }
}
