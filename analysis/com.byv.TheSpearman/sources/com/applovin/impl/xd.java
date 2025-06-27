package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.wd;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface xd {
    void a(int i, wd.a aVar, ic icVar, pd pdVar);

    void a(int i, wd.a aVar, ic icVar, pd pdVar, IOException iOException, boolean z);

    void a(int i, wd.a aVar, pd pdVar);

    void b(int i, wd.a aVar, ic icVar, pd pdVar);

    void c(int i, wd.a aVar, ic icVar, pd pdVar);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f1167a;
        public final wd.a b;
        private final CopyOnWriteArrayList c;
        private final long d;

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public void a(Handler handler, xd xdVar) {
            a1.a(handler);
            a1.a(xdVar);
            this.c.add(new C0054a(handler, xdVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(xd xdVar, ic icVar, pd pdVar) {
            xdVar.b(this.f1167a, this.b, icVar, pdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(xd xdVar, ic icVar, pd pdVar) {
            xdVar.c(this.f1167a, this.b, icVar, pdVar);
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i, wd.a aVar, long j) {
            this.c = copyOnWriteArrayList;
            this.f1167a = i;
            this.b = aVar;
            this.d = j;
        }

        /* renamed from: com.applovin.impl.xd$a$a, reason: collision with other inner class name */
        private static final class C0054a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f1168a;
            public xd b;

            public C0054a(Handler handler, xd xdVar) {
                this.f1168a = handler;
                this.b = xdVar;
            }
        }

        public void c(ic icVar, int i, int i2, d9 d9Var, int i3, Object obj, long j, long j2) {
            c(icVar, new pd(i, i2, d9Var, i3, obj, a(j), a(j2)));
        }

        public void b(ic icVar, int i, int i2, d9 d9Var, int i3, Object obj, long j, long j2) {
            b(icVar, new pd(i, i2, d9Var, i3, obj, a(j), a(j2)));
        }

        private long a(long j) {
            long jB = r2.b(j);
            if (jB == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.d + jB;
        }

        public void c(final ic icVar, final pd pdVar) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0054a c0054a = (C0054a) it.next();
                final xd xdVar = c0054a.b;
                yp.a(c0054a.f1168a, new Runnable() { // from class: com.applovin.impl.xd$a$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.c(xdVar, icVar, pdVar);
                    }
                });
            }
        }

        public void b(final ic icVar, final pd pdVar) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0054a c0054a = (C0054a) it.next();
                final xd xdVar = c0054a.b;
                yp.a(c0054a.f1168a, new Runnable() { // from class: com.applovin.impl.xd$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(xdVar, icVar, pdVar);
                    }
                });
            }
        }

        public void a(int i, d9 d9Var, int i2, Object obj, long j) {
            a(new pd(1, i, d9Var, i2, obj, a(j), -9223372036854775807L));
        }

        public void a(final pd pdVar) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0054a c0054a = (C0054a) it.next();
                final xd xdVar = c0054a.b;
                yp.a(c0054a.f1168a, new Runnable() { // from class: com.applovin.impl.xd$a$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(xdVar, pdVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(xd xdVar, pd pdVar) {
            xdVar.a(this.f1167a, this.b, pdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(xd xdVar, ic icVar, pd pdVar) {
            xdVar.a(this.f1167a, this.b, icVar, pdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(xd xdVar, ic icVar, pd pdVar, IOException iOException, boolean z) {
            xdVar.a(this.f1167a, this.b, icVar, pdVar, iOException, z);
        }

        public void a(ic icVar, int i, int i2, d9 d9Var, int i3, Object obj, long j, long j2) {
            a(icVar, new pd(i, i2, d9Var, i3, obj, a(j), a(j2)));
        }

        public void a(final ic icVar, final pd pdVar) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0054a c0054a = (C0054a) it.next();
                final xd xdVar = c0054a.b;
                yp.a(c0054a.f1168a, new Runnable() { // from class: com.applovin.impl.xd$a$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(xdVar, icVar, pdVar);
                    }
                });
            }
        }

        public void a(ic icVar, int i, int i2, d9 d9Var, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
            a(icVar, new pd(i, i2, d9Var, i3, obj, a(j), a(j2)), iOException, z);
        }

        public void a(final ic icVar, final pd pdVar, final IOException iOException, final boolean z) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0054a c0054a = (C0054a) it.next();
                final xd xdVar = c0054a.b;
                yp.a(c0054a.f1168a, new Runnable() { // from class: com.applovin.impl.xd$a$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(xdVar, icVar, pdVar, iOException, z);
                    }
                });
            }
        }

        public void a(xd xdVar) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0054a c0054a = (C0054a) it.next();
                if (c0054a.b == xdVar) {
                    this.c.remove(c0054a);
                }
            }
        }

        public a a(int i, wd.a aVar, long j) {
            return new a(this.c, i, aVar, j);
        }
    }
}
