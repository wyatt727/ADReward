package com.apm.insight.b;

import android.os.SystemClock;
import com.apm.insight.runtime.p;
import com.google.android.exoplayer2.C;

/* loaded from: classes.dex */
public class c {
    private static long b;

    /* renamed from: a, reason: collision with root package name */
    private final b f14a;
    private boolean c = false;
    private final Runnable d;

    c(b bVar) {
        Runnable runnable = new Runnable() { // from class: com.apm.insight.b.c.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                if (c.this.c) {
                    return;
                }
                c.this.f14a.d();
                long unused = c.b = SystemClock.uptimeMillis();
                f.a();
                p.b().a(c.this.d, 500L);
                com.apm.insight.runtime.b.a(c.b);
            }
        };
        this.d = runnable;
        this.f14a = bVar;
        p.b().a(runnable, 5000L);
    }

    public static boolean c() {
        return SystemClock.uptimeMillis() - b <= C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
    }

    public void a() {
        if (this.c) {
            return;
        }
        p.b().a(this.d, 5000L);
    }

    public void b() {
        this.c = true;
    }
}
