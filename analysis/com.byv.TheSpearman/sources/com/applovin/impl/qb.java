package com.applovin.impl;

import com.applovin.impl.qb;
import java.lang.ref.WeakReference;
import java.util.Stack;

/* loaded from: classes.dex */
public interface qb {

    public interface a {
        Object a();
    }

    public interface b {
        void a(Object obj);
    }

    Object a(a aVar);

    void a(Object obj, b bVar);

    public static class d implements qb {

        /* renamed from: a, reason: collision with root package name */
        private final c f828a = new c();

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ WeakReference b(a aVar) {
            return new WeakReference(aVar.a());
        }

        @Override // com.applovin.impl.qb
        public Object a(final a aVar) {
            Object obj;
            do {
                obj = ((WeakReference) this.f828a.a(new a() { // from class: com.applovin.impl.qb$d$$ExternalSyntheticLambda0
                    @Override // com.applovin.impl.qb.a
                    public final Object a() {
                        return qb.d.b(aVar);
                    }
                })).get();
            } while (obj == null);
            return obj;
        }

        @Override // com.applovin.impl.qb
        public void a(final Object obj, final b bVar) {
            o6.a(obj);
            this.f828a.a(new WeakReference(obj), new b() { // from class: com.applovin.impl.qb$d$$ExternalSyntheticLambda1
                @Override // com.applovin.impl.qb.b
                public final void a(Object obj2) {
                    bVar.a(obj);
                }
            });
        }
    }

    public static class c implements qb {

        /* renamed from: a, reason: collision with root package name */
        private final int f827a;
        private final Stack b;

        public c() {
            this(3);
        }

        @Override // com.applovin.impl.qb
        public synchronized Object a(a aVar) {
            return this.b.isEmpty() ? aVar.a() : this.b.pop();
        }

        public c(int i) {
            this.b = new Stack();
            this.f827a = i;
        }

        @Override // com.applovin.impl.qb
        public synchronized void a(Object obj, b bVar) {
            if (this.b.size() < this.f827a) {
                this.b.push(obj);
            } else {
                try {
                    bVar.a(obj);
                } catch (RuntimeException e) {
                    o6.a((Throwable) e);
                }
            }
        }
    }
}
