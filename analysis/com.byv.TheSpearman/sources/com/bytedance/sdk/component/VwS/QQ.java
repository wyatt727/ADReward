package com.bytedance.sdk.component.VwS;

/* compiled from: TTRunnable.java */
/* loaded from: classes2.dex */
public abstract class QQ implements Comparable<QQ>, Runnable {
    private int EYQ;
    private String mZx;

    public QQ(String str, int i) {
        this.EYQ = 0;
        this.EYQ = i == 0 ? 5 : i;
        this.mZx = str;
    }

    public QQ(String str) {
        this.EYQ = 0;
        this.EYQ = 5;
        this.mZx = str;
    }

    public void setPriority(int i) {
        this.EYQ = i;
    }

    public int getPriority() {
        return this.EYQ;
    }

    @Override // java.lang.Comparable
    public int compareTo(QQ qq) {
        if (getPriority() < qq.getPriority()) {
            return 1;
        }
        return getPriority() >= qq.getPriority() ? -1 : 0;
    }

    public String getName() {
        return this.mZx;
    }
}
