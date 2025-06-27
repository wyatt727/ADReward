package com.bytedance.adsdk.EYQ.mZx.Td.EYQ;

import com.bytedance.adsdk.EYQ.mZx.mZx.EYQ.XN;
import java.util.Deque;

/* compiled from: IdentifierParser.java */
/* loaded from: classes2.dex */
public class Td extends IPb {
    @Override // com.bytedance.adsdk.EYQ.mZx.Td.EYQ.IPb
    public int EYQ(String str, int i, Deque<com.bytedance.adsdk.EYQ.mZx.mZx.EYQ> deque, com.bytedance.adsdk.EYQ.mZx.Td.EYQ eyq) {
        if (!com.bytedance.adsdk.EYQ.mZx.Kbd.EYQ.mZx(EYQ(i, str))) {
            return eyq.EYQ(str, i, deque);
        }
        return EYQ(str, i, deque);
    }

    private int EYQ(String str, int i, Deque<com.bytedance.adsdk.EYQ.mZx.mZx.EYQ> deque) {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = i3 + i;
            char cEYQ = EYQ(i2, str);
            if (!com.bytedance.adsdk.EYQ.mZx.Kbd.EYQ.mZx(cEYQ) && !com.bytedance.adsdk.EYQ.mZx.Kbd.EYQ.Td(cEYQ) && '.' != cEYQ && '[' != cEYQ && ']' != cEYQ && '_' != cEYQ && '-' != cEYQ) {
                break;
            }
            i3++;
        }
        String strSubstring = str.substring(i, i2);
        if (com.bytedance.adsdk.EYQ.mZx.Pm.EYQ.EYQ(strSubstring) != null) {
            deque.push(new com.bytedance.adsdk.EYQ.mZx.mZx.EYQ.VwS(strSubstring));
        } else {
            deque.push(new XN(strSubstring));
        }
        return i2;
    }
}
