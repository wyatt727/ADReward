package com.applovin.impl;

import com.applovin.impl.wg;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* loaded from: classes.dex */
public final class g8 implements ll {

    /* renamed from: a, reason: collision with root package name */
    private final a5 f450a = new a5();
    private final ol b = new ol();
    private final Deque c = new ArrayDeque();
    private int d;
    private boolean e;

    @Override // com.applovin.impl.ll
    public void a(long j) {
    }

    public g8() {
        for (int i = 0; i < 2; i++) {
            this.c.addFirst(new ck(new wg.a() { // from class: com.applovin.impl.g8$$ExternalSyntheticLambda0
                @Override // com.applovin.impl.wg.a
                public final void a(wg wgVar) {
                    this.f$0.a((pl) wgVar);
                }
            }));
        }
        this.d = 0;
    }

    @Override // com.applovin.impl.k5
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public ol d() {
        a1.b(!this.e);
        if (this.d != 0) {
            return null;
        }
        this.d = 1;
        return this.b;
    }

    @Override // com.applovin.impl.k5
    public void a(ol olVar) {
        a1.b(!this.e);
        a1.b(this.d == 1);
        a1.a(this.b == olVar);
        this.d = 2;
    }

    @Override // com.applovin.impl.k5
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public pl c() {
        a1.b(!this.e);
        if (this.d != 2 || this.c.isEmpty()) {
            return null;
        }
        pl plVar = (pl) this.c.removeFirst();
        if (this.b.e()) {
            plVar.b(4);
        } else {
            ol olVar = this.b;
            plVar.a(this.b.f, new a(olVar.f, this.f450a.a(((ByteBuffer) a1.a(olVar.c)).array())), 0L);
        }
        this.b.b();
        this.d = 0;
        return plVar;
    }

    @Override // com.applovin.impl.k5
    public void b() {
        a1.b(!this.e);
        this.b.b();
        this.d = 0;
    }

    private static final class a implements kl {

        /* renamed from: a, reason: collision with root package name */
        private final long f451a;
        private final ab b;

        @Override // com.applovin.impl.kl
        public int a() {
            return 1;
        }

        public a(long j, ab abVar) {
            this.f451a = j;
            this.b = abVar;
        }

        @Override // com.applovin.impl.kl
        public long a(int i) {
            a1.a(i == 0);
            return this.f451a;
        }

        @Override // com.applovin.impl.kl
        public List b(long j) {
            return j >= this.f451a ? this.b : ab.h();
        }

        @Override // com.applovin.impl.kl
        public int a(long j) {
            return this.f451a > j ? 0 : -1;
        }
    }

    @Override // com.applovin.impl.k5
    public void a() {
        this.e = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(pl plVar) {
        a1.b(this.c.size() < 2);
        a1.a(!this.c.contains(plVar));
        plVar.b();
        this.c.addFirst(plVar);
    }
}
