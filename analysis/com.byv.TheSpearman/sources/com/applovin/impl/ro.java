package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes.dex */
public interface ro {
    int a(e5 e5Var, int i, boolean z);

    int a(e5 e5Var, int i, boolean z, int i2);

    void a(long j, int i, int i2, int i3, a aVar);

    void a(d9 d9Var);

    void a(yg ygVar, int i);

    void a(yg ygVar, int i, int i2);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f867a;
        public final byte[] b;
        public final int c;
        public final int d;

        public a(int i, byte[] bArr, int i2, int i3) {
            this.f867a = i;
            this.b = bArr;
            this.c = i2;
            this.d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f867a == aVar.f867a && this.c == aVar.c && this.d == aVar.d && Arrays.equals(this.b, aVar.b);
        }

        public int hashCode() {
            return (((((this.f867a * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
        }
    }

    /* renamed from: com.applovin.impl.ro$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }
}
