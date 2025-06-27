package com.bytedance.sdk.openadsdk.tp.Td;

/* compiled from: LogUploaderImplEmpty.java */
/* loaded from: classes2.dex */
class Td implements EYQ {
    private static volatile Td EYQ;

    @Override // com.bytedance.sdk.openadsdk.tp.Td.EYQ
    public void EYQ(com.bytedance.sdk.openadsdk.tp.mZx mzx) {
    }

    @Override // com.bytedance.sdk.openadsdk.tp.Td.EYQ
    public void EYQ(com.bytedance.sdk.openadsdk.tp.mZx mzx, boolean z) {
    }

    public static Td EYQ() {
        if (EYQ == null) {
            synchronized (Td.class) {
                if (EYQ == null) {
                    EYQ = new Td();
                }
            }
        }
        return EYQ;
    }

    private Td() {
    }
}
