package com.json;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public class j2 {

    /* renamed from: a, reason: collision with root package name */
    private a f1823a = a.NOT_READY;
    private ArrayList b = new ArrayList();
    private String c;

    enum a {
        NOT_READY,
        READY
    }

    public j2(String str) {
        this.c = str;
    }

    public synchronized void a() {
        Object[] array = this.b.toArray();
        for (int i = 0; i < array.length; i++) {
            ((Runnable) array[i]).run();
            array[i] = null;
        }
        this.b.clear();
    }

    public synchronized void a(Runnable runnable) {
        if (this.f1823a != a.READY) {
            this.b.add(runnable);
        } else {
            runnable.run();
        }
    }

    public synchronized void b() {
        this.f1823a = a.NOT_READY;
    }

    public synchronized void c() {
        this.f1823a = a.READY;
    }
}
