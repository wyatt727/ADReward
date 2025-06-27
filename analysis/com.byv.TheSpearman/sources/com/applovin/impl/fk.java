package com.applovin.impl;

import com.applovin.impl.fk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public class fk {
    private static final Comparator h = new Comparator() { // from class: com.applovin.impl.fk$$ExternalSyntheticLambda1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return fk.a((fk.b) obj, (fk.b) obj2);
        }
    };
    private static final Comparator i = new Comparator() { // from class: com.applovin.impl.fk$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return fk.b((fk.b) obj, (fk.b) obj2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f434a;
    private int e;
    private int f;
    private int g;
    private final b[] c = new b[5];
    private final ArrayList b = new ArrayList();
    private int d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f435a;
        public int b;
        public float c;

        private b() {
        }
    }

    public fk(int i2) {
        this.f434a = i2;
    }

    public void c() {
        this.b.clear();
        this.d = -1;
        this.e = 0;
        this.f = 0;
    }

    public void a(int i2, float f) {
        b bVar;
        a();
        int i3 = this.g;
        if (i3 > 0) {
            b[] bVarArr = this.c;
            int i4 = i3 - 1;
            this.g = i4;
            bVar = bVarArr[i4];
        } else {
            bVar = new b();
        }
        int i5 = this.e;
        this.e = i5 + 1;
        bVar.f435a = i5;
        bVar.b = i2;
        bVar.c = f;
        this.b.add(bVar);
        this.f += i2;
        while (true) {
            int i6 = this.f;
            int i7 = this.f434a;
            if (i6 <= i7) {
                return;
            }
            int i8 = i6 - i7;
            b bVar2 = (b) this.b.get(0);
            int i9 = bVar2.b;
            if (i9 <= i8) {
                this.f -= i9;
                this.b.remove(0);
                int i10 = this.g;
                if (i10 < 5) {
                    b[] bVarArr2 = this.c;
                    this.g = i10 + 1;
                    bVarArr2[i10] = bVar2;
                }
            } else {
                bVar2.b = i9 - i8;
                this.f -= i8;
            }
        }
    }

    private void b() {
        if (this.d != 0) {
            Collections.sort(this.b, i);
            this.d = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(b bVar, b bVar2) {
        return Float.compare(bVar.c, bVar2.c);
    }

    private void a() {
        if (this.d != 1) {
            Collections.sort(this.b, h);
            this.d = 1;
        }
    }

    public float a(float f) {
        b();
        float f2 = f * this.f;
        int i2 = 0;
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            b bVar = (b) this.b.get(i3);
            i2 += bVar.b;
            if (i2 >= f2) {
                return bVar.c;
            }
        }
        if (this.b.isEmpty()) {
            return Float.NaN;
        }
        return ((b) this.b.get(r5.size() - 1)).c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(b bVar, b bVar2) {
        return bVar.f435a - bVar2.f435a;
    }
}
