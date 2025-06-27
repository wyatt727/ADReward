package com.mbridge.msdk.e;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ReportManager.java */
/* loaded from: classes4.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private final c f2735a;
    private final int b;
    private final int c;
    private final int d;
    private final k e;
    private Handler i;
    private final AtomicInteger f = new AtomicInteger(0);
    private final AtomicInteger g = new AtomicInteger(0);
    private final Object h = new Object();
    private boolean j = true;
    private long k = 0;
    private volatile boolean l = false;
    private volatile boolean m = false;

    public r(k kVar) {
        this.f2735a = kVar.g();
        this.b = kVar.l();
        this.c = kVar.m();
        this.d = kVar.n();
        this.e = kVar;
    }

    public final void a() {
        HandlerThread handlerThread = new HandlerThread("report_timer");
        handlerThread.start();
        b bVar = new b(handlerThread.getLooper(), this);
        this.i = bVar;
        bVar.sendMessageDelayed(Message.obtain(bVar, 5), 5000L);
        Handler handler = this.i;
        handler.sendMessageDelayed(Message.obtain(handler, 1), this.c);
        this.j = false;
    }

    public final void b() {
        this.i.removeMessages(1);
        Handler handler = this.i;
        handler.sendMessage(Message.obtain(handler, 7));
    }

    public final void a(e eVar) {
        Handler handler = this.i;
        handler.sendMessage(Message.obtain(handler, 6, eVar));
    }

    public final void c() {
        synchronized (this.h) {
            if (!this.l) {
                this.l = true;
                this.f2735a.c();
            }
            if (!this.m) {
                this.m = true;
                this.g.addAndGet(this.f2735a.a());
            }
        }
    }

    public final void d() {
        this.g.incrementAndGet();
    }

    protected final boolean e() {
        return this.g.addAndGet(0) >= this.b;
    }

    final boolean f() {
        return this.j;
    }

    /* compiled from: ReportManager.java */
    private static final class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final r f2737a;

        public b(Looper looper, r rVar) {
            super(looper);
            this.f2737a = rVar;
        }

        @Override // android.os.Handler
        public final void dispatchMessage(Message message) {
            super.dispatchMessage(message);
            int i = message.what;
            if (i == 2 || i == 3) {
                b();
                if (com.mbridge.msdk.e.a.f2688a) {
                    a("触发上报（report result）当前 Event 数量：");
                }
                a();
                return;
            }
            if (i == 5) {
                if (com.mbridge.msdk.e.a.f2688a) {
                    a("触发删除 当前 Event 数量：");
                }
                r.a(this.f2737a);
                sendMessageDelayed(Message.obtain(this, 5), 120000L);
                return;
            }
            if (i != 6) {
                if (i == 7) {
                    this.f2737a.c();
                    b();
                    if (com.mbridge.msdk.e.a.f2688a) {
                        a("触发上报（flush）当前 Event 数量：");
                    }
                    a();
                    return;
                }
                b();
                if (com.mbridge.msdk.e.a.f2688a) {
                    a("触发上报（timer）当前 Event 数量：");
                }
                a();
                return;
            }
            e eVar = message.obj instanceof e ? (e) message.obj : null;
            boolean z = false;
            if (com.mbridge.msdk.e.a.f2688a && !y.a(eVar)) {
                a(String.format("收到 Event( %s )，当前 Event 数量：", eVar.a()));
            }
            if (y.b(eVar) && eVar.c() == 1) {
                z = true;
            }
            if (z || this.f2737a.e()) {
                b();
                if (com.mbridge.msdk.e.a.f2688a) {
                    a("触发上报（notice check）当前 Event 数量：");
                }
                a();
            }
        }

        private void a(String str) {
            Log.d("TrackManager", this.f2737a.e.c() + " " + str + this.f2737a.g.addAndGet(0) + " 数据库记录数：" + this.f2737a.f2735a.a());
        }

        private synchronized void a() {
            try {
                r.e(this.f2737a);
            } catch (Exception e) {
                if (com.mbridge.msdk.e.a.f2688a) {
                    Log.e("TrackManager", this.f2737a.e.c() + " report failed ", e);
                }
            }
        }

        private void b() {
            try {
                removeMessages(1);
                removeMessages(6);
                removeMessages(2);
                removeMessages(3);
            } catch (Exception e) {
                if (com.mbridge.msdk.e.a.f2688a) {
                    Log.e("TrackManager", this.f2737a.e.c() + " removeMessages failed ", e);
                }
            }
            if (this.f2737a.f()) {
                return;
            }
            try {
                sendMessageDelayed(Message.obtain(this, 1), y.a(this.f2737a.f.get(), this.f2737a.k, this.f2737a.c));
            } catch (Exception e2) {
                if (com.mbridge.msdk.e.a.f2688a) {
                    Log.e("TrackManager", this.f2737a.e.c() + " sendMessageDelayed failed ", e2);
                }
            }
        }
    }

    /* compiled from: ReportManager.java */
    private static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f2736a;
        private final r b;

        public a(Handler handler, r rVar) {
            this.f2736a = handler;
            this.b = rVar;
        }

        @Override // com.mbridge.msdk.e.q
        public final void a(s sVar) {
            r.a(this.b, sVar.a());
            r.i(this.b);
            this.b.k = 0L;
            if (this.b.e()) {
                Handler handler = this.f2736a;
                handler.sendMessage(Message.obtain(handler, 2));
            }
            if (com.mbridge.msdk.e.a.f2688a) {
                Log.d("TrackManager", this.b.e.c() + " report success " + sVar.a().size() + " 剩余事件数：" + this.b.g.addAndGet(0) + " 个，数据库记录数：" + this.b.f2735a.a() + " 个");
            }
        }

        @Override // com.mbridge.msdk.e.q
        public final void a(s sVar, int i, String str) {
            r.b(this.b, sVar.a());
            this.b.k = System.currentTimeMillis();
            int iJ = r.j(this.b);
            if (iJ <= 10) {
                Handler handler = this.f2736a;
                handler.sendMessageDelayed(Message.obtain(handler, 3), iJ * 1000);
            }
            if (com.mbridge.msdk.e.a.f2688a) {
                Log.d("TrackManager", this.b.e.c() + " report failed " + sVar.a().size() + " 剩余事件数：" + this.b.g.addAndGet(0) + " 个，数据库记录数：" + this.b.f2735a.a() + " 个 连续失败次数： " + iJ);
            }
        }
    }

    static /* synthetic */ void a(r rVar) {
        if (com.mbridge.msdk.e.a.f2688a && com.mbridge.msdk.f.e.b) {
            return;
        }
        int iB = rVar.f2735a.b();
        if (com.mbridge.msdk.e.a.f2688a) {
            Log.d("TrackManager", rVar.e.c() + " 删除无效数据的数量 = " + iB + " 当前剩余事件数 = " + rVar.g.addAndGet(0) + " 数据库中剩余事件数 = " + rVar.f2735a.a());
        }
    }

    static /* synthetic */ void e(r rVar) {
        List<i> listA = rVar.f2735a.a(rVar.b);
        if (y.a((List<?>) listA)) {
            if (com.mbridge.msdk.e.a.f2688a) {
                Log.d("TrackManager", rVar.e.c() + " report: 没有可以上报的数据");
                return;
            }
            return;
        }
        rVar.f2735a.a(listA);
        int size = listA.size();
        rVar.g.addAndGet(-size);
        boolean zP = false;
        if (com.mbridge.msdk.e.a.f2688a) {
            Log.d("TrackManager", rVar.e.c() + " report: 上报的数量 = " + size + " 当前剩余事件数 = " + rVar.g.addAndGet(0) + " 数据库中剩余事件数 = " + rVar.f2735a.a());
        }
        try {
            zP = rVar.e.p();
        } catch (IllegalStateException e) {
            if (com.mbridge.msdk.e.a.f2688a) {
                Log.e("TrackManager", rVar.e.c() + " report environment check failed ", e);
            }
        }
        if (!zP) {
            if (com.mbridge.msdk.e.a.f2688a) {
                Log.e("TrackManager", rVar.e.c() + " report 失败，请检查 TrackConfig 配置是否正确");
                return;
            }
            return;
        }
        n nVarQ = rVar.e.q();
        nVarQ.a(new a(rVar.i, rVar));
        Map<String, String> map = new HashMap<>();
        try {
            map = rVar.e.j().a(rVar.e.k(), listA, rVar.e.f());
        } catch (Exception e2) {
            if (com.mbridge.msdk.e.a.f2688a) {
                Log.e("TrackManager", rVar.e.c() + " report decorate request params failed ", e2);
            }
        }
        nVarQ.a(new s(listA), map, y.b(listA));
    }

    static /* synthetic */ void a(r rVar, List list) {
        if (y.a((List<?>) list)) {
            return;
        }
        rVar.f2735a.b((List<i>) list);
    }

    static /* synthetic */ void i(r rVar) {
        rVar.f.set(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void b(r rVar, List list) {
        if (y.a((List<?>) list)) {
            return;
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (!y.a(iVar)) {
                Object[] objArr = !iVar.b() && iVar.d() >= rVar.d;
                boolean z = !iVar.a() && iVar.g() < System.currentTimeMillis();
                if (objArr != false || z) {
                    iVar.b(-1);
                } else {
                    iVar.a(iVar.d() + (y.a(rVar.e.e()) ? 1 : 0));
                    iVar.b(3);
                    i++;
                }
            }
        }
        rVar.f2735a.c((List<i>) list);
        rVar.g.addAndGet(i);
    }

    static /* synthetic */ int j(r rVar) {
        return rVar.f.getAndIncrement();
    }
}
