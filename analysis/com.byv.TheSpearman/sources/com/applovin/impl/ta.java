package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ta extends ak {
    public static final a b = new a() { // from class: com.applovin.impl.ta$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.ta.a
        public final boolean a(int i, int i2, int i3, int i4, int i5) {
            return ta.b(i, i2, i3, i4, i5);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final a f1024a;

    public interface a {
        boolean a(int i, int i2, int i3, int i4, int i5);
    }

    private static int a(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static String b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : C.UTF8_NAME : "UTF-16BE" : C.UTF16_NAME;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean b(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    public ta() {
        this(null);
    }

    public ta(a aVar) {
        this.f1024a = aVar;
    }

    private static ao e(yg ygVar, int i) {
        if (i < 1) {
            return null;
        }
        int iW = ygVar.w();
        String strB = b(iW);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ygVar.a(bArr, 0, i2);
        int iB = b(bArr, 0, iW);
        String str = new String(bArr, 0, iB, strB);
        int iA = iB + a(iW);
        return new ao("TXXX", str, a(bArr, iA, b(bArr, iA, iW), strB));
    }

    private static vp f(yg ygVar, int i) {
        if (i < 1) {
            return null;
        }
        int iW = ygVar.w();
        String strB = b(iW);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ygVar.a(bArr, 0, i2);
        int iB = b(bArr, 0, iW);
        String str = new String(bArr, 0, iB, strB);
        int iA = iB + a(iW);
        return new vp("WXXX", str, a(bArr, iA, b(bArr, iA), "ISO-8859-1"));
    }

    private static sh d(yg ygVar, int i) {
        byte[] bArr = new byte[i];
        ygVar.a(bArr, 0, i);
        int iB = b(bArr, 0);
        return new sh(new String(bArr, 0, iB, "ISO-8859-1"), a(bArr, iB + 1, i));
    }

    private static d3 b(yg ygVar, int i, int i2, boolean z, int i3, a aVar) {
        int iD = ygVar.d();
        int iB = b(ygVar.c(), iD);
        String str = new String(ygVar.c(), iD, iB - iD, "ISO-8859-1");
        ygVar.f(iB + 1);
        int iW = ygVar.w();
        boolean z2 = (iW & 2) != 0;
        boolean z3 = (iW & 1) != 0;
        int iW2 = ygVar.w();
        String[] strArr = new String[iW2];
        for (int i4 = 0; i4 < iW2; i4++) {
            int iD2 = ygVar.d();
            int iB2 = b(ygVar.c(), iD2);
            strArr[i4] = new String(ygVar.c(), iD2, iB2 - iD2, "ISO-8859-1");
            ygVar.f(iB2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = iD + i;
        while (ygVar.d() < i5) {
            ua uaVarA = a(i2, ygVar, z, i3, aVar);
            if (uaVarA != null) {
                arrayList.add(uaVarA);
            }
        }
        return new d3(str, z2, z3, strArr, (ua[]) arrayList.toArray(new ua[0]));
    }

    private static ef c(yg ygVar, int i) {
        int iC = ygVar.C();
        int iZ = ygVar.z();
        int iZ2 = ygVar.z();
        int iW = ygVar.w();
        int iW2 = ygVar.w();
        xg xgVar = new xg();
        xgVar.a(ygVar);
        int i2 = ((i - 10) * 8) / (iW + iW2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int iA = xgVar.a(iW);
            int iA2 = xgVar.a(iW2);
            iArr[i3] = iA;
            iArr2[i3] = iA2;
        }
        return new ef(iC, iZ, iZ2, iArr, iArr2);
    }

    private static int g(yg ygVar, int i) {
        byte[] bArrC = ygVar.c();
        int iD = ygVar.d();
        int i2 = iD;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iD + i) {
                return i;
            }
            if ((bArrC[i2] & 255) == 255 && bArrC[i3] == 0) {
                System.arraycopy(bArrC, i2 + 2, bArrC, i3, (i - (i2 - iD)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    private static byte[] a(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return yp.f;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f1025a;
        private final boolean b;
        private final int c;

        public b(int i, boolean z, int i2) {
            this.f1025a = i;
            this.b = z;
            this.c = i2;
        }
    }

    @Override // com.applovin.impl.ak
    protected we a(ze zeVar, ByteBuffer byteBuffer) {
        return a(byteBuffer.array(), byteBuffer.limit());
    }

    private static y9 b(yg ygVar, int i) {
        int iW = ygVar.w();
        String strB = b(iW);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ygVar.a(bArr, 0, i2);
        int iB = b(bArr, 0);
        String str = new String(bArr, 0, iB, "ISO-8859-1");
        int i3 = iB + 1;
        int iB2 = b(bArr, i3, iW);
        String strA = a(bArr, i3, iB2, strB);
        int iA = iB2 + a(iW);
        int iB3 = b(bArr, iA, iW);
        return new y9(str, strA, a(bArr, iA, iB3, strB), a(bArr, iB3 + a(iW), i2));
    }

    private static vp c(yg ygVar, int i, String str) {
        byte[] bArr = new byte[i];
        ygVar.a(bArr, 0, i);
        return new vp(str, null, new String(bArr, 0, b(bArr, 0), "ISO-8859-1"));
    }

    private static u0 a(yg ygVar, int i, int i2) {
        int iB;
        String str;
        int iW = ygVar.w();
        String strB = b(iW);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        ygVar.a(bArr, 0, i3);
        if (i2 == 2) {
            str = "image/" + Ascii.toLowerCase(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = MimeTypes.IMAGE_JPEG;
            }
            iB = 2;
        } else {
            iB = b(bArr, 0);
            String lowerCase = Ascii.toLowerCase(new String(bArr, 0, iB, "ISO-8859-1"));
            if (lowerCase.indexOf(47) == -1) {
                str = "image/" + lowerCase;
            } else {
                str = lowerCase;
            }
        }
        int i4 = bArr[iB + 1] & 255;
        int i5 = iB + 2;
        int iB2 = b(bArr, i5, iW);
        return new u0(str, new String(bArr, i5, iB2 - i5, strB), i4, a(bArr, iB2 + a(iW), i3));
    }

    private static ao b(yg ygVar, int i, String str) {
        if (i < 1) {
            return null;
        }
        int iW = ygVar.w();
        String strB = b(iW);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ygVar.a(bArr, 0, i2);
        return new ao(str, null, new String(bArr, 0, b(bArr, 0, iW), strB));
    }

    private static g2 a(yg ygVar, int i, String str) {
        byte[] bArr = new byte[i];
        ygVar.a(bArr, 0, i);
        return new g2(str, bArr);
    }

    private static c3 a(yg ygVar, int i, int i2, boolean z, int i3, a aVar) {
        int iD = ygVar.d();
        int iB = b(ygVar.c(), iD);
        String str = new String(ygVar.c(), iD, iB - iD, "ISO-8859-1");
        ygVar.f(iB + 1);
        int iJ = ygVar.j();
        int iJ2 = ygVar.j();
        long jY = ygVar.y();
        long j = jY == 4294967295L ? -1L : jY;
        long jY2 = ygVar.y();
        long j2 = jY2 == 4294967295L ? -1L : jY2;
        ArrayList arrayList = new ArrayList();
        int i4 = iD + i;
        while (ygVar.d() < i4) {
            ua uaVarA = a(i2, ygVar, z, i3, aVar);
            if (uaVarA != null) {
                arrayList.add(uaVarA);
            }
        }
        return new c3(str, iJ, iJ2, j, j2, (ua[]) arrayList.toArray(new ua[0]));
    }

    private static int b(byte[] bArr, int i, int i2) {
        int iB = b(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iB;
        }
        while (iB < bArr.length - 1) {
            if ((iB - i) % 2 == 0 && bArr[iB + 1] == 0) {
                return iB;
            }
            iB = b(bArr, iB + 1);
        }
        return bArr.length;
    }

    private static s3 a(yg ygVar, int i) {
        if (i < 4) {
            return null;
        }
        int iW = ygVar.w();
        String strB = b(iW);
        byte[] bArr = new byte[3];
        ygVar.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        ygVar.a(bArr2, 0, i2);
        int iB = b(bArr2, 0, iW);
        String str2 = new String(bArr2, 0, iB, strB);
        int iA = iB + a(iW);
        return new s3(str, str2, a(bArr2, iA, b(bArr2, iA, iW), strB));
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e5 A[Catch: all -> 0x0129, UnsupportedEncodingException -> 0x0213, TryCatch #0 {UnsupportedEncodingException -> 0x0213, blocks: (B:90:0x0117, B:158:0x01ef, B:92:0x011f, B:101:0x0138, B:103:0x0140, B:111:0x015a, B:120:0x0172, B:131:0x018d, B:138:0x019f, B:144:0x01ae, B:149:0x01c6, B:155:0x01e0, B:156:0x01e5), top: B:168:0x010d, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.applovin.impl.ua a(int r19, com.applovin.impl.yg r20, boolean r21, int r22, com.applovin.impl.ta.a r23) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ta.a(int, com.applovin.impl.yg, boolean, int, com.applovin.impl.ta$a):com.applovin.impl.ua");
    }

    private static int b(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    private static b a(yg ygVar) {
        if (ygVar.a() < 10) {
            kc.d("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int iZ = ygVar.z();
        boolean z = false;
        if (iZ != 4801587) {
            kc.d("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(iZ)));
            return null;
        }
        int iW = ygVar.w();
        ygVar.g(1);
        int iW2 = ygVar.w();
        int iV = ygVar.v();
        if (iW == 2) {
            if ((iW2 & 64) != 0) {
                kc.d("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iW == 3) {
            if ((iW2 & 64) != 0) {
                int iJ = ygVar.j();
                ygVar.g(iJ);
                iV -= iJ + 4;
            }
        } else {
            if (iW != 4) {
                kc.d("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + iW);
                return null;
            }
            if ((iW2 & 64) != 0) {
                int iV2 = ygVar.v();
                ygVar.g(iV2 - 4);
                iV -= iV2;
            }
            if ((iW2 & 16) != 0) {
                iV -= 10;
            }
        }
        if (iW < 4 && (iW2 & 128) != 0) {
            z = true;
        }
        return new b(iW, z, iV);
    }

    private static String a(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    private static String a(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0087 A[PHI: r3
      0x0087: PHI (r3v16 int) = (r3v5 int), (r3v19 int) binds: [B:39:0x0084, B:31:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(com.applovin.impl.yg r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.d()
        L8:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Laf
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r18.j()     // Catch: java.lang.Throwable -> Laf
            long r8 = r18.y()     // Catch: java.lang.Throwable -> Laf
            int r10 = r18.C()     // Catch: java.lang.Throwable -> Laf
            goto L2c
        L22:
            int r7 = r18.z()     // Catch: java.lang.Throwable -> Laf
            int r8 = r18.z()     // Catch: java.lang.Throwable -> Laf
            long r8 = (long) r8
            r10 = r6
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.f(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
            r1.f(r2)
            return r6
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6b:
            if (r0 != r7) goto L79
            r3 = r10 & 64
            if (r3 == 0) goto L73
            r3 = r4
            goto L74
        L73:
            r3 = r6
        L74:
            r7 = r10 & 1
            if (r7 == 0) goto L87
            goto L8b
        L79:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L81
            r3 = r4
            goto L82
        L81:
            r3 = r6
        L82:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L87
            goto L8b
        L87:
            r4 = r6
            goto L8b
        L89:
            r3 = r6
            r4 = r3
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L98
            r1.f(r2)
            return r6
        L98:
            int r3 = r18.a()     // Catch: java.lang.Throwable -> Laf
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La5
            r1.f(r2)
            return r6
        La5:
            int r3 = (int) r8
            r1.g(r3)     // Catch: java.lang.Throwable -> Laf
            goto L8
        Lab:
            r1.f(r2)
            return r4
        Laf:
            r0 = move-exception
            r1.f(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ta.a(com.applovin.impl.yg, int, int, boolean):boolean");
    }

    public we a(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        yg ygVar = new yg(bArr, i);
        b bVarA = a(ygVar);
        if (bVarA == null) {
            return null;
        }
        int iD = ygVar.d();
        int i2 = bVarA.f1025a == 2 ? 6 : 10;
        int iG = bVarA.c;
        if (bVarA.b) {
            iG = g(ygVar, bVarA.c);
        }
        ygVar.e(iD + iG);
        boolean z = false;
        if (!a(ygVar, bVarA.f1025a, i2, false)) {
            if (bVarA.f1025a != 4 || !a(ygVar, 4, i2, true)) {
                kc.d("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + bVarA.f1025a);
                return null;
            }
            z = true;
        }
        while (ygVar.a() >= i2) {
            ua uaVarA = a(bVarA.f1025a, ygVar, z, i2, this.f1024a);
            if (uaVarA != null) {
                arrayList.add(uaVarA);
            }
        }
        return new we(arrayList);
    }
}
