package com.bytedance.sdk.component.mZx.EYQ;

import java.util.ArrayList;
import java.util.List;

/* compiled from: FormBody.java */
/* loaded from: classes2.dex */
public final class Kbd extends nWX {
    List<String> EYQ;
    List<String> mZx;

    Kbd(List<String> list, List<String> list2) {
        this.EYQ = list;
        this.mZx = list2;
    }

    /* compiled from: FormBody.java */
    public static final class EYQ {
        private final List<String> EYQ = new ArrayList();
        private final List<String> mZx = new ArrayList();

        public EYQ EYQ(String str, String str2) {
            this.EYQ.add(str);
            this.mZx.add(str2);
            return this;
        }

        public Kbd EYQ() {
            return new Kbd(this.EYQ, this.mZx);
        }
    }
}
