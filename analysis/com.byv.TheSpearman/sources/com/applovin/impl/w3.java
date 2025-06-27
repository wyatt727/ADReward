package com.applovin.impl;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class w3 {

    /* renamed from: a, reason: collision with root package name */
    private static final w3 f1113a = new a();
    private static final w3 b = new b(-1);
    private static final w3 c = new b(1);

    private w3() {
    }

    public static w3 e() {
        return f1113a;
    }

    public abstract w3 a(int i, int i2);

    public abstract w3 a(long j, long j2);

    public abstract w3 a(Object obj, Object obj2, Comparator comparator);

    public abstract w3 a(boolean z, boolean z2);

    public abstract w3 b(boolean z, boolean z2);

    public abstract int d();

    /* synthetic */ w3(a aVar) {
        this();
    }

    class a extends w3 {
        @Override // com.applovin.impl.w3
        public int d() {
            return 0;
        }

        a() {
            super(null);
        }

        @Override // com.applovin.impl.w3
        public w3 b(boolean z, boolean z2) {
            return a(i2.a(z2, z));
        }

        w3 a(int i) {
            if (i < 0) {
                return w3.b;
            }
            return i > 0 ? w3.c : w3.f1113a;
        }

        @Override // com.applovin.impl.w3
        public w3 a(int i, int i2) {
            return a(pb.a(i, i2));
        }

        @Override // com.applovin.impl.w3
        public w3 a(long j, long j2) {
            return a(nc.a(j, j2));
        }

        @Override // com.applovin.impl.w3
        public w3 a(Object obj, Object obj2, Comparator comparator) {
            return a(comparator.compare(obj, obj2));
        }

        @Override // com.applovin.impl.w3
        public w3 a(boolean z, boolean z2) {
            return a(i2.a(z, z2));
        }
    }

    private static final class b extends w3 {
        final int d;

        @Override // com.applovin.impl.w3
        public w3 a(int i, int i2) {
            return this;
        }

        @Override // com.applovin.impl.w3
        public w3 a(long j, long j2) {
            return this;
        }

        @Override // com.applovin.impl.w3
        public w3 a(Object obj, Object obj2, Comparator comparator) {
            return this;
        }

        @Override // com.applovin.impl.w3
        public w3 a(boolean z, boolean z2) {
            return this;
        }

        @Override // com.applovin.impl.w3
        public w3 b(boolean z, boolean z2) {
            return this;
        }

        b(int i) {
            super(null);
            this.d = i;
        }

        @Override // com.applovin.impl.w3
        public int d() {
            return this.d;
        }
    }
}
