package com.mbridge.msdk.e;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: EventProcessor.java */
/* loaded from: classes4.dex */
final class g implements l {

    /* renamed from: a, reason: collision with root package name */
    private final c f2718a;
    private final r b;
    private final j c;
    private final AtomicLong d = new AtomicLong(0);
    private final long[] e = new long[2];
    private volatile i f;

    public g(c cVar, r rVar, j jVar) {
        this.f2718a = cVar;
        this.b = rVar;
        this.c = jVar;
    }

    @Override // com.mbridge.msdk.e.l
    public final void a(e eVar) {
        long jIncrementAndGet = this.d.incrementAndGet();
        this.e[0] = System.currentTimeMillis();
        this.e[1] = jIncrementAndGet;
    }

    @Override // com.mbridge.msdk.e.l
    public final void b(final e eVar) {
        this.c.b(new Runnable() { // from class: com.mbridge.msdk.e.g.1
            @Override // java.lang.Runnable
            public final void run() {
                i iVar = new i(eVar);
                iVar.a(1);
                iVar.b(0);
                iVar.a(System.currentTimeMillis() + eVar.h());
                if (g.this.f != null) {
                    a(g.this.f, 5);
                    g.this.f = null;
                }
                a(iVar, 5);
            }

            private void a(i iVar, int i) {
                while (i > 0) {
                    if (g.this.f2718a.a(iVar) > 0) {
                        g.this.b.c();
                        g.this.b.d();
                        g.this.b.a(eVar);
                        return;
                    }
                    i--;
                }
                g.this.f = iVar;
            }
        });
    }

    @Override // com.mbridge.msdk.e.l
    public final long[] a() {
        long[] jArr = this.e;
        return jArr.length == 0 ? new long[]{0, 0} : jArr;
    }
}
