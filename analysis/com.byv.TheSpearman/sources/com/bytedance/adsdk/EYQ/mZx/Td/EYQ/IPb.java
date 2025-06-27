package com.bytedance.adsdk.EYQ.mZx.Td.EYQ;

import java.util.Deque;

/* compiled from: NodeParser.java */
/* loaded from: classes2.dex */
public abstract class IPb {
    public abstract int EYQ(String str, int i, Deque<com.bytedance.adsdk.EYQ.mZx.mZx.EYQ> deque, com.bytedance.adsdk.EYQ.mZx.Td.EYQ eyq);

    protected char EYQ(int i, String str) {
        if (i >= str.length()) {
            return (char) 26;
        }
        return str.charAt(i);
    }

    protected int mZx(int i, String str) {
        while (com.bytedance.adsdk.EYQ.mZx.Kbd.EYQ.EYQ(EYQ(i, str))) {
            i++;
        }
        return i;
    }
}
