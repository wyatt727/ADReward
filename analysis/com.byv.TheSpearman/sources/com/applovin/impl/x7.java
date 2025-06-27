package com.applovin.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public interface x7 {

    public interface b {
        void a(x7 x7Var, byte[] bArr, int i, int i2, byte[] bArr2);
    }

    public interface c {
        x7 a(UUID uuid);
    }

    a a(byte[] bArr, List list, int i, HashMap map);

    void a();

    void a(b bVar);

    void a(byte[] bArr);

    void a(byte[] bArr, byte[] bArr2);

    boolean a(byte[] bArr, String str);

    d b();

    Map b(byte[] bArr);

    byte[] b(byte[] bArr, byte[] bArr2);

    int c();

    void c(byte[] bArr);

    x4 d(byte[] bArr);

    byte[] d();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f1160a;
        private final String b;
        private final int c;

        public a(byte[] bArr, String str, int i) {
            this.f1160a = bArr;
            this.b = str;
            this.c = i;
        }

        public byte[] a() {
            return this.f1160a;
        }

        public String b() {
            return this.b;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f1161a;
        private final String b;

        public d(byte[] bArr, String str) {
            this.f1161a = bArr;
            this.b = str;
        }

        public byte[] a() {
            return this.f1161a;
        }

        public String b() {
            return this.b;
        }
    }
}
