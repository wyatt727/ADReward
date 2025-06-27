package com.apm.insight.runtime;

import android.os.SystemClock;
import android.util.Printer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private static Printer f141a;
    private static l b;
    private static final Printer f = new Printer() { // from class: com.apm.insight.runtime.l.1
        @Override // android.util.Printer
        public void println(String str) {
            if (str == null) {
                return;
            }
            if (str.charAt(0) == '>') {
                l.a().a(str);
            } else if (str.charAt(0) == '<') {
                l.a().b(str);
            }
            if (l.f141a == null || l.f141a == l.f) {
                return;
            }
            l.f141a.println(str);
        }
    };
    private long c = -1;
    private final List<Printer> d = new ArrayList();
    private final List<Printer> e = new ArrayList();
    private boolean g = false;

    private l() {
    }

    public static l a() {
        if (b == null) {
            synchronized (l.class) {
                if (b == null) {
                    b = new l();
                }
            }
        }
        return b;
    }

    private static void a(List<? extends Printer> list, String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Printer printer = list.get(i);
                if (printer == null) {
                    return;
                }
                printer.println(str);
            }
        } catch (Throwable th) {
            com.apm.insight.l.q.a(th);
        }
    }

    void a(String str) {
        com.apm.insight.b.f.a(false);
        this.c = -1L;
        try {
            a(this.d, str);
        } catch (Exception e) {
            com.apm.insight.l.q.a((Throwable) e);
        }
    }

    void b(String str) {
        this.c = SystemClock.uptimeMillis();
        try {
            a(this.e, str);
        } catch (Exception e) {
            com.apm.insight.l.q.b((Throwable) e);
        }
    }

    public boolean b() {
        return this.c != -1 && SystemClock.uptimeMillis() - this.c > 5000;
    }
}
