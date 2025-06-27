package com.bytedance.adsdk.EYQ.mZx.Td.EYQ;

import com.bytedance.adsdk.EYQ.mZx.mZx.EYQ.KO;
import java.util.Deque;

/* compiled from: NumberParser.java */
/* loaded from: classes2.dex */
public class VwS extends IPb {
    private boolean EYQ(String str, int i, Deque<com.bytedance.adsdk.EYQ.mZx.mZx.EYQ> deque) {
        if ('-' == EYQ(i, str)) {
            if (deque.peek() != null && !com.bytedance.adsdk.EYQ.mZx.Pm.Td.EYQ(deque.peek().EYQ())) {
                return false;
            }
            if (com.bytedance.adsdk.EYQ.mZx.Kbd.EYQ.Td(EYQ(i + 1, str))) {
                return true;
            }
            throw new IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + str.substring(0, i));
        }
        return com.bytedance.adsdk.EYQ.mZx.Kbd.EYQ.Td(EYQ(i, str));
    }

    @Override // com.bytedance.adsdk.EYQ.mZx.Td.EYQ.IPb
    public int EYQ(String str, int i, Deque<com.bytedance.adsdk.EYQ.mZx.mZx.EYQ> deque, com.bytedance.adsdk.EYQ.mZx.Td.EYQ eyq) {
        char cEYQ;
        if (!EYQ(str, i, deque)) {
            return eyq.EYQ(str, i, deque);
        }
        int i2 = EYQ(i, str) == '-' ? i + 1 : i;
        boolean z = false;
        while (true) {
            cEYQ = EYQ(i2, str);
            if (!com.bytedance.adsdk.EYQ.mZx.Kbd.EYQ.Td(cEYQ) && (z || cEYQ != '.')) {
                break;
            }
            i2++;
            if (cEYQ == '.') {
                z = true;
            }
        }
        if (cEYQ == '.') {
            throw new IllegalArgumentException("Illegal negative number format, problem interval:" + str.substring(i, i2));
        }
        deque.push(new KO(str.substring(i, i2)));
        return i2;
    }
}
