package com.applovin.impl;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
final class pa implements g5 {

    /* renamed from: a, reason: collision with root package name */
    private final g5 f777a;
    private final int b;
    private final a c;
    private final byte[] d;
    private int e;

    public interface a {
        void a(yg ygVar);
    }

    @Override // com.applovin.impl.g5
    public void close() {
        throw new UnsupportedOperationException();
    }

    public pa(g5 g5Var, int i, a aVar) {
        a1.a(i > 0);
        this.f777a = g5Var;
        this.b = i;
        this.c = aVar;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // com.applovin.impl.g5
    public void a(yo yoVar) {
        a1.a(yoVar);
        this.f777a.a(yoVar);
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        return this.f777a.c();
    }

    @Override // com.applovin.impl.g5
    public Map e() {
        return this.f777a.e();
    }

    private boolean g() {
        if (this.f777a.a(this.d, 0, 1) == -1) {
            return false;
        }
        int i = (this.d[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int iA = this.f777a.a(bArr, i3, i2);
            if (iA == -1) {
                return false;
            }
            i3 += iA;
            i2 -= iA;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.c.a(new yg(bArr, i));
        }
        return true;
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i, int i2) {
        if (this.e == 0) {
            if (!g()) {
                return -1;
            }
            this.e = this.b;
        }
        int iA = this.f777a.a(bArr, i, Math.min(this.e, i2));
        if (iA != -1) {
            this.e -= iA;
        }
        return iA;
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) {
        throw new UnsupportedOperationException();
    }
}
