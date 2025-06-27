package com.mbridge.msdk.foundation.same.net;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: RequestQueue.java */
/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2898a = "j";
    private final Context b;
    private final c d;
    private ExecutorService f;
    private com.mbridge.msdk.foundation.same.net.stack.b g;
    private final Set<i> c = new HashSet();
    private final AtomicInteger e = new AtomicInteger();

    public j(Context context) {
        a();
        this.b = context.getApplicationContext();
        this.d = new d(new Handler(Looper.getMainLooper()));
    }

    private void a() {
        af afVarA = af.a();
        if (afVarA.a("c_v_r_q_t", true)) {
            try {
                this.f = new ThreadPoolExecutor(afVarA.a("v_r_q_c_s", 10), afVarA.a("v_r_q_m_s", 25), afVarA.a("v_r_q_c_t", 15), TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
                return;
            } catch (Exception unused) {
                this.f = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadPoolExecutor.DiscardPolicy());
                return;
            }
        }
        this.f = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadPoolExecutor.DiscardPolicy());
    }

    public j(Context context, com.mbridge.msdk.foundation.same.net.stack.b bVar) {
        this.g = bVar;
        a();
        this.b = context.getApplicationContext();
        this.d = new d(new Handler(Looper.getMainLooper()));
    }

    public final void a(final i iVar) {
        iVar.a(this);
        synchronized (this) {
            this.c.add(iVar);
        }
        iVar.b(this.e.incrementAndGet());
        ad.c(f2898a, "add-to-queue request=" + iVar.s());
        this.f.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.j.1
            @Override // java.lang.Runnable
            public final void run() {
                if (j.this.g == null) {
                    new h(j.this.d).a(iVar);
                } else {
                    new h(j.this.d, j.this.g).a(iVar);
                }
            }
        });
    }

    final void b(i iVar) {
        synchronized (this) {
            this.c.remove(iVar);
        }
    }
}
