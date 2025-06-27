package com.applovin.impl;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.applovin.impl.v5;
import com.applovin.impl.w6;
import com.applovin.impl.x6;
import com.applovin.impl.x7;
import com.applovin.impl.y6;
import com.applovin.impl.z6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public class w5 implements z6 {
    private final UUID c;
    private final x7.c d;
    private final ld e;
    private final HashMap f;
    private final boolean g;
    private final int[] h;
    private final boolean i;
    private final g j;
    private final hc k;
    private final h l;
    private final long m;
    private final List n;
    private final Set o;
    private final Set p;
    private int q;
    private x7 r;
    private v5 s;
    private v5 t;
    private Looper u;
    private Handler v;
    private int w;
    private byte[] x;
    volatile d y;

    public static final class b {
        private boolean d;
        private boolean f;

        /* renamed from: a, reason: collision with root package name */
        private final HashMap f1117a = new HashMap();
        private UUID b = r2.d;
        private x7.c c = k9.d;
        private hc g = new e6();
        private int[] e = new int[0];
        private long h = 300000;

        public b a(boolean z) {
            this.d = z;
            return this;
        }

        public b b(boolean z) {
            this.f = z;
            return this;
        }

        public b a(int... iArr) {
            for (int i : iArr) {
                boolean z = true;
                if (i != 2 && i != 1) {
                    z = false;
                }
                a1.a(z);
            }
            this.e = (int[]) iArr.clone();
            return this;
        }

        public b a(UUID uuid, x7.c cVar) {
            this.b = (UUID) a1.a(uuid);
            this.c = (x7.c) a1.a(cVar);
            return this;
        }

        public w5 a(ld ldVar) {
            return new w5(this.b, this.c, ldVar, this.f1117a, this.d, this.e, this.f, this.g, this.h);
        }
    }

    public static final class e extends Exception {
        private e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    private w5(UUID uuid, x7.c cVar, ld ldVar, HashMap map, boolean z, int[] iArr, boolean z2, hc hcVar, long j) {
        a1.a(uuid);
        a1.a(!r2.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.c = uuid;
        this.d = cVar;
        this.e = ldVar;
        this.f = map;
        this.g = z;
        this.h = iArr;
        this.i = z2;
        this.k = hcVar;
        this.j = new g();
        this.l = new h();
        this.w = 0;
        this.n = new ArrayList();
        this.o = nj.b();
        this.p = nj.b();
        this.m = j;
    }

    @Override // com.applovin.impl.z6
    public x6 a(Looper looper, y6.a aVar, d9 d9Var) {
        a1.b(this.q > 0);
        a(looper);
        return a(looper, aVar, d9Var, true);
    }

    private void d() {
        qp it = eb.a((Collection) this.p).iterator();
        while (it.hasNext()) {
            ((x6) it.next()).a((y6.a) null);
        }
    }

    private void b(Looper looper) {
        if (this.y == null) {
            this.y = new d(looper);
        }
    }

    private void e() {
        qp it = eb.a((Collection) this.o).iterator();
        while (it.hasNext()) {
            ((f) it.next()).a();
        }
    }

    private class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (v5 v5Var : w5.this.n) {
                if (v5Var.a(bArr)) {
                    v5Var.a(message.what);
                    return;
                }
            }
        }
    }

    private class g implements v5.a {

        /* renamed from: a, reason: collision with root package name */
        private final Set f1120a = new HashSet();
        private v5 b;

        public g() {
        }

        @Override // com.applovin.impl.v5.a
        public void a() {
            this.b = null;
            ab abVarA = ab.a((Collection) this.f1120a);
            this.f1120a.clear();
            qp it = abVarA.iterator();
            while (it.hasNext()) {
                ((v5) it.next()).i();
            }
        }

        public void b(v5 v5Var) {
            this.f1120a.remove(v5Var);
            if (this.b == v5Var) {
                this.b = null;
                if (this.f1120a.isEmpty()) {
                    return;
                }
                v5 v5Var2 = (v5) this.f1120a.iterator().next();
                this.b = v5Var2;
                v5Var2.k();
            }
        }

        @Override // com.applovin.impl.v5.a
        public void a(Exception exc, boolean z) {
            this.b = null;
            ab abVarA = ab.a((Collection) this.f1120a);
            this.f1120a.clear();
            qp it = abVarA.iterator();
            while (it.hasNext()) {
                ((v5) it.next()).b(exc, z);
            }
        }

        @Override // com.applovin.impl.v5.a
        public void a(v5 v5Var) {
            this.f1120a.add(v5Var);
            if (this.b != null) {
                return;
            }
            this.b = v5Var;
            v5Var.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.r != null && this.q == 0 && this.n.isEmpty() && this.o.isEmpty()) {
            ((x7) a1.a(this.r)).a();
            this.r = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class h implements v5.b {
        private h() {
        }

        @Override // com.applovin.impl.v5.b
        public void b(final v5 v5Var, int i) {
            if (i == 1 && w5.this.q > 0 && w5.this.m != -9223372036854775807L) {
                w5.this.p.add(v5Var);
                ((Handler) a1.a(w5.this.v)).postAtTime(new Runnable() { // from class: com.applovin.impl.w5$h$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        v5Var.a((y6.a) null);
                    }
                }, v5Var, SystemClock.uptimeMillis() + w5.this.m);
            } else if (i == 0) {
                w5.this.n.remove(v5Var);
                if (w5.this.s == v5Var) {
                    w5.this.s = null;
                }
                if (w5.this.t == v5Var) {
                    w5.this.t = null;
                }
                w5.this.j.b(v5Var);
                if (w5.this.m != -9223372036854775807L) {
                    ((Handler) a1.a(w5.this.v)).removeCallbacksAndMessages(v5Var);
                    w5.this.p.remove(v5Var);
                }
            }
            w5.this.c();
        }

        @Override // com.applovin.impl.v5.b
        public void a(v5 v5Var, int i) {
            if (w5.this.m != -9223372036854775807L) {
                w5.this.p.remove(v5Var);
                ((Handler) a1.a(w5.this.v)).removeCallbacksAndMessages(v5Var);
            }
        }
    }

    private class c implements x7.b {
        private c() {
        }

        @Override // com.applovin.impl.x7.b
        public void a(x7 x7Var, byte[] bArr, int i, int i2, byte[] bArr2) {
            ((d) a1.a(w5.this.y)).obtainMessage(i, bArr).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class f implements z6.b {
        private final y6.a b;
        private x6 c;
        private boolean d;

        public f(y6.a aVar) {
            this.b = aVar;
        }

        public void a(final d9 d9Var) {
            ((Handler) a1.a(w5.this.v)).post(new Runnable() { // from class: com.applovin.impl.w5$f$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.b(d9Var);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(d9 d9Var) {
            if (w5.this.q == 0 || this.d) {
                return;
            }
            w5 w5Var = w5.this;
            this.c = w5Var.a((Looper) a1.a(w5Var.u), this.b, d9Var, false);
            w5.this.o.add(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            if (this.d) {
                return;
            }
            x6 x6Var = this.c;
            if (x6Var != null) {
                x6Var.a(this.b);
            }
            w5.this.o.remove(this);
            this.d = true;
        }

        @Override // com.applovin.impl.z6.b
        public void a() {
            yp.a((Handler) a1.a(w5.this.v), new Runnable() { // from class: com.applovin.impl.w5$f$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.c();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public x6 a(Looper looper, y6.a aVar, d9 d9Var, boolean z) {
        List listA;
        b(looper);
        w6 w6Var = d9Var.p;
        if (w6Var == null) {
            return a(df.e(d9Var.m), z);
        }
        v5 v5VarA = null;
        Object[] objArr = 0;
        if (this.x == null) {
            listA = a((w6) a1.a(w6Var), this.c, false);
            if (listA.isEmpty()) {
                e eVar = new e(this.c);
                kc.a("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.a(eVar);
                }
                return new s7(new x6.a(eVar, 6003));
            }
        } else {
            listA = null;
        }
        if (!this.g) {
            v5VarA = this.t;
        } else {
            Iterator it = this.n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                v5 v5Var = (v5) it.next();
                if (yp.a(v5Var.f1082a, listA)) {
                    v5VarA = v5Var;
                    break;
                }
            }
        }
        if (v5VarA == null) {
            v5VarA = a(listA, false, aVar, z);
            if (!this.g) {
                this.t = v5VarA;
            }
            this.n.add(v5VarA);
        } else {
            v5VarA.b(aVar);
        }
        return v5VarA;
    }

    @Override // com.applovin.impl.z6
    public z6.b b(Looper looper, y6.a aVar, d9 d9Var) {
        a1.b(this.q > 0);
        a(looper);
        f fVar = new f(aVar);
        fVar.a(d9Var);
        return fVar;
    }

    @Override // com.applovin.impl.z6
    public final void b() {
        int i = this.q;
        this.q = i + 1;
        if (i != 0) {
            return;
        }
        if (this.r == null) {
            x7 x7VarA = this.d.a(this.c);
            this.r = x7VarA;
            x7VarA.a(new c());
        } else if (this.m != -9223372036854775807L) {
            for (int i2 = 0; i2 < this.n.size(); i2++) {
                ((v5) this.n.get(i2)).b(null);
            }
        }
    }

    private static boolean a(x6 x6Var) {
        return x6Var.b() == 1 && (yp.f1214a < 19 || (((x6.a) a1.a(x6Var.getError())).getCause() instanceof ResourceBusyException));
    }

    private boolean a(w6 w6Var) {
        if (this.x != null) {
            return true;
        }
        if (a(w6Var, this.c, true).isEmpty()) {
            if (w6Var.d != 1 || !w6Var.a(0).a(r2.b)) {
                return false;
            }
            kc.d("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.c);
        }
        String str = w6Var.c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? yp.f1214a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private v5 a(List list, boolean z, y6.a aVar) {
        a1.a(this.r);
        v5 v5Var = new v5(this.c, this.r, this.j, this.l, list, this.w, this.i | z, z, this.x, this.f, this.e, (Looper) a1.a(this.u), this.k);
        v5Var.b(aVar);
        if (this.m != -9223372036854775807L) {
            v5Var.b(null);
        }
        return v5Var;
    }

    private v5 a(List list, boolean z, y6.a aVar, boolean z2) {
        v5 v5VarA = a(list, z, aVar);
        if (a(v5VarA) && !this.p.isEmpty()) {
            d();
            a(v5VarA, aVar);
            v5VarA = a(list, z, aVar);
        }
        if (!a(v5VarA) || !z2 || this.o.isEmpty()) {
            return v5VarA;
        }
        e();
        if (!this.p.isEmpty()) {
            d();
        }
        a(v5VarA, aVar);
        return a(list, z, aVar);
    }

    @Override // com.applovin.impl.z6
    public int a(d9 d9Var) {
        int iC = ((x7) a1.a(this.r)).c();
        w6 w6Var = d9Var.p;
        if (w6Var == null) {
            if (yp.a(this.h, df.e(d9Var.m)) != -1) {
                return iC;
            }
            return 0;
        }
        if (a(w6Var)) {
            return iC;
        }
        return 1;
    }

    private synchronized void a(Looper looper) {
        Looper looper2 = this.u;
        if (looper2 == null) {
            this.u = looper;
            this.v = new Handler(looper);
        } else {
            a1.b(looper2 == looper);
            a1.a(this.v);
        }
    }

    private x6 a(int i, boolean z) {
        x7 x7Var = (x7) a1.a(this.r);
        if ((x7Var.c() == 2 && j9.d) || yp.a(this.h, i) == -1 || x7Var.c() == 1) {
            return null;
        }
        v5 v5Var = this.s;
        if (v5Var == null) {
            v5 v5VarA = a((List) ab.h(), true, (y6.a) null, z);
            this.n.add(v5VarA);
            this.s = v5VarA;
        } else {
            v5Var.b(null);
        }
        return this.s;
    }

    @Override // com.applovin.impl.z6
    public final void a() {
        int i = this.q - 1;
        this.q = i;
        if (i != 0) {
            return;
        }
        if (this.m != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.n);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((v5) arrayList.get(i2)).a((y6.a) null);
            }
        }
        e();
        c();
    }

    public void a(int i, byte[] bArr) {
        a1.b(this.n.isEmpty());
        if (i == 1 || i == 3) {
            a1.a(bArr);
        }
        this.w = i;
        this.x = bArr;
    }

    private void a(x6 x6Var, y6.a aVar) {
        x6Var.a(aVar);
        if (this.m != -9223372036854775807L) {
            x6Var.a((y6.a) null);
        }
    }

    private static List a(w6 w6Var, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(w6Var.d);
        for (int i = 0; i < w6Var.d; i++) {
            w6.b bVarA = w6Var.a(i);
            if ((bVarA.a(uuid) || (r2.c.equals(uuid) && bVarA.a(r2.b))) && (bVarA.f != null || z)) {
                arrayList.add(bVarA);
            }
        }
        return arrayList;
    }
}
