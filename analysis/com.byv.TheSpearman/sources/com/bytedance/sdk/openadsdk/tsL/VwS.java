package com.bytedance.sdk.openadsdk.tsL;

/* compiled from: PlayableLog.java */
/* loaded from: classes2.dex */
public class VwS {
    private static EYQ EYQ;

    /* compiled from: PlayableLog.java */
    public interface EYQ {
        void EYQ(String str, String str2, Throwable th);
    }

    public static void EYQ(EYQ eyq) {
        EYQ = eyq;
    }

    public static boolean EYQ() {
        return EYQ != null;
    }

    public static void EYQ(String str, String str2, Throwable th) {
        if (EYQ == null) {
            return;
        }
        if (th == null) {
            th = new Throwable();
        }
        EYQ.EYQ(str, str2, th);
    }
}
