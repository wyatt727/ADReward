package com.my.target;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Executor f3933a = Executors.newSingleThreadExecutor();
    public static final Executor b = Executors.newFixedThreadPool(6);
    public static final Executor c = Executors.newSingleThreadExecutor();
    public static final List<Runnable> d = new ArrayList();
    public static final Executor e = new a();
    public static final Handler f = new Handler(Looper.getMainLooper());
    public static final AtomicBoolean g = new AtomicBoolean();

    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            c0.f.post(runnable);
        }
    }

    public static void a(Runnable runnable) {
        AtomicBoolean atomicBoolean = g;
        if (!atomicBoolean.get()) {
            List<Runnable> list = d;
            synchronized (list) {
                if (!atomicBoolean.get()) {
                    list.add(runnable);
                    ba.b("AsyncCommand", "Can't use onAdLoadExecutor - sdk initialize not finished");
                    return;
                }
            }
        }
        b.execute(runnable);
    }

    public static void a(Runnable runnable, int i) {
        f.postDelayed(runnable, i);
    }

    public static boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static void b() {
        List<Runnable> list = d;
        synchronized (list) {
            Iterator<Runnable> it = list.iterator();
            while (it.hasNext()) {
                b.execute(it.next());
            }
            d.clear();
            g.set(true);
        }
    }

    public static void b(Runnable runnable) {
        f3933a.execute(runnable);
    }

    public static void c(Runnable runnable) {
        c.execute(runnable);
    }

    public static void d(Runnable runnable) {
        e.execute(runnable);
    }
}
