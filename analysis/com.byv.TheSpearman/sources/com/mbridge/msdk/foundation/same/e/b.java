package com.mbridge.msdk.foundation.same.e;

import android.content.Context;
import com.mbridge.msdk.foundation.same.e.a;
import com.mbridge.msdk.foundation.tools.af;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: CommonTaskLoader.java */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    ThreadPoolExecutor f2853a;
    HashMap<Long, a> b;
    WeakReference<Context> c;

    public b(Context context, int i) {
        if (af.a().a("c_t_l_t_p", true)) {
            this.f2853a = c.a();
        } else {
            if (i == 0) {
                this.f2853a = new ThreadPoolExecutor(1, 5, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f2853a = new ThreadPoolExecutor(i, (i * 2) + 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f2853a.allowCoreThreadTimeOut(true);
        }
        this.b = new HashMap<>();
        this.c = new WeakReference<>(context);
    }

    public b(Context context) {
        if (af.a().a("c_t_l_t_p", true)) {
            this.f2853a = c.a();
        } else {
            if (af.a().a("c_t_p_t_l", true)) {
                int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
                this.f2853a = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f2853a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f2853a.allowCoreThreadTimeOut(true);
        }
        this.b = new HashMap<>();
        this.c = new WeakReference<>(context);
    }

    public final void a(a aVar) {
        b(aVar, null);
        this.f2853a.execute(aVar);
    }

    private synchronized void b(final a aVar, final a.InterfaceC0268a interfaceC0268a) {
        this.b.put(Long.valueOf(aVar.getId()), aVar);
        aVar.setOnStateChangeListener(new a.InterfaceC0268a() { // from class: com.mbridge.msdk.foundation.same.e.b.1
            @Override // com.mbridge.msdk.foundation.same.e.a.InterfaceC0268a
            public final void a(a.b bVar) {
                if (bVar == a.b.CANCEL || bVar == a.b.FINISH) {
                    b.this.b.remove(Long.valueOf(aVar.getId()));
                } else if (bVar == a.b.RUNNING && b.this.c.get() == null) {
                    b.this.a();
                }
                a.InterfaceC0268a interfaceC0268a2 = interfaceC0268a;
                if (interfaceC0268a2 != null) {
                    interfaceC0268a2.a(bVar);
                }
            }
        });
    }

    public final synchronized void a() {
        try {
            Iterator<Map.Entry<Long, a>> it = this.b.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().cancel();
            }
            this.b.clear();
        } catch (Exception unused) {
        }
    }

    public final void a(a aVar, a.InterfaceC0268a interfaceC0268a) {
        b(aVar, interfaceC0268a);
        this.f2853a.execute(aVar);
    }
}
