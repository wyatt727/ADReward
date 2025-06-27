package com.applovin.impl;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: classes.dex */
public interface xq {

    /* renamed from: com.applovin.impl.xq$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(xq _this, d9 d9Var) {
        }
    }

    void a(int i, long j);

    void a(long j, int i);

    void a(d9 d9Var);

    void a(d9 d9Var, o5 o5Var);

    void a(yq yqVar);

    void a(Object obj, long j);

    void a(String str);

    void b(l5 l5Var);

    void b(Exception exc);

    void b(String str, long j, long j2);

    void d(l5 l5Var);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f1183a;
        private final xq b;

        public a(Handler handler, xq xqVar) {
            this.f1183a = xqVar != null ? (Handler) a1.a(handler) : null;
            this.b = xqVar;
        }

        public void b(final l5 l5Var) {
            Handler handler = this.f1183a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.xq$a$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.d(l5Var);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(l5 l5Var) {
            ((xq) yp.a(this.b)).d(l5Var);
        }

        public void a(final String str, final long j, final long j2) {
            Handler handler = this.f1183a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.xq$a$$ExternalSyntheticLambda9
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
            ((xq) yp.a(this.b)).b(l5Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str, long j, long j2) {
            ((xq) yp.a(this.b)).b(str, j, j2);
        }

        public void a(final String str) {
            Handler handler = this.f1183a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.xq$a$$ExternalSyntheticLambda8
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(str);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str) {
            ((xq) yp.a(this.b)).a(str);
        }

        public void a(final l5 l5Var) {
            l5Var.a();
            Handler handler = this.f1183a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.xq$a$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.c(l5Var);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i, long j) {
            ((xq) yp.a(this.b)).a(i, j);
        }

        public void a(final int i, final long j) {
            Handler handler = this.f1183a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.xq$a$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(i, j);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(d9 d9Var, o5 o5Var) {
            ((xq) yp.a(this.b)).a(d9Var);
            ((xq) yp.a(this.b)).a(d9Var, o5Var);
        }

        public void a(final d9 d9Var, final o5 o5Var) {
            Handler handler = this.f1183a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.xq$a$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.b(d9Var, o5Var);
                    }
                });
            }
        }

        public void b(final long j, final int i) {
            Handler handler = this.f1183a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.xq$a$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(j, i);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Object obj, long j) {
            ((xq) yp.a(this.b)).a(obj, j);
        }

        public void b(final Exception exc) {
            Handler handler = this.f1183a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.xq$a$$ExternalSyntheticLambda6
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(exc);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(long j, int i) {
            ((xq) yp.a(this.b)).a(j, i);
        }

        public void b(final yq yqVar) {
            Handler handler = this.f1183a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.applovin.impl.xq$a$$ExternalSyntheticLambda5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(yqVar);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(Exception exc) {
            ((xq) yp.a(this.b)).b(exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(yq yqVar) {
            ((xq) yp.a(this.b)).a(yqVar);
        }

        public void a(final Object obj) {
            if (this.f1183a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f1183a.post(new Runnable() { // from class: com.applovin.impl.xq$a$$ExternalSyntheticLambda7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.a(obj, jElapsedRealtime);
                    }
                });
            }
        }
    }
}
