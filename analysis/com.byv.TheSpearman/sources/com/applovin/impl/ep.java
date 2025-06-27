package com.applovin.impl;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface ep {

    public interface c {
        SparseArray a();

        ep a(int i, b bVar);
    }

    void a();

    void a(io ioVar, k8 k8Var, d dVar);

    void a(yg ygVar, int i);

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f396a;
        public final String b;
        public final List c;
        public final byte[] d;

        public b(int i, String str, List list, byte[] bArr) {
            List listUnmodifiableList;
            this.f396a = i;
            this.b = str;
            if (list == null) {
                listUnmodifiableList = Collections.emptyList();
            } else {
                listUnmodifiableList = Collections.unmodifiableList(list);
            }
            this.c = listUnmodifiableList;
            this.d = bArr;
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f395a;
        public final int b;
        public final byte[] c;

        public a(String str, int i, byte[] bArr) {
            this.f395a = str;
            this.b = i;
            this.c = bArr;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f397a;
        private final int b;
        private final int c;
        private int d;
        private String e;

        public d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public void a() {
            int i = this.d;
            this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
            this.e = this.f397a + this.d;
        }

        public int c() {
            d();
            return this.d;
        }

        public String b() {
            d();
            return this.e;
        }

        private void d() {
            if (this.d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.f397a = str;
            this.b = i2;
            this.c = i3;
            this.d = Integer.MIN_VALUE;
            this.e = "";
        }
    }
}
