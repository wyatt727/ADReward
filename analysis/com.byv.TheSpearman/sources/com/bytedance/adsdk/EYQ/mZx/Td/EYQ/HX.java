package com.bytedance.adsdk.EYQ.mZx.Td.EYQ;

import java.util.Deque;
import java.util.LinkedList;

/* compiled from: RightParenParser.java */
/* loaded from: classes2.dex */
public class HX extends IPb {
    @Override // com.bytedance.adsdk.EYQ.mZx.Td.EYQ.IPb
    public int EYQ(String str, int i, Deque<com.bytedance.adsdk.EYQ.mZx.mZx.EYQ> deque, com.bytedance.adsdk.EYQ.mZx.Td.EYQ eyq) {
        com.bytedance.adsdk.EYQ.mZx.mZx.EYQ eyqPollFirst;
        if (')' != EYQ(i, str)) {
            return eyq.EYQ(str, i, deque);
        }
        LinkedList<com.bytedance.adsdk.EYQ.mZx.mZx.EYQ> linkedList = new LinkedList();
        while (true) {
            eyqPollFirst = deque.pollFirst();
            if (eyqPollFirst == null || eyqPollFirst.EYQ() == com.bytedance.adsdk.EYQ.mZx.Pm.mZx.METHOD || eyqPollFirst.EYQ() == com.bytedance.adsdk.EYQ.mZx.Pm.Pm.LEFT_PAREN) {
                break;
            }
            linkedList.addFirst(eyqPollFirst);
        }
        if (eyqPollFirst == null) {
            throw new IllegalArgumentException(str.substring(0, i));
        }
        if (eyqPollFirst.EYQ() != com.bytedance.adsdk.EYQ.mZx.Pm.mZx.METHOD) {
            deque.push(com.bytedance.adsdk.EYQ.mZx.Kbd.mZx.EYQ(linkedList, str, i));
            return i + 1;
        }
        com.bytedance.adsdk.EYQ.mZx.mZx.EYQ.tp tpVar = (com.bytedance.adsdk.EYQ.mZx.mZx.EYQ.tp) eyqPollFirst;
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        for (com.bytedance.adsdk.EYQ.mZx.mZx.EYQ eyq2 : linkedList) {
            if (eyq2.EYQ() == com.bytedance.adsdk.EYQ.mZx.Pm.Pm.COMMA) {
                linkedList2.add(com.bytedance.adsdk.EYQ.mZx.Kbd.mZx.EYQ(linkedList3, str, i));
                linkedList3.clear();
            } else {
                linkedList3.addLast(eyq2);
            }
        }
        if (!linkedList3.isEmpty()) {
            linkedList2.add(com.bytedance.adsdk.EYQ.mZx.Kbd.mZx.EYQ(linkedList3, str, i));
        }
        tpVar.EYQ((com.bytedance.adsdk.EYQ.mZx.mZx.EYQ[]) linkedList2.toArray(new com.bytedance.adsdk.EYQ.mZx.mZx.EYQ[linkedList2.size()]));
        int i2 = i + 1;
        deque.push(tpVar);
        return i2;
    }
}
