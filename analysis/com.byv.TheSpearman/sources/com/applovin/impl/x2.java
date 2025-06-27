package com.applovin.impl;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.applovin.impl.x2;
import com.applovin.impl.z4;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.text.Typography;
import okio.Utf8;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public final class x2 extends y2 {
    private final yg g = new yg();
    private final xg h = new xg();
    private int i = -1;
    private final boolean j;
    private final int k;
    private final b[] l;
    private b m;
    private List n;
    private List o;
    private c p;
    private int q;

    private List l() {
        a aVarB;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.l[i].f() && this.l[i].g() && (aVarB = this.l[i].b()) != null) {
                arrayList.add(aVarB);
            }
        }
        Collections.sort(arrayList, a.c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((a) arrayList.get(i2)).f1152a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    @Override // com.applovin.impl.y2
    /* renamed from: f */
    public /* bridge */ /* synthetic */ ol d() {
        return super.d();
    }

    @Override // com.applovin.impl.y2
    /* renamed from: g */
    public /* bridge */ /* synthetic */ pl c() {
        return super.c();
    }

    public x2(int i, List list) {
        this.k = i == -1 ? 1 : i;
        this.j = list != null && m3.a(list);
        this.l = new b[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.l[i2] = new b();
        }
        this.m = this.l[0];
    }

    @Override // com.applovin.impl.y2, com.applovin.impl.k5
    public void b() {
        super.b();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        r();
        this.p = null;
    }

    @Override // com.applovin.impl.y2
    protected boolean j() {
        return this.n != this.o;
    }

    @Override // com.applovin.impl.y2
    protected kl e() {
        List list = this.n;
        this.o = list;
        return new z2((List) a1.a(list));
    }

    @Override // com.applovin.impl.y2
    protected void a(ol olVar) {
        ByteBuffer byteBuffer = (ByteBuffer) a1.a(olVar.c);
        this.g.a(byteBuffer.array(), byteBuffer.limit());
        while (this.g.a() >= 3) {
            int iW = this.g.w();
            int i = iW & 3;
            boolean z = (iW & 4) == 4;
            byte bW = (byte) this.g.w();
            byte bW2 = (byte) this.g.w();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        k();
                        int i2 = (bW & 192) >> 6;
                        int i3 = this.i;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            r();
                            kc.d("Cea708Decoder", "Sequence number discontinuity. previous=" + this.i + " current=" + i2);
                        }
                        this.i = i2;
                        int i4 = bW & Utf8.REPLACEMENT_BYTE;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        c cVar = new c(i2, i4);
                        this.p = cVar;
                        byte[] bArr = cVar.c;
                        int i5 = cVar.d;
                        cVar.d = i5 + 1;
                        bArr[i5] = bW2;
                    } else {
                        a1.a(i == 2);
                        c cVar2 = this.p;
                        if (cVar2 == null) {
                            kc.b("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.c;
                            int i6 = cVar2.d;
                            bArr2[i6] = bW;
                            cVar2.d = i6 + 2;
                            bArr2[i6 + 1] = bW2;
                        }
                    }
                    c cVar3 = this.p;
                    if (cVar3.d == (cVar3.b * 2) - 1) {
                        k();
                    }
                }
            }
        }
    }

    private void k() {
        if (this.p == null) {
            return;
        }
        q();
        this.p = null;
    }

    private void q() {
        c cVar = this.p;
        if (cVar.d != (cVar.b * 2) - 1) {
            kc.a("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.p.b * 2) - 1) + ", but current index is " + this.p.d + " (sequence number " + this.p.f1154a + ");");
        }
        xg xgVar = this.h;
        c cVar2 = this.p;
        xgVar.a(cVar2.c, cVar2.d);
        int iA = this.h.a(3);
        int iA2 = this.h.a(5);
        if (iA == 7) {
            this.h.d(2);
            iA = this.h.a(6);
            if (iA < 7) {
                kc.d("Cea708Decoder", "Invalid extended service number: " + iA);
            }
        }
        if (iA2 == 0) {
            if (iA != 0) {
                kc.d("Cea708Decoder", "serviceNumber is non-zero (" + iA + ") when blockSize is 0");
                return;
            }
            return;
        }
        if (iA != this.k) {
            return;
        }
        boolean z = false;
        while (this.h.b() > 0) {
            int iA3 = this.h.a(8);
            if (iA3 == 16) {
                int iA4 = this.h.a(8);
                if (iA4 <= 31) {
                    c(iA4);
                } else {
                    if (iA4 <= 127) {
                        h(iA4);
                    } else if (iA4 <= 159) {
                        d(iA4);
                    } else if (iA4 <= 255) {
                        i(iA4);
                    } else {
                        kc.d("Cea708Decoder", "Invalid extended command: " + iA4);
                    }
                    z = true;
                }
            } else if (iA3 <= 31) {
                a(iA3);
            } else {
                if (iA3 <= 127) {
                    f(iA3);
                } else if (iA3 <= 159) {
                    b(iA3);
                } else if (iA3 <= 255) {
                    g(iA3);
                } else {
                    kc.d("Cea708Decoder", "Invalid base command: " + iA3);
                }
                z = true;
            }
        }
        if (z) {
            this.n = l();
        }
    }

    private void c(int i) {
        if (i <= 7) {
            return;
        }
        if (i <= 15) {
            this.h.d(8);
        } else if (i <= 23) {
            this.h.d(16);
        } else if (i <= 31) {
            this.h.d(24);
        }
    }

    private void d(int i) {
        if (i <= 135) {
            this.h.d(32);
            return;
        }
        if (i <= 143) {
            this.h.d(40);
        } else if (i <= 159) {
            this.h.d(2);
            this.h.d(this.h.a(6) * 8);
        }
    }

    private void f(int i) {
        if (i == 127) {
            this.m.a((char) 9835);
        } else {
            this.m.a((char) (i & 255));
        }
    }

    private void g(int i) {
        this.m.a((char) (i & 255));
    }

    private void h(int i) {
        if (i == 32) {
            this.m.a(' ');
            return;
        }
        if (i == 33) {
            this.m.a(Typography.nbsp);
            return;
        }
        if (i == 37) {
            this.m.a(Typography.ellipsis);
            return;
        }
        if (i == 42) {
            this.m.a((char) 352);
            return;
        }
        if (i == 44) {
            this.m.a((char) 338);
            return;
        }
        if (i == 63) {
            this.m.a((char) 376);
            return;
        }
        if (i == 57) {
            this.m.a(Typography.tm);
            return;
        }
        if (i == 58) {
            this.m.a((char) 353);
            return;
        }
        if (i == 60) {
            this.m.a((char) 339);
            return;
        }
        if (i != 61) {
            switch (i) {
                case 48:
                    this.m.a((char) 9608);
                    break;
                case 49:
                    this.m.a(Typography.leftSingleQuote);
                    break;
                case 50:
                    this.m.a(Typography.rightSingleQuote);
                    break;
                case 51:
                    this.m.a(Typography.leftDoubleQuote);
                    break;
                case 52:
                    this.m.a(Typography.rightDoubleQuote);
                    break;
                case 53:
                    this.m.a(Typography.bullet);
                    break;
                default:
                    switch (i) {
                        case 118:
                            this.m.a((char) 8539);
                            break;
                        case 119:
                            this.m.a((char) 8540);
                            break;
                        case 120:
                            this.m.a((char) 8541);
                            break;
                        case 121:
                            this.m.a((char) 8542);
                            break;
                        case 122:
                            this.m.a((char) 9474);
                            break;
                        case 123:
                            this.m.a((char) 9488);
                            break;
                        case 124:
                            this.m.a((char) 9492);
                            break;
                        case 125:
                            this.m.a((char) 9472);
                            break;
                        case 126:
                            this.m.a((char) 9496);
                            break;
                        case 127:
                            this.m.a((char) 9484);
                            break;
                        default:
                            kc.d("Cea708Decoder", "Invalid G2 character: " + i);
                            break;
                    }
            }
            return;
        }
        this.m.a((char) 8480);
    }

    private void i(int i) {
        if (i == 160) {
            this.m.a((char) 13252);
            return;
        }
        kc.d("Cea708Decoder", "Invalid G3 character: " + i);
        this.m.a('_');
    }

    private void a(int i) {
        if (i != 0) {
            if (i == 3) {
                this.n = l();
                return;
            }
            if (i != 8) {
                switch (i) {
                    case 12:
                        r();
                        break;
                    case 13:
                        this.m.a('\n');
                        break;
                    case 14:
                        break;
                    default:
                        if (i >= 17 && i <= 23) {
                            kc.d("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i);
                            this.h.d(8);
                            break;
                        } else if (i >= 24 && i <= 31) {
                            kc.d("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i);
                            this.h.d(16);
                            break;
                        } else {
                            kc.d("Cea708Decoder", "Invalid C0 command: " + i);
                            break;
                        }
                        break;
                }
                return;
            }
            this.m.a();
        }
    }

    private void m() {
        this.m.a(this.h.a(4), this.h.a(2), this.h.a(2), this.h.f(), this.h.f(), this.h.a(3), this.h.a(3));
    }

    private void n() {
        int iA = b.a(this.h.a(2), this.h.a(2), this.h.a(2), this.h.a(2));
        int iA2 = b.a(this.h.a(2), this.h.a(2), this.h.a(2), this.h.a(2));
        this.h.d(2);
        this.m.b(iA, iA2, b.a(this.h.a(2), this.h.a(2), this.h.a(2)));
    }

    private void o() {
        this.h.d(4);
        int iA = this.h.a(4);
        this.h.d(2);
        this.m.a(iA, this.h.a(6));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void b(int i) {
        int i2 = 1;
        switch (i) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i3 = i - 128;
                if (this.q != i3) {
                    this.q = i3;
                    this.m = this.l[i3];
                    break;
                }
                break;
            case 136:
                while (i2 <= 8) {
                    if (this.h.f()) {
                        this.l[8 - i2].d();
                    }
                    i2++;
                }
                break;
            case 137:
                for (int i4 = 1; i4 <= 8; i4++) {
                    if (this.h.f()) {
                        this.l[8 - i4].a(true);
                    }
                }
                break;
            case 138:
                while (i2 <= 8) {
                    if (this.h.f()) {
                        this.l[8 - i2].a(false);
                    }
                    i2++;
                }
                break;
            case Opcodes.F2I /* 139 */:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.h.f()) {
                        this.l[8 - i5].a(!r0.g());
                    }
                }
                break;
            case 140:
                while (i2 <= 8) {
                    if (this.h.f()) {
                        this.l[8 - i2].h();
                    }
                    i2++;
                }
                break;
            case Opcodes.F2D /* 141 */:
                this.h.d(8);
                break;
            case Opcodes.D2I /* 142 */:
                break;
            case Opcodes.D2L /* 143 */:
                r();
                break;
            case Opcodes.D2F /* 144 */:
                if (!this.m.e()) {
                    this.h.d(16);
                    break;
                } else {
                    m();
                    break;
                }
            case Opcodes.I2B /* 145 */:
                if (!this.m.e()) {
                    this.h.d(24);
                    break;
                } else {
                    n();
                    break;
                }
            case Opcodes.I2C /* 146 */:
                if (!this.m.e()) {
                    this.h.d(16);
                    break;
                } else {
                    o();
                    break;
                }
            case Opcodes.I2S /* 147 */:
            case Opcodes.LCMP /* 148 */:
            case Opcodes.FCMPL /* 149 */:
            case 150:
            default:
                kc.d("Cea708Decoder", "Invalid C1 command: " + i);
                break;
            case Opcodes.DCMPL /* 151 */:
                if (!this.m.e()) {
                    this.h.d(32);
                    break;
                } else {
                    p();
                    break;
                }
            case Opcodes.DCMPG /* 152 */:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case Opcodes.IF_ICMPEQ /* 159 */:
                int i6 = i - 152;
                e(i6);
                if (this.q != i6) {
                    this.q = i6;
                    this.m = this.l[i6];
                    break;
                }
                break;
        }
    }

    private void p() {
        int iA = b.a(this.h.a(2), this.h.a(2), this.h.a(2), this.h.a(2));
        int iA2 = this.h.a(2);
        int iA3 = b.a(this.h.a(2), this.h.a(2), this.h.a(2));
        if (this.h.f()) {
            iA2 |= 4;
        }
        boolean zF = this.h.f();
        int iA4 = this.h.a(2);
        int iA5 = this.h.a(2);
        int iA6 = this.h.a(2);
        this.h.d(8);
        this.m.a(iA, iA3, zF, iA2, iA4, iA5, iA6);
    }

    @Override // com.applovin.impl.y2, com.applovin.impl.k5
    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.applovin.impl.y2, com.applovin.impl.ll
    public /* bridge */ /* synthetic */ void a(long j) {
        super.a(j);
    }

    @Override // com.applovin.impl.y2
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void a(ol olVar) {
        super.a(olVar);
    }

    private void r() {
        for (int i = 0; i < 8; i++) {
            this.l[i].h();
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f1154a;
        public final int b;
        public final byte[] c;
        int d = 0;

        public c(int i, int i2) {
            this.f1154a = i;
            this.b = i2;
            this.c = new byte[(i2 * 2) - 1];
        }
    }

    private static final class b {
        private static final int[] A;
        private static final int[] B;
        private static final boolean[] C;
        private static final int[] D;
        private static final int[] E;
        private static final int[] F;
        private static final int[] G;
        public static final int w = a(2, 2, 2, 0);
        public static final int x;
        public static final int y;
        private static final int[] z;

        /* renamed from: a, reason: collision with root package name */
        private final List f1153a = new ArrayList();
        private final SpannableStringBuilder b = new SpannableStringBuilder();
        private boolean c;
        private boolean d;
        private int e;
        private boolean f;
        private int g;
        private int h;
        private int i;
        private int j;
        private boolean k;
        private int l;
        private int m;
        private int n;
        private int o;
        private int p;
        private int q;
        private int r;
        private int s;
        private int t;
        private int u;
        private int v;

        public SpannableString c() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.p, length, 33);
                }
                if (this.q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.q, length, 33);
                }
                if (this.r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.s), this.r, length, 33);
                }
                if (this.t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.u), this.t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        static {
            int iA = a(0, 0, 0, 0);
            x = iA;
            int iA2 = a(0, 0, 0, 3);
            y = iA2;
            z = new int[]{0, 0, 0, 0, 0, 2, 0};
            A = new int[]{0, 0, 0, 0, 0, 0, 2};
            B = new int[]{3, 3, 3, 3, 3, 3, 1};
            C = new boolean[]{false, false, false, true, true, true, false};
            D = new int[]{iA, iA2, iA, iA, iA2, iA, iA};
            E = new int[]{0, 1, 2, 3, 4, 3, 4};
            F = new int[]{0, 0, 0, 0, 0, 3, 3};
            G = new int[]{iA, iA, iA, iA, iA, iA2, iA2};
        }

        public b() {
            h();
        }

        public boolean f() {
            return !e() || (this.f1153a.isEmpty() && this.b.length() == 0);
        }

        public void h() {
            d();
            this.c = false;
            this.d = false;
            this.e = 4;
            this.f = false;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 15;
            this.k = true;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            int i = x;
            this.o = i;
            this.s = w;
            this.u = i;
        }

        public void d() {
            this.f1153a.clear();
            this.b.clear();
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.t = -1;
            this.v = 0;
        }

        public boolean e() {
            return this.c;
        }

        public boolean g() {
            return this.d;
        }

        public void a(char c) {
            if (c == '\n') {
                this.f1153a.add(c());
                this.b.clear();
                if (this.p != -1) {
                    this.p = 0;
                }
                if (this.q != -1) {
                    this.q = 0;
                }
                if (this.r != -1) {
                    this.r = 0;
                }
                if (this.t != -1) {
                    this.t = 0;
                }
                while (true) {
                    if ((!this.k || this.f1153a.size() < this.j) && this.f1153a.size() < 15) {
                        return;
                    } else {
                        this.f1153a.remove(0);
                    }
                }
            } else {
                this.b.append(c);
            }
        }

        public a b() {
            Layout.Alignment alignment;
            float f;
            float f2;
            if (f()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i = 0; i < this.f1153a.size(); i++) {
                spannableStringBuilder.append((CharSequence) this.f1153a.get(i));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) c());
            int i2 = this.l;
            if (i2 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i2 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i2 == 2) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                if (i2 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.l);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            Layout.Alignment alignment2 = alignment;
            if (this.f) {
                f = this.h / 99.0f;
                f2 = this.g / 99.0f;
            } else {
                f = this.h / 209.0f;
                f2 = this.g / 74.0f;
            }
            float f3 = (f * 0.9f) + 0.05f;
            float f4 = (f2 * 0.9f) + 0.05f;
            int i3 = this.i;
            int i4 = i3 / 3;
            int i5 = i3 % 3;
            return new a(spannableStringBuilder, alignment2, f4, 0, i4 == 0 ? 0 : i4 == 1 ? 1 : 2, f3, i5 == 0 ? 0 : i5 == 1 ? 1 : 2, -3.4028235E38f, this.o != x, this.o, this.e);
        }

        public void a() {
            int length = this.b.length();
            if (length > 0) {
                this.b.delete(length - 1, length);
            }
        }

        public void b(int i, int i2, int i3) {
            if (this.r != -1 && this.s != i) {
                this.b.setSpan(new ForegroundColorSpan(this.s), this.r, this.b.length(), 33);
            }
            if (i != w) {
                this.r = this.b.length();
                this.s = i;
            }
            if (this.t != -1 && this.u != i2) {
                this.b.setSpan(new BackgroundColorSpan(this.u), this.t, this.b.length(), 33);
            }
            if (i2 != x) {
                this.t = this.b.length();
                this.u = i2;
            }
        }

        public void a(boolean z2, boolean z3, boolean z4, int i, boolean z5, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.c = true;
            this.d = z2;
            this.k = z3;
            this.e = i;
            this.f = z5;
            this.g = i2;
            this.h = i3;
            this.i = i6;
            int i9 = i4 + 1;
            if (this.j != i9) {
                this.j = i9;
                while (true) {
                    if ((!z3 || this.f1153a.size() < this.j) && this.f1153a.size() < 15) {
                        break;
                    } else {
                        this.f1153a.remove(0);
                    }
                }
            }
            if (i7 != 0 && this.m != i7) {
                this.m = i7;
                int i10 = i7 - 1;
                a(D[i10], y, C[i10], 0, A[i10], B[i10], z[i10]);
            }
            if (i8 == 0 || this.n == i8) {
                return;
            }
            this.n = i8;
            int i11 = i8 - 1;
            a(0, 1, 1, false, false, F[i11], E[i11]);
            b(w, G[i11], x);
        }

        public static int a(int i, int i2, int i3) {
            return a(i, i2, i3, 0);
        }

        public static int a(int i, int i2, int i3, int i4) {
            a1.a(i, 0, 4);
            a1.a(i2, 0, 4);
            a1.a(i3, 0, 4);
            a1.a(i4, 0, 4);
            return Color.argb(i4 != 2 ? i4 != 3 ? 255 : 0 : 127, i > 1 ? 255 : 0, i2 > 1 ? 255 : 0, i3 > 1 ? 255 : 0);
        }

        public void a(int i, int i2, int i3, boolean z2, boolean z3, int i4, int i5) {
            if (this.p != -1) {
                if (!z2) {
                    this.b.setSpan(new StyleSpan(2), this.p, this.b.length(), 33);
                    this.p = -1;
                }
            } else if (z2) {
                this.p = this.b.length();
            }
            if (this.q == -1) {
                if (z3) {
                    this.q = this.b.length();
                }
            } else {
                if (z3) {
                    return;
                }
                this.b.setSpan(new UnderlineSpan(), this.q, this.b.length(), 33);
                this.q = -1;
            }
        }

        public void a(int i, int i2) {
            if (this.v != i) {
                a('\n');
            }
            this.v = i;
        }

        public void a(boolean z2) {
            this.d = z2;
        }

        public void a(int i, int i2, boolean z2, int i3, int i4, int i5, int i6) {
            this.o = i;
            this.l = i6;
        }
    }

    private void e(int i) {
        b bVar = this.l[i];
        this.h.d(2);
        boolean zF = this.h.f();
        boolean zF2 = this.h.f();
        boolean zF3 = this.h.f();
        int iA = this.h.a(3);
        boolean zF4 = this.h.f();
        int iA2 = this.h.a(7);
        int iA3 = this.h.a(8);
        int iA4 = this.h.a(4);
        int iA5 = this.h.a(4);
        this.h.d(2);
        int iA6 = this.h.a(6);
        this.h.d(2);
        bVar.a(zF, zF2, zF3, iA, zF4, iA2, iA3, iA5, iA6, iA4, this.h.a(3), this.h.a(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {
        private static final Comparator c = new Comparator() { // from class: com.applovin.impl.x2$a$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return x2.a.a((x2.a) obj, (x2.a) obj2);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final z4 f1152a;
        public final int b;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(a aVar, a aVar2) {
            return Integer.compare(aVar2.b, aVar.b);
        }

        public a(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
            z4.b bVarD = new z4.b().a(charSequence).b(alignment).a(f, i).a(i2).b(f2).b(i3).d(f3);
            if (z) {
                bVarD.d(i4);
            }
            this.f1152a = bVarD.a();
            this.b = i5;
        }
    }
}
