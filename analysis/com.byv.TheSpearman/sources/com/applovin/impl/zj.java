package com.applovin.impl;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.impl.c6;
import com.applovin.impl.fl;
import com.applovin.impl.l1;
import com.applovin.impl.n1;
import com.applovin.impl.nh;
import com.applovin.impl.oh;
import com.applovin.impl.ok;
import com.applovin.impl.p1;
import com.applovin.impl.xq;
import com.applovin.impl.z7;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class zj extends c2 implements nh {
    private int A;
    private int B;
    private l5 C;
    private l5 D;
    private int E;
    private k1 F;
    private float G;
    private boolean H;
    private List I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private p6 N;
    private yq O;
    protected final li[] b;
    private final a4 c;
    private final Context d;
    private final a8 e;
    private final c f;
    private final d g;
    private final CopyOnWriteArraySet h;
    private final r0 i;
    private final l1 j;
    private final n1 k;
    private final fl l;
    private final hr m;
    private final ds n;
    private final long o;
    private d9 p;
    private d9 q;
    private AudioTrack r;
    private Object s;
    private Surface t;
    private SurfaceHolder u;
    private ok v;
    private boolean w;
    private TextureView x;
    private int y;
    private int z;

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    static /* synthetic */ rh k(zj zjVar) {
        zjVar.getClass();
        return null;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f1248a;
        private final oi b;
        private j3 c;
        private long d;
        private wo e;
        private yd f;
        private gc g;
        private x1 h;
        private r0 i;
        private Looper j;
        private k1 k;
        private boolean l;
        private int m;
        private boolean n;
        private boolean o;
        private int p;
        private int q;
        private boolean r;
        private fj s;
        private long t;
        private long u;
        private fc v;
        private long w;
        private long x;
        private boolean y;
        private boolean z;

        static /* synthetic */ rh m(b bVar) {
            bVar.getClass();
            return null;
        }

        public b(Context context) {
            this(context, new i6(context), new a6());
        }

        public b(Context context, oi oiVar, m8 m8Var) {
            this(context, oiVar, new k6(context), new g6(context, m8Var), new d6(), r5.a(context), new r0(j3.f557a));
        }

        public b(Context context, oi oiVar, wo woVar, yd ydVar, gc gcVar, x1 x1Var, r0 r0Var) {
            this.f1248a = context;
            this.b = oiVar;
            this.e = woVar;
            this.f = ydVar;
            this.g = gcVar;
            this.h = x1Var;
            this.i = r0Var;
            this.j = yp.d();
            this.k = k1.g;
            this.m = 0;
            this.p = 1;
            this.q = 0;
            this.r = true;
            this.s = fj.g;
            this.t = 5000L;
            this.u = C.DEFAULT_SEEK_FORWARD_INCREMENT_MS;
            this.v = new c6.b().a();
            this.c = j3.f557a;
            this.w = 500L;
            this.x = 2000L;
        }

        public zj a() {
            a1.b(!this.z);
            this.z = true;
            return new zj(this);
        }
    }

    protected zj(b bVar) throws Throwable {
        zj zjVar;
        a4 a4Var = new a4();
        this.c = a4Var;
        try {
            Context applicationContext = bVar.f1248a.getApplicationContext();
            this.d = applicationContext;
            r0 r0Var = bVar.i;
            this.i = r0Var;
            b.m(bVar);
            this.F = bVar.k;
            this.y = bVar.p;
            this.z = bVar.q;
            this.H = bVar.o;
            this.o = bVar.x;
            c cVar = new c();
            this.f = cVar;
            d dVar = new d();
            this.g = dVar;
            this.h = new CopyOnWriteArraySet();
            Handler handler = new Handler(bVar.j);
            li[] liVarArrA = bVar.b.a(handler, cVar, cVar, cVar, cVar);
            this.b = liVarArrA;
            this.G = 1.0f;
            if (yp.f1214a < 21) {
                this.E = d(0);
            } else {
                this.E = r2.a(applicationContext);
            }
            this.I = Collections.emptyList();
            this.J = true;
            try {
                a8 a8Var = new a8(liVarArrA, bVar.e, bVar.f, bVar.g, bVar.h, r0Var, bVar.r, bVar.s, bVar.t, bVar.u, bVar.v, bVar.w, bVar.y, bVar.c, bVar.j, this, new nh.b.a().a(20, 21, 22, 23, 24, 25, 26, 27).a());
                zjVar = this;
                try {
                    zjVar.e = a8Var;
                    a8Var.a((nh.c) cVar);
                    a8Var.a((z7) cVar);
                    if (bVar.d > 0) {
                        a8Var.c(bVar.d);
                    }
                    l1 l1Var = new l1(bVar.f1248a, handler, cVar);
                    zjVar.j = l1Var;
                    l1Var.a(bVar.n);
                    n1 n1Var = new n1(bVar.f1248a, handler, cVar);
                    zjVar.k = n1Var;
                    n1Var.b(bVar.l ? zjVar.F : null);
                    fl flVar = new fl(bVar.f1248a, handler, cVar);
                    zjVar.l = flVar;
                    flVar.a(yp.e(zjVar.F.c));
                    hr hrVar = new hr(bVar.f1248a);
                    zjVar.m = hrVar;
                    hrVar.a(bVar.m != 0);
                    ds dsVar = new ds(bVar.f1248a);
                    zjVar.n = dsVar;
                    dsVar.a(bVar.m == 2);
                    zjVar.N = b(flVar);
                    zjVar.O = yq.f;
                    zjVar.a(1, 10, Integer.valueOf(zjVar.E));
                    zjVar.a(2, 10, Integer.valueOf(zjVar.E));
                    zjVar.a(1, 3, zjVar.F);
                    zjVar.a(2, 4, Integer.valueOf(zjVar.y));
                    zjVar.a(2, 5, Integer.valueOf(zjVar.z));
                    zjVar.a(1, 9, Boolean.valueOf(zjVar.H));
                    zjVar.a(2, 7, dVar);
                    zjVar.a(6, 8, dVar);
                    a4Var.e();
                } catch (Throwable th) {
                    th = th;
                    zjVar.c.e();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                zjVar = this;
            }
        } catch (Throwable th3) {
            th = th3;
            zjVar = this;
        }
    }

    public boolean S() {
        Z();
        return this.e.S();
    }

    @Override // com.applovin.impl.nh
    public yq z() {
        return this.O;
    }

    public void R() {
        Z();
        W();
        a((Object) null);
        a(0, 0);
    }

    public void c(SurfaceHolder surfaceHolder) {
        Z();
        if (surfaceHolder == null) {
            R();
            return;
        }
        W();
        this.w = true;
        this.u = surfaceHolder;
        surfaceHolder.addCallback(this.f);
        Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            a(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            a(surfaceFrame.width(), surfaceFrame.height());
        } else {
            a((Object) null);
            a(0, 0);
        }
    }

    @Override // com.applovin.impl.nh
    public List x() {
        Z();
        return this.I;
    }

    @Override // com.applovin.impl.nh
    public Looper p() {
        return this.e.p();
    }

    @Override // com.applovin.impl.nh
    public int o() {
        Z();
        return this.e.o();
    }

    @Override // com.applovin.impl.nh
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public y7 c() {
        Z();
        return this.e.c();
    }

    @Override // com.applovin.impl.nh
    public int j() {
        Z();
        return this.e.j();
    }

    @Override // com.applovin.impl.nh
    public nh.b i() {
        Z();
        return this.e.i();
    }

    @Override // com.applovin.impl.nh
    public int m() {
        Z();
        return this.e.m();
    }

    @Override // com.applovin.impl.nh
    public boolean r() {
        Z();
        return this.e.r();
    }

    @Override // com.applovin.impl.nh
    public long F() {
        Z();
        return this.e.F();
    }

    @Override // com.applovin.impl.nh
    public long q() {
        Z();
        return this.e.q();
    }

    @Override // com.applovin.impl.nh
    public void b(nh.e eVar) {
        a1.a(eVar);
        this.h.add(eVar);
        a((nh.c) eVar);
    }

    @Override // com.applovin.impl.nh
    public boolean l() {
        Z();
        return this.e.l();
    }

    public void V() {
        AudioTrack audioTrack;
        Z();
        if (yp.f1214a < 21 && (audioTrack = this.r) != null) {
            audioTrack.release();
            this.r = null;
        }
        this.j.a(false);
        this.l.c();
        this.m.b(false);
        this.n.b(false);
        this.k.e();
        this.e.W();
        this.i.i();
        W();
        Surface surface = this.t;
        if (surface != null) {
            surface.release();
            this.t = null;
        }
        if (!this.L) {
            this.I = Collections.emptyList();
            this.M = true;
        } else {
            b8.a(a1.a((Object) null));
            throw null;
        }
    }

    @Override // com.applovin.impl.nh
    public long e() {
        Z();
        return this.e.e();
    }

    @Override // com.applovin.impl.nh
    public uo A() {
        Z();
        return this.e.A();
    }

    @Override // com.applovin.impl.nh
    public qd C() {
        return this.e.C();
    }

    @Override // com.applovin.impl.nh
    public go n() {
        Z();
        return this.e.n();
    }

    @Override // com.applovin.impl.nh
    public int v() {
        Z();
        return this.e.v();
    }

    @Override // com.applovin.impl.nh
    public int t() {
        Z();
        return this.e.t();
    }

    @Override // com.applovin.impl.nh
    public long getDuration() {
        Z();
        return this.e.getDuration();
    }

    @Override // com.applovin.impl.nh
    public long getCurrentPosition() {
        Z();
        return this.e.getCurrentPosition();
    }

    @Override // com.applovin.impl.nh
    public int E() {
        Z();
        return this.e.E();
    }

    @Override // com.applovin.impl.nh
    public qo k() {
        Z();
        return this.e.k();
    }

    @Override // com.applovin.impl.nh
    public long s() {
        Z();
        return this.e.s();
    }

    @Override // com.applovin.impl.nh
    public long h() {
        Z();
        return this.e.h();
    }

    @Override // com.applovin.impl.nh
    public int f() {
        Z();
        return this.e.f();
    }

    @Override // com.applovin.impl.nh
    public long g() {
        Z();
        return this.e.g();
    }

    private void W() {
        if (this.v != null) {
            this.e.a(this.g).a(10000).a((Object) null).j();
            this.v.b(this.f);
            this.v = null;
        }
        TextureView textureView = this.x;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f) {
                kc.d("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.x.setSurfaceTextureListener(null);
            }
            this.x = null;
        }
        SurfaceHolder surfaceHolder = this.u;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f);
            this.u = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        a(1, 2, Float.valueOf(this.G * this.k.d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        this.i.a(this.H);
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((nh.e) it.next()).a(this.H);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        int iO = o();
        if (iO != 1) {
            if (iO == 2 || iO == 3) {
                this.m.b(l() && !S());
                this.n.b(l());
                return;
            } else if (iO != 4) {
                throw new IllegalStateException();
            }
        }
        this.m.b(false);
        this.n.b(false);
    }

    private void Z() {
        this.c.b();
        if (Thread.currentThread() != p().getThread()) {
            String strA = yp.a("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), p().getThread().getName());
            if (!this.J) {
                kc.c("SimpleExoPlayer", strA, this.K ? null : new IllegalStateException());
                this.K = true;
                return;
            }
            throw new IllegalStateException(strA);
        }
    }

    private final class c implements xq, p1, bo, af, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, ok.b, n1.b, l1.b, fl.b, nh.c, z7 {
        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(int i) {
            nh.c.CC.$default$a(this, i);
        }

        @Override // com.applovin.impl.xq
        public /* synthetic */ void a(d9 d9Var) {
            xq.CC.$default$a(this, d9Var);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(go goVar, int i) {
            nh.c.CC.$default$a(this, goVar, i);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(kh khVar) {
            nh.c.CC.$default$a(this, khVar);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(mh mhVar) {
            nh.c.CC.$default$a(this, mhVar);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(nh.b bVar) {
            nh.c.CC.$default$a(this, bVar);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(nh.f fVar, nh.f fVar2, int i) {
            nh.c.CC.$default$a(this, fVar, fVar2, i);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(nh nhVar, nh.d dVar) {
            nh.c.CC.$default$a(this, nhVar, dVar);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(od odVar, int i) {
            nh.c.CC.$default$a(this, odVar, i);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(qd qdVar) {
            nh.c.CC.$default$a(this, qdVar);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void a(qo qoVar, uo uoVar) {
            nh.c.CC.$default$a(this, qoVar, uoVar);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void b() {
            nh.c.CC.$default$b(this);
        }

        @Override // com.applovin.impl.p1
        public /* synthetic */ void b(d9 d9Var) {
            p1.CC.$default$b(this, d9Var);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void b(kh khVar) {
            nh.c.CC.$default$b(this, khVar);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void b(boolean z) {
            nh.c.CC.$default$b(this, z);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void b(boolean z, int i) {
            nh.c.CC.$default$b(this, z, i);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void c(int i) {
            nh.c.CC.$default$c(this, i);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void d(boolean z) {
            nh.c.CC.$default$d(this, z);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void e(int i) {
            nh.c.CC.$default$e(this, i);
        }

        @Override // com.applovin.impl.nh.c
        public /* synthetic */ void e(boolean z) {
            nh.c.CC.$default$e(this, z);
        }

        @Override // com.applovin.impl.z7
        public /* synthetic */ void f(boolean z) {
            z7.CC.$default$f(this, z);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        private c() {
        }

        @Override // com.applovin.impl.p1
        public void a(String str, long j, long j2) {
            zj.this.i.a(str, j, j2);
        }

        @Override // com.applovin.impl.p1
        public void b(String str) {
            zj.this.i.b(str);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (zj.this.w) {
                zj.this.a(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            zj.this.a(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (zj.this.w) {
                zj.this.a((Object) null);
            }
            zj.this.a(0, 0);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            zj.this.a(surfaceTexture);
            zj.this.a(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            zj.this.a(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            zj.this.a((Object) null);
            zj.this.a(0, 0);
            return true;
        }

        @Override // com.applovin.impl.n1.b
        public void f(int i) {
            boolean zL = zj.this.l();
            zj.this.a(zL, i, zj.b(zL, i));
        }

        @Override // com.applovin.impl.l1.b
        public void c() {
            zj.this.a(false, -1, 3);
        }

        @Override // com.applovin.impl.fl.b
        public void d(int i) {
            p6 p6VarB = zj.b(zj.this.l);
            if (p6VarB.equals(zj.this.N)) {
                return;
            }
            zj.this.N = p6VarB;
            Iterator it = zj.this.h.iterator();
            while (it.hasNext()) {
                ((nh.e) it.next()).a(p6VarB);
            }
        }

        @Override // com.applovin.impl.z7
        public void g(boolean z) {
            zj.this.Y();
        }

        @Override // com.applovin.impl.p1
        public void a(l5 l5Var) {
            zj.this.D = l5Var;
            zj.this.i.a(l5Var);
        }

        @Override // com.applovin.impl.p1
        public void b(d9 d9Var, o5 o5Var) {
            zj.this.q = d9Var;
            zj.this.i.b(d9Var, o5Var);
        }

        @Override // com.applovin.impl.xq
        public void d(l5 l5Var) {
            zj.this.C = l5Var;
            zj.this.i.d(l5Var);
        }

        @Override // com.applovin.impl.p1
        public void c(Exception exc) {
            zj.this.i.c(exc);
        }

        @Override // com.applovin.impl.p1
        public void a(long j) {
            zj.this.i.a(j);
        }

        @Override // com.applovin.impl.p1
        public void b(int i, long j, long j2) {
            zj.this.i.b(i, j, j2);
        }

        @Override // com.applovin.impl.p1
        public void c(l5 l5Var) {
            zj.this.i.c(l5Var);
            zj.this.q = null;
            zj.this.D = null;
        }

        @Override // com.applovin.impl.p1
        public void a(Exception exc) {
            zj.this.i.a(exc);
        }

        @Override // com.applovin.impl.nh.c
        public void b(int i) {
            zj.this.Y();
        }

        @Override // com.applovin.impl.nh.c
        public void c(boolean z) {
            zj.k(zj.this);
        }

        @Override // com.applovin.impl.bo
        public void a(List list) {
            zj.this.I = list;
            Iterator it = zj.this.h.iterator();
            while (it.hasNext()) {
                ((nh.e) it.next()).a(list);
            }
        }

        @Override // com.applovin.impl.xq
        public void b(Exception exc) {
            zj.this.i.b(exc);
        }

        @Override // com.applovin.impl.xq
        public void a(int i, long j) {
            zj.this.i.a(i, j);
        }

        @Override // com.applovin.impl.xq
        public void b(String str, long j, long j2) {
            zj.this.i.b(str, j, j2);
        }

        @Override // com.applovin.impl.af
        public void a(we weVar) {
            zj.this.i.a(weVar);
            zj.this.e.a(weVar);
            Iterator it = zj.this.h.iterator();
            while (it.hasNext()) {
                ((nh.e) it.next()).a(weVar);
            }
        }

        @Override // com.applovin.impl.xq
        public void b(l5 l5Var) {
            zj.this.i.b(l5Var);
            zj.this.p = null;
            zj.this.C = null;
        }

        @Override // com.applovin.impl.ok.b
        public void b(Surface surface) {
            zj.this.a(surface);
        }

        @Override // com.applovin.impl.nh.c
        public void a(boolean z, int i) {
            zj.this.Y();
        }

        @Override // com.applovin.impl.xq
        public void a(Object obj, long j) {
            zj.this.i.a(obj, j);
            if (zj.this.s == obj) {
                Iterator it = zj.this.h.iterator();
                while (it.hasNext()) {
                    ((nh.e) it.next()).a();
                }
            }
        }

        @Override // com.applovin.impl.n1.b
        public void b(float f) {
            zj.this.X();
        }

        @Override // com.applovin.impl.p1
        public void a(boolean z) {
            if (zj.this.H == z) {
                return;
            }
            zj.this.H = z;
            zj.this.U();
        }

        @Override // com.applovin.impl.fl.b
        public void a(int i, boolean z) {
            Iterator it = zj.this.h.iterator();
            while (it.hasNext()) {
                ((nh.e) it.next()).b(i, z);
            }
        }

        @Override // com.applovin.impl.xq
        public void a(String str) {
            zj.this.i.a(str);
        }

        @Override // com.applovin.impl.xq
        public void a(long j, int i) {
            zj.this.i.a(j, i);
        }

        @Override // com.applovin.impl.xq
        public void a(d9 d9Var, o5 o5Var) {
            zj.this.p = d9Var;
            zj.this.i.a(d9Var, o5Var);
        }

        @Override // com.applovin.impl.xq
        public void a(yq yqVar) {
            zj.this.O = yqVar;
            zj.this.i.a(yqVar);
            Iterator it = zj.this.h.iterator();
            while (it.hasNext()) {
                ((nh.e) it.next()).a(yqVar);
            }
        }

        @Override // com.applovin.impl.ok.b
        public void a(Surface surface) {
            zj.this.a((Object) null);
        }
    }

    private int d(int i) {
        AudioTrack audioTrack = this.r;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i) {
            this.r.release();
            this.r = null;
        }
        if (this.r == null) {
            this.r = new AudioTrack(3, 4000, 4, 2, 2, 0, i);
        }
        return this.r.getAudioSessionId();
    }

    @Override // com.applovin.impl.nh
    public void b(SurfaceView surfaceView) {
        Z();
        a(surfaceView == null ? null : surfaceView.getHolder());
    }

    private static final class d implements vq, t2, oh.b {

        /* renamed from: a, reason: collision with root package name */
        private vq f1250a;
        private t2 b;
        private vq c;
        private t2 d;

        private d() {
        }

        @Override // com.applovin.impl.oh.b
        public void a(int i, Object obj) {
            if (i == 7) {
                this.f1250a = (vq) obj;
                return;
            }
            if (i == 8) {
                this.b = (t2) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            ok okVar = (ok) obj;
            if (okVar == null) {
                this.c = null;
                this.d = null;
            } else {
                this.c = okVar.getVideoFrameMetadataListener();
                this.d = okVar.getCameraMotionListener();
            }
        }

        @Override // com.applovin.impl.t2
        public void a(long j, float[] fArr) {
            t2 t2Var = this.d;
            if (t2Var != null) {
                t2Var.a(j, fArr);
            }
            t2 t2Var2 = this.b;
            if (t2Var2 != null) {
                t2Var2.a(j, fArr);
            }
        }

        @Override // com.applovin.impl.t2
        public void a() {
            t2 t2Var = this.d;
            if (t2Var != null) {
                t2Var.a();
            }
            t2 t2Var2 = this.b;
            if (t2Var2 != null) {
                t2Var2.a();
            }
        }

        @Override // com.applovin.impl.vq
        public void a(long j, long j2, d9 d9Var, MediaFormat mediaFormat) {
            vq vqVar = this.c;
            if (vqVar != null) {
                vqVar.a(j, j2, d9Var, mediaFormat);
            }
            vq vqVar2 = this.f1250a;
            if (vqVar2 != null) {
                vqVar2.a(j, j2, d9Var, mediaFormat);
            }
        }
    }

    public void a(nh.c cVar) {
        a1.a(cVar);
        this.e.a(cVar);
    }

    @Override // com.applovin.impl.nh
    public void b(TextureView textureView) {
        Z();
        if (textureView == null || textureView != this.x) {
            return;
        }
        R();
    }

    public void a(SurfaceHolder surfaceHolder) {
        Z();
        if (surfaceHolder == null || surfaceHolder != this.u) {
            return;
        }
        R();
    }

    @Override // com.applovin.impl.nh
    public boolean d() {
        Z();
        return this.e.d();
    }

    @Override // com.applovin.impl.nh
    public void b() {
        Z();
        boolean zL = l();
        int iA = this.k.a(zL, 2);
        a(zL, iA, b(zL, iA));
        this.e.b();
    }

    @Override // com.applovin.impl.nh
    public mh a() {
        Z();
        return this.e.a();
    }

    public void b(nh.c cVar) {
        this.e.e(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        if (i == this.A && i2 == this.B) {
            return;
        }
        this.A = i;
        this.B = i2;
        this.i.a(i, i2);
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((nh.e) it.next()).a(i, i2);
        }
    }

    private void b(SurfaceHolder surfaceHolder) {
        this.w = false;
        this.u = surfaceHolder;
        surfaceHolder.addCallback(this.f);
        Surface surface = this.u.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.u.getSurfaceFrame();
            a(surfaceFrame.width(), surfaceFrame.height());
        } else {
            a(0, 0);
        }
    }

    @Override // com.applovin.impl.nh
    public void a(nh.e eVar) {
        a1.a(eVar);
        this.h.remove(eVar);
        b((nh.c) eVar);
    }

    @Override // com.applovin.impl.nh
    public void b(boolean z) {
        Z();
        this.e.b(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p6 b(fl flVar) {
        return new p6(0, flVar.b(), flVar.a());
    }

    @Override // com.applovin.impl.nh
    public void a(int i, long j) {
        Z();
        this.i.h();
        this.e.a(i, j);
    }

    private void a(int i, int i2, Object obj) {
        for (li liVar : this.b) {
            if (liVar.e() == i) {
                this.e.a(liVar).a(i2).a(obj).j();
            }
        }
    }

    public void a(wd wdVar) {
        Z();
        this.e.a(wdVar);
    }

    @Override // com.applovin.impl.nh
    public void a(boolean z) {
        Z();
        int iA = this.k.a(z, o());
        a(z, iA, b(z, iA));
    }

    @Override // com.applovin.impl.nh
    public void a(int i) {
        Z();
        this.e.a(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        a(surface);
        this.t = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        li[] liVarArr = this.b;
        int length = liVarArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= length) {
                break;
            }
            li liVar = liVarArr[i];
            if (liVar.e() == 2) {
                arrayList.add(this.e.a(liVar).a(1).a(obj).j());
            }
            i++;
        }
        Object obj2 = this.s;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((oh) it.next()).a(this.o);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.s;
            Surface surface = this.t;
            if (obj3 == surface) {
                surface.release();
                this.t = null;
            }
        }
        this.s = obj;
        if (z) {
            this.e.a(false, y7.a(new e8(3), 1003));
        }
    }

    @Override // com.applovin.impl.nh
    public void a(SurfaceView surfaceView) {
        Z();
        if (surfaceView instanceof uq) {
            W();
            a((Object) surfaceView);
            b(surfaceView.getHolder());
        } else {
            if (surfaceView instanceof ok) {
                W();
                this.v = (ok) surfaceView;
                this.e.a(this.g).a(10000).a(this.v).j();
                this.v.a(this.f);
                a(this.v.getVideoSurface());
                b(surfaceView.getHolder());
                return;
            }
            c(surfaceView == null ? null : surfaceView.getHolder());
        }
    }

    @Override // com.applovin.impl.nh
    public void a(TextureView textureView) {
        Z();
        if (textureView == null) {
            R();
            return;
        }
        W();
        this.x = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            kc.d("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            a((Object) null);
            a(0, 0);
        } else {
            a(surfaceTexture);
            a(textureView.getWidth(), textureView.getHeight());
        }
    }

    public void a(float f) {
        Z();
        float fA = yp.a(f, 0.0f, 1.0f);
        if (this.G == fA) {
            return;
        }
        this.G = fA;
        X();
        this.i.a(fA);
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((nh.e) it.next()).a(fA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        this.e.a(z2, i3, i2);
    }
}
