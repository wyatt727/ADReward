package com.mbridge.msdk.e;

import android.util.Log;
import com.mbridge.msdk.e.a.p;
import com.mbridge.msdk.e.a.r;
import com.mbridge.msdk.e.a.z;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Network.java */
/* loaded from: classes4.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    private q f2729a;
    private final int b;
    private final o c;
    private final v d;
    private final int e;
    private com.mbridge.msdk.e.a.q f;
    private final Executor g;

    public n(int i, o oVar, v vVar, int i2) {
        this.b = i;
        this.c = oVar;
        this.d = vVar;
        this.e = i2;
        this.g = new ThreadPoolExecutor(1, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.e.n.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "MBridgeReportResponseThread");
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
    }

    public final void a(q qVar) {
        this.f2729a = qVar;
    }

    public final void a(s sVar, Map<String, String> map, boolean z) {
        u uVar;
        if (y.a(map)) {
            q qVar = this.f2729a;
            if (qVar != null) {
                try {
                    qVar.a(sVar, 0, "params is null");
                    return;
                } catch (Exception e) {
                    if (com.mbridge.msdk.e.a.f2688a) {
                        Log.e("TrackManager", "send error", e);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        try {
            if (!y.b(this.f)) {
                com.mbridge.msdk.e.a.q qVarA = com.mbridge.msdk.e.a.a.l.a(new com.mbridge.msdk.e.a.a.b(this.c.c()), new com.mbridge.msdk.e.a.h(this.g), this.b, null);
                this.f = qVarA;
                qVarA.a();
            }
            if (this.e == 1) {
                uVar = new u(this.c.b(), 1, this.c.a());
            } else {
                uVar = new u(this.c.b(), 1);
            }
            uVar.a(map);
            uVar.a(false);
            uVar.b(true);
            uVar.c(true);
            uVar.a(this.d);
            uVar.a(z ? p.b.HIGH : p.b.NORMAL);
            uVar.a((r.b) new b(this.f2729a, sVar));
            uVar.a((r.a) new a(this.f2729a, sVar));
            this.f.a(uVar);
        } catch (Exception e2) {
            if (com.mbridge.msdk.e.a.f2688a) {
                Log.e("TrackManager", "send error", e2);
            }
            if (y.b(this.f2729a)) {
                this.f2729a.a(sVar, 0, e2.getMessage());
            }
        }
    }

    /* compiled from: Network.java */
    private static final class b implements r.b {

        /* renamed from: a, reason: collision with root package name */
        private final q f2732a;
        private final s b;

        public b(q qVar, s sVar) {
            this.f2732a = qVar;
            this.b = sVar;
        }

        @Override // com.mbridge.msdk.e.a.r.b
        public final void a(Object obj) {
            if (y.b(this.f2732a)) {
                try {
                    this.f2732a.a(this.b);
                } catch (Exception e) {
                    if (com.mbridge.msdk.e.a.f2688a) {
                        Log.e("TrackManager", "onResponse error", e);
                    }
                }
            }
        }
    }

    /* compiled from: Network.java */
    private static final class a implements r.a {

        /* renamed from: a, reason: collision with root package name */
        private final q f2731a;
        private final s b;

        public a(q qVar, s sVar) {
            this.f2731a = qVar;
            this.b = sVar;
        }

        @Override // com.mbridge.msdk.e.a.r.a
        public final void a(z zVar) {
            if (y.b(this.f2731a)) {
                try {
                    this.f2731a.a(this.b, 0, zVar.getMessage());
                } catch (Exception e) {
                    if (com.mbridge.msdk.e.a.f2688a) {
                        Log.e("TrackManager", "onErrorResponse error", e);
                    }
                }
            }
        }
    }
}
