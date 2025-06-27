package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.x1;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public interface x1 {
    yo a();

    void a(Handler handler, a aVar);

    void a(a aVar);

    public interface a {
        void a(int i, long j, long j2);

        /* renamed from: com.applovin.impl.x1$a$a, reason: collision with other inner class name */
        public static final class C0051a {

            /* renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList f1150a = new CopyOnWriteArrayList();

            public void a(Handler handler, a aVar) {
                a1.a(handler);
                a1.a(aVar);
                a(aVar);
                this.f1150a.add(new C0052a(handler, aVar));
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: com.applovin.impl.x1$a$a$a, reason: collision with other inner class name */
            static final class C0052a {

                /* renamed from: a, reason: collision with root package name */
                private final Handler f1151a;
                private final a b;
                private boolean c;

                public C0052a(Handler handler, a aVar) {
                    this.f1151a = handler;
                    this.b = aVar;
                }

                public void a() {
                    this.c = true;
                }
            }

            public void a(final int i, final long j, final long j2) {
                Iterator it = this.f1150a.iterator();
                while (it.hasNext()) {
                    final C0052a c0052a = (C0052a) it.next();
                    if (!c0052a.c) {
                        c0052a.f1151a.post(new Runnable() { // from class: com.applovin.impl.x1$a$a$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                x1.a.C0051a.a(c0052a, i, j, j2);
                            }
                        });
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void a(C0052a c0052a, int i, long j, long j2) {
                c0052a.b.a(i, j, j2);
            }

            public void a(a aVar) {
                Iterator it = this.f1150a.iterator();
                while (it.hasNext()) {
                    C0052a c0052a = (C0052a) it.next();
                    if (c0052a.b == aVar) {
                        c0052a.a();
                        this.f1150a.remove(c0052a);
                    }
                }
            }
        }
    }
}
