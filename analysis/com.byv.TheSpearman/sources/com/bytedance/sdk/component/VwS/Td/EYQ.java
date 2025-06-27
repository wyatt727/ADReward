package com.bytedance.sdk.component.VwS.Td;

/* compiled from: PagRunnable.java */
/* loaded from: classes2.dex */
public abstract class EYQ implements Comparable<EYQ>, Runnable {
    private int EYQ = 5;
    private long IPb;
    private long Kbd;
    private long Pm;
    private Runnable Td;
    private String mZx;

    public EYQ(String str) {
        this.mZx = str;
    }

    public EYQ(String str, Runnable runnable) {
        this.mZx = str;
        this.Td = runnable;
    }

    public void EYQ(int i) {
        this.EYQ = i;
    }

    public int EYQ() {
        return this.EYQ;
    }

    @Override // java.lang.Comparable
    /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
    public int compareTo(EYQ eyq) {
        if (EYQ() < eyq.EYQ()) {
            return 1;
        }
        return EYQ() >= eyq.EYQ() ? -1 : 0;
    }

    public String mZx() {
        return this.mZx;
    }

    public void EYQ(long j) {
        this.Pm = j;
    }

    public void mZx(long j) {
        this.Kbd = j;
    }

    public void Td(long j) {
        this.IPb = j;
    }

    public long Td() {
        return this.Kbd - this.Pm;
    }

    public long Pm() {
        return this.IPb - this.Kbd;
    }

    public Runnable Kbd() {
        return this.Td;
    }
}
