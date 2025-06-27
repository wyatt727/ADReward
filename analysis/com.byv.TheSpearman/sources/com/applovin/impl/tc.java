package com.applovin.impl;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.applovin.impl.ej;
import com.applovin.impl.ro;
import com.applovin.impl.w6;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.firebase.FirebaseError;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public class tc implements i8 {
    public static final m8 b0 = new m8() { // from class: com.applovin.impl.tc$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m8
        public final i8[] a() {
            return tc.g();
        }

        @Override // com.applovin.impl.m8
        public /* synthetic */ i8[] a(Uri uri, Map map) {
            return a();
        }
    };
    private static final byte[] c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] d0 = yp.c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final UUID f0 = new UUID(72057594037932032L, -9223371306706625679L);
    private static final Map g0;
    private long A;
    private long B;
    private mc C;
    private mc D;
    private boolean E;
    private boolean F;
    private int G;
    private long H;
    private long I;
    private int J;
    private int K;
    private int[] L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private int R;
    private int S;
    private int T;
    private boolean U;
    private boolean V;
    private boolean W;
    private int X;
    private byte Y;
    private boolean Z;

    /* renamed from: a, reason: collision with root package name */
    private final n7 f1027a;
    private k8 a0;
    private final aq b;
    private final SparseArray c;
    private final boolean d;
    private final yg e;
    private final yg f;
    private final yg g;
    private final yg h;
    private final yg i;
    private final yg j;
    private final yg k;
    private final yg l;
    private final yg m;
    private final yg n;
    private ByteBuffer o;
    private long p;
    private long q;
    private long r;
    private long s;
    private long t;
    private c u;
    private boolean v;
    private int w;
    private long x;
    private boolean y;
    private long z;

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", Integer.valueOf(Opcodes.GETFIELD));
        map.put("htc_video_rotA-270", 270);
        g0 = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i8[] g() {
        return new i8[]{new tc()};
    }

    @Override // com.applovin.impl.i8
    public final void a() {
    }

    protected int e(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case Opcodes.IF_ICMPEQ /* 159 */:
            case Opcodes.ARETURN /* 176 */:
            case Opcodes.PUTSTATIC /* 179 */:
            case Opcodes.INVOKEDYNAMIC /* 186 */:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
            case 21358:
            case 2274716:
                return 3;
            case Opcodes.IF_ICMPNE /* 160 */:
            case Opcodes.IF_ACMPNE /* 166 */:
            case Opcodes.FRETURN /* 174 */:
            case Opcodes.INVOKESPECIAL /* 183 */:
            case Opcodes.NEW /* 187 */:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case Opcodes.IF_ICMPLT /* 161 */:
            case Opcodes.IF_ICMPGT /* 163 */:
            case Opcodes.IF_ACMPEQ /* 165 */:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case Opcodes.PUTFIELD /* 181 */:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    protected boolean f(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    public tc() {
        this(0);
    }

    protected void c(int i) throws ah {
        e();
        if (i == 160) {
            if (this.G != 2) {
                return;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.K; i3++) {
                i2 += this.L[i3];
            }
            c cVar = (c) this.c.get(this.M);
            cVar.a();
            for (int i4 = 0; i4 < this.K; i4++) {
                long j = ((cVar.e * i4) / 1000) + this.H;
                int i5 = this.O;
                if (i4 == 0 && !this.Q) {
                    i5 |= 1;
                }
                int i6 = this.L[i4];
                i2 -= i6;
                a(cVar, j, i5, i6, i2);
            }
            this.G = 0;
            return;
        }
        if (i == 174) {
            c cVar2 = (c) a1.b(this.u);
            String str = cVar2.b;
            if (str != null) {
                if (a(str)) {
                    cVar2.a(this.a0, cVar2.c);
                    this.c.put(cVar2.c, cVar2);
                }
                this.u = null;
                return;
            }
            throw ah.a("CodecId is missing in TrackEntry element", null);
        }
        if (i == 19899) {
            int i7 = this.w;
            if (i7 != -1) {
                long j2 = this.x;
                if (j2 != -1) {
                    if (i7 == 475249515) {
                        this.z = j2;
                        return;
                    }
                    return;
                }
            }
            throw ah.a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i == 25152) {
            b(i);
            c cVar3 = this.u;
            if (cVar3.h) {
                if (cVar3.j != null) {
                    cVar3.l = new w6(new w6.b(r2.f853a, "video/webm", this.u.j.b));
                    return;
                }
                throw ah.a("Encrypted Track found but ContentEncKeyID was not found", null);
            }
            return;
        }
        if (i == 28032) {
            b(i);
            c cVar4 = this.u;
            if (cVar4.h && cVar4.i != null) {
                throw ah.a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i == 357149030) {
            if (this.r == -9223372036854775807L) {
                this.r = 1000000L;
            }
            long j3 = this.s;
            if (j3 != -9223372036854775807L) {
                this.t = a(j3);
                return;
            }
            return;
        }
        if (i == 374648427) {
            if (this.c.size() != 0) {
                this.a0.c();
                return;
            }
            throw ah.a("No valid tracks were found", null);
        }
        if (i != 475249515) {
            return;
        }
        if (!this.v) {
            this.a0.a(a(this.C, this.D));
            this.v = true;
        }
        this.C = null;
        this.D = null;
    }

    public tc(int i) {
        this(new y5(), i);
    }

    tc(n7 n7Var, int i) {
        this.q = -1L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f1027a = n7Var;
        n7Var.a(new b());
        this.d = (i & 1) == 0;
        this.b = new aq();
        this.c = new SparseArray();
        this.g = new yg(4);
        this.h = new yg(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new yg(4);
        this.e = new yg(uf.f1064a);
        this.f = new yg(4);
        this.j = new yg();
        this.k = new yg();
        this.l = new yg(8);
        this.m = new yg();
        this.n = new yg();
        this.L = new int[1];
    }

    private void b(int i) throws ah {
        if (this.u != null) {
            return;
        }
        throw ah.a("Element " + i + " must be in a TrackEntry", null);
    }

    private void a(int i) throws ah {
        if (this.C == null || this.D == null) {
            throw ah.a("Element " + i + " must be in a Cues", null);
        }
    }

    private c d(int i) throws ah {
        b(i);
        return this.u;
    }

    private int f() {
        int i = this.S;
        h();
        return i;
    }

    private void h() {
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = (byte) 0;
        this.Z = false;
        this.j.d(0);
    }

    private void e() {
        a1.b(this.a0);
    }

    private final class b implements m7 {
        private b() {
        }

        @Override // com.applovin.impl.m7
        public int b(int i) {
            return tc.this.e(i);
        }

        @Override // com.applovin.impl.m7
        public boolean c(int i) {
            return tc.this.f(i);
        }

        @Override // com.applovin.impl.m7
        public void a(int i, int i2, j8 j8Var) throws ah {
            tc.this.a(i, i2, j8Var);
        }

        @Override // com.applovin.impl.m7
        public void a(int i) throws ah {
            tc.this.c(i);
        }

        @Override // com.applovin.impl.m7
        public void a(int i, double d) {
            tc.this.a(i, d);
        }

        @Override // com.applovin.impl.m7
        public void a(int i, long j) throws ah {
            tc.this.a(i, j);
        }

        @Override // com.applovin.impl.m7
        public void a(int i, long j, long j2) throws ah {
            tc.this.a(i, j, j2);
        }

        @Override // com.applovin.impl.m7
        public void a(int i, String str) throws ah {
            tc.this.a(i, str);
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f1030a = new byte[10];
        private boolean b;
        private int c;
        private long d;
        private int e;
        private int f;
        private int g;

        public void a(c cVar) {
            if (this.c > 0) {
                cVar.X.a(this.d, this.e, this.f, this.g, cVar.j);
                this.c = 0;
            }
        }

        public void a() {
            this.b = false;
            this.c = 0;
        }

        public void a(c cVar, long j, int i, int i2, int i3) {
            if (this.b) {
                int i4 = this.c;
                int i5 = i4 + 1;
                this.c = i5;
                if (i4 == 0) {
                    this.d = j;
                    this.e = i;
                    this.f = 0;
                }
                this.f += i2;
                this.g = i3;
                if (i5 >= 16) {
                    a(cVar);
                }
            }
        }

        public void a(j8 j8Var) {
            if (this.b) {
                return;
            }
            j8Var.c(this.f1030a, 0, 10);
            j8Var.b();
            if (k.b(this.f1030a) == 0) {
                return;
            }
            this.b = true;
        }
    }

    private static final class c {
        public int A;
        public int B;
        public int C;
        public float D;
        public float E;
        public float F;
        public float G;
        public float H;
        public float I;
        public float J;
        public float K;
        public float L;
        public float M;
        public byte[] N;
        public int O;
        public int P;
        public int Q;
        public long R;
        public long S;
        public d T;
        public boolean U;
        public boolean V;
        private String W;
        public ro X;
        public int Y;

        /* renamed from: a, reason: collision with root package name */
        public String f1029a;
        public String b;
        public int c;
        public int d;
        public int e;
        public int f;
        private int g;
        public boolean h;
        public byte[] i;
        public ro.a j;
        public byte[] k;
        public w6 l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public float s;
        public float t;
        public float u;
        public byte[] v;
        public int w;
        public boolean x;
        public int y;
        public int z;

        private c() {
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = -1;
            this.s = 0.0f;
            this.t = 0.0f;
            this.u = 0.0f;
            this.v = null;
            this.w = -1;
            this.x = false;
            this.y = -1;
            this.z = -1;
            this.A = -1;
            this.B = 1000;
            this.C = 200;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = -1.0f;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = -1.0f;
            this.O = 1;
            this.P = -1;
            this.Q = 8000;
            this.R = 0L;
            this.S = 0L;
            this.V = true;
            this.W = "eng";
        }

        public void c() {
            d dVar = this.T;
            if (dVar != null) {
                dVar.a(this);
            }
        }

        public void d() {
            d dVar = this.T;
            if (dVar != null) {
                dVar.a();
            }
        }

        private byte[] b() {
            if (this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.D * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.E * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.L + 0.5f));
            byteBufferOrder.putShort((short) (this.M + 0.5f));
            byteBufferOrder.putShort((short) this.B);
            byteBufferOrder.putShort((short) this.C);
            return bArr;
        }

        private static boolean b(yg ygVar) throws ah {
            try {
                int iR = ygVar.r();
                if (iR == 1) {
                    return true;
                }
                if (iR != 65534) {
                    return false;
                }
                ygVar.f(24);
                if (ygVar.s() == tc.f0.getMostSignificantBits()) {
                    if (ygVar.s() == tc.f0.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ah.a("Error parsing MS/ACM codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            a1.a(this.X);
        }

        private byte[] a(String str) throws ah {
            byte[] bArr = this.k;
            if (bArr != null) {
                return bArr;
            }
            throw ah.a("Missing CodecPrivate for codec " + str, null);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:197:0x0441  */
        /* JADX WARN: Removed duplicated region for block: B:202:0x0456  */
        /* JADX WARN: Removed duplicated region for block: B:203:0x0458  */
        /* JADX WARN: Removed duplicated region for block: B:206:0x0465  */
        /* JADX WARN: Removed duplicated region for block: B:207:0x0477  */
        /* JADX WARN: Removed duplicated region for block: B:254:0x052c  */
        /* JADX WARN: Removed duplicated region for block: B:271:0x057f  */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0018  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(com.applovin.impl.k8 r20, int r21) throws com.applovin.impl.ah {
            /*
                Method dump skipped, instructions count: 1678
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.tc.c.a(com.applovin.impl.k8, int):void");
        }

        private static Pair a(yg ygVar) throws ah {
            try {
                ygVar.g(16);
                long jP = ygVar.p();
                if (jP == 1482049860) {
                    return new Pair(MimeTypes.VIDEO_DIVX, null);
                }
                if (jP == 859189832) {
                    return new Pair("video/3gpp", null);
                }
                if (jP == 826496599) {
                    byte[] bArrC = ygVar.c();
                    for (int iD = ygVar.d() + 20; iD < bArrC.length - 4; iD++) {
                        if (bArrC[iD] == 0 && bArrC[iD + 1] == 0 && bArrC[iD + 2] == 1 && bArrC[iD + 3] == 15) {
                            return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrC, iD, bArrC.length)));
                        }
                    }
                    throw ah.a("Failed to find FourCC VC1 initialization data", null);
                }
                kc.d("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ah.a("Error parsing FourCC private data", null);
            }
        }

        private static List a(byte[] bArr) throws ah {
            int i;
            int i2;
            try {
                if (bArr[0] == 2) {
                    int i3 = 0;
                    int i4 = 1;
                    while (true) {
                        i = bArr[i4] & 255;
                        if (i != 255) {
                            break;
                        }
                        i3 += 255;
                        i4++;
                    }
                    int i5 = i4 + 1;
                    int i6 = i3 + i;
                    int i7 = 0;
                    while (true) {
                        i2 = bArr[i5] & 255;
                        if (i2 != 255) {
                            break;
                        }
                        i7 += 255;
                        i5++;
                    }
                    int i8 = i5 + 1;
                    int i9 = i7 + i2;
                    if (bArr[i8] == 1) {
                        byte[] bArr2 = new byte[i6];
                        System.arraycopy(bArr, i8, bArr2, 0, i6);
                        int i10 = i8 + i6;
                        if (bArr[i10] == 3) {
                            int i11 = i10 + i9;
                            if (bArr[i11] == 5) {
                                byte[] bArr3 = new byte[bArr.length - i11];
                                System.arraycopy(bArr, i11, bArr3, 0, bArr.length - i11);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw ah.a("Error parsing vorbis codec private", null);
                        }
                        throw ah.a("Error parsing vorbis codec private", null);
                    }
                    throw ah.a("Error parsing vorbis codec private", null);
                }
                throw ah.a("Error parsing vorbis codec private", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ah.a("Error parsing vorbis codec private", null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0232, code lost:
    
        throw com.applovin.impl.ah.a("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void a(int r21, int r22, com.applovin.impl.j8 r23) throws com.applovin.impl.ah {
        /*
            Method dump skipped, instructions count: 747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.tc.a(int, int, com.applovin.impl.j8):void");
    }

    private ej a(mc mcVar, mc mcVar2) {
        int i;
        if (this.q != -1 && this.t != -9223372036854775807L && mcVar != null && mcVar.a() != 0 && mcVar2 != null && mcVar2.a() == mcVar.a()) {
            int iA = mcVar.a();
            int[] iArrCopyOf = new int[iA];
            long[] jArrCopyOf = new long[iA];
            long[] jArrCopyOf2 = new long[iA];
            long[] jArrCopyOf3 = new long[iA];
            int i2 = 0;
            for (int i3 = 0; i3 < iA; i3++) {
                jArrCopyOf3[i3] = mcVar.a(i3);
                jArrCopyOf[i3] = this.q + mcVar2.a(i3);
            }
            while (true) {
                i = iA - 1;
                if (i2 >= i) {
                    break;
                }
                int i4 = i2 + 1;
                iArrCopyOf[i2] = (int) (jArrCopyOf[i4] - jArrCopyOf[i2]);
                jArrCopyOf2[i2] = jArrCopyOf3[i4] - jArrCopyOf3[i2];
                i2 = i4;
            }
            iArrCopyOf[i] = (int) ((this.q + this.p) - jArrCopyOf[i]);
            long j = this.t - jArrCopyOf3[i];
            jArrCopyOf2[i] = j;
            if (j <= 0) {
                kc.d("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j);
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i);
            }
            return new e3(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        return new ej.b(this.t);
    }

    private void a(c cVar, long j, int i, int i2, int i3) {
        d dVar = cVar.T;
        if (dVar != null) {
            dVar.a(cVar, j, i, i2, i3);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.b) || "S_TEXT/ASS".equals(cVar.b)) {
                if (this.K > 1) {
                    kc.d("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.I;
                    if (j2 == -9223372036854775807L) {
                        kc.d("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        a(cVar.b, j2, this.k.c());
                        int iD = this.k.d();
                        while (true) {
                            if (iD >= this.k.e()) {
                                break;
                            }
                            if (this.k.c()[iD] == 0) {
                                this.k.e(iD);
                                break;
                            }
                            iD++;
                        }
                        ro roVar = cVar.X;
                        yg ygVar = this.k;
                        roVar.a(ygVar, ygVar.e());
                        i2 += this.k.e();
                    }
                }
            }
            if ((268435456 & i) != 0) {
                if (this.K > 1) {
                    i &= -268435457;
                } else {
                    int iE = this.n.e();
                    cVar.X.a(this.n, iE, 2);
                    i2 += iE;
                }
            }
            cVar.X.a(j, i, i2, i3, cVar.j);
        }
        this.F = true;
    }

    private static int[] a(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    protected void a(int i, double d2) {
        if (i == 181) {
            d(i).Q = (int) d2;
            return;
        }
        if (i != 17545) {
            switch (i) {
                case 21969:
                    d(i).D = (float) d2;
                    break;
                case 21970:
                    d(i).E = (float) d2;
                    break;
                case 21971:
                    d(i).F = (float) d2;
                    break;
                case 21972:
                    d(i).G = (float) d2;
                    break;
                case 21973:
                    d(i).H = (float) d2;
                    break;
                case 21974:
                    d(i).I = (float) d2;
                    break;
                case 21975:
                    d(i).J = (float) d2;
                    break;
                case 21976:
                    d(i).K = (float) d2;
                    break;
                case 21977:
                    d(i).L = (float) d2;
                    break;
                case 21978:
                    d(i).M = (float) d2;
                    break;
                default:
                    switch (i) {
                        case 30323:
                            d(i).s = (float) d2;
                            break;
                        case 30324:
                            d(i).t = (float) d2;
                            break;
                        case 30325:
                            d(i).u = (float) d2;
                            break;
                    }
            }
            return;
        }
        this.s = (long) d2;
    }

    private static byte[] a(long j, String str, long j2) {
        a1.a(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - ((i * 3600) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - ((i2 * 60) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return yp.c(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2))));
    }

    protected void a(c cVar, j8 j8Var, int i) {
        if (cVar.g != 1685485123 && cVar.g != 1685480259) {
            j8Var.a(i);
            return;
        }
        byte[] bArr = new byte[i];
        cVar.N = bArr;
        j8Var.d(bArr, 0, i);
    }

    protected void a(c cVar, int i, j8 j8Var, int i2) {
        if (i == 4 && "V_VP9".equals(cVar.b)) {
            this.n.d(i2);
            j8Var.d(this.n.c(), 0, i2);
        } else {
            j8Var.a(i2);
        }
    }

    @Override // com.applovin.impl.i8
    public final void a(k8 k8Var) {
        this.a0 = k8Var;
    }

    protected void a(int i, long j) throws ah {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw ah.a("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw ah.a("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i) {
            case 131:
                d(i).d = (int) j;
                return;
            case 136:
                d(i).V = j == 1;
                return;
            case 155:
                this.I = a(j);
                return;
            case Opcodes.IF_ICMPEQ /* 159 */:
                d(i).O = (int) j;
                return;
            case Opcodes.ARETURN /* 176 */:
                d(i).m = (int) j;
                return;
            case Opcodes.PUTSTATIC /* 179 */:
                a(i);
                this.C.a(a(j));
                return;
            case Opcodes.INVOKEDYNAMIC /* 186 */:
                d(i).n = (int) j;
                return;
            case 215:
                d(i).c = (int) j;
                return;
            case 231:
                this.B = a(j);
                return;
            case 238:
                this.P = (int) j;
                return;
            case 241:
                if (this.E) {
                    return;
                }
                a(i);
                this.D.a(j);
                this.E = true;
                return;
            case 251:
                this.Q = true;
                return;
            case 16871:
                d(i).g = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw ah.a("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw ah.a("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw ah.a("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw ah.a("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw ah.a("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                this.x = j + this.q;
                return;
            case 21432:
                int i2 = (int) j;
                b(i);
                if (i2 == 0) {
                    this.u.w = 0;
                    return;
                }
                if (i2 == 1) {
                    this.u.w = 2;
                    return;
                } else if (i2 == 3) {
                    this.u.w = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.u.w = 3;
                    return;
                }
            case 21680:
                d(i).o = (int) j;
                return;
            case 21682:
                d(i).q = (int) j;
                return;
            case 21690:
                d(i).p = (int) j;
                return;
            case 21930:
                d(i).U = j == 1;
                return;
            case 21998:
                d(i).f = (int) j;
                return;
            case 22186:
                d(i).R = j;
                return;
            case 22203:
                d(i).S = j;
                return;
            case 25188:
                d(i).P = (int) j;
                return;
            case 30321:
                b(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    this.u.r = 0;
                    return;
                }
                if (i3 == 1) {
                    this.u.r = 1;
                    return;
                } else if (i3 == 2) {
                    this.u.r = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.u.r = 3;
                    return;
                }
            case 2352003:
                d(i).e = (int) j;
                return;
            case 2807729:
                this.r = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        b(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            this.u.A = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.u.A = 1;
                            return;
                        }
                    case 21946:
                        b(i);
                        int iB = p3.b((int) j);
                        if (iB != -1) {
                            this.u.z = iB;
                            return;
                        }
                        return;
                    case 21947:
                        b(i);
                        this.u.x = true;
                        int iA = p3.a((int) j);
                        if (iA != -1) {
                            this.u.y = iA;
                            return;
                        }
                        return;
                    case 21948:
                        d(i).B = (int) j;
                        return;
                    case 21949:
                        d(i).C = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    private static boolean a(String str) {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    private boolean a(qh qhVar, long j) {
        if (this.y) {
            this.A = j;
            qhVar.f835a = this.z;
            this.y = false;
            return true;
        }
        if (this.v) {
            long j2 = this.A;
            if (j2 != -1) {
                qhVar.f835a = j2;
                this.A = -1L;
                return true;
            }
        }
        return false;
    }

    @Override // com.applovin.impl.i8
    public final int a(j8 j8Var, qh qhVar) {
        this.F = false;
        boolean zA = true;
        while (zA && !this.F) {
            zA = this.f1027a.a(j8Var);
            if (zA && a(qhVar, j8Var.f())) {
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i = 0; i < this.c.size(); i++) {
            c cVar = (c) this.c.valueAt(i);
            cVar.a();
            cVar.c();
        }
        return -1;
    }

    private void a(j8 j8Var, int i) {
        if (this.g.e() >= i) {
            return;
        }
        if (this.g.b() < i) {
            yg ygVar = this.g;
            ygVar.a(Math.max(ygVar.b() * 2, i));
        }
        j8Var.d(this.g.c(), this.g.e(), i - this.g.e());
        this.g.e(i);
    }

    private long a(long j) throws ah {
        long j2 = this.r;
        if (j2 != -9223372036854775807L) {
            return yp.c(j, j2, 1000L);
        }
        throw ah.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @Override // com.applovin.impl.i8
    public void a(long j, long j2) {
        this.B = -9223372036854775807L;
        this.G = 0;
        this.f1027a.reset();
        this.b.b();
        h();
        for (int i = 0; i < this.c.size(); i++) {
            ((c) this.c.valueAt(i)).d();
        }
    }

    private static void a(String str, long j, byte[] bArr) {
        byte[] bArrA;
        int i;
        str.hashCode();
        if (str.equals("S_TEXT/ASS")) {
            bArrA = a(j, "%01d:%02d:%02d:%02d", 10000L);
            i = 21;
        } else if (str.equals("S_TEXT/UTF8")) {
            bArrA = a(j, "%02d:%02d:%02d,%03d", 1000L);
            i = 19;
        } else {
            throw new IllegalArgumentException();
        }
        System.arraycopy(bArrA, 0, bArr, i, bArrA.length);
    }

    protected void a(int i, long j, long j2) throws ah {
        e();
        if (i == 160) {
            this.Q = false;
            return;
        }
        if (i == 174) {
            this.u = new c();
            return;
        }
        if (i == 187) {
            this.E = false;
            return;
        }
        if (i == 19899) {
            this.w = -1;
            this.x = -1L;
            return;
        }
        if (i == 20533) {
            d(i).h = true;
            return;
        }
        if (i == 21968) {
            d(i).x = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.q;
            if (j3 != -1 && j3 != j) {
                throw ah.a("Multiple Segment elements not supported", null);
            }
            this.q = j;
            this.p = j2;
            return;
        }
        if (i != 475249515) {
            if (i == 524531317 && !this.v) {
                if (this.d && this.z != -1) {
                    this.y = true;
                    return;
                } else {
                    this.a0.a(new ej.b(this.t));
                    this.v = true;
                    return;
                }
            }
            return;
        }
        this.C = new mc();
        this.D = new mc();
    }

    protected void a(int i, String str) throws ah {
        if (i == 134) {
            d(i).b = str;
            return;
        }
        if (i != 17026) {
            if (i == 21358) {
                d(i).f1029a = str;
                return;
            } else {
                if (i != 2274716) {
                    return;
                }
                d(i).W = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw ah.a("DocType " + str + " not supported", null);
    }

    private int a(j8 j8Var, c cVar, int i) throws ah {
        int i2;
        if ("S_TEXT/UTF8".equals(cVar.b)) {
            a(j8Var, c0, i);
            return f();
        }
        if ("S_TEXT/ASS".equals(cVar.b)) {
            a(j8Var, e0, i);
            return f();
        }
        ro roVar = cVar.X;
        if (!this.U) {
            if (cVar.h) {
                this.O &= -1073741825;
                if (!this.V) {
                    j8Var.d(this.g.c(), 0, 1);
                    this.R++;
                    if ((this.g.c()[0] & 128) != 128) {
                        this.Y = this.g.c()[0];
                        this.V = true;
                    } else {
                        throw ah.a("Extension bit is set in signal byte", null);
                    }
                }
                byte b2 = this.Y;
                if ((b2 & 1) == 1) {
                    boolean z = (b2 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.Z) {
                        j8Var.d(this.l.c(), 0, 8);
                        this.R += 8;
                        this.Z = true;
                        this.g.c()[0] = (byte) ((z ? 128 : 0) | 8);
                        this.g.f(0);
                        roVar.a(this.g, 1, 1);
                        this.S++;
                        this.l.f(0);
                        roVar.a(this.l, 8, 1);
                        this.S += 8;
                    }
                    if (z) {
                        if (!this.W) {
                            j8Var.d(this.g.c(), 0, 1);
                            this.R++;
                            this.g.f(0);
                            this.X = this.g.w();
                            this.W = true;
                        }
                        int i3 = this.X * 4;
                        this.g.d(i3);
                        j8Var.d(this.g.c(), 0, i3);
                        this.R += i3;
                        short s = (short) ((this.X / 2) + 1);
                        int i4 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.o;
                        if (byteBuffer == null || byteBuffer.capacity() < i4) {
                            this.o = ByteBuffer.allocate(i4);
                        }
                        this.o.position(0);
                        this.o.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i2 = this.X;
                            if (i5 >= i2) {
                                break;
                            }
                            int iA = this.g.A();
                            if (i5 % 2 == 0) {
                                this.o.putShort((short) (iA - i6));
                            } else {
                                this.o.putInt(iA - i6);
                            }
                            i5++;
                            i6 = iA;
                        }
                        int i7 = (i - this.R) - i6;
                        if (i2 % 2 == 1) {
                            this.o.putInt(i7);
                        } else {
                            this.o.putShort((short) i7);
                            this.o.putInt(0);
                        }
                        this.m.a(this.o.array(), i4);
                        roVar.a(this.m, i4, 1);
                        this.S += i4;
                    }
                }
            } else {
                byte[] bArr = cVar.i;
                if (bArr != null) {
                    this.j.a(bArr, bArr.length);
                }
            }
            if (cVar.f > 0) {
                this.O |= 268435456;
                this.n.d(0);
                this.g.d(4);
                this.g.c()[0] = (byte) ((i >> 24) & 255);
                this.g.c()[1] = (byte) ((i >> 16) & 255);
                this.g.c()[2] = (byte) ((i >> 8) & 255);
                this.g.c()[3] = (byte) (i & 255);
                roVar.a(this.g, 4, 2);
                this.S += 4;
            }
            this.U = true;
        }
        int iE = i + this.j.e();
        if (!"V_MPEG4/ISO/AVC".equals(cVar.b) && !"V_MPEGH/ISO/HEVC".equals(cVar.b)) {
            if (cVar.T != null) {
                a1.b(this.j.e() == 0);
                cVar.T.a(j8Var);
            }
            while (true) {
                int i8 = this.R;
                if (i8 >= iE) {
                    break;
                }
                int iA2 = a(j8Var, roVar, iE - i8);
                this.R += iA2;
                this.S += iA2;
            }
        } else {
            byte[] bArrC = this.f.c();
            bArrC[0] = 0;
            bArrC[1] = 0;
            bArrC[2] = 0;
            int i9 = cVar.Y;
            int i10 = 4 - i9;
            while (this.R < iE) {
                int i11 = this.T;
                if (i11 == 0) {
                    a(j8Var, bArrC, i10, i9);
                    this.R += i9;
                    this.f.f(0);
                    this.T = this.f.A();
                    this.e.f(0);
                    roVar.a(this.e, 4);
                    this.S += 4;
                } else {
                    int iA3 = a(j8Var, roVar, i11);
                    this.R += iA3;
                    this.S += iA3;
                    this.T -= iA3;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.b)) {
            this.h.f(0);
            roVar.a(this.h, 4);
            this.S += 4;
        }
        return f();
    }

    private void a(j8 j8Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        if (this.k.b() < length) {
            this.k.a(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, this.k.c(), 0, bArr.length);
        }
        j8Var.d(this.k.c(), bArr.length, i);
        this.k.f(0);
        this.k.e(length);
    }

    private int a(j8 j8Var, ro roVar, int i) {
        int iA = this.j.a();
        if (iA > 0) {
            int iMin = Math.min(i, iA);
            roVar.a(this.j, iMin);
            return iMin;
        }
        return roVar.a((e5) j8Var, i, false);
    }

    private void a(j8 j8Var, byte[] bArr, int i, int i2) {
        int iMin = Math.min(i2, this.j.a());
        j8Var.d(bArr, i + iMin, i2 - iMin);
        if (iMin > 0) {
            this.j.a(bArr, i, iMin);
        }
    }

    @Override // com.applovin.impl.i8
    public final boolean a(j8 j8Var) {
        return new jk().b(j8Var);
    }
}
