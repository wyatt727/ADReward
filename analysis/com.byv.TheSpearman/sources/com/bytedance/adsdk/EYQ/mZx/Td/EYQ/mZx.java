package com.bytedance.adsdk.EYQ.mZx.Td.EYQ;

import com.bytedance.adsdk.EYQ.mZx.mZx.EYQ.zF;
import java.util.Deque;

/* compiled from: ConstantStringParser.java */
/* loaded from: classes2.dex */
public class mZx extends IPb {
    @Override // com.bytedance.adsdk.EYQ.mZx.Td.EYQ.IPb
    public int EYQ(String str, int i, Deque<com.bytedance.adsdk.EYQ.mZx.mZx.EYQ> deque, com.bytedance.adsdk.EYQ.mZx.Td.EYQ eyq) {
        if ('\'' != EYQ(i, str)) {
            return eyq.EYQ(str, i, deque);
        }
        int i2 = i + 1;
        int length = str.length();
        int i3 = i2;
        while (i3 < length && EYQ(i3, str) != '\'') {
            i3++;
        }
        if (EYQ(i3, str) != '\'') {
            throw new com.bytedance.adsdk.EYQ.EYQ.EYQ("String expression not surrounded by '", str.substring(i2 - 1));
        }
        deque.push(new zF(str.substring(i2, i3)));
        return i3 + 1;
    }
}
