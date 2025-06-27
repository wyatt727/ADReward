package com.bytedance.sdk.component.IPb.Pm;

/* compiled from: Logger.java */
/* loaded from: classes2.dex */
public class Td {
    private EYQ EYQ;
    private mZx mZx;

    /* compiled from: Logger.java */
    public enum EYQ {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    /* compiled from: Logger.java */
    public interface mZx {
    }

    private Td() {
        this.EYQ = EYQ.OFF;
        this.mZx = new com.bytedance.sdk.component.IPb.Pm.mZx();
    }

    /* compiled from: Logger.java */
    /* renamed from: com.bytedance.sdk.component.IPb.Pm.Td$Td, reason: collision with other inner class name */
    private static class C0081Td {
        private static final Td EYQ = new Td();
    }

    public static void EYQ(EYQ eyq) {
        synchronized (Td.class) {
            C0081Td.EYQ.EYQ = eyq;
        }
    }
}
