package com.applovin.impl;

import com.applovin.impl.wg;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
abstract class y2 implements ll {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque f1187a = new ArrayDeque();
    private final ArrayDeque b;
    private final PriorityQueue c;
    private b d;
    private long e;
    private long f;

    @Override // com.applovin.impl.k5
    public void a() {
    }

    protected abstract void a(ol olVar);

    protected abstract kl e();

    protected abstract boolean j();

    public y2() {
        for (int i = 0; i < 10; i++) {
            this.f1187a.add(new b());
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new c(new wg.a() { // from class: com.applovin.impl.y2$$ExternalSyntheticLambda0
                @Override // com.applovin.impl.wg.a
                public final void a(wg wgVar) {
                    this.f$0.a((pl) wgVar);
                }
            }));
        }
        this.c = new PriorityQueue();
    }

    @Override // com.applovin.impl.k5
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public ol d() {
        a1.b(this.d == null);
        if (this.f1187a.isEmpty()) {
            return null;
        }
        b bVar = (b) this.f1187a.pollFirst();
        this.d = bVar;
        return bVar;
    }

    @Override // com.applovin.impl.k5
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public pl c() {
        if (this.b.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty() && ((b) yp.a((b) this.c.peek())).f <= this.e) {
            b bVar = (b) yp.a((b) this.c.poll());
            if (bVar.e()) {
                pl plVar = (pl) yp.a((pl) this.b.pollFirst());
                plVar.b(4);
                a(bVar);
                return plVar;
            }
            a((ol) bVar);
            if (j()) {
                kl klVarE = e();
                pl plVar2 = (pl) yp.a((pl) this.b.pollFirst());
                plVar2.a(bVar.f, klVarE, Long.MAX_VALUE);
                a(bVar);
                return plVar2;
            }
            a(bVar);
        }
        return null;
    }

    @Override // com.applovin.impl.k5
    public void b() {
        this.f = 0L;
        this.e = 0L;
        while (!this.c.isEmpty()) {
            a((b) yp.a((b) this.c.poll()));
        }
        b bVar = this.d;
        if (bVar != null) {
            a(bVar);
            this.d = null;
        }
    }

    private void a(b bVar) {
        bVar.b();
        this.f1187a.add(bVar);
    }

    protected final pl h() {
        return (pl) this.b.pollFirst();
    }

    protected final long i() {
        return this.e;
    }

    private static final class b extends ol implements Comparable {
        private long k;

        private b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (e() != bVar.e()) {
                return e() ? 1 : -1;
            }
            long j = this.f - bVar.f;
            if (j == 0) {
                j = this.k - bVar.k;
                if (j == 0) {
                    return 0;
                }
            }
            return j > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends pl {
        private wg.a g;

        public c(wg.a aVar) {
            this.g = aVar;
        }

        @Override // com.applovin.impl.wg
        public final void g() {
            this.g.a(this);
        }
    }

    @Override // com.applovin.impl.k5
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(ol olVar) {
        a1.a(olVar == this.d);
        b bVar = (b) olVar;
        if (bVar.d()) {
            a(bVar);
        } else {
            long j = this.f;
            this.f = 1 + j;
            bVar.k = j;
            this.c.add(bVar);
        }
        this.d = null;
    }

    protected void a(pl plVar) {
        plVar.b();
        this.b.add(plVar);
    }

    @Override // com.applovin.impl.ll
    public void a(long j) {
        this.e = j;
    }
}
