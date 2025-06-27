package com.bykv.vk.openvk.component.video.EYQ.mZx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: Urls.java */
/* loaded from: classes.dex */
public class tsL {
    private static final Set<String> EYQ = new HashSet();
    private static final Set<String> mZx = new HashSet();
    private int IPb;
    private int Kbd = -1;
    private final int Pm;
    private final ArrayList<EYQ> Td;
    private final int VwS;

    tsL(List<String> list) {
        int iIntValue;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("urls can't be empty");
        }
        int size = list.size();
        this.Pm = size;
        this.Td = new ArrayList<>(size);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (String str : list) {
            EYQ eyq = new EYQ(str);
            if (EYQ.contains(str)) {
                arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                arrayList2.add(eyq);
            } else if (mZx.contains(str)) {
                arrayList = arrayList == null ? new ArrayList() : arrayList;
                arrayList.add(eyq);
            } else {
                this.Td.add(eyq);
            }
        }
        if (arrayList != null) {
            this.Td.addAll(arrayList);
        }
        if (arrayList2 != null) {
            this.Td.addAll(arrayList2);
        }
        Integer num = Kbd.HX;
        if (num == null || num.intValue() <= 0) {
            iIntValue = this.Pm >= 2 ? 1 : 2;
        } else {
            iIntValue = num.intValue();
        }
        this.VwS = iIntValue;
    }

    tsL(String str) {
        ArrayList<EYQ> arrayList = new ArrayList<>(1);
        this.Td = arrayList;
        arrayList.add(new EYQ(str));
        this.Pm = 1;
        this.VwS = 1;
    }

    boolean EYQ() {
        return this.IPb < this.VwS;
    }

    EYQ mZx() {
        if (!EYQ()) {
            throw new NoSuchElementException();
        }
        int i = this.Kbd + 1;
        if (i >= this.Pm - 1) {
            this.Kbd = -1;
            this.IPb++;
        } else {
            this.Kbd = i;
        }
        EYQ eyq = this.Td.get(i);
        eyq.mZx = (this.IPb * this.Pm) + this.Kbd;
        return eyq;
    }

    /* compiled from: Urls.java */
    public class EYQ {
        final String EYQ;
        int mZx;

        EYQ(String str) {
            this.EYQ = str;
        }

        void EYQ() {
            tsL.EYQ.add(this.EYQ);
        }

        void mZx() {
            tsL.mZx.add(this.EYQ);
        }

        public String toString() {
            return this.EYQ;
        }
    }
}
