package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.impl.z8;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class cc {

    /* renamed from: a, reason: collision with root package name */
    private final j3 f326a;
    private final ha b;
    private final b c;
    private final CopyOnWriteArraySet d;
    private final ArrayDeque e;
    private final ArrayDeque f;
    private boolean g;

    public interface a {
        void a(Object obj);
    }

    public interface b {
        void a(Object obj, z8 z8Var);
    }

    public cc(Looper looper, j3 j3Var, b bVar) {
        this(new CopyOnWriteArraySet(), looper, j3Var, bVar);
    }

    public void a(Object obj) {
        if (this.g) {
            return;
        }
        a1.a(obj);
        this.d.add(new c(obj));
    }

    private cc(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, j3 j3Var, b bVar) {
        this.f326a = j3Var;
        this.d = copyOnWriteArraySet;
        this.c = bVar;
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = j3Var.a(looper, new Handler.Callback() { // from class: com.applovin.impl.cc$$ExternalSyntheticLambda0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f$0.a(message);
            }
        });
    }

    public void b() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(this.c);
        }
        this.d.clear();
        this.g = true;
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Object f327a;
        private z8.b b = new z8.b();
        private boolean c;
        private boolean d;

        public c(Object obj) {
            this.f327a = obj;
        }

        public void b(b bVar) {
            this.d = true;
            if (this.c) {
                bVar.a(this.f327a, this.b.a());
            }
        }

        public void a(int i, a aVar) {
            if (this.d) {
                return;
            }
            if (i != -1) {
                this.b.a(i);
            }
            this.c = true;
            aVar.a(this.f327a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f327a.equals(((c) obj).f327a);
        }

        public int hashCode() {
            return this.f327a.hashCode();
        }

        public void a(b bVar) {
            if (this.d || !this.c) {
                return;
            }
            z8 z8VarA = this.b.a();
            this.b = new z8.b();
            this.c = false;
            bVar.a(this.f327a, z8VarA);
        }
    }

    public void a() {
        if (this.f.isEmpty()) {
            return;
        }
        if (!this.b.a(0)) {
            ha haVar = this.b;
            haVar.a(haVar.d(0));
        }
        boolean z = !this.e.isEmpty();
        this.e.addAll(this.f);
        this.f.clear();
        if (z) {
            return;
        }
        while (!this.e.isEmpty()) {
            ((Runnable) this.e.peekFirst()).run();
            this.e.removeFirst();
        }
    }

    public void b(Object obj) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f327a.equals(obj)) {
                cVar.b(this.c);
                this.d.remove(cVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Message message) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(this.c);
            if (this.b.a(0)) {
                return true;
            }
        }
        return true;
    }

    public void b(int i, a aVar) {
        a(i, aVar);
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i, aVar);
        }
    }

    public void a(final int i, final a aVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.d);
        this.f.add(new Runnable() { // from class: com.applovin.impl.cc$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                cc.a(copyOnWriteArraySet, i, aVar);
            }
        });
    }

    public cc a(Looper looper, b bVar) {
        return new cc(this.d, looper, this.f326a, bVar);
    }
}
