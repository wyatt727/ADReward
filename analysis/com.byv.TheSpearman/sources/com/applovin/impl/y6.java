package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.wd;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface y6 {

    /* renamed from: com.applovin.impl.y6$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$e(y6 _this, int i, wd.a aVar) {
        }
    }

    void a(int i, wd.a aVar);

    void a(int i, wd.a aVar, int i2);

    void a(int i, wd.a aVar, Exception exc);

    void b(int i, wd.a aVar);

    void c(int i, wd.a aVar);

    void d(int i, wd.a aVar);

    void e(int i, wd.a aVar);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f1194a;
        public final wd.a b;
        private final CopyOnWriteArrayList c;

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void a(Handler handler, y6 y6Var) {
            a1.a(handler);
            a1.a(y6Var);
            this.c.add(new C0055a(handler, y6Var));
        }

        public void e(y6 y6Var) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0055a c0055a = (C0055a) it.next();
                if (c0055a.b == y6Var) {
                    this.c.remove(c0055a);
                }
            }
        }

        public void c() {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0055a c0055a = (C0055a) it.next();
                final y6 y6Var = c0055a.b;
                yp.a(c0055a.f1195a, new Runnable() { // from class: com.applovin.impl.y6$a$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.c(y6Var);
                    }
                });
            }
        }

        public void b() {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0055a c0055a = (C0055a) it.next();
                final y6 y6Var = c0055a.b;
                yp.a(c0055a.f1195a, new Runnable() { // from class: com.applovin.impl.y6$a$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(y6Var);
                    }
                });
            }
        }

        public void d() {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0055a c0055a = (C0055a) it.next();
                final y6 y6Var = c0055a.b;
                yp.a(c0055a.f1195a, new Runnable() { // from class: com.applovin.impl.y6$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.d(y6Var);
                    }
                });
            }
        }

        private a(CopyOnWriteArrayList copyOnWriteArrayList, int i, wd.a aVar) {
            this.c = copyOnWriteArrayList;
            this.f1194a = i;
            this.b = aVar;
        }

        /* renamed from: com.applovin.impl.y6$a$a, reason: collision with other inner class name */
        private static final class C0055a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f1195a;
            public y6 b;

            public C0055a(Handler handler, y6 y6Var) {
                this.f1195a = handler;
                this.b = y6Var;
            }
        }

        public void a() {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0055a c0055a = (C0055a) it.next();
                final y6 y6Var = c0055a.b;
                yp.a(c0055a.f1195a, new Runnable() { // from class: com.applovin.impl.y6$a$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(y6Var);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(y6 y6Var) {
            y6Var.c(this.f1194a, this.b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(y6 y6Var) {
            y6Var.a(this.f1194a, this.b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(y6 y6Var) {
            y6Var.b(this.f1194a, this.b);
        }

        public void a(final int i) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0055a c0055a = (C0055a) it.next();
                final y6 y6Var = c0055a.b;
                yp.a(c0055a.f1195a, new Runnable() { // from class: com.applovin.impl.y6$a$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(y6Var, i);
                    }
                });
            }
        }

        public void a(final Exception exc) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                C0055a c0055a = (C0055a) it.next();
                final y6 y6Var = c0055a.b;
                yp.a(c0055a.f1195a, new Runnable() { // from class: com.applovin.impl.y6$a$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(y6Var, exc);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(y6 y6Var) {
            y6Var.d(this.f1194a, this.b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(y6 y6Var, int i) {
            y6Var.e(this.f1194a, this.b);
            y6Var.a(this.f1194a, this.b, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(y6 y6Var, Exception exc) {
            y6Var.a(this.f1194a, this.b, exc);
        }

        public a a(int i, wd.a aVar) {
            return new a(this.c, i, aVar);
        }
    }
}
