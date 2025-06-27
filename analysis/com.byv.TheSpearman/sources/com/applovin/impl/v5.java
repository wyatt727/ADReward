package com.applovin.impl;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.applovin.impl.hc;
import com.applovin.impl.x6;
import com.applovin.impl.x7;
import com.applovin.impl.y6;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
class v5 implements x6 {

    /* renamed from: a, reason: collision with root package name */
    public final List f1082a;
    private final x7 b;
    private final a c;
    private final b d;
    private final int e;
    private final boolean f;
    private final boolean g;
    private final HashMap h;
    private final s4 i;
    private final hc j;
    final ld k;
    final UUID l;
    final e m;
    private int n;
    private int o;
    private HandlerThread p;
    private c q;
    private x4 r;
    private x6.a s;
    private byte[] t;
    private byte[] u;
    private x7.a v;
    private x7.d w;

    public interface a {
        void a();

        void a(v5 v5Var);

        void a(Exception exc, boolean z);
    }

    public interface b {
        void a(v5 v5Var, int i);

        void b(v5 v5Var, int i);
    }

    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public v5(UUID uuid, x7 x7Var, a aVar, b bVar, List list, int i, boolean z, boolean z2, byte[] bArr, HashMap map, ld ldVar, Looper looper, hc hcVar) {
        if (i == 1 || i == 3) {
            a1.a(bArr);
        }
        this.l = uuid;
        this.c = aVar;
        this.d = bVar;
        this.b = x7Var;
        this.e = i;
        this.f = z;
        this.g = z2;
        if (bArr != null) {
            this.u = bArr;
            this.f1082a = null;
        } else {
            this.f1082a = Collections.unmodifiableList((List) a1.a(list));
        }
        this.h = map;
        this.k = ldVar;
        this.i = new s4();
        this.j = hcVar;
        this.n = 2;
        this.m = new e(looper);
    }

    public void k() {
        this.w = this.b.b();
        ((c) yp.a(this.q)).a(0, a1.a(this.w), true);
    }

    public void i() {
        if (j()) {
            a(true);
        }
    }

    @Override // com.applovin.impl.x6
    public boolean c() {
        return this.f;
    }

    @Override // com.applovin.impl.x6
    public final x6.a getError() {
        if (this.n == 1) {
            return this.s;
        }
        return null;
    }

    @Override // com.applovin.impl.x6
    public final UUID e() {
        return this.l;
    }

    @Override // com.applovin.impl.x6
    public final x4 f() {
        return this.r;
    }

    @Override // com.applovin.impl.x6
    public Map d() {
        byte[] bArr = this.t;
        if (bArr == null) {
            return null;
        }
        return this.b.b(bArr);
    }

    @Override // com.applovin.impl.x6
    public void b(y6.a aVar) {
        a1.b(this.o >= 0);
        if (aVar != null) {
            this.i.a(aVar);
        }
        int i = this.o + 1;
        this.o = i;
        if (i == 1) {
            a1.b(this.n == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.p = handlerThread;
            handlerThread.start();
            this.q = new c(this.p.getLooper());
            if (j()) {
                a(true);
            }
        } else if (aVar != null && g() && this.i.b(aVar) == 1) {
            aVar.a(this.n);
        }
        this.d.a(this, this.o);
    }

    private boolean j() {
        if (g()) {
            return true;
        }
        try {
            byte[] bArrD = this.b.d();
            this.t = bArrD;
            this.r = this.b.d(bArrD);
            final int i = 3;
            this.n = 3;
            a(new p4() { // from class: com.applovin.impl.v5$$ExternalSyntheticLambda0
                @Override // com.applovin.impl.p4
                public final void accept(Object obj) {
                    ((y6.a) obj).a(i);
                }
            });
            a1.a(this.t);
            return true;
        } catch (NotProvisionedException unused) {
            this.c.a(this);
            return false;
        } catch (Exception e2) {
            a(e2, 1);
            return false;
        }
    }

    private boolean l() {
        try {
            this.b.a(this.t, this.u);
            return true;
        } catch (Exception e2) {
            a(e2, 1);
            return false;
        }
    }

    private void h() {
        if (this.e == 0 && this.n == 4) {
            yp.a((Object) this.t);
            a(false);
        }
    }

    private boolean g() {
        int i = this.n;
        return i == 3 || i == 4;
    }

    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                v5.this.b(obj, obj2);
            } else {
                if (i != 1) {
                    return;
                }
                v5.this.a(obj, obj2);
            }
        }
    }

    private class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private boolean f1083a;

        public c(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Throwable thA;
            d dVar = (d) message.obj;
            try {
                int i = message.what;
                if (i == 0) {
                    v5 v5Var = v5.this;
                    thA = v5Var.k.a(v5Var.l, (x7.d) dVar.d);
                } else if (i == 1) {
                    v5 v5Var2 = v5.this;
                    thA = v5Var2.k.a(v5Var2.l, (x7.a) dVar.d);
                } else {
                    throw new RuntimeException();
                }
            } catch (md e) {
                boolean zA = a(message, e);
                thA = e;
                if (zA) {
                    return;
                }
            } catch (Exception e2) {
                kc.c("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                thA = e2;
            }
            v5.this.j.a(dVar.f1084a);
            synchronized (this) {
                if (!this.f1083a) {
                    v5.this.m.obtainMessage(message.what, Pair.create(dVar.d, thA)).sendToTarget();
                }
            }
        }

        private boolean a(Message message, md mdVar) {
            IOException fVar;
            d dVar = (d) message.obj;
            if (!dVar.b) {
                return false;
            }
            int i = dVar.e + 1;
            dVar.e = i;
            if (i > v5.this.j.a(3)) {
                return false;
            }
            ic icVar = new ic(dVar.f1084a, mdVar.f643a, mdVar.b, mdVar.c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.c, mdVar.d);
            pd pdVar = new pd(3);
            if (mdVar.getCause() instanceof IOException) {
                fVar = (IOException) mdVar.getCause();
            } else {
                fVar = new f(mdVar.getCause());
            }
            long jA = v5.this.j.a(new hc.a(icVar, pdVar, fVar, dVar.e));
            if (jA == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.f1083a) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), jA);
                return true;
            }
        }

        void a(int i, Object obj, boolean z) {
            obtainMessage(i, new d(ic.a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void a() {
            removeCallbacksAndMessages(null);
            this.f1083a = true;
        }
    }

    @Override // com.applovin.impl.x6
    public final int b() {
        return this.n;
    }

    private void a(p4 p4Var) {
        Iterator it = this.i.a().iterator();
        while (it.hasNext()) {
            p4Var.accept((y6.a) it.next());
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f1084a;
        public final boolean b;
        public final long c;
        public final Object d;
        public int e;

        public d(long j, boolean z, long j2, Object obj) {
            this.f1084a = j;
            this.b = z;
            this.c = j2;
            this.d = obj;
        }
    }

    public void b(Exception exc, boolean z) {
        a(exc, z ? 1 : 3);
    }

    private void a(boolean z) {
        if (this.g) {
            return;
        }
        byte[] bArr = (byte[]) yp.a((Object) this.t);
        int i = this.e;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.u == null || l()) {
                    a(bArr, 2, z);
                    return;
                }
                return;
            }
            if (i != 3) {
                return;
            }
            a1.a(this.u);
            a1.a(this.t);
            a(this.u, 3, z);
            return;
        }
        if (this.u == null) {
            a(bArr, 1, z);
            return;
        }
        if (this.n == 4 || l()) {
            long jA = a();
            if (this.e != 0 || jA > 60) {
                if (jA <= 0) {
                    a(new ub(), 2);
                    return;
                } else {
                    this.n = 4;
                    a(new p4() { // from class: com.applovin.impl.v5$$ExternalSyntheticLambda4
                        @Override // com.applovin.impl.p4
                        public final void accept(Object obj) {
                            ((y6.a) obj).c();
                        }
                    });
                    return;
                }
            }
            kc.a("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jA);
            a(bArr, 2, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj, Object obj2) {
        if (obj == this.w) {
            if (this.n == 2 || g()) {
                this.w = null;
                if (obj2 instanceof Exception) {
                    this.c.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.b.a((byte[]) obj2);
                    this.c.a();
                } catch (Exception e2) {
                    this.c.a(e2, true);
                }
            }
        }
    }

    public boolean a(byte[] bArr) {
        return Arrays.equals(this.t, bArr);
    }

    private void a(final Exception exc, int i) {
        this.s = new x6.a(exc, b7.a(exc, i));
        kc.a("DefaultDrmSession", "DRM session error", exc);
        a(new p4() { // from class: com.applovin.impl.v5$$ExternalSyntheticLambda1
            @Override // com.applovin.impl.p4
            public final void accept(Object obj) {
                ((y6.a) obj).a(exc);
            }
        });
        if (this.n != 4) {
            this.n = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj, Object obj2) {
        if (obj == this.v && g()) {
            this.v = null;
            if (obj2 instanceof Exception) {
                a((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.e == 3) {
                    this.b.b((byte[]) yp.a((Object) this.u), bArr);
                    a(new p4() { // from class: com.applovin.impl.v5$$ExternalSyntheticLambda3
                        @Override // com.applovin.impl.p4
                        public final void accept(Object obj3) {
                            ((y6.a) obj3).b();
                        }
                    });
                    return;
                }
                byte[] bArrB = this.b.b(this.t, bArr);
                int i = this.e;
                if ((i == 2 || (i == 0 && this.u != null)) && bArrB != null && bArrB.length != 0) {
                    this.u = bArrB;
                }
                this.n = 4;
                a(new p4() { // from class: com.applovin.impl.v5$$ExternalSyntheticLambda2
                    @Override // com.applovin.impl.p4
                    public final void accept(Object obj3) {
                        ((y6.a) obj3).a();
                    }
                });
            } catch (Exception e2) {
                a(e2, true);
            }
        }
    }

    private void a(Exception exc, boolean z) {
        if (exc instanceof NotProvisionedException) {
            this.c.a(this);
        } else {
            a(exc, z ? 1 : 2);
        }
    }

    public void a(int i) {
        if (i != 2) {
            return;
        }
        h();
    }

    private void a(byte[] bArr, int i, boolean z) {
        try {
            this.v = this.b.a(bArr, this.f1082a, i, this.h);
            ((c) yp.a(this.q)).a(1, a1.a(this.v), z);
        } catch (Exception e2) {
            a(e2, true);
        }
    }

    @Override // com.applovin.impl.x6
    public void a(y6.a aVar) {
        a1.b(this.o > 0);
        int i = this.o - 1;
        this.o = i;
        if (i == 0) {
            this.n = 0;
            ((e) yp.a(this.m)).removeCallbacksAndMessages(null);
            ((c) yp.a(this.q)).a();
            this.q = null;
            ((HandlerThread) yp.a(this.p)).quit();
            this.p = null;
            this.r = null;
            this.s = null;
            this.v = null;
            this.w = null;
            byte[] bArr = this.t;
            if (bArr != null) {
                this.b.c(bArr);
                this.t = null;
            }
        }
        if (aVar != null) {
            this.i.c(aVar);
            if (this.i.b(aVar) == 0) {
                aVar.d();
            }
        }
        this.d.b(this, this.o);
    }

    @Override // com.applovin.impl.x6
    public boolean a(String str) {
        return this.b.a((byte[]) a1.b(this.t), str);
    }

    private long a() {
        if (!r2.d.equals(this.l)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) a1.a(cs.a(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }
}
