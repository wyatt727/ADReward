package com.applovin.impl;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.applovin.impl.cd;
import com.applovin.impl.id;
import com.applovin.impl.mi;
import com.applovin.impl.xq;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.common.Scopes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class kd extends gd {
    private static final int[] s1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean t1;
    private static boolean u1;
    private final Context J0;
    private final wq K0;
    private final xq.a L0;
    private final long M0;
    private final int N0;
    private final boolean O0;
    private a P0;
    private boolean Q0;
    private boolean R0;
    private Surface S0;
    private f7 T0;
    private boolean U0;
    private int V0;
    private boolean W0;
    private boolean X0;
    private boolean Y0;
    private long Z0;
    private long a1;
    private long b1;
    private int c1;
    private int d1;
    private int e1;
    private long f1;
    private long g1;
    private long h1;
    private int i1;
    private int j1;
    private int k1;
    private int l1;
    private float m1;
    private yq n1;
    private boolean o1;
    private int p1;
    b q1;
    private vq r1;

    private static boolean e0() {
        return "NVIDIA".equals(yp.c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean f0() {
        /*
            Method dump skipped, instructions count: 3052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.kd.f0():boolean");
    }

    private static boolean g(long j) {
        return j < -30000;
    }

    private static boolean h(long j) {
        return j < -500000;
    }

    @Override // com.applovin.impl.li, com.applovin.impl.mi
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    public kd(Context context, cd.b bVar, hd hdVar, long j, boolean z, Handler handler, xq xqVar, int i) {
        super(2, bVar, hdVar, z, 30.0f);
        this.M0 = j;
        this.N0 = i;
        Context applicationContext = context.getApplicationContext();
        this.J0 = applicationContext;
        this.K0 = new wq(applicationContext);
        this.L0 = new xq.a(handler, xqVar);
        this.O0 = e0();
        this.a1 = -9223372036854775807L;
        this.j1 = -1;
        this.k1 = -1;
        this.m1 = -1.0f;
        this.V0 = 1;
        this.p1 = 0;
        d0();
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.li
    public boolean d() {
        f7 f7Var;
        if (super.d() && (this.W0 || (((f7Var = this.T0) != null && this.S0 == f7Var) || I() == null || this.o1))) {
            this.a1 = -9223372036854775807L;
            return true;
        }
        if (this.a1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.a1) {
            return true;
        }
        this.a1 = -9223372036854775807L;
        return false;
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.d2
    protected void x() {
        super.x();
        this.c1 = 0;
        this.b1 = SystemClock.elapsedRealtime();
        this.g1 = SystemClock.elapsedRealtime() * 1000;
        this.h1 = 0L;
        this.i1 = 0;
        this.K0.e();
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.d2
    protected void y() {
        this.a1 = -9223372036854775807L;
        g0();
        i0();
        this.K0.f();
        super.y();
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.d2
    protected void v() {
        d0();
        c0();
        this.U0 = false;
        this.K0.b();
        this.q1 = null;
        try {
            super.v();
        } finally {
            this.L0.a(this.E0);
        }
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.d2
    protected void w() {
        try {
            super.w();
            f7 f7Var = this.T0;
            if (f7Var != null) {
                if (this.S0 == f7Var) {
                    this.S0 = null;
                }
                f7Var.release();
                this.T0 = null;
            }
        } catch (Throwable th) {
            if (this.T0 != null) {
                Surface surface = this.S0;
                f7 f7Var2 = this.T0;
                if (surface == f7Var2) {
                    this.S0 = null;
                }
                f7Var2.release();
                this.T0 = null;
            }
            throw th;
        }
    }

    public kd(Context context, hd hdVar, long j, boolean z, Handler handler, xq xqVar, int i) {
        this(context, cd.b.f329a, hdVar, j, z, handler, xqVar, i);
    }

    @Override // com.applovin.impl.gd
    protected boolean K() {
        return this.o1 && yp.f1214a < 23;
    }

    @Override // com.applovin.impl.gd
    protected void W() {
        super.W();
        this.e1 = 0;
    }

    @Override // com.applovin.impl.gd
    protected void g(String str) {
        this.L0.a(str);
    }

    @Override // com.applovin.impl.gd
    protected o5 a(fd fdVar, d9 d9Var, d9 d9Var2) {
        o5 o5VarA = fdVar.a(d9Var, d9Var2);
        int i = o5VarA.e;
        int i2 = d9Var2.r;
        a aVar = this.P0;
        if (i2 > aVar.f596a || d9Var2.s > aVar.b) {
            i |= 256;
        }
        if (c(fdVar, d9Var2) > this.P0.c) {
            i |= 64;
        }
        int i3 = i;
        return new o5(fdVar.f425a, d9Var, d9Var2, i3 != 0 ? 0 : o5VarA.d, i3);
    }

    protected void i(long j) {
        f(j);
        j0();
        this.E0.e++;
        h0();
        d(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        a0();
    }

    @Override // com.applovin.impl.gd
    protected void Q() {
        super.Q();
        c0();
    }

    protected void f(int i) {
        l5 l5Var = this.E0;
        l5Var.g += i;
        this.c1 += i;
        int i2 = this.d1 + i;
        this.d1 = i2;
        l5Var.h = Math.max(i2, l5Var.h);
        int i3 = this.N0;
        if (i3 <= 0 || this.c1 < i3) {
            return;
        }
        g0();
    }

    protected void j(long j) {
        this.E0.a(j);
        this.h1 += j;
        this.i1++;
    }

    private void n0() {
        this.a1 = this.M0 > 0 ? SystemClock.elapsedRealtime() + this.M0 : -9223372036854775807L;
    }

    private void c0() {
        cd cdVarI;
        this.W0 = false;
        if (yp.f1214a < 23 || !this.o1 || (cdVarI = I()) == null) {
            return;
        }
        this.q1 = new b(cdVarI);
    }

    void h0() {
        this.Y0 = true;
        if (this.W0) {
            return;
        }
        this.W0 = true;
        this.L0.a(this.S0);
        this.U0 = true;
    }

    private void k0() {
        if (this.U0) {
            this.L0.a(this.S0);
        }
    }

    private void d0() {
        this.n1 = null;
    }

    private void j0() {
        int i = this.j1;
        if (i == -1 && this.k1 == -1) {
            return;
        }
        yq yqVar = this.n1;
        if (yqVar != null && yqVar.f1215a == i && yqVar.b == this.k1 && yqVar.c == this.l1 && yqVar.d == this.m1) {
            return;
        }
        yq yqVar2 = new yq(this.j1, this.k1, this.l1, this.m1);
        this.n1 = yqVar2;
        this.L0.b(yqVar2);
    }

    private void l0() {
        yq yqVar = this.n1;
        if (yqVar != null) {
            this.L0.b(yqVar);
        }
    }

    private void g0() {
        if (this.c1 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.L0.a(this.c1, jElapsedRealtime - this.b1);
            this.c1 = 0;
            this.b1 = jElapsedRealtime;
        }
    }

    private void i0() {
        int i = this.i1;
        if (i != 0) {
            this.L0.b(this.h1, i);
            this.h1 = 0L;
            this.i1 = 0;
        }
    }

    private static Point b(fd fdVar, d9 d9Var) {
        int i = d9Var.s;
        int i2 = d9Var.r;
        boolean z = i > i2;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        float f = i / i3;
        for (int i4 : s1) {
            int i5 = (int) (i4 * f);
            if (i4 <= i3 || i5 <= i) {
                break;
            }
            if (yp.f1214a >= 21) {
                int i6 = z ? i5 : i4;
                if (!z) {
                    i4 = i5;
                }
                Point pointA = fdVar.a(i6, i4);
                if (fdVar.a(pointA.x, pointA.y, d9Var.t)) {
                    return pointA;
                }
            } else {
                try {
                    int iA = yp.a(i4, 16) * 16;
                    int iA2 = yp.a(i5, 16) * 16;
                    if (iA * iA2 <= id.b()) {
                        int i7 = z ? iA2 : iA;
                        if (!z) {
                            iA = iA2;
                        }
                        return new Point(i7, iA);
                    }
                } catch (id.c unused) {
                }
            }
        }
        return null;
    }

    @Override // com.applovin.impl.gd
    protected void d(long j) {
        super.d(j);
        if (this.o1) {
            return;
        }
        this.e1--;
    }

    protected static int c(fd fdVar, d9 d9Var) {
        if (d9Var.n != -1) {
            int size = d9Var.o.size();
            int length = 0;
            for (int i = 0; i < size; i++) {
                length += ((byte[]) d9Var.o.get(i)).length;
            }
            return d9Var.n + length;
        }
        return a(fdVar, d9Var);
    }

    protected boolean h(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (kd.class) {
            if (!t1) {
                u1 = f0();
                t1 = true;
            }
        }
        return u1;
    }

    protected static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f596a;
        public final int b;
        public final int c;

        public a(int i, int i2, int i3) {
            this.f596a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    private final class b implements cd.c, Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f597a;

        public b(cd cdVar) {
            Handler handlerA = yp.a((Handler.Callback) this);
            this.f597a = handlerA;
            cdVar.a(this, handlerA);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a(yp.c(message.arg1, message.arg2));
            return true;
        }

        private void a(long j) {
            kd kdVar = kd.this;
            if (this != kdVar.q1) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                kdVar.m0();
                return;
            }
            try {
                kdVar.i(j);
            } catch (y7 e) {
                kd.this.a(e);
            }
        }

        @Override // com.applovin.impl.cd.c
        public void a(cd cdVar, long j, long j2) {
            if (yp.f1214a < 30) {
                this.f597a.sendMessageAtFrontOfQueue(Message.obtain(this.f597a, 0, (int) (j >> 32), (int) j));
            } else {
                a(j);
            }
        }
    }

    private static void a(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    protected boolean d(long j, long j2) {
        return g(j) && j2 > 100000;
    }

    protected void c(cd cdVar, int i, long j) {
        lo.a("skipVideoBuffer");
        cdVar.a(i, false);
        lo.a();
        this.E0.f++;
    }

    protected boolean b(long j, boolean z) throws y7 {
        int iB = b(j);
        if (iB == 0) {
            return false;
        }
        l5 l5Var = this.E0;
        l5Var.i++;
        int i = this.e1 + iB;
        if (z) {
            l5Var.f += i;
        } else {
            f(i);
        }
        G();
        return true;
    }

    private boolean c(fd fdVar) {
        return yp.f1214a >= 23 && !this.o1 && !h(fdVar.f425a) && (!fdVar.g || f7.b(this.J0));
    }

    protected void a(cd cdVar, int i, long j) {
        lo.a("dropVideoBuffer");
        cdVar.a(i, false);
        lo.a();
        f(1);
    }

    @Override // com.applovin.impl.gd
    protected void b(n5 n5Var) {
        boolean z = this.o1;
        if (!z) {
            this.e1++;
        }
        if (yp.f1214a >= 23 || !z) {
            return;
        }
        i(n5Var.f);
    }

    protected void b(cd cdVar, int i, long j) {
        j0();
        lo.a("releaseOutputBuffer");
        cdVar.a(i, true);
        lo.a();
        this.g1 = SystemClock.elapsedRealtime() * 1000;
        this.E0.e++;
        this.d1 = 0;
        h0();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(com.applovin.impl.fd r10, com.applovin.impl.d9 r11) {
        /*
            int r0 = r11.r
            int r1 = r11.s
            r2 = -1
            if (r0 == r2) goto Lc6
            if (r1 != r2) goto Lb
            goto Lc6
        Lb:
            java.lang.String r3 = r11.m
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            r6 = 1
            java.lang.String r7 = "video/hevc"
            r8 = 2
            if (r4 == 0) goto L34
            android.util.Pair r11 = com.applovin.impl.id.a(r11)
            if (r11 == 0) goto L33
            java.lang.Object r11 = r11.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r3 = 512(0x200, float:7.175E-43)
            if (r11 == r3) goto L31
            if (r11 == r6) goto L31
            if (r11 != r8) goto L33
        L31:
            r3 = r5
            goto L34
        L33:
            r3 = r7
        L34:
            r3.hashCode()
            r3.hashCode()
            int r11 = r3.hashCode()
            r4 = 4
            r9 = 3
            switch(r11) {
                case -1664118616: goto L76;
                case -1662541442: goto L6f;
                case 1187890754: goto L64;
                case 1331836730: goto L5b;
                case 1599127256: goto L50;
                case 1599127257: goto L45;
                default: goto L43;
            }
        L43:
            r6 = r2
            goto L80
        L45:
            java.lang.String r11 = "video/x-vnd.on2.vp9"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L4e
            goto L43
        L4e:
            r6 = 5
            goto L80
        L50:
            java.lang.String r11 = "video/x-vnd.on2.vp8"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L59
            goto L43
        L59:
            r6 = r4
            goto L80
        L5b:
            boolean r11 = r3.equals(r5)
            if (r11 != 0) goto L62
            goto L43
        L62:
            r6 = r9
            goto L80
        L64:
            java.lang.String r11 = "video/mp4v-es"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L6d
            goto L43
        L6d:
            r6 = r8
            goto L80
        L6f:
            boolean r11 = r3.equals(r7)
            if (r11 != 0) goto L80
            goto L43
        L76:
            java.lang.String r11 = "video/3gpp"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L7f
            goto L43
        L7f:
            r6 = 0
        L80:
            switch(r6) {
                case 0: goto Lbf;
                case 1: goto Lbc;
                case 2: goto Lbf;
                case 3: goto L84;
                case 4: goto Lbf;
                case 5: goto Lbc;
                default: goto L83;
            }
        L83:
            return r2
        L84:
            java.lang.String r11 = com.applovin.impl.yp.d
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto Lbb
            java.lang.String r3 = com.applovin.impl.yp.c
            java.lang.String r4 = "Amazon"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto Lad
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto Lbb
            java.lang.String r3 = "AFTS"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto Lad
            boolean r10 = r10.g
            if (r10 == 0) goto Lad
            goto Lbb
        Lad:
            r10 = 16
            int r11 = com.applovin.impl.yp.a(r0, r10)
            int r10 = com.applovin.impl.yp.a(r1, r10)
            int r11 = r11 * r10
            int r11 = r11 * 256
            goto Lc1
        Lbb:
            return r2
        Lbc:
            int r11 = r0 * r1
            goto Lc2
        Lbf:
            int r11 = r0 * r1
        Lc1:
            r4 = r8
        Lc2:
            int r11 = r11 * r9
            int r4 = r4 * r8
            int r11 = r11 / r4
            return r11
        Lc6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.kd.a(com.applovin.impl.fd, com.applovin.impl.d9):int");
    }

    protected boolean b(long j, long j2, boolean z) {
        return g(j) && !z;
    }

    @Override // com.applovin.impl.gd
    protected boolean b(fd fdVar) {
        return this.S0 != null || c(fdVar);
    }

    protected a a(fd fdVar, d9 d9Var, d9[] d9VarArr) {
        int iA;
        int iMax = d9Var.r;
        int iMax2 = d9Var.s;
        int iC = c(fdVar, d9Var);
        if (d9VarArr.length == 1) {
            if (iC != -1 && (iA = a(fdVar, d9Var)) != -1) {
                iC = Math.min((int) (iC * 1.5f), iA);
            }
            return new a(iMax, iMax2, iC);
        }
        int length = d9VarArr.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            d9 d9VarA = d9VarArr[i];
            if (d9Var.y != null && d9VarA.y == null) {
                d9VarA = d9VarA.a().a(d9Var.y).a();
            }
            if (fdVar.a(d9Var, d9VarA).d != 0) {
                int i2 = d9VarA.r;
                z |= i2 == -1 || d9VarA.s == -1;
                iMax = Math.max(iMax, i2);
                iMax2 = Math.max(iMax2, d9VarA.s);
                iC = Math.max(iC, c(fdVar, d9VarA));
            }
        }
        if (z) {
            kc.d("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point pointB = b(fdVar, d9Var);
            if (pointB != null) {
                iMax = Math.max(iMax, pointB.x);
                iMax2 = Math.max(iMax2, pointB.y);
                iC = Math.max(iC, a(fdVar, d9Var.a().q(iMax).g(iMax2).a()));
                kc.d("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new a(iMax, iMax2, iC);
    }

    @Override // com.applovin.impl.gd
    protected float a(float f, d9 d9Var, d9[] d9VarArr) {
        float fMax = -1.0f;
        for (d9 d9Var2 : d9VarArr) {
            float f2 = d9Var2.t;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // com.applovin.impl.gd
    protected List a(hd hdVar, d9 d9Var, boolean z) {
        return a(hdVar, d9Var, z, this.o1);
    }

    private static List a(hd hdVar, d9 d9Var, boolean z, boolean z2) {
        Pair pairA;
        String str = d9Var.m;
        if (str == null) {
            return Collections.emptyList();
        }
        List listA = id.a(hdVar.a(str, z, z2), d9Var);
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(str) && (pairA = id.a(d9Var)) != null) {
            int iIntValue = ((Integer) pairA.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                listA.addAll(hdVar.a("video/hevc", z, z2));
            } else if (iIntValue == 512) {
                listA.addAll(hdVar.a("video/avc", z, z2));
            }
        }
        return Collections.unmodifiableList(listA);
    }

    @Override // com.applovin.impl.gd
    protected cd.a a(fd fdVar, d9 d9Var, MediaCrypto mediaCrypto, float f) {
        f7 f7Var = this.T0;
        if (f7Var != null && f7Var.f414a != fdVar.g) {
            f7Var.release();
            this.T0 = null;
        }
        String str = fdVar.c;
        a aVarA = a(fdVar, d9Var, t());
        this.P0 = aVarA;
        MediaFormat mediaFormatA = a(d9Var, str, aVarA, f, this.O0, this.o1 ? this.p1 : 0);
        if (this.S0 == null) {
            if (c(fdVar)) {
                if (this.T0 == null) {
                    this.T0 = f7.a(this.J0, fdVar.g);
                }
                this.S0 = this.T0;
            } else {
                throw new IllegalStateException();
            }
        }
        return cd.a.a(fdVar, mediaFormatA, d9Var, this.S0, mediaCrypto);
    }

    protected MediaFormat a(d9 d9Var, String str, a aVar, float f, boolean z, int i) {
        Pair pairA;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", d9Var.r);
        mediaFormat.setInteger("height", d9Var.s);
        nd.a(mediaFormat, d9Var.o);
        nd.a(mediaFormat, "frame-rate", d9Var.t);
        nd.a(mediaFormat, "rotation-degrees", d9Var.u);
        nd.a(mediaFormat, d9Var.y);
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(d9Var.m) && (pairA = id.a(d9Var)) != null) {
            nd.a(mediaFormat, Scopes.PROFILE, ((Integer) pairA.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f596a);
        mediaFormat.setInteger("max-height", aVar.b);
        nd.a(mediaFormat, "max-input-size", aVar.c);
        if (yp.f1214a >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            a(mediaFormat, i);
        }
        return mediaFormat;
    }

    @Override // com.applovin.impl.gd
    protected void a(n5 n5Var) {
        if (this.R0) {
            ByteBuffer byteBuffer = (ByteBuffer) a1.a(n5Var.g);
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s == 60 && s2 == 1 && b3 == 4 && b4 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    a(I(), bArr);
                }
            }
        }
    }

    @Override // com.applovin.impl.d2, com.applovin.impl.oh.b
    public void a(int i, Object obj) throws y7 {
        if (i == 1) {
            a(obj);
            return;
        }
        if (i == 7) {
            this.r1 = (vq) obj;
            return;
        }
        if (i == 10) {
            int iIntValue = ((Integer) obj).intValue();
            if (this.p1 != iIntValue) {
                this.p1 = iIntValue;
                if (this.o1) {
                    U();
                    return;
                }
                return;
            }
            return;
        }
        if (i != 4) {
            if (i != 5) {
                super.a(i, obj);
                return;
            } else {
                this.K0.a(((Integer) obj).intValue());
                return;
            }
        }
        this.V0 = ((Integer) obj).intValue();
        cd cdVarI = I();
        if (cdVarI != null) {
            cdVarI.c(this.V0);
        }
    }

    private void a(long j, long j2, d9 d9Var) {
        vq vqVar = this.r1;
        if (vqVar != null) {
            vqVar.a(j, j2, d9Var, L());
        }
    }

    @Override // com.applovin.impl.gd
    protected void a(Exception exc) {
        kc.a("MediaCodecVideoRenderer", "Video codec error", exc);
        this.L0.b(exc);
    }

    @Override // com.applovin.impl.gd
    protected void a(String str, long j, long j2) {
        this.L0.a(str, j, j2);
        this.Q0 = h(str);
        this.R0 = ((fd) a1.a(J())).b();
        if (yp.f1214a < 23 || !this.o1) {
            return;
        }
        this.q1 = new b((cd) a1.a(I()));
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.d2
    protected void a(boolean z, boolean z2) {
        super.a(z, z2);
        boolean z3 = q().f722a;
        a1.b((z3 && this.p1 == 0) ? false : true);
        if (this.o1 != z3) {
            this.o1 = z3;
            U();
        }
        this.L0.b(this.E0);
        this.K0.c();
        this.X0 = z2;
        this.Y0 = false;
    }

    @Override // com.applovin.impl.gd
    protected o5 a(e9 e9Var) throws y7 {
        o5 o5VarA = super.a(e9Var);
        this.L0.a(e9Var.b, o5VarA);
        return o5VarA;
    }

    @Override // com.applovin.impl.gd
    protected void a(d9 d9Var, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        cd cdVarI = I();
        if (cdVarI != null) {
            cdVarI.c(this.V0);
        }
        if (this.o1) {
            this.j1 = d9Var.r;
            this.k1 = d9Var.s;
        } else {
            a1.a(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.j1 = integer;
            if (z) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.k1 = integer2;
        }
        float f = d9Var.v;
        this.m1 = f;
        if (yp.f1214a >= 21) {
            int i = d9Var.u;
            if (i == 90 || i == 270) {
                int i2 = this.j1;
                this.j1 = this.k1;
                this.k1 = i2;
                this.m1 = 1.0f / f;
            }
        } else {
            this.l1 = d9Var.u;
        }
        this.K0.a(d9Var.t);
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.d2
    protected void a(long j, boolean z) throws y7 {
        super.a(j, z);
        c0();
        this.K0.d();
        this.f1 = -9223372036854775807L;
        this.Z0 = -9223372036854775807L;
        this.d1 = 0;
        if (z) {
            n0();
        } else {
            this.a1 = -9223372036854775807L;
        }
    }

    @Override // com.applovin.impl.gd
    protected boolean a(long j, long j2, cd cdVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, d9 d9Var) throws InterruptedException {
        boolean z3;
        long j4;
        a1.a(cdVar);
        if (this.Z0 == -9223372036854775807L) {
            this.Z0 = j;
        }
        if (j3 != this.f1) {
            this.K0.b(j3);
            this.f1 = j3;
        }
        long jM = M();
        long j5 = j3 - jM;
        if (z && !z2) {
            c(cdVar, i, j5);
            return true;
        }
        double dN = N();
        boolean z4 = b() == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j6 = (long) ((j3 - j) / dN);
        if (z4) {
            j6 -= jElapsedRealtime - j2;
        }
        if (this.S0 == this.T0) {
            if (!g(j6)) {
                return false;
            }
            c(cdVar, i, j5);
            j(j6);
            return true;
        }
        long j7 = jElapsedRealtime - this.g1;
        if (this.Y0 ? this.W0 : !(z4 || this.X0)) {
            j4 = j7;
            z3 = false;
        } else {
            z3 = true;
            j4 = j7;
        }
        if (this.a1 == -9223372036854775807L && j >= jM && (z3 || (z4 && d(j6, j4)))) {
            long jNanoTime = System.nanoTime();
            a(j5, jNanoTime, d9Var);
            if (yp.f1214a >= 21) {
                a(cdVar, i, j5, jNanoTime);
            } else {
                b(cdVar, i, j5);
            }
            j(j6);
            return true;
        }
        if (z4 && j != this.Z0) {
            long jNanoTime2 = System.nanoTime();
            long jA = this.K0.a((j6 * 1000) + jNanoTime2);
            long j8 = (jA - jNanoTime2) / 1000;
            boolean z5 = this.a1 != -9223372036854775807L;
            if (a(j8, j2, z2) && b(j, z5)) {
                return false;
            }
            if (b(j8, j2, z2)) {
                if (z5) {
                    c(cdVar, i, j5);
                } else {
                    a(cdVar, i, j5);
                }
                j(j8);
                return true;
            }
            if (yp.f1214a >= 21) {
                if (j8 < 50000) {
                    a(j5, jA, d9Var);
                    a(cdVar, i, j5, jA);
                    j(j8);
                    return true;
                }
            } else if (j8 < 30000) {
                if (j8 > 11000) {
                    try {
                        Thread.sleep((j8 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                a(j5, jA, d9Var);
                b(cdVar, i, j5);
                j(j8);
                return true;
            }
        }
        return false;
    }

    protected void a(cd cdVar, int i, long j, long j2) {
        j0();
        lo.a("releaseOutputBuffer");
        cdVar.a(i, j2);
        lo.a();
        this.g1 = SystemClock.elapsedRealtime() * 1000;
        this.E0.e++;
        this.d1 = 0;
        h0();
    }

    private static void a(cd cdVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        cdVar.a(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.applovin.impl.d2, com.applovin.impl.gd, com.applovin.impl.kd] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.Surface] */
    private void a(Object obj) throws y7 {
        f7 f7VarA = obj instanceof Surface ? (Surface) obj : null;
        if (f7VarA == null) {
            f7 f7Var = this.T0;
            if (f7Var != null) {
                f7VarA = f7Var;
            } else {
                fd fdVarJ = J();
                if (fdVarJ != null && c(fdVarJ)) {
                    f7VarA = f7.a(this.J0, fdVarJ.g);
                    this.T0 = f7VarA;
                }
            }
        }
        if (this.S0 != f7VarA) {
            this.S0 = f7VarA;
            this.K0.a(f7VarA);
            this.U0 = false;
            int iB = b();
            cd cdVarI = I();
            if (cdVarI != null) {
                if (yp.f1214a >= 23 && f7VarA != null && !this.Q0) {
                    a(cdVarI, f7VarA);
                } else {
                    U();
                    P();
                }
            }
            if (f7VarA != null && f7VarA != this.T0) {
                l0();
                c0();
                if (iB == 2) {
                    n0();
                    return;
                }
                return;
            }
            d0();
            c0();
            return;
        }
        if (f7VarA == null || f7VarA == this.T0) {
            return;
        }
        l0();
        k0();
    }

    protected void a(cd cdVar, Surface surface) {
        cdVar.a(surface);
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.d2, com.applovin.impl.li
    public void a(float f, float f2) throws y7 {
        super.a(f, f2);
        this.K0.b(f);
    }

    protected boolean a(long j, long j2, boolean z) {
        return h(j) && !z;
    }

    @Override // com.applovin.impl.gd
    protected int a(hd hdVar, d9 d9Var) {
        int i = 0;
        if (!df.i(d9Var.m)) {
            return mi.CC.a(0);
        }
        boolean z = d9Var.p != null;
        List listA = a(hdVar, d9Var, z, false);
        if (z && listA.isEmpty()) {
            listA = a(hdVar, d9Var, false, false);
        }
        if (listA.isEmpty()) {
            return mi.CC.a(1);
        }
        if (!gd.d(d9Var)) {
            return mi.CC.a(2);
        }
        fd fdVar = (fd) listA.get(0);
        boolean zB = fdVar.b(d9Var);
        int i2 = fdVar.c(d9Var) ? 16 : 8;
        if (zB) {
            List listA2 = a(hdVar, d9Var, z, true);
            if (!listA2.isEmpty()) {
                fd fdVar2 = (fd) listA2.get(0);
                if (fdVar2.b(d9Var) && fdVar2.c(d9Var)) {
                    i = 32;
                }
            }
        }
        return mi.CC.a(zB ? 4 : 3, i2, i);
    }

    @Override // com.applovin.impl.gd
    protected ed a(Throwable th, fd fdVar) {
        return new jd(th, fdVar, this.S0);
    }
}
