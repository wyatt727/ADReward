package com.mbridge.msdk.newreward.function.d.b;

import com.mbridge.msdk.e.a.a.i;
import com.mbridge.msdk.e.a.a.l;
import com.mbridge.msdk.e.a.p;
import com.mbridge.msdk.e.a.q;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: MBridgeRequestManager.java */
/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f3348a;
    private q b;

    private f() {
    }

    public static f a() {
        if (f3348a == null) {
            synchronized (f.class) {
                if (f3348a == null) {
                    f3348a = new f();
                }
            }
        }
        return f3348a;
    }

    public final void a(p<JSONObject> pVar) {
        b().a(pVar);
    }

    public final q b() {
        if (this.b == null) {
            q qVarA = l.a(new com.mbridge.msdk.e.a.a.b(new com.mbridge.msdk.e.a.a.g()), new com.mbridge.msdk.e.a.h(new ThreadPoolExecutor(5, 5, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.newreward.function.d.b.f.1
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable);
                    thread.setName("campaign_response_thread");
                    return thread;
                }
            }, new ThreadPoolExecutor.DiscardPolicy())), 5, new i());
            this.b = qVarA;
            qVarA.a();
        }
        return this.b;
    }
}
