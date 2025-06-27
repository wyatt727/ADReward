package com.applovin.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class cl implements g5 {

    /* renamed from: a, reason: collision with root package name */
    private final g5 f333a;
    private long b;
    private Uri c = Uri.EMPTY;
    private Map d = Collections.emptyMap();

    public cl(g5 g5Var) {
        this.f333a = (g5) a1.a(g5Var);
    }

    public long g() {
        return this.b;
    }

    public Uri h() {
        return this.c;
    }

    public Map i() {
        return this.d;
    }

    @Override // com.applovin.impl.g5
    public void a(yo yoVar) {
        a1.a(yoVar);
        this.f333a.a(yoVar);
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        return this.f333a.c();
    }

    @Override // com.applovin.impl.g5
    public Map e() {
        return this.f333a.e();
    }

    @Override // com.applovin.impl.g5
    public void close() {
        this.f333a.close();
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) {
        this.c = j5Var.f560a;
        this.d = Collections.emptyMap();
        long jA = this.f333a.a(j5Var);
        this.c = (Uri) a1.a(c());
        this.d = e();
        return jA;
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i, int i2) {
        int iA = this.f333a.a(bArr, i, i2);
        if (iA != -1) {
            this.b += iA;
        }
        return iA;
    }
}
