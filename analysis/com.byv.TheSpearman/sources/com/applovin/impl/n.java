package com.applovin.impl;

import com.applovin.impl.d9;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f703a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f704a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        private b(int i, int i2, int i3, int i4, int i5) {
            this.f704a = i;
            this.c = i2;
            this.b = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    public static void a(int i, yg ygVar) {
        ygVar.d(7);
        byte[] bArrC = ygVar.c();
        bArrC[0] = -84;
        bArrC[1] = 64;
        bArrC[2] = -1;
        bArrC[3] = -1;
        bArrC[4] = (byte) ((i >> 16) & 255);
        bArrC[5] = (byte) ((i >> 8) & 255);
        bArrC[6] = (byte) (i & 255);
    }

    public static d9 a(yg ygVar, String str, String str2, w6 w6Var) {
        ygVar.g(1);
        return new d9.b().c(str).f(MimeTypes.AUDIO_AC4).c(2).n(((ygVar.w() & 32) >> 5) == 1 ? OpusUtil.SAMPLE_RATE : 44100).a(w6Var).e(str2).a();
    }

    public static int a(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return a(new xg(bArr)).e;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.applovin.impl.n.b a(com.applovin.impl.xg r10) {
        /*
            r0 = 16
            int r1 = r10.a(r0)
            int r0 = r10.a(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L18
            r0 = 24
            int r0 = r10.a(r0)
            r3 = 7
            goto L19
        L18:
            r3 = r2
        L19:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L21
            int r0 = r0 + 2
        L21:
            r7 = r0
            r0 = 2
            int r1 = r10.a(r0)
            r3 = 3
            if (r1 != r3) goto L2f
            int r4 = a(r10, r0)
            int r1 = r1 + r4
        L2f:
            r4 = r1
            r1 = 10
            int r1 = r10.a(r1)
            boolean r5 = r10.f()
            if (r5 == 0) goto L45
            int r5 = r10.a(r3)
            if (r5 <= 0) goto L45
            r10.d(r0)
        L45:
            boolean r5 = r10.f()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r8 = 44100(0xac44, float:6.1797E-41)
            if (r5 == 0) goto L53
            r9 = r6
            goto L54
        L53:
            r9 = r8
        L54:
            int r10 = r10.a(r2)
            r5 = 0
            if (r9 != r8) goto L65
            r8 = 13
            if (r10 != r8) goto L65
            int[] r0 = com.applovin.impl.n.f703a
            r10 = r0[r10]
            r8 = r10
            goto L91
        L65:
            if (r9 != r6) goto L90
            int[] r6 = com.applovin.impl.n.f703a
            int r8 = r6.length
            if (r10 >= r8) goto L90
            r5 = r6[r10]
            int r1 = r1 % 5
            r6 = 1
            r8 = 8
            if (r1 == r6) goto L8a
            r6 = 11
            if (r1 == r0) goto L85
            if (r1 == r3) goto L8a
            if (r1 == r2) goto L7e
            goto L90
        L7e:
            if (r10 == r3) goto L8e
            if (r10 == r8) goto L8e
            if (r10 != r6) goto L90
            goto L8e
        L85:
            if (r10 == r8) goto L8e
            if (r10 != r6) goto L90
            goto L8e
        L8a:
            if (r10 == r3) goto L8e
            if (r10 != r8) goto L90
        L8e:
            int r5 = r5 + 1
        L90:
            r8 = r5
        L91:
            com.applovin.impl.n$b r10 = new com.applovin.impl.n$b
            r5 = 2
            r0 = 0
            r3 = r10
            r6 = r9
            r9 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.n.a(com.applovin.impl.xg):com.applovin.impl.n$b");
    }

    public static int a(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i3 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i3 == 65535) {
            i3 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return i3 + i2;
    }

    private static int a(xg xgVar, int i) {
        int i2 = 0;
        while (true) {
            int iA = i2 + xgVar.a(i);
            if (!xgVar.f()) {
                return iA;
            }
            i2 = (iA + 1) << i;
        }
    }
}
