package com.unity3d.player;

/* loaded from: classes4.dex */
public class L implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private M f4341a;
    private boolean b = false;

    public L(M m, M m2) {
        this.f4341a = m2;
    }

    @Override // java.lang.Runnable
    public void run() throws InterruptedException {
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        if (this.b) {
            return;
        }
        int i = M.y;
        this.f4341a.cancelOnPrepare();
    }
}
