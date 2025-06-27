package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import java.util.Arrays;
import java.util.Collections;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public final class ea implements o7 {
    private static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final wp f380a;
    private final yg b;
    private final tf e;
    private b f;
    private long g;
    private String h;
    private ro i;
    private boolean j;
    private final boolean[] c = new boolean[4];
    private final a d = new a(128);
    private long k = -9223372036854775807L;

    @Override // com.applovin.impl.o7
    public void b() {
    }

    ea(wp wpVar) {
        this.f380a = wpVar;
        if (wpVar != null) {
            this.e = new tf(Opcodes.GETSTATIC, 128);
            this.b = new yg();
        } else {
            this.e = null;
            this.b = null;
        }
    }

    @Override // com.applovin.impl.o7
    public void a(yg ygVar) {
        a1.b(this.f);
        a1.b(this.i);
        int iD = ygVar.d();
        int iE = ygVar.e();
        byte[] bArrC = ygVar.c();
        this.g += ygVar.a();
        this.i.a(ygVar, ygVar.a());
        while (true) {
            int iA = uf.a(bArrC, iD, iE, this.c);
            if (iA == iE) {
                break;
            }
            int i = iA + 3;
            int i2 = ygVar.c()[i] & 255;
            int i3 = iA - iD;
            int i4 = 0;
            if (!this.j) {
                if (i3 > 0) {
                    this.d.a(bArrC, iD, iA);
                }
                if (this.d.a(i2, i3 < 0 ? -i3 : 0)) {
                    ro roVar = this.i;
                    a aVar = this.d;
                    roVar.a(a(aVar, aVar.d, (String) a1.a((Object) this.h)));
                    this.j = true;
                }
            }
            this.f.a(bArrC, iD, iA);
            tf tfVar = this.e;
            if (tfVar != null) {
                if (i3 > 0) {
                    tfVar.a(bArrC, iD, iA);
                } else {
                    i4 = -i3;
                }
                if (this.e.a(i4)) {
                    tf tfVar2 = this.e;
                    ((yg) yp.a(this.b)).a(this.e.d, uf.c(tfVar2.d, tfVar2.e));
                    ((wp) yp.a(this.f380a)).a(this.k, this.b);
                }
                if (i2 == 178 && ygVar.c()[iA + 2] == 1) {
                    this.e.b(i2);
                }
            }
            int i5 = iE - iA;
            this.f.a(this.g - i5, i5, this.j);
            this.f.a(i2, this.k);
            iD = i;
        }
        if (!this.j) {
            this.d.a(bArrC, iD, iE);
        }
        this.f.a(bArrC, iD, iE);
        tf tfVar3 = this.e;
        if (tfVar3 != null) {
            tfVar3.a(bArrC, iD, iE);
        }
    }

    @Override // com.applovin.impl.o7
    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.h = dVar.b();
        ro roVarA = k8Var.a(dVar.c(), 2);
        this.i = roVarA;
        this.f = new b(roVarA);
        wp wpVar = this.f380a;
        if (wpVar != null) {
            wpVar.a(k8Var, dVar);
        }
    }

    private static final class a {
        private static final byte[] f = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        private boolean f381a;
        private int b;
        public int c;
        public int d;
        public byte[] e;

        public a(int i) {
            this.e = new byte[i];
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.f381a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.e;
                int length = bArr2.length;
                int i4 = this.c + i3;
                if (length < i4) {
                    this.e = Arrays.copyOf(bArr2, i4 * 2);
                }
                System.arraycopy(bArr, i, this.e, this.c, i3);
                this.c += i3;
            }
        }

        public boolean a(int i, int i2) {
            int i3 = this.b;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i == 179 || i == 181) {
                                this.c -= i2;
                                this.f381a = false;
                                return true;
                            }
                        } else if ((i & 240) != 32) {
                            kc.d("H263Reader", "Unexpected start code value");
                            a();
                        } else {
                            this.d = this.c;
                            this.b = 4;
                        }
                    } else if (i > 31) {
                        kc.d("H263Reader", "Unexpected start code value");
                        a();
                    } else {
                        this.b = 3;
                    }
                } else if (i != 181) {
                    kc.d("H263Reader", "Unexpected start code value");
                    a();
                } else {
                    this.b = 2;
                }
            } else if (i == 176) {
                this.b = 1;
                this.f381a = true;
            }
            byte[] bArr = f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void a() {
            this.f381a = false;
            this.c = 0;
            this.b = 0;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final ro f382a;
        private boolean b;
        private boolean c;
        private boolean d;
        private int e;
        private int f;
        private long g;
        private long h;

        public b(ro roVar) {
            this.f382a = roVar;
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.c) {
                int i3 = this.f;
                int i4 = (i + 1) - i3;
                if (i4 < i2) {
                    this.d = ((bArr[i4] & 192) >> 6) == 0;
                    this.c = false;
                } else {
                    this.f = i3 + (i2 - i);
                }
            }
        }

        public void a(long j, int i, boolean z) {
            if (this.e == 182 && z && this.b) {
                long j2 = this.h;
                if (j2 != -9223372036854775807L) {
                    this.f382a.a(j2, this.d ? 1 : 0, (int) (j - this.g), i, null);
                }
            }
            if (this.e != 179) {
                this.g = j;
            }
        }

        public void a(int i, long j) {
            this.e = i;
            this.d = false;
            this.b = i == 182 || i == 179;
            this.c = i == 182;
            this.f = 0;
            this.h = j;
        }

        public void a() {
            this.b = false;
            this.c = false;
            this.d = false;
            this.e = -1;
        }
    }

    @Override // com.applovin.impl.o7
    public void a(long j, int i) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    private static d9 a(a aVar, int i, String str) {
        byte[] bArrCopyOf = Arrays.copyOf(aVar.e, aVar.c);
        xg xgVar = new xg(bArrCopyOf);
        xgVar.e(i);
        xgVar.e(4);
        xgVar.g();
        xgVar.d(8);
        if (xgVar.f()) {
            xgVar.d(4);
            xgVar.d(3);
        }
        int iA = xgVar.a(4);
        float f = 1.0f;
        if (iA == 15) {
            int iA2 = xgVar.a(8);
            int iA3 = xgVar.a(8);
            if (iA3 == 0) {
                kc.d("H263Reader", "Invalid aspect ratio");
            } else {
                f = iA2 / iA3;
            }
        } else {
            float[] fArr = l;
            if (iA < fArr.length) {
                f = fArr[iA];
            } else {
                kc.d("H263Reader", "Invalid aspect ratio");
            }
        }
        if (xgVar.f()) {
            xgVar.d(2);
            xgVar.d(1);
            if (xgVar.f()) {
                xgVar.d(15);
                xgVar.g();
                xgVar.d(15);
                xgVar.g();
                xgVar.d(15);
                xgVar.g();
                xgVar.d(3);
                xgVar.d(11);
                xgVar.g();
                xgVar.d(15);
                xgVar.g();
            }
        }
        if (xgVar.a(2) != 0) {
            kc.d("H263Reader", "Unhandled video object layer shape");
        }
        xgVar.g();
        int iA4 = xgVar.a(16);
        xgVar.g();
        if (xgVar.f()) {
            if (iA4 == 0) {
                kc.d("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i2 = 0;
                for (int i3 = iA4 - 1; i3 > 0; i3 >>= 1) {
                    i2++;
                }
                xgVar.d(i2);
            }
        }
        xgVar.g();
        int iA5 = xgVar.a(13);
        xgVar.g();
        int iA6 = xgVar.a(13);
        xgVar.g();
        xgVar.g();
        return new d9.b().c(str).f("video/mp4v-es").q(iA5).g(iA6).b(f).a(Collections.singletonList(bArrCopyOf)).a();
    }

    @Override // com.applovin.impl.o7
    public void a() {
        uf.a(this.c);
        this.d.a();
        b bVar = this.f;
        if (bVar != null) {
            bVar.a();
        }
        tf tfVar = this.e;
        if (tfVar != null) {
            tfVar.b();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }
}
