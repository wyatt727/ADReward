package com.applovin.impl;

import java.util.List;

/* loaded from: classes.dex */
final class hf {

    /* renamed from: a, reason: collision with root package name */
    public final long f500a;
    public final List b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f501a;
        public final String b;
        public final long c;
        public final long d;

        public a(String str, String str2, long j, long j2) {
            this.f501a = str;
            this.b = str2;
            this.c = j;
            this.d = j2;
        }
    }

    public hf(long j, List list) {
        this.f500a = j;
        this.b = list;
    }

    public Cif a(long j) {
        long j2;
        if (this.b.size() < 2) {
            return null;
        }
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        boolean z = false;
        for (int size = this.b.size() - 1; size >= 0; size--) {
            a aVar = (a) this.b.get(size);
            boolean zEquals = "video/mp4".equals(aVar.f501a) | z;
            if (size == 0) {
                j2 = j3 - aVar.d;
                j3 = 0;
            } else {
                long j8 = j3;
                j3 -= aVar.c;
                j2 = j8;
            }
            if (!zEquals || j3 == j2) {
                z = zEquals;
            } else {
                j7 = j2 - j3;
                j6 = j3;
                z = false;
            }
            if (size == 0) {
                j4 = j3;
                j5 = j2;
            }
        }
        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
            return null;
        }
        return new Cif(j4, j5, this.f500a, j6, j7);
    }
}
