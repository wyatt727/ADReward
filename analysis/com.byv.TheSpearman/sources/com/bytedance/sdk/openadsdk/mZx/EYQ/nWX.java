package com.bytedance.sdk.openadsdk.mZx.EYQ;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TrackUrlStrategy.java */
/* loaded from: classes2.dex */
public class nWX {
    public static nWX EYQ = new nWX();
    private volatile boolean Pm;
    private final Map<String, EYQ> Td = new HashMap();
    private EYQ mZx;

    private int mZx() {
        EYQ eyq = this.mZx;
        if (eyq != null) {
            return eyq.EYQ();
        }
        return 3;
    }

    private int Td() {
        EYQ eyq = this.mZx;
        if (eyq != null) {
            return eyq.mZx();
        }
        return 30;
    }

    public void EYQ(EYQ eyq) {
        this.mZx = eyq;
    }

    public void EYQ(String str, EYQ eyq) {
        if (TextUtils.isEmpty(str) || eyq == null) {
            return;
        }
        this.Td.put(str, eyq);
    }

    public int EYQ(String str) {
        if (!EYQ()) {
            return 4;
        }
        EYQ eyq = this.Td.get(str);
        if (eyq == null) {
            return mZx();
        }
        return eyq.EYQ();
    }

    public int mZx(String str) {
        EYQ eyq = this.Td.get(str);
        if (eyq == null) {
            return Td();
        }
        return eyq.mZx();
    }

    public boolean EYQ() {
        return this.Pm;
    }

    public void EYQ(boolean z) {
        this.Pm = z;
    }

    /* compiled from: TrackUrlStrategy.java */
    public static class EYQ {
        private final int EYQ;
        private final int mZx;

        public EYQ(int i, int i2) {
            this.EYQ = (i < 0 || i > 5) ? 3 : i;
            this.mZx = i2 < 10 ? 30 : i2;
        }

        public int EYQ() {
            return this.EYQ;
        }

        public int mZx() {
            return this.mZx;
        }
    }
}
