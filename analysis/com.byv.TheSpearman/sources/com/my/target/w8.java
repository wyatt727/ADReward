package com.my.target;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.SparseIntArray;

/* loaded from: classes4.dex */
public class w8 {

    /* renamed from: a, reason: collision with root package name */
    public final SparseIntArray f4176a = new SparseIntArray();
    public final float b;
    public static final int c = a();
    public static final int d = a();
    public static final int e = a();
    public static final int f = a();
    public static final int g = a();
    public static final int h = a();
    public static final int i = a();
    public static final int j = a();
    public static final int k = a();
    public static final int l = a();
    public static final int m = a();
    public static final int n = a();
    public static final int o = a();
    public static final int p = a();
    public static final int q = a();
    public static final int r = a();
    public static final int s = a();
    public static final int t = a();
    public static final int u = a();
    public static final int v = a();
    public static final int w = a();
    public static final int x = a();
    public static final int y = a();
    public static final int z = a();
    public static final int A = a();
    public static final int B = a();
    public static final int C = a();
    public static final int D = a();
    public static final int E = a();
    public static final int F = a();
    public static final int G = a();
    public static final int H = a();
    public static final int I = a();
    public static final int J = a();
    public static final int K = a();
    public static final int L = a();
    public static final int M = a();
    public static final int N = a();
    public static final int O = a();
    public static final int P = a();
    public static final int Q = a();
    public static final int R = a();
    public static final int S = a();
    public static final int T = a();
    public static final int U = a();
    public static final int V = a();
    public static final int W = a();
    public static final int X = a();
    public static int Y = 0;

    public w8(Context context) {
        int i2;
        float f2;
        ca caVarE = ca.e(context);
        DisplayMetrics displayMetricsA = ca.a(context);
        int i3 = displayMetricsA.heightPixels;
        if (i3 <= 0 || (i2 = displayMetricsA.widthPixels) <= 0) {
            this.b = 1.0f;
            a(caVarE);
            return;
        }
        float f3 = displayMetricsA.density;
        float fMin = Math.min(i2 / f3, i3 / f3);
        if (fMin >= 720.0f) {
            f2 = 2.0f;
        } else {
            if (fMin < 600.0f) {
                this.b = 1.0f;
                a(caVarE);
            }
            f2 = 1.2f;
        }
        this.b = f2;
        a(caVarE);
    }

    public static int a() {
        int i2 = Y;
        Y = i2 + 1;
        return i2;
    }

    public static w8 a(Context context) {
        return new w8(context);
    }

    public int a(int i2) {
        return this.f4176a.get(i2);
    }

    public final void a(int i2, int i3) {
        this.f4176a.put(i2, (int) (i3 * this.b));
    }

    public final void a(ca caVar) {
        a(c, caVar.b(200));
        a(d, caVar.b(1));
        a(e, caVar.b(4));
        a(f, 1);
        a(g, 18);
        a(h, caVar.b(16));
        a(i, caVar.b(8));
        a(j, caVar.b(6));
        a(k, caVar.b(2));
        a(l, caVar.b(48));
        a(m, caVar.b(6));
        a(n, caVar.b(6));
        a(o, caVar.b(14));
        a(p, caVar.b(20));
        a(q, caVar.b(27));
        a(r, 22);
        a(s, 2);
        a(t, 16);
        a(u, 3);
        a(v, 16);
        a(w, caVar.b(6));
        a(x, caVar.b(2));
        a(y, 1);
        a(z, caVar.b(3));
        a(B, 16);
        a(W, 14);
        a(A, 1);
        a(C, 2);
        a(D, 2);
        a(E, caVar.b(32));
        a(F, caVar.b(16));
        a(H, caVar.b(2));
        a(I, 16);
        a(K, 16);
        a(L, 2);
        a(M, 14);
        a(J, 22);
        a(P, 16);
        a(Q, 16);
        a(N, caVar.b(4));
        a(O, caVar.b(8));
        a(R, caVar.b(100));
        a(S, caVar.b(32));
        a(T, caVar.b(136));
        a(U, caVar.b(156));
        a(G, caVar.b(24));
        a(V, caVar.b(10));
        a(X, caVar.b(40));
    }
}
