package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.impl.mi;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class bf extends d2 implements Handler.Callback {
    private final ye n;
    private final af o;
    private final Handler p;
    private final ze q;
    private xe r;
    private boolean s;
    private boolean t;
    private long u;
    private long v;
    private we w;

    @Override // com.applovin.impl.li
    public boolean d() {
        return true;
    }

    @Override // com.applovin.impl.li, com.applovin.impl.mi
    public String getName() {
        return "MetadataRenderer";
    }

    public bf(af afVar, Looper looper) {
        this(afVar, looper, ye.f1206a);
    }

    private void a(we weVar, List list) {
        for (int i = 0; i < weVar.c(); i++) {
            d9 d9VarB = weVar.a(i).b();
            if (d9VarB != null && this.n.a(d9VarB)) {
                xe xeVarB = this.n.b(d9VarB);
                byte[] bArr = (byte[]) a1.a(weVar.a(i).a());
                this.q.b();
                this.q.g(bArr.length);
                ((ByteBuffer) yp.a(this.q.c)).put(bArr);
                this.q.g();
                we weVarA = xeVarB.a(this.q);
                if (weVarA != null) {
                    a(weVarA, list);
                }
            } else {
                list.add(weVar.a(i));
            }
        }
    }

    public bf(af afVar, Looper looper, ye yeVar) {
        super(5);
        this.o = (af) a1.a(afVar);
        this.p = looper == null ? null : yp.a(looper, (Handler.Callback) this);
        this.n = (ye) a1.a(yeVar);
        this.q = new ze();
        this.v = -9223372036854775807L;
    }

    @Override // com.applovin.impl.d2
    protected void v() {
        this.w = null;
        this.v = -9223372036854775807L;
        this.r = null;
    }

    @Override // com.applovin.impl.li
    public boolean c() {
        return this.t;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            b((we) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    private void z() {
        if (this.s || this.w != null) {
            return;
        }
        this.q.b();
        e9 e9VarR = r();
        int iA = a(e9VarR, this.q, 0);
        if (iA != -4) {
            if (iA == -5) {
                this.u = ((d9) a1.a(e9VarR.b)).q;
                return;
            }
            return;
        }
        if (this.q.e()) {
            this.s = true;
            return;
        }
        ze zeVar = this.q;
        zeVar.j = this.u;
        zeVar.g();
        we weVarA = ((xe) yp.a(this.r)).a(this.q);
        if (weVarA != null) {
            ArrayList arrayList = new ArrayList(weVarA.c());
            a(weVarA, arrayList);
            if (arrayList.isEmpty()) {
                return;
            }
            this.w = new we(arrayList);
            this.v = this.q.f;
        }
    }

    private void b(we weVar) {
        this.o.a(weVar);
    }

    private void a(we weVar) {
        Handler handler = this.p;
        if (handler != null) {
            handler.obtainMessage(0, weVar).sendToTarget();
        } else {
            b(weVar);
        }
    }

    private boolean c(long j) {
        boolean z;
        we weVar = this.w;
        if (weVar == null || this.v > j) {
            z = false;
        } else {
            a(weVar);
            this.w = null;
            this.v = -9223372036854775807L;
            z = true;
        }
        if (this.s && this.w == null) {
            this.t = true;
        }
        return z;
    }

    @Override // com.applovin.impl.d2
    protected void a(long j, boolean z) {
        this.w = null;
        this.v = -9223372036854775807L;
        this.s = false;
        this.t = false;
    }

    @Override // com.applovin.impl.d2
    protected void a(d9[] d9VarArr, long j, long j2) {
        this.r = this.n.b(d9VarArr[0]);
    }

    @Override // com.applovin.impl.li
    public void a(long j, long j2) {
        boolean zC = true;
        while (zC) {
            z();
            zC = c(j);
        }
    }

    @Override // com.applovin.impl.mi
    public int a(d9 d9Var) {
        if (this.n.a(d9Var)) {
            return mi.CC.a(d9Var.F == 0 ? 4 : 2);
        }
        return mi.CC.a(0);
    }
}
