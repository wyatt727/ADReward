package com.applovin.impl;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.applovin.impl.cd;
import com.applovin.impl.d9;
import com.applovin.impl.li;
import com.applovin.impl.mi;
import com.applovin.impl.p1;
import com.applovin.impl.q1;
import com.google.android.exoplayer2.util.MimeTypes;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class dd extends gd implements bd {
    private final Context J0;
    private final p1.a K0;
    private final q1 L0;
    private int M0;
    private boolean N0;
    private d9 O0;
    private long P0;
    private boolean Q0;
    private boolean R0;
    private boolean S0;
    private boolean T0;
    private li.a U0;

    private static boolean c0() {
        if (yp.f1214a == 23) {
            String str = yp.d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean h(String str) {
        if (yp.f1214a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(yp.c)) {
            String str2 = yp.b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.applovin.impl.li, com.applovin.impl.mi
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.applovin.impl.d2, com.applovin.impl.li
    public bd l() {
        return this;
    }

    public dd(Context context, cd.b bVar, hd hdVar, boolean z, Handler handler, p1 p1Var, q1 q1Var) {
        super(1, bVar, hdVar, z, 44100.0f);
        this.J0 = context.getApplicationContext();
        this.L0 = q1Var;
        this.K0 = new p1.a(handler, p1Var);
        q1Var.a(new b());
    }

    @Override // com.applovin.impl.gd
    protected void g(String str) {
        this.K0.a(str);
    }

    public dd(Context context, hd hdVar, boolean z, Handler handler, p1 p1Var, q1 q1Var) {
        this(context, cd.b.f329a, hdVar, z, handler, p1Var, q1Var);
    }

    @Override // com.applovin.impl.gd
    protected o5 a(fd fdVar, d9 d9Var, d9 d9Var2) {
        o5 o5VarA = fdVar.a(d9Var, d9Var2);
        int i = o5VarA.e;
        if (a(fdVar, d9Var2) > this.M0) {
            i |= 64;
        }
        int i2 = i;
        return new o5(fdVar.f425a, d9Var, d9Var2, i2 != 0 ? 0 : o5VarA.d, i2);
    }

    protected void d0() {
        this.R0 = true;
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.d2
    protected void x() {
        super.x();
        this.L0.j();
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.d2
    protected void y() {
        e0();
        this.L0.pause();
        super.y();
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.d2
    protected void v() {
        this.S0 = true;
        try {
            this.L0.b();
            try {
                super.v();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.v();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.d2
    protected void w() {
        try {
            super.w();
        } finally {
            if (this.S0) {
                this.S0 = false;
                this.L0.reset();
            }
        }
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.li
    public boolean c() {
        return super.c() && this.L0.c();
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.li
    public boolean d() {
        return this.L0.g() || super.d();
    }

    @Override // com.applovin.impl.bd
    public long p() {
        if (b() == 2) {
            e0();
        }
        return this.P0;
    }

    @Override // com.applovin.impl.gd
    protected void Q() {
        super.Q();
        this.L0.i();
    }

    @Override // com.applovin.impl.gd
    protected void V() throws y7 {
        try {
            this.L0.f();
        } catch (q1.e e) {
            throw a(e, e.c, e.b, 5002);
        }
    }

    @Override // com.applovin.impl.gd
    protected void b(n5 n5Var) {
        if (!this.Q0 || n5Var.d()) {
            return;
        }
        if (Math.abs(n5Var.f - this.P0) > 500000) {
            this.P0 = n5Var.f;
        }
        this.Q0 = false;
    }

    private void e0() {
        long jA = this.L0.a(c());
        if (jA != Long.MIN_VALUE) {
            if (!this.R0) {
                jA = Math.max(this.P0, jA);
            }
            this.P0 = jA;
            this.R0 = false;
        }
    }

    private final class b implements q1.c {
        private b() {
        }

        @Override // com.applovin.impl.q1.c
        public void b(long j) {
            if (dd.this.U0 != null) {
                dd.this.U0.a(j);
            }
        }

        @Override // com.applovin.impl.q1.c
        public void a(Exception exc) {
            kc.a("MediaCodecAudioRenderer", "Audio sink error", exc);
            dd.this.K0.b(exc);
        }

        @Override // com.applovin.impl.q1.c
        public void b() {
            dd.this.d0();
        }

        @Override // com.applovin.impl.q1.c
        public void a() {
            if (dd.this.U0 != null) {
                dd.this.U0.a();
            }
        }

        @Override // com.applovin.impl.q1.c
        public void a(long j) {
            dd.this.K0.b(j);
        }

        @Override // com.applovin.impl.q1.c
        public void a(boolean z) {
            dd.this.K0.b(z);
        }

        @Override // com.applovin.impl.q1.c
        public void a(int i, long j, long j2) {
            dd.this.K0.b(i, j, j2);
        }
    }

    @Override // com.applovin.impl.gd
    protected boolean c(d9 d9Var) {
        return this.L0.a(d9Var);
    }

    private int a(fd fdVar, d9 d9Var) {
        int i;
        if (!"OMX.google.raw.decoder".equals(fdVar.f425a) || (i = yp.f1214a) >= 24 || (i == 23 && yp.d(this.J0))) {
            return d9Var.n;
        }
        return -1;
    }

    protected int a(fd fdVar, d9 d9Var, d9[] d9VarArr) {
        int iA = a(fdVar, d9Var);
        if (d9VarArr.length == 1) {
            return iA;
        }
        for (d9 d9Var2 : d9VarArr) {
            if (fdVar.a(d9Var, d9Var2).d != 0) {
                iA = Math.max(iA, a(fdVar, d9Var2));
            }
        }
        return iA;
    }

    @Override // com.applovin.impl.gd
    protected float a(float f, d9 d9Var, d9[] d9VarArr) {
        int iMax = -1;
        for (d9 d9Var2 : d9VarArr) {
            int i = d9Var2.A;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f * iMax;
    }

    @Override // com.applovin.impl.gd
    protected List a(hd hdVar, d9 d9Var, boolean z) {
        fd fdVarA;
        String str = d9Var.m;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.L0.a(d9Var) && (fdVarA = id.a()) != null) {
            return Collections.singletonList(fdVarA);
        }
        List listA = id.a(hdVar.a(str, z, false), d9Var);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(listA);
            arrayList.addAll(hdVar.a("audio/eac3", z, false));
            listA = arrayList;
        }
        return Collections.unmodifiableList(listA);
    }

    @Override // com.applovin.impl.gd
    protected cd.a a(fd fdVar, d9 d9Var, MediaCrypto mediaCrypto, float f) {
        this.M0 = a(fdVar, d9Var, t());
        this.N0 = h(fdVar.f425a);
        MediaFormat mediaFormatA = a(d9Var, fdVar.c, this.M0, f);
        this.O0 = (!"audio/raw".equals(fdVar.b) || "audio/raw".equals(d9Var.m)) ? null : d9Var;
        return cd.a.a(fdVar, mediaFormatA, d9Var, mediaCrypto);
    }

    @Override // com.applovin.impl.bd
    public mh a() {
        return this.L0.a();
    }

    @Override // com.applovin.impl.d2, com.applovin.impl.oh.b
    public void a(int i, Object obj) {
        if (i == 2) {
            this.L0.a(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            this.L0.a((k1) obj);
            return;
        }
        if (i != 6) {
            switch (i) {
                case 9:
                    this.L0.b(((Boolean) obj).booleanValue());
                    break;
                case 10:
                    this.L0.a(((Integer) obj).intValue());
                    break;
                case 11:
                    this.U0 = (li.a) obj;
                    break;
                default:
                    super.a(i, obj);
                    break;
            }
            return;
        }
        this.L0.a((u1) obj);
    }

    @Override // com.applovin.impl.gd
    protected void a(Exception exc) {
        kc.a("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.K0.a(exc);
    }

    @Override // com.applovin.impl.gd
    protected void a(String str, long j, long j2) {
        this.K0.a(str, j, j2);
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.d2
    protected void a(boolean z, boolean z2) {
        super.a(z, z2);
        this.K0.b(this.E0);
        if (q().f722a) {
            this.L0.e();
        } else {
            this.L0.d();
        }
    }

    @Override // com.applovin.impl.gd
    protected o5 a(e9 e9Var) throws y7 {
        o5 o5VarA = super.a(e9Var);
        this.K0.a(e9Var.b, o5VarA);
        return o5VarA;
    }

    @Override // com.applovin.impl.gd
    protected void a(d9 d9Var, MediaFormat mediaFormat) throws y7 {
        int iD;
        int i;
        d9 d9Var2 = this.O0;
        int[] iArr = null;
        if (d9Var2 != null) {
            d9Var = d9Var2;
        } else if (I() != null) {
            if ("audio/raw".equals(d9Var.m)) {
                iD = d9Var.B;
            } else if (yp.f1214a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                iD = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                iD = yp.d(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                iD = "audio/raw".equals(d9Var.m) ? d9Var.B : 2;
            }
            d9 d9VarA = new d9.b().f("audio/raw").j(iD).e(d9Var.C).f(d9Var.D).c(mediaFormat.getInteger("channel-count")).n(mediaFormat.getInteger("sample-rate")).a();
            if (this.N0 && d9VarA.z == 6 && (i = d9Var.z) < 6) {
                int[] iArr2 = new int[i];
                for (int i2 = 0; i2 < d9Var.z; i2++) {
                    iArr2[i2] = i2;
                }
                iArr = iArr2;
            }
            d9Var = d9VarA;
        }
        try {
            this.L0.a(d9Var, 0, iArr);
        } catch (q1.a e) {
            throw a(e, e.f808a, 5001);
        }
    }

    @Override // com.applovin.impl.gd, com.applovin.impl.d2
    protected void a(long j, boolean z) throws y7 {
        super.a(j, z);
        if (this.T0) {
            this.L0.h();
        } else {
            this.L0.b();
        }
        this.P0 = j;
        this.Q0 = true;
        this.R0 = true;
    }

    @Override // com.applovin.impl.gd
    protected boolean a(long j, long j2, cd cdVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, d9 d9Var) throws y7 {
        a1.a(byteBuffer);
        if (this.O0 != null && (i2 & 2) != 0) {
            ((cd) a1.a(cdVar)).a(i, false);
            return true;
        }
        if (z) {
            if (cdVar != null) {
                cdVar.a(i, false);
            }
            this.E0.f += i3;
            this.L0.i();
            return true;
        }
        try {
            if (!this.L0.a(byteBuffer, j3, i3)) {
                return false;
            }
            if (cdVar != null) {
                cdVar.a(i, false);
            }
            this.E0.e += i3;
            return true;
        } catch (q1.b e) {
            throw a(e, e.c, e.b, 5001);
        } catch (q1.e e2) {
            throw a(e2, d9Var, e2.b, 5002);
        }
    }

    @Override // com.applovin.impl.bd
    public void a(mh mhVar) {
        this.L0.a(mhVar);
    }

    @Override // com.applovin.impl.gd
    protected int a(hd hdVar, d9 d9Var) {
        if (!df.g(d9Var.m)) {
            return mi.CC.a(0);
        }
        int i = yp.f1214a >= 21 ? 32 : 0;
        boolean z = d9Var.F != 0;
        boolean zD = gd.d(d9Var);
        int i2 = 8;
        if (zD && this.L0.a(d9Var) && (!z || id.a() != null)) {
            return mi.CC.a(4, 8, i);
        }
        if ("audio/raw".equals(d9Var.m) && !this.L0.a(d9Var)) {
            return mi.CC.a(1);
        }
        if (!this.L0.a(yp.b(2, d9Var.z, d9Var.A))) {
            return mi.CC.a(1);
        }
        List listA = a(hdVar, d9Var, false);
        if (listA.isEmpty()) {
            return mi.CC.a(1);
        }
        if (!zD) {
            return mi.CC.a(2);
        }
        fd fdVar = (fd) listA.get(0);
        boolean zB = fdVar.b(d9Var);
        if (zB && fdVar.c(d9Var)) {
            i2 = 16;
        }
        return mi.CC.a(zB ? 4 : 3, i2, i);
    }

    protected MediaFormat a(d9 d9Var, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", d9Var.z);
        mediaFormat.setInteger("sample-rate", d9Var.A);
        nd.a(mediaFormat, d9Var.o);
        nd.a(mediaFormat, "max-input-size", i);
        int i2 = yp.f1214a;
        if (i2 >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f != -1.0f && !c0()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (i2 <= 28 && MimeTypes.AUDIO_AC4.equals(d9Var.m)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i2 >= 24 && this.L0.b(yp.b(4, d9Var.z, d9Var.A)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        return mediaFormat;
    }
}
