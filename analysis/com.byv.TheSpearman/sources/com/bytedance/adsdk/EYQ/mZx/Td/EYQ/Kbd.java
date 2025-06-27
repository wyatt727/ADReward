package com.bytedance.adsdk.EYQ.mZx.Td.EYQ;

import java.util.Deque;

/* compiled from: MethodParser.java */
/* loaded from: classes2.dex */
public class Kbd extends IPb {
    @Override // com.bytedance.adsdk.EYQ.mZx.Td.EYQ.IPb
    public int EYQ(String str, int i, Deque<com.bytedance.adsdk.EYQ.mZx.mZx.EYQ> deque, com.bytedance.adsdk.EYQ.mZx.Td.EYQ eyq) {
        char cEYQ;
        int i2 = i;
        while (true) {
            cEYQ = EYQ(i2, str);
            if (!com.bytedance.adsdk.EYQ.mZx.Kbd.EYQ.mZx(cEYQ) && !com.bytedance.adsdk.EYQ.mZx.Kbd.EYQ.Td(cEYQ)) {
                break;
            }
            i2++;
        }
        if (cEYQ != '(') {
            return eyq.EYQ(str, i, deque);
        }
        deque.push(new com.bytedance.adsdk.EYQ.mZx.mZx.EYQ.tp(str.substring(i, i2)));
        return i2 + 1;
    }
}
