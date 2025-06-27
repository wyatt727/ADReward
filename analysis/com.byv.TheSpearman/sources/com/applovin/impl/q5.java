package com.applovin.impl;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.applovin.impl.o1;
import com.applovin.impl.q1;
import com.applovin.impl.t1;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q5 implements q1 {
    public static boolean a0 = false;
    private long A;
    private long B;
    private long C;
    private int D;
    private boolean E;
    private boolean F;
    private long G;
    private float H;
    private o1[] I;
    private ByteBuffer[] J;
    private ByteBuffer K;
    private int L;
    private ByteBuffer M;
    private byte[] N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private int U;
    private u1 V;
    private boolean W;
    private long X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a, reason: collision with root package name */
    private final m1 f814a;
    private final b b;
    private final boolean c;
    private final b3 d;
    private final ap e;
    private final o1[] f;
    private final o1[] g;
    private final ConditionVariable h;
    private final t1 i;
    private final ArrayDeque j;
    private final boolean k;
    private final int l;
    private i m;
    private final g n;
    private final g o;
    private q1.c p;
    private c q;
    private c r;
    private AudioTrack s;
    private k1 t;
    private f u;
    private f v;
    private mh w;
    private ByteBuffer x;
    private int y;
    private long z;

    public interface b {
        long a(long j);

        mh a(mh mhVar);

        boolean a(boolean z);

        o1[] a();

        long b();
    }

    @Override // com.applovin.impl.q1
    public void h() throws IllegalStateException {
        if (yp.f1214a < 25) {
            b();
            return;
        }
        this.o.a();
        this.n.a();
        if (t()) {
            w();
            if (this.i.d()) {
                this.s.pause();
            }
            this.s.flush();
            this.i.g();
            t1 t1Var = this.i;
            AudioTrack audioTrack = this.s;
            c cVar = this.r;
            t1Var.a(audioTrack, cVar.c == 2, cVar.g, cVar.d, cVar.h);
            this.F = true;
        }
    }

    private final class h implements t1.a {
        @Override // com.applovin.impl.t1.a
        public void b(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + q5.this.q() + ", " + q5.this.r();
            if (q5.a0) {
                throw new e(str, null);
            }
            kc.d("DefaultAudioSink", str);
        }

        @Override // com.applovin.impl.t1.a
        public void b(long j) {
            kc.d("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
        }

        private h() {
        }

        @Override // com.applovin.impl.t1.a
        public void a(long j) {
            if (q5.this.p != null) {
                q5.this.p.a(j);
            }
        }

        /* synthetic */ h(q5 q5Var, a aVar) {
            this();
        }

        @Override // com.applovin.impl.t1.a
        public void a(int i, long j) {
            if (q5.this.p != null) {
                q5.this.p.a(i, j, SystemClock.elapsedRealtime() - q5.this.X);
            }
        }

        @Override // com.applovin.impl.t1.a
        public void a(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + q5.this.q() + ", " + q5.this.r();
            if (!q5.a0) {
                kc.d("DefaultAudioSink", str);
                return;
            }
            throw new e(str, null);
        }
    }

    private static boolean e(int i2) {
        return (yp.f1214a >= 24 && i2 == -6) || i2 == -32;
    }

    @Override // com.applovin.impl.q1
    public void e() throws IllegalStateException {
        a1.b(yp.f1214a >= 21);
        a1.b(this.T);
        if (this.W) {
            return;
        }
        this.W = true;
        b();
    }

    public static final class e extends RuntimeException {
        private e(String str) {
            super(str);
        }

        /* synthetic */ e(String str, a aVar) {
            this(str);
        }
    }

    public static class d implements b {

        /* renamed from: a, reason: collision with root package name */
        private final o1[] f817a;
        private final xj b;
        private final lk c;

        public d(o1... o1VarArr) {
            this(o1VarArr, new xj(), new lk());
        }

        @Override // com.applovin.impl.q5.b
        public mh a(mh mhVar) {
            this.c.b(mhVar.f697a);
            this.c.a(mhVar.b);
            return mhVar;
        }

        @Override // com.applovin.impl.q5.b
        public long b() {
            return this.b.j();
        }

        public d(o1[] o1VarArr, xj xjVar, lk lkVar) {
            o1[] o1VarArr2 = new o1[o1VarArr.length + 2];
            this.f817a = o1VarArr2;
            System.arraycopy(o1VarArr, 0, o1VarArr2, 0, o1VarArr.length);
            this.b = xjVar;
            this.c = lkVar;
            o1VarArr2[o1VarArr.length] = xjVar;
            o1VarArr2[o1VarArr.length + 1] = lkVar;
        }

        @Override // com.applovin.impl.q5.b
        public boolean a(boolean z) {
            this.b.a(z);
            return z;
        }

        @Override // com.applovin.impl.q5.b
        public o1[] a() {
            return this.f817a;
        }

        @Override // com.applovin.impl.q5.b
        public long a(long j) {
            return this.c.a(j);
        }
    }

    public q5(m1 m1Var, b bVar, boolean z, boolean z2, int i2) {
        this.f814a = m1Var;
        this.b = (b) a1.a(bVar);
        int i3 = yp.f1214a;
        this.c = i3 >= 21 && z;
        this.k = i3 >= 23 && z2;
        this.l = i3 < 29 ? 0 : i2;
        this.h = new ConditionVariable(true);
        this.i = new t1(new h(this, null));
        b3 b3Var = new b3();
        this.d = b3Var;
        ap apVar = new ap();
        this.e = apVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new ri(), b3Var, apVar);
        Collections.addAll(arrayList, bVar.a());
        this.f = (o1[]) arrayList.toArray(new o1[0]);
        this.g = new o1[]{new a9()};
        this.H = 1.0f;
        this.t = k1.g;
        this.U = 0;
        this.V = new u1(0, 0.0f);
        mh mhVar = mh.d;
        this.v = new f(mhVar, false, 0L, 0L, null);
        this.w = mhVar;
        this.P = -1;
        this.I = new o1[0];
        this.J = new ByteBuffer[0];
        this.j = new ArrayDeque();
        this.n = new g(100L);
        this.o = new g(100L);
    }

    private void y() {
        o1[] o1VarArr = this.r.i;
        ArrayList arrayList = new ArrayList();
        for (o1 o1Var : o1VarArr) {
            if (o1Var.f()) {
                arrayList.add(o1Var);
            } else {
                o1Var.b();
            }
        }
        int size = arrayList.size();
        this.I = (o1[]) arrayList.toArray(new o1[size]);
        this.J = new ByteBuffer[size];
        m();
    }

    private void m() {
        int i2 = 0;
        while (true) {
            o1[] o1VarArr = this.I;
            if (i2 >= o1VarArr.length) {
                return;
            }
            o1 o1Var = o1VarArr[i2];
            o1Var.b();
            this.J[i2] = o1Var.d();
            i2++;
        }
    }

    private void s() throws q1.b {
        this.h.block();
        AudioTrack audioTrackK = k();
        this.s = audioTrackK;
        if (a(audioTrackK)) {
            b(this.s);
            if (this.l != 3) {
                AudioTrack audioTrack = this.s;
                d9 d9Var = this.r.f816a;
                audioTrack.setOffloadDelayPadding(d9Var.C, d9Var.D);
            }
        }
        this.U = this.s.getAudioSessionId();
        t1 t1Var = this.i;
        AudioTrack audioTrack2 = this.s;
        c cVar = this.r;
        t1Var.a(audioTrack2, cVar.c == 2, cVar.g, cVar.d, cVar.h);
        x();
        int i2 = this.V.f1046a;
        if (i2 != 0) {
            this.s.attachAuxEffect(i2);
            this.s.setAuxEffectSendLevel(this.V.b);
        }
        this.F = true;
    }

    @Override // com.applovin.impl.q1
    public void j() throws IllegalStateException {
        this.S = true;
        if (t()) {
            this.i.i();
            this.s.play();
        }
    }

    @Override // com.applovin.impl.q1
    public void i() {
        this.E = true;
    }

    private AudioTrack k() throws q1.b {
        try {
            return ((c) a1.a(this.r)).a(this.W, this.t, this.U);
        } catch (q1.b e2) {
            u();
            q1.c cVar = this.p;
            if (cVar != null) {
                cVar.a(e2);
            }
            throw e2;
        }
    }

    private void u() {
        if (this.r.b()) {
            this.Y = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean l() throws java.lang.Exception {
        /*
            r9 = this;
            int r0 = r9.P
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.P = r3
        L9:
            r0 = r2
            goto Lc
        Lb:
            r0 = r3
        Lc:
            int r4 = r9.P
            com.applovin.impl.o1[] r5 = r9.I
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.e()
        L1f:
            r9.d(r7)
            boolean r0 = r4.c()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.P
            int r0 = r0 + r2
            r9.P = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.M
            if (r0 == 0) goto L3b
            r9.a(r0, r7)
            java.nio.ByteBuffer r0 = r9.M
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.P = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.q5.l():boolean");
    }

    @Override // com.applovin.impl.q1
    public void f() throws IllegalStateException {
        if (!this.Q && t() && l()) {
            v();
            this.Q = true;
        }
    }

    public boolean p() {
        return o().b;
    }

    @Override // com.applovin.impl.q1
    public boolean g() {
        return t() && this.i.e(r());
    }

    private void x() {
        if (t()) {
            if (yp.f1214a >= 21) {
                a(this.s, this.H);
            } else {
                b(this.s, this.H);
            }
        }
    }

    @Override // com.applovin.impl.q1
    public void pause() throws IllegalStateException {
        this.S = false;
        if (t() && this.i.f()) {
            this.s.pause();
        }
    }

    class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AudioTrack f815a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, AudioTrack audioTrack) {
            super(str);
            this.f815a = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f815a.flush();
                this.f815a.release();
            } finally {
                q5.this.h.open();
            }
        }
    }

    @Override // com.applovin.impl.q1
    public void d() throws IllegalStateException {
        if (this.W) {
            this.W = false;
            b();
        }
    }

    @Override // com.applovin.impl.q1
    public void reset() throws IllegalStateException {
        b();
        for (o1 o1Var : this.f) {
            o1Var.reset();
        }
        for (o1 o1Var2 : this.g) {
            o1Var2.reset();
        }
        this.S = false;
        this.Y = false;
    }

    private void w() {
        this.z = 0L;
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        this.Z = false;
        this.D = 0;
        this.v = new f(n(), p(), 0L, 0L, null);
        this.G = 0L;
        this.u = null;
        this.j.clear();
        this.K = null;
        this.L = 0;
        this.M = null;
        this.R = false;
        this.Q = false;
        this.P = -1;
        this.x = null;
        this.y = 0;
        this.e.k();
        m();
    }

    private mh n() {
        return o().f818a;
    }

    private f o() {
        f fVar = this.u;
        if (fVar != null) {
            return fVar;
        }
        if (!this.j.isEmpty()) {
            return (f) this.j.getLast();
        }
        return this.v;
    }

    private boolean z() {
        return (this.W || !"audio/raw".equals(this.r.f816a.m) || f(this.r.f816a.B)) ? false : true;
    }

    private boolean t() {
        return this.s != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long q() {
        if (this.r.c == 0) {
            return this.z / r0.b;
        }
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long r() {
        if (this.r.c == 0) {
            return this.B / r0.d;
        }
        return this.C;
    }

    private void a(long j) {
        mh mhVarA;
        if (z()) {
            mhVarA = this.b.a(n());
        } else {
            mhVarA = mh.d;
        }
        mh mhVar = mhVarA;
        boolean zA = z() ? this.b.a(p()) : false;
        this.j.add(new f(mhVar, zA, Math.max(0L, j), this.r.b(r()), null));
        y();
        q1.c cVar = this.p;
        if (cVar != null) {
            cVar.a(zA);
        }
    }

    private long c(long j) {
        return j + this.r.b(this.b.b());
    }

    private long b(long j) {
        while (!this.j.isEmpty() && j >= ((f) this.j.getFirst()).d) {
            this.v = (f) this.j.remove();
        }
        f fVar = this.v;
        long j2 = j - fVar.d;
        if (fVar.f818a.equals(mh.d)) {
            return this.v.c + j2;
        }
        if (this.j.isEmpty()) {
            return this.v.c + this.b.a(j2);
        }
        f fVar2 = (f) this.j.getFirst();
        return fVar2.c - yp.a(fVar2.d - j, this.v.f818a.f697a);
    }

    private void v() throws IllegalStateException {
        if (this.R) {
            return;
        }
        this.R = true;
        this.i.d(r());
        this.s.stop();
        this.y = 0;
    }

    private final class i {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f821a = new Handler();
        private final AudioTrack.StreamEventCallback b;

        public i() {
            this.b = new a(q5.this);
        }

        class a extends AudioTrack.StreamEventCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ q5 f822a;

            a(q5 q5Var) {
                this.f822a = q5Var;
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i) {
                a1.b(audioTrack == q5.this.s);
                if (q5.this.p == null || !q5.this.S) {
                    return;
                }
                q5.this.p.a();
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                a1.b(audioTrack == q5.this.s);
                if (q5.this.p == null || !q5.this.S) {
                    return;
                }
                q5.this.p.a();
            }
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f821a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new q5$i$$ExternalSyntheticLambda0(handler), this.b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.b);
            this.f821a.removeCallbacksAndMessages(null);
        }
    }

    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final mh f818a;
        public final boolean b;
        public final long c;
        public final long d;

        private f(mh mhVar, boolean z, long j, long j2) {
            this.f818a = mhVar;
            this.b = z;
            this.c = j;
            this.d = j2;
        }

        /* synthetic */ f(mh mhVar, boolean z, long j, long j2, a aVar) {
            this(mhVar, z, j, j2);
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final d9 f816a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final o1[] i;

        public c(d9 d9Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, o1[] o1VarArr) {
            this.f816a = d9Var;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.i = o1VarArr;
            this.h = a(i7, z);
        }

        public long b(long j) {
            return (j * 1000000) / this.e;
        }

        public AudioTrack a(boolean z, k1 k1Var, int i) throws q1.b {
            try {
                AudioTrack audioTrackB = b(z, k1Var, i);
                int state = audioTrackB.getState();
                if (state == 1) {
                    return audioTrackB;
                }
                try {
                    audioTrackB.release();
                } catch (Exception unused) {
                }
                throw new q1.b(state, this.e, this.f, this.h, this.f816a, b(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new q1.b(0, this.e, this.f, this.h, this.f816a, b(), e);
            }
        }

        private AudioTrack d(boolean z, k1 k1Var, int i) {
            return new AudioTrack.Builder().setAudioAttributes(a(k1Var, z)).setAudioFormat(q5.b(this.e, this.f, this.g)).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i).setOffloadedPlayback(this.c == 1).build();
        }

        private int c(long j) {
            int iD = q5.d(this.g);
            if (this.g == 5) {
                iD *= 2;
            }
            return (int) ((j * iD) / 1000000);
        }

        private AudioTrack c(boolean z, k1 k1Var, int i) {
            return new AudioTrack(a(k1Var, z), q5.b(this.e, this.f, this.g), this.h, 1, i);
        }

        public boolean a(c cVar) {
            return cVar.c == this.c && cVar.g == this.g && cVar.e == this.e && cVar.f == this.f && cVar.d == this.d;
        }

        public long d(long j) {
            return (j * 1000000) / this.f816a.A;
        }

        public boolean b() {
            return this.c == 1;
        }

        private AudioTrack b(boolean z, k1 k1Var, int i) {
            int i2 = yp.f1214a;
            if (i2 >= 29) {
                return d(z, k1Var, i);
            }
            if (i2 >= 21) {
                return c(z, k1Var, i);
            }
            return a(k1Var, i);
        }

        private int a(int i, boolean z) {
            if (i != 0) {
                return i;
            }
            int i2 = this.c;
            if (i2 == 0) {
                return a(z ? 8.0f : 1.0f);
            }
            if (i2 == 1) {
                return c(50000000L);
            }
            if (i2 == 2) {
                return c(250000L);
            }
            throw new IllegalStateException();
        }

        private AudioTrack a(k1 k1Var, int i) {
            int iE = yp.e(k1Var.c);
            if (i == 0) {
                return new AudioTrack(iE, this.e, this.f, this.g, this.h, 1);
            }
            return new AudioTrack(iE, this.e, this.f, this.g, this.h, 1, i);
        }

        public long a(long j) {
            return (j * this.e) / 1000000;
        }

        private static AudioAttributes a(k1 k1Var, boolean z) {
            if (z) {
                return a();
            }
            return k1Var.a();
        }

        private int a(float f) {
            int minBufferSize = AudioTrack.getMinBufferSize(this.e, this.f, this.g);
            a1.b(minBufferSize != -2);
            int iA = yp.a(minBufferSize * 4, ((int) a(250000L)) * this.d, Math.max(minBufferSize, ((int) a(750000L)) * this.d));
            return f != 1.0f ? Math.round(iA * f) : iA;
        }

        private static AudioAttributes a() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
    }

    @Override // com.applovin.impl.q1
    public void a(d9 d9Var, int i2, int[] iArr) throws q1.a {
        o1[] o1VarArr;
        int iB;
        int iIntValue;
        int iIntValue2;
        int i3;
        int i4;
        int iB2;
        o1[] o1VarArr2;
        int[] iArr2;
        if ("audio/raw".equals(d9Var.m)) {
            a1.a(yp.g(d9Var.B));
            iB = yp.b(d9Var.B, d9Var.z);
            if (f(d9Var.B)) {
                o1VarArr2 = this.g;
            } else {
                o1VarArr2 = this.f;
            }
            this.e.a(d9Var.C, d9Var.D);
            if (yp.f1214a < 21 && d9Var.z == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i5 = 0; i5 < 6; i5++) {
                    iArr2[i5] = i5;
                }
            } else {
                iArr2 = iArr;
            }
            this.d.a(iArr2);
            o1.a aVar = new o1.a(d9Var.A, d9Var.z, d9Var.B);
            for (o1 o1Var : o1VarArr2) {
                try {
                    o1.a aVarA = o1Var.a(aVar);
                    if (o1Var.f()) {
                        aVar = aVarA;
                    }
                } catch (o1.b e2) {
                    throw new q1.a(e2, d9Var);
                }
            }
            int i6 = aVar.c;
            i3 = aVar.f734a;
            iIntValue2 = yp.a(aVar.b);
            o1VarArr = o1VarArr2;
            iIntValue = i6;
            iB2 = yp.b(i6, aVar.b);
            i4 = 0;
        } else {
            o1[] o1VarArr3 = new o1[0];
            int i7 = d9Var.A;
            if (a(d9Var, this.t)) {
                o1VarArr = o1VarArr3;
                iB = -1;
                iIntValue = df.b((String) a1.a((Object) d9Var.m), d9Var.j);
                iB2 = -1;
                i3 = i7;
                i4 = 1;
                iIntValue2 = yp.a(d9Var.z);
            } else {
                Pair pairA = a(d9Var, this.f814a);
                if (pairA != null) {
                    o1VarArr = o1VarArr3;
                    iB = -1;
                    iIntValue = ((Integer) pairA.first).intValue();
                    iIntValue2 = ((Integer) pairA.second).intValue();
                    i3 = i7;
                    i4 = 2;
                    iB2 = -1;
                } else {
                    throw new q1.a("Unable to configure passthrough for: " + d9Var, d9Var);
                }
            }
        }
        if (iIntValue == 0) {
            throw new q1.a("Invalid output encoding (mode=" + i4 + ") for: " + d9Var, d9Var);
        }
        if (iIntValue2 != 0) {
            this.Y = false;
            c cVar = new c(d9Var, iB, i4, iB2, i3, iIntValue2, iIntValue, i2, this.k, o1VarArr);
            if (t()) {
                this.q = cVar;
                return;
            } else {
                this.r = cVar;
                return;
            }
        }
        throw new q1.a("Invalid output channel config (mode=" + i4 + ") for: " + d9Var, d9Var);
    }

    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        private final long f819a;
        private Exception b;
        private long c;

        public g(long j) {
            this.f819a = j;
        }

        public void a() {
            this.b = null;
        }

        public void a(Exception exc) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.b == null) {
                this.b = exc;
                this.c = this.f819a + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.c) {
                Exception exc2 = this.b;
                if (exc2 != exc) {
                    exc2.addSuppressed(exc);
                }
                Exception exc3 = this.b;
                a();
                throw exc3;
            }
        }
    }

    private boolean f(int i2) {
        return this.c && yp.f(i2);
    }

    @Override // com.applovin.impl.q1
    public boolean c() {
        return !t() || (this.Q && !g());
    }

    private static int c(int i2) {
        int i3 = yp.f1214a;
        if (i3 <= 28) {
            if (i2 == 7) {
                i2 = 8;
            } else if (i2 == 3 || i2 == 4 || i2 == 5) {
                i2 = 6;
            }
        }
        if (i3 <= 26 && "fugu".equals(yp.b) && i2 == 1) {
            i2 = 2;
        }
        return yp.a(i2);
    }

    @Override // com.applovin.impl.q1
    public long a(boolean z) {
        if (!t() || this.F) {
            return Long.MIN_VALUE;
        }
        return c(b(Math.min(this.i.a(z), this.r.b(r()))));
    }

    @Override // com.applovin.impl.q1
    public void b() throws IllegalStateException {
        if (t()) {
            w();
            if (this.i.d()) {
                this.s.pause();
            }
            if (a(this.s)) {
                ((i) a1.a(this.m)).b(this.s);
            }
            AudioTrack audioTrack = this.s;
            this.s = null;
            if (yp.f1214a < 21 && !this.T) {
                this.U = 0;
            }
            c cVar = this.q;
            if (cVar != null) {
                this.r = cVar;
                this.q = null;
            }
            this.i.g();
            this.h.close();
            new a("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.o.a();
        this.n.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(int i2) {
        switch (i2) {
            case 5:
                return Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND;
            case 6:
            case 18:
                return Ac3Util.E_AC3_MAX_RATE_BYTES_PER_SECOND;
            case 7:
                return DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND;
            case 8:
                return DtsUtil.DTS_HD_MAX_RATE_BYTES_PER_SECOND;
            case 9:
                return MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND;
            case 10:
                return 100000;
            case 11:
                return AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
            case 12:
                return 7000;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return Ac3Util.TRUEHD_MAX_RATE_BYTES_PER_SECOND;
            case 15:
                return 8000;
            case 16:
                return AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND;
            case 17:
                return Ac4Util.MAX_RATE_BYTES_PER_SECOND;
        }
    }

    @Override // com.applovin.impl.q1
    public int b(d9 d9Var) {
        if (!"audio/raw".equals(d9Var.m)) {
            return ((this.Y || !a(d9Var, this.t)) && !b(d9Var, this.f814a)) ? 0 : 2;
        }
        if (!yp.g(d9Var.B)) {
            kc.d("DefaultAudioSink", "Invalid PCM encoding: " + d9Var.B);
            return 0;
        }
        int i2 = d9Var.B;
        return (i2 == 2 || (this.c && i2 == 4)) ? 2 : 1;
    }

    private void d(long j) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.I.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.J[i2 - 1];
            } else {
                byteBuffer = this.K;
                if (byteBuffer == null) {
                    byteBuffer = o1.f733a;
                }
            }
            if (i2 == length) {
                a(byteBuffer, j);
            } else {
                o1 o1Var = this.I[i2];
                if (i2 > this.P) {
                    o1Var.a(byteBuffer);
                }
                ByteBuffer byteBufferD = o1Var.d();
                this.J[i2] = byteBufferD;
                if (byteBufferD.hasRemaining()) {
                    i2++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i2--;
            }
        }
    }

    private static Pair a(d9 d9Var, m1 m1Var) {
        if (m1Var == null) {
            return null;
        }
        int iB = df.b((String) a1.a((Object) d9Var.m), d9Var.j);
        int iA = 6;
        if (iB != 5 && iB != 6 && iB != 18 && iB != 17 && iB != 7 && iB != 8 && iB != 14) {
            return null;
        }
        if (iB == 18 && !m1Var.a(18)) {
            iB = 6;
        } else if (iB == 8 && !m1Var.a(8)) {
            iB = 7;
        }
        if (!m1Var.a(iB)) {
            return null;
        }
        if (iB == 18) {
            if (yp.f1214a >= 29 && (iA = a(18, d9Var.A)) == 0) {
                kc.d("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
                return null;
            }
        } else {
            iA = d9Var.z;
            if (iA > m1Var.c()) {
                return null;
            }
        }
        int iC = c(iA);
        if (iC == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iB), Integer.valueOf(iC));
    }

    private static boolean b(d9 d9Var, m1 m1Var) {
        return a(d9Var, m1Var) != null;
    }

    private void b(AudioTrack audioTrack) {
        if (this.m == null) {
            this.m = new i();
        }
        this.m.a(audioTrack);
    }

    private static int a(int i2, ByteBuffer byteBuffer) {
        switch (i2) {
            case 5:
            case 6:
            case 18:
                return k.b(byteBuffer);
            case 7:
            case 8:
                return d7.a(byteBuffer);
            case 9:
                int iD = of.d(yp.a(byteBuffer, byteBuffer.position()));
                if (iD != -1) {
                    return iD;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i2);
            case 14:
                int iA = k.a(byteBuffer);
                if (iA == -1) {
                    return 0;
                }
                return k.a(byteBuffer, iA) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return n.a(byteBuffer);
        }
    }

    private void b(mh mhVar) {
        if (t()) {
            try {
                this.s.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(mhVar.f697a).setPitch(mhVar.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                kc.c("DefaultAudioSink", "Failed to set playback params", e2);
            }
            mhVar = new mh(this.s.getPlaybackParams().getSpeed(), this.s.getPlaybackParams().getPitch());
            this.i.a(mhVar.f697a);
        }
        this.w = mhVar;
    }

    @Override // com.applovin.impl.q1
    public mh a() {
        if (this.k) {
            return this.w;
        }
        return n();
    }

    @Override // com.applovin.impl.q1
    public boolean a(ByteBuffer byteBuffer, long j, int i2) throws Exception {
        ByteBuffer byteBuffer2 = this.K;
        a1.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.q != null) {
            if (!l()) {
                return false;
            }
            if (!this.q.a(this.r)) {
                v();
                if (g()) {
                    return false;
                }
                b();
            } else {
                this.r = this.q;
                this.q = null;
                if (a(this.s) && this.l != 3) {
                    this.s.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.s;
                    d9 d9Var = this.r.f816a;
                    audioTrack.setOffloadDelayPadding(d9Var.C, d9Var.D);
                    this.Z = true;
                }
            }
            a(j);
        }
        if (!t()) {
            try {
                s();
            } catch (q1.b e2) {
                if (!e2.b) {
                    this.n.a(e2);
                    return false;
                }
                throw e2;
            }
        }
        this.n.a();
        if (this.F) {
            this.G = Math.max(0L, j);
            this.E = false;
            this.F = false;
            if (this.k && yp.f1214a >= 23) {
                b(this.w);
            }
            a(j);
            if (this.S) {
                j();
            }
        }
        if (!this.i.g(r())) {
            return false;
        }
        if (this.K == null) {
            a1.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            c cVar = this.r;
            if (cVar.c != 0 && this.D == 0) {
                int iA = a(cVar.g, byteBuffer);
                this.D = iA;
                if (iA == 0) {
                    return true;
                }
            }
            if (this.u != null) {
                if (!l()) {
                    return false;
                }
                a(j);
                this.u = null;
            }
            long jD = this.G + this.r.d(q() - this.e.j());
            if (!this.E && Math.abs(jD - j) > 200000) {
                this.p.a(new q1.d(j, jD));
                this.E = true;
            }
            if (this.E) {
                if (!l()) {
                    return false;
                }
                long j2 = j - jD;
                this.G += j2;
                this.E = false;
                a(j);
                q1.c cVar2 = this.p;
                if (cVar2 != null && j2 != 0) {
                    cVar2.b();
                }
            }
            if (this.r.c == 0) {
                this.z += byteBuffer.remaining();
            } else {
                this.A += this.D * i2;
            }
            this.K = byteBuffer;
            this.L = i2;
        }
        d(j);
        if (!this.K.hasRemaining()) {
            this.K = null;
            this.L = 0;
            return true;
        }
        if (!this.i.f(r())) {
            return false;
        }
        kc.d("DefaultAudioSink", "Resetting stalled audio track");
        b();
        return true;
    }

    @Override // com.applovin.impl.q1
    public void b(boolean z) {
        a(n(), z);
    }

    @Override // com.applovin.impl.q1
    public void a(k1 k1Var) throws IllegalStateException {
        if (this.t.equals(k1Var)) {
            return;
        }
        this.t = k1Var;
        if (this.W) {
            return;
        }
        b();
    }

    private static void b(AudioTrack audioTrack, float f2) {
        audioTrack.setStereoVolume(f2, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AudioFormat b(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }

    private void a(mh mhVar, boolean z) {
        f fVarO = o();
        if (mhVar.equals(fVarO.f818a) && z == fVarO.b) {
            return;
        }
        f fVar = new f(mhVar, z, -9223372036854775807L, -9223372036854775807L, null);
        if (t()) {
            this.u = fVar;
        } else {
            this.v = fVar;
        }
    }

    @Override // com.applovin.impl.q1
    public void a(int i2) throws IllegalStateException {
        if (this.U != i2) {
            this.U = i2;
            this.T = i2 != 0;
            b();
        }
    }

    @Override // com.applovin.impl.q1
    public void a(u1 u1Var) {
        if (this.V.equals(u1Var)) {
            return;
        }
        int i2 = u1Var.f1046a;
        float f2 = u1Var.b;
        AudioTrack audioTrack = this.s;
        if (audioTrack != null) {
            if (this.V.f1046a != i2) {
                audioTrack.attachAuxEffect(i2);
            }
            if (i2 != 0) {
                this.s.setAuxEffectSendLevel(f2);
            }
        }
        this.V = u1Var;
    }

    @Override // com.applovin.impl.q1
    public void a(q1.c cVar) {
        this.p = cVar;
    }

    @Override // com.applovin.impl.q1
    public void a(mh mhVar) {
        mh mhVar2 = new mh(yp.a(mhVar.f697a, 0.1f, 8.0f), yp.a(mhVar.b, 0.1f, 8.0f));
        if (this.k && yp.f1214a >= 23) {
            b(mhVar2);
        } else {
            a(mhVar2, p());
        }
    }

    @Override // com.applovin.impl.q1
    public void a(float f2) {
        if (this.H != f2) {
            this.H = f2;
            x();
        }
    }

    private static void a(AudioTrack audioTrack, float f2) {
        audioTrack.setVolume(f2);
    }

    @Override // com.applovin.impl.q1
    public boolean a(d9 d9Var) {
        return b(d9Var) != 0;
    }

    private void a(ByteBuffer byteBuffer, long j) throws Exception {
        int iA;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.M;
            if (byteBuffer2 != null) {
                a1.a(byteBuffer2 == byteBuffer);
            } else {
                this.M = byteBuffer;
                if (yp.f1214a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.N;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.N = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.N, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.O = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (yp.f1214a < 21) {
                int iB = this.i.b(this.B);
                if (iB > 0) {
                    iA = this.s.write(this.N, this.O, Math.min(iRemaining2, iB));
                    if (iA > 0) {
                        this.O += iA;
                        byteBuffer.position(byteBuffer.position() + iA);
                    }
                } else {
                    iA = 0;
                }
            } else if (this.W) {
                a1.b(j != -9223372036854775807L);
                iA = a(this.s, byteBuffer, iRemaining2, j);
            } else {
                iA = a(this.s, byteBuffer, iRemaining2);
            }
            this.X = SystemClock.elapsedRealtime();
            if (iA < 0) {
                boolean zE = e(iA);
                if (zE) {
                    u();
                }
                q1.e eVar = new q1.e(iA, this.r.f816a, zE);
                q1.c cVar = this.p;
                if (cVar != null) {
                    cVar.a(eVar);
                }
                if (!eVar.b) {
                    this.o.a(eVar);
                    return;
                }
                throw eVar;
            }
            this.o.a();
            if (a(this.s)) {
                long j2 = this.C;
                if (j2 > 0) {
                    this.Z = false;
                }
                if (this.S && this.p != null && iA < iRemaining2 && !this.Z) {
                    this.p.b(this.i.c(j2));
                }
            }
            int i2 = this.r.c;
            if (i2 == 0) {
                this.B += iA;
            }
            if (iA == iRemaining2) {
                if (i2 != 0) {
                    a1.b(byteBuffer == this.K);
                    this.C += this.D * this.L;
                }
                this.M = null;
            }
        }
    }

    private static int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2) {
        return audioTrack.write(byteBuffer, i2, 1);
    }

    private static int a(int i2, int i3) {
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i4 = 8; i4 > 0; i4--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i2).setSampleRate(i3).setChannelMask(yp.a(i4)).build(), audioAttributesBuild)) {
                return i4;
            }
        }
        return 0;
    }

    private boolean a(d9 d9Var, k1 k1Var) {
        int iB;
        int iA;
        int iA2;
        if (yp.f1214a < 29 || this.l == 0 || (iB = df.b((String) a1.a((Object) d9Var.m), d9Var.j)) == 0 || (iA = yp.a(d9Var.z)) == 0 || (iA2 = a(b(d9Var.A, iA, iB), k1Var.a())) == 0) {
            return false;
        }
        if (iA2 == 1) {
            return ((d9Var.C != 0 || d9Var.D != 0) && (this.l == 1)) ? false : true;
        }
        if (iA2 == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    private int a(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i2 = yp.f1214a;
        if (i2 >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (i2 == 30 && yp.d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    private static boolean a(AudioTrack audioTrack) {
        return yp.f1214a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2, long j) {
        if (yp.f1214a >= 26) {
            return audioTrack.write(byteBuffer, i2, 1, j * 1000);
        }
        if (this.x == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.x = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.x.putInt(1431633921);
        }
        if (this.y == 0) {
            this.x.putInt(4, i2);
            this.x.putLong(8, j * 1000);
            this.x.position(0);
            this.y = i2;
        }
        int iRemaining = this.x.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.x, iRemaining, 1);
            if (iWrite < 0) {
                this.y = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iA = a(audioTrack, byteBuffer, i2);
        if (iA < 0) {
            this.y = 0;
            return iA;
        }
        this.y -= iA;
        return iA;
    }
}
