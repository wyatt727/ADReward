package com.bytedance.sdk.component.VwS;

/* compiled from: TTBaseExecutor.java */
/* loaded from: classes2.dex */
public class Kbd {
    private static tp EYQ = new tp() { // from class: com.bytedance.sdk.component.VwS.Kbd.1
        @Override // com.bytedance.sdk.component.VwS.tp
        public HX createThreadFactory(int i, String str) {
            return new HX(i, str);
        }
    };

    public static void EYQ(tp tpVar) {
        EYQ = tpVar;
    }

    public static tp EYQ() {
        return EYQ;
    }
}
