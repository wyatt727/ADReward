package com.bytedance.adsdk.EYQ.mZx.Kbd;

import com.bytedance.adsdk.EYQ.mZx.Pm.Pm;
import com.bytedance.adsdk.EYQ.mZx.Pm.Td;
import com.bytedance.adsdk.EYQ.mZx.mZx.EYQ.HX;
import com.bytedance.adsdk.EYQ.mZx.mZx.EYQ.IPb;
import com.bytedance.adsdk.EYQ.mZx.mZx.EYQ.Kbd;
import com.bytedance.adsdk.EYQ.mZx.mZx.EYQ.MxO;
import com.bytedance.adsdk.EYQ.mZx.mZx.EYQ.QQ;
import com.bytedance.adsdk.EYQ.mZx.mZx.EYQ.UB;
import com.bytedance.adsdk.EYQ.mZx.mZx.EYQ.Uc;
import com.bytedance.adsdk.EYQ.mZx.mZx.EYQ.hYh;
import com.bytedance.adsdk.EYQ.mZx.mZx.EYQ.nWX;
import com.bytedance.adsdk.EYQ.mZx.mZx.EYQ.pi;
import com.bytedance.adsdk.EYQ.mZx.mZx.EYQ.tsL;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: OperatorResultUtil.java */
/* loaded from: classes2.dex */
public class mZx {
    public static com.bytedance.adsdk.EYQ.mZx.mZx.EYQ EYQ(List<com.bytedance.adsdk.EYQ.mZx.mZx.EYQ> list, String str, int i) {
        Td(list, str, i);
        Deque<com.bytedance.adsdk.EYQ.mZx.mZx.EYQ> dequeEYQ = EYQ(mZx(list, str, i));
        if (dequeEYQ.size() != 1) {
            throw new IllegalStateException();
        }
        return dequeEYQ.getFirst();
    }

    private static Deque<com.bytedance.adsdk.EYQ.mZx.mZx.EYQ> EYQ(Deque<com.bytedance.adsdk.EYQ.mZx.mZx.EYQ> deque) {
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.adsdk.EYQ.mZx.mZx.EYQ eyq : deque) {
            if (!linkedList.isEmpty() && ((com.bytedance.adsdk.EYQ.mZx.mZx.EYQ) linkedList.peekLast()).EYQ() == Td.COLON) {
                linkedList.pollLast();
                com.bytedance.adsdk.EYQ.mZx.mZx.EYQ eyq2 = (com.bytedance.adsdk.EYQ.mZx.mZx.EYQ) linkedList.pollLast();
                if (((com.bytedance.adsdk.EYQ.mZx.mZx.EYQ) linkedList.pollLast()).EYQ() != Td.QUESTION) {
                    throw new IllegalStateException();
                }
                com.bytedance.adsdk.EYQ.mZx.mZx.EYQ eyq3 = (com.bytedance.adsdk.EYQ.mZx.mZx.EYQ) linkedList.pollLast();
                hYh hyh = new hYh();
                hyh.EYQ(eyq3);
                hyh.mZx(eyq2);
                hyh.Td(eyq);
                linkedList.addLast(hyh);
            } else {
                linkedList.addLast(eyq);
            }
        }
        return linkedList;
    }

    private static Deque<com.bytedance.adsdk.EYQ.mZx.mZx.EYQ> mZx(List<com.bytedance.adsdk.EYQ.mZx.mZx.EYQ> list, String str, int i) {
        LinkedList<com.bytedance.adsdk.EYQ.mZx.mZx.EYQ> linkedList = new LinkedList(list);
        int i2 = 5;
        while (i2 > 0) {
            LinkedList linkedList2 = new LinkedList();
            for (com.bytedance.adsdk.EYQ.mZx.mZx.EYQ eyq : linkedList) {
                if (!linkedList2.isEmpty() && Td.EYQ(((com.bytedance.adsdk.EYQ.mZx.mZx.EYQ) linkedList2.peekLast()).EYQ()) && ((Td) ((com.bytedance.adsdk.EYQ.mZx.mZx.EYQ) linkedList2.peekLast()).EYQ()).mZx() == i2) {
                    com.bytedance.adsdk.EYQ.mZx.mZx.EYQ eyq2 = (com.bytedance.adsdk.EYQ.mZx.mZx.EYQ) linkedList2.pollLast();
                    com.bytedance.adsdk.EYQ.mZx.mZx.EYQ eyq3 = (com.bytedance.adsdk.EYQ.mZx.mZx.EYQ) linkedList2.pollLast();
                    if (!Td.EYQ(eyq3.EYQ()) && !Td.EYQ(eyq.EYQ())) {
                        linkedList2.addLast(EYQ(eyq3, eyq2, eyq));
                    } else {
                        throw new IllegalArgumentException(str.substring(0, i));
                    }
                } else {
                    linkedList2.addLast(eyq);
                }
            }
            i2--;
            linkedList = linkedList2;
        }
        return linkedList;
    }

    private static void Td(List<com.bytedance.adsdk.EYQ.mZx.mZx.EYQ> list, String str, int i) {
        Iterator<com.bytedance.adsdk.EYQ.mZx.mZx.EYQ> it = list.iterator();
        while (it.hasNext()) {
            if (Pm.EYQ(it.next().EYQ())) {
                throw new IllegalArgumentException(str.substring(0, i));
            }
        }
    }

    /* compiled from: OperatorResultUtil.java */
    /* renamed from: com.bytedance.adsdk.EYQ.mZx.Kbd.mZx$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] EYQ;

        static {
            int[] iArr = new int[Td.values().length];
            EYQ = iArr;
            try {
                iArr[Td.MINUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EYQ[Td.PLUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EYQ[Td.DIVISION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EYQ[Td.MULTI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                EYQ[Td.MOD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                EYQ[Td.EQ.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                EYQ[Td.NOT_EQ.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                EYQ[Td.GT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                EYQ[Td.LT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                EYQ[Td.GT_EQ.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                EYQ[Td.LT_EQ.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                EYQ[Td.DOUBLE_AMP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                EYQ[Td.DOUBLE_BAR.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private static com.bytedance.adsdk.EYQ.mZx.mZx.EYQ EYQ(com.bytedance.adsdk.EYQ.mZx.mZx.EYQ eyq, com.bytedance.adsdk.EYQ.mZx.mZx.EYQ eyq2, com.bytedance.adsdk.EYQ.mZx.mZx.EYQ eyq3) {
        UB mxO;
        switch (AnonymousClass1.EYQ[((Td) eyq2.EYQ()).ordinal()]) {
            case 1:
                mxO = new MxO();
                break;
            case 2:
                mxO = new Uc();
                break;
            case 3:
                mxO = new com.bytedance.adsdk.EYQ.mZx.mZx.EYQ.EYQ();
                break;
            case 4:
                mxO = new pi();
                break;
            case 5:
                mxO = new tsL();
                break;
            case 6:
                mxO = new com.bytedance.adsdk.EYQ.mZx.mZx.EYQ.Pm();
                break;
            case 7:
                mxO = new nWX();
                break;
            case 8:
                mxO = new IPb();
                break;
            case 9:
                mxO = new HX();
                break;
            case 10:
                mxO = new Kbd();
                break;
            case 11:
                mxO = new QQ();
                break;
            case 12:
                mxO = new com.bytedance.adsdk.EYQ.mZx.mZx.EYQ.mZx();
                break;
            case 13:
                mxO = new com.bytedance.adsdk.EYQ.mZx.mZx.EYQ.Td();
                break;
            default:
                throw new UnsupportedOperationException(eyq2.EYQ().toString());
        }
        mxO.EYQ(eyq);
        mxO.mZx(eyq3);
        return mxO;
    }

    public static boolean EYQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
            return !(obj instanceof Number) || ((Number) obj).floatValue() >= 0.0f;
        }
        return false;
    }
}
