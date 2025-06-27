package com.bytedance.adsdk.EYQ.mZx.Td.EYQ;

import com.bytedance.adsdk.EYQ.mZx.mZx.EYQ.WU;
import java.util.Deque;

/* compiled from: LeftParenParser.java */
/* loaded from: classes2.dex */
public class Pm extends IPb {
    @Override // com.bytedance.adsdk.EYQ.mZx.Td.EYQ.IPb
    public int EYQ(String str, int i, Deque<com.bytedance.adsdk.EYQ.mZx.mZx.EYQ> deque, com.bytedance.adsdk.EYQ.mZx.Td.EYQ eyq) {
        if ('(' != EYQ(i, str)) {
            return eyq.EYQ(str, i, deque);
        }
        deque.push(new WU(com.bytedance.adsdk.EYQ.mZx.Pm.Pm.LEFT_PAREN));
        return i + 1;
    }
}
