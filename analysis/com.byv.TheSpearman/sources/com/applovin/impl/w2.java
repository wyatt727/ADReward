package com.applovin.impl;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.core.view.InputDeviceCompat;
import com.applovin.impl.z4;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public final class w2 extends y2 {
    private final int h;
    private final int i;
    private final int j;
    private final long k;
    private List n;
    private List o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private byte t;
    private byte u;
    private boolean w;
    private long x;
    private static final int[] y = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] z = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, InputDeviceCompat.SOURCE_ANY, -65281};
    private static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] C = {Opcodes.FRETURN, Opcodes.ARETURN, 189, Opcodes.ATHROW, 8482, Opcodes.IF_ICMPGE, Opcodes.IF_ICMPGT, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] D = {Opcodes.INSTANCEOF, 201, 211, 218, 220, 252, 8216, Opcodes.IF_ICMPLT, 42, 39, 8212, Opcodes.RET, 8480, 8226, 8220, 8221, 192, Opcodes.MONITORENTER, Opcodes.IFNONNULL, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, Opcodes.LOOKUPSWITCH, Opcodes.NEW};
    private static final int[] E = {Opcodes.MONITOREXIT, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, Opcodes.IF_ACMPEQ, Opcodes.IF_ICMPLE, 9474, Opcodes.MULTIANEWARRAY, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final yg g = new yg();
    private final ArrayList l = new ArrayList();
    private a m = new a(0, 4);
    private int v = 0;

    private static int b(byte b) {
        return (b >> 3) & 1;
    }

    private static boolean c(byte b, byte b2) {
        return (b & 246) == 18 && (b2 & 224) == 32;
    }

    private static boolean d(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    private static boolean e(byte b, byte b2) {
        return (b & 246) == 20 && (b2 & 240) == 32;
    }

    private static boolean f(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    private static boolean g(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 48;
    }

    private static boolean h(byte b) {
        return (b & 224) == 0;
    }

    private static boolean h(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    private static boolean i(byte b) {
        return (b & 240) == 16;
    }

    private static boolean j(byte b) {
        return (b & 247) == 20;
    }

    private static boolean k(byte b) {
        return 1 <= b && b <= 15;
    }

    @Override // com.applovin.impl.y2, com.applovin.impl.k5
    public void a() {
    }

    @Override // com.applovin.impl.y2
    /* renamed from: f */
    public /* bridge */ /* synthetic */ ol d() {
        return super.d();
    }

    public w2(String str, int i, long j) {
        this.k = j > 0 ? j * 1000 : -9223372036854775807L;
        this.h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.j = 0;
            this.i = 0;
        } else if (i == 2) {
            this.j = 1;
            this.i = 0;
        } else if (i == 3) {
            this.j = 0;
            this.i = 1;
        } else if (i != 4) {
            kc.d("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.j = 0;
            this.i = 0;
        } else {
            this.j = 1;
            this.i = 1;
        }
        a(0);
        m();
        this.w = true;
        this.x = -9223372036854775807L;
    }

    @Override // com.applovin.impl.y2, com.applovin.impl.k5
    public void b() {
        super.b();
        this.n = null;
        this.o = null;
        a(0);
        b(4);
        m();
        this.r = false;
        this.s = false;
        this.t = (byte) 0;
        this.u = (byte) 0;
        this.v = 0;
        this.w = true;
        this.x = -9223372036854775807L;
    }

    @Override // com.applovin.impl.y2, com.applovin.impl.k5
    /* renamed from: g */
    public pl c() {
        pl plVarH;
        pl plVarC = super.c();
        if (plVarC != null) {
            return plVarC;
        }
        if (!n() || (plVarH = h()) == null) {
            return null;
        }
        this.n = Collections.emptyList();
        this.x = -9223372036854775807L;
        plVarH.a(i(), e(), Long.MAX_VALUE);
        return plVarH;
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    @Override // com.applovin.impl.y2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void a(com.applovin.impl.ol r10) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.w2.a(com.applovin.impl.ol):void");
    }

    private void f(byte b) {
        this.m.a(' ');
        this.m.a((b >> 1) & 7, (b & 1) == 1);
    }

    private List l() {
        int size = this.l.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            z4 z4VarA = ((a) this.l.get(i)).a(Integer.MIN_VALUE);
            arrayList.add(z4VarA);
            if (z4VarA != null) {
                iMin = Math.min(iMin, z4VarA.j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            z4 z4Var = (z4) arrayList.get(i2);
            if (z4Var != null) {
                if (z4Var.j != iMin) {
                    z4Var = (z4) a1.a(((a) this.l.get(i2)).a(iMin));
                }
                arrayList2.add(z4Var);
            }
        }
        return arrayList2;
    }

    private void m() {
        this.m.b(this.p);
        this.l.clear();
        this.l.add(this.m);
    }

    private void i(byte b, byte b2) {
        if (k(b)) {
            this.w = false;
            return;
        }
        if (j(b)) {
            if (b2 != 32 && b2 != 47) {
                switch (b2) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b2) {
                            case 42:
                            case 43:
                                this.w = false;
                                break;
                        }
                }
            }
            this.w = true;
        }
    }

    private static char d(byte b) {
        return (char) E[b & 31];
    }

    private static char c(byte b) {
        return (char) D[b & 31];
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f1111a = new ArrayList();
        private final List b = new ArrayList();
        private final StringBuilder c = new StringBuilder();
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;

        public a(int i, int i2) {
            b(i);
            this.h = i2;
        }

        public void d() {
            this.b.add(b());
            this.c.setLength(0);
            this.f1111a.clear();
            int iMin = Math.min(this.h, this.d);
            while (this.b.size() >= iMin) {
                this.b.remove(0);
            }
        }

        /* renamed from: com.applovin.impl.w2$a$a, reason: collision with other inner class name */
        private static class C0049a {

            /* renamed from: a, reason: collision with root package name */
            public final int f1112a;
            public final boolean b;
            public int c;

            public C0049a(int i, boolean z, int i2) {
                this.f1112a = i;
                this.b = z;
                this.c = i2;
            }
        }

        public void b(int i) {
            this.g = i;
            this.f1111a.clear();
            this.b.clear();
            this.c.setLength(0);
            this.d = 15;
            this.e = 0;
            this.f = 0;
        }

        public boolean c() {
            return this.f1111a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
        }

        public void d(int i) {
            this.h = i;
        }

        public void a(char c) {
            if (this.c.length() < 32) {
                this.c.append(c);
            }
        }

        public void c(int i) {
            this.g = i;
        }

        private static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        private SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
            int length = spannableStringBuilder.length();
            int i = 0;
            int i2 = 0;
            boolean z = false;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            while (i < this.f1111a.size()) {
                C0049a c0049a = (C0049a) this.f1111a.get(i);
                boolean z2 = c0049a.b;
                int i7 = c0049a.f1112a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i6 = w2.A[i7];
                    }
                    z = z3;
                }
                int i8 = c0049a.c;
                i++;
                if (i8 != (i < this.f1111a.size() ? ((C0049a) this.f1111a.get(i)).c : length)) {
                    if (i3 != -1 && !z2) {
                        b(spannableStringBuilder, i3, i8);
                        i3 = -1;
                    } else if (i3 == -1 && z2) {
                        i3 = i8;
                    }
                    if (i4 != -1 && !z) {
                        a(spannableStringBuilder, i4, i8);
                        i4 = -1;
                    } else if (i4 == -1 && z) {
                        i4 = i8;
                    }
                    if (i6 != i5) {
                        a(spannableStringBuilder, i2, i8, i5);
                        i5 = i6;
                        i2 = i8;
                    }
                }
            }
            if (i3 != -1 && i3 != length) {
                b(spannableStringBuilder, i3, length);
            }
            if (i4 != -1 && i4 != length) {
                a(spannableStringBuilder, i4, length);
            }
            if (i2 != length) {
                a(spannableStringBuilder, i2, length, i5);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void a() {
            int length = this.c.length();
            if (length > 0) {
                this.c.delete(length - 1, length);
                for (int size = this.f1111a.size() - 1; size >= 0; size--) {
                    C0049a c0049a = (C0049a) this.f1111a.get(size);
                    int i = c0049a.c;
                    if (i != length) {
                        return;
                    }
                    c0049a.c = i - 1;
                }
            }
        }

        public z4 a(int i) {
            float f;
            int i2 = this.e + this.f;
            int i3 = 32 - i2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.b.size(); i4++) {
                spannableStringBuilder.append(yp.a((CharSequence) this.b.get(i4), i3));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(yp.a(b(), i3));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i3 - spannableStringBuilder.length();
            int i5 = i2 - length;
            if (i == Integer.MIN_VALUE) {
                if (this.g != 2 || (Math.abs(i5) >= 3 && length >= 0)) {
                    i = (this.g != 2 || i5 <= 0) ? 0 : 2;
                } else {
                    i = 1;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    i2 = 32 - length;
                }
                f = ((i2 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i6 = this.d;
            if (i6 > 7) {
                i6 -= 17;
            } else if (this.g == 1) {
                i6 -= this.h - 1;
            }
            return new z4.b().a(spannableStringBuilder).b(Layout.Alignment.ALIGN_NORMAL).a(i6, 1).b(f).b(i).a();
        }

        private static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        }

        private static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        public void a(int i, boolean z) {
            this.f1111a.add(new C0049a(i, z, this.c.length()));
        }
    }

    private void b(byte b, byte b2) {
        int i = y[b & 7];
        if ((b2 & 32) != 0) {
            i++;
        }
        if (i != this.m.d) {
            if (this.p != 1 && !this.m.c()) {
                a aVar = new a(this.p, this.q);
                this.m = aVar;
                this.l.add(aVar);
            }
            this.m.d = i;
        }
        boolean z2 = (b2 & 16) == 16;
        boolean z3 = (b2 & 1) == 1;
        int i2 = (b2 >> 1) & 7;
        this.m.a(z2 ? 8 : i2, z3);
        if (z2) {
            this.m.e = z[i2];
        }
    }

    private void g(byte b) {
        if (b == 32) {
            a(2);
            return;
        }
        if (b != 41) {
            switch (b) {
                case 37:
                    a(1);
                    b(2);
                    break;
                case 38:
                    a(1);
                    b(3);
                    break;
                case 39:
                    a(1);
                    b(4);
                    break;
                default:
                    int i = this.p;
                    if (i != 0) {
                        if (b != 33) {
                            switch (b) {
                                case 44:
                                    this.n = Collections.emptyList();
                                    int i2 = this.p;
                                    if (i2 == 1 || i2 == 3) {
                                        m();
                                        break;
                                    }
                                case 45:
                                    if (i == 1 && !this.m.c()) {
                                        this.m.d();
                                        break;
                                    }
                                    break;
                                case 46:
                                    m();
                                    break;
                                case 47:
                                    this.n = l();
                                    m();
                                    break;
                            }
                        } else {
                            this.m.a();
                            break;
                        }
                    }
                    break;
            }
            return;
        }
        a(3);
    }

    @Override // com.applovin.impl.y2
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void a(ol olVar) {
        super.a(olVar);
    }

    private boolean n() {
        return (this.k == -9223372036854775807L || this.x == -9223372036854775807L || i() - this.x < this.k) ? false : true;
    }

    private static char e(byte b) {
        return (char) C[b & 15];
    }

    private boolean l(byte b) {
        if (h(b)) {
            this.v = b(b);
        }
        return this.v == this.j;
    }

    private static char a(byte b) {
        return (char) B[(b & Byte.MAX_VALUE) - 32];
    }

    private void b(int i) {
        this.q = i;
        this.m.d(i);
    }

    private static char a(byte b, byte b2) {
        if ((b & 1) == 0) {
            return c(b2);
        }
        return d(b2);
    }

    private boolean a(boolean z2, byte b, byte b2) {
        if (z2 && i(b)) {
            if (this.s && this.t == b && this.u == b2) {
                this.s = false;
                return true;
            }
            this.s = true;
            this.t = b;
            this.u = b2;
        } else {
            this.s = false;
        }
        return false;
    }

    private void a(int i) {
        int i2 = this.p;
        if (i2 == i) {
            return;
        }
        this.p = i;
        if (i == 3) {
            for (int i3 = 0; i3 < this.l.size(); i3++) {
                ((a) this.l.get(i3)).c(i);
            }
            return;
        }
        m();
        if (i2 == 3 || i == 1 || i == 0) {
            this.n = Collections.emptyList();
        }
    }

    @Override // com.applovin.impl.y2, com.applovin.impl.ll
    public /* bridge */ /* synthetic */ void a(long j) {
        super.a(j);
    }
}
