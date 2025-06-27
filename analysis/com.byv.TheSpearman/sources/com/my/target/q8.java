package com.my.target;

import android.os.Handler;
import android.os.Looper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public final class q8 implements Closeable {
    public static final q8 d = new q8(1000);
    public static final Handler e = new Handler(Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f4107a = new Runnable() { // from class: com.my.target.q8$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.b();
        }
    };
    public final WeakHashMap<Runnable, Boolean> b = new WeakHashMap<>();
    public final int c;

    public q8(int i) {
        this.c = i;
    }

    public static q8 a(int i) {
        return new q8(i);
    }

    public final void a() {
        e.postDelayed(this.f4107a, this.c);
    }

    public void a(Runnable runnable) {
        synchronized (this) {
            int size = this.b.size();
            if (this.b.put(runnable, Boolean.TRUE) == null && size == 0) {
                a();
            }
        }
    }

    public void b() {
        synchronized (this) {
            Iterator it = new ArrayList(this.b.keySet()).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (this.b.keySet().size() > 0) {
                a();
            }
        }
    }

    public void b(Runnable runnable) {
        synchronized (this) {
            this.b.remove(runnable);
            if (this.b.size() == 0) {
                e.removeCallbacks(this.f4107a);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.clear();
        e.removeCallbacks(this.f4107a);
    }
}
