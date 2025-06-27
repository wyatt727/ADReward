package com.bytedance.adsdk.EYQ.mZx.Td.EYQ;

import com.bytedance.adsdk.EYQ.mZx.mZx.EYQ.hu;
import java.util.Deque;

/* compiled from: OperatorParser.java */
/* loaded from: classes2.dex */
public class QQ extends IPb {
    @Override // com.bytedance.adsdk.EYQ.mZx.Td.EYQ.IPb
    public int EYQ(String str, int i, Deque<com.bytedance.adsdk.EYQ.mZx.mZx.EYQ> deque, com.bytedance.adsdk.EYQ.mZx.Td.EYQ eyq) {
        if (!com.bytedance.adsdk.EYQ.mZx.Kbd.EYQ.Pm(EYQ(i, str))) {
            return eyq.EYQ(str, i, deque);
        }
        int i2 = i + 1;
        String str2 = new String(new char[]{EYQ(i, str), EYQ(i2, str)});
        if (com.bytedance.adsdk.EYQ.mZx.Pm.Td.EYQ(str2) != null) {
            deque.push(new hu(com.bytedance.adsdk.EYQ.mZx.Pm.Td.EYQ(str2)));
            return i + 2;
        }
        String strValueOf = String.valueOf(EYQ(i, str));
        if (com.bytedance.adsdk.EYQ.mZx.Pm.Td.EYQ(strValueOf) != null) {
            deque.push(new hu(com.bytedance.adsdk.EYQ.mZx.Pm.Td.EYQ(strValueOf)));
            return i2;
        }
        throw new IllegalArgumentException("Unrecognized:" + strValueOf + "examine:" + str.substring(0, i));
    }
}
