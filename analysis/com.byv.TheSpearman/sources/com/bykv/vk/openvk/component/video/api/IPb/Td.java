package com.bykv.vk.openvk.component.video.api.IPb;

/* compiled from: VLogger.java */
/* loaded from: classes.dex */
public class Td {
    private static boolean EYQ = false;
    private static String Td = "";
    private static int mZx = 4;

    public static void EYQ(String str) {
        Td = str;
    }

    public static void EYQ(int i) {
        mZx = i;
    }

    public static void EYQ() {
        EYQ = true;
        EYQ(3);
    }

    public static void mZx() {
        EYQ = false;
        EYQ(7);
    }

    public static boolean Td() {
        return EYQ;
    }
}
