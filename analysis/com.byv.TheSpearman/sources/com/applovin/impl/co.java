package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.applovin.impl.mi;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class co extends d2 implements Handler.Callback {
    private int A;
    private long B;
    private final Handler n;
    private final bo o;
    private final nl p;
    private final e9 q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;
    private d9 v;
    private ll w;
    private ol x;
    private pl y;
    private pl z;

    @Override // com.applovin.impl.li
    public boolean d() {
        return true;
    }

    @Override // com.applovin.impl.li, com.applovin.impl.mi
    public String getName() {
        return "TextRenderer";
    }

    public co(bo boVar, Looper looper) {
        this(boVar, looper, nl.f725a);
    }

    public co(bo boVar, Looper looper, nl nlVar) {
        super(3);
        this.o = (bo) a1.a(boVar);
        this.n = looper == null ? null : yp.a(looper, (Handler.Callback) this);
        this.p = nlVar;
        this.q = new e9();
        this.B = -9223372036854775807L;
    }

    @Override // com.applovin.impl.d2
    protected void v() {
        this.v = null;
        this.B = -9223372036854775807L;
        z();
        D();
    }

    @Override // com.applovin.impl.li
    public boolean c() {
        return this.s;
    }

    private void C() {
        this.x = null;
        this.A = -1;
        pl plVar = this.y;
        if (plVar != null) {
            plVar.g();
            this.y = null;
        }
        pl plVar2 = this.z;
        if (plVar2 != null) {
            plVar2.g();
            this.z = null;
        }
    }

    private void D() {
        C();
        ((ll) a1.a(this.w)).a();
        this.w = null;
        this.u = 0;
    }

    private void B() {
        this.t = true;
        this.w = this.p.b((d9) a1.a(this.v));
    }

    private void E() {
        D();
        B();
    }

    private long A() {
        if (this.A == -1) {
            return Long.MAX_VALUE;
        }
        a1.a(this.y);
        if (this.A >= this.y.a()) {
            return Long.MAX_VALUE;
        }
        return this.y.a(this.A);
    }

    private void b(List list) {
        Handler handler = this.n;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            a(list);
        }
    }

    private void z() {
        b(Collections.emptyList());
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            a((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    private void a(ml mlVar) {
        kc.a("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.v, mlVar);
        z();
        E();
    }

    public void c(long j) {
        a1.b(k());
        this.B = j;
    }

    private void a(List list) {
        this.o.a(list);
    }

    @Override // com.applovin.impl.d2
    protected void a(long j, boolean z) {
        z();
        this.r = false;
        this.s = false;
        this.B = -9223372036854775807L;
        if (this.u != 0) {
            E();
        } else {
            C();
            ((ll) a1.a(this.w)).b();
        }
    }

    @Override // com.applovin.impl.d2
    protected void a(d9[] d9VarArr, long j, long j2) {
        this.v = d9VarArr[0];
        if (this.w != null) {
            this.u = 1;
        } else {
            B();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    @Override // com.applovin.impl.li
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r9, long r11) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.co.a(long, long):void");
    }

    @Override // com.applovin.impl.mi
    public int a(d9 d9Var) {
        if (this.p.a(d9Var)) {
            return mi.CC.a(d9Var.F == 0 ? 4 : 2);
        }
        if (df.h(d9Var.m)) {
            return mi.CC.a(1);
        }
        return mi.CC.a(0);
    }
}
