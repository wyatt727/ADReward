package com.bytedance.sdk.component.IPb.Td;

import android.content.Context;
import java.util.HashMap;

/* compiled from: TncInstanceManager.java */
/* loaded from: classes2.dex */
public class VwS {
    private static volatile VwS EYQ;
    private static HashMap<Integer, EYQ> Td;
    private static HashMap<Integer, Kbd> mZx;

    private VwS() {
        mZx = new HashMap<>();
        Td = new HashMap<>();
    }

    public static synchronized VwS EYQ() {
        if (EYQ == null) {
            synchronized (VwS.class) {
                if (EYQ == null) {
                    EYQ = new VwS();
                }
            }
        }
        return EYQ;
    }

    public Kbd EYQ(int i) {
        Kbd kbd = mZx.get(Integer.valueOf(i));
        if (kbd != null) {
            return kbd;
        }
        Kbd kbd2 = new Kbd(i);
        mZx.put(Integer.valueOf(i), kbd2);
        return kbd2;
    }

    public EYQ EYQ(int i, Context context) {
        EYQ eyq = Td.get(Integer.valueOf(i));
        if (eyq != null) {
            return eyq;
        }
        EYQ eyq2 = new EYQ(context, i);
        Td.put(Integer.valueOf(i), eyq2);
        return eyq2;
    }
}
