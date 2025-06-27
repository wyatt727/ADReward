package com.applovin.impl;

import android.net.Uri;
import com.json.t2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class j5 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f560a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final long h;
    public final String i;
    public final int j;
    public final Object k;

    public String toString() {
        return "DataSpec[" + b() + " " + this.f560a + ", " + this.g + ", " + this.h + ", " + this.i + ", " + this.j + t2.i.e;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Uri f561a;
        private long b;
        private int c;
        private byte[] d;
        private Map e;
        private long f;
        private long g;
        private String h;
        private int i;
        private Object j;

        public b() {
            this.c = 1;
            this.e = Collections.emptyMap();
            this.g = -1L;
        }

        public b b(int i) {
            this.c = i;
            return this;
        }

        private b(j5 j5Var) {
            this.f561a = j5Var.f560a;
            this.b = j5Var.b;
            this.c = j5Var.c;
            this.d = j5Var.d;
            this.e = j5Var.e;
            this.f = j5Var.g;
            this.g = j5Var.h;
            this.h = j5Var.i;
            this.i = j5Var.j;
            this.j = j5Var.k;
        }

        public b b(String str) {
            this.f561a = Uri.parse(str);
            return this;
        }

        public j5 a() {
            a1.a(this.f561a, "The uri must be set.");
            return new j5(this.f561a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }

        public b a(int i) {
            this.i = i;
            return this;
        }

        public b a(byte[] bArr) {
            this.d = bArr;
            return this;
        }

        public b a(Map map) {
            this.e = map;
            return this;
        }

        public b a(String str) {
            this.h = str;
            return this;
        }

        public b a(long j) {
            this.f = j;
            return this;
        }

        public b a(Uri uri) {
            this.f561a = uri;
            return this;
        }
    }

    public static String a(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    private j5(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        boolean z = true;
        a1.a(j4 >= 0);
        a1.a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        a1.a(z);
        this.f560a = uri;
        this.b = j;
        this.c = i;
        this.d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.g = j2;
        this.f = j4;
        this.h = j3;
        this.i = str;
        this.j = i2;
        this.k = obj;
    }

    public final String b() {
        return a(this.c);
    }

    public boolean b(int i) {
        return (this.j & i) == i;
    }
}
