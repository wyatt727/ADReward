package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.dl;
import com.applovin.impl.gr;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
final class fr extends dl {
    private a n;
    private int o;
    private boolean p;
    private gr.d q;
    private gr.b r;

    static int a(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    fr() {
    }

    @Override // com.applovin.impl.dl
    protected void c(long j) {
        super.c(j);
        this.p = j != 0;
        gr.d dVar = this.q;
        this.o = dVar != null ? dVar.g : 0;
    }

    public static boolean c(yg ygVar) {
        try {
            return gr.a(1, ygVar, true);
        } catch (ah unused) {
            return false;
        }
    }

    a b(yg ygVar) throws ah {
        gr.d dVar = this.q;
        if (dVar == null) {
            this.q = gr.b(ygVar);
            return null;
        }
        gr.b bVar = this.r;
        if (bVar == null) {
            this.r = gr.a(ygVar);
            return null;
        }
        byte[] bArr = new byte[ygVar.e()];
        System.arraycopy(ygVar.c(), 0, bArr, 0, ygVar.e());
        return new a(dVar, bVar, bArr, gr.a(ygVar, dVar.b), gr.a(r4.length - 1));
    }

    static void a(yg ygVar, long j) {
        if (ygVar.b() < ygVar.e() + 4) {
            ygVar.a(Arrays.copyOf(ygVar.c(), ygVar.e() + 4));
        } else {
            ygVar.e(ygVar.e() + 4);
        }
        byte[] bArrC = ygVar.c();
        bArrC[ygVar.e() - 4] = (byte) (j & 255);
        bArrC[ygVar.e() - 3] = (byte) ((j >>> 8) & 255);
        bArrC[ygVar.e() - 2] = (byte) ((j >>> 16) & 255);
        bArrC[ygVar.e() - 1] = (byte) ((j >>> 24) & 255);
    }

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final gr.d f441a;
        public final gr.b b;
        public final byte[] c;
        public final gr.c[] d;
        public final int e;

        public a(gr.d dVar, gr.b bVar, byte[] bArr, gr.c[] cVarArr, int i) {
            this.f441a = dVar;
            this.b = bVar;
            this.c = bArr;
            this.d = cVarArr;
            this.e = i;
        }
    }

    private static int a(byte b, a aVar) {
        if (!aVar.d[a(b, aVar.e, 1)].f474a) {
            return aVar.f441a.g;
        }
        return aVar.f441a.h;
    }

    @Override // com.applovin.impl.dl
    protected long a(yg ygVar) {
        if ((ygVar.c()[0] & 1) == 1) {
            return -1L;
        }
        int iA = a(ygVar.c()[0], (a) a1.b(this.n));
        long j = this.p ? (this.o + iA) / 4 : 0;
        a(ygVar, j);
        this.p = true;
        this.o = iA;
        return j;
    }

    @Override // com.applovin.impl.dl
    protected boolean a(yg ygVar, long j, dl.b bVar) throws ah {
        if (this.n != null) {
            a1.a(bVar.f368a);
            return false;
        }
        a aVarB = b(ygVar);
        this.n = aVarB;
        if (aVarB == null) {
            return true;
        }
        gr.d dVar = aVarB.f441a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.j);
        arrayList.add(aVarB.c);
        bVar.f368a = new d9.b().f("audio/vorbis").b(dVar.e).k(dVar.d).c(dVar.b).n(dVar.c).a(arrayList).a();
        return true;
    }

    @Override // com.applovin.impl.dl
    protected void a(boolean z) {
        super.a(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
