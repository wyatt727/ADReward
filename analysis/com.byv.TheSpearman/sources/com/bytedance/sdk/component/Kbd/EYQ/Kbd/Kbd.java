package com.bytedance.sdk.component.Kbd.EYQ.Kbd;

import java.util.UUID;

/* compiled from: TTRunnable.java */
/* loaded from: classes2.dex */
public abstract class Kbd implements Comparable<Kbd>, Runnable {
    private int EYQ;
    private String Td;
    private String mZx = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());

    public Kbd(String str) {
        this.EYQ = 0;
        this.EYQ = 5;
        this.Td = str;
    }

    public void EYQ(int i) {
        this.EYQ = i;
    }

    public int EYQ() {
        return this.EYQ;
    }

    @Override // java.lang.Comparable
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public int compareTo(Kbd kbd) {
        if (EYQ() < kbd.EYQ()) {
            return 1;
        }
        return EYQ() >= kbd.EYQ() ? -1 : 0;
    }
}
