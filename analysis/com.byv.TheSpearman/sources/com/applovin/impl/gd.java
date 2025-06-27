package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.applovin.impl.cd;
import com.applovin.impl.f1;
import com.applovin.impl.id;
import com.applovin.impl.n5;
import com.applovin.impl.x6;
import com.google.android.exoplayer2.PlaybackException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class gd extends d2 {
    private static final byte[] I0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private final long[] A;
    private boolean A0;
    private d9 B;
    private boolean B0;
    private d9 C;
    private boolean C0;
    private x6 D;
    private y7 D0;
    private x6 E;
    protected l5 E0;
    private MediaCrypto F;
    private long F0;
    private boolean G;
    private long G0;
    private long H;
    private int H0;
    private float I;
    private float J;
    private cd K;
    private d9 L;
    private MediaFormat M;
    private boolean N;
    private float O;
    private ArrayDeque P;
    private a Q;
    private fd R;
    private int S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private boolean a0;
    private boolean b0;
    private boolean c0;
    private q2 d0;
    private long e0;
    private int f0;
    private int g0;
    private ByteBuffer h0;
    private boolean i0;
    private boolean j0;
    private boolean k0;
    private boolean l0;
    private boolean m0;
    private final cd.b n;
    private boolean n0;
    private final hd o;
    private int o0;
    private final boolean p;
    private int p0;
    private final float q;
    private int q0;
    private final n5 r;
    private boolean r0;
    private final n5 s;
    private boolean s0;
    private final n5 t;
    private boolean t0;
    private final f2 u;
    private long u0;
    private final fo v;
    private long v0;
    private final ArrayList w;
    private boolean w0;
    private final MediaCodec.BufferInfo x;
    private boolean x0;
    private final long[] y;
    private boolean y0;
    private final long[] z;
    private boolean z0;

    protected boolean K() {
        return false;
    }

    protected void Q() {
    }

    protected void V() {
    }

    protected abstract float a(float f, d9 d9Var, d9[] d9VarArr);

    protected abstract int a(hd hdVar, d9 d9Var);

    protected abstract cd.a a(fd fdVar, d9 d9Var, MediaCrypto mediaCrypto, float f);

    protected abstract o5 a(fd fdVar, d9 d9Var, d9 d9Var2);

    protected abstract List a(hd hdVar, d9 d9Var, boolean z);

    protected abstract void a(d9 d9Var, MediaFormat mediaFormat);

    protected void a(n5 n5Var) {
    }

    protected abstract void a(Exception exc);

    protected abstract void a(String str, long j, long j2);

    protected abstract boolean a(long j, long j2, cd cdVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, d9 d9Var);

    protected abstract void b(n5 n5Var);

    protected boolean b(fd fdVar) {
        return true;
    }

    protected boolean c(d9 d9Var) {
        return false;
    }

    protected abstract void g(String str);

    @Override // com.applovin.impl.d2, com.applovin.impl.mi
    public final int m() {
        return 8;
    }

    @Override // com.applovin.impl.d2
    protected void x() {
    }

    @Override // com.applovin.impl.d2
    protected void y() {
    }

    public static class a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final String f455a;
        public final boolean b;
        public final fd c;
        public final String d;
        public final a f;

        public a(d9 d9Var, Throwable th, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + d9Var, th, d9Var.m, z, null, a(i), null);
        }

        public a(d9 d9Var, Throwable th, boolean z, fd fdVar) {
            this("Decoder init failed: " + fdVar.f425a + ", " + d9Var, th, d9Var.m, z, fdVar, yp.f1214a >= 21 ? a(th) : null, null);
        }

        private static String a(int i) {
            return "com.applovin.exoplayer2.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i);
        }

        private a(String str, Throwable th, String str2, boolean z, fd fdVar, String str3, a aVar) {
            super(str, th);
            this.f455a = str2;
            this.b = z;
            this.c = fdVar;
            this.d = str3;
            this.f = aVar;
        }

        private static String a(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a a(a aVar) {
            return new a(getMessage(), getCause(), this.f455a, this.b, this.c, this.d, aVar);
        }
    }

    public gd(int i, cd.b bVar, hd hdVar, boolean z, float f) {
        super(i);
        this.n = bVar;
        this.o = (hd) a1.a(hdVar);
        this.p = z;
        this.q = f;
        this.r = n5.i();
        this.s = new n5(0);
        this.t = new n5(2);
        f2 f2Var = new f2();
        this.u = f2Var;
        this.v = new fo();
        this.w = new ArrayList();
        this.x = new MediaCodec.BufferInfo();
        this.I = 1.0f;
        this.J = 1.0f;
        this.H = -9223372036854775807L;
        this.y = new long[10];
        this.z = new long[10];
        this.A = new long[10];
        this.F0 = -9223372036854775807L;
        this.G0 = -9223372036854775807L;
        f2Var.g(0);
        f2Var.c.order(ByteOrder.nativeOrder());
        this.O = -1.0f;
        this.S = 0;
        this.o0 = 0;
        this.f0 = -1;
        this.g0 = -1;
        this.e0 = -9223372036854775807L;
        this.u0 = -9223372036854775807L;
        this.v0 = -9223372036854775807L;
        this.p0 = 0;
        this.q0 = 0;
    }

    protected final void P() throws y7 {
        d9 d9Var;
        if (this.K != null || this.k0 || (d9Var = this.B) == null) {
            return;
        }
        if (this.E == null && c(d9Var)) {
            b(this.B);
            return;
        }
        b(this.E);
        String str = this.B.m;
        x6 x6Var = this.D;
        if (x6Var != null) {
            if (this.F == null) {
                j9 j9VarA = a(x6Var);
                if (j9VarA == null) {
                    if (this.D.getError() == null) {
                        return;
                    }
                } else {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(j9VarA.f564a, j9VarA.b);
                        this.F = mediaCrypto;
                        this.G = !j9VarA.c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e) {
                        throw a(e, this.B, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
                    }
                }
            }
            if (j9.d) {
                int iB = this.D.b();
                if (iB == 1) {
                    x6.a aVar = (x6.a) a1.a(this.D.getError());
                    throw a(aVar, this.B, aVar.f1159a);
                }
                if (iB != 4) {
                    return;
                }
            }
        }
        try {
            a(this.F, this.G);
        } catch (a e2) {
            throw a(e2, this.B, 4001);
        }
    }

    protected final void f(long j) {
        d9 d9Var = (d9) this.v.c(j);
        if (d9Var == null && this.N) {
            d9Var = (d9) this.v.c();
        }
        if (d9Var != null) {
            this.C = d9Var;
        } else if (!this.N || this.C == null) {
            return;
        }
        a(this.C, this.M);
        this.N = false;
    }

    private static boolean f(String str) {
        return yp.f1214a == 29 && "c2.android.aac.decoder".equals(str);
    }

    protected final cd I() {
        return this.K;
    }

    protected final MediaFormat L() {
        return this.M;
    }

    protected final fd J() {
        return this.R;
    }

    @Override // com.applovin.impl.d2
    protected void v() {
        this.B = null;
        this.F0 = -9223372036854775807L;
        this.G0 = -9223372036854775807L;
        this.H0 = 0;
        H();
    }

    @Override // com.applovin.impl.d2
    protected void w() {
        try {
            A();
            U();
        } finally {
            c((x6) null);
        }
    }

    private void A() {
        this.m0 = false;
        this.u.b();
        this.t.b();
        this.l0 = false;
        this.k0 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void U() {
        try {
            cd cdVar = this.K;
            if (cdVar != null) {
                cdVar.a();
                this.E0.b++;
                g(this.R.f425a);
            }
            this.K = null;
            try {
                MediaCrypto mediaCrypto = this.F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.K = null;
            try {
                MediaCrypto mediaCrypto2 = this.F;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    protected final boolean G() throws y7 {
        boolean zH = H();
        if (zH) {
            P();
        }
        return zH;
    }

    protected boolean H() {
        if (this.K == null) {
            return false;
        }
        if (this.q0 != 3 && !this.U && ((!this.V || this.t0) && (!this.W || !this.s0))) {
            F();
            return false;
        }
        U();
        return true;
    }

    private void F() {
        try {
            this.K.b();
        } finally {
            W();
        }
    }

    protected void W() {
        Y();
        Z();
        this.e0 = -9223372036854775807L;
        this.s0 = false;
        this.r0 = false;
        this.a0 = false;
        this.b0 = false;
        this.i0 = false;
        this.j0 = false;
        this.w.clear();
        this.u0 = -9223372036854775807L;
        this.v0 = -9223372036854775807L;
        q2 q2Var = this.d0;
        if (q2Var != null) {
            q2Var.a();
        }
        this.p0 = 0;
        this.q0 = 0;
        this.o0 = this.n0 ? 1 : 0;
    }

    protected void X() {
        W();
        this.D0 = null;
        this.d0 = null;
        this.P = null;
        this.R = null;
        this.L = null;
        this.M = null;
        this.N = false;
        this.t0 = false;
        this.O = -1.0f;
        this.S = 0;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.c0 = false;
        this.n0 = false;
        this.o0 = 0;
        this.G = false;
    }

    private boolean e(int i) throws MediaCryptoException, y7 {
        e9 e9VarR = r();
        this.r.b();
        int iA = a(e9VarR, this.r, i | 4);
        if (iA == -5) {
            a(e9VarR);
            return true;
        }
        if (iA != -4 || !this.r.e()) {
            return false;
        }
        this.w0 = true;
        R();
        return false;
    }

    private List d(boolean z) {
        List listA = a(this.o, this.B, z);
        if (listA.isEmpty() && z) {
            listA = a(this.o, this.B, false);
            if (!listA.isEmpty()) {
                kc.d("MediaCodecRenderer", "Drm session requires secure decoder for " + this.B.m + ", but no secure decoder available. Trying to proceed with " + listA + ".");
            }
        }
        return listA;
    }

    private boolean O() {
        return this.g0 >= 0;
    }

    private void Y() {
        this.f0 = -1;
        this.s.c = null;
    }

    private void Z() {
        this.g0 = -1;
        this.h0 = null;
    }

    private boolean E() throws MediaCryptoException, y7 {
        cd cdVar = this.K;
        if (cdVar == null || this.p0 == 2 || this.w0) {
            return false;
        }
        if (this.f0 < 0) {
            int iD = cdVar.d();
            this.f0 = iD;
            if (iD < 0) {
                return false;
            }
            this.s.c = this.K.a(iD);
            this.s.b();
        }
        if (this.p0 == 1) {
            if (!this.c0) {
                this.s0 = true;
                this.K.a(this.f0, 0, 0, 0L, 4);
                Y();
            }
            this.p0 = 2;
            return false;
        }
        if (this.a0) {
            this.a0 = false;
            ByteBuffer byteBuffer = this.s.c;
            byte[] bArr = I0;
            byteBuffer.put(bArr);
            this.K.a(this.f0, 0, bArr.length, 0L, 0);
            Y();
            this.r0 = true;
            return true;
        }
        if (this.o0 == 1) {
            for (int i = 0; i < this.L.o.size(); i++) {
                this.s.c.put((byte[]) this.L.o.get(i));
            }
            this.o0 = 2;
        }
        int iPosition = this.s.c.position();
        e9 e9VarR = r();
        try {
            int iA = a(e9VarR, this.s, 0);
            if (j()) {
                this.v0 = this.u0;
            }
            if (iA == -3) {
                return false;
            }
            if (iA == -5) {
                if (this.o0 == 2) {
                    this.s.b();
                    this.o0 = 1;
                }
                a(e9VarR);
                return true;
            }
            if (this.s.e()) {
                if (this.o0 == 2) {
                    this.s.b();
                    this.o0 = 1;
                }
                this.w0 = true;
                if (!this.r0) {
                    R();
                    return false;
                }
                try {
                    if (!this.c0) {
                        this.s0 = true;
                        this.K.a(this.f0, 0, 0, 0L, 4);
                        Y();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw a(e, this.B, r2.a(e.getErrorCode()));
                }
            }
            if (!this.r0 && !this.s.f()) {
                this.s.b();
                if (this.o0 == 2) {
                    this.o0 = 1;
                }
                return true;
            }
            boolean zH = this.s.h();
            if (zH) {
                this.s.b.a(iPosition);
            }
            if (this.T && !zH) {
                uf.a(this.s.c);
                if (this.s.c.position() == 0) {
                    return true;
                }
                this.T = false;
            }
            n5 n5Var = this.s;
            long jA = n5Var.f;
            q2 q2Var = this.d0;
            if (q2Var != null) {
                jA = q2Var.a(this.B, n5Var);
                this.u0 = Math.max(this.u0, this.d0.a(this.B));
            }
            long j = jA;
            if (this.s.d()) {
                this.w.add(Long.valueOf(j));
            }
            if (this.y0) {
                this.v.a(j, this.B);
                this.y0 = false;
            }
            this.u0 = Math.max(this.u0, j);
            this.s.g();
            if (this.s.c()) {
                a(this.s);
            }
            b(this.s);
            try {
                if (zH) {
                    this.K.a(this.f0, 0, this.s.b, j, 0);
                } else {
                    this.K.a(this.f0, 0, this.s.c.limit(), j, 0);
                }
                Y();
                this.r0 = true;
                this.o0 = 0;
                this.E0.c++;
                return true;
            } catch (MediaCodec.CryptoException e2) {
                throw a(e2, this.B, r2.a(e2.getErrorCode()));
            }
        } catch (n5.a e3) {
            a(e3);
            e(0);
            F();
            return true;
        }
    }

    protected float N() {
        return this.I;
    }

    private boolean B() {
        if (this.r0) {
            this.p0 = 1;
            if (!this.U && !this.W) {
                this.q0 = 1;
            } else {
                this.q0 = 3;
                return false;
            }
        }
        return true;
    }

    private boolean D() throws MediaCryptoException, y7 {
        if (this.r0) {
            this.p0 = 1;
            if (!this.U && !this.W) {
                this.q0 = 2;
            } else {
                this.q0 = 3;
                return false;
            }
        } else {
            b0();
        }
        return true;
    }

    private void C() throws y7 {
        if (this.r0) {
            this.p0 = 1;
            this.q0 = 3;
        } else {
            T();
        }
    }

    private boolean c(long j, long j2) throws MediaCryptoException, y7 {
        boolean z;
        boolean zA;
        cd cdVar;
        ByteBuffer byteBuffer;
        int i;
        MediaCodec.BufferInfo bufferInfo;
        int iA;
        if (!O()) {
            if (this.X && this.s0) {
                try {
                    iA = this.K.a(this.x);
                } catch (IllegalStateException unused) {
                    R();
                    if (this.x0) {
                        U();
                    }
                    return false;
                }
            } else {
                iA = this.K.a(this.x);
            }
            if (iA < 0) {
                if (iA == -2) {
                    S();
                    return true;
                }
                if (this.c0 && (this.w0 || this.p0 == 2)) {
                    R();
                }
                return false;
            }
            if (this.b0) {
                this.b0 = false;
                this.K.a(iA, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo2 = this.x;
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                R();
                return false;
            }
            this.g0 = iA;
            ByteBuffer byteBufferB = this.K.b(iA);
            this.h0 = byteBufferB;
            if (byteBufferB != null) {
                byteBufferB.position(this.x.offset);
                ByteBuffer byteBuffer2 = this.h0;
                MediaCodec.BufferInfo bufferInfo3 = this.x;
                byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
            }
            if (this.Y) {
                MediaCodec.BufferInfo bufferInfo4 = this.x;
                if (bufferInfo4.presentationTimeUs == 0 && (bufferInfo4.flags & 4) != 0) {
                    long j3 = this.u0;
                    if (j3 != -9223372036854775807L) {
                        bufferInfo4.presentationTimeUs = j3;
                    }
                }
            }
            this.i0 = c(this.x.presentationTimeUs);
            long j4 = this.v0;
            long j5 = this.x.presentationTimeUs;
            this.j0 = j4 == j5;
            f(j5);
        }
        if (this.X && this.s0) {
            try {
                cdVar = this.K;
                byteBuffer = this.h0;
                i = this.g0;
                bufferInfo = this.x;
                z = false;
            } catch (IllegalStateException unused2) {
                z = false;
            }
            try {
                zA = a(j, j2, cdVar, byteBuffer, i, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.i0, this.j0, this.C);
            } catch (IllegalStateException unused3) {
                R();
                if (this.x0) {
                    U();
                }
                return z;
            }
        } else {
            z = false;
            cd cdVar2 = this.K;
            ByteBuffer byteBuffer3 = this.h0;
            int i2 = this.g0;
            MediaCodec.BufferInfo bufferInfo5 = this.x;
            zA = a(j, j2, cdVar2, byteBuffer3, i2, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.i0, this.j0, this.C);
        }
        if (zA) {
            d(this.x.presentationTimeUs);
            boolean z2 = (this.x.flags & 4) != 0 ? true : z;
            Z();
            if (!z2) {
                return true;
            }
            R();
        }
        return z;
    }

    private void S() {
        this.t0 = true;
        MediaFormat mediaFormatE = this.K.e();
        if (this.S != 0 && mediaFormatE.getInteger("width") == 32 && mediaFormatE.getInteger("height") == 32) {
            this.b0 = true;
            return;
        }
        if (this.Z) {
            mediaFormatE.setInteger("channel-count", 1);
        }
        this.M = mediaFormatE;
        this.N = true;
    }

    private void R() throws MediaCryptoException, y7 {
        int i = this.q0;
        if (i == 1) {
            F();
            return;
        }
        if (i == 2) {
            F();
            b0();
        } else if (i != 3) {
            this.x0 = true;
            V();
        } else {
            T();
        }
    }

    protected final void a0() {
        this.z0 = true;
    }

    protected final long M() {
        return this.G0;
    }

    private void T() throws y7 {
        U();
        P();
    }

    private void b0() throws MediaCryptoException, y7 {
        try {
            this.F.setMediaDrmSession(a(this.E).b);
            b(this.E);
            this.p0 = 0;
            this.q0 = 0;
        } catch (MediaCryptoException e) {
            throw a(e, this.B, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
        }
    }

    private boolean e(long j) {
        return this.H == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.H;
    }

    private boolean e(d9 d9Var) throws y7 {
        if (yp.f1214a >= 23 && this.K != null && this.q0 != 3 && b() != 0) {
            float fA = a(this.J, d9Var, t());
            float f = this.O;
            if (f == fA) {
                return true;
            }
            if (fA == -1.0f) {
                C();
                return false;
            }
            if (f == -1.0f && fA <= this.q) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fA);
            this.K.a(bundle);
            this.O = fA;
        }
        return true;
    }

    private static boolean e(String str) {
        int i = yp.f1214a;
        return i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i == 19 && yp.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private boolean b(long j, long j2) throws y7 {
        boolean z;
        a1.b(!this.x0);
        if (this.u.m()) {
            f2 f2Var = this.u;
            if (!a(j, j2, null, f2Var.c, this.g0, 0, f2Var.l(), this.u.j(), this.u.d(), this.u.e(), this.C)) {
                return false;
            }
            d(this.u.k());
            this.u.b();
            z = false;
        } else {
            z = false;
        }
        if (this.w0) {
            this.x0 = true;
            return z;
        }
        if (this.l0) {
            a1.b(this.u.a(this.t));
            this.l0 = z;
        }
        if (this.m0) {
            if (this.u.m()) {
                return true;
            }
            A();
            this.m0 = z;
            P();
            if (!this.k0) {
                return z;
            }
        }
        z();
        if (this.u.m()) {
            this.u.g();
        }
        if (this.u.m() || this.w0 || this.m0) {
            return true;
        }
        return z;
    }

    private void z() throws y7 {
        a1.b(!this.w0);
        e9 e9VarR = r();
        this.t.b();
        do {
            this.t.b();
            int iA = a(e9VarR, this.t, 0);
            if (iA == -5) {
                a(e9VarR);
                return;
            }
            if (iA != -4) {
                if (iA != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                if (this.t.e()) {
                    this.w0 = true;
                    return;
                }
                if (this.y0) {
                    d9 d9Var = (d9) a1.a(this.B);
                    this.C = d9Var;
                    a(d9Var, (MediaFormat) null);
                    this.y0 = false;
                }
                this.t.g();
            }
        } while (this.u.a(this.t));
        this.l0 = true;
    }

    public void c(boolean z) {
        this.C0 = z;
    }

    private static boolean a(fd fdVar) {
        String str = fdVar.f425a;
        int i = yp.f1214a;
        return (i <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(yp.c) && "AFTS".equals(yp.d) && fdVar.g));
    }

    public void b(boolean z) {
        this.B0 = z;
    }

    @Override // com.applovin.impl.li
    public boolean d() {
        return this.B != null && (u() || O() || (this.e0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.e0));
    }

    private void b(d9 d9Var) {
        A();
        String str = d9Var.m;
        if (!"audio/mp4a-latm".equals(str) && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
            this.u.i(1);
        } else {
            this.u.i(32);
        }
        this.k0 = true;
    }

    protected void d(long j) {
        while (true) {
            int i = this.H0;
            if (i == 0 || j < this.A[0]) {
                return;
            }
            long[] jArr = this.y;
            this.F0 = jArr[0];
            this.G0 = this.z[0];
            int i2 = i - 1;
            this.H0 = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.z;
            System.arraycopy(jArr2, 1, jArr2, 0, this.H0);
            long[] jArr3 = this.A;
            System.arraycopy(jArr3, 1, jArr3, 0, this.H0);
            Q();
        }
    }

    private boolean a(fd fdVar, d9 d9Var, x6 x6Var, x6 x6Var2) {
        j9 j9VarA;
        if (x6Var == x6Var2) {
            return false;
        }
        if (x6Var2 == null || x6Var == null || yp.f1214a < 23) {
            return true;
        }
        UUID uuid = r2.e;
        if (uuid.equals(x6Var.e()) || uuid.equals(x6Var2.e()) || (j9VarA = a(x6Var2)) == null) {
            return true;
        }
        return !fdVar.g && (j9VarA.c ? false : x6Var2.a(d9Var.m));
    }

    private boolean c(long j) {
        int size = this.w.size();
        for (int i = 0; i < size; i++) {
            if (((Long) this.w.get(i)).longValue() == j) {
                this.w.remove(i);
                return true;
            }
        }
        return false;
    }

    public void a(boolean z) {
        this.A0 = z;
    }

    private static boolean b(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    @Override // com.applovin.impl.li
    public boolean c() {
        return this.x0;
    }

    protected static boolean d(d9 d9Var) {
        int i = d9Var.F;
        return i == 0 || i == 2;
    }

    private static boolean d(String str) {
        return yp.f1214a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private j9 a(x6 x6Var) throws y7 {
        x4 x4VarF = x6Var.f();
        if (x4VarF != null && !(x4VarF instanceof j9)) {
            throw a(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + x4VarF), this.B, 6001);
        }
        return (j9) x4VarF;
    }

    private void b(x6 x6Var) {
        x6.CC.a(this.D, x6Var);
        this.D = x6Var;
    }

    private static boolean b(String str) {
        if (yp.f1214a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(yp.c)) {
            String str2 = yp.b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    private static boolean b(String str, d9 d9Var) {
        return yp.f1214a <= 18 && d9Var.z == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    private void a(fd fdVar, MediaCrypto mediaCrypto) throws Exception {
        cd cdVarA;
        String str = fdVar.f425a;
        int i = yp.f1214a;
        float fA = i < 23 ? -1.0f : a(this.J, this.B, t());
        float f = fA > this.q ? fA : -1.0f;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        lo.a("createCodec:" + str);
        cd.a aVarA = a(fdVar, this.B, mediaCrypto, f);
        if (this.A0 && i >= 23) {
            cdVarA = new f1.b(e(), this.B0, this.C0).a(aVarA);
        } else {
            cdVarA = this.n.a(aVarA);
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        this.K = cdVarA;
        this.R = fdVar;
        this.O = f;
        this.L = this.B;
        this.S = a(str);
        this.T = a(str, this.L);
        this.U = e(str);
        this.V = f(str);
        this.W = c(str);
        this.X = d(str);
        this.Y = b(str);
        this.Z = b(str, this.L);
        this.c0 = a(fdVar) || K();
        if (cdVarA.c()) {
            this.n0 = true;
            this.o0 = 1;
            this.a0 = this.S != 0;
        }
        if ("c2.android.mp3.decoder".equals(fdVar.f425a)) {
            this.d0 = new q2();
        }
        if (b() == 2) {
            this.e0 = SystemClock.elapsedRealtime() + 1000;
        }
        this.E0.f627a++;
        a(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
    }

    private static boolean c(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    private void a(MediaCrypto mediaCrypto, boolean z) throws a {
        if (this.P == null) {
            try {
                List listD = d(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.P = arrayDeque;
                if (this.p) {
                    arrayDeque.addAll(listD);
                } else if (!listD.isEmpty()) {
                    this.P.add((fd) listD.get(0));
                }
                this.Q = null;
            } catch (id.c e) {
                throw new a(this.B, e, z, -49998);
            }
        }
        if (!this.P.isEmpty()) {
            while (this.K == null) {
                fd fdVar = (fd) this.P.peekFirst();
                if (!b(fdVar)) {
                    return;
                }
                try {
                    a(fdVar, mediaCrypto);
                } catch (Exception e2) {
                    kc.c("MediaCodecRenderer", "Failed to initialize decoder: " + fdVar, e2);
                    this.P.removeFirst();
                    a aVar = new a(this.B, e2, z, fdVar);
                    a(aVar);
                    if (this.Q != null) {
                        this.Q = this.Q.a(aVar);
                    } else {
                        this.Q = aVar;
                    }
                    if (this.P.isEmpty()) {
                        throw this.Q;
                    }
                }
            }
            this.P = null;
            return;
        }
        throw new a(this.B, (Throwable) null, z, -49999);
    }

    private void c(x6 x6Var) {
        x6.CC.a(this.E, x6Var);
        this.E = x6Var;
    }

    private static boolean c(String str) {
        int i = yp.f1214a;
        if (i > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i <= 19) {
                String str2 = yp.b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.applovin.impl.d2
    protected void a(boolean z, boolean z2) {
        this.E0 = new l5();
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.applovin.impl.o5 a(com.applovin.impl.e9 r12) throws com.applovin.impl.y7 {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.gd.a(com.applovin.impl.e9):com.applovin.impl.o5");
    }

    @Override // com.applovin.impl.d2
    protected void a(long j, boolean z) throws y7 {
        this.w0 = false;
        this.x0 = false;
        this.z0 = false;
        if (this.k0) {
            this.u.b();
            this.t.b();
            this.l0 = false;
        } else {
            G();
        }
        if (this.v.e() > 0) {
            this.y0 = true;
        }
        this.v.a();
        int i = this.H0;
        if (i != 0) {
            int i2 = i - 1;
            this.G0 = this.z[i2];
            this.F0 = this.y[i2];
            this.H0 = 0;
        }
    }

    @Override // com.applovin.impl.d2
    protected void a(d9[] d9VarArr, long j, long j2) {
        if (this.G0 == -9223372036854775807L) {
            a1.b(this.F0 == -9223372036854775807L);
            this.F0 = j;
            this.G0 = j2;
            return;
        }
        int i = this.H0;
        if (i == this.z.length) {
            kc.d("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.z[this.H0 - 1]);
        } else {
            this.H0 = i + 1;
        }
        long[] jArr = this.y;
        int i2 = this.H0 - 1;
        jArr[i2] = j;
        this.z[i2] = j2;
        this.A[i2] = this.u0;
    }

    @Override // com.applovin.impl.li
    public void a(long j, long j2) throws MediaCryptoException, y7 {
        boolean z = false;
        if (this.z0) {
            this.z0 = false;
            R();
        }
        y7 y7Var = this.D0;
        if (y7Var == null) {
            try {
                if (this.x0) {
                    V();
                    return;
                }
                if (this.B != null || e(2)) {
                    P();
                    if (this.k0) {
                        lo.a("bypassRender");
                        while (b(j, j2)) {
                        }
                        lo.a();
                    } else if (this.K != null) {
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        lo.a("drainAndFeed");
                        while (c(j, j2) && e(jElapsedRealtime)) {
                        }
                        while (E() && e(jElapsedRealtime)) {
                        }
                        lo.a();
                    } else {
                        this.E0.d += b(j);
                        e(1);
                    }
                    this.E0.a();
                    return;
                }
                return;
            } catch (IllegalStateException e) {
                if (a(e)) {
                    a((Exception) e);
                    if (yp.f1214a >= 21 && c(e)) {
                        z = true;
                    }
                    if (z) {
                        U();
                    }
                    throw a(a(e, J()), this.B, z, 4003);
                }
                throw e;
            }
        }
        this.D0 = null;
        throw y7Var;
    }

    protected final void a(y7 y7Var) {
        this.D0 = y7Var;
    }

    @Override // com.applovin.impl.d2, com.applovin.impl.li
    public void a(float f, float f2) throws y7 {
        this.I = f;
        this.J = f2;
        e(this.L);
    }

    @Override // com.applovin.impl.mi
    public final int a(d9 d9Var) throws y7 {
        try {
            return a(this.o, d9Var);
        } catch (id.c e) {
            throw a(e, d9Var, 4002);
        }
    }

    protected ed a(Throwable th, fd fdVar) {
        return new ed(th, fdVar);
    }

    private static boolean a(IllegalStateException illegalStateException) {
        if (yp.f1214a >= 21 && b(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private int a(String str) {
        int i = yp.f1214a;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = yp.d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = yp.b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean a(String str, d9 d9Var) {
        return yp.f1214a < 21 && d9Var.o.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }
}
