package com.applovin.impl;

import android.os.Handler;

/* loaded from: classes.dex */
public interface p1 {

    /* renamed from: com.applovin.impl.p1$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$b(p1 _this, d9 d9Var) {
        }
    }

    void a(long j);

    void a(l5 l5Var);

    void a(Exception exc);

    void a(String str, long j, long j2);

    void a(boolean z);

    void b(int i, long j, long j2);

    void b(d9 d9Var);

    void b(d9 d9Var, o5 o5Var);

    void b(String str);

    void c(l5 l5Var);

    void c(Exception exc);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f770a;
        private final p1 b;

        public a(Handler handler, p1 p1Var) {
            this.f770a = p1Var != null ? (Handler) a1.a(handler) : null;
            this.b = p1Var;
        }

        public void b(final Exception exc) {
            Handler handler = this.f770a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.p1$a$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.d(exc);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(Exception exc) {
            ((p1) yp.a(this.b)).a(exc);
        }

        public void a(final Exception exc) {
            Handler handler = this.f770a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.p1$a$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.c(exc);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(Exception exc) {
            ((p1) yp.a(this.b)).c(exc);
        }

        public void b(final l5 l5Var) {
            Handler handler = this.f770a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.p1$a$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.d(l5Var);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(l5 l5Var) {
            ((p1) yp.a(this.b)).a(l5Var);
        }

        public void a(final String str, final long j, final long j2) {
            Handler handler = this.f770a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.p1$a$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(str, j, j2);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(l5 l5Var) {
            l5Var.a();
            ((p1) yp.a(this.b)).c(l5Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str, long j, long j2) {
            ((p1) yp.a(this.b)).a(str, j, j2);
        }

        public void a(final String str) {
            Handler handler = this.f770a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.p1$a$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(str);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str) {
            ((p1) yp.a(this.b)).b(str);
        }

        public void a(final l5 l5Var) {
            l5Var.a();
            Handler handler = this.f770a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.p1$a$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.c(l5Var);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(d9 d9Var, o5 o5Var) {
            ((p1) yp.a(this.b)).b(d9Var);
            ((p1) yp.a(this.b)).b(d9Var, o5Var);
        }

        public void a(final d9 d9Var, final o5 o5Var) {
            Handler handler = this.f770a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.p1$a$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(d9Var, o5Var);
                    }
                });
            }
        }

        public void b(final long j) {
            Handler handler = this.f770a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.p1$a$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(j);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(long j) {
            ((p1) yp.a(this.b)).a(j);
        }

        public void b(final boolean z) {
            Handler handler = this.f770a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.p1$a$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(z);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(boolean z) {
            ((p1) yp.a(this.b)).a(z);
        }

        public void b(final int i, final long j, final long j2) {
            Handler handler = this.f770a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.p1$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(i, j, j2);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i, long j, long j2) {
            ((p1) yp.a(this.b)).b(i, j, j2);
        }
    }
}
