package com.applovin.impl;

import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
abstract class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f514a;

    public static String a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public static int b(int i) {
        return i & ViewCompat.MEASURED_SIZE_MASK;
    }

    public static int c(int i) {
        return (i >> 24) & 255;
    }

    public i1(int i) {
        this.f514a = i;
    }

    public String toString() {
        return a(this.f514a);
    }

    static final class b extends i1 {
        public final yg b;

        public b(int i, yg ygVar) {
            super(i);
            this.b = ygVar;
        }
    }

    static final class a extends i1 {
        public final long b;
        public final List c;
        public final List d;

        @Override // com.applovin.impl.i1
        public String toString() {
            return i1.a(this.f514a) + " leaves: " + Arrays.toString(this.c.toArray()) + " containers: " + Arrays.toString(this.d.toArray());
        }

        public a(int i, long j) {
            super(i);
            this.b = j;
            this.c = new ArrayList();
            this.d = new ArrayList();
        }

        public void a(a aVar) {
            this.d.add(aVar);
        }

        public b e(int i) {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = (b) this.c.get(i2);
                if (bVar.f514a == i) {
                    return bVar;
                }
            }
            return null;
        }

        public a d(int i) {
            int size = this.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = (a) this.d.get(i2);
                if (aVar.f514a == i) {
                    return aVar;
                }
            }
            return null;
        }

        public void a(b bVar) {
            this.c.add(bVar);
        }
    }
}
