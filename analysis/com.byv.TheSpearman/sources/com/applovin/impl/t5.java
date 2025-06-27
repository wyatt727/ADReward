package com.applovin.impl;

import android.content.Context;
import android.net.Uri;
import com.applovin.impl.b6;
import com.applovin.impl.g5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class t5 implements g5 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1014a;
    private final List b = new ArrayList();
    private final g5 c;
    private g5 d;
    private g5 e;
    private g5 f;
    private g5 g;
    private g5 h;
    private g5 i;
    private g5 j;
    private g5 k;

    public static final class a implements g5.a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f1015a;
        private final g5.a b;
        private yo c;

        public a(Context context) {
            this(context, new b6.b());
        }

        @Override // com.applovin.impl.g5.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t5 a() {
            t5 t5Var = new t5(this.f1015a, this.b.a());
            yo yoVar = this.c;
            if (yoVar != null) {
                t5Var.a(yoVar);
            }
            return t5Var;
        }

        public a(Context context, g5.a aVar) {
            this.f1015a = context.getApplicationContext();
            this.b = aVar;
        }
    }

    public t5(Context context, g5 g5Var) {
        this.f1014a = context.getApplicationContext();
        this.c = (g5) a1.a(g5Var);
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        g5 g5Var = this.k;
        if (g5Var == null) {
            return null;
        }
        return g5Var.c();
    }

    @Override // com.applovin.impl.g5
    public Map e() {
        g5 g5Var = this.k;
        return g5Var == null ? Collections.emptyMap() : g5Var.e();
    }

    @Override // com.applovin.impl.g5
    public void close() {
        g5 g5Var = this.k;
        if (g5Var != null) {
            try {
                g5Var.close();
            } finally {
                this.k = null;
            }
        }
    }

    private g5 m() {
        if (this.h == null) {
            op opVar = new op();
            this.h = opVar;
            a(opVar);
        }
        return this.h;
    }

    private g5 j() {
        if (this.d == null) {
            n8 n8Var = new n8();
            this.d = n8Var;
            a(n8Var);
        }
        return this.d;
    }

    private g5 g() {
        if (this.e == null) {
            b1 b1Var = new b1(this.f1014a);
            this.e = b1Var;
            a(b1Var);
        }
        return this.e;
    }

    private g5 h() {
        if (this.f == null) {
            q4 q4Var = new q4(this.f1014a);
            this.f = q4Var;
            a(q4Var);
        }
        return this.f;
    }

    private g5 l() {
        if (this.g == null) {
            try {
                g5 g5Var = (g5) Class.forName("com.applovin.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.g = g5Var;
                a(g5Var);
            } catch (ClassNotFoundException unused) {
                kc.d("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.g == null) {
                this.g = this.c;
            }
        }
        return this.g;
    }

    private g5 i() {
        if (this.i == null) {
            f5 f5Var = new f5();
            this.i = f5Var;
            a(f5Var);
        }
        return this.i;
    }

    private g5 k() {
        if (this.j == null) {
            hi hiVar = new hi(this.f1014a);
            this.j = hiVar;
            a(hiVar);
        }
        return this.j;
    }

    private void a(g5 g5Var) {
        for (int i = 0; i < this.b.size(); i++) {
            g5Var.a((yo) this.b.get(i));
        }
    }

    @Override // com.applovin.impl.g5
    public void a(yo yoVar) {
        a1.a(yoVar);
        this.c.a(yoVar);
        this.b.add(yoVar);
        a(this.d, yoVar);
        a(this.e, yoVar);
        a(this.f, yoVar);
        a(this.g, yoVar);
        a(this.h, yoVar);
        a(this.i, yoVar);
        a(this.j, yoVar);
    }

    private void a(g5 g5Var, yo yoVar) {
        if (g5Var != null) {
            g5Var.a(yoVar);
        }
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) {
        a1.b(this.k == null);
        String scheme = j5Var.f560a.getScheme();
        if (yp.a(j5Var.f560a)) {
            String path = j5Var.f560a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.k = g();
            } else {
                this.k = j();
            }
        } else if ("asset".equals(scheme)) {
            this.k = g();
        } else if ("content".equals(scheme)) {
            this.k = h();
        } else if ("rtmp".equals(scheme)) {
            this.k = l();
        } else if ("udp".equals(scheme)) {
            this.k = m();
        } else if ("data".equals(scheme)) {
            this.k = i();
        } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
            this.k = this.c;
        } else {
            this.k = k();
        }
        return this.k.a(j5Var);
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i, int i2) {
        return ((g5) a1.a(this.k)).a(bArr, i, i2);
    }
}
